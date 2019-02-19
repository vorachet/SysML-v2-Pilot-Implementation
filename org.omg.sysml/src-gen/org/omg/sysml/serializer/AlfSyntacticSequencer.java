/*
 * generated by Xtext 2.16.0
 */
package org.omg.sysml.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.omg.sysml.services.AlfGrammarAccess;

@SuppressWarnings("all")
public class AlfSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AlfGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AssociationBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__;
	protected AbstractElementAlias match_CategoryBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__;
	protected AbstractElementAlias match_ConnectorDefinition_IsKeyword_0_0_0_2_q;
	protected AbstractElementAlias match_FeaturePackageMemberElement_FeatureKeyword_0_0_q;
	protected AbstractElementAlias match_PackageImport_ColonColonKeyword_3_0_1_0_or_FullStopKeyword_3_0_1_1;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_4_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_4_0_p;
	protected AbstractElementAlias match_TypePart___ColonKeyword_0_0_AnyKeyword_0_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlfGrammarAccess) access;
		match_AssociationBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAssociationBodyAccess().getRightCurlyBracketKeyword_1_2())), new TokenAlias(false, false, grammarAccess.getAssociationBodyAccess().getSemicolonKeyword_0()));
		match_CategoryBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCategoryBodyAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getCategoryBodyAccess().getRightCurlyBracketKeyword_1_2())), new TokenAlias(false, false, grammarAccess.getCategoryBodyAccess().getSemicolonKeyword_0()));
		match_ConnectorDefinition_IsKeyword_0_0_0_2_q = new TokenAlias(false, true, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_0_0_2());
		match_FeaturePackageMemberElement_FeatureKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_0_0());
		match_PackageImport_ColonColonKeyword_3_0_1_0_or_FullStopKeyword_3_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_0_1_0()), new TokenAlias(false, false, grammarAccess.getPackageImportAccess().getFullStopKeyword_3_0_1_1()));
		match_PrimaryExpression_LeftParenthesisKeyword_4_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
		match_PrimaryExpression_LeftParenthesisKeyword_4_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
		match_TypePart___ColonKeyword_0_0_AnyKeyword_0_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypePartAccess().getColonKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getTypePartAccess().getAnyKeyword_0_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNameRule())
			return getNameToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Name :
	 * 	ID | UNRESTRICTED_NAME
	 * ;
	 */
	protected String getNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AssociationBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__.equals(syntax))
				emit_AssociationBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CategoryBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__.equals(syntax))
				emit_CategoryBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConnectorDefinition_IsKeyword_0_0_0_2_q.equals(syntax))
				emit_ConnectorDefinition_IsKeyword_0_0_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FeaturePackageMemberElement_FeatureKeyword_0_0_q.equals(syntax))
				emit_FeaturePackageMemberElement_FeatureKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PackageImport_ColonColonKeyword_3_0_1_0_or_FullStopKeyword_3_0_1_1.equals(syntax))
				emit_PackageImport_ColonColonKeyword_3_0_1_0_or_FullStopKeyword_3_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_4_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_4_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_4_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TypePart___ColonKeyword_0_0_AnyKeyword_0_2_1__q.equals(syntax))
				emit_TypePart___ColonKeyword_0_0_AnyKeyword_0_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     name=Name (ambiguity) (rule end)
	 *     ownedRelationship+=Superclassing (ambiguity) (rule end)
	 */
	protected void emit_AssociationBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     connectorEnd+=ConnectorEnd ')' (ambiguity) (rule end)
	 *     connectorEnd+=ConnectorEnd (ambiguity) (rule end)
	 *     isComposite?='compose' 'any' (ambiguity) (rule end)
	 *     isNonunique?='nonunique' (ambiguity) (rule end)
	 *     isOrdered?='ordered' (ambiguity) (rule end)
	 *     multiplicity=Multiplicity (ambiguity) (rule end)
	 *     name=Name (':' 'any')? (ambiguity) (rule end)
	 *     name=Name (ambiguity) (rule end)
	 *     ownedRelationship+=FeatureTyping (ambiguity) (rule end)
	 *     ownedRelationship+=Redefinition (':' 'any')? (ambiguity) (rule end)
	 *     ownedRelationship+=Redefinition (ambiguity) (rule end)
	 *     ownedRelationship+=Subset (ambiguity) (rule end)
	 *     ownedRelationship+=Superclassing (ambiguity) (rule end)
	 *     valuation=FeatureValue (ambiguity) (rule end)
	 */
	protected void emit_CategoryBody_SemicolonKeyword_0_or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) connectorEnd+=ConnectorEnd
	 */
	protected void emit_ConnectorDefinition_IsKeyword_0_0_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'feature'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ownedMemberElement=NamedFeatureDefinition
	 *     ownedRelationship+=Annotation (ambiguity) ownedMemberElement=NamedFeatureDefinition
	 *     visibility=PackageElementVisibilityIndicator (ambiguity) ownedMemberElement=NamedFeatureDefinition
	 */
	protected void emit_FeaturePackageMemberElement_FeatureKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '::' | '.'
	 *
	 * This ambiguous syntax occurs at:
	 *     importedPackage=[Package|Name] (ambiguity) '*' ';' (rule end)
	 */
	protected void emit_PackageImport_ColonColonKeyword_3_0_1_0_or_FullStopKeyword_3_0_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '*' (rule start)
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' element+=Expression
	 *     (rule start) (ambiguity) class=[Class|QualifiedName]
	 *     (rule start) (ambiguity) operator=UnaryOperator
	 *     (rule start) (ambiguity) referent=[Element|QualifiedName]
	 *     (rule start) (ambiguity) value=BOOLEAN_VALUE
	 *     (rule start) (ambiguity) value=NATURAL_VALUE
	 *     (rule start) (ambiguity) value=RealValue
	 *     (rule start) (ambiguity) value=STRING_VALUE
	 *     (rule start) (ambiguity) {OperatorExpression.operand+=}
	 *     (rule start) (ambiguity) {SequenceAccessExpression.primary=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_4_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) operator=UnaryOperator
	 *     (rule start) (ambiguity) {OperatorExpression.operand+=}
	 *     (rule start) (ambiguity) {SequenceAccessExpression.primary=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (':' 'any')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'redefines' ownedRelationship+=Redefinition
	 *     (rule start) (ambiguity) 'subsets' ownedRelationship+=Subset
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) isNonunique?='nonunique'
	 *     (rule start) (ambiguity) isOrdered?='ordered'
	 *     (rule start) (ambiguity) multiplicity=Multiplicity
	 *     name=Name (ambiguity) '=' valuation=FeatureValue
	 *     name=Name (ambiguity) 'redefines' ownedRelationship+=Redefinition
	 *     name=Name (ambiguity) 'subsets' ownedRelationship+=Subset
	 *     name=Name (ambiguity) '{' ownedImport+=PackageImport
	 *     name=Name (ambiguity) '{' ownedMembership+=CategoryMember
	 *     name=Name (ambiguity) (';' | ('{' '}')) (rule end)
	 *     name=Name (ambiguity) isNonunique?='nonunique'
	 *     name=Name (ambiguity) isOrdered?='ordered'
	 *     name=Name (ambiguity) multiplicity=Multiplicity
	 *     ownedRelationship+=Redefinition (ambiguity) '=' valuation=FeatureValue
	 *     ownedRelationship+=Redefinition (ambiguity) 'redefines' ownedRelationship+=Redefinition
	 *     ownedRelationship+=Redefinition (ambiguity) 'subsets' ownedRelationship+=Subset
	 *     ownedRelationship+=Redefinition (ambiguity) '{' ownedImport+=PackageImport
	 *     ownedRelationship+=Redefinition (ambiguity) '{' ownedMembership+=CategoryMember
	 *     ownedRelationship+=Redefinition (ambiguity) (';' | ('{' '}')) (rule end)
	 *     ownedRelationship+=Redefinition (ambiguity) isNonunique?='nonunique'
	 *     ownedRelationship+=Redefinition (ambiguity) isOrdered?='ordered'
	 *     ownedRelationship+=Redefinition (ambiguity) multiplicity=Multiplicity
	 */
	protected void emit_TypePart___ColonKeyword_0_0_AnyKeyword_0_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
