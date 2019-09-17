package org.omg.kerml.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKerMLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_NATURAL_VALUE=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_UNRESTRICTED_NAME=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=11;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int RULE_BOOLEAN_VALUE=10;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int RULE_EXP_VALUE=4;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalKerMLLexer() {;} 
    public InternalKerMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKerMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKerML.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:11:7: ( '?' )
            // InternalKerML.g:11:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:12:7: ( '??' )
            // InternalKerML.g:12:9: '??'
            {
            match("??"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:13:7: ( '||' )
            // InternalKerML.g:13:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:14:7: ( '&&' )
            // InternalKerML.g:14:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:15:7: ( '|' )
            // InternalKerML.g:15:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:16:7: ( '^' )
            // InternalKerML.g:16:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:17:7: ( '&' )
            // InternalKerML.g:17:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:18:7: ( '::' )
            // InternalKerML.g:18:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:19:7: ( '.' )
            // InternalKerML.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:20:7: ( ';' )
            // InternalKerML.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:21:7: ( 'feature' )
            // InternalKerML.g:21:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:22:7: ( ':>' )
            // InternalKerML.g:22:9: ':>'
            {
            match(":>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:23:7: ( 'specializes' )
            // InternalKerML.g:23:9: 'specializes'
            {
            match("specializes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:24:7: ( ':>>' )
            // InternalKerML.g:24:9: ':>>'
            {
            match(":>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:25:7: ( 'redefines' )
            // InternalKerML.g:25:9: 'redefines'
            {
            match("redefines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26:7: ( 'any' )
            // InternalKerML.g:26:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:27:7: ( 'subsets' )
            // InternalKerML.g:27:9: 'subsets'
            {
            match("subsets"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:28:7: ( '==' )
            // InternalKerML.g:28:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:29:7: ( '!=' )
            // InternalKerML.g:29:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:30:7: ( 'instanceof' )
            // InternalKerML.g:30:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:31:7: ( 'hastype' )
            // InternalKerML.g:31:9: 'hastype'
            {
            match("hastype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:32:7: ( '<' )
            // InternalKerML.g:32:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:33:7: ( '>' )
            // InternalKerML.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:34:7: ( '<=' )
            // InternalKerML.g:34:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:35:7: ( '>=' )
            // InternalKerML.g:35:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:36:7: ( '+' )
            // InternalKerML.g:36:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:37:7: ( '-' )
            // InternalKerML.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:38:7: ( '*' )
            // InternalKerML.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:39:7: ( '/' )
            // InternalKerML.g:39:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:40:7: ( '**' )
            // InternalKerML.g:40:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:41:7: ( '!' )
            // InternalKerML.g:41:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:42:7: ( '~' )
            // InternalKerML.g:42:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:43:7: ( 'public' )
            // InternalKerML.g:43:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:44:7: ( 'private' )
            // InternalKerML.g:44:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:45:7: ( 'protected' )
            // InternalKerML.g:45:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:46:7: ( 'packaged' )
            // InternalKerML.g:46:9: 'packaged'
            {
            match("packaged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:47:7: ( 'in' )
            // InternalKerML.g:47:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:48:7: ( 'out' )
            // InternalKerML.g:48:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:49:7: ( 'inout' )
            // InternalKerML.g:49:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:50:7: ( 'comment' )
            // InternalKerML.g:50:9: 'comment'
            {
            match("comment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:51:7: ( 'on' )
            // InternalKerML.g:51:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:52:7: ( 'import' )
            // InternalKerML.g:52:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:53:7: ( 'as' )
            // InternalKerML.g:53:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:54:7: ( 'package' )
            // InternalKerML.g:54:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:55:7: ( '{' )
            // InternalKerML.g:55:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:56:7: ( '}' )
            // InternalKerML.g:56:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:57:7: ( 'is' )
            // InternalKerML.g:57:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:58:7: ( 'classifier' )
            // InternalKerML.g:58:9: 'classifier'
            {
            match("classifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:59:7: ( 'class' )
            // InternalKerML.g:59:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:60:7: ( 'datatype' )
            // InternalKerML.g:60:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:61:7: ( 'assoc' )
            // InternalKerML.g:61:9: 'assoc'
            {
            match("assoc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:62:7: ( 'behavior' )
            // InternalKerML.g:62:9: 'behavior'
            {
            match("behavior"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:63:7: ( 'function' )
            // InternalKerML.g:63:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:64:7: ( 'abstract' )
            // InternalKerML.g:64:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:65:7: ( 'step' )
            // InternalKerML.g:65:9: 'step'
            {
            match("step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:66:7: ( 'expr' )
            // InternalKerML.g:66:9: 'expr'
            {
            match("expr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:67:7: ( 'connector' )
            // InternalKerML.g:67:9: 'connector'
            {
            match("connector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:68:7: ( 'binding' )
            // InternalKerML.g:68:9: 'binding'
            {
            match("binding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:69:7: ( 'succession' )
            // InternalKerML.g:69:9: 'succession'
            {
            match("succession"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:70:7: ( 'stream' )
            // InternalKerML.g:70:9: 'stream'
            {
            match("stream"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:71:7: ( 'flow' )
            // InternalKerML.g:71:9: 'flow'
            {
            match("flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:72:7: ( 'end' )
            // InternalKerML.g:72:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:73:7: ( ',' )
            // InternalKerML.g:73:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:74:7: ( 'interaction' )
            // InternalKerML.g:74:9: 'interaction'
            {
            match("interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:75:7: ( '(' )
            // InternalKerML.g:75:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:76:7: ( ')' )
            // InternalKerML.g:76:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:77:7: ( '=' )
            // InternalKerML.g:77:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:78:7: ( ':' )
            // InternalKerML.g:78:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:79:7: ( '[' )
            // InternalKerML.g:79:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:80:7: ( ']' )
            // InternalKerML.g:80:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:81:7: ( '..' )
            // InternalKerML.g:81:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:82:7: ( 'to' )
            // InternalKerML.g:82:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:83:7: ( 'from' )
            // InternalKerML.g:83:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:84:7: ( '=>' )
            // InternalKerML.g:84:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:85:7: ( 'of' )
            // InternalKerML.g:85:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:86:7: ( 'then' )
            // InternalKerML.g:86:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:87:7: ( 'first' )
            // InternalKerML.g:87:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:88:7: ( '->' )
            // InternalKerML.g:88:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:89:7: ( 'null' )
            // InternalKerML.g:89:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:90:7: ( './' )
            // InternalKerML.g:90:9: './'
            {
            match("./"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:91:7: ( 'composite' )
            // InternalKerML.g:91:9: 'composite'
            {
            match("composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:92:7: ( 'portion' )
            // InternalKerML.g:92:9: 'portion'
            {
            match("portion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:93:7: ( 'port' )
            // InternalKerML.g:93:9: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:94:7: ( 'part' )
            // InternalKerML.g:94:9: 'part'
            {
            match("part"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:95:7: ( 'all' )
            // InternalKerML.g:95:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:96:7: ( 'ordered' )
            // InternalKerML.g:96:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:97:8: ( 'nonunique' )
            // InternalKerML.g:97:10: 'nonunique'
            {
            match("nonunique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:98:8: ( '@' )
            // InternalKerML.g:98:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:99:8: ( 'allInstances' )
            // InternalKerML.g:99:10: 'allInstances'
            {
            match("allInstances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "RULE_BOOLEAN_VALUE"
    public final void mRULE_BOOLEAN_VALUE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26176:20: ( ( 'true' | 'false' ) )
            // InternalKerML.g:26176:22: ( 'true' | 'false' )
            {
            // InternalKerML.g:26176:22: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKerML.g:26176:23: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKerML.g:26176:30: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_VALUE"

    // $ANTLR start "RULE_NATURAL_VALUE"
    public final void mRULE_NATURAL_VALUE() throws RecognitionException {
        try {
            int _type = RULE_NATURAL_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26178:20: ( ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* ) )
            // InternalKerML.g:26178:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            {
            // InternalKerML.g:26178:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'B':
                case 'b':
                    {
                    alt14=2;
                    }
                    break;
                case 'X':
                case 'x':
                    {
                    alt14=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '_':
                    {
                    alt14=4;
                    }
                    break;
                default:
                    alt14=1;}

            }
            else if ( ((LA14_0>='1' && LA14_0<='9')) ) {
                alt14=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKerML.g:26178:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    {
                    // InternalKerML.g:26178:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='0') ) {
                        alt4=1;
                    }
                    else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalKerML.g:26178:24: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // InternalKerML.g:26178:28: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // InternalKerML.g:26178:37: ( ( '_' )? '0' .. '9' )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')||LA3_0=='_') ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalKerML.g:26178:38: ( '_' )? '0' .. '9'
                            	    {
                            	    // InternalKerML.g:26178:38: ( '_' )?
                            	    int alt2=2;
                            	    int LA2_0 = input.LA(1);

                            	    if ( (LA2_0=='_') ) {
                            	        alt2=1;
                            	    }
                            	    switch (alt2) {
                            	        case 1 :
                            	            // InternalKerML.g:26178:38: '_'
                            	            {
                            	            match('_'); 

                            	            }
                            	            break;

                            	    }

                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKerML.g:26178:55: ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )*
                    {
                    // InternalKerML.g:26178:55: ( '0b' | '0B' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='0') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='b') ) {
                            alt5=1;
                        }
                        else if ( (LA5_1=='B') ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKerML.g:26178:56: '0b'
                            {
                            match("0b"); 


                            }
                            break;
                        case 2 :
                            // InternalKerML.g:26178:61: '0B'
                            {
                            match("0B"); 


                            }
                            break;

                    }

                    matchRange('0','1'); 
                    // InternalKerML.g:26178:76: ( ( '_' )? '0' .. '1' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='1')||LA7_0=='_') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKerML.g:26178:77: ( '_' )? '0' .. '1'
                    	    {
                    	    // InternalKerML.g:26178:77: ( '_' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0=='_') ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalKerML.g:26178:77: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','1'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalKerML.g:26178:93: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    {
                    // InternalKerML.g:26178:93: ( '0x' | '0X' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='0') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='x') ) {
                            alt8=1;
                        }
                        else if ( (LA8_1=='X') ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKerML.g:26178:94: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // InternalKerML.g:26178:99: '0X'
                            {
                            match("0X"); 


                            }
                            break;

                    }

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKerML.g:26178:134: ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='f')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalKerML.g:26178:135: ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    // InternalKerML.g:26178:135: ( '_' )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0=='_') ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalKerML.g:26178:135: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // InternalKerML.g:26178:171: '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )*
                    {
                    match('0'); 
                    // InternalKerML.g:26178:175: ( '_' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='_') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKerML.g:26178:175: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }

                    matchRange('0','7'); 
                    // InternalKerML.g:26178:189: ( ( '_' )? '0' .. '7' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='7')||LA13_0=='_') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalKerML.g:26178:190: ( '_' )? '0' .. '7'
                    	    {
                    	    // InternalKerML.g:26178:190: ( '_' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0=='_') ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // InternalKerML.g:26178:190: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NATURAL_VALUE"

    // $ANTLR start "RULE_EXP_VALUE"
    public final void mRULE_EXP_VALUE() throws RecognitionException {
        try {
            int _type = RULE_EXP_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26180:16: ( RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE )
            // InternalKerML.g:26180:18: RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE
            {
            mRULE_NATURAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerML.g:26180:47: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKerML.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_NATURAL_VALUE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP_VALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26182:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKerML.g:26182:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerML.g:26182:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKerML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_UNRESTRICTED_NAME"
    public final void mRULE_UNRESTRICTED_NAME() throws RecognitionException {
        try {
            int _type = RULE_UNRESTRICTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26184:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalKerML.g:26184:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalKerML.g:26184:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    alt17=1;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKerML.g:26184:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalKerML.g:26184:73: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNRESTRICTED_NAME"

    // $ANTLR start "RULE_STRING_VALUE"
    public final void mRULE_STRING_VALUE() throws RecognitionException {
        try {
            int _type = RULE_STRING_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26186:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKerML.g:26186:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKerML.g:26186:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\\') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKerML.g:26186:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalKerML.g:26186:67: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_VALUE"

    // $ANTLR start "RULE_DOCUMENTATION_COMMENT"
    public final void mRULE_DOCUMENTATION_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26188:28: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKerML.g:26188:30: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKerML.g:26188:36: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKerML.g:26188:64: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOCUMENTATION_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26190:17: ( '/*' ~ ( ( '*' | '@' ) ) ( options {greedy=false; } : . )* '*/' )
            // InternalKerML.g:26190:19: '/*' ~ ( ( '*' | '@' ) ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerML.g:26190:37: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKerML.g:26190:65: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26192:17: ( '//' (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalKerML.g:26192:19: '//' (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKerML.g:26192:24: (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='?')||(LA22_0>='A' && LA22_0<='\uFFFF')) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKerML.g:26192:25: ~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKerML.g:26192:44: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalKerML.g:26192:44: ~ ( ( '\\n' | '\\r' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKerML.g:26192:62: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKerML.g:26192:63: ( '\\r' )? '\\n'
                    {
                    // InternalKerML.g:26192:63: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalKerML.g:26192:63: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerML.g:26194:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKerML.g:26194:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKerML.g:26194:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKerML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalKerML.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_DOCUMENTATION_COMMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt26=99;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalKerML.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalKerML.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalKerML.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalKerML.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalKerML.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalKerML.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalKerML.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalKerML.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalKerML.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalKerML.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalKerML.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalKerML.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalKerML.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalKerML.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalKerML.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalKerML.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalKerML.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalKerML.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalKerML.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalKerML.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalKerML.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalKerML.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalKerML.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalKerML.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalKerML.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalKerML.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalKerML.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalKerML.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalKerML.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalKerML.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalKerML.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalKerML.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalKerML.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalKerML.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalKerML.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalKerML.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalKerML.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalKerML.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalKerML.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalKerML.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalKerML.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalKerML.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalKerML.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalKerML.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalKerML.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalKerML.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalKerML.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalKerML.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalKerML.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalKerML.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalKerML.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalKerML.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalKerML.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalKerML.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalKerML.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalKerML.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalKerML.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalKerML.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalKerML.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalKerML.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalKerML.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalKerML.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalKerML.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalKerML.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalKerML.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalKerML.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalKerML.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalKerML.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalKerML.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // InternalKerML.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // InternalKerML.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // InternalKerML.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // InternalKerML.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // InternalKerML.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // InternalKerML.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // InternalKerML.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // InternalKerML.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // InternalKerML.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // InternalKerML.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // InternalKerML.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // InternalKerML.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // InternalKerML.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // InternalKerML.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // InternalKerML.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // InternalKerML.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // InternalKerML.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // InternalKerML.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // InternalKerML.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // InternalKerML.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // InternalKerML.g:1:547: RULE_BOOLEAN_VALUE
                {
                mRULE_BOOLEAN_VALUE(); 

                }
                break;
            case 91 :
                // InternalKerML.g:1:566: RULE_NATURAL_VALUE
                {
                mRULE_NATURAL_VALUE(); 

                }
                break;
            case 92 :
                // InternalKerML.g:1:585: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 93 :
                // InternalKerML.g:1:600: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 94 :
                // InternalKerML.g:1:608: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 95 :
                // InternalKerML.g:1:631: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 96 :
                // InternalKerML.g:1:649: RULE_DOCUMENTATION_COMMENT
                {
                mRULE_DOCUMENTATION_COMMENT(); 

                }
                break;
            case 97 :
                // InternalKerML.g:1:676: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 98 :
                // InternalKerML.g:1:692: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 99 :
                // InternalKerML.g:1:708: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\1\uffff\1\56\1\60\1\62\1\uffff\1\65\1\70\1\uffff\4\51\1\111\1\113\2\51\1\121\1\123\1\uffff\1\125\1\127\1\132\1\uffff\3\51\2\uffff\3\51\5\uffff\2\51\1\uffff\2\163\13\uffff\1\172\4\uffff\13\51\1\u0089\2\51\5\uffff\1\u008f\1\51\1\u0091\1\51\13\uffff\5\51\1\u009c\1\u009d\10\51\1\u00a7\4\51\7\uffff\1\163\1\uffff\1\163\2\uffff\14\51\1\u00bc\1\51\1\uffff\1\51\1\u00c0\3\51\1\uffff\1\51\1\uffff\1\51\2\uffff\6\51\1\u00cc\2\uffff\10\51\1\u00d6\1\uffff\4\51\2\163\1\uffff\1\163\2\51\1\u00e2\1\u00e3\5\51\1\u00e9\2\51\1\uffff\3\51\1\uffff\11\51\1\u00f8\1\u00fa\1\uffff\10\51\1\u0103\1\uffff\1\u0104\1\u0105\1\u0106\1\51\1\uffff\1\163\1\uffff\2\163\2\51\2\uffff\1\u010c\1\u0105\3\51\1\uffff\2\51\1\u0112\3\51\1\u0116\7\51\1\uffff\1\51\1\uffff\4\51\1\u0124\3\51\4\uffff\1\51\2\163\2\51\1\uffff\3\51\1\u0134\1\51\1\uffff\3\51\1\uffff\1\51\1\u013a\1\51\1\u013c\11\51\1\uffff\4\51\2\163\1\uffff\1\163\1\uffff\1\163\1\u014d\2\51\1\u0150\1\51\1\uffff\5\51\1\uffff\1\u0157\1\uffff\1\u0158\1\51\1\u015b\1\u015c\1\u015d\1\u015e\5\51\1\u0164\1\51\1\163\1\uffff\1\163\1\uffff\1\u0168\1\51\1\uffff\2\51\1\u016c\3\51\2\uffff\1\51\1\u0171\4\uffff\3\51\1\u0175\1\u0176\1\uffff\1\51\1\uffff\1\163\1\uffff\2\51\1\u017a\1\uffff\3\51\1\u017e\1\uffff\1\u017f\1\u0180\1\51\2\uffff\1\u0182\1\51\1\u0184\1\uffff\1\51\1\u0186\1\51\3\uffff\1\u0188\1\uffff\1\u0189\1\uffff\1\51\1\uffff\1\u018b\2\uffff\1\u018c\2\uffff";
    static final String DFA26_eofS =
        "\u018d\uffff";
    static final String DFA26_minS =
        "\1\11\1\77\1\174\1\46\1\uffff\1\72\1\56\1\uffff\1\141\1\160\1\145\1\142\2\75\1\155\1\141\2\75\1\uffff\1\76\2\52\1\uffff\1\141\1\146\1\154\2\uffff\1\141\1\145\1\156\5\uffff\1\150\1\157\1\uffff\2\60\13\uffff\1\76\4\uffff\1\141\1\156\2\157\1\162\1\154\1\145\1\142\1\145\1\144\1\171\1\60\1\163\1\154\5\uffff\1\60\1\160\1\60\1\163\10\uffff\1\0\2\uffff\1\142\1\151\1\143\1\162\1\164\2\60\1\144\1\155\1\141\1\164\1\150\1\156\1\160\1\144\1\60\1\145\1\165\1\154\1\156\4\60\2\uffff\4\60\2\uffff\1\164\1\143\1\167\1\155\2\163\1\143\1\163\1\143\1\160\2\145\1\60\1\157\1\uffff\1\164\1\60\1\164\1\165\1\145\1\uffff\1\157\1\uffff\1\164\2\uffff\1\154\1\166\1\164\1\153\2\164\1\60\2\uffff\1\145\1\155\1\156\1\163\2\141\1\144\1\162\1\60\1\uffff\1\156\1\145\1\154\1\165\4\60\1\165\1\164\2\60\1\164\1\145\1\151\2\145\1\60\1\141\1\146\1\uffff\1\143\1\162\1\156\1\uffff\1\141\1\164\2\162\1\171\1\151\1\141\1\145\1\141\2\60\1\uffff\1\162\1\145\1\157\1\145\1\163\1\164\1\166\1\151\1\60\1\uffff\3\60\1\156\3\60\1\53\1\60\1\162\1\151\2\uffff\2\60\1\141\1\164\1\163\1\uffff\1\155\1\151\1\60\1\141\1\163\1\156\1\60\1\141\1\164\1\160\1\143\1\164\1\143\1\147\1\uffff\1\157\1\uffff\1\145\1\156\1\163\1\143\1\60\1\171\1\151\1\156\4\uffff\1\151\2\60\1\145\1\157\1\uffff\1\154\2\163\1\60\1\156\1\uffff\1\143\1\164\1\143\1\uffff\1\143\1\60\1\145\1\60\1\145\1\164\1\145\1\156\1\144\1\164\1\151\1\164\1\146\1\uffff\1\160\1\157\1\147\1\161\7\60\1\156\1\151\1\60\1\151\1\uffff\1\145\1\164\1\141\1\145\1\164\1\uffff\1\60\1\uffff\1\60\1\145\4\60\1\164\1\157\1\151\1\145\1\162\1\60\1\165\3\60\1\uffff\1\60\1\172\1\uffff\1\157\1\163\1\60\1\156\1\157\1\151\2\uffff\1\144\1\60\4\uffff\1\145\1\162\1\145\2\60\1\uffff\1\145\2\60\1\uffff\1\145\1\156\1\60\1\uffff\1\143\1\146\1\157\1\60\1\uffff\2\60\1\162\2\uffff\1\60\1\163\1\60\1\uffff\1\145\1\60\1\156\3\uffff\1\60\1\uffff\1\60\1\uffff\1\163\1\uffff\1\60\2\uffff\1\60\2\uffff";
    static final String DFA26_maxS =
        "\1\176\1\77\1\174\1\46\1\uffff\1\76\1\57\1\uffff\2\165\1\145\1\163\1\76\1\75\1\163\1\141\2\75\1\uffff\1\76\1\52\1\57\1\uffff\2\165\1\157\2\uffff\1\141\1\151\1\170\5\uffff\1\162\1\165\1\uffff\1\170\1\145\13\uffff\1\76\4\uffff\1\141\1\156\2\157\1\162\1\154\1\145\1\143\1\162\1\144\1\171\1\172\1\163\1\154\5\uffff\1\172\1\160\1\172\1\163\10\uffff\1\uffff\2\uffff\1\142\1\157\2\162\1\164\2\172\1\144\1\156\1\141\1\164\1\150\1\156\1\160\1\144\1\172\1\145\1\165\1\154\1\156\2\61\2\146\2\uffff\1\67\1\145\1\71\1\145\2\uffff\1\164\1\143\1\167\1\155\2\163\1\143\1\163\1\143\1\160\2\145\1\172\1\157\1\uffff\1\164\1\172\1\164\1\165\1\145\1\uffff\1\157\1\uffff\1\164\2\uffff\1\154\1\166\1\164\1\153\2\164\1\172\2\uffff\1\145\1\160\1\156\1\163\2\141\1\144\1\162\1\172\1\uffff\1\156\1\145\1\154\1\165\1\145\1\146\1\67\1\145\1\165\1\164\2\172\1\164\1\145\1\151\2\145\1\172\1\141\1\146\1\uffff\1\143\1\162\1\156\1\uffff\1\141\1\164\2\162\1\171\1\151\1\141\1\145\1\141\2\172\1\uffff\1\162\1\145\1\157\1\145\1\163\1\164\1\166\1\151\1\172\1\uffff\3\172\1\156\1\61\1\145\3\146\1\162\1\151\2\uffff\2\172\1\141\1\164\1\163\1\uffff\1\155\1\151\1\172\1\141\1\163\1\156\1\172\1\141\1\164\1\160\1\143\1\164\1\143\1\147\1\uffff\1\157\1\uffff\1\145\1\156\1\163\1\143\1\172\1\171\1\151\1\156\4\uffff\1\151\1\170\1\146\1\145\1\157\1\uffff\1\154\2\163\1\172\1\156\1\uffff\1\143\1\164\1\143\1\uffff\1\143\1\172\1\145\1\172\1\145\1\164\1\145\1\156\1\144\1\164\1\151\1\164\1\146\1\uffff\1\160\1\157\1\147\1\161\6\146\1\172\1\156\1\151\1\172\1\151\1\uffff\1\145\1\164\1\141\1\145\1\164\1\uffff\1\172\1\uffff\1\172\1\145\4\172\1\164\1\157\1\151\1\145\1\162\1\172\1\165\3\146\1\uffff\2\172\1\uffff\1\157\1\163\1\172\1\156\1\157\1\151\2\uffff\1\144\1\172\4\uffff\1\145\1\162\1\145\2\172\1\uffff\1\145\2\146\1\uffff\1\145\1\156\1\172\1\uffff\1\143\1\146\1\157\1\172\1\uffff\2\172\1\162\2\uffff\1\172\1\163\1\172\1\uffff\1\145\1\172\1\156\3\uffff\1\172\1\uffff\1\172\1\uffff\1\163\1\uffff\1\172\2\uffff\1\172\2\uffff";
    static final String DFA26_acceptS =
        "\4\uffff\1\6\2\uffff\1\12\12\uffff\1\32\3\uffff\1\40\3\uffff\1\55\1\56\3\uffff\1\77\1\101\1\102\1\105\1\106\2\uffff\1\130\2\uffff\1\135\1\136\1\137\1\143\1\2\1\1\1\3\1\5\1\4\1\7\1\10\1\uffff\1\104\1\107\1\120\1\11\16\uffff\1\22\1\112\1\103\1\23\1\37\4\uffff\1\30\1\26\1\31\1\27\1\116\1\33\1\36\1\34\1\uffff\1\142\1\35\30\uffff\1\133\1\134\4\uffff\1\16\1\14\16\uffff\1\53\5\uffff\1\45\1\uffff\1\57\1\uffff\1\140\1\141\7\uffff\1\51\1\113\11\uffff\1\110\24\uffff\1\20\3\uffff\1\125\13\uffff\1\46\11\uffff\1\76\13\uffff\1\75\1\111\5\uffff\1\67\16\uffff\1\124\1\uffff\1\123\10\uffff\1\70\1\114\1\132\1\117\5\uffff\1\115\5\uffff\1\63\3\uffff\1\47\15\uffff\1\61\17\uffff\1\74\5\uffff\1\52\1\uffff\1\41\20\uffff\1\13\2\uffff\1\21\6\uffff\1\25\1\42\2\uffff\1\54\1\122\1\126\1\50\5\uffff\1\72\3\uffff\1\65\3\uffff\1\66\4\uffff\1\44\3\uffff\1\62\1\64\3\uffff\1\17\3\uffff\1\43\1\121\1\71\1\uffff\1\127\1\uffff\1\73\1\uffff\1\24\1\uffff\1\60\1\15\1\uffff\1\100\1\131";
    static final String DFA26_specialS =
        "\130\uffff\1\0\u0134\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\15\1\53\3\uffff\1\3\1\52\1\40\1\41\1\24\1\22\1\37\1\23\1\6\1\25\1\47\11\50\1\5\1\7\1\20\1\14\1\21\1\1\1\46\32\51\1\42\1\uffff\1\43\1\4\1\51\1\uffff\1\13\1\35\1\31\1\34\1\36\1\10\1\51\1\17\1\16\4\51\1\45\1\30\1\27\1\51\1\12\1\11\1\44\6\51\1\32\1\2\1\33\1\26",
            "\1\55",
            "\1\57",
            "\1\61",
            "",
            "\1\63\3\uffff\1\64",
            "\1\66\1\67",
            "",
            "\1\76\3\uffff\1\71\3\uffff\1\75\2\uffff\1\73\5\uffff\1\74\2\uffff\1\72",
            "\1\77\3\uffff\1\101\1\100",
            "\1\102",
            "\1\105\11\uffff\1\106\1\uffff\1\103\4\uffff\1\104",
            "\1\107\1\110",
            "\1\112",
            "\1\115\1\114\4\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\122",
            "",
            "\1\124",
            "\1\126",
            "\1\130\4\uffff\1\131",
            "",
            "\1\135\15\uffff\1\136\2\uffff\1\134\2\uffff\1\133",
            "\1\141\7\uffff\1\140\3\uffff\1\142\2\uffff\1\137",
            "\1\144\2\uffff\1\143",
            "",
            "",
            "\1\145",
            "\1\146\3\uffff\1\147",
            "\1\151\11\uffff\1\150",
            "",
            "",
            "",
            "",
            "",
            "\1\153\6\uffff\1\152\2\uffff\1\154",
            "\1\156\5\uffff\1\155",
            "",
            "\10\166\12\uffff\1\160\2\uffff\1\164\22\uffff\1\162\6\uffff\1\165\2\uffff\1\157\2\uffff\1\164\22\uffff\1\161",
            "\12\170\13\uffff\1\164\31\uffff\1\167\5\uffff\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\1\u0083",
            "\1\u0084\14\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u0088\7\51",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\16\51\1\u008d\3\51\1\u008c\1\u008e\6\51",
            "\1\u0090",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u0094\1\u0093\25\u0094\1\uffff\uffbf\u0094",
            "",
            "",
            "\1\u0095",
            "\1\u0096\5\uffff\1\u0097",
            "\1\u0098\16\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009e",
            "\1\u009f\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\2\u00ac",
            "\2\u00ac",
            "\12\u00ad\7\uffff\6\u00ad\32\uffff\6\u00ad",
            "\12\u00ad\7\uffff\6\u00ad\32\uffff\6\u00ad",
            "",
            "",
            "\10\166",
            "\10\u00af\15\uffff\1\164\31\uffff\1\u00ae\5\uffff\1\164",
            "\12\170",
            "\12\170\13\uffff\1\164\31\uffff\1\167\5\uffff\1\164",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\12\51\7\uffff\10\51\1\u00bf\21\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00cd",
            "\1\u00ce\2\uffff\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\2\u00dc\23\uffff\1\164\31\uffff\1\u00db\5\uffff\1\164",
            "\12\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u00dd\1\uffff\4\u00df\1\u00de\1\u00df",
            "\10\u00af",
            "\10\u00af\15\uffff\1\164\31\uffff\1\u00ae\5\uffff\1\164",
            "\1\u00e0",
            "\1\u00e1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\u00f9\21\51",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0107",
            "\2\u00dc",
            "\2\u00dc\23\uffff\1\164\31\uffff\1\u00db\5\uffff\1\164",
            "\12\u00df\7\uffff\6\u00df\32\uffff\6\u00df",
            "\1\164\1\uffff\1\164\2\uffff\1\u0108\11\u0109\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u00dd\1\uffff\4\u00df\1\u00de\1\u00df",
            "\12\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u00dd\1\uffff\4\u00df\1\u00de\1\u00df",
            "\1\u010a",
            "\1\u010b",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\u0123\21\51",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "",
            "",
            "",
            "\1\u0128",
            "\10\u012c\2\u00df\7\uffff\1\u00df\1\u012a\2\u00df\1\u00de\1\u00df\21\uffff\1\164\6\uffff\1\u012b\1\uffff\1\u00df\1\u0129\2\u00df\1\u00de\1\u00df\21\uffff\1\164",
            "\12\u012e\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u012d\1\uffff\4\u00df\1\u00de\1\u00df",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u013b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\2\u014a\10\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u00dd\1\uffff\4\u00df\1\u00de\1\u00df",
            "\2\u014a\10\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u00dd\1\uffff\4\u00df\1\u00de\1\u00df",
            "\10\u012c\2\u00df\7\uffff\6\u00df\32\uffff\6\u00df",
            "\10\u014c\2\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u014b\1\uffff\4\u00df\1\u00de\1\u00df",
            "\12\u012e\7\uffff\6\u00df\32\uffff\6\u00df",
            "\12\u012e\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u012d\1\uffff\4\u00df\1\u00de\1\u00df",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u014e",
            "\1\u014f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0159",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\3\51\1\u015a\26\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0165",
            "\2\u0167\10\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u0166\1\uffff\4\u00df\1\u00de\1\u00df",
            "\10\u014c\2\u00df\7\uffff\6\u00df\32\uffff\6\u00df",
            "\10\u014c\2\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u014b\1\uffff\4\u00df\1\u00de\1\u00df",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "",
            "\1\u0170",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0177",
            "\2\u0167\10\u00df\7\uffff\6\u00df\32\uffff\6\u00df",
            "\2\u0167\10\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u0166\1\uffff\4\u00df\1\u00de\1\u00df",
            "",
            "\1\u0178",
            "\1\u0179",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0181",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0183",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0185",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0187",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u018a",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_DOCUMENTATION_COMMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_88 = input.LA(1);

                        s = -1;
                        if ( (LA26_88=='*') ) {s = 147;}

                        else if ( ((LA26_88>='\u0000' && LA26_88<=')')||(LA26_88>='+' && LA26_88<='?')||(LA26_88>='A' && LA26_88<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}