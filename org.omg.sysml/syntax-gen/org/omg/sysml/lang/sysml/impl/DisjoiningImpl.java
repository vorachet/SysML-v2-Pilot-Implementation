/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoining</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getTypeDisjoined <em>Type Disjoined</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getDisjoiningType <em>Disjoining Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisjoiningImpl extends RelationshipImpl implements Disjoining {
	/**
	 * The cached value of the '{@link #getTypeDisjoined() <em>Type Disjoined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDisjoined()
	 * @generated
	 * @ordered
	 */
	protected Type typeDisjoined;

	/**
	 * The cached value of the '{@link #getDisjoiningType() <em>Disjoining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjoiningType()
	 * @generated
	 * @ordered
	 */
	protected Type disjoiningType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjoiningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DISJOINING;
	}
	
	@Override
	public Type getDisjoiningType() {
		return disjoiningType == null? basicGetDisjoiningType(): getDisjoiningTypeGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDisjoiningTypeGen() {
		if (disjoiningType != null && disjoiningType.eIsProxy()) {
			InternalEObject oldDisjoiningType = (InternalEObject)disjoiningType;
			disjoiningType = (Type)eResolveProxy(oldDisjoiningType);
			if (disjoiningType != oldDisjoiningType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.DISJOINING__DISJOINING_TYPE, oldDisjoiningType, disjoiningType));
			}
		}
		return disjoiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetDisjoiningType() {
		// Xtext workaround
		if (disjoiningType == null) {
			// Handle a disjoiningType that is a Feature chain.
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				disjoiningType = (Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1);
			}
		}
		
		return disjoiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisjoiningType(Type newDisjoiningType) {
		Type oldDisjoiningType = disjoiningType;
		disjoiningType = newDisjoiningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__DISJOINING_TYPE, oldDisjoiningType, disjoiningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisjoiningType() {
		return disjoiningType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		Type owningType = basicGetOwningType();
		return owningType != null && owningType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)owningType) : owningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetOwningType() {
		Element element = this.getOwningRelatedElement();
		return element instanceof Type? (Type)element: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningType(Type newOwningType) {
		if (getTypeDisjoined() != newOwningType) {
			setTypeDisjoined(newOwningType);
		}
		setOwningRelatedElement(newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}
	
	@Override
	public Type getTypeDisjoined() {
		return typeDisjoined == null? basicGetTypeDisjoined(): getTypeDisjoinedGen();
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTypeDisjoinedGen() {
		if (typeDisjoined != null && typeDisjoined.eIsProxy()) {
			InternalEObject oldTypeDisjoined = (InternalEObject)typeDisjoined;
			typeDisjoined = (Type)eResolveProxy(oldTypeDisjoined);
			if (typeDisjoined != oldTypeDisjoined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.DISJOINING__TYPE_DISJOINED, oldTypeDisjoined, typeDisjoined));
			}
		}
		return typeDisjoined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetTypeDisjoined() {
		// Xtext workaround
		if (typeDisjoined == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Type) {
				// Handle a Disjoining owned by the typeDisjoined.
				typeDisjoined = (Type)owner;
			} else {
				// Handle a typeDisjoined that is a Feature chain.
				EList<Element> ownedRelatedElements = getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					typeDisjoined = (Feature)ownedRelatedElements.get(0);
				}
			}
		}
		
		return typeDisjoined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeDisjoined(Type newTypeDisjoined) {
		Type oldTypeDisjoined = typeDisjoined;
		typeDisjoined = newTypeDisjoined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__TYPE_DISJOINED, oldTypeDisjoined, typeDisjoined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDisjoined() {
		return typeDisjoined != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type disjoiningType = getDisjoiningType();
		if (disjoiningType != null) {
			target.add(disjoiningType);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Type typeDisjoined = getTypeDisjoined();
		if (typeDisjoined != null) {
			source.add(typeDisjoined);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				if (resolve) return getTypeDisjoined();
				return basicGetTypeDisjoined();
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				if (resolve) return getDisjoiningType();
				return basicGetDisjoiningType();
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
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
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				setTypeDisjoined((Type)newValue);
				return;
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				setDisjoiningType((Type)newValue);
				return;
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				setOwningType((Type)newValue);
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
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				setTypeDisjoined((Type)null);
				return;
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				setDisjoiningType((Type)null);
				return;
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				setOwningType((Type)null);
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
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				return isSetTypeDisjoined();
			case SysMLPackage.DISJOINING__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.DISJOINING__SOURCE:
				return isSetSource();
			case SysMLPackage.DISJOINING__TARGET:
				return isSetTarget();
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				return isSetDisjoiningType();
			case SysMLPackage.DISJOINING__OWNING_TYPE:
				return basicGetOwningType() != null;
		}
		return super.eIsSet(featureID);
	}

} //DisjoiningImpl
