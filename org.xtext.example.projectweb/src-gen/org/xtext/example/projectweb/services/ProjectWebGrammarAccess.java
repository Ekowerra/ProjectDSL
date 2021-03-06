/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.projectweb.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ProjectWebGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProgramWebElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.programWeb");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeclarationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDeclarationsDeclarationParserRuleCall_0_0 = (RuleCall)cDeclarationsAssignment_0.eContents().get(0);
		private final Assignment cNavAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNavWithNavParserRuleCall_1_0 = (RuleCall)cNavAssignment_1.eContents().get(0);
		private final Assignment cGotoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGotoGotoParserRuleCall_2_0 = (RuleCall)cGotoAssignment_2.eContents().get(0);
		private final Assignment cIfAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIfIfParserRuleCall_3_0 = (RuleCall)cIfAssignment_3.eContents().get(0);
		private final Assignment cFonctionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFonctionFonctionParserRuleCall_4_0 = (RuleCall)cFonctionAssignment_4.eContents().get(0);
		private final Assignment cProcAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cProcProcParserRuleCall_5_0 = (RuleCall)cProcAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//programWeb:
		//	declarations+=Declaration*
		//	nav=WithNav
		//	goto=Goto
		//	if=If*
		//	fonction=Fonction*
		//	proc=Proc*
		//	";";
		@Override public ParserRule getRule() { return rule; }
		
		//declarations+=Declaration* nav=WithNav goto=Goto if=If* fonction=Fonction* proc=Proc* ";"
		public Group getGroup() { return cGroup; }
		
		//declarations+=Declaration*
		public Assignment getDeclarationsAssignment_0() { return cDeclarationsAssignment_0; }
		
		//Declaration
		public RuleCall getDeclarationsDeclarationParserRuleCall_0_0() { return cDeclarationsDeclarationParserRuleCall_0_0; }
		
		//nav=WithNav
		public Assignment getNavAssignment_1() { return cNavAssignment_1; }
		
		//WithNav
		public RuleCall getNavWithNavParserRuleCall_1_0() { return cNavWithNavParserRuleCall_1_0; }
		
		//goto=Goto
		public Assignment getGotoAssignment_2() { return cGotoAssignment_2; }
		
		//Goto
		public RuleCall getGotoGotoParserRuleCall_2_0() { return cGotoGotoParserRuleCall_2_0; }
		
		//if=If*
		public Assignment getIfAssignment_3() { return cIfAssignment_3; }
		
		//If
		public RuleCall getIfIfParserRuleCall_3_0() { return cIfIfParserRuleCall_3_0; }
		
		//fonction=Fonction*
		public Assignment getFonctionAssignment_4() { return cFonctionAssignment_4; }
		
		//Fonction
		public RuleCall getFonctionFonctionParserRuleCall_4_0() { return cFonctionFonctionParserRuleCall_4_0; }
		
		//proc=Proc*
		public Assignment getProcAssignment_5() { return cProcAssignment_5; }
		
		//Proc
		public RuleCall getProcProcParserRuleCall_5_0() { return cProcProcParserRuleCall_5_0; }
		
		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.Declaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cVariableParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cContentParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//Declaration:
		//	ID Variable ('=' Content)?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID Variable ('=' Content)?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_1() { return cVariableParserRuleCall_1; }
		
		//('=' Content)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_2_0() { return cEqualsSignKeyword_2_0; }
		
		//Content
		public RuleCall getContentParserRuleCall_2_1() { return cContentParserRuleCall_2_1; }
	}
	public class FonctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.Fonction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Alternatives cAlternatives_0_2 = (Alternatives)cGroup_0.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_0_2_0 = (RuleCall)cAlternatives_0_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_2_1 = (RuleCall)cAlternatives_0_2.eContents().get(1);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Keyword cCommaKeyword_0_3_0 = (Keyword)cGroup_0_3.eContents().get(0);
		private final RuleCall cVariableParserRuleCall_0_3_1 = (RuleCall)cGroup_0_3.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisRightParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Fonction:
		//	ID "(" (STRING | ID) ("," Variable)* ")" | ID "()";
		@Override public ParserRule getRule() { return rule; }
		
		//ID "(" (STRING | ID) ("," Variable)* ")" | ID "()"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID "(" (STRING | ID) ("," Variable)* ")"
		public Group getGroup_0() { return cGroup_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }
		
		//(STRING | ID)
		public Alternatives getAlternatives_0_2() { return cAlternatives_0_2; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0_2_0() { return cSTRINGTerminalRuleCall_0_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_2_1() { return cIDTerminalRuleCall_0_2_1; }
		
		//("," Variable)*
		public Group getGroup_0_3() { return cGroup_0_3; }
		
		//","
		public Keyword getCommaKeyword_0_3_0() { return cCommaKeyword_0_3_0; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_0_3_1() { return cVariableParserRuleCall_0_3_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_0_4() { return cRightParenthesisKeyword_0_4; }
		
		//ID "()"
		public Group getGroup_1() { return cGroup_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_0() { return cIDTerminalRuleCall_1_0; }
		
		//"()"
		public Keyword getLeftParenthesisRightParenthesisKeyword_1_1() { return cLeftParenthesisRightParenthesisKeyword_1_1; }
	}
	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.Content");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFonctionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Content:
		//	STRING | Fonction;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | Fonction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//Fonction
		public RuleCall getFonctionParserRuleCall_1() { return cFonctionParserRuleCall_1; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.Variable");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Variable:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class IfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.If");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cFonctionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cFonctionParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cProcParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//If:
		//	"if(" Fonction ")" "do" Fonction* Proc* "end";
		@Override public ParserRule getRule() { return rule; }
		
		//"if(" Fonction ")" "do" Fonction* Proc* "end"
		public Group getGroup() { return cGroup; }
		
		//"if("
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }
		
		//Fonction
		public RuleCall getFonctionParserRuleCall_1() { return cFonctionParserRuleCall_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//"do"
		public Keyword getDoKeyword_3() { return cDoKeyword_3; }
		
		//Fonction*
		public RuleCall getFonctionParserRuleCall_4() { return cFonctionParserRuleCall_4; }
		
		//Proc*
		public RuleCall getProcParserRuleCall_5() { return cProcParserRuleCall_5; }
		
		//"end"
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class ProcElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.Proc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cGotoParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cFonctionParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cDeclarationParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cProcParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cReturnKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cVariableParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Proc:
		//	"Proc" ID ":"
		//	Goto?
		//	Fonction*
		//	Declaration*
		//	Proc*
		//	"return" Variable ";";
		@Override public ParserRule getRule() { return rule; }
		
		//"Proc" ID ":" Goto? Fonction* Declaration* Proc* "return" Variable ";"
		public Group getGroup() { return cGroup; }
		
		//"Proc"
		public Keyword getProcKeyword_0() { return cProcKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//Goto?
		public RuleCall getGotoParserRuleCall_3() { return cGotoParserRuleCall_3; }
		
		//Fonction*
		public RuleCall getFonctionParserRuleCall_4() { return cFonctionParserRuleCall_4; }
		
		//Declaration*
		public RuleCall getDeclarationParserRuleCall_5() { return cDeclarationParserRuleCall_5; }
		
		//Proc*
		public RuleCall getProcParserRuleCall_6() { return cProcParserRuleCall_6; }
		
		//"return"
		public Keyword getReturnKeyword_7() { return cReturnKeyword_7; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_8() { return cVariableParserRuleCall_8; }
		
		//";"
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}
	public class WithNavElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.WithNav");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//WithNav:
		//	"with" ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"with" ID
		public Group getGroup() { return cGroup; }
		
		//"with"
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class GotoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.projectweb.ProjectWeb.Goto");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGotoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Goto:
		//	"goto" ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"goto" ID
		public Group getGroup() { return cGroup; }
		
		//"goto"
		public Keyword getGotoKeyword_0() { return cGotoKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final ProgramWebElements pProgramWeb;
	private final DeclarationElements pDeclaration;
	private final FonctionElements pFonction;
	private final ContentElements pContent;
	private final VariableElements pVariable;
	private final IfElements pIf;
	private final ProcElements pProc;
	private final WithNavElements pWithNav;
	private final GotoElements pGoto;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProjectWebGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgramWeb = new ProgramWebElements();
		this.pDeclaration = new DeclarationElements();
		this.pFonction = new FonctionElements();
		this.pContent = new ContentElements();
		this.pVariable = new VariableElements();
		this.pIf = new IfElements();
		this.pProc = new ProcElements();
		this.pWithNav = new WithNavElements();
		this.pGoto = new GotoElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.projectweb.ProjectWeb".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//programWeb:
	//	declarations+=Declaration*
	//	nav=WithNav
	//	goto=Goto
	//	if=If*
	//	fonction=Fonction*
	//	proc=Proc*
	//	";";
	public ProgramWebElements getProgramWebAccess() {
		return pProgramWeb;
	}
	
	public ParserRule getProgramWebRule() {
		return getProgramWebAccess().getRule();
	}
	
	//Declaration:
	//	ID Variable ('=' Content)?;
	public DeclarationElements getDeclarationAccess() {
		return pDeclaration;
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}
	
	//Fonction:
	//	ID "(" (STRING | ID) ("," Variable)* ")" | ID "()";
	public FonctionElements getFonctionAccess() {
		return pFonction;
	}
	
	public ParserRule getFonctionRule() {
		return getFonctionAccess().getRule();
	}
	
	//Content:
	//	STRING | Fonction;
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}
	
	//Variable:
	//	ID;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//If:
	//	"if(" Fonction ")" "do" Fonction* Proc* "end";
	public IfElements getIfAccess() {
		return pIf;
	}
	
	public ParserRule getIfRule() {
		return getIfAccess().getRule();
	}
	
	//Proc:
	//	"Proc" ID ":"
	//	Goto?
	//	Fonction*
	//	Declaration*
	//	Proc*
	//	"return" Variable ";";
	public ProcElements getProcAccess() {
		return pProc;
	}
	
	public ParserRule getProcRule() {
		return getProcAccess().getRule();
	}
	
	//WithNav:
	//	"with" ID;
	public WithNavElements getWithNavAccess() {
		return pWithNav;
	}
	
	public ParserRule getWithNavRule() {
		return getWithNavAccess().getRule();
	}
	
	//Goto:
	//	"goto" ID;
	public GotoElements getGotoAccess() {
		return pGoto;
	}
	
	public ParserRule getGotoRule() {
		return getGotoAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
