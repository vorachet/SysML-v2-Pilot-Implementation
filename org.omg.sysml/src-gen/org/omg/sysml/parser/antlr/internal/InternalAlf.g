/*
 * generated by Xtext 2.12.0
 */
grammar InternalAlf;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.omg.sysml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.omg.sysml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.sysml.services.AlfGrammarAccess;

}

@parser::members {

 	private AlfGrammarAccess grammarAccess;

    public InternalAlfParser(TokenStream input, AlfGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "UnitDefinition";
   	}

   	@Override
   	protected AlfGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleUnitDefinition
entryRuleUnitDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnitDefinitionRule()); }
	iv_ruleUnitDefinition=ruleUnitDefinition
	{ $current=$iv_ruleUnitDefinition.current; }
	EOF;

// Rule UnitDefinition
ruleUnitDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getPackageDefinitionParserRuleCall_0());
		}
		this_PackageDefinition_0=rulePackageDefinition
		{
			$current = $this_PackageDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getClassDefinitionParserRuleCall_1());
		}
		this_ClassDefinition_1=ruleClassDefinition
		{
			$current = $this_ClassDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePackageDefinition
entryRulePackageDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageDefinitionRule()); }
	iv_rulePackageDefinition=rulePackageDefinition
	{ $current=$iv_rulePackageDefinition.current; }
	EOF;

// Rule PackageDefinition
rulePackageDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getMemberNamingPackagedElementParserRuleCall_3_0());
				}
				lv_memberNaming_3_0=rulePackagedElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
					}
					add(
						$current,
						"memberNaming",
						lv_memberNaming_3_0,
						"org.omg.sysml.Alf.PackagedElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePackageDefinitionOrStub
entryRulePackageDefinitionOrStub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageDefinitionOrStubRule()); }
	iv_rulePackageDefinitionOrStub=rulePackageDefinitionOrStub
	{ $current=$iv_rulePackageDefinitionOrStub.current; }
	EOF;

// Rule PackageDefinitionOrStub
rulePackageDefinitionOrStub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getPackageDefinitionParserRuleCall());
	}
	this_PackageDefinition_0=rulePackageDefinition
	{
		$current = $this_PackageDefinition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePackagedElement
entryRulePackagedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackagedElementRule()); }
	iv_rulePackagedElement=rulePackagedElement
	{ $current=$iv_rulePackagedElement.current; }
	EOF;

// Rule PackagedElement
rulePackagedElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPackagedElementAccess().getVisibilityImportVisibilityIndicatorEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleImportVisibilityIndicator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackagedElementRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"org.omg.sysml.Alf.ImportVisibilityIndicator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPackagedElementAccess().getOwnedElementPackagedElementDefinitionParserRuleCall_1_0());
				}
				lv_ownedElement_1_0=rulePackagedElementDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackagedElementRule());
					}
					add(
						$current,
						"ownedElement",
						lv_ownedElement_1_0,
						"org.omg.sysml.Alf.PackagedElementDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePackagedElementDefinition
entryRulePackagedElementDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackagedElementDefinitionRule()); }
	iv_rulePackagedElementDefinition=rulePackagedElementDefinition
	{ $current=$iv_rulePackagedElementDefinition.current; }
	EOF;

// Rule PackagedElementDefinition
rulePackagedElementDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0());
		}
		this_PackageDefinitionOrStub_0=rulePackageDefinitionOrStub
		{
			$current = $this_PackageDefinitionOrStub_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1());
		}
		this_ClassifierDefinitionOrStub_1=ruleClassifierDefinitionOrStub
		{
			$current = $this_ClassifierDefinitionOrStub_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClassifierDefinitionOrStub
entryRuleClassifierDefinitionOrStub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassifierDefinitionOrStubRule()); }
	iv_ruleClassifierDefinitionOrStub=ruleClassifierDefinitionOrStub
	{ $current=$iv_ruleClassifierDefinitionOrStub.current; }
	EOF;

// Rule ClassifierDefinitionOrStub
ruleClassifierDefinitionOrStub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall());
	}
	this_ClassDefinitionOrStub_0=ruleClassDefinitionOrStub
	{
		$current = $this_ClassDefinitionOrStub_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleClassDeclaration
entryRuleClassDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDeclarationRule()); }
	iv_ruleClassDeclaration=ruleClassDeclaration
	{ $current=$iv_ruleClassDeclaration.current; }
	EOF;

