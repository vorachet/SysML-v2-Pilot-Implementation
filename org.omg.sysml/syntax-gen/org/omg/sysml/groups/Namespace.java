/**
 */
package org.omg.sysml.groups;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.Namespace#getMemberNaming <em>Member Naming</em>}</li>
 *   <li>{@link org.omg.sysml.groups.Namespace#getNamespaceImport <em>Namespace Import</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.groups.GroupsPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends ElementGroup {
	/**
	 * Returns the value of the '<em><b>Member Naming</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.groups.MemberNaming}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.MemberNaming#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Naming</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Naming</em>' containment reference list.
	 * @see org.omg.sysml.groups.GroupsPackage#getNamespace_MemberNaming()
	 * @see org.omg.sysml.groups.MemberNaming#getNamespace
	 * @model opposite="namespace" containment="true"
	 * @generated
	 */
	EList<MemberNaming> getMemberNaming();

	/**
	 * Returns the value of the '<em><b>Namespace Import</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.groups.NamespaceImport}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.NamespaceImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Import</em>' reference list.
	 * @see org.omg.sysml.groups.GroupsPackage#getNamespace_NamespaceImport()
	 * @see org.omg.sysml.groups.NamespaceImport#getImportingNamespace
	 * @model opposite="importingNamespace" ordered="false"
	 * @generated
	 */
	EList<NamespaceImport> getNamespaceImport();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" elementRequired="true" elementOrdered="false"
	 * @generated
	 */
	String nameOf(Element element);

} // Namespace
