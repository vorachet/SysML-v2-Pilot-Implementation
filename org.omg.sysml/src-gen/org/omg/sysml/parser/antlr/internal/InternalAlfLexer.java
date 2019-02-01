package org.omg.sysml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=11;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=4;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int RULE_NATURAL_VALUE=7;
    public static final int RULE_INLINE_STATEMENT=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_BOOLEAN_VALUE=5;
    public static final int RULE_SL_COMMENT=14;
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
    public static final int RULE_WS=15;
    public static final int RULE_UNRESTRICTED_NAME=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_EXP_VALUE=8;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalAlfLexer() {;} 
    public InternalAlfLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAlfLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAlf.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:11:7: ( 'import' )
            // InternalAlf.g:11:9: 'import'
            {
            match("import"); 


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
            // InternalAlf.g:12:7: ( '::' )
            // InternalAlf.g:12:9: '::'
            {
            match("::"); 


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
            // InternalAlf.g:13:7: ( '.' )
            // InternalAlf.g:13:9: '.'
            {
            match('.'); 

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
            // InternalAlf.g:14:7: ( '*' )
            // InternalAlf.g:14:9: '*'
            {
            match('*'); 

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
            // InternalAlf.g:15:7: ( ';' )
            // InternalAlf.g:15:9: ';'
            {
            match(';'); 

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
            // InternalAlf.g:16:7: ( 'as' )
            // InternalAlf.g:16:9: 'as'
            {
            match("as"); 


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
            // InternalAlf.g:17:7: ( 'package' )
            // InternalAlf.g:17:9: 'package'
            {
            match("package"); 


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
            // InternalAlf.g:18:7: ( '{' )
            // InternalAlf.g:18:9: '{'
            {
            match('{'); 

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
            // InternalAlf.g:19:7: ( '}' )
            // InternalAlf.g:19:9: '}'
            {
            match('}'); 

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
            // InternalAlf.g:20:7: ( 'is' )
            // InternalAlf.g:20:9: 'is'
            {
            match("is"); 


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
            // InternalAlf.g:21:7: ( 'Class' )
            // InternalAlf.g:21:9: 'Class'
            {
            match("Class"); 


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
            // InternalAlf.g:22:7: ( 'class' )
            // InternalAlf.g:22:9: 'class'
            {
            match("class"); 


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
            // InternalAlf.g:23:7: ( 'datatype' )
            // InternalAlf.g:23:9: 'datatype'
            {
            match("datatype"); 


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
            // InternalAlf.g:24:7: ( 'assoc' )
            // InternalAlf.g:24:9: 'assoc'
            {
            match("assoc"); 


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
            // InternalAlf.g:25:7: ( 'feature' )
            // InternalAlf.g:25:9: 'feature'
            {
            match("feature"); 


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
            // InternalAlf.g:26:7: ( 'part' )
            // InternalAlf.g:26:9: 'part'
            {
            match("part"); 


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
            // InternalAlf.g:27:7: ( 'port' )
            // InternalAlf.g:27:9: 'port'
            {
            match("port"); 


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
            // InternalAlf.g:28:7: ( 'connector' )
            // InternalAlf.g:28:9: 'connector'
            {
            match("connector"); 


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
            // InternalAlf.g:29:7: ( 'abstract' )
            // InternalAlf.g:29:9: 'abstract'
            {
            match("abstract"); 


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
            // InternalAlf.g:30:7: ( 'specializes' )
            // InternalAlf.g:30:9: 'specializes'
            {
            match("specializes"); 


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
            // InternalAlf.g:31:7: ( ',' )
            // InternalAlf.g:31:9: ','
            {
            match(','); 

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
            // InternalAlf.g:32:7: ( 'end' )
            // InternalAlf.g:32:9: 'end'
            {
            match("end"); 


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
            // InternalAlf.g:33:7: ( 'ordered' )
            // InternalAlf.g:33:9: 'ordered'
            {
            match("ordered"); 


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
            // InternalAlf.g:34:7: ( 'nonunique' )
            // InternalAlf.g:34:9: 'nonunique'
            {
            match("nonunique"); 


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
            // InternalAlf.g:35:7: ( '=' )
            // InternalAlf.g:35:9: '='
            {
            match('='); 

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
            // InternalAlf.g:36:7: ( ':' )
            // InternalAlf.g:36:9: ':'
            {
            match(':'); 

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
            // InternalAlf.g:37:7: ( 'compose' )
            // InternalAlf.g:37:9: 'compose'
            {
            match("compose"); 


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
            // InternalAlf.g:38:7: ( 'any' )
            // InternalAlf.g:38:9: 'any'
            {
            match("any"); 


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
            // InternalAlf.g:39:7: ( '[' )
            // InternalAlf.g:39:9: '['
            {
            match('['); 

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
            // InternalAlf.g:40:7: ( '..' )
            // InternalAlf.g:40:9: '..'
            {
            match(".."); 


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
            // InternalAlf.g:41:7: ( ']' )
            // InternalAlf.g:41:9: ']'
            {
            match(']'); 

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
            // InternalAlf.g:42:7: ( 'subsets' )
            // InternalAlf.g:42:9: 'subsets'
            {
            match("subsets"); 


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
            // InternalAlf.g:43:7: ( 'redefines' )
            // InternalAlf.g:43:9: 'redefines'
            {
            match("redefines"); 


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
            // InternalAlf.g:44:7: ( 'to' )
            // InternalAlf.g:44:9: 'to'
            {
            match("to"); 


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
            // InternalAlf.g:45:7: ( '(' )
            // InternalAlf.g:45:9: '('
            {
            match('('); 

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
            // InternalAlf.g:46:7: ( ')' )
            // InternalAlf.g:46:9: ')'
            {
            match(')'); 

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
            // InternalAlf.g:47:7: ( '=>' )
            // InternalAlf.g:47:9: '=>'
            {
            match("=>"); 


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
            // InternalAlf.g:48:7: ( '@' )
            // InternalAlf.g:48:9: '@'
            {
            match('@'); 

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
            // InternalAlf.g:49:7: ( '+' )
            // InternalAlf.g:49:9: '+'
            {
            match('+'); 

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
            // InternalAlf.g:50:7: ( '-' )
            // InternalAlf.g:50:9: '-'
            {
            match('-'); 

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
            // InternalAlf.g:51:7: ( '/' )
            // InternalAlf.g:51:9: '/'
            {
            match('/'); 

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
            // InternalAlf.g:52:7: ( '^' )
            // InternalAlf.g:52:9: '^'
            {
            match('^'); 

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
            // InternalAlf.g:53:7: ( 'null' )
            // InternalAlf.g:53:9: 'null'
            {
            match("null"); 


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
            // InternalAlf.g:54:7: ( 'public' )
            // InternalAlf.g:54:9: 'public'
            {
            match("public"); 


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
            // InternalAlf.g:55:7: ( 'private' )
            // InternalAlf.g:55:9: 'private'
            {
            match("private"); 


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
            // InternalAlf.g:56:7: ( 'protected' )
            // InternalAlf.g:56:9: 'protected'
            {
            match("protected"); 


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
            // InternalAlf.g:57:7: ( 'packaged' )
            // InternalAlf.g:57:9: 'packaged'
            {
            match("packaged"); 


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
            // InternalAlf.g:58:7: ( 'in' )
            // InternalAlf.g:58:9: 'in'
            {
            match("in"); 


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
            // InternalAlf.g:59:7: ( 'out' )
            // InternalAlf.g:59:9: 'out'
            {
            match("out"); 


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
            // InternalAlf.g:60:7: ( 'inout' )
            // InternalAlf.g:60:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_BOOLEAN_VALUE"
    public final void mRULE_BOOLEAN_VALUE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:5679:20: ( ( 'true' | 'false' ) )
            // InternalAlf.g:5679:22: ( 'true' | 'false' )
            {
            // InternalAlf.g:5679:22: ( 'true' | 'false' )
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
                    // InternalAlf.g:5679:23: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5679:30: 'false'
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
            // InternalAlf.g:5681:20: ( ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* ) )
            // InternalAlf.g:5681:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            {
            // InternalAlf.g:5681:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
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
                    // InternalAlf.g:5681:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    {
                    // InternalAlf.g:5681:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
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
                            // InternalAlf.g:5681:24: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5681:28: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // InternalAlf.g:5681:37: ( ( '_' )? '0' .. '9' )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')||LA3_0=='_') ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalAlf.g:5681:38: ( '_' )? '0' .. '9'
                            	    {
                            	    // InternalAlf.g:5681:38: ( '_' )?
                            	    int alt2=2;
                            	    int LA2_0 = input.LA(1);

                            	    if ( (LA2_0=='_') ) {
                            	        alt2=1;
                            	    }
                            	    switch (alt2) {
                            	        case 1 :
                            	            // InternalAlf.g:5681:38: '_'
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
                    // InternalAlf.g:5681:55: ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )*
                    {
                    // InternalAlf.g:5681:55: ( '0b' | '0B' )
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
                            // InternalAlf.g:5681:56: '0b'
                            {
                            match("0b"); 


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5681:61: '0B'
                            {
                            match("0B"); 


                            }
                            break;

                    }

                    matchRange('0','1'); 
                    // InternalAlf.g:5681:76: ( ( '_' )? '0' .. '1' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='1')||LA7_0=='_') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAlf.g:5681:77: ( '_' )? '0' .. '1'
                    	    {
                    	    // InternalAlf.g:5681:77: ( '_' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0=='_') ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalAlf.g:5681:77: '_'
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
                    // InternalAlf.g:5681:93: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    {
                    // InternalAlf.g:5681:93: ( '0x' | '0X' )
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
                            // InternalAlf.g:5681:94: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5681:99: '0X'
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

                    // InternalAlf.g:5681:134: ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='f')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlf.g:5681:135: ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    // InternalAlf.g:5681:135: ( '_' )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0=='_') ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalAlf.g:5681:135: '_'
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
                    // InternalAlf.g:5681:171: '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )*
                    {
                    match('0'); 
                    // InternalAlf.g:5681:175: ( '_' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='_') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAlf.g:5681:175: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }

                    matchRange('0','7'); 
                    // InternalAlf.g:5681:189: ( ( '_' )? '0' .. '7' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='7')||LA13_0=='_') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAlf.g:5681:190: ( '_' )? '0' .. '7'
                    	    {
                    	    // InternalAlf.g:5681:190: ( '_' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0=='_') ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // InternalAlf.g:5681:190: '_'
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
            // InternalAlf.g:5683:16: ( RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE )
            // InternalAlf.g:5683:18: RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE
            {
            mRULE_NATURAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:5683:47: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:
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
            // InternalAlf.g:5685:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAlf.g:5685:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:5685:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAlf.g:
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
            // InternalAlf.g:5687:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalAlf.g:5687:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalAlf.g:5687:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalAlf.g:5687:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalAlf.g:5687:73: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAlf.g:5689:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalAlf.g:5689:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalAlf.g:5689:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalAlf.g:5689:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalAlf.g:5689:67: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalAlf.g:5691:28: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:5691:30: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalAlf.g:5691:36: ( options {greedy=false; } : . )*
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
            	    // InternalAlf.g:5691:64: .
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

    // $ANTLR start "RULE_STATEMENT_ANNOTATION"
    public final void mRULE_STATEMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_STATEMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:5693:27: ( '//@' ( options {greedy=false; } : . )* '\\n' )
            // InternalAlf.g:5693:29: '//@' ( options {greedy=false; } : . )* '\\n'
            {
            match("//@"); 

            // InternalAlf.g:5693:35: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\n') ) {
                    alt20=2;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAlf.g:5693:63: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATEMENT_ANNOTATION"

    // $ANTLR start "RULE_INLINE_STATEMENT"
    public final void mRULE_INLINE_STATEMENT() throws RecognitionException {
        try {
            int _type = RULE_INLINE_STATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:5695:23: ( '/*@inline(' ( RULE_ID | RULE_UNRESTRICTED_NAME ) ')' ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:5695:25: '/*@inline(' ( RULE_ID | RULE_UNRESTRICTED_NAME ) ')' ( options {greedy=false; } : . )* '*/'
            {
            match("/*@inline("); 

            // InternalAlf.g:5695:38: ( RULE_ID | RULE_UNRESTRICTED_NAME )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:5695:39: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5695:47: RULE_UNRESTRICTED_NAME
                    {
                    mRULE_UNRESTRICTED_NAME(); 

                    }
                    break;

            }

            match(')'); 
            // InternalAlf.g:5695:75: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAlf.g:5695:103: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "RULE_INLINE_STATEMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:5697:17: ( '/*' ~ ( ( '*' | '@' ) ) ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:5697:19: '/*' ~ ( ( '*' | '@' ) ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:5697:37: ( options {greedy=false; } : . )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='*') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='/') ) {
                        alt23=2;
                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='.')||(LA23_1>='0' && LA23_1<='\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<=')')||(LA23_0>='+' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAlf.g:5697:65: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // InternalAlf.g:5699:17: ( '//' (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalAlf.g:5699:19: '//' (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAlf.g:5699:24: (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='?')||(LA25_0>='A' && LA25_0<='\uFFFF')) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:5699:25: ~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalAlf.g:5699:44: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAlf.g:5699:44: ~ ( ( '\\n' | '\\r' ) )
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlf.g:5699:62: ( ( '\\r' )? '\\n' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:5699:63: ( '\\r' )? '\\n'
                    {
                    // InternalAlf.g:5699:63: ( '\\r' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAlf.g:5699:63: '\\r'
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
            // InternalAlf.g:5701:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAlf.g:5701:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAlf.g:5701:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlf.g:
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
        // InternalAlf.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_DOCUMENTATION_COMMENT | RULE_STATEMENT_ANNOTATION | RULE_INLINE_STATEMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt29=62;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // InternalAlf.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalAlf.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalAlf.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalAlf.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalAlf.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalAlf.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalAlf.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalAlf.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalAlf.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalAlf.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalAlf.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalAlf.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalAlf.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalAlf.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalAlf.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalAlf.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalAlf.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalAlf.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalAlf.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalAlf.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalAlf.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalAlf.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalAlf.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalAlf.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalAlf.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalAlf.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalAlf.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalAlf.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalAlf.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalAlf.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalAlf.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalAlf.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalAlf.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalAlf.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalAlf.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalAlf.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalAlf.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalAlf.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalAlf.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalAlf.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalAlf.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalAlf.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalAlf.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalAlf.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalAlf.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalAlf.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalAlf.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalAlf.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalAlf.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalAlf.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalAlf.g:1:310: RULE_BOOLEAN_VALUE
                {
                mRULE_BOOLEAN_VALUE(); 

                }
                break;
            case 52 :
                // InternalAlf.g:1:329: RULE_NATURAL_VALUE
                {
                mRULE_NATURAL_VALUE(); 

                }
                break;
            case 53 :
                // InternalAlf.g:1:348: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 54 :
                // InternalAlf.g:1:363: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // InternalAlf.g:1:371: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 56 :
                // InternalAlf.g:1:394: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 57 :
                // InternalAlf.g:1:412: RULE_DOCUMENTATION_COMMENT
                {
                mRULE_DOCUMENTATION_COMMENT(); 

                }
                break;
            case 58 :
                // InternalAlf.g:1:439: RULE_STATEMENT_ANNOTATION
                {
                mRULE_STATEMENT_ANNOTATION(); 

                }
                break;
            case 59 :
                // InternalAlf.g:1:465: RULE_INLINE_STATEMENT
                {
                mRULE_INLINE_STATEMENT(); 

                }
                break;
            case 60 :
                // InternalAlf.g:1:487: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 61 :
                // InternalAlf.g:1:503: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 62 :
                // InternalAlf.g:1:519: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\1\uffff\1\41\1\51\1\53\2\uffff\2\41\2\uffff\5\41\1\uffff\3\41\1\101\2\uffff\2\41\5\uffff\1\107\1\uffff\2\116\4\uffff\1\41\1\123\1\125\4\uffff\1\127\23\41\2\uffff\1\41\1\157\1\41\1\uffff\1\165\6\uffff\1\116\3\uffff\1\116\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\176\17\41\1\u008e\1\41\1\u0090\3\41\1\uffff\1\41\5\uffff\2\116\1\uffff\1\116\4\41\1\uffff\1\41\1\u009f\1\u00a0\14\41\1\uffff\1\41\1\uffff\1\41\1\u00af\1\41\1\u00b1\1\uffff\1\116\1\uffff\2\116\1\41\1\u00b5\1\u00b6\2\41\2\uffff\3\41\1\u00bc\1\u00bd\4\41\1\u00b1\4\41\1\uffff\1\41\1\uffff\2\116\1\u00cd\2\uffff\2\41\1\u00d0\2\41\2\uffff\11\41\2\116\1\uffff\1\116\1\uffff\1\116\1\uffff\1\41\1\u00e1\1\uffff\1\u00e2\2\41\1\u00e5\1\41\1\u00e7\1\41\1\u00e9\1\u00ea\2\41\1\116\1\uffff\1\116\1\u00ef\1\u00f0\2\uffff\2\41\1\uffff\1\u00f3\1\uffff\1\41\2\uffff\2\41\1\uffff\1\116\2\uffff\1\u00f7\1\u00f8\1\uffff\1\41\1\u00fa\1\u00fb\2\uffff\1\41\2\uffff\1\u00fd\1\uffff";
    static final String DFA29_eofS =
        "\u00fe\uffff";
    static final String DFA29_minS =
        "\1\11\1\155\1\72\1\56\2\uffff\1\142\1\141\2\uffff\2\154\2\141\1\160\1\uffff\1\156\1\162\1\157\1\76\2\uffff\1\145\1\157\5\uffff\1\52\1\uffff\2\60\4\uffff\1\160\2\60\4\uffff\1\60\1\163\1\171\1\143\1\162\1\142\1\151\2\141\1\155\1\164\1\141\1\154\1\145\1\142\2\144\1\164\1\156\1\154\2\uffff\1\144\1\60\1\165\1\0\1\100\1\uffff\6\60\2\uffff\2\60\1\157\1\uffff\1\165\1\uffff\1\157\1\uffff\1\164\1\60\1\153\2\164\1\154\1\166\1\164\2\163\1\156\1\160\1\141\1\164\1\163\1\143\1\163\1\60\1\145\1\60\1\165\1\154\1\145\1\uffff\1\145\5\uffff\4\60\1\162\1\164\1\143\1\162\1\uffff\1\141\2\60\1\151\1\141\1\145\2\163\1\145\1\157\1\164\1\165\1\145\1\151\1\145\1\uffff\1\162\1\uffff\1\156\1\60\1\146\4\60\1\53\1\60\1\164\2\60\1\141\1\147\2\uffff\1\143\1\164\1\143\2\60\1\143\1\163\1\171\1\162\1\60\1\141\1\164\1\145\1\151\1\uffff\1\151\1\uffff\3\60\2\uffff\1\143\1\145\1\60\1\145\1\164\2\uffff\1\164\1\145\1\160\1\145\1\154\1\163\1\144\1\161\1\156\6\60\1\uffff\1\164\1\60\1\uffff\1\60\1\145\1\157\1\60\1\145\1\60\1\151\2\60\1\165\1\145\5\60\2\uffff\1\144\1\162\1\uffff\1\60\1\uffff\1\172\2\uffff\1\145\1\163\2\60\2\uffff\2\60\1\uffff\1\145\2\60\2\uffff\1\163\2\uffff\1\60\1\uffff";
    static final String DFA29_maxS =
        "\1\175\1\163\1\72\1\56\2\uffff\1\163\1\165\2\uffff\1\154\1\157\1\141\1\145\1\165\1\uffff\1\156\2\165\1\76\2\uffff\1\145\1\162\5\uffff\1\57\1\uffff\1\170\1\145\4\uffff\1\160\2\172\4\uffff\1\172\1\163\1\171\2\162\1\142\1\157\2\141\1\156\1\164\1\141\1\154\1\145\1\142\2\144\1\164\1\156\1\154\2\uffff\1\144\1\172\1\165\1\uffff\1\100\1\uffff\2\61\2\146\1\67\1\145\2\uffff\1\71\1\145\1\157\1\uffff\1\165\1\uffff\1\157\1\uffff\1\164\1\172\1\153\2\164\1\154\1\166\1\164\2\163\1\156\1\160\1\141\1\164\1\163\1\143\1\163\1\172\1\145\1\172\1\165\1\154\1\145\1\uffff\1\145\5\uffff\1\145\1\146\1\67\1\145\1\162\1\164\1\143\1\162\1\uffff\1\141\2\172\1\151\1\141\1\145\2\163\1\145\1\157\1\164\1\165\1\145\1\151\1\145\1\uffff\1\162\1\uffff\1\156\1\172\1\146\1\172\1\61\1\145\3\146\1\164\2\172\1\141\1\147\2\uffff\1\143\1\164\1\143\2\172\1\143\1\163\1\171\1\162\1\172\1\141\1\164\1\145\1\151\1\uffff\1\151\1\uffff\1\170\1\146\1\172\2\uffff\1\143\1\145\1\172\1\145\1\164\2\uffff\1\164\1\145\1\160\1\145\1\154\1\163\1\144\1\161\1\156\6\146\1\uffff\1\164\1\172\1\uffff\1\172\1\145\1\157\1\172\1\145\1\172\1\151\2\172\1\165\1\145\3\146\2\172\2\uffff\1\144\1\162\1\uffff\1\172\1\uffff\1\172\2\uffff\1\145\1\163\2\146\2\uffff\2\172\1\uffff\1\145\2\172\2\uffff\1\163\2\uffff\1\172\1\uffff";
    static final String DFA29_acceptS =
        "\4\uffff\1\4\1\5\2\uffff\1\10\1\11\5\uffff\1\25\4\uffff\1\35\1\37\2\uffff\1\43\1\44\1\46\1\47\1\50\1\uffff\1\52\2\uffff\1\66\1\67\1\70\1\76\3\uffff\1\2\1\32\1\36\1\3\24\uffff\1\45\1\31\5\uffff\1\51\6\uffff\1\64\1\65\3\uffff\1\12\1\uffff\1\60\1\uffff\1\6\27\uffff\1\42\1\uffff\1\71\1\73\1\74\1\72\1\75\10\uffff\1\34\17\uffff\1\26\1\uffff\1\61\16\uffff\1\20\1\21\16\uffff\1\53\1\uffff\1\63\3\uffff\1\62\1\16\5\uffff\1\13\1\14\17\uffff\1\1\2\uffff\1\54\20\uffff\1\7\1\55\2\uffff\1\33\1\uffff\1\17\1\uffff\1\40\1\27\4\uffff\1\23\1\57\2\uffff\1\15\3\uffff\1\56\1\22\1\uffff\1\30\1\41\1\uffff\1\24";
    static final String DFA29_specialS =
        "\105\uffff\1\0\u00b8\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\uffff\1\43\4\uffff\1\42\1\30\1\31\1\4\1\33\1\17\1\34\1\3\1\35\1\37\11\40\1\2\1\5\1\uffff\1\23\2\uffff\1\32\2\41\1\12\27\41\1\24\1\uffff\1\25\1\36\1\41\1\uffff\1\6\1\41\1\13\1\14\1\20\1\15\2\41\1\1\4\41\1\22\1\21\1\7\1\41\1\26\1\16\1\27\6\41\1\10\1\uffff\1\11",
            "\1\45\1\47\4\uffff\1\46",
            "\1\50",
            "\1\52",
            "",
            "",
            "\1\55\13\uffff\1\56\4\uffff\1\54",
            "\1\57\15\uffff\1\60\2\uffff\1\62\2\uffff\1\61",
            "",
            "",
            "\1\63",
            "\1\64\2\uffff\1\65",
            "\1\66",
            "\1\70\3\uffff\1\67",
            "\1\71\4\uffff\1\72",
            "",
            "\1\73",
            "\1\74\2\uffff\1\75",
            "\1\76\5\uffff\1\77",
            "\1\100",
            "",
            "",
            "\1\102",
            "\1\103\2\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "\1\105\4\uffff\1\106",
            "",
            "\10\115\12\uffff\1\111\2\uffff\1\117\22\uffff\1\113\6\uffff\1\114\2\uffff\1\110\2\uffff\1\117\22\uffff\1\112",
            "\12\121\13\uffff\1\117\31\uffff\1\120\5\uffff\1\117",
            "",
            "",
            "",
            "",
            "\1\122",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\124\13\41",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\126\7\41",
            "\1\130",
            "\1\131",
            "\1\132\16\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136\5\uffff\1\137",
            "\1\140",
            "\1\141",
            "\1\143\1\142",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\156",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\160",
            "\52\163\1\161\25\163\1\162\uffbf\163",
            "\1\164",
            "",
            "\2\166",
            "\2\166",
            "\12\167\7\uffff\6\167\32\uffff\6\167",
            "\12\167\7\uffff\6\167\32\uffff\6\167",
            "\10\115",
            "\10\171\15\uffff\1\117\31\uffff\1\170\5\uffff\1\117",
            "",
            "",
            "\12\121",
            "\12\121\13\uffff\1\117\31\uffff\1\120\5\uffff\1\117",
            "\1\172",
            "",
            "\1\173",
            "",
            "\1\174",
            "",
            "\1\175",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "\2\u0096\23\uffff\1\117\31\uffff\1\u0095\5\uffff\1\117",
            "\12\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u0097\1\uffff\4\u0099\1\u0098\1\u0099",
            "\10\171",
            "\10\171\15\uffff\1\117\31\uffff\1\170\5\uffff\1\117",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b0",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\2\u0096",
            "\2\u0096\23\uffff\1\117\31\uffff\1\u0095\5\uffff\1\117",
            "\12\u0099\7\uffff\6\u0099\32\uffff\6\u0099",
            "\1\117\1\uffff\1\117\2\uffff\1\u00b2\11\u00b3\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u0097\1\uffff\4\u0099\1\u0098\1\u0099",
            "\12\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u0097\1\uffff\4\u0099\1\u0098\1\u0099",
            "\1\u00b4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "",
            "\10\u00ca\2\u0099\7\uffff\1\u0099\1\u00c8\2\u0099\1\u0098\1\u0099\21\uffff\1\117\6\uffff\1\u00c9\1\uffff\1\u0099\1\u00c7\2\u0099\1\u0098\1\u0099\21\uffff\1\117",
            "\12\u00cc\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u00cb\1\uffff\4\u0099\1\u0098\1\u0099",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\2\u00dc\10\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u0097\1\uffff\4\u0099\1\u0098\1\u0099",
            "\2\u00dc\10\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u0097\1\uffff\4\u0099\1\u0098\1\u0099",
            "\10\u00ca\2\u0099\7\uffff\6\u0099\32\uffff\6\u0099",
            "\10\u00de\2\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u00dd\1\uffff\4\u0099\1\u0098\1\u0099",
            "\12\u00cc\7\uffff\6\u0099\32\uffff\6\u0099",
            "\12\u00cc\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u00cb\1\uffff\4\u0099\1\u0098\1\u0099",
            "",
            "\1\u00df",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\3\41\1\u00e0\26\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e3",
            "\1\u00e4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00eb",
            "\1\u00ec",
            "\2\u00ee\10\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u00ed\1\uffff\4\u0099\1\u0098\1\u0099",
            "\10\u00de\2\u0099\7\uffff\6\u0099\32\uffff\6\u0099",
            "\10\u00de\2\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u00dd\1\uffff\4\u0099\1\u0098\1\u0099",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00f4",
            "",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\2\u00ee\10\u0099\7\uffff\6\u0099\32\uffff\6\u0099",
            "\2\u00ee\10\u0099\7\uffff\4\u0099\1\u0098\1\u0099\30\uffff\1\u00ed\1\uffff\4\u0099\1\u0098\1\u0099",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00f9",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00fc",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_DOCUMENTATION_COMMENT | RULE_STATEMENT_ANNOTATION | RULE_INLINE_STATEMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_69 = input.LA(1);

                        s = -1;
                        if ( (LA29_69=='*') ) {s = 113;}

                        else if ( (LA29_69=='@') ) {s = 114;}

                        else if ( ((LA29_69>='\u0000' && LA29_69<=')')||(LA29_69>='+' && LA29_69<='?')||(LA29_69>='A' && LA29_69<='\uFFFF')) ) {s = 115;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}