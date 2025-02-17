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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getOwningAnnotatedElement <em>Owning Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getAnnotatingElement <em>Annotating Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends RelationshipImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getAnnotatedElement() <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected Element annotatedElement;

	/**
	 * The cached value of the '{@link #getAnnotatingElement() <em>Annotating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatingElement()
	 * @generated
	 * @ordered
	 */
	protected AnnotatingElement annotatingElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Element getAnnotatedElement() {
		return annotatedElement == null? basicGetAnnotatedElement(): getAnnotatedElementGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getAnnotatedElementGen() {
		if (annotatedElement != null && annotatedElement.eIsProxy()) {
			InternalEObject oldAnnotatedElement = (InternalEObject)annotatedElement;
			annotatedElement = (Element)eResolveProxy(oldAnnotatedElement);
			if (annotatedElement != oldAnnotatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetAnnotatedElement() {
		if (annotatedElement == null) {
			Element owningRelatedElement = getOwningRelatedElement();
			if (!(owningRelatedElement instanceof AnnotatingElement)) {
				annotatedElement = owningRelatedElement;
			} else {
				// For a prefix annotation, use the lexically next relationship as the annotated
				Element owner = owningRelatedElement.getOwner();
				if (owner != null) {
					EList<Relationship> ownedRelationships = owner.getOwnedRelationship();
					int i = ownedRelationships.indexOf(owningRelatedElement.getOwningRelationship()) + 1;
					if (i < ownedRelationships.size()) {
						annotatedElement = ownedRelationships.get(i);
						if (annotatedElement instanceof OwningMembership) {
							Element ownedMember = ((OwningMembership)annotatedElement).getOwnedMemberElement();
							if (ownedMember != null) {
								annotatedElement = ownedMember;
							}
						}
					}
				}
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAnnotatedElement(Element newAnnotatedElement) {
		Element oldAnnotatedElement = annotatedElement;
		annotatedElement = newAnnotatedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			Element owningAnnotatedElement = getOwningAnnotatedElement();
//			if (owningAnnotatedElement != null && owningAnnotatedElement != newAnnotatedElement) {
//				setOwningAnnotatedElement(null);
//			}
//		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatedElement() {
		return annotatedElement != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.ANNOTATION__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	@Override
	public AnnotatingElement getAnnotatingElement() {
		return annotatingElement == null? basicGetAnnotatingElement(): getAnnotatingElementGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatingElement getAnnotatingElementGen() {
		if (annotatingElement != null && annotatingElement.eIsProxy()) {
			InternalEObject oldAnnotatingElement = (InternalEObject)annotatingElement;
			annotatingElement = (AnnotatingElement)eResolveProxy(oldAnnotatingElement);
			if (annotatingElement != oldAnnotatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT, oldAnnotatingElement, annotatingElement));
			}
		}
		return annotatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AnnotatingElement basicGetAnnotatingElement() {
		if (annotatingElement == null) {
			Element owner = getOwningRelatedElement();
			annotatingElement = (AnnotatingElement)
					(owner instanceof AnnotatingElement? owner: 
						getOwnedRelatedElement().stream().
							filter(AnnotatingElement.class::isInstance).
							findFirst().orElse(null));
		}
		return annotatingElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotatingElement(AnnotatingElement newAnnotatingElement) {
		if (newAnnotatingElement != annotatingElement) {
			NotificationChain msgs = null;
			if (annotatingElement != null)
				msgs = ((InternalEObject)annotatingElement).eInverseRemove(this, SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION, AnnotatingElement.class, msgs);
			if (newAnnotatingElement != null)
				msgs = ((InternalEObject)newAnnotatingElement).eInverseAdd(this, SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION, AnnotatingElement.class, msgs);
			msgs = basicSetAnnotatingElement(newAnnotatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT, newAnnotatingElement, newAnnotatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotatingElement(AnnotatingElement newAnnotatingElement, NotificationChain msgs) {
		AnnotatingElement oldAnnotatingElement = annotatingElement;
		annotatingElement = newAnnotatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT, oldAnnotatingElement, newAnnotatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatingElement() {
		return annotatingElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningAnnotatedElement() {
		Element owningAnnotatedElement = basicGetOwningAnnotatedElement();
		return owningAnnotatedElement != null && owningAnnotatedElement.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owningAnnotatedElement) : owningAnnotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwningAnnotatedElement() {
		Element owningRelatedElement = super.getOwningRelatedElement();
		return owningRelatedElement instanceof AnnotatingElement? null: owningRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningAnnotatedElement(Element newOwningAnnotatedElement) {
		super.basicSetOwningRelatedElement(newOwningAnnotatedElement, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Element annotatedElement = getAnnotatedElement();
		if (annotatedElement != null) {
			target.add(annotatedElement);
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
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		AnnotatingElement annotatingElement = getAnnotatingElement();
		if (annotatingElement != null) {
			source.add(annotatingElement);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ANNOTATION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				if (annotatingElement != null)
					msgs = ((InternalEObject)annotatingElement).eInverseRemove(this, SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION, AnnotatingElement.class, msgs);
				return basicSetAnnotatingElement((AnnotatingElement)otherEnd, msgs);
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
			case SysMLPackage.ANNOTATION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				return basicSetAnnotatingElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				if (resolve) return getOwningAnnotatedElement();
				return basicGetOwningAnnotatedElement();
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				if (resolve) return getAnnotatingElement();
				return basicGetAnnotatingElement();
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
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				setAnnotatedElement((Element)newValue);
				return;
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				setOwningAnnotatedElement((Element)newValue);
				return;
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				setAnnotatingElement((AnnotatingElement)newValue);
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
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				setAnnotatedElement((Element)null);
				return;
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				setOwningAnnotatedElement((Element)null);
				return;
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				setAnnotatingElement((AnnotatingElement)null);
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
			case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
				return isSetAnnotatedElement();
			case SysMLPackage.ANNOTATION__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.ANNOTATION__TARGET:
				return isSetTarget();
			case SysMLPackage.ANNOTATION__SOURCE:
				return isSetSource();
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
				return basicGetOwningAnnotatedElement() != null;
			case SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT:
				return isSetAnnotatingElement();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationImpl
