package 'Vehicle Analysis Demo' {
	package VehicleQuantities {
	    import ScalarValues::*;
	    import Quantities::*;
	    import MeasurementReferences::*;
	    import ISQ::*;
	    import USCustomaryUnits::*;
	    
	    attribute def DistancePerVolumeUnit :> DerivedUnit {
	    	private attribute distancePF: QuantityPowerFactor[1] { :>> quantity = isq.L; :>> exponent = 1; }
	        private attribute volumePF: QuantityPowerFactor[1] { :>> quantity = isq.L; :>> exponent = -3; }
	        attribute :>> quantityDimension { :>> quantityPowerFactors = (distancePF, volumePF); }
	    }

	    attribute def DistancePerVolumeValue :> ScalarQuantityValue {
	        :>> num : Real;
	        :>> mRef : DistancePerVolumeUnit;
	    }
	    
	    attribute gallon : VolumeUnit = 231.0 * 'in' ** 3;
	    attribute mpg : DistancePerVolumeUnit = 'mi' / gallon;
	}
	
	package VehicleModel {
	    import VehicleQuantities::*;
	    
	    item def Fuel;
	        
	    port def FuelPort {
	        out item fuel: Fuel;
	    }
	    
	    part def FuelTank {
	        attribute volumeMax : VolumeValue;
	        attribute fuelVolume : VolumeValue;
	        attribute fuelLevel : Real = fuelVolume / volumeMax;
	        
	        port fuelInPort : ~FuelPort;
	        port fuelOutPort : FuelPort;
	    }
	    
	    part def Wheel {
	        attribute diameter : LengthValue;
	    }
	
	    part def Vehicle {
	        attribute mass : MassValue;
	        attribute cargoMass : MassValue;
	        
	        attribute wheelDiameter : LengthValue;
	        attribute driveTrainEfficiency : Real;
	        
	        attribute fuelEconomy_city : DistancePerVolumeValue;
	        attribute fuelEconomy_highway : DistancePerVolumeValue;
	
	        port fuelInPort : ~FuelPort;
	    }
	    
	    part vehicle_c1 : Vehicle {
	        port :>> fuelInPort {
	            in item :>> fuel;
	        }
	
	        part fuelTank : FuelTank {
	            port :>> fuelInPort {
	                in item :>> fuel;
	            }
	        }
	
	        bind fuelInPort.fuel = fuelTank.fuelInPort.fuel;
	
	        part wheel : Wheel[4] {
	            :>> diameter = wheelDiameter;
	        }
	    }
	}
	
	package FuelEconomyRequirementsModel {
	    import VehicleQuantities::*;
	
	    requirement def FuelEconomyRequirement {
	        attribute actualFuelEconomy : DistancePerVolumeValue;
	        attribute requiredFuelEconomy : DistancePerVolumeValue;
	
	        require constraint { actualFuelEconomy >= requiredFuelEconomy }
	    }
	
	    requirement cityFuelEconomyRequirement : FuelEconomyRequirement {
	        :>> requiredFuelEconomy = 25 [mpg];
	    }
	
	    requirement highwayFuelEconomyRequirement : FuelEconomyRequirement {
	        :>> requiredFuelEconomy = 30 [mpg];
	    }
	}
	
	package DynamicsModel {
	    import VehicleQuantities::*;
	    
	    calc def Acceleration(p : PowerValue, m : MassValue, v : SpeedValue) : AccelerationValue =
	        p / (m * v);
	    
	    calc def Velocity(v0 : SpeedValue, a : AccelerationValue, dt : TimeValue) : SpeedValue =
	        v0 + a * dt;
	    
	    calc def Position(x0 : LengthValue, v : SpeedValue, dt : TimeValue) : LengthValue =
	        x0 + v * dt;
	    
	    constraint def StraightLineDynamicsEquations(
	        p : PowerValue,
	        m : MassValue,
	        dt : TimeValue,
	        x_i : LengthValue,
	        v_i : SpeedValue,
	        x_f : LengthValue,
	        v_f : SpeedValue,
	        a : AccelerationValue
	    ) {
	        attribute v_avg : SpeedValue = (v_i + v_f)/2;
	
	        a == Acceleration(p, m, v_avg) &
	        v_f == Velocity(v_i, a, dt) &
	        x_f == Position(x_i, v_avg, dt)
	    }
	    
	    action def StraightLineDynamics (
	        in power : PowerValue,
	        in mass : MassValue,
	        in delta_t : TimeValue,
	        in x_in : LengthValue,
	        in v_in : SpeedValue,
	        out x_out : LengthValue,
	        out v_out : SpeedValue,
	        out a_out : AccelerationValue
	    ) {
	        assert constraint dynamics : StraightLineDynamicsEquations (
	            p = power,
	            m = mass,
	            dt = delta_t,
	            x_i = x_in,
	            v_i = v_in,
	            x_f = x_out,
	            v_f = v_out,
	            a = a_out
	        );
	    }
	}
	
	package FuelEconomyAnalysisModel {
	    import VehicleModel::*;
	    import FuelEconomyRequirementsModel::*;
	    import DynamicsModel::*;
	    import SequenceFunctions::size;
	    import SampledFunctions::SampledFunction;
	    import SampledFunctions::SamplePair;
	    import ControlFunctions::forAll;
	
		attribute def ScenarioState {
			position : LengthValue;
			velocity : SpeedValue;
		}
		
		attribute def NominalScenario :> SampledFunction {
			attribute def TimeStateRecord :> SamplePair {
				t : TimeValue :>> domainValue;
				s : ScenarioState :>> rangeValue;
			}
			:>> samples : TimeStateRecord;
			n : Natural = size(samples);
		}
		
		analysis def FuelEconomyAnalysis () calculatedFuelEconomy : DistancePerVolumeValue {
			subject vehicle: Vehicle;
			in attribute scenario : NominalScenario;
			in requirement fuelEconomyRequirement : FuelEconomyRequirement;
			
			objective fuelEconomyAnalysisObjective {
				doc 
				/*
				 * The objective of this analysis is to determine whether the
				 * current vehicle design configuration can satisfy the fuel
				 * economy requirement.
				 */
				
				assume constraint {
					vehicle.wheelDiameter == 33 ['in'] &
					vehicle.driveTrainEfficiency == 0.4
				}
				
				require fuelEconomyRequirement { 
					:>> actualFuelEconomy = calculatedFuelEconomy;
				}
			}
			
		    
			//import scenario::*;
		
			action dynamicsAnalysis(
				in sc: NominalScenario,
				out power : PowerValue[*],
				out acceleration : AccelerationValue[*]	) {
				/*
				 * Solve for the required engine power as a function of time
				 * to support the scenarios.
				 */
				assert constraint straightLineDynamics {
					(1..sc.n-1)->forAll {in i: Integer;
						private thisSample : NominalScenario::TimeStateRecord = 
							sc.samples[i];
						private nextSample : NominalScenario::TimeStateRecord = 
							sc.samples[i+1];
						StraightLineDynamicsEquations (
							p = power[i],
							m = vehicle.mass,
							dt = nextSample.t - thisSample.t,
							x_i = thisSample.s.position,
							v_i = thisSample.s.velocity,
							x_f = nextSample.s.position,
							v_f = nextSample.s.velocity,
							a = acceleration[i]                    
						)
					}
				}
			}

		    action fuelConsumptionAnalysis(
		        in power : PowerValue[*] = dynamicsAnalysis.power,
		        in acceleration : AccelerationValue[*] = dynamicsAnalysis.acceleration,
		        out fuelEconomy : DistancePerVolumeValue = calculatedFuelEconomy ) {
		        /*
		         * Solve the engine equations to determine how much fuel is
		         * consumed. The engine RPM is a function of the speed of the
		         * vehicle and the gear state.
		         */
	        }
	    }
	}

	
	part vehicleFuelEconomyAnalysisContext {
	    import FuelEconomyAnalysisModel::*;
	
	    requirement vehicleFuelEconomyRequirementsGroup {
	        import FuelEconomyRequirementsModel::*;
	        
	        subject vehicle : Vehicle;
	
	        requirement vehicleFuelEconomyRequirement_city :> cityFuelEconomyRequirement {
	            doc /* The vehicle shall provide a fuel economy that is greater than or equal to
	             * 25 miles per gallon for the nominal city driving scenarios.
	             */
	
	            :>> actualFuelEconomy = vehicle.fuelEconomy_city;
	
	            assume constraint { vehicle.cargoMass == 1000 [lb] }
	        }
	
	        requirement vehicleFuelEconomyRequirement_highway :> highwayFuelEconomyRequirement {
	            doc /* The vehicle shall provide a fuel economy that is greater than or equal to
	             * 30 miles per gallon for the nominal highway driving scenarios.
	             */
	
	            :>> actualFuelEconomy = vehicle.fuelEconomy_highway;
	
	            assume constraint { vehicle.cargoMass == 1000 [lb] }
	        }
	
	    }
	    
	    attribute cityScenario : NominalScenario;
	    attribute highwayScenario : NominalScenario;
	
	    analysis cityFuelEconomyAnalysis : FuelEconomyAnalysis () {
	        subject vehicle = vehicle_c1;
	        attribute :>> scenario = cityScenario;
	        requirement :>> fuelEconomyRequirement = cityFuelEconomyRequirement;
	    }
	
	    analysis highwayFuelEconomyAnalysis : FuelEconomyAnalysis () {
	        subject vehicle = vehicle_c1;
	        attribute :>> scenario = highwayScenario;
	        requirement :>> fuelEconomyRequirement = highwayFuelEconomyRequirement;
	    }
	
	    part vehicle_c1_analysized :> vehicle_c1 {
	        attribute :>> fuelEconomy_city = cityFuelEconomyAnalysis.calculatedFuelEconomy;
	        attribute :>> fuelEconomy_highway = highwayFuelEconomyAnalysis.calculatedFuelEconomy;
	    }
	
	    satisfy vehicleFuelEconomyRequirementsGroup by vehicle_c1_analysized;
	}
}