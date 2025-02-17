/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.PortioningFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portioning Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortioningFeatureImpl#getPortionKind <em>Portion Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortioningFeatureImpl extends FeatureImpl implements PortioningFeature {
	/**
	 * The default value of the '{@link #getPortionKind() <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortionKind()
	 * @generated
	 * @ordered
	 */
	protected static final PortionKind PORTION_KIND_EDEFAULT = PortionKind.TIMESLICE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortioningFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PORTIONING_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PortionKind getPortionKind() {
		Type owningType = getOwningType();
		return owningType instanceof OccurrenceUsage?
				((OccurrenceUsage)owningType).getPortionKind():
			    null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPortionKind(PortionKind newPortionKind) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PORTIONING_FEATURE__PORTION_KIND:
				return getPortionKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.PORTIONING_FEATURE__PORTION_KIND:
				setPortionKind((PortionKind)newValue);
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
			case SysMLPackage.PORTIONING_FEATURE__PORTION_KIND:
				setPortionKind(PORTION_KIND_EDEFAULT);
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
			case SysMLPackage.PORTIONING_FEATURE__PORTION_KIND:
				return getPortionKind() != PORTION_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PortioningFeatureImpl
