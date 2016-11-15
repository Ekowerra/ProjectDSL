/*
 * generated by Xtext 2.10.0
 */
grammar InternalProjectWeb;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.projectweb.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.projectweb.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.projectweb.services.ProjectWebGrammarAccess;

}

@parser::members {

 	private ProjectWebGrammarAccess grammarAccess;

    public InternalProjectWebParser(TokenStream input, ProjectWebGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "programWeb";
   	}

   	@Override
   	protected ProjectWebGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleprogramWeb
entryRuleprogramWeb returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramWebRule()); }
	iv_ruleprogramWeb=ruleprogramWeb
	{ $current=$iv_ruleprogramWeb.current; }
	EOF;

// Rule programWeb
ruleprogramWeb returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getProgramWebAccess().getDeclarationsDeclarationParserRuleCall_0_0());
				}
				lv_declarations_0_0=ruleDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramWebRule());
					}
					add(
						$current,
						"declarations",
						lv_declarations_0_0,
						"org.xtext.example.projectweb.ProjectWeb.Declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramWebAccess().getNavWithNavParserRuleCall_1_0());
				}
				lv_nav_1_0=ruleWithNav
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramWebRule());
					}
					set(
						$current,
						"nav",
						lv_nav_1_0,
						"org.xtext.example.projectweb.ProjectWeb.WithNav");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramWebAccess().getGotoGotoParserRuleCall_2_0());
				}
				lv_goto_2_0=ruleGoto
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramWebRule());
					}
					set(
						$current,
						"goto",
						lv_goto_2_0,
						"org.xtext.example.projectweb.ProjectWeb.Goto");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramWebAccess().getIfIfParserRuleCall_3_0());
				}
				lv_if_3_0=ruleIf
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramWebRule());
					}
					set(
						$current,
						"if",
						lv_if_3_0,
						"org.xtext.example.projectweb.ProjectWeb.If");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramWebAccess().getFonctionFonctionParserRuleCall_4_0());
				}
				lv_fonction_4_0=ruleFonction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramWebRule());
					}
					set(
						$current,
						"fonction",
						lv_fonction_4_0,
						"org.xtext.example.projectweb.ProjectWeb.Fonction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramWebAccess().getProcProcParserRuleCall_5_0());
				}
				lv_proc_5_0=ruleProc
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramWebRule());
					}
					set(
						$current,
						"proc",
						lv_proc_5_0,
						"org.xtext.example.projectweb.ProjectWeb.Proc");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getProgramWebAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current.getText(); }
	EOF;

// Rule Declaration
ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getDeclarationAccess().getIDTerminalRuleCall_0());
		}
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getVariableParserRuleCall_1());
		}
		this_Variable_1=ruleVariable
		{
			$current.merge(this_Variable_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='='
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getDeclarationAccess().getContentParserRuleCall_2_1());
			}
			this_Content_3=ruleContent
			{
				$current.merge(this_Content_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleFonction
entryRuleFonction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFonctionRule()); }
	iv_ruleFonction=ruleFonction
	{ $current=$iv_ruleFonction.current.getText(); }
	EOF;

// Rule Fonction
ruleFonction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_0());
			}
			kw='('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFonctionAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				this_STRING_2=RULE_STRING
				{
					$current.merge(this_STRING_2);
				}
				{
					newLeafNode(this_STRING_2, grammarAccess.getFonctionAccess().getSTRINGTerminalRuleCall_0_2_0());
				}
				    |
				this_ID_3=RULE_ID
				{
					$current.merge(this_ID_3);
				}
				{
					newLeafNode(this_ID_3, grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_2_1());
				}
			)
			(
				kw=','
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getFonctionAccess().getCommaKeyword_0_3_0());
				}
				{
					newCompositeNode(grammarAccess.getFonctionAccess().getVariableParserRuleCall_0_3_1());
				}
				this_Variable_5=ruleVariable
				{
					$current.merge(this_Variable_5);
				}
				{
					afterParserOrEnumRuleCall();
				}
			)*
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFonctionAccess().getRightParenthesisKeyword_0_4());
			}
		)
		    |
		(
			this_ID_7=RULE_ID
			{
				$current.merge(this_ID_7);
			}
			{
				newLeafNode(this_ID_7, grammarAccess.getFonctionAccess().getIDTerminalRuleCall_1_0());
			}
			kw='()'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFonctionAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleContent
entryRuleContent returns [String current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_ruleContent=ruleContent
	{ $current=$iv_ruleContent.current.getText(); }
	EOF;

// Rule Content
ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getContentAccess().getFonctionParserRuleCall_1());
		}
		this_Fonction_1=ruleFonction
		{
			$current.merge(this_Fonction_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current.getText(); }
	EOF;

// Rule Variable
ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getVariableAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleIf
entryRuleIf returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current.getText(); }
	EOF;

// Rule If
ruleIf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='if('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIfAccess().getIfKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getIfAccess().getFonctionParserRuleCall_1());
		}
		this_Fonction_1=ruleFonction
		{
			$current.merge(this_Fonction_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIfAccess().getRightParenthesisKeyword_2());
		}
		kw='do'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIfAccess().getDoKeyword_3());
		}
		(
			{
				newCompositeNode(grammarAccess.getIfAccess().getFonctionParserRuleCall_4());
			}
			this_Fonction_4=ruleFonction
			{
				$current.merge(this_Fonction_4);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		(
			{
				newCompositeNode(grammarAccess.getIfAccess().getProcParserRuleCall_5());
			}
			this_Proc_5=ruleProc
			{
				$current.merge(this_Proc_5);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		kw='end'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIfAccess().getEndKeyword_6());
		}
	)
;

// Entry rule entryRuleProc
entryRuleProc returns [String current=null]:
	{ newCompositeNode(grammarAccess.getProcRule()); }
	iv_ruleProc=ruleProc
	{ $current=$iv_ruleProc.current.getText(); }
	EOF;

// Rule Proc
ruleProc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Proc'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProcAccess().getProcKeyword_0());
		}
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getProcAccess().getIDTerminalRuleCall_1());
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProcAccess().getColonKeyword_2());
		}
		(
			{
				newCompositeNode(grammarAccess.getProcAccess().getGotoParserRuleCall_3());
			}
			this_Goto_3=ruleGoto
			{
				$current.merge(this_Goto_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			{
				newCompositeNode(grammarAccess.getProcAccess().getFonctionParserRuleCall_4());
			}
			this_Fonction_4=ruleFonction
			{
				$current.merge(this_Fonction_4);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		(
			{
				newCompositeNode(grammarAccess.getProcAccess().getDeclarationParserRuleCall_5());
			}
			this_Declaration_5=ruleDeclaration
			{
				$current.merge(this_Declaration_5);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		(
			{
				newCompositeNode(grammarAccess.getProcAccess().getProcParserRuleCall_6());
			}
			this_Proc_6=ruleProc
			{
				$current.merge(this_Proc_6);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		kw='return'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProcAccess().getReturnKeyword_7());
		}
		{
			newCompositeNode(grammarAccess.getProcAccess().getVariableParserRuleCall_8());
		}
		this_Variable_8=ruleVariable
		{
			$current.merge(this_Variable_8);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProcAccess().getSemicolonKeyword_9());
		}
	)
;

// Entry rule entryRuleWithNav
entryRuleWithNav returns [String current=null]:
	{ newCompositeNode(grammarAccess.getWithNavRule()); }
	iv_ruleWithNav=ruleWithNav
	{ $current=$iv_ruleWithNav.current.getText(); }
	EOF;

// Rule WithNav
ruleWithNav returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='with'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getWithNavAccess().getWithKeyword_0());
		}
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getWithNavAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleGoto
entryRuleGoto returns [String current=null]:
	{ newCompositeNode(grammarAccess.getGotoRule()); }
	iv_ruleGoto=ruleGoto
	{ $current=$iv_ruleGoto.current.getText(); }
	EOF;

// Rule Goto
ruleGoto returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='goto'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGotoAccess().getGotoKeyword_0());
		}
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getGotoAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
