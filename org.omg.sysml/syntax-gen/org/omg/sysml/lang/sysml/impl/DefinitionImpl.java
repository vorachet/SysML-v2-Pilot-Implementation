/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AllocationUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.InterfaceUsage;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConnectorAsUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedCalculation <em>Owned Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getVariantMembership <em>Variant Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAnalysisCase <em>Owned Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedCase <em>Owned Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedReference <em>Owned Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedConnection <em>Owned Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedItem <em>Owned Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedInterface <em>Owned Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedView <em>Owned View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedViewpoint <em>Owned Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedVerificationCase <em>Owned Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedEnumeration <em>Owned Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAllocation <em>Owned Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedOccurrence <em>Owned Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedFlow <em>Owned Flow</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedUsage <em>Owned Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends ClassifierImpl implements Definition {
	/**
	 * The default value of the '{@link #isVariation() <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVariation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VARIATION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isVariation() <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVariation()
	 * @generated
	 * @ordered
	 */
	protected boolean isVariation = IS_VARIATION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getUsage() {
		return new DerivedEObjectEList<>(Usage.class, this, SysMLPackage.DEFINITION__OWNED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PortUsage> getOwnedPort() {
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.DEFINITION__OWNED_PORT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getDirectedUsage() {
		EList<Usage> flows = new NonNotifyingEObjectEList<>(Usage.class, this, SysMLPackage.DEFINITION__DIRECTED_USAGE);
		getDirectedFeature().stream().
			map(Usage.class::cast).
			forEachOrdered(flows::add);
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getOwnedAction() {
		return new DerivedEObjectEList<ActionUsage>(ActionUsage.class, this, SysMLPackage.DEFINITION__OWNED_ACTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConnectorAsUsage> getOwnedConnection() {
		return new DerivedEObjectEList<>(ConnectorAsUsage.class, this, SysMLPackage.DEFINITION__OWNED_CONNECTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ItemUsage> getOwnedItem() {
		return new DerivedEObjectEList<>(ItemUsage.class, this, SysMLPackage.DEFINITION__OWNED_ITEM, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PartUsage> getOwnedPart() {
		return new DerivedEObjectEList<>(PartUsage.class, this, SysMLPackage.DEFINITION__OWNED_PART, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<InterfaceUsage> getOwnedInterface() {
		return new DerivedEObjectEList<>(InterfaceUsage.class, this, SysMLPackage.DEFINITION__OWNED_INTERFACE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AttributeUsage> getOwnedAttribute() {
		return new DerivedEObjectEList<>(AttributeUsage.class, this, SysMLPackage.DEFINITION__OWNED_ATTRIBUTE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ViewUsage> getOwnedView() {
		return new DerivedEObjectEList<>(ViewUsage.class, this, SysMLPackage.DEFINITION__OWNED_VIEW, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ViewpointUsage> getOwnedViewpoint() {
		return new DerivedEObjectEList<>(ViewpointUsage.class, this, SysMLPackage.DEFINITION__OWNED_VIEWPOINT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<RenderingUsage> getOwnedRendering() {
		return new DerivedEObjectEList<>(RenderingUsage.class, this, SysMLPackage.DEFINITION__OWNED_RENDERING, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<VerificationCaseUsage> getOwnedVerificationCase() {
		return new DerivedEObjectEList<>(VerificationCaseUsage.class, this, SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<EnumerationUsage> getOwnedEnumeration() {
		return new DerivedEObjectEList<>(EnumerationUsage.class, this, SysMLPackage.DEFINITION__OWNED_ENUMERATION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AllocationUsage> getOwnedAllocation() {
		return new DerivedEObjectEList<>(AllocationUsage.class, this, SysMLPackage.DEFINITION__OWNED_ALLOCATION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConcernUsage> getOwnedConcern() {
		return new DerivedEObjectEList<>(ConcernUsage.class, this, SysMLPackage.DEFINITION__OWNED_CONCERN, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<OccurrenceUsage> getOwnedOccurrence() {
		return new DerivedEObjectEList<>(OccurrenceUsage.class, this, SysMLPackage.DEFINITION__OWNED_OCCURRENCE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<UseCaseUsage> getOwnedUseCase() {
		return new DerivedEObjectEList<>(UseCaseUsage.class, this, SysMLPackage.DEFINITION__OWNED_USE_CASE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FlowConnectionUsage> getOwnedFlow() {
		return new DerivedEObjectEList<>(FlowConnectionUsage.class, this, SysMLPackage.DEFINITION__OWNED_FLOW, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<StateUsage> getOwnedState() {
		return new DerivedEObjectEList<StateUsage>(StateUsage.class, this, SysMLPackage.DEFINITION__OWNED_STATE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConstraintUsage> getOwnedConstraint() {
		return new DerivedEObjectEList<ConstraintUsage>(ConstraintUsage.class, this, SysMLPackage.DEFINITION__OWNED_CONSTRAINT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TransitionUsage> getOwnedTransition() {
		return new DerivedEObjectEList<TransitionUsage>(TransitionUsage.class, this, SysMLPackage.DEFINITION__OWNED_TRANSITION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<RequirementUsage> getOwnedRequirement() {
		return new DerivedEObjectEList<RequirementUsage>(RequirementUsage.class, this, SysMLPackage.DEFINITION__OWNED_REQUIREMENT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<CalculationUsage> getOwnedCalculation() {
		return new DerivedEObjectEList<CalculationUsage>(CalculationUsage.class, this, SysMLPackage.DEFINITION__OWNED_CALCULATION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVariation() {
		return isVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariation(boolean newIsVariation) {
		boolean oldIsVariation = isVariation;
		isVariation = newIsVariation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DEFINITION__IS_VARIATION, oldIsVariation, isVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AnalysisCaseUsage> getOwnedAnalysisCase() {
		return new DerivedEObjectEList<>(AnalysisCaseUsage.class, this, SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<CaseUsage> getOwnedCase() {
		return new DerivedEObjectEList<>(CaseUsage.class, this, SysMLPackage.DEFINITION__OWNED_CASE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ReferenceUsage> getOwnedReference() {
		return new DerivedEObjectEList<>(ReferenceUsage.class, this, SysMLPackage.DEFINITION__OWNED_REFERENCE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getOwnedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.DEFINITION__OWNED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getVariant() {
		EList<Usage> variants = new NonNotifyingEObjectEList<>(Usage.class, this, SysMLPackage.DEFINITION__VARIANT);
		getVariantMembership().stream().
			map(VariantMembership::getOwnedVariantUsage).
			forEachOrdered(variants::add);
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<VariantMembership> getVariantMembership() {
		return new DerivedEObjectEList<VariantMembership>(VariantMembership.class, this, SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP, new int[] {SysMLPackage.ELEMENT__OWNED_RELATIONSHIP});
	}

	// Additional Overrides
	
	@Override
	public boolean isAbstract() {
		return isVariation() || super.isAbstract();
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__OWNED_PORT:
				return getOwnedPort();
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				return getDirectedUsage();
			case SysMLPackage.DEFINITION__USAGE:
				return getUsage();
			case SysMLPackage.DEFINITION__OWNED_STATE:
				return getOwnedState();
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				return getOwnedConstraint();
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				return getOwnedTransition();
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				return getOwnedRequirement();
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				return getOwnedCalculation();
			case SysMLPackage.DEFINITION__IS_VARIATION:
				return isVariation();
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				return getVariantMembership();
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				return getOwnedAnalysisCase();
			case SysMLPackage.DEFINITION__VARIANT:
				return getVariant();
			case SysMLPackage.DEFINITION__OWNED_CASE:
				return getOwnedCase();
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				return getOwnedReference();
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				return getOwnedAction();
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				return getOwnedConnection();
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				return getOwnedItem();
			case SysMLPackage.DEFINITION__OWNED_PART:
				return getOwnedPart();
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				return getOwnedInterface();
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				return getOwnedView();
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				return getOwnedViewpoint();
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				return getOwnedRendering();
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				return getOwnedVerificationCase();
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				return getOwnedEnumeration();
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				return getOwnedAllocation();
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				return getOwnedConcern();
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				return getOwnedOccurrence();
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				return getOwnedUseCase();
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				return getOwnedFlow();
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				return getOwnedUsage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				getDirectedUsage().clear();
				getDirectedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.DEFINITION__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends StateUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				getOwnedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends TransitionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				getOwnedRequirement().clear();
				getOwnedRequirement().addAll((Collection<? extends RequirementUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				getOwnedCalculation().clear();
				getOwnedCalculation().addAll((Collection<? extends CalculationUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__IS_VARIATION:
				setIsVariation((Boolean)newValue);
				return;
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
				getVariantMembership().addAll((Collection<? extends VariantMembership>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				getOwnedAnalysisCase().clear();
				getOwnedAnalysisCase().addAll((Collection<? extends AnalysisCaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CASE:
				getOwnedCase().clear();
				getOwnedCase().addAll((Collection<? extends CaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				getOwnedReference().clear();
				getOwnedReference().addAll((Collection<? extends ReferenceUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				getOwnedAction().clear();
				getOwnedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				getOwnedConnection().clear();
				getOwnedConnection().addAll((Collection<? extends ConnectorAsUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				getOwnedItem().clear();
				getOwnedItem().addAll((Collection<? extends ItemUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_PART:
				getOwnedPart().clear();
				getOwnedPart().addAll((Collection<? extends PartUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				getOwnedInterface().clear();
				getOwnedInterface().addAll((Collection<? extends InterfaceUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends AttributeUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				getOwnedView().clear();
				getOwnedView().addAll((Collection<? extends ViewUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				getOwnedViewpoint().clear();
				getOwnedViewpoint().addAll((Collection<? extends ViewpointUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				getOwnedRendering().clear();
				getOwnedRendering().addAll((Collection<? extends RenderingUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				getOwnedVerificationCase().clear();
				getOwnedVerificationCase().addAll((Collection<? extends VerificationCaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				getOwnedEnumeration().clear();
				getOwnedEnumeration().addAll((Collection<? extends EnumerationUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				getOwnedAllocation().clear();
				getOwnedAllocation().addAll((Collection<? extends AllocationUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				getOwnedConcern().clear();
				getOwnedConcern().addAll((Collection<? extends ConcernUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				getOwnedOccurrence().clear();
				getOwnedOccurrence().addAll((Collection<? extends OccurrenceUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				getOwnedFlow().clear();
				getOwnedFlow().addAll((Collection<? extends FlowConnectionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				getOwnedUsage().clear();
				getOwnedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				getDirectedUsage().clear();
				return;
			case SysMLPackage.DEFINITION__USAGE:
				getUsage().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_STATE:
				getOwnedState().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				getOwnedTransition().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				getOwnedRequirement().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				getOwnedCalculation().clear();
				return;
			case SysMLPackage.DEFINITION__IS_VARIATION:
				setIsVariation(IS_VARIATION_EDEFAULT);
				return;
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				getOwnedAnalysisCase().clear();
				return;
			case SysMLPackage.DEFINITION__VARIANT:
				getVariant().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CASE:
				getOwnedCase().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				getOwnedReference().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				getOwnedAction().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				getOwnedConnection().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				getOwnedItem().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_PART:
				getOwnedPart().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				getOwnedInterface().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				getOwnedView().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				getOwnedViewpoint().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				getOwnedRendering().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				getOwnedVerificationCase().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				getOwnedEnumeration().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				getOwnedAllocation().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				getOwnedConcern().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				getOwnedOccurrence().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				getOwnedFlow().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				getOwnedUsage().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__OWNED_PORT:
				return !getOwnedPort().isEmpty();
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				return !getDirectedUsage().isEmpty();
			case SysMLPackage.DEFINITION__USAGE:
				return !getUsage().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_STATE:
				return !getOwnedState().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				return !getOwnedConstraint().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				return !getOwnedTransition().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				return !getOwnedRequirement().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				return !getOwnedCalculation().isEmpty();
			case SysMLPackage.DEFINITION__IS_VARIATION:
				return isVariation != IS_VARIATION_EDEFAULT;
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				return !getVariantMembership().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				return !getOwnedAnalysisCase().isEmpty();
			case SysMLPackage.DEFINITION__VARIANT:
				return !getVariant().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_CASE:
				return !getOwnedCase().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				return !getOwnedReference().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				return !getOwnedAction().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				return !getOwnedConnection().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				return !getOwnedItem().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_PART:
				return !getOwnedPart().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				return !getOwnedInterface().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				return !getOwnedAttribute().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				return !getOwnedView().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				return !getOwnedViewpoint().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				return !getOwnedRendering().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				return !getOwnedVerificationCase().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				return !getOwnedEnumeration().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				return !getOwnedAllocation().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				return !getOwnedConcern().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				return !getOwnedOccurrence().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				return !getOwnedUseCase().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				return !getOwnedFlow().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				return !getOwnedUsage().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isVariation: ");
		result.append(isVariation);
		result.append(')');
		return result.toString();
	}

} //DefinitionImpl
