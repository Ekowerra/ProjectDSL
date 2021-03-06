/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.projectweb.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.projectweb.parser.antlr.internal.InternalProjectWebParser;
import org.xtext.example.projectweb.services.ProjectWebGrammarAccess;

public class ProjectWebParser extends AbstractAntlrParser {

	@Inject
	private ProjectWebGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProjectWebParser createParser(XtextTokenStream stream) {
		return new InternalProjectWebParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "programWeb";
	}

	public ProjectWebGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProjectWebGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
