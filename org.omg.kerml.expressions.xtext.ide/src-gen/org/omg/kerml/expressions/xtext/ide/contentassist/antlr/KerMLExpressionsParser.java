/*
 * generated by Xtext 2.22.0
 */
package org.omg.kerml.expressions.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.omg.kerml.expressions.xtext.ide.contentassist.antlr.internal.InternalKerMLExpressionsParser;
import org.omg.kerml.expressions.xtext.services.KerMLExpressionsGrammarAccess;

public class KerMLExpressionsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(KerMLExpressionsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, KerMLExpressionsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
			builder.put(grammarAccess.getClassificationExpressionAccess().getAlternatives(), "rule__ClassificationExpression__Alternatives");
			builder.put(grammarAccess.getClassificationOperatorAccess().getAlternatives(), "rule__ClassificationOperator__Alternatives");
			builder.put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
			builder.put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
			builder.put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
			builder.put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
			builder.put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
			builder.put(grammarAccess.getExtentExpressionAccess().getAlternatives(), "rule__ExtentExpression__Alternatives");
			builder.put(grammarAccess.getSequenceExpressionAccess().getAlternatives_0(), "rule__SequenceExpression__Alternatives_0");
			builder.put(grammarAccess.getSequenceExpressionAccess().getAlternatives_1(), "rule__SequenceExpression__Alternatives_1");
			builder.put(grammarAccess.getBodyExpressionAccess().getAlternatives(), "rule__BodyExpression__Alternatives");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getAlternatives(), "rule__SequenceConstructionExpression__Alternatives");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getAlternatives_1_2(), "rule__SequenceConstructionExpression__Alternatives_1_2");
			builder.put(grammarAccess.getBaseExpressionAccess().getAlternatives(), "rule__BaseExpression__Alternatives");
			builder.put(grammarAccess.getArgumentListAccess().getAlternatives(), "rule__ArgumentList__Alternatives");
			builder.put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
			builder.put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
			builder.put(grammarAccess.getRealValueAccess().getAlternatives(), "rule__RealValue__Alternatives");
			builder.put(grammarAccess.getRealValueAccess().getAlternatives_0_2(), "rule__RealValue__Alternatives_0_2");
			builder.put(grammarAccess.getLiteralUnlimitedNaturalAccess().getAlternatives(), "rule__LiteralUnlimitedNatural__Alternatives");
			builder.put(grammarAccess.getNameAccess().getAlternatives(), "rule__Name__Alternatives");
			builder.put(grammarAccess.getQualifiedNameAccess().getAlternatives(), "rule__QualifiedName__Alternatives");
			builder.put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
			builder.put(grammarAccess.getConditionalExpressionAccess().getGroup_1(), "rule__ConditionalExpression__Group_1__0");
			builder.put(grammarAccess.getNullCoalescingExpressionAccess().getGroup(), "rule__NullCoalescingExpression__Group__0");
			builder.put(grammarAccess.getNullCoalescingExpressionAccess().getGroup_1(), "rule__NullCoalescingExpression__Group_1__0");
			builder.put(grammarAccess.getConditionalOrExpressionAccess().getGroup(), "rule__ConditionalOrExpression__Group__0");
			builder.put(grammarAccess.getConditionalOrExpressionAccess().getGroup_1(), "rule__ConditionalOrExpression__Group_1__0");
			builder.put(grammarAccess.getConditionalAndExpressionAccess().getGroup(), "rule__ConditionalAndExpression__Group__0");
			builder.put(grammarAccess.getConditionalAndExpressionAccess().getGroup_1(), "rule__ConditionalAndExpression__Group_1__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
			builder.put(grammarAccess.getXorExpressionAccess().getGroup(), "rule__XorExpression__Group__0");
			builder.put(grammarAccess.getXorExpressionAccess().getGroup_1(), "rule__XorExpression__Group_1__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
			builder.put(grammarAccess.getClassificationExpressionAccess().getGroup_0(), "rule__ClassificationExpression__Group_0__0");
			builder.put(grammarAccess.getClassificationExpressionAccess().getGroup_0_1(), "rule__ClassificationExpression__Group_0_1__0");
			builder.put(grammarAccess.getClassificationExpressionAccess().getGroup_1(), "rule__ClassificationExpression__Group_1__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
			builder.put(grammarAccess.getExponentiationExpressionAccess().getGroup(), "rule__ExponentiationExpression__Group__0");
			builder.put(grammarAccess.getExponentiationExpressionAccess().getGroup_1(), "rule__ExponentiationExpression__Group_1__0");
			builder.put(grammarAccess.getUnitsExpressionAccess().getGroup(), "rule__UnitsExpression__Group__0");
			builder.put(grammarAccess.getUnitsExpressionAccess().getGroup_1(), "rule__UnitsExpression__Group_1__0");
			builder.put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
			builder.put(grammarAccess.getExtentExpressionAccess().getGroup_0(), "rule__ExtentExpression__Group_0__0");
			builder.put(grammarAccess.getExtentExpression_DeprecatedAccess().getGroup(), "rule__ExtentExpression_Deprecated__Group__0");
			builder.put(grammarAccess.getSequenceExpressionAccess().getGroup(), "rule__SequenceExpression__Group__0");
			builder.put(grammarAccess.getSequenceExpressionAccess().getGroup_1_0(), "rule__SequenceExpression__Group_1_0__0");
			builder.put(grammarAccess.getSequenceExpressionAccess().getGroup_1_1(), "rule__SequenceExpression__Group_1_1__0");
			builder.put(grammarAccess.getBodyExpressionAccess().getGroup_0(), "rule__BodyExpression__Group_0__0");
			builder.put(grammarAccess.getBodyExpressionAccess().getGroup_0_0(), "rule__BodyExpression__Group_0_0__0");
			builder.put(grammarAccess.getBodyParameterMemberAccess().getGroup(), "rule__BodyParameterMember__Group__0");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_0(), "rule__SequenceConstructionExpression__Group_0__0");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1(), "rule__SequenceConstructionExpression__Group_1__0");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_0(), "rule__SequenceConstructionExpression__Group_1_2_0__0");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_1(), "rule__SequenceConstructionExpression__Group_1_2_1__0");
			builder.put(grammarAccess.getSequenceElementListAccess().getGroup(), "rule__SequenceElementList__Group__0");
			builder.put(grammarAccess.getSequenceElementListAccess().getGroup_1(), "rule__SequenceElementList__Group_1__0");
			builder.put(grammarAccess.getBaseExpressionAccess().getGroup_5(), "rule__BaseExpression__Group_5__0");
			builder.put(grammarAccess.getInvocationExpressionAccess().getGroup(), "rule__InvocationExpression__Group__0");
			builder.put(grammarAccess.getPositionalArgumentListAccess().getGroup(), "rule__PositionalArgumentList__Group__0");
			builder.put(grammarAccess.getPositionalArgumentListAccess().getGroup_1(), "rule__PositionalArgumentList__Group_1__0");
			builder.put(grammarAccess.getNamedArgumentListAccess().getGroup(), "rule__NamedArgumentList__Group__0");
			builder.put(grammarAccess.getNamedArgumentListAccess().getGroup_1(), "rule__NamedArgumentList__Group_1__0");
			builder.put(grammarAccess.getNamedExpressionMemberAccess().getGroup(), "rule__NamedExpressionMember__Group__0");
			builder.put(grammarAccess.getNullExpressionAccess().getGroup(), "rule__NullExpression__Group__0");
			builder.put(grammarAccess.getRealValueAccess().getGroup_0(), "rule__RealValue__Group_0__0");
			builder.put(grammarAccess.getLiteralUnboundedAccess().getGroup(), "rule__LiteralUnbounded__Group__0");
			builder.put(grammarAccess.getColonQualifiedNameAccess().getGroup(), "rule__ColonQualifiedName__Group__0");
			builder.put(grammarAccess.getColonQualifiedNameAccess().getGroup_1(), "rule__ColonQualifiedName__Group_1__0");
			builder.put(grammarAccess.getDotQualifiedNameAccess().getGroup(), "rule__DotQualifiedName__Group__0");
			builder.put(grammarAccess.getDotQualifiedNameAccess().getGroup_1(), "rule__DotQualifiedName__Group_1__0");
			builder.put(grammarAccess.getOwnedExpressionMemberAccess().getOwnedMemberFeature_compAssignment(), "rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment");
			builder.put(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_1_1(), "rule__ConditionalExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getConditionalExpressionAccess().getOperand_compAssignment_1_2(), "rule__ConditionalExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getConditionalExpressionAccess().getOperand_compAssignment_1_4(), "rule__ConditionalExpression__Operand_compAssignment_1_4");
			builder.put(grammarAccess.getNullCoalescingExpressionAccess().getOperatorAssignment_1_1(), "rule__NullCoalescingExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getNullCoalescingExpressionAccess().getOperand_compAssignment_1_2(), "rule__NullCoalescingExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getConditionalOrExpressionAccess().getOperatorAssignment_1_1(), "rule__ConditionalOrExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getConditionalOrExpressionAccess().getOperand_compAssignment_1_2(), "rule__ConditionalOrExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getConditionalAndExpressionAccess().getOperatorAssignment_1_1(), "rule__ConditionalAndExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getConditionalAndExpressionAccess().getOperand_compAssignment_1_2(), "rule__ConditionalAndExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1(), "rule__OrExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getOrExpressionAccess().getOperand_compAssignment_1_2(), "rule__OrExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1(), "rule__XorExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXorExpressionAccess().getOperand_compAssignment_1_2(), "rule__XorExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1(), "rule__AndExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAndExpressionAccess().getOperand_compAssignment_1_2(), "rule__AndExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1(), "rule__EqualityExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getEqualityExpressionAccess().getOperand_compAssignment_1_2(), "rule__EqualityExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_0_1_1(), "rule__ClassificationExpression__OperatorAssignment_0_1_1");
			builder.put(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compAssignment_0_1_2(), "rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2");
			builder.put(grammarAccess.getClassificationExpressionAccess().getOperand_compAssignment_1_1(), "rule__ClassificationExpression__Operand_compAssignment_1_1");
			builder.put(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_1_2(), "rule__ClassificationExpression__OperatorAssignment_1_2");
			builder.put(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compAssignment_1_3(), "rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3");
			builder.put(grammarAccess.getTypeReferenceMemberAccess().getOwnedMemberFeature_compAssignment(), "rule__TypeReferenceMember__OwnedMemberFeature_compAssignment");
			builder.put(grammarAccess.getTypeReferenceAccess().getOwnedRelationship_compAssignment(), "rule__TypeReference__OwnedRelationship_compAssignment");
			builder.put(grammarAccess.getOwnedFeatureTypingAccess().getTypeAssignment(), "rule__OwnedFeatureTyping__TypeAssignment");
			builder.put(grammarAccess.getSelfReferenceExpressionAccess().getOwnedFeatureMembership_compAssignment(), "rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment");
			builder.put(grammarAccess.getSelfReferenceMemberAccess().getOwnedMemberFeature_compAssignment(), "rule__SelfReferenceMember__OwnedMemberFeature_compAssignment");
			builder.put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1(), "rule__RelationalExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getRelationalExpressionAccess().getOperand_compAssignment_1_2(), "rule__RelationalExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditiveExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getOperand_compAssignment_1_2(), "rule__AdditiveExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getOperand_compAssignment_1_2(), "rule__MultiplicativeExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getExponentiationExpressionAccess().getOperatorAssignment_1_1(), "rule__ExponentiationExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getExponentiationExpressionAccess().getOperand_compAssignment_1_2(), "rule__ExponentiationExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getUnitsExpressionAccess().getOperatorAssignment_1_1(), "rule__UnitsExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getUnitsExpressionAccess().getOperand_compAssignment_1_2(), "rule__UnitsExpression__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1(), "rule__UnaryExpression__OperatorAssignment_0_1");
			builder.put(grammarAccess.getUnaryExpressionAccess().getOperand_compAssignment_0_2(), "rule__UnaryExpression__Operand_compAssignment_0_2");
			builder.put(grammarAccess.getExtentExpressionAccess().getOperatorAssignment_0_1(), "rule__ExtentExpression__OperatorAssignment_0_1");
			builder.put(grammarAccess.getExtentExpressionAccess().getOwnedFeatureMembership_compAssignment_0_2(), "rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2");
			builder.put(grammarAccess.getExtentExpression_DeprecatedAccess().getOwnedFeatureMembership_compAssignment_0(), "rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0");
			builder.put(grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAssignment_2(), "rule__ExtentExpression_Deprecated__OperatorAssignment_2");
			builder.put(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_0_1(), "rule__SequenceExpression__OperatorAssignment_1_0_1");
			builder.put(grammarAccess.getSequenceExpressionAccess().getOperand_compAssignment_1_0_2(), "rule__SequenceExpression__Operand_compAssignment_1_0_2");
			builder.put(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_1_2(), "rule__SequenceExpression__OperatorAssignment_1_1_2");
			builder.put(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compAssignment_1_1_3(), "rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3");
			builder.put(grammarAccess.getBodyExpressionMemberAccess().getOwnedMemberFeature_compAssignment(), "rule__BodyExpressionMember__OwnedMemberFeature_compAssignment");
			builder.put(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_0(), "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0");
			builder.put(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_1(), "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1");
			builder.put(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_3(), "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3");
			builder.put(grammarAccess.getBodyExpressionAccess().getOwnedRelationship_compAssignment_1(), "rule__BodyExpression__OwnedRelationship_compAssignment_1");
			builder.put(grammarAccess.getResultExpressionMemberAccess().getOwnedResultExpression_compAssignment(), "rule__ResultExpressionMember__OwnedResultExpression_compAssignment");
			builder.put(grammarAccess.getBodyParameterMemberAccess().getMemberNameAssignment_0(), "rule__BodyParameterMember__MemberNameAssignment_0");
			builder.put(grammarAccess.getBodyParameterMemberAccess().getOwnedMemberParameter_compAssignment_1(), "rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_0_1(), "rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compAssignment_1_2_0_2(), "rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_1_1(), "rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1");
			builder.put(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compAssignment_1_2_1_2(), "rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2");
			builder.put(grammarAccess.getSequenceElementListAccess().getOperatorAssignment_1_1(), "rule__SequenceElementList__OperatorAssignment_1_1");
			builder.put(grammarAccess.getSequenceElementListAccess().getOperand_compAssignment_1_2(), "rule__SequenceElementList__Operand_compAssignment_1_2");
			builder.put(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedFeatureMembership_compAssignment(), "rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment");
			builder.put(grammarAccess.getFeatureReferenceMemberAccess().getOwnedMemberFeature_compAssignment(), "rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment");
			builder.put(grammarAccess.getFeatureReferenceAccess().getOwnedRelationship_compAssignment(), "rule__FeatureReference__OwnedRelationship_compAssignment");
			builder.put(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureAssignment(), "rule__OwnedSubsetting__SubsettedFeatureAssignment");
			builder.put(grammarAccess.getInvocationExpressionAccess().getOwnedRelationship_compAssignment_0(), "rule__InvocationExpression__OwnedRelationship_compAssignment_0");
			builder.put(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compAssignment_0(), "rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0");
			builder.put(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compAssignment_1_1(), "rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1");
			builder.put(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compAssignment_0(), "rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0");
			builder.put(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compAssignment_1_1(), "rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1");
			builder.put(grammarAccess.getNamedExpressionMemberAccess().getMemberNameAssignment_0(), "rule__NamedExpressionMember__MemberNameAssignment_0");
			builder.put(grammarAccess.getNamedExpressionMemberAccess().getOwnedMemberFeature_compAssignment_2(), "rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2");
			builder.put(grammarAccess.getLiteralBooleanAccess().getValueAssignment(), "rule__LiteralBoolean__ValueAssignment");
			builder.put(grammarAccess.getLiteralStringAccess().getValueAssignment(), "rule__LiteralString__ValueAssignment");
			builder.put(grammarAccess.getLiteralIntegerAccess().getValueAssignment(), "rule__LiteralInteger__ValueAssignment");
			builder.put(grammarAccess.getLiteralRealAccess().getValueAssignment(), "rule__LiteralReal__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private KerMLExpressionsGrammarAccess grammarAccess;

	@Override
	protected InternalKerMLExpressionsParser createParser() {
		InternalKerMLExpressionsParser result = new InternalKerMLExpressionsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_NOTE", "RULE_SL_NOTE" };
	}

	public KerMLExpressionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KerMLExpressionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
