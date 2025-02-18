package '3a-Function-based Behavior-1' {
	import Definitions::*;
	import Usages::*;

	package Definitions {
		/**
		 * The 'TorqueValue' type is aliased as 'Torque'.
		 */
		alias Torque for ISQ::TorqueValue;
		
		attribute def FuelCmd;
		
		/*
		 * There is no special construct for modeling "signals". Data to be
		 * transmitted asynchronously can simply be modeled using attribute defs.
		 */
		
		attribute def EngineStart;
		attribute def EngineOff;
		
		/*
		 * Black box definitions for actions include their inputs and outputs.
		 */
		
		action def 'Generate Torque'(in fuelCmd: FuelCmd, out engineTorque: Torque);
		action def 'Amplify Torque'(in engineTorque: Torque, out transmissionTorque: Torque);
		action def 'Transfer Torque'(in transmissionTorque: Torque, out driveshaftTorque: Torque);
		action def 'Distribute Torque'(in driveShaftTorque: Torque, out wheelTorque1: Torque, out wheelTorque2: Torque);
		
		action def 'Provide Power'(in fuelCmd: FuelCmd, out wheelTorque1: Torque, out wheelTorque2: Torque);
	
	}
	
	package Usages {
	
		action 'provide power': 'Provide Power'(
			in fuelCmd: FuelCmd,
			out wheelTorque1: Torque, 
			out wheelTorque2: Torque
		) {
			// ITEM FLOW PART
			
			/**
			 * This is a binding connector, just as was used to
			 * model delegation between ports.
			 */
			bind 'generate torque'.fuelCmd = fuelCmd;
			
			/**
			 * The parameters on an action act as its "pins". They automatically 
			 * redefine the corresponding parameters from the action def that types
			 * the action.
			 */
			action 'generate torque': 'Generate Torque'(
				in fuelCmd: Torque, 
				out engineTorque: Torque
			);
			
			/**
			 * A flow is a connection between two actions that streams items from
			 * an output parameter of one action to an input parameter of the other.
			 * Note that streaming is a property of the connection, not the
			 * actions or their parameters.
			 */
			flow 'generate torque'.engineTorque 
			    to 'amplify torque'.engineTorque;
			
			action 'amplify torque': 'Amplify Torque'(
				in engineTorque: Torque, 
				out transmissionTorque: Torque
			);
			
			flow 'amplify torque'.transmissionTorque 
			    to 'transfer torque'.transmissionTorque;
			
			action 'transfer torque': 'Transfer Torque'(
				in transmissionTorque: Torque, 
				out driveshaftTorque: Torque
			);
			
			flow 'transfer torque'.driveshaftTorque 
			    to 'distribute torque'.driveshaftTorque;
			
			action 'distribute torque': 'Distribute Torque'(
				in driveshaftTorque: Torque, 
				out wheelTorque1: Torque, 
				out wheelTorque2: Torque
			);
			
			bind wheelTorque1 = 'distribute torque'.wheelTorque1;
			bind wheelTorque2 = 'distribute torque'.wheelTorque2;
			
			// CONTROL FLOW PART

			/**
			 * A first is an assertion that one thing must occur
			 * before another, acting like a "control flow". 'start' is
			 * the start snapshot of the action, which acts like an
			 * "initial node".
			 */
			first start then continue;
			
			/**
			 * A merge node is necessary to prevent a loop of successions
			 * from being unsatisfiable.
			 */
			merge continue;	
			first continue then engineStarted;
			
			/**
			 * An accept action accepts an incoming transfer of some item
			 * from outside an action, in this case the "signal" 'EngineStart'.
			 * Note that 'engineStarted' is the name of the action, while
			 * 'engineStart' is the name of the received signal attribute.
			 */
			action engineStarted accept engineStart: EngineStart;			
			first engineStarted then engineStopped;
					
			action engineStopped accept engineOff: EngineOff;	
			first engineStopped then continue;
			
			/**
			 * These successions act to "enable" the torque-related actions.
			 * Each action on the right can only be performed following the
			 * completion of a performance of 'engineStarted'.
			 */
			first engineStarted then 'generate torque';
			first engineStarted then 'amplify torque';
			first engineStarted then 'transfer torque';
			first engineStarted then 'distribute torque';
			
			/**
			 * These successions act to "disable" the torque-related actions.
			 * The performance of the actions on the left cannot continue
			 * once there is a performance of 'engineStopped'.
			 */
			first 'generate torque' then engineStopped;		
			first 'amplify torque' then engineStopped;		
			first 'transfer torque' then engineStopped;		
			first 'distribute torque' then engineStopped;		
		}
	
	}
}