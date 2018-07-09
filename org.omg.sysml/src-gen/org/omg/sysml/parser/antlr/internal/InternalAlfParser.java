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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'is'", "';'", "'class'", "'assoc'", "'feature'", "'abstract'", "'specializes'", "','", "'part'", "'port'", "'connector'", "':'", "'composes'", "'any'", "'['", "'..'", "']'", "'='", "'redefines'", "'subsets'", "'=>'", "'@'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'null'", "'.'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int T__54=54;
    public static final int RULE_ID=7;
    public static final int RULE_NATURAL_VALUE=6;
    public static final int RULE_INLINE_STATEMENT=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_BOOLEAN_VALUE=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_UNRESTRICTED_NAME=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=5;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAlfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlf.g"; }



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




    // $ANTLR start "entryRuleUnitDefinition"
    // InternalAlf.g:65:1: entryRuleUnitDefinition returns [EObject current=null] : iv_ruleUnitDefinition= ruleUnitDefinition EOF ;
    public final EObject entryRuleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitDefinition = null;


        try {
            // InternalAlf.g:65:55: (iv_ruleUnitDefinition= ruleUnitDefinition EOF )
            // InternalAlf.g:66:2: iv_ruleUnitDefinition= ruleUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitDefinition=ruleUnitDefinition();

            state._fsp--;

             current =iv_ruleUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitDefinition"


    // $ANTLR start "ruleUnitDefinition"
    // InternalAlf.g:72:1: ruleUnitDefinition returns [EObject current=null] : (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition ) ;
    public final EObject ruleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;

        EObject this_ClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:78:2: ( (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition ) )
            // InternalAlf.g:79:2: (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition )
            {
            // InternalAlf.g:79:2: (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==20||LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:80:3: this_PackageDefinition_0= rulePackageDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getPackageDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDefinition_0=rulePackageDefinition();

                    state._fsp--;


                    			current = this_PackageDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:89:3: this_ClassDefinition_1= ruleClassDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getClassDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDefinition_1=ruleClassDefinition();

                    state._fsp--;


                    			current = this_ClassDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitDefinition"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalAlf.g:101:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // InternalAlf.g:101:58: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // InternalAlf.g:102:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
             newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;

             current =iv_rulePackageDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalAlf.g:108:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedMembership_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' ) )
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' )
            {
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' )
            // InternalAlf.g:116:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:120:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:121:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:121:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:122:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:143:3: ( (lv_ownedMembership_3_0= rulePackageMember ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||LA2_0==15||(LA2_0>=20 && LA2_0<=23)||(LA2_0>=51 && LA2_0<=54)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:144:4: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:144:4: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:145:5: lv_ownedMembership_3_0= rulePackageMember
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedMembership_3_0=rulePackageMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_3_0,
            	    						"org.omg.sysml.Alf.PackageMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRulePackageDefinitionOrStub"
    // InternalAlf.g:170:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:170:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:171:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getPackageDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinitionOrStub=rulePackageDefinitionOrStub();

            state._fsp--;

             current =iv_rulePackageDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinitionOrStub"


    // $ANTLR start "rulePackageDefinitionOrStub"
    // InternalAlf.g:177:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:183:2: (this_PackageDefinition_0= rulePackageDefinition )
            // InternalAlf.g:184:2: this_PackageDefinition_0= rulePackageDefinition
            {

            		newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getPackageDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PackageDefinition_0=rulePackageDefinition();

            state._fsp--;


            		current = this_PackageDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDefinitionOrStub"


    // $ANTLR start "entryRulePackageMember"
    // InternalAlf.g:195:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:195:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:196:2: iv_rulePackageMember= rulePackageMember EOF
            {
             newCompositeNode(grammarAccess.getPackageMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageMember=rulePackageMember();

            state._fsp--;

             current =iv_rulePackageMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageMember"


    // $ANTLR start "rulePackageMember"
    // InternalAlf.g:202:1: rulePackageMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_PackagedFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:208:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember ) )
            // InternalAlf.g:209:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember )
            {
            // InternalAlf.g:209:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 51:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15||(LA3_1>=20 && LA3_1<=21)||LA3_1==23) ) {
                    alt3=1;
                }
                else if ( ((LA3_1>=RULE_ID && LA3_1<=RULE_UNRESTRICTED_NAME)||LA3_1==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==15||(LA3_2>=20 && LA3_2<=21)||LA3_2==23) ) {
                    alt3=1;
                }
                else if ( ((LA3_2>=RULE_ID && LA3_2<=RULE_UNRESTRICTED_NAME)||LA3_2==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=RULE_ID && LA3_3<=RULE_UNRESTRICTED_NAME)||LA3_3==22) ) {
                    alt3=2;
                }
                else if ( (LA3_3==15||(LA3_3>=20 && LA3_3<=21)||LA3_3==23) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==15||(LA3_4>=20 && LA3_4<=21)||LA3_4==23) ) {
                    alt3=1;
                }
                else if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)||LA3_4==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 20:
            case 21:
            case 23:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 22:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAlf.g:210:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:219:3: this_PackagedFeatureMember_1= rulePackagedFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getPackagedFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackagedFeatureMember_1=rulePackagedFeatureMember();

                    state._fsp--;


                    			current = this_PackagedFeatureMember_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageMember"


    // $ANTLR start "entryRuleNonFeatureMember"
    // InternalAlf.g:231:1: entryRuleNonFeatureMember returns [EObject current=null] : iv_ruleNonFeatureMember= ruleNonFeatureMember EOF ;
    public final EObject entryRuleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureMember = null;


        try {
            // InternalAlf.g:231:57: (iv_ruleNonFeatureMember= ruleNonFeatureMember EOF )
            // InternalAlf.g:232:2: iv_ruleNonFeatureMember= ruleNonFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureMember=ruleNonFeatureMember();

            state._fsp--;

             current =iv_ruleNonFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureMember"


    // $ANTLR start "ruleNonFeatureMember"
    // InternalAlf.g:238:1: ruleNonFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) ;
    public final EObject ruleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_1_0 = null;

        AntlrDatatypeRuleToken lv_memberName_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:244:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) )
            // InternalAlf.g:245:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            {
            // InternalAlf.g:245:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            // InternalAlf.g:246:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            {
            // InternalAlf.g:246:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=51 && LA4_0<=54)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlf.g:247:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:247:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:248:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:265:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:266:4: ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:266:4: ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:267:5: (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:267:5: (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:268:6: lv_ownedMemberElement_1_0= ruleNonFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_1_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_1_0,
                    							"org.omg.sysml.Alf.NonFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:286:4: ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    {
                    // InternalAlf.g:286:4: ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    // InternalAlf.g:287:5: ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getNonFeatureMemberKindParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    ruleNonFeatureMemberKind();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalAlf.g:294:5: ( (lv_memberName_3_0= ruleName ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAlf.g:295:6: (lv_memberName_3_0= ruleName )
                            {
                            // InternalAlf.g:295:6: (lv_memberName_3_0= ruleName )
                            // InternalAlf.g:296:7: lv_memberName_3_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_memberName_3_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_3_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_1_2());
                    				
                    // InternalAlf.g:317:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:318:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:318:6: ( ruleQualifiedName )
                    // InternalAlf.g:319:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementCrossReference_1_1_3_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_1_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFeatureMember"


    // $ANTLR start "entryRuleNonFeatureMemberKind"
    // InternalAlf.g:343:1: entryRuleNonFeatureMemberKind returns [String current=null] : iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF ;
    public final String entryRuleNonFeatureMemberKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonFeatureMemberKind = null;


        try {
            // InternalAlf.g:343:60: (iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF )
            // InternalAlf.g:344:2: iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureMemberKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureMemberKind=ruleNonFeatureMemberKind();

            state._fsp--;

             current =iv_ruleNonFeatureMemberKind.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureMemberKind"


    // $ANTLR start "ruleNonFeatureMemberKind"
    // InternalAlf.g:350:1: ruleNonFeatureMemberKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' | kw= 'class' | kw= 'assoc' ) ;
    public final AntlrDatatypeRuleToken ruleNonFeatureMemberKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:356:2: ( (kw= 'package' | kw= 'class' | kw= 'assoc' ) )
            // InternalAlf.g:357:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            {
            // InternalAlf.g:357:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAlf.g:358:3: kw= 'package'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:364:3: kw= 'class'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:370:3: kw= 'assoc'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getAssocKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFeatureMemberKind"


    // $ANTLR start "entryRulePackagedFeatureMember"
    // InternalAlf.g:379:1: entryRulePackagedFeatureMember returns [EObject current=null] : iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF ;
    public final EObject entryRulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedFeatureMember = null;


        try {
            // InternalAlf.g:379:62: (iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF )
            // InternalAlf.g:380:2: iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getPackagedFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagedFeatureMember=rulePackagedFeatureMember();

            state._fsp--;

             current =iv_rulePackagedFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackagedFeatureMember"


    // $ANTLR start "rulePackagedFeatureMember"
    // InternalAlf.g:386:1: rulePackagedFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) ;
    public final EObject rulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_6_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:392:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) )
            // InternalAlf.g:393:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            {
            // InternalAlf.g:393:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            // InternalAlf.g:394:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            {
            // InternalAlf.g:394:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=51 && LA8_0<=54)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:395:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:395:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:396:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:413:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:414:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:414:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) )
                    // InternalAlf.g:415:5: (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) )
                    {
                    // InternalAlf.g:415:5: (otherlv_1= 'feature' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAlf.g:416:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_10); 

                            						newLeafNode(otherlv_1, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:421:5: ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) )
                    // InternalAlf.g:422:6: (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition )
                    {
                    // InternalAlf.g:422:6: (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition )
                    // InternalAlf.g:423:7: lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleTypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_2_0,
                    								"org.omg.sysml.Alf.TypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:442:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:442:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) )
                    // InternalAlf.g:443:5: otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0());
                    				
                    // InternalAlf.g:447:5: ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) )
                    // InternalAlf.g:448:6: (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition )
                    {
                    // InternalAlf.g:448:6: (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition )
                    // InternalAlf.g:449:7: lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleUntypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_4_0,
                    								"org.omg.sysml.Alf.UntypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:468:4: ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:468:4: ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:469:5: ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    // InternalAlf.g:469:5: ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAlf.g:470:6: (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? )
                            {
                            // InternalAlf.g:470:6: (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? )
                            // InternalAlf.g:471:7: otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )?
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_7); 

                            							newLeafNode(otherlv_5, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_2_0_0_0());
                            						
                            // InternalAlf.g:475:7: ( (lv_memberName_6_0= ruleName ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalAlf.g:476:8: (lv_memberName_6_0= ruleName )
                                    {
                                    // InternalAlf.g:476:8: (lv_memberName_6_0= ruleName )
                                    // InternalAlf.g:477:9: lv_memberName_6_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_6_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_6_0,
                                    										"org.omg.sysml.Alf.Name");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:496:6: ( (lv_memberName_7_0= ruleName ) )
                            {
                            // InternalAlf.g:496:6: ( (lv_memberName_7_0= ruleName ) )
                            // InternalAlf.g:497:7: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:497:7: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:498:8: lv_memberName_7_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_1_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_memberName_7_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_7_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_2_1());
                    				
                    // InternalAlf.g:520:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:521:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:521:6: ( ruleQualifiedName )
                    // InternalAlf.g:522:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_2_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_2_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackagedFeatureMember"


    // $ANTLR start "entryRuleNonFeatureDefinition"
    // InternalAlf.g:546:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:546:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:547:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureDefinition=ruleNonFeatureDefinition();

            state._fsp--;

             current =iv_ruleNonFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureDefinition"


    // $ANTLR start "ruleNonFeatureDefinition"
    // InternalAlf.g:553:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:559:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) )
            // InternalAlf.g:560:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            {
            // InternalAlf.g:560:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=20 && LA13_0<=21)||LA13_0==23) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:561:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDefinitionOrStub_0=rulePackageDefinitionOrStub();

                    state._fsp--;


                    			current = this_PackageDefinitionOrStub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:570:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassifierDefinitionOrStub_1=ruleClassifierDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassifierDefinitionOrStub_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFeatureDefinition"


    // $ANTLR start "entryRuleClassifierDefinitionOrStub"
    // InternalAlf.g:582:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:582:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:583:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getClassifierDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierDefinitionOrStub=ruleClassifierDefinitionOrStub();

            state._fsp--;

             current =iv_ruleClassifierDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifierDefinitionOrStub"


    // $ANTLR start "ruleClassifierDefinitionOrStub"
    // InternalAlf.g:589:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;

        EObject this_AssociationDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:595:2: ( (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:596:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:596:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==21) ) {
                    alt14=2;
                }
                else if ( (LA14_1==20) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt14=1;
                }
                break;
            case 21:
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAlf.g:597:3: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDefinitionOrStub_0=ruleClassDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassDefinitionOrStub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:606:3: this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getAssociationDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationDefinitionOrStub_1=ruleAssociationDefinitionOrStub();

                    state._fsp--;


                    			current = this_AssociationDefinitionOrStub_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifierDefinitionOrStub"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalAlf.g:618:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:618:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:619:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalAlf.g:625:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_ownedMembership_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:631:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:632:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:632:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:633:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:633:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:634:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:634:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:635:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_12); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalAlf.g:651:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:652:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:652:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:653:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:670:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18||LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:671:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:671:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==18) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==24) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:672:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:677:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:682:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:683:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:683:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:684:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ownedMembership_5_0=ruleOwnedGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_5_0,
                    							"org.omg.sysml.Alf.OwnedGeneralization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:701:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAlf.g:702:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:706:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:707:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:707:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:708:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_ownedMembership_7_0=ruleOwnedGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_7_0,
                    	    								"org.omg.sysml.Alf.OwnedGeneralization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleOwnedGeneralization"
    // InternalAlf.g:731:1: entryRuleOwnedGeneralization returns [EObject current=null] : iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF ;
    public final EObject entryRuleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedGeneralization = null;


        try {
            // InternalAlf.g:731:60: (iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF )
            // InternalAlf.g:732:2: iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF
            {
             newCompositeNode(grammarAccess.getOwnedGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedGeneralization=ruleOwnedGeneralization();

            state._fsp--;

             current =iv_ruleOwnedGeneralization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedGeneralization"


    // $ANTLR start "ruleOwnedGeneralization"
    // InternalAlf.g:738:1: ruleOwnedGeneralization returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) ;
    public final EObject ruleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:744:2: ( ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) )
            // InternalAlf.g:745:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            {
            // InternalAlf.g:745:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            // InternalAlf.g:746:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            {
            // InternalAlf.g:746:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            // InternalAlf.g:747:4: lv_ownedMemberElement_0_0= ruleGeneralization
            {

            				newCompositeNode(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementGeneralizationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_0_0=ruleGeneralization();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOwnedGeneralizationRule());
            				}
            				set(
            					current,
            					"ownedMemberElement",
            					lv_ownedMemberElement_0_0,
            					"org.omg.sysml.Alf.Generalization");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwnedGeneralization"


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:767:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:767:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:768:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalAlf.g:774:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:780:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:781:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:781:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:782:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:782:3: ( ruleQualifiedName )
            // InternalAlf.g:783:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGeneralizationRule());
            				}
            			

            				newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalAlf.g:800:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:800:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:801:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;

             current =iv_ruleClassDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalAlf.g:807:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:813:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:814:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:814:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            // InternalAlf.g:815:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:827:3: ( (lv_ownedMembership_2_0= ruleClassMember ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)||LA19_0==15||(LA19_0>=20 && LA19_0<=23)||(LA19_0>=26 && LA19_0<=28)||(LA19_0>=51 && LA19_0<=57)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlf.g:828:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:828:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    // InternalAlf.g:829:5: lv_ownedMembership_2_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_ownedMembership_2_0=ruleClassMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_2_0,
            	    						"org.omg.sysml.Alf.ClassMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:854:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:854:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:855:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinitionOrStub=ruleClassDefinitionOrStub();

            state._fsp--;

             current =iv_ruleClassDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDefinitionOrStub"


    // $ANTLR start "ruleClassDefinitionOrStub"
    // InternalAlf.g:861:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:867:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:868:2: this_ClassDefinition_0= ruleClassDefinition
            {

            		newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getClassDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassDefinition_0=ruleClassDefinition();

            state._fsp--;


            		current = this_ClassDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDefinitionOrStub"


    // $ANTLR start "entryRuleClassMember"
    // InternalAlf.g:879:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:879:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:880:2: iv_ruleClassMember= ruleClassMember EOF
            {
             newCompositeNode(grammarAccess.getClassMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassMember=ruleClassMember();

            state._fsp--;

             current =iv_ruleClassMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassMember"


    // $ANTLR start "ruleClassMember"
    // InternalAlf.g:886:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_ClassFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:892:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) )
            // InternalAlf.g:893:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            {
            // InternalAlf.g:893:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 51:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==15||(LA20_1>=20 && LA20_1<=21)||LA20_1==23) ) {
                    alt20=1;
                }
                else if ( ((LA20_1>=RULE_ID && LA20_1<=RULE_UNRESTRICTED_NAME)||LA20_1==22||(LA20_1>=26 && LA20_1<=28)||(LA20_1>=55 && LA20_1<=57)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA20_2 = input.LA(2);

                if ( ((LA20_2>=RULE_ID && LA20_2<=RULE_UNRESTRICTED_NAME)||LA20_2==22||(LA20_2>=26 && LA20_2<=28)||(LA20_2>=55 && LA20_2<=57)) ) {
                    alt20=2;
                }
                else if ( (LA20_2==15||(LA20_2>=20 && LA20_2<=21)||LA20_2==23) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA20_3 = input.LA(2);

                if ( ((LA20_3>=RULE_ID && LA20_3<=RULE_UNRESTRICTED_NAME)||LA20_3==22||(LA20_3>=26 && LA20_3<=28)||(LA20_3>=55 && LA20_3<=57)) ) {
                    alt20=2;
                }
                else if ( (LA20_3==15||(LA20_3>=20 && LA20_3<=21)||LA20_3==23) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA20_4 = input.LA(2);

                if ( (LA20_4==15||(LA20_4>=20 && LA20_4<=21)||LA20_4==23) ) {
                    alt20=1;
                }
                else if ( ((LA20_4>=RULE_ID && LA20_4<=RULE_UNRESTRICTED_NAME)||LA20_4==22||(LA20_4>=26 && LA20_4<=28)||(LA20_4>=55 && LA20_4<=57)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 20:
            case 21:
            case 23:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 22:
            case 26:
            case 27:
            case 28:
            case 55:
            case 56:
            case 57:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAlf.g:894:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:903:3: this_ClassFeatureMember_1= ruleClassFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getClassFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassFeatureMember_1=ruleClassFeatureMember();

                    state._fsp--;


                    			current = this_ClassFeatureMember_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleClassFeatureMember"
    // InternalAlf.g:915:1: entryRuleClassFeatureMember returns [EObject current=null] : iv_ruleClassFeatureMember= ruleClassFeatureMember EOF ;
    public final EObject entryRuleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassFeatureMember = null;


        try {
            // InternalAlf.g:915:59: (iv_ruleClassFeatureMember= ruleClassFeatureMember EOF )
            // InternalAlf.g:916:2: iv_ruleClassFeatureMember= ruleClassFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getClassFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassFeatureMember=ruleClassFeatureMember();

            state._fsp--;

             current =iv_ruleClassFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassFeatureMember"


    // $ANTLR start "ruleClassFeatureMember"
    // InternalAlf.g:922:1: ruleClassFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) ) ;
    public final EObject ruleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_6=null;
        Token lv_isComposite_7_0=null;
        Token lv_isPort_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_isComposite_14_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedMemberElement_5_0 = null;

        Enumerator lv_direction_9_0 = null;

        EObject lv_ownedMemberElement_10_0 = null;

        EObject lv_ownedMemberElement_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_15_0 = null;

        AntlrDatatypeRuleToken lv_memberName_16_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:928:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) ) )
            // InternalAlf.g:929:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) )
            {
            // InternalAlf.g:929:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) )
            // InternalAlf.g:930:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )
            {
            // InternalAlf.g:930:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=51 && LA21_0<=54)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:931:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:931:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:932:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:949:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )
            int alt29=4;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:950:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:950:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) )
                    // InternalAlf.g:951:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) )
                    {
                    // InternalAlf.g:951:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt22=4;
                    switch ( input.LA(1) ) {
                        case 22:
                            {
                            alt22=1;
                            }
                            break;
                        case 26:
                            {
                            alt22=2;
                            }
                            break;
                        case 27:
                            {
                            alt22=3;
                            }
                            break;
                    }

                    switch (alt22) {
                        case 1 :
                            // InternalAlf.g:952:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_17); 

                            						newLeafNode(otherlv_1, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:957:6: ( (lv_isComposite_2_0= 'part' ) )
                            {
                            // InternalAlf.g:957:6: ( (lv_isComposite_2_0= 'part' ) )
                            // InternalAlf.g:958:7: (lv_isComposite_2_0= 'part' )
                            {
                            // InternalAlf.g:958:7: (lv_isComposite_2_0= 'part' )
                            // InternalAlf.g:959:8: lv_isComposite_2_0= 'part'
                            {
                            lv_isComposite_2_0=(Token)match(input,26,FOLLOW_17); 

                            								newLeafNode(lv_isComposite_2_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:972:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:972:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:973:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:973:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:974:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,27,FOLLOW_17); 

                            								newLeafNode(lv_isPort_3_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:987:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=55 && LA23_0<=57)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:988:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:988:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:989:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_4_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1006:5: ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) )
                    // InternalAlf.g:1007:6: (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition )
                    {
                    // InternalAlf.g:1007:6: (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition )
                    // InternalAlf.g:1008:7: lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_5_0=ruleTypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_5_0,
                    								"org.omg.sysml.Alf.TypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1027:4: ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1027:4: ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) )
                    // InternalAlf.g:1028:5: (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1028:5: (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) )
                    int alt24=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt24=1;
                        }
                        break;
                    case 26:
                        {
                        alt24=2;
                        }
                        break;
                    case 27:
                        {
                        alt24=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:1029:6: otherlv_6= 'feature'
                            {
                            otherlv_6=(Token)match(input,22,FOLLOW_18); 

                            						newLeafNode(otherlv_6, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1034:6: ( (lv_isComposite_7_0= 'part' ) )
                            {
                            // InternalAlf.g:1034:6: ( (lv_isComposite_7_0= 'part' ) )
                            // InternalAlf.g:1035:7: (lv_isComposite_7_0= 'part' )
                            {
                            // InternalAlf.g:1035:7: (lv_isComposite_7_0= 'part' )
                            // InternalAlf.g:1036:8: lv_isComposite_7_0= 'part'
                            {
                            lv_isComposite_7_0=(Token)match(input,26,FOLLOW_18); 

                            								newLeafNode(lv_isComposite_7_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1049:6: ( (lv_isPort_8_0= 'port' ) )
                            {
                            // InternalAlf.g:1049:6: ( (lv_isPort_8_0= 'port' ) )
                            // InternalAlf.g:1050:7: (lv_isPort_8_0= 'port' )
                            {
                            // InternalAlf.g:1050:7: (lv_isPort_8_0= 'port' )
                            // InternalAlf.g:1051:8: lv_isPort_8_0= 'port'
                            {
                            lv_isPort_8_0=(Token)match(input,27,FOLLOW_18); 

                            								newLeafNode(lv_isPort_8_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1064:5: ( (lv_direction_9_0= ruleFeatureDirection ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=55 && LA25_0<=57)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAlf.g:1065:6: (lv_direction_9_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1065:6: (lv_direction_9_0= ruleFeatureDirection )
                            // InternalAlf.g:1066:7: lv_direction_9_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_direction_9_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_9_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1083:5: ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) )
                    // InternalAlf.g:1084:6: (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition )
                    {
                    // InternalAlf.g:1084:6: (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition )
                    // InternalAlf.g:1085:7: lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_10_0=ruleUntypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_10_0,
                    								"org.omg.sysml.Alf.UntypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1104:4: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1104:4: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1105:5: otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_19); 

                    					newLeafNode(otherlv_11, grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_2_0());
                    				
                    // InternalAlf.g:1109:5: ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1110:6: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1110:6: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    // InternalAlf.g:1111:7: lv_ownedMemberElement_12_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_12_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_12_0,
                    								"org.omg.sysml.Alf.ConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1130:4: ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' )
                    {
                    // InternalAlf.g:1130:4: ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' )
                    // InternalAlf.g:1131:5: ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';'
                    {
                    // InternalAlf.g:1131:5: ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==22||LA28_0==26) ) {
                        alt28=1;
                    }
                    else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAlf.g:1132:6: ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1132:6: ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? )
                            // InternalAlf.g:1133:7: (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )?
                            {
                            // InternalAlf.g:1133:7: (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==22) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==26) ) {
                                alt26=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalAlf.g:1134:8: otherlv_13= 'feature'
                                    {
                                    otherlv_13=(Token)match(input,22,FOLLOW_7); 

                                    								newLeafNode(otherlv_13, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1139:8: ( (lv_isComposite_14_0= 'part' ) )
                                    {
                                    // InternalAlf.g:1139:8: ( (lv_isComposite_14_0= 'part' ) )
                                    // InternalAlf.g:1140:9: (lv_isComposite_14_0= 'part' )
                                    {
                                    // InternalAlf.g:1140:9: (lv_isComposite_14_0= 'part' )
                                    // InternalAlf.g:1141:10: lv_isComposite_14_0= 'part'
                                    {
                                    lv_isComposite_14_0=(Token)match(input,26,FOLLOW_7); 

                                    										newLeafNode(lv_isComposite_14_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0());
                                    									

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                                    										}
                                    										setWithLastConsumed(current, "isComposite", true, "part");
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:1154:7: ( (lv_memberName_15_0= ruleName ) )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalAlf.g:1155:8: (lv_memberName_15_0= ruleName )
                                    {
                                    // InternalAlf.g:1155:8: (lv_memberName_15_0= ruleName )
                                    // InternalAlf.g:1156:9: lv_memberName_15_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_15_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_15_0,
                                    										"org.omg.sysml.Alf.Name");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1175:6: ( (lv_memberName_16_0= ruleName ) )
                            {
                            // InternalAlf.g:1175:6: ( (lv_memberName_16_0= ruleName ) )
                            // InternalAlf.g:1176:7: (lv_memberName_16_0= ruleName )
                            {
                            // InternalAlf.g:1176:7: (lv_memberName_16_0= ruleName )
                            // InternalAlf.g:1177:8: lv_memberName_16_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_1_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_memberName_16_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_16_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_17, grammarAccess.getClassFeatureMemberAccess().getIsKeyword_1_3_1());
                    				
                    // InternalAlf.g:1199:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1200:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1200:6: ( ruleQualifiedName )
                    // InternalAlf.g:1201:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_1_3_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_19, grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_1_3_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassFeatureMember"


    // $ANTLR start "entryRuleAssociationDeclaration"
    // InternalAlf.g:1225:1: entryRuleAssociationDeclaration returns [EObject current=null] : iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF ;
    public final EObject entryRuleAssociationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDeclaration = null;


        try {
            // InternalAlf.g:1225:63: (iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF )
            // InternalAlf.g:1226:2: iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAssociationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDeclaration=ruleAssociationDeclaration();

            state._fsp--;

             current =iv_ruleAssociationDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationDeclaration"


    // $ANTLR start "ruleAssociationDeclaration"
    // InternalAlf.g:1232:1: ruleAssociationDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
    public final EObject ruleAssociationDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_ownedMembership_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1238:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:1239:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1239:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:1240:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:1240:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1241:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1241:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1242:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_20); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1());
            		
            // InternalAlf.g:1258:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1259:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1259:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1260:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1277:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18||LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1278:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:1278:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==18) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==24) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAlf.g:1279:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1284:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1289:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:1290:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:1290:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:1291:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ownedMembership_5_0=ruleOwnedGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_5_0,
                    							"org.omg.sysml.Alf.OwnedGeneralization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1308:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==25) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAlf.g:1309:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1313:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:1314:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:1314:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:1315:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_ownedMembership_7_0=ruleOwnedGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_7_0,
                    	    								"org.omg.sysml.Alf.OwnedGeneralization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationDeclaration"


    // $ANTLR start "entryRuleAssociationDefinition"
    // InternalAlf.g:1338:1: entryRuleAssociationDefinition returns [EObject current=null] : iv_ruleAssociationDefinition= ruleAssociationDefinition EOF ;
    public final EObject entryRuleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinition = null;


        try {
            // InternalAlf.g:1338:62: (iv_ruleAssociationDefinition= ruleAssociationDefinition EOF )
            // InternalAlf.g:1339:2: iv_ruleAssociationDefinition= ruleAssociationDefinition EOF
            {
             newCompositeNode(grammarAccess.getAssociationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDefinition=ruleAssociationDefinition();

            state._fsp--;

             current =iv_ruleAssociationDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationDefinition"


    // $ANTLR start "ruleAssociationDefinition"
    // InternalAlf.g:1345:1: ruleAssociationDefinition returns [EObject current=null] : (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' ) ;
    public final EObject ruleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_AssociationDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedMembership_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1351:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' ) )
            // InternalAlf.g:1352:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' )
            {
            // InternalAlf.g:1352:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' )
            // InternalAlf.g:1353:3: this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}'
            {

            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_AssociationDeclaration_0=ruleAssociationDeclaration();

            state._fsp--;


            			current = this_AssociationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1365:3: ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) )
            // InternalAlf.g:1366:4: (lv_ownedMembership_2_0= rulePackagedFeatureMember )
            {
            // InternalAlf.g:1366:4: (lv_ownedMembership_2_0= rulePackagedFeatureMember )
            // InternalAlf.g:1367:5: lv_ownedMembership_2_0= rulePackagedFeatureMember
            {

            					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_ownedMembership_2_0=rulePackagedFeatureMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_2_0,
            						"org.omg.sysml.Alf.PackagedFeatureMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1384:3: ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) )
            // InternalAlf.g:1385:4: (lv_ownedMembership_3_0= rulePackagedFeatureMember )
            {
            // InternalAlf.g:1385:4: (lv_ownedMembership_3_0= rulePackagedFeatureMember )
            // InternalAlf.g:1386:5: lv_ownedMembership_3_0= rulePackagedFeatureMember
            {

            					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_ownedMembership_3_0=rulePackagedFeatureMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_3_0,
            						"org.omg.sysml.Alf.PackagedFeatureMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationDefinition"


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:1411:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:1411:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:1412:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getAssociationDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDefinitionOrStub=ruleAssociationDefinitionOrStub();

            state._fsp--;

             current =iv_ruleAssociationDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationDefinitionOrStub"


    // $ANTLR start "ruleAssociationDefinitionOrStub"
    // InternalAlf.g:1418:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1424:2: (this_AssociationDefinition_0= ruleAssociationDefinition )
            // InternalAlf.g:1425:2: this_AssociationDefinition_0= ruleAssociationDefinition
            {

            		newCompositeNode(grammarAccess.getAssociationDefinitionOrStubAccess().getAssociationDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssociationDefinition_0=ruleAssociationDefinition();

            state._fsp--;


            		current = this_AssociationDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationDefinitionOrStub"


    // $ANTLR start "entryRuleTypedFeatureDefinition"
    // InternalAlf.g:1436:1: entryRuleTypedFeatureDefinition returns [EObject current=null] : iv_ruleTypedFeatureDefinition= ruleTypedFeatureDefinition EOF ;
    public final EObject entryRuleTypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedFeatureDefinition = null;


        try {
            // InternalAlf.g:1436:63: (iv_ruleTypedFeatureDefinition= ruleTypedFeatureDefinition EOF )
            // InternalAlf.g:1437:2: iv_ruleTypedFeatureDefinition= ruleTypedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedFeatureDefinition=ruleTypedFeatureDefinition();

            state._fsp--;

             current =iv_ruleTypedFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedFeatureDefinition"


    // $ANTLR start "ruleTypedFeatureDefinition"
    // InternalAlf.g:1443:1: ruleTypedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) ;
    public final EObject ruleTypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_ownedMembership_15_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1449:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) )
            // InternalAlf.g:1450:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
            {
            // InternalAlf.g:1450:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
            // InternalAlf.g:1451:3: ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
            {
            // InternalAlf.g:1451:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:1452:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:1452:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:1453:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1470:3: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlf.g:1471:4: otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypedFeatureDefinitionAccess().getColonKeyword_1_0());
                    			
                    // InternalAlf.g:1475:4: ( (lv_isComposite_2_0= 'composes' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==30) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1476:5: (lv_isComposite_2_0= 'composes' )
                            {
                            // InternalAlf.g:1476:5: (lv_isComposite_2_0= 'composes' )
                            // InternalAlf.g:1477:6: lv_isComposite_2_0= 'composes'
                            {
                            lv_isComposite_2_0=(Token)match(input,30,FOLLOW_25); 

                            						newLeafNode(lv_isComposite_2_0, grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypedFeatureDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "isComposite", true, "composes");
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1489:4: ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==31) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAlf.g:1490:5: ( ( ruleQualifiedName ) )
                            {
                            // InternalAlf.g:1490:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:1491:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:1491:6: ( ruleQualifiedName )
                            // InternalAlf.g:1492:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedFeatureDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_2_0_0());
                            						
                            pushFollow(FOLLOW_26);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1507:5: otherlv_4= 'any'
                            {
                            otherlv_4=(Token)match(input,31,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getTypedFeatureDefinitionAccess().getAnyKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1512:4: ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==18||(LA36_0>=36 && LA36_0<=37)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAlf.g:1513:5: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                            {
                            // InternalAlf.g:1513:5: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                            // InternalAlf.g:1514:6: lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset
                            {

                            						newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_ownedMembership_5_0=ruleOwnedRedefinitionOrSubset();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                            						}
                            						add(
                            							current,
                            							"ownedMembership",
                            							lv_ownedMembership_5_0,
                            							"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAlf.g:1532:3: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:1533:4: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAlf.g:1537:4: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_NATURAL_VALUE) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==33) ) {
                            alt38=1;
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAlf.g:1538:5: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                            {
                            // InternalAlf.g:1538:5: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:1539:6: (lv_lower_7_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1539:6: (lv_lower_7_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:1540:7: lv_lower_7_0= ruleNaturalLiteralExpression
                            {

                            							newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_29);
                            lv_lower_7_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"lower",
                            								lv_lower_7_0,
                            								"org.omg.sysml.Alf.NaturalLiteralExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_8=(Token)match(input,33,FOLLOW_28); 

                            					newLeafNode(otherlv_8, grammarAccess.getTypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1562:4: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:1563:5: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1563:5: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1564:6: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_upper_9_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_9_0,
                    							"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,34,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalAlf.g:1586:3: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:1587:4: otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getTypedFeatureDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalAlf.g:1591:4: ( (lv_value_12_0= ruleExpression ) )
                    // InternalAlf.g:1592:5: (lv_value_12_0= ruleExpression )
                    {
                    // InternalAlf.g:1592:5: (lv_value_12_0= ruleExpression )
                    // InternalAlf.g:1593:6: lv_value_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_value_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlf.g:1611:3: (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==19) ) {
                alt42=1;
            }
            else if ( (LA42_0==16) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:1612:4: otherlv_13= ';'
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getTypedFeatureDefinitionAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1617:4: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                    {
                    // InternalAlf.g:1617:4: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                    // InternalAlf.g:1618:5: otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}'
                    {
                    otherlv_14=(Token)match(input,16,FOLLOW_15); 

                    					newLeafNode(otherlv_14, grammarAccess.getTypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalAlf.g:1622:5: ( (lv_ownedMembership_15_0= ruleClassMember ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_UNRESTRICTED_NAME)||LA41_0==15||(LA41_0>=20 && LA41_0<=23)||(LA41_0>=26 && LA41_0<=28)||(LA41_0>=51 && LA41_0<=57)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalAlf.g:1623:6: (lv_ownedMembership_15_0= ruleClassMember )
                    	    {
                    	    // InternalAlf.g:1623:6: (lv_ownedMembership_15_0= ruleClassMember )
                    	    // InternalAlf.g:1624:7: lv_ownedMembership_15_0= ruleClassMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_ownedMembership_15_0=ruleClassMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_15_0,
                    	    								"org.omg.sysml.Alf.ClassMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_16, grammarAccess.getTypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedFeatureDefinition"


    // $ANTLR start "entryRuleUntypedFeatureDefinition"
    // InternalAlf.g:1651:1: entryRuleUntypedFeatureDefinition returns [EObject current=null] : iv_ruleUntypedFeatureDefinition= ruleUntypedFeatureDefinition EOF ;
    public final EObject entryRuleUntypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntypedFeatureDefinition = null;


        try {
            // InternalAlf.g:1651:65: (iv_ruleUntypedFeatureDefinition= ruleUntypedFeatureDefinition EOF )
            // InternalAlf.g:1652:2: iv_ruleUntypedFeatureDefinition= ruleUntypedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getUntypedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUntypedFeatureDefinition=ruleUntypedFeatureDefinition();

            state._fsp--;

             current =iv_ruleUntypedFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUntypedFeatureDefinition"


    // $ANTLR start "ruleUntypedFeatureDefinition"
    // InternalAlf.g:1658:1: ruleUntypedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) ) ;
    public final EObject ruleUntypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_lower_3_0 = null;

        EObject lv_upper_5_0 = null;

        EObject lv_value_8_0 = null;

        EObject lv_ownedMembership_11_0 = null;

        EObject lv_ownedMembership_14_0 = null;

        EObject lv_lower_17_0 = null;

        EObject lv_upper_19_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1664:2: ( ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) ) )
            // InternalAlf.g:1665:2: ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) )
            {
            // InternalAlf.g:1665:2: ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) )
            // InternalAlf.g:1666:3: ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) )
            {
            // InternalAlf.g:1666:3: ( (lv_name_0_0= ruleName ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:1667:4: (lv_name_0_0= ruleName )
                    {
                    // InternalAlf.g:1667:4: (lv_name_0_0= ruleName )
                    // InternalAlf.g:1668:5: lv_name_0_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_name_0_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.omg.sysml.Alf.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:1685:3: ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:1686:4: (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:1686:4: (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:1687:5: lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset
            {

            					newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_ownedMembership_1_0=ruleOwnedRedefinitionOrSubset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_1_0,
            						"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1704:3: ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==32) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_NATURAL_VALUE) ) {
                    int LA51_3 = input.LA(3);

                    if ( (LA51_3==33) ) {
                        int LA51_5 = input.LA(4);

                        if ( (LA51_5==RULE_NATURAL_VALUE) ) {
                            int LA51_7 = input.LA(5);

                            if ( (LA51_7==34) ) {
                                int LA51_6 = input.LA(6);

                                if ( (LA51_6==19) ) {
                                    alt51=2;
                                }
                                else if ( (LA51_6==16||LA51_6==35) ) {
                                    alt51=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 51, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA51_5==42) ) {
                            int LA51_4 = input.LA(5);

                            if ( (LA51_4==34) ) {
                                int LA51_6 = input.LA(6);

                                if ( (LA51_6==19) ) {
                                    alt51=2;
                                }
                                else if ( (LA51_6==16||LA51_6==35) ) {
                                    alt51=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 51, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA51_3==34) ) {
                        int LA51_6 = input.LA(4);

                        if ( (LA51_6==19) ) {
                            alt51=2;
                        }
                        else if ( (LA51_6==16||LA51_6==35) ) {
                            alt51=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA51_1==42) ) {
                    int LA51_4 = input.LA(3);

                    if ( (LA51_4==34) ) {
                        int LA51_6 = input.LA(4);

                        if ( (LA51_6==19) ) {
                            alt51=2;
                        }
                        else if ( (LA51_6==16||LA51_6==35) ) {
                            alt51=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==16||LA51_0==35) ) {
                alt51=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:1705:4: ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) )
                    {
                    // InternalAlf.g:1705:4: ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) ) )
                    // InternalAlf.g:1706:5: (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) )
                    {
                    // InternalAlf.g:1706:5: (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==32) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAlf.g:1707:6: otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']'
                            {
                            otherlv_2=(Token)match(input,32,FOLLOW_28); 

                            						newLeafNode(otherlv_2, grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1711:6: ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==RULE_NATURAL_VALUE) ) {
                                int LA44_1 = input.LA(2);

                                if ( (LA44_1==33) ) {
                                    alt44=1;
                                }
                            }
                            switch (alt44) {
                                case 1 :
                                    // InternalAlf.g:1712:7: ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..'
                                    {
                                    // InternalAlf.g:1712:7: ( (lv_lower_3_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:1713:8: (lv_lower_3_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:1713:8: (lv_lower_3_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:1714:9: lv_lower_3_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_0_0_1_0_0());
                                    								
                                    pushFollow(FOLLOW_29);
                                    lv_lower_3_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_3_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_4=(Token)match(input,33,FOLLOW_28); 

                                    							newLeafNode(otherlv_4, grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_0_0_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:1736:6: ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:1737:7: (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1737:7: (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:1738:8: lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0_0_2_0());
                            							
                            pushFollow(FOLLOW_30);
                            lv_upper_5_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_5_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_6=(Token)match(input,34,FOLLOW_35); 

                            						newLeafNode(otherlv_6, grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_0_0_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1760:5: ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==35) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==16) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalAlf.g:1761:6: (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) )
                            {
                            // InternalAlf.g:1761:6: (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) )
                            // InternalAlf.g:1762:7: otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) )
                            {
                            otherlv_7=(Token)match(input,35,FOLLOW_32); 

                            							newLeafNode(otherlv_7, grammarAccess.getUntypedFeatureDefinitionAccess().getEqualsSignKeyword_2_0_1_0_0());
                            						
                            // InternalAlf.g:1766:7: ( (lv_value_8_0= ruleExpression ) )
                            // InternalAlf.g:1767:8: (lv_value_8_0= ruleExpression )
                            {
                            // InternalAlf.g:1767:8: (lv_value_8_0= ruleExpression )
                            // InternalAlf.g:1768:9: lv_value_8_0= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_0_1_0_1_0());
                            								
                            pushFollow(FOLLOW_33);
                            lv_value_8_0=ruleExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"value",
                            										lv_value_8_0,
                            										"org.omg.sysml.Alf.Expression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalAlf.g:1785:7: (otherlv_9= ';' | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==19) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==16) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // InternalAlf.g:1786:8: otherlv_9= ';'
                                    {
                                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

                                    								newLeafNode(otherlv_9, grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_0_1_0_2_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1791:8: (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' )
                                    {
                                    // InternalAlf.g:1791:8: (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' )
                                    // InternalAlf.g:1792:9: otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}'
                                    {
                                    otherlv_10=(Token)match(input,16,FOLLOW_15); 

                                    									newLeafNode(otherlv_10, grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_0_2_1_0());
                                    								
                                    // InternalAlf.g:1796:9: ( (lv_ownedMembership_11_0= ruleClassMember ) )*
                                    loop46:
                                    do {
                                        int alt46=2;
                                        int LA46_0 = input.LA(1);

                                        if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)||LA46_0==15||(LA46_0>=20 && LA46_0<=23)||(LA46_0>=26 && LA46_0<=28)||(LA46_0>=51 && LA46_0<=57)) ) {
                                            alt46=1;
                                        }


                                        switch (alt46) {
                                    	case 1 :
                                    	    // InternalAlf.g:1797:10: (lv_ownedMembership_11_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:1797:10: (lv_ownedMembership_11_0= ruleClassMember )
                                    	    // InternalAlf.g:1798:11: lv_ownedMembership_11_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0_1_0_2_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_15);
                                    	    lv_ownedMembership_11_0=ruleClassMember();

                                    	    state._fsp--;


                                    	    											if (current==null) {
                                    	    												current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                                    	    											}
                                    	    											add(
                                    	    												current,
                                    	    												"ownedMembership",
                                    	    												lv_ownedMembership_11_0,
                                    	    												"org.omg.sysml.Alf.ClassMember");
                                    	    											afterParserOrEnumRuleCall();
                                    	    										

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop46;
                                        }
                                    } while (true);

                                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                                    									newLeafNode(otherlv_12, grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_0_2_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1823:6: (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' )
                            {
                            // InternalAlf.g:1823:6: (otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}' )
                            // InternalAlf.g:1824:7: otherlv_13= '{' ( (lv_ownedMembership_14_0= ruleClassMember ) )* otherlv_15= '}'
                            {
                            otherlv_13=(Token)match(input,16,FOLLOW_15); 

                            							newLeafNode(otherlv_13, grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_1_0());
                            						
                            // InternalAlf.g:1828:7: ( (lv_ownedMembership_14_0= ruleClassMember ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_UNRESTRICTED_NAME)||LA48_0==15||(LA48_0>=20 && LA48_0<=23)||(LA48_0>=26 && LA48_0<=28)||(LA48_0>=51 && LA48_0<=57)) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalAlf.g:1829:8: (lv_ownedMembership_14_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:1829:8: (lv_ownedMembership_14_0= ruleClassMember )
                            	    // InternalAlf.g:1830:9: lv_ownedMembership_14_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_15);
                            	    lv_ownedMembership_14_0=ruleClassMember();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedMembership",
                            	    										lv_ownedMembership_14_0,
                            	    										"org.omg.sysml.Alf.ClassMember");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(otherlv_15, grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1855:4: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' )
                    {
                    // InternalAlf.g:1855:4: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' )
                    // InternalAlf.g:1856:5: otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';'
                    {
                    otherlv_16=(Token)match(input,32,FOLLOW_28); 

                    					newLeafNode(otherlv_16, grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalAlf.g:1860:5: ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_NATURAL_VALUE) ) {
                        int LA50_1 = input.LA(2);

                        if ( (LA50_1==33) ) {
                            alt50=1;
                        }
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAlf.g:1861:6: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..'
                            {
                            // InternalAlf.g:1861:6: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:1862:7: (lv_lower_17_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1862:7: (lv_lower_17_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:1863:8: lv_lower_17_0= ruleNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_1_0_0());
                            							
                            pushFollow(FOLLOW_29);
                            lv_lower_17_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"lower",
                            									lv_lower_17_0,
                            									"org.omg.sysml.Alf.NaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_18=(Token)match(input,33,FOLLOW_28); 

                            						newLeafNode(otherlv_18, grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1_1());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1885:5: ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:1886:6: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1886:6: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1887:7: lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    							newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_30);
                    lv_upper_19_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"upper",
                    								lv_upper_19_0,
                    								"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_20=(Token)match(input,34,FOLLOW_9); 

                    					newLeafNode(otherlv_20, grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_3());
                    				
                    otherlv_21=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_21, grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_1_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUntypedFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:1918:1: entryRuleOwnedRedefinitionOrSubset returns [EObject current=null] : iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF ;
    public final EObject entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedRedefinitionOrSubset = null;


        try {
            // InternalAlf.g:1918:66: (iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:1919:2: iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF
            {
             newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedRedefinitionOrSubset=ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             current =iv_ruleOwnedRedefinitionOrSubset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedRedefinitionOrSubset"


    // $ANTLR start "ruleOwnedRedefinitionOrSubset"
    // InternalAlf.g:1925:1: ruleOwnedRedefinitionOrSubset returns [EObject current=null] : ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) ;
    public final EObject ruleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1931:2: ( ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) )
            // InternalAlf.g:1932:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            {
            // InternalAlf.g:1932:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18||LA53_0==36) ) {
                alt53=1;
            }
            else if ( (LA53_0==37) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:1933:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    {
                    // InternalAlf.g:1933:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    // InternalAlf.g:1934:4: (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    {
                    // InternalAlf.g:1934:4: (otherlv_0= 'is' | otherlv_1= 'redefines' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==18) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==36) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalAlf.g:1935:5: otherlv_0= 'is'
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_0, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1940:5: otherlv_1= 'redefines'
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1945:4: ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    // InternalAlf.g:1946:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    {
                    // InternalAlf.g:1946:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    // InternalAlf.g:1947:6: lv_ownedMemberElement_2_0= ruleRedefinition
                    {

                    						newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementRedefinitionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleRedefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOwnedRedefinitionOrSubsetRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_2_0,
                    							"org.omg.sysml.Alf.Redefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1966:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    {
                    // InternalAlf.g:1966:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    // InternalAlf.g:1967:4: otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0());
                    			
                    // InternalAlf.g:1971:4: ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    // InternalAlf.g:1972:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    {
                    // InternalAlf.g:1972:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    // InternalAlf.g:1973:6: lv_ownedMemberElement_4_0= ruleSubset
                    {

                    						newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementSubsetParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleSubset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOwnedRedefinitionOrSubsetRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_4_0,
                    							"org.omg.sysml.Alf.Subset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwnedRedefinitionOrSubset"


    // $ANTLR start "entryRuleRedefinition"
    // InternalAlf.g:1995:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:1995:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:1996:2: iv_ruleRedefinition= ruleRedefinition EOF
            {
             newCompositeNode(grammarAccess.getRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedefinition=ruleRedefinition();

            state._fsp--;

             current =iv_ruleRedefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRedefinition"


    // $ANTLR start "ruleRedefinition"
    // InternalAlf.g:2002:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2008:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2009:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2009:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2010:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2010:3: ( ruleQualifiedName )
            // InternalAlf.g:2011:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRedefinitionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedefinition"


    // $ANTLR start "entryRuleSubset"
    // InternalAlf.g:2028:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:2028:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:2029:2: iv_ruleSubset= ruleSubset EOF
            {
             newCompositeNode(grammarAccess.getSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubset=ruleSubset();

            state._fsp--;

             current =iv_ruleSubset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubset"


    // $ANTLR start "ruleSubset"
    // InternalAlf.g:2035:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2041:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2042:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2042:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2043:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2043:3: ( ruleQualifiedName )
            // InternalAlf.g:2044:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSubsetRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubset"


    // $ANTLR start "entryRuleConnectorDefinition"
    // InternalAlf.g:2061:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:2061:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:2062:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
            {
             newCompositeNode(grammarAccess.getConnectorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorDefinition=ruleConnectorDefinition();

            state._fsp--;

             current =iv_ruleConnectorDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectorDefinition"


    // $ANTLR start "ruleConnectorDefinition"
    // InternalAlf.g:2068:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2074:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:2075:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:2075:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:2076:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:2076:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt56=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1==18||LA56_1==29) ) {
                        alt56=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA56_2 = input.LA(2);

                    if ( (LA56_2==18||LA56_2==29) ) {
                        alt56=1;
                    }
                    }
                    break;
                case 18:
                case 29:
                    {
                    alt56=1;
                    }
                    break;
            }

            switch (alt56) {
                case 1 :
                    // InternalAlf.g:2077:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:2077:4: ( (lv_name_0_0= ruleName ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAlf.g:2078:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:2078:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:2079:6: lv_name_0_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_36);
                            lv_name_0_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                            						}
                            						set(
                            							current,
                            							"name",
                            							lv_name_0_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2096:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==29) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalAlf.g:2097:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:2101:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2102:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2102:6: ( ruleQualifiedName )
                            // InternalAlf.g:2103:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalAlf.g:2123:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2124:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2124:4: ( ruleQualifiedName )
            // InternalAlf.g:2125:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_37);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:2143:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2144:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2144:4: ( ruleQualifiedName )
            // InternalAlf.g:2145:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:2167:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:2167:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:2168:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAlf.g:2174:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2180:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:2181:2: this_BinaryExpression_0= ruleBinaryExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;


            		current = this_BinaryExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalAlf.g:2192:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:2192:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:2193:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalAlf.g:2199:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2205:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:2206:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:2206:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:2207:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2215:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=39 && LA58_0<=44)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:2216:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:2216:4: ()
                    // InternalAlf.g:2217:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:2223:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=40 && LA57_0<=44)) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==39) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalAlf.g:2224:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:2224:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:2225:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:2225:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:2226:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:2226:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:2227:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_32);
                            lv_operator_2_0=ruleBinaryOperator();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								set(
                            									current,
                            									"operator",
                            									lv_operator_2_0,
                            									"org.omg.sysml.Alf.BinaryOperator");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalAlf.g:2244:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:2245:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:2245:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:2246:8: lv_operand_3_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_0_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_operand_3_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								add(
                            									current,
                            									"operand",
                            									lv_operand_3_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2265:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:2265:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:2266:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:2266:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:2267:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:2267:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:2268:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,39,FOLLOW_39); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,32,FOLLOW_32); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:2284:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:2285:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:2285:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:2286:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_30);
                            lv_operand_6_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								add(
                            									current,
                            									"operand",
                            									lv_operand_6_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_7=(Token)match(input,34,FOLLOW_2); 

                            						newLeafNode(otherlv_7, grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_1_1_1_3());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleBinaryOperator"
    // InternalAlf.g:2314:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:2314:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:2315:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperator=ruleBinaryOperator();

            state._fsp--;

             current =iv_ruleBinaryOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // InternalAlf.g:2321:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:2327:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:2328:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:2328:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt59=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt59=1;
                }
                break;
            case 41:
                {
                alt59=2;
                }
                break;
            case 42:
                {
                alt59=3;
                }
                break;
            case 43:
                {
                alt59=4;
                }
                break;
            case 44:
                {
                alt59=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalAlf.g:2329:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2335:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:2341:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:2347:3: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:2353:3: kw= '^'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalAlf.g:2362:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:2362:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:2363:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalAlf.g:2369:1: ruleUnaryExpression returns [EObject current=null] : (this_AccessExpression_0= ruleAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2375:2: ( (this_AccessExpression_0= ruleAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleAccessExpression ) ) ) ) )
            // InternalAlf.g:2376:2: (this_AccessExpression_0= ruleAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleAccessExpression ) ) ) )
            {
            // InternalAlf.g:2376:2: (this_AccessExpression_0= ruleAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleAccessExpression ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_BOOLEAN_VALUE && LA60_0<=RULE_UNRESTRICTED_NAME)||LA60_0==16||LA60_0==42||LA60_0==45||(LA60_0>=47 && LA60_0<=48)) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=40 && LA60_0<=41)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:2377:3: this_AccessExpression_0= ruleAccessExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getAccessExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessExpression_0=ruleAccessExpression();

                    state._fsp--;


                    			current = this_AccessExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2386:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleAccessExpression ) ) )
                    {
                    // InternalAlf.g:2386:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleAccessExpression ) ) )
                    // InternalAlf.g:2387:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleAccessExpression ) )
                    {
                    // InternalAlf.g:2387:4: ()
                    // InternalAlf.g:2388:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:2394:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:2395:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:2395:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:2396:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_operator_2_0=ruleUnaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"org.omg.sysml.Alf.UnaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2413:4: ( (lv_operand_3_0= ruleAccessExpression ) )
                    // InternalAlf.g:2414:5: (lv_operand_3_0= ruleAccessExpression )
                    {
                    // InternalAlf.g:2414:5: (lv_operand_3_0= ruleAccessExpression )
                    // InternalAlf.g:2415:6: lv_operand_3_0= ruleAccessExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandAccessExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleAccessExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.sysml.Alf.AccessExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalAlf.g:2437:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:2437:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:2438:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperator=ruleUnaryOperator();

            state._fsp--;

             current =iv_ruleUnaryOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalAlf.g:2444:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:2450:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:2451:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:2451:2: (kw= '+' | kw= '-' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==40) ) {
                alt61=1;
            }
            else if ( (LA61_0==41) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:2452:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2458:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRuleAccessExpression"
    // InternalAlf.g:2467:1: entryRuleAccessExpression returns [EObject current=null] : iv_ruleAccessExpression= ruleAccessExpression EOF ;
    public final EObject entryRuleAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExpression = null;


        try {
            // InternalAlf.g:2467:57: (iv_ruleAccessExpression= ruleAccessExpression EOF )
            // InternalAlf.g:2468:2: iv_ruleAccessExpression= ruleAccessExpression EOF
            {
             newCompositeNode(grammarAccess.getAccessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessExpression=ruleAccessExpression();

            state._fsp--;

             current =iv_ruleAccessExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessExpression"


    // $ANTLR start "ruleAccessExpression"
    // InternalAlf.g:2474:1: ruleAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2480:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:2481:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:2481:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:2482:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2490:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==32) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalAlf.g:2491:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:2491:4: ()
            	    // InternalAlf.g:2492:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:2502:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:2503:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:2503:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:2504:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_index_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAccessExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"index",
            	    							lv_index_3_0,
            	    							"org.omg.sysml.Alf.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,34,FOLLOW_41); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:2530:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:2530:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:2531:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalAlf.g:2537:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_LiteralExpression_0 = null;

        EObject this_ElementReferenceExpression_1 = null;

        EObject this_InstanceCreationExpression_2 = null;

        EObject this_SequenceConstructionExpression_3 = null;

        EObject this_Expression_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:2543:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:2544:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:2544:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt63=5;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:2545:3: this_LiteralExpression_0= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2554:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElementReferenceExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementReferenceExpression_1=ruleElementReferenceExpression();

                    state._fsp--;


                    			current = this_ElementReferenceExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:2563:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstanceCreationExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceCreationExpression_2=ruleInstanceCreationExpression();

                    state._fsp--;


                    			current = this_InstanceCreationExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:2572:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceConstructionExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceConstructionExpression_3=ruleSequenceConstructionExpression();

                    state._fsp--;


                    			current = this_SequenceConstructionExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:2581:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:2581:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:2582:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_42);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // InternalAlf.g:2603:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:2603:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:2604:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;

             current =iv_ruleElementReferenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementReferenceExpression"


    // $ANTLR start "ruleElementReferenceExpression"
    // InternalAlf.g:2610:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2616:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2617:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2617:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2618:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2618:3: ( ruleQualifiedName )
            // InternalAlf.g:2619:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementReferenceExpression"


    // $ANTLR start "entryRuleInstanceCreationExpression"
    // InternalAlf.g:2636:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:2636:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:2637:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
            {
             newCompositeNode(grammarAccess.getInstanceCreationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceCreationExpression=ruleInstanceCreationExpression();

            state._fsp--;

             current =iv_ruleInstanceCreationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceCreationExpression"


    // $ANTLR start "ruleInstanceCreationExpression"
    // InternalAlf.g:2643:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2649:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:2650:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:2650:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:2651:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:2651:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2652:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2652:4: ( ruleQualifiedName )
            // InternalAlf.g:2653:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_43);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:2671:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_BOOLEAN_VALUE && LA65_0<=RULE_UNRESTRICTED_NAME)||LA65_0==16||(LA65_0>=40 && LA65_0<=42)||LA65_0==45||(LA65_0>=47 && LA65_0<=48)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:2672:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:2672:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:2673:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:2673:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:2674:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_argument_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"argument",
                    							lv_argument_2_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2691:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==25) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalAlf.g:2692:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:2696:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:2697:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:2697:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:2698:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_45);
                    	    lv_argument_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"argument",
                    	    								lv_argument_4_0,
                    	    								"org.omg.sysml.Alf.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceCreationExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceCreationExpression"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalAlf.g:2725:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:2725:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:2726:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceConstructionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceConstructionExpression=ruleSequenceConstructionExpression();

            state._fsp--;

             current =iv_ruleSequenceConstructionExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceConstructionExpression"


    // $ANTLR start "ruleSequenceConstructionExpression"
    // InternalAlf.g:2732:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2738:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:2739:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:2739:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:2740:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:2740:3: ()
            // InternalAlf.g:2741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:2751:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_BOOLEAN_VALUE && LA67_0<=RULE_UNRESTRICTED_NAME)||LA67_0==16||(LA67_0>=40 && LA67_0<=42)||LA67_0==45||(LA67_0>=47 && LA67_0<=48)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:2752:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:2752:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:2753:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:2753:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:2754:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_element_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    						}
                    						add(
                    							current,
                    							"element",
                    							lv_element_2_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2771:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==25) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAlf.g:2772:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:2776:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:2777:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:2777:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:2778:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_element_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"element",
                    	    								lv_element_4_0,
                    	    								"org.omg.sysml.Alf.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceConstructionExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAlf.g:2805:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:2805:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:2806:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalAlf.g:2812:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:2818:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:2819:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:2819:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt68=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt68=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt68=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt68=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA68_4 = input.LA(2);

                if ( (LA68_4==48) ) {
                    alt68=4;
                }
                else if ( (LA68_4==EOF||(LA68_4>=16 && LA68_4<=17)||LA68_4==19||LA68_4==25||LA68_4==32||LA68_4==34||(LA68_4>=39 && LA68_4<=44)||LA68_4==46) ) {
                    alt68=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 4, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt68=4;
                }
                break;
            case 42:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalAlf.g:2820:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNullLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpression_0=ruleNullLiteralExpression();

                    state._fsp--;


                    			current = this_NullLiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2829:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpression_1=ruleBooleanLiteralExpression();

                    state._fsp--;


                    			current = this_BooleanLiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:2838:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpression_2=ruleStringLiteralExpression();

                    state._fsp--;


                    			current = this_StringLiteralExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:2847:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRealLiteralExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteralExpression_3=ruleRealLiteralExpression();

                    state._fsp--;


                    			current = this_RealLiteralExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:2856:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getUnlimitedNaturalLiteralExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpression_4=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    			current = this_UnlimitedNaturalLiteralExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNullLiteralExpression"
    // InternalAlf.g:2868:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:2868:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:2869:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpression=ruleNullLiteralExpression();

            state._fsp--;

             current =iv_ruleNullLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteralExpression"


    // $ANTLR start "ruleNullLiteralExpression"
    // InternalAlf.g:2875:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:2881:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:2882:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:2882:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:2883:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:2883:3: ()
            // InternalAlf.g:2884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpressionAccess().getNullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExpression"


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // InternalAlf.g:2898:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:2898:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:2899:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();

            state._fsp--;

             current =iv_ruleBooleanLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpression"


    // $ANTLR start "ruleBooleanLiteralExpression"
    // InternalAlf.g:2905:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2911:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:2912:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:2912:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:2913:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:2913:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:2914:4: lv_value_0_0= RULE_BOOLEAN_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralExpressionAccess().getValueBOOLEAN_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.BOOLEAN_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpression"


    // $ANTLR start "entryRuleStringLiteralExpression"
    // InternalAlf.g:2933:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:2933:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:2934:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpression=ruleStringLiteralExpression();

            state._fsp--;

             current =iv_ruleStringLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExpression"


    // $ANTLR start "ruleStringLiteralExpression"
    // InternalAlf.g:2940:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2946:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:2947:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:2947:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:2948:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:2948:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:2949:4: lv_value_0_0= RULE_STRING_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralExpressionAccess().getValueSTRING_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.STRING_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExpression"


    // $ANTLR start "entryRuleRealLiteralExpression"
    // InternalAlf.g:2968:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:2968:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:2969:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteralExpression=ruleRealLiteralExpression();

            state._fsp--;

             current =iv_ruleRealLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteralExpression"


    // $ANTLR start "ruleRealLiteralExpression"
    // InternalAlf.g:2975:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2981:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:2982:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:2982:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:2983:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:2983:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:2984:4: lv_value_0_0= ruleRealValue
            {

            				newCompositeNode(grammarAccess.getRealLiteralExpressionAccess().getValueRealValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleRealValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.RealValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteralExpression"


    // $ANTLR start "entryRuleRealValue"
    // InternalAlf.g:3004:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:3004:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:3005:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalAlf.g:3011:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:3017:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:3018:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:3018:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:3019:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:3019:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_NATURAL_VALUE) ) {
                alt70=1;
            }
            else if ( (LA70_0==48) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:3020:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:3020:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:3021:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_48); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,48,FOLLOW_49); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:3033:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_NATURAL_VALUE) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalAlf.g:3034:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_50); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3044:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:3044:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:3045:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,48,FOLLOW_51); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_50); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3059:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=49 && LA73_0<=50)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAlf.g:3060:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:3060:4: (kw= 'e' | kw= 'E' )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==49) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==50) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalAlf.g:3061:5: kw= 'e'
                            {
                            kw=(Token)match(input,49,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3067:5: kw= 'E'
                            {
                            kw=(Token)match(input,50,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:3073:4: (kw= '+' | kw= '-' )?
                    int alt72=3;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==40) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==41) ) {
                        alt72=2;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalAlf.g:3074:5: kw= '+'
                            {
                            kw=(Token)match(input,40,FOLLOW_51); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3080:5: kw= '-'
                            {
                            kw=(Token)match(input,41,FOLLOW_51); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    this_NATURAL_VALUE_9=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                    				current.merge(this_NATURAL_VALUE_9);
                    			

                    				newLeafNode(this_NATURAL_VALUE_9, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleNaturalLiteralExpression"
    // InternalAlf.g:3098:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:3098:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:3099:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNaturalLiteralExpression=ruleNaturalLiteralExpression();

            state._fsp--;

             current =iv_ruleNaturalLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNaturalLiteralExpression"


    // $ANTLR start "ruleNaturalLiteralExpression"
    // InternalAlf.g:3105:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3111:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:3112:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:3112:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:3113:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:3113:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:3114:4: lv_value_0_0= RULE_NATURAL_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNaturalLiteralExpressionAccess().getValueNATURAL_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNaturalLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.NATURAL_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNaturalLiteralExpression"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:3133:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:3133:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:3134:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpression=ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             current =iv_ruleUnlimitedNaturalLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:3140:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3146:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:3147:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:3147:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_NATURAL_VALUE) ) {
                alt74=1;
            }
            else if ( (LA74_0==42) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlf.g:3148:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getNaturalLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NaturalLiteralExpression_0=ruleNaturalLiteralExpression();

                    state._fsp--;


                    			current = this_NaturalLiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3157:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:3157:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:3158:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:3158:4: ()
                    // InternalAlf.g:3159:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:3174:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:3174:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:3175:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalAlf.g:3181:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:3187:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:3188:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:3188:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_UNRESTRICTED_NAME) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalAlf.g:3189:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3197:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
                    {
                    this_UNRESTRICTED_NAME_1=(Token)match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); 

                    			current.merge(this_UNRESTRICTED_NAME_1);
                    		

                    			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlf.g:3208:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:3208:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:3209:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAlf.g:3215:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3221:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:3222:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:3222:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:3223:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3233:3: (kw= '.' this_Name_2= ruleName )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==48) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalAlf.g:3234:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,48,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_53);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:3254:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:3260:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:3261:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:3261:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt77=1;
                }
                break;
            case 52:
                {
                alt77=2;
                }
                break;
            case 53:
                {
                alt77=3;
                }
                break;
            case 54:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalAlf.g:3262:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:3262:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:3263:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3270:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:3270:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:3271:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:3278:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:3278:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:3279:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:3286:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:3286:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:3287:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityIndicator"


    // $ANTLR start "ruleFeatureDirection"
    // InternalAlf.g:3297:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:3303:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:3304:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:3304:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt78=1;
                }
                break;
            case 56:
                {
                alt78=2;
                }
                break;
            case 57:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalAlf.g:3305:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:3305:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:3306:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3313:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:3313:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:3314:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:3321:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:3321:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:3322:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureDirection"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\17\1\7\1\uffff\2\7\2\20\1\uffff\4\20\2\7\4\20\2\7\4\20";
    static final String dfa_3s = "\1\27\1\22\1\uffff\4\22\1\uffff\4\30\2\10\4\60\2\10\4\60";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\20\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\3\1\4\1\uffff\1\2",
            "\1\5\1\6\11\uffff\1\7",
            "",
            "\1\10\1\11\11\uffff\1\7",
            "\1\12\1\13\11\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "",
            "\1\2\1\uffff\1\14\5\uffff\1\2",
            "\1\2\1\uffff\1\14\5\uffff\1\2",
            "\1\2\1\uffff\1\15\5\uffff\1\2",
            "\1\2\1\uffff\1\15\5\uffff\1\2",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\23",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\26\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "265:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\2\7\4\20\1\7\3\uffff\2\20\1\7\2\20";
    static final String dfa_9s = "\1\26\1\45\2\43\2\45\1\10\3\uffff\2\60\1\10\2\60";
    static final String dfa_10s = "\7\uffff\1\2\1\1\1\3\5\uffff";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\15\uffff\1\1",
            "\1\4\1\5\11\uffff\1\6\21\uffff\2\7",
            "\1\10\1\uffff\1\11\1\10\11\uffff\1\10\2\uffff\1\10\2\uffff\1\10",
            "\1\10\1\uffff\1\11\1\10\11\uffff\1\10\2\uffff\1\10\2\uffff\1\10",
            "\1\10\1\uffff\1\6\1\10\11\uffff\1\10\2\uffff\1\10\2\uffff\1\10\2\7",
            "\1\10\1\uffff\1\6\1\10\11\uffff\1\10\2\uffff\1\10\2\uffff\1\10\2\7",
            "\1\12\1\13",
            "",
            "",
            "",
            "\1\7\2\uffff\1\11\14\uffff\1\7\2\uffff\1\7\14\uffff\1\14",
            "\1\7\2\uffff\1\11\14\uffff\1\7\2\uffff\1\7\14\uffff\1\14",
            "\1\15\1\16",
            "\1\7\2\uffff\1\11\14\uffff\1\7\2\uffff\1\7\14\uffff\1\14",
            "\1\7\2\uffff\1\11\14\uffff\1\7\2\uffff\1\7\14\uffff\1\14"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "413:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )";
        }
    }
    static final String dfa_13s = "\27\uffff";
    static final String dfa_14s = "\4\7\1\uffff\2\20\1\uffff\3\7\2\20\1\7\1\uffff\2\20\1\uffff\2\20\1\7\2\20";
    static final String dfa_15s = "\4\71\1\uffff\2\43\1\uffff\5\45\1\10\1\uffff\2\45\1\uffff\2\60\1\10\2\60";
    static final String dfa_16s = "\4\uffff\1\1\2\uffff\1\3\6\uffff\1\2\2\uffff\1\4\5\uffff";
    static final String dfa_17s = "\27\uffff}>";
    static final String[] dfa_18s = {
            "\1\5\1\6\15\uffff\1\1\3\uffff\1\2\1\3\1\7\32\uffff\3\4",
            "\1\13\1\14\11\uffff\1\15\21\uffff\2\16\21\uffff\1\10\1\11\1\12",
            "\1\13\1\14\11\uffff\1\15\21\uffff\2\16\21\uffff\1\10\1\11\1\12",
            "\1\17\1\20\11\uffff\1\16\21\uffff\2\16\21\uffff\1\10\1\11\1\12",
            "",
            "\1\4\1\uffff\1\21\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4",
            "\1\4\1\uffff\1\21\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4",
            "",
            "\1\17\1\20\11\uffff\1\16\21\uffff\2\16",
            "\1\17\1\20\11\uffff\1\16\21\uffff\2\16",
            "\1\17\1\20\11\uffff\1\16\21\uffff\2\16",
            "\1\4\1\uffff\1\15\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\16",
            "\1\4\1\uffff\1\15\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\16",
            "\1\22\1\23",
            "",
            "\1\4\1\uffff\1\16\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\16",
            "\1\4\1\uffff\1\16\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\16",
            "",
            "\1\16\2\uffff\1\21\14\uffff\1\16\2\uffff\1\16\14\uffff\1\24",
            "\1\16\2\uffff\1\21\14\uffff\1\16\2\uffff\1\16\14\uffff\1\24",
            "\1\25\1\26",
            "\1\16\2\uffff\1\21\14\uffff\1\16\2\uffff\1\16\14\uffff\1\24",
            "\1\16\2\uffff\1\21\14\uffff\1\16\2\uffff\1\16\14\uffff\1\24"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "949:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )";
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\2\uffff\2\10\5\uffff\2\10";
    static final String dfa_21s = "\1\4\1\uffff\2\20\2\uffff\1\7\2\uffff\2\20";
    static final String dfa_22s = "\1\60\1\uffff\2\60\2\uffff\1\10\2\uffff\2\60";
    static final String dfa_23s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_24s = "\13\uffff}>";
    static final String[] dfa_25s = {
            "\3\1\1\2\1\3\7\uffff\1\4\31\uffff\1\1\2\uffff\1\5\1\uffff\2\1",
            "",
            "\2\10\1\uffff\1\10\5\uffff\1\10\6\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\2\10\1\uffff\1\10\5\uffff\1\10\6\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\2\10\1\uffff\1\10\5\uffff\1\10\6\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\2\10\1\uffff\1\10\5\uffff\1\10\6\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2544:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0078000000F28180L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0078000000B08000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040180L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000003000040180L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x03F800001CF28180L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x038000001C400180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0380000000400180L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0380003000040180L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020040180L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0078000000F08180L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000920090000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000180L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000180L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000039000D0180L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000900090000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800090000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001A700000101F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000900010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001A400000101F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001E700000101F0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001A700000301F0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0006000000000042L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000030000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000002L});

}