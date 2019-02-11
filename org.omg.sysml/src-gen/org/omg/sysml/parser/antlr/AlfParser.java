/*
 * generated by Xtext 2.16.0
 */
package org.omg.sysml.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.omg.sysml.parser.antlr.internal.InternalAlfParser;
import org.omg.sysml.services.AlfGrammarAccess;

public class AlfParser extends AbstractAntlrParser {

	@Inject
	private AlfGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAlfParser createParser(XtextTokenStream stream) {
		return new InternalAlfParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "UnitDefinition";
	}

	public AlfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AlfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
