/*
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.xtext.ui.outline

import org.omg.kerml.xtext.ui.outline.KerMLOutlineTreeProvider
import org.omg.sysml.lang.sysml.StateSubactionMembership
import org.omg.sysml.lang.sysml.RequirementConstraintMembership
import org.omg.sysml.lang.sysml.RequirementDefinition
import org.omg.sysml.lang.sysml.Type
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.RequirementUsage
import org.omg.sysml.util.TypeUtil
import org.omg.sysml.lang.sysml.StateUsage
import org.omg.sysml.lang.sysml.StateDefinition
import org.omg.sysml.lang.sysml.TriggerInvocationExpression
import org.omg.sysml.lang.sysml.Expression

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class SysMLOutlineTreeProvider extends KerMLOutlineTreeProvider {
	
	def String _text(StateSubactionMembership membership) {
		 membership.prefixText + " " + membership.kind + " " + membership.nameText
	}
	
	def String _text(RequirementConstraintMembership membership) {
		membership.prefixText + " " + membership.kind + " " + membership.nameText
	}
	
	override String typePrefixText(Type type) {
		var text = super.typePrefixText(type)
		if (TypeUtil.isIndividual(type)) {
			text += ' individual'
		}
		text
	}
	
	def String _text(StateUsage state) {
		var text = state.featurePrefixText
		if (state.isParallel) {
			text += ' parallel'
		}
		text + state.featureIdText
	}
	
	def String _text(StateDefinition state) {
		var text = state.typePrefixText
		if (state.isParallel) {
			text += ' parallel'
		}
		text + state.idText
	}
	
	def String _text(TriggerInvocationExpression expression) {
		(expression as Expression)._text + " " + expression.kind
	}
	
	def boolean _isLeaf(RequirementDefinition requirementDef) {
		_isLeaf(requirementDef as Type) && requirementDef.text === null
	}
	
	def void _createChildren(IOutlineNode parentNode, RequirementDefinition requirementDef) {
		if (requirementDef.text !== null) {
			createEStructuralFeatureNode(parentNode, requirementDef, 
				SysMLPackage.eINSTANCE.requirementDefinition_Text, 
				_image(requirementDef.text), 'text ' + requirementDef.text , true
			)
		}
		super._createChildren(parentNode, requirementDef)
	}
	
	def boolean _isLeaf(RequirementUsage requirement) {
		_isLeaf(requirement as Type) && requirement.text === null
	}
	
	def void _createChildren(IOutlineNode parentNode, RequirementUsage requirement) {
		if (requirement.text !== null) {
			createEStructuralFeatureNode(parentNode, requirement, 
				SysMLPackage.eINSTANCE.requirementDefinition_Text, 
				_image(requirement.text), 'text ' + requirement.text , true
			)
		}
		super._createChildren(parentNode, requirement)
	}
	
}