// Rule ClassDeclaration
ruleClassDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0='abstract'
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassDeclarationRule());
					}
					setWithLastConsumed($current, "isAbstract", true, "abstract");
				}
			)
		)?
		otherlv_1='class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='specializes'
			{
				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_1_0());
					}
					lv_ownedGeneralization_4_0=ruleGeneralization
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
						}
						add(
							$current,
							"ownedGeneralization",
							lv_ownedGeneralization_4_0,
							"org.omg.sysml.Alf.Generalization");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_2_1_0());
						}
						lv_ownedGeneralization_6_0=ruleGeneralization
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
							}
							add(
								$current,
								"ownedGeneralization",
								lv_ownedGeneralization_6_0,
								"org.omg.sysml.Alf.Generalization");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleGeneralization
entryRuleGeneralization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneralizationRule()); }
	iv_ruleGeneralization=ruleGeneralization
	{ $current=$iv_ruleGeneralization.current; }
	EOF;

// Rule Generalization
ruleGeneralization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getGeneralizationRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleClassDefinition
entryRuleClassDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDefinitionRule()); }
	iv_ruleClassDefinition=ruleClassDefinition
	{ $current=$iv_ruleClassDefinition.current; }
	EOF;

// Rule ClassDefinition
ruleClassDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
		}
		this_ClassDeclaration_0=ruleClassDeclaration
		{
			$current = $this_ClassDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMemberNamingClassMemberParserRuleCall_2_0());
				}
				lv_memberNaming_2_0=ruleClassMember
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
					}
					add(
						$current,
						"memberNaming",
						lv_memberNaming_2_0,
						"org.omg.sysml.Alf.ClassMember");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleClassDefinitionOrStub
entryRuleClassDefinitionOrStub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDefinitionOrStubRule()); }
	iv_ruleClassDefinitionOrStub=ruleClassDefinitionOrStub
	{ $current=$iv_ruleClassDefinitionOrStub.current; }
	EOF;

// Rule ClassDefinitionOrStub
ruleClassDefinitionOrStub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getClassDefinitionParserRuleCall());
	}
	this_ClassDefinition_0=ruleClassDefinition
	{
		$current = $this_ClassDefinition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleClassMember
entryRuleClassMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassMemberRule()); }
	iv_ruleClassMember=ruleClassMember
	{ $current=$iv_ruleClassMember.current; }
	EOF;

// Rule ClassMember
ruleClassMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getClassMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibilityIndicator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassMemberRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"org.omg.sysml.Alf.VisibilityIndicator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getClassMemberAccess().getOwnedElementFeatureDefinitionParserRuleCall_1_0());
				}
				lv_ownedElement_1_0=ruleFeatureDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassMemberRule());
					}
					add(
						$current,
						"ownedElement",
						lv_ownedElement_1_0,
						"org.omg.sysml.Alf.FeatureDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFeatureDefinition
entryRuleFeatureDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureDefinitionRule()); }
	iv_ruleFeatureDefinition=ruleFeatureDefinition
	{ $current=$iv_ruleFeatureDefinition.current; }
	EOF;

// Rule FeatureDefinition
ruleFeatureDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFeatureDefinitionAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureDefinitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleName
entryRuleName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current.getText(); }
	EOF;

// Rule Name
ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_UNRESTRICTED_NAME_1=RULE_UNRESTRICTED_NAME
		{
			$current.merge(this_UNRESTRICTED_NAME_1);
		}
		{
			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
		}
		this_Name_0=ruleName
		{
			$current.merge(this_Name_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
			}
			this_Name_2=ruleName
			{
				$current.merge(this_Name_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Rule ImportVisibilityIndicator
ruleImportVisibilityIndicator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='public'
			{
				$current = grammarAccess.getImportVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getImportVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='private'
			{
				$current = grammarAccess.getImportVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getImportVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule VisibilityIndicator
ruleVisibilityIndicator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='public'
			{
				$current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='private'
			{
				$current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='protected'
			{
				$current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_BOOLEAN_VALUE : ('true'|'false');

RULE_NATURAL_VALUE : (('0'|'1'..'9' ('_'? '0'..'9')*)|('0b'|'0B') '0'..'1' ('_'? '0'..'1')*|('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F') ('_'? ('0'..'9'|'a'..'f'|'A'..'F'))*|'0' '_'? '0'..'7' ('_'? '0'..'7')*);

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_UNRESTRICTED_NAME : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_DOCUMENTATION_COMMENT : '/**' ( options {greedy=false;} : . )*'*/';

RULE_STATEMENT_ANNOTATION : '//@' ( options {greedy=false;} : . )*'\n';

RULE_INLINE_STATEMENT : '/*@inline(' (RULE_ID|RULE_UNRESTRICTED_NAME) ')' ( options {greedy=false;} : . )*'*/';

RULE_ML_COMMENT : '/*' ~(('*'|'@')) ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' (~(('@'|'\n'|'\r')) ~(('\n'|'\r'))*)? ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;
