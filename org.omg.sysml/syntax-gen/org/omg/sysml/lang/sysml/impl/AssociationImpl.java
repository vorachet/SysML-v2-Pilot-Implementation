/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Association</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ClassifierImpl implements Association {

	/**
	 * The cached value of the '{@link #getOwnedRelatedElement() <em>Owned Related Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedRelatedElement;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		@SuppressWarnings("unchecked")
		EList<Element> targetType = (EList<Element>)((EList<?>)getTargetType());
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Type sourceType = getSourceType();
		if (sourceType != null) {
			source.add(sourceType);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(), source.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getEndFeature() {
		return getAssociationEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public EList<Type> getRelatedType() {
		EList<Type> relatedTypes = new BasicInternalEList<Type>(Type.class);
		getAssociationEnd().stream().flatMap(end -> end.getType().stream()).forEachOrdered(relatedTypes::add);
		return relatedTypes;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedType() <em>Related Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedType()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_TYPE_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION__SOURCE_TYPE, SysMLPackage.ASSOCIATION__TARGET_TYPE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedType() {
		return !getRelatedType().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public Connector getOwningConnector() {
		Connector owningConnector = basicGetOwningConnector();
		return owningConnector != null && owningConnector.eIsProxy()? 
				(Connector) eResolveProxy((InternalEObject) owningConnector): 
				owningConnector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public Connector basicGetOwningConnector() {
		Element owner = this.getOwner();
		return owner instanceof Connector ? (Connector) owner : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public void setOwningConnector(Connector newOwningConnector) {
		this.setOwner(newOwningConnector);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public EList<Feature> getAssociationEnd() {
		return super.getEndFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociationEnd() {
		return !getAssociationEnd().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSourceType() {
		Type sourceType = basicGetSourceType();
		return sourceType != null && sourceType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)sourceType) : sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetSourceType() {
		return TypeUtil.getSourceTypeOf(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSourceType(Type newSourceType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceType() {
		return basicGetSourceType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Type> getTargetType() {
		EList<Type> targetType = new NonNotifyingEObjectEList<>(Type.class, this, SysMLPackage.ASSOCIATION__TARGET_TYPE);
		TypeUtil.addTargetTypes(this, targetType);
		return targetType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetType() {
		return !getTargetType().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		@SuppressWarnings("unchecked")
		EList<Element> relatedType = (EList<Element>)((EList<?>)getRelatedType());
		return relatedType;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT, SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT, SysMLPackage.ASSOCIATION__TARGET, SysMLPackage.ASSOCIATION__SOURCE};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.ASSOCIATION__TARGET:
				return getTarget();
			case SysMLPackage.ASSOCIATION__SOURCE:
				return getSource();
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return getRelatedType();
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				return getTargetType();
			case SysMLPackage.ASSOCIATION__ASSOCIATION_END:
				return getAssociationEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				setSourceType((Type)newValue);
				return;
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				getTargetType().clear();
				getTargetType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__ASSOCIATION_END:
				getAssociationEnd().clear();
				getAssociationEnd().addAll((Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				setSourceType((Type)null);
				return;
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				getTargetType().clear();
				return;
			case SysMLPackage.ASSOCIATION__ASSOCIATION_END:
				getAssociationEnd().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.ASSOCIATION__TARGET:
				return isSetTarget();
			case SysMLPackage.ASSOCIATION__SOURCE:
				return isSetSource();
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return isSetRelatedType();
			case SysMLPackage.ASSOCIATION__END_FEATURE:
				return isSetEndFeature();
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				return isSetSourceType();
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				return isSetTargetType();
			case SysMLPackage.ASSOCIATION__ASSOCIATION_END:
				return isSetAssociationEnd();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.ASSOCIATION__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.ASSOCIATION__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.ASSOCIATION__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.ASSOCIATION__SOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // AssociationImpl
