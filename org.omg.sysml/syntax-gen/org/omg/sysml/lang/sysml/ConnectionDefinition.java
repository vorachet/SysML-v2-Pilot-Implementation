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
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConnectionDefinition is a PartDefinition that is also an AssociationStructure, with two or more end features. The <code>associationEnds</code> of a ConnectionDefinition must be Usages.</p>
 * 
 * <p>A ConnectionDefinition must subclass, directly or indirectly, the base ConnectionDefinition Connection from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectionDefinition#getConnectionEnd <em>Connection End</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectionDefinition()
 * @model
 * @generated
 */
public interface ConnectionDefinition extends PartDefinition, AssociationStructure {

	/**
	 * Returns the value of the '<em><b>Connection End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Association#getAssociationEnd() <em>Association End</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages that define the things related by the ConnectionDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectionDefinition_ConnectionEnd()
	 * @model lower="2" transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionDefinitionWithEnd'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Usage> getConnectionEnd();
} // AssociationBlock
