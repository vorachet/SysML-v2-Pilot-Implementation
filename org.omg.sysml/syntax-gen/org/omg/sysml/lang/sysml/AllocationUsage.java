/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AllocationUsage is a usage of an AllocationDefinition asserting the allocation of the <code>source</code> feature to the <code>target</code> feature.</p>
 * 
 * <p>An AllocationUsage must subset, directly or indirectly, the base AllocatopnUsage <code>allocations</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AllocationUsage#getAllocationDefinition <em>Allocation Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAllocationUsage()
 * @model
 * @generated
 */
public interface AllocationUsage extends ConnectionUsage {
	/**
	 * Returns the value of the '<em><b>Allocation Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AllocationDefinition}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ConnectionUsage#getConnectionDefinition() <em>Connection Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AllocationDefinitions that are the types of this AllocationUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAllocationUsage_AllocationDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAllocation'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<AllocationDefinition> getAllocationDefinition();

} // AllocationUsage
