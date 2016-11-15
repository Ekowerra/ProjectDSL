package org.xtext.example.projectweb.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.projectweb.services.ProjectWebGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectWebParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'('", "')'", "','", "'()'", "'if('", "'do'", "'end'", "'Proc'", "':'", "'return'", "'with'", "'goto'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProjectWebParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectWebParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectWebParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectWeb.g"; }


    	private ProjectWebGrammarAccess grammarAccess;

    	public void setGrammarAccess(ProjectWebGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleprogramWeb"
    // InternalProjectWeb.g:53:1: entryRuleprogramWeb : ruleprogramWeb EOF ;
    public final void entryRuleprogramWeb() throws RecognitionException {
        try {
            // InternalProjectWeb.g:54:1: ( ruleprogramWeb EOF )
            // InternalProjectWeb.g:55:1: ruleprogramWeb EOF
            {
             before(grammarAccess.getProgramWebRule()); 
            pushFollow(FOLLOW_1);
            ruleprogramWeb();

            state._fsp--;

             after(grammarAccess.getProgramWebRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogramWeb"


    // $ANTLR start "ruleprogramWeb"
    // InternalProjectWeb.g:62:1: ruleprogramWeb : ( ( rule__ProgramWeb__Group__0 ) ) ;
    public final void ruleprogramWeb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:66:2: ( ( ( rule__ProgramWeb__Group__0 ) ) )
            // InternalProjectWeb.g:67:2: ( ( rule__ProgramWeb__Group__0 ) )
            {
            // InternalProjectWeb.g:67:2: ( ( rule__ProgramWeb__Group__0 ) )
            // InternalProjectWeb.g:68:3: ( rule__ProgramWeb__Group__0 )
            {
             before(grammarAccess.getProgramWebAccess().getGroup()); 
            // InternalProjectWeb.g:69:3: ( rule__ProgramWeb__Group__0 )
            // InternalProjectWeb.g:69:4: rule__ProgramWeb__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramWebAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogramWeb"


    // $ANTLR start "entryRuleDeclaration"
    // InternalProjectWeb.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalProjectWeb.g:79:1: ( ruleDeclaration EOF )
            // InternalProjectWeb.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalProjectWeb.g:87:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:91:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalProjectWeb.g:92:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalProjectWeb.g:92:2: ( ( rule__Declaration__Group__0 ) )
            // InternalProjectWeb.g:93:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalProjectWeb.g:94:3: ( rule__Declaration__Group__0 )
            // InternalProjectWeb.g:94:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleFonction"
    // InternalProjectWeb.g:103:1: entryRuleFonction : ruleFonction EOF ;
    public final void entryRuleFonction() throws RecognitionException {
        try {
            // InternalProjectWeb.g:104:1: ( ruleFonction EOF )
            // InternalProjectWeb.g:105:1: ruleFonction EOF
            {
             before(grammarAccess.getFonctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFonction();

            state._fsp--;

             after(grammarAccess.getFonctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // InternalProjectWeb.g:112:1: ruleFonction : ( ( rule__Fonction__Alternatives ) ) ;
    public final void ruleFonction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:116:2: ( ( ( rule__Fonction__Alternatives ) ) )
            // InternalProjectWeb.g:117:2: ( ( rule__Fonction__Alternatives ) )
            {
            // InternalProjectWeb.g:117:2: ( ( rule__Fonction__Alternatives ) )
            // InternalProjectWeb.g:118:3: ( rule__Fonction__Alternatives )
            {
             before(grammarAccess.getFonctionAccess().getAlternatives()); 
            // InternalProjectWeb.g:119:3: ( rule__Fonction__Alternatives )
            // InternalProjectWeb.g:119:4: rule__Fonction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Fonction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFonctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleContent"
    // InternalProjectWeb.g:128:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalProjectWeb.g:129:1: ( ruleContent EOF )
            // InternalProjectWeb.g:130:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalProjectWeb.g:137:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:141:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalProjectWeb.g:142:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalProjectWeb.g:142:2: ( ( rule__Content__Alternatives ) )
            // InternalProjectWeb.g:143:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalProjectWeb.g:144:3: ( rule__Content__Alternatives )
            // InternalProjectWeb.g:144:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleVariable"
    // InternalProjectWeb.g:153:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalProjectWeb.g:154:1: ( ruleVariable EOF )
            // InternalProjectWeb.g:155:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalProjectWeb.g:162:1: ruleVariable : ( RULE_ID ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:166:2: ( ( RULE_ID ) )
            // InternalProjectWeb.g:167:2: ( RULE_ID )
            {
            // InternalProjectWeb.g:167:2: ( RULE_ID )
            // InternalProjectWeb.g:168:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleIf"
    // InternalProjectWeb.g:178:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalProjectWeb.g:179:1: ( ruleIf EOF )
            // InternalProjectWeb.g:180:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalProjectWeb.g:187:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:191:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalProjectWeb.g:192:2: ( ( rule__If__Group__0 ) )
            {
            // InternalProjectWeb.g:192:2: ( ( rule__If__Group__0 ) )
            // InternalProjectWeb.g:193:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalProjectWeb.g:194:3: ( rule__If__Group__0 )
            // InternalProjectWeb.g:194:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleProc"
    // InternalProjectWeb.g:203:1: entryRuleProc : ruleProc EOF ;
    public final void entryRuleProc() throws RecognitionException {
        try {
            // InternalProjectWeb.g:204:1: ( ruleProc EOF )
            // InternalProjectWeb.g:205:1: ruleProc EOF
            {
             before(grammarAccess.getProcRule()); 
            pushFollow(FOLLOW_1);
            ruleProc();

            state._fsp--;

             after(grammarAccess.getProcRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProc"


    // $ANTLR start "ruleProc"
    // InternalProjectWeb.g:212:1: ruleProc : ( ( rule__Proc__Group__0 ) ) ;
    public final void ruleProc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:216:2: ( ( ( rule__Proc__Group__0 ) ) )
            // InternalProjectWeb.g:217:2: ( ( rule__Proc__Group__0 ) )
            {
            // InternalProjectWeb.g:217:2: ( ( rule__Proc__Group__0 ) )
            // InternalProjectWeb.g:218:3: ( rule__Proc__Group__0 )
            {
             before(grammarAccess.getProcAccess().getGroup()); 
            // InternalProjectWeb.g:219:3: ( rule__Proc__Group__0 )
            // InternalProjectWeb.g:219:4: rule__Proc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Proc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProc"


    // $ANTLR start "entryRuleWithNav"
    // InternalProjectWeb.g:228:1: entryRuleWithNav : ruleWithNav EOF ;
    public final void entryRuleWithNav() throws RecognitionException {
        try {
            // InternalProjectWeb.g:229:1: ( ruleWithNav EOF )
            // InternalProjectWeb.g:230:1: ruleWithNav EOF
            {
             before(grammarAccess.getWithNavRule()); 
            pushFollow(FOLLOW_1);
            ruleWithNav();

            state._fsp--;

             after(grammarAccess.getWithNavRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWithNav"


    // $ANTLR start "ruleWithNav"
    // InternalProjectWeb.g:237:1: ruleWithNav : ( ( rule__WithNav__Group__0 ) ) ;
    public final void ruleWithNav() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:241:2: ( ( ( rule__WithNav__Group__0 ) ) )
            // InternalProjectWeb.g:242:2: ( ( rule__WithNav__Group__0 ) )
            {
            // InternalProjectWeb.g:242:2: ( ( rule__WithNav__Group__0 ) )
            // InternalProjectWeb.g:243:3: ( rule__WithNav__Group__0 )
            {
             before(grammarAccess.getWithNavAccess().getGroup()); 
            // InternalProjectWeb.g:244:3: ( rule__WithNav__Group__0 )
            // InternalProjectWeb.g:244:4: rule__WithNav__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WithNav__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWithNavAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWithNav"


    // $ANTLR start "entryRuleGoto"
    // InternalProjectWeb.g:253:1: entryRuleGoto : ruleGoto EOF ;
    public final void entryRuleGoto() throws RecognitionException {
        try {
            // InternalProjectWeb.g:254:1: ( ruleGoto EOF )
            // InternalProjectWeb.g:255:1: ruleGoto EOF
            {
             before(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_1);
            ruleGoto();

            state._fsp--;

             after(grammarAccess.getGotoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // InternalProjectWeb.g:262:1: ruleGoto : ( ( rule__Goto__Group__0 ) ) ;
    public final void ruleGoto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:266:2: ( ( ( rule__Goto__Group__0 ) ) )
            // InternalProjectWeb.g:267:2: ( ( rule__Goto__Group__0 ) )
            {
            // InternalProjectWeb.g:267:2: ( ( rule__Goto__Group__0 ) )
            // InternalProjectWeb.g:268:3: ( rule__Goto__Group__0 )
            {
             before(grammarAccess.getGotoAccess().getGroup()); 
            // InternalProjectWeb.g:269:3: ( rule__Goto__Group__0 )
            // InternalProjectWeb.g:269:4: rule__Goto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGotoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoto"


    // $ANTLR start "rule__Fonction__Alternatives"
    // InternalProjectWeb.g:277:1: rule__Fonction__Alternatives : ( ( ( rule__Fonction__Group_0__0 ) ) | ( ( rule__Fonction__Group_1__0 ) ) );
    public final void rule__Fonction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:281:1: ( ( ( rule__Fonction__Group_0__0 ) ) | ( ( rule__Fonction__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else if ( (LA1_1==13) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalProjectWeb.g:282:2: ( ( rule__Fonction__Group_0__0 ) )
                    {
                    // InternalProjectWeb.g:282:2: ( ( rule__Fonction__Group_0__0 ) )
                    // InternalProjectWeb.g:283:3: ( rule__Fonction__Group_0__0 )
                    {
                     before(grammarAccess.getFonctionAccess().getGroup_0()); 
                    // InternalProjectWeb.g:284:3: ( rule__Fonction__Group_0__0 )
                    // InternalProjectWeb.g:284:4: rule__Fonction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fonction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFonctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectWeb.g:288:2: ( ( rule__Fonction__Group_1__0 ) )
                    {
                    // InternalProjectWeb.g:288:2: ( ( rule__Fonction__Group_1__0 ) )
                    // InternalProjectWeb.g:289:3: ( rule__Fonction__Group_1__0 )
                    {
                     before(grammarAccess.getFonctionAccess().getGroup_1()); 
                    // InternalProjectWeb.g:290:3: ( rule__Fonction__Group_1__0 )
                    // InternalProjectWeb.g:290:4: rule__Fonction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fonction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFonctionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Alternatives"


    // $ANTLR start "rule__Fonction__Alternatives_0_2"
    // InternalProjectWeb.g:298:1: rule__Fonction__Alternatives_0_2 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Fonction__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:302:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProjectWeb.g:303:2: ( RULE_STRING )
                    {
                    // InternalProjectWeb.g:303:2: ( RULE_STRING )
                    // InternalProjectWeb.g:304:3: RULE_STRING
                    {
                     before(grammarAccess.getFonctionAccess().getSTRINGTerminalRuleCall_0_2_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getFonctionAccess().getSTRINGTerminalRuleCall_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectWeb.g:309:2: ( RULE_ID )
                    {
                    // InternalProjectWeb.g:309:2: ( RULE_ID )
                    // InternalProjectWeb.g:310:3: RULE_ID
                    {
                     before(grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_2_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Alternatives_0_2"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalProjectWeb.g:319:1: rule__Content__Alternatives : ( ( RULE_STRING ) | ( ruleFonction ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:323:1: ( ( RULE_STRING ) | ( ruleFonction ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectWeb.g:324:2: ( RULE_STRING )
                    {
                    // InternalProjectWeb.g:324:2: ( RULE_STRING )
                    // InternalProjectWeb.g:325:3: RULE_STRING
                    {
                     before(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectWeb.g:330:2: ( ruleFonction )
                    {
                    // InternalProjectWeb.g:330:2: ( ruleFonction )
                    // InternalProjectWeb.g:331:3: ruleFonction
                    {
                     before(grammarAccess.getContentAccess().getFonctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFonction();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getFonctionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__ProgramWeb__Group__0"
    // InternalProjectWeb.g:340:1: rule__ProgramWeb__Group__0 : rule__ProgramWeb__Group__0__Impl rule__ProgramWeb__Group__1 ;
    public final void rule__ProgramWeb__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:344:1: ( rule__ProgramWeb__Group__0__Impl rule__ProgramWeb__Group__1 )
            // InternalProjectWeb.g:345:2: rule__ProgramWeb__Group__0__Impl rule__ProgramWeb__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProgramWeb__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__0"


    // $ANTLR start "rule__ProgramWeb__Group__0__Impl"
    // InternalProjectWeb.g:352:1: rule__ProgramWeb__Group__0__Impl : ( ( rule__ProgramWeb__DeclarationsAssignment_0 )* ) ;
    public final void rule__ProgramWeb__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:356:1: ( ( ( rule__ProgramWeb__DeclarationsAssignment_0 )* ) )
            // InternalProjectWeb.g:357:1: ( ( rule__ProgramWeb__DeclarationsAssignment_0 )* )
            {
            // InternalProjectWeb.g:357:1: ( ( rule__ProgramWeb__DeclarationsAssignment_0 )* )
            // InternalProjectWeb.g:358:2: ( rule__ProgramWeb__DeclarationsAssignment_0 )*
            {
             before(grammarAccess.getProgramWebAccess().getDeclarationsAssignment_0()); 
            // InternalProjectWeb.g:359:2: ( rule__ProgramWeb__DeclarationsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectWeb.g:359:3: rule__ProgramWeb__DeclarationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ProgramWeb__DeclarationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgramWebAccess().getDeclarationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__0__Impl"


    // $ANTLR start "rule__ProgramWeb__Group__1"
    // InternalProjectWeb.g:367:1: rule__ProgramWeb__Group__1 : rule__ProgramWeb__Group__1__Impl rule__ProgramWeb__Group__2 ;
    public final void rule__ProgramWeb__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:371:1: ( rule__ProgramWeb__Group__1__Impl rule__ProgramWeb__Group__2 )
            // InternalProjectWeb.g:372:2: rule__ProgramWeb__Group__1__Impl rule__ProgramWeb__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ProgramWeb__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__1"


    // $ANTLR start "rule__ProgramWeb__Group__1__Impl"
    // InternalProjectWeb.g:379:1: rule__ProgramWeb__Group__1__Impl : ( ( rule__ProgramWeb__NavAssignment_1 ) ) ;
    public final void rule__ProgramWeb__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:383:1: ( ( ( rule__ProgramWeb__NavAssignment_1 ) ) )
            // InternalProjectWeb.g:384:1: ( ( rule__ProgramWeb__NavAssignment_1 ) )
            {
            // InternalProjectWeb.g:384:1: ( ( rule__ProgramWeb__NavAssignment_1 ) )
            // InternalProjectWeb.g:385:2: ( rule__ProgramWeb__NavAssignment_1 )
            {
             before(grammarAccess.getProgramWebAccess().getNavAssignment_1()); 
            // InternalProjectWeb.g:386:2: ( rule__ProgramWeb__NavAssignment_1 )
            // InternalProjectWeb.g:386:3: rule__ProgramWeb__NavAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProgramWeb__NavAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramWebAccess().getNavAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__1__Impl"


    // $ANTLR start "rule__ProgramWeb__Group__2"
    // InternalProjectWeb.g:394:1: rule__ProgramWeb__Group__2 : rule__ProgramWeb__Group__2__Impl rule__ProgramWeb__Group__3 ;
    public final void rule__ProgramWeb__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:398:1: ( rule__ProgramWeb__Group__2__Impl rule__ProgramWeb__Group__3 )
            // InternalProjectWeb.g:399:2: rule__ProgramWeb__Group__2__Impl rule__ProgramWeb__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ProgramWeb__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__2"


    // $ANTLR start "rule__ProgramWeb__Group__2__Impl"
    // InternalProjectWeb.g:406:1: rule__ProgramWeb__Group__2__Impl : ( ( rule__ProgramWeb__GotoAssignment_2 ) ) ;
    public final void rule__ProgramWeb__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:410:1: ( ( ( rule__ProgramWeb__GotoAssignment_2 ) ) )
            // InternalProjectWeb.g:411:1: ( ( rule__ProgramWeb__GotoAssignment_2 ) )
            {
            // InternalProjectWeb.g:411:1: ( ( rule__ProgramWeb__GotoAssignment_2 ) )
            // InternalProjectWeb.g:412:2: ( rule__ProgramWeb__GotoAssignment_2 )
            {
             before(grammarAccess.getProgramWebAccess().getGotoAssignment_2()); 
            // InternalProjectWeb.g:413:2: ( rule__ProgramWeb__GotoAssignment_2 )
            // InternalProjectWeb.g:413:3: rule__ProgramWeb__GotoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProgramWeb__GotoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramWebAccess().getGotoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__2__Impl"


    // $ANTLR start "rule__ProgramWeb__Group__3"
    // InternalProjectWeb.g:421:1: rule__ProgramWeb__Group__3 : rule__ProgramWeb__Group__3__Impl rule__ProgramWeb__Group__4 ;
    public final void rule__ProgramWeb__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:425:1: ( rule__ProgramWeb__Group__3__Impl rule__ProgramWeb__Group__4 )
            // InternalProjectWeb.g:426:2: rule__ProgramWeb__Group__3__Impl rule__ProgramWeb__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProgramWeb__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__3"


    // $ANTLR start "rule__ProgramWeb__Group__3__Impl"
    // InternalProjectWeb.g:433:1: rule__ProgramWeb__Group__3__Impl : ( ( rule__ProgramWeb__IfAssignment_3 )* ) ;
    public final void rule__ProgramWeb__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:437:1: ( ( ( rule__ProgramWeb__IfAssignment_3 )* ) )
            // InternalProjectWeb.g:438:1: ( ( rule__ProgramWeb__IfAssignment_3 )* )
            {
            // InternalProjectWeb.g:438:1: ( ( rule__ProgramWeb__IfAssignment_3 )* )
            // InternalProjectWeb.g:439:2: ( rule__ProgramWeb__IfAssignment_3 )*
            {
             before(grammarAccess.getProgramWebAccess().getIfAssignment_3()); 
            // InternalProjectWeb.g:440:2: ( rule__ProgramWeb__IfAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProjectWeb.g:440:3: rule__ProgramWeb__IfAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ProgramWeb__IfAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramWebAccess().getIfAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__3__Impl"


    // $ANTLR start "rule__ProgramWeb__Group__4"
    // InternalProjectWeb.g:448:1: rule__ProgramWeb__Group__4 : rule__ProgramWeb__Group__4__Impl rule__ProgramWeb__Group__5 ;
    public final void rule__ProgramWeb__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:452:1: ( rule__ProgramWeb__Group__4__Impl rule__ProgramWeb__Group__5 )
            // InternalProjectWeb.g:453:2: rule__ProgramWeb__Group__4__Impl rule__ProgramWeb__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ProgramWeb__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__4"


    // $ANTLR start "rule__ProgramWeb__Group__4__Impl"
    // InternalProjectWeb.g:460:1: rule__ProgramWeb__Group__4__Impl : ( ( rule__ProgramWeb__FonctionAssignment_4 )* ) ;
    public final void rule__ProgramWeb__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:464:1: ( ( ( rule__ProgramWeb__FonctionAssignment_4 )* ) )
            // InternalProjectWeb.g:465:1: ( ( rule__ProgramWeb__FonctionAssignment_4 )* )
            {
            // InternalProjectWeb.g:465:1: ( ( rule__ProgramWeb__FonctionAssignment_4 )* )
            // InternalProjectWeb.g:466:2: ( rule__ProgramWeb__FonctionAssignment_4 )*
            {
             before(grammarAccess.getProgramWebAccess().getFonctionAssignment_4()); 
            // InternalProjectWeb.g:467:2: ( rule__ProgramWeb__FonctionAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjectWeb.g:467:3: rule__ProgramWeb__FonctionAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ProgramWeb__FonctionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgramWebAccess().getFonctionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__4__Impl"


    // $ANTLR start "rule__ProgramWeb__Group__5"
    // InternalProjectWeb.g:475:1: rule__ProgramWeb__Group__5 : rule__ProgramWeb__Group__5__Impl rule__ProgramWeb__Group__6 ;
    public final void rule__ProgramWeb__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:479:1: ( rule__ProgramWeb__Group__5__Impl rule__ProgramWeb__Group__6 )
            // InternalProjectWeb.g:480:2: rule__ProgramWeb__Group__5__Impl rule__ProgramWeb__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ProgramWeb__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__5"


    // $ANTLR start "rule__ProgramWeb__Group__5__Impl"
    // InternalProjectWeb.g:487:1: rule__ProgramWeb__Group__5__Impl : ( ( rule__ProgramWeb__ProcAssignment_5 )* ) ;
    public final void rule__ProgramWeb__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:491:1: ( ( ( rule__ProgramWeb__ProcAssignment_5 )* ) )
            // InternalProjectWeb.g:492:1: ( ( rule__ProgramWeb__ProcAssignment_5 )* )
            {
            // InternalProjectWeb.g:492:1: ( ( rule__ProgramWeb__ProcAssignment_5 )* )
            // InternalProjectWeb.g:493:2: ( rule__ProgramWeb__ProcAssignment_5 )*
            {
             before(grammarAccess.getProgramWebAccess().getProcAssignment_5()); 
            // InternalProjectWeb.g:494:2: ( rule__ProgramWeb__ProcAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectWeb.g:494:3: rule__ProgramWeb__ProcAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ProgramWeb__ProcAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgramWebAccess().getProcAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__5__Impl"


    // $ANTLR start "rule__ProgramWeb__Group__6"
    // InternalProjectWeb.g:502:1: rule__ProgramWeb__Group__6 : rule__ProgramWeb__Group__6__Impl ;
    public final void rule__ProgramWeb__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:506:1: ( rule__ProgramWeb__Group__6__Impl )
            // InternalProjectWeb.g:507:2: rule__ProgramWeb__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProgramWeb__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__6"


    // $ANTLR start "rule__ProgramWeb__Group__6__Impl"
    // InternalProjectWeb.g:513:1: rule__ProgramWeb__Group__6__Impl : ( ';' ) ;
    public final void rule__ProgramWeb__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:517:1: ( ( ';' ) )
            // InternalProjectWeb.g:518:1: ( ';' )
            {
            // InternalProjectWeb.g:518:1: ( ';' )
            // InternalProjectWeb.g:519:2: ';'
            {
             before(grammarAccess.getProgramWebAccess().getSemicolonKeyword_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProgramWebAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__Group__6__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalProjectWeb.g:529:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:533:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalProjectWeb.g:534:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalProjectWeb.g:541:1: rule__Declaration__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:545:1: ( ( RULE_ID ) )
            // InternalProjectWeb.g:546:1: ( RULE_ID )
            {
            // InternalProjectWeb.g:546:1: ( RULE_ID )
            // InternalProjectWeb.g:547:2: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalProjectWeb.g:556:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:560:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalProjectWeb.g:561:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalProjectWeb.g:568:1: rule__Declaration__Group__1__Impl : ( ruleVariable ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:572:1: ( ( ruleVariable ) )
            // InternalProjectWeb.g:573:1: ( ruleVariable )
            {
            // InternalProjectWeb.g:573:1: ( ruleVariable )
            // InternalProjectWeb.g:574:2: ruleVariable
            {
             before(grammarAccess.getDeclarationAccess().getVariableParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getVariableParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // InternalProjectWeb.g:583:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:587:1: ( rule__Declaration__Group__2__Impl )
            // InternalProjectWeb.g:588:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // InternalProjectWeb.g:594:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__Group_2__0 )? ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:598:1: ( ( ( rule__Declaration__Group_2__0 )? ) )
            // InternalProjectWeb.g:599:1: ( ( rule__Declaration__Group_2__0 )? )
            {
            // InternalProjectWeb.g:599:1: ( ( rule__Declaration__Group_2__0 )? )
            // InternalProjectWeb.g:600:2: ( rule__Declaration__Group_2__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_2()); 
            // InternalProjectWeb.g:601:2: ( rule__Declaration__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProjectWeb.g:601:3: rule__Declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group_2__0"
    // InternalProjectWeb.g:610:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:614:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // InternalProjectWeb.g:615:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Declaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__0"


    // $ANTLR start "rule__Declaration__Group_2__0__Impl"
    // InternalProjectWeb.g:622:1: rule__Declaration__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:626:1: ( ( '=' ) )
            // InternalProjectWeb.g:627:1: ( '=' )
            {
            // InternalProjectWeb.g:627:1: ( '=' )
            // InternalProjectWeb.g:628:2: '='
            {
             before(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__0__Impl"


    // $ANTLR start "rule__Declaration__Group_2__1"
    // InternalProjectWeb.g:637:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:641:1: ( rule__Declaration__Group_2__1__Impl )
            // InternalProjectWeb.g:642:2: rule__Declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__1"


    // $ANTLR start "rule__Declaration__Group_2__1__Impl"
    // InternalProjectWeb.g:648:1: rule__Declaration__Group_2__1__Impl : ( ruleContent ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:652:1: ( ( ruleContent ) )
            // InternalProjectWeb.g:653:1: ( ruleContent )
            {
            // InternalProjectWeb.g:653:1: ( ruleContent )
            // InternalProjectWeb.g:654:2: ruleContent
            {
             before(grammarAccess.getDeclarationAccess().getContentParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getContentParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__1__Impl"


    // $ANTLR start "rule__Fonction__Group_0__0"
    // InternalProjectWeb.g:664:1: rule__Fonction__Group_0__0 : rule__Fonction__Group_0__0__Impl rule__Fonction__Group_0__1 ;
    public final void rule__Fonction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:668:1: ( rule__Fonction__Group_0__0__Impl rule__Fonction__Group_0__1 )
            // InternalProjectWeb.g:669:2: rule__Fonction__Group_0__0__Impl rule__Fonction__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Fonction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fonction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__0"


    // $ANTLR start "rule__Fonction__Group_0__0__Impl"
    // InternalProjectWeb.g:676:1: rule__Fonction__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Fonction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:680:1: ( ( RULE_ID ) )
            // InternalProjectWeb.g:681:1: ( RULE_ID )
            {
            // InternalProjectWeb.g:681:1: ( RULE_ID )
            // InternalProjectWeb.g:682:2: RULE_ID
            {
             before(grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__0__Impl"


    // $ANTLR start "rule__Fonction__Group_0__1"
    // InternalProjectWeb.g:691:1: rule__Fonction__Group_0__1 : rule__Fonction__Group_0__1__Impl rule__Fonction__Group_0__2 ;
    public final void rule__Fonction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:695:1: ( rule__Fonction__Group_0__1__Impl rule__Fonction__Group_0__2 )
            // InternalProjectWeb.g:696:2: rule__Fonction__Group_0__1__Impl rule__Fonction__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__Fonction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fonction__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__1"


    // $ANTLR start "rule__Fonction__Group_0__1__Impl"
    // InternalProjectWeb.g:703:1: rule__Fonction__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Fonction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:707:1: ( ( '(' ) )
            // InternalProjectWeb.g:708:1: ( '(' )
            {
            // InternalProjectWeb.g:708:1: ( '(' )
            // InternalProjectWeb.g:709:2: '('
            {
             before(grammarAccess.getFonctionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFonctionAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__1__Impl"


    // $ANTLR start "rule__Fonction__Group_0__2"
    // InternalProjectWeb.g:718:1: rule__Fonction__Group_0__2 : rule__Fonction__Group_0__2__Impl rule__Fonction__Group_0__3 ;
    public final void rule__Fonction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:722:1: ( rule__Fonction__Group_0__2__Impl rule__Fonction__Group_0__3 )
            // InternalProjectWeb.g:723:2: rule__Fonction__Group_0__2__Impl rule__Fonction__Group_0__3
            {
            pushFollow(FOLLOW_13);
            rule__Fonction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fonction__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__2"


    // $ANTLR start "rule__Fonction__Group_0__2__Impl"
    // InternalProjectWeb.g:730:1: rule__Fonction__Group_0__2__Impl : ( ( rule__Fonction__Alternatives_0_2 ) ) ;
    public final void rule__Fonction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:734:1: ( ( ( rule__Fonction__Alternatives_0_2 ) ) )
            // InternalProjectWeb.g:735:1: ( ( rule__Fonction__Alternatives_0_2 ) )
            {
            // InternalProjectWeb.g:735:1: ( ( rule__Fonction__Alternatives_0_2 ) )
            // InternalProjectWeb.g:736:2: ( rule__Fonction__Alternatives_0_2 )
            {
             before(grammarAccess.getFonctionAccess().getAlternatives_0_2()); 
            // InternalProjectWeb.g:737:2: ( rule__Fonction__Alternatives_0_2 )
            // InternalProjectWeb.g:737:3: rule__Fonction__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Fonction__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFonctionAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__2__Impl"


    // $ANTLR start "rule__Fonction__Group_0__3"
    // InternalProjectWeb.g:745:1: rule__Fonction__Group_0__3 : rule__Fonction__Group_0__3__Impl rule__Fonction__Group_0__4 ;
    public final void rule__Fonction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:749:1: ( rule__Fonction__Group_0__3__Impl rule__Fonction__Group_0__4 )
            // InternalProjectWeb.g:750:2: rule__Fonction__Group_0__3__Impl rule__Fonction__Group_0__4
            {
            pushFollow(FOLLOW_13);
            rule__Fonction__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fonction__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__3"


    // $ANTLR start "rule__Fonction__Group_0__3__Impl"
    // InternalProjectWeb.g:757:1: rule__Fonction__Group_0__3__Impl : ( ( rule__Fonction__Group_0_3__0 )* ) ;
    public final void rule__Fonction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:761:1: ( ( ( rule__Fonction__Group_0_3__0 )* ) )
            // InternalProjectWeb.g:762:1: ( ( rule__Fonction__Group_0_3__0 )* )
            {
            // InternalProjectWeb.g:762:1: ( ( rule__Fonction__Group_0_3__0 )* )
            // InternalProjectWeb.g:763:2: ( rule__Fonction__Group_0_3__0 )*
            {
             before(grammarAccess.getFonctionAccess().getGroup_0_3()); 
            // InternalProjectWeb.g:764:2: ( rule__Fonction__Group_0_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProjectWeb.g:764:3: rule__Fonction__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Fonction__Group_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFonctionAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__3__Impl"


    // $ANTLR start "rule__Fonction__Group_0__4"
    // InternalProjectWeb.g:772:1: rule__Fonction__Group_0__4 : rule__Fonction__Group_0__4__Impl ;
    public final void rule__Fonction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:776:1: ( rule__Fonction__Group_0__4__Impl )
            // InternalProjectWeb.g:777:2: rule__Fonction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fonction__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__4"


    // $ANTLR start "rule__Fonction__Group_0__4__Impl"
    // InternalProjectWeb.g:783:1: rule__Fonction__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Fonction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:787:1: ( ( ')' ) )
            // InternalProjectWeb.g:788:1: ( ')' )
            {
            // InternalProjectWeb.g:788:1: ( ')' )
            // InternalProjectWeb.g:789:2: ')'
            {
             before(grammarAccess.getFonctionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFonctionAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0__4__Impl"


    // $ANTLR start "rule__Fonction__Group_0_3__0"
    // InternalProjectWeb.g:799:1: rule__Fonction__Group_0_3__0 : rule__Fonction__Group_0_3__0__Impl rule__Fonction__Group_0_3__1 ;
    public final void rule__Fonction__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:803:1: ( rule__Fonction__Group_0_3__0__Impl rule__Fonction__Group_0_3__1 )
            // InternalProjectWeb.g:804:2: rule__Fonction__Group_0_3__0__Impl rule__Fonction__Group_0_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Fonction__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fonction__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0_3__0"


    // $ANTLR start "rule__Fonction__Group_0_3__0__Impl"
    // InternalProjectWeb.g:811:1: rule__Fonction__Group_0_3__0__Impl : ( ',' ) ;
    public final void rule__Fonction__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:815:1: ( ( ',' ) )
            // InternalProjectWeb.g:816:1: ( ',' )
            {
            // InternalProjectWeb.g:816:1: ( ',' )
            // InternalProjectWeb.g:817:2: ','
            {
             before(grammarAccess.getFonctionAccess().getCommaKeyword_0_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFonctionAccess().getCommaKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0_3__0__Impl"


    // $ANTLR start "rule__Fonction__Group_0_3__1"
    // InternalProjectWeb.g:826:1: rule__Fonction__Group_0_3__1 : rule__Fonction__Group_0_3__1__Impl ;
    public final void rule__Fonction__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:830:1: ( rule__Fonction__Group_0_3__1__Impl )
            // InternalProjectWeb.g:831:2: rule__Fonction__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fonction__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0_3__1"


    // $ANTLR start "rule__Fonction__Group_0_3__1__Impl"
    // InternalProjectWeb.g:837:1: rule__Fonction__Group_0_3__1__Impl : ( ruleVariable ) ;
    public final void rule__Fonction__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:841:1: ( ( ruleVariable ) )
            // InternalProjectWeb.g:842:1: ( ruleVariable )
            {
            // InternalProjectWeb.g:842:1: ( ruleVariable )
            // InternalProjectWeb.g:843:2: ruleVariable
            {
             before(grammarAccess.getFonctionAccess().getVariableParserRuleCall_0_3_1()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFonctionAccess().getVariableParserRuleCall_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_0_3__1__Impl"


    // $ANTLR start "rule__Fonction__Group_1__0"
    // InternalProjectWeb.g:853:1: rule__Fonction__Group_1__0 : rule__Fonction__Group_1__0__Impl rule__Fonction__Group_1__1 ;
    public final void rule__Fonction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:857:1: ( rule__Fonction__Group_1__0__Impl rule__Fonction__Group_1__1 )
            // InternalProjectWeb.g:858:2: rule__Fonction__Group_1__0__Impl rule__Fonction__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Fonction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fonction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_1__0"


    // $ANTLR start "rule__Fonction__Group_1__0__Impl"
    // InternalProjectWeb.g:865:1: rule__Fonction__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Fonction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:869:1: ( ( RULE_ID ) )
            // InternalProjectWeb.g:870:1: ( RULE_ID )
            {
            // InternalProjectWeb.g:870:1: ( RULE_ID )
            // InternalProjectWeb.g:871:2: RULE_ID
            {
             before(grammarAccess.getFonctionAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFonctionAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_1__0__Impl"


    // $ANTLR start "rule__Fonction__Group_1__1"
    // InternalProjectWeb.g:880:1: rule__Fonction__Group_1__1 : rule__Fonction__Group_1__1__Impl ;
    public final void rule__Fonction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:884:1: ( rule__Fonction__Group_1__1__Impl )
            // InternalProjectWeb.g:885:2: rule__Fonction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fonction__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_1__1"


    // $ANTLR start "rule__Fonction__Group_1__1__Impl"
    // InternalProjectWeb.g:891:1: rule__Fonction__Group_1__1__Impl : ( '()' ) ;
    public final void rule__Fonction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:895:1: ( ( '()' ) )
            // InternalProjectWeb.g:896:1: ( '()' )
            {
            // InternalProjectWeb.g:896:1: ( '()' )
            // InternalProjectWeb.g:897:2: '()'
            {
             before(grammarAccess.getFonctionAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFonctionAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group_1__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalProjectWeb.g:907:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:911:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalProjectWeb.g:912:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalProjectWeb.g:919:1: rule__If__Group__0__Impl : ( 'if(' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:923:1: ( ( 'if(' ) )
            // InternalProjectWeb.g:924:1: ( 'if(' )
            {
            // InternalProjectWeb.g:924:1: ( 'if(' )
            // InternalProjectWeb.g:925:2: 'if('
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalProjectWeb.g:934:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:938:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalProjectWeb.g:939:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalProjectWeb.g:946:1: rule__If__Group__1__Impl : ( ruleFonction ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:950:1: ( ( ruleFonction ) )
            // InternalProjectWeb.g:951:1: ( ruleFonction )
            {
            // InternalProjectWeb.g:951:1: ( ruleFonction )
            // InternalProjectWeb.g:952:2: ruleFonction
            {
             before(grammarAccess.getIfAccess().getFonctionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleFonction();

            state._fsp--;

             after(grammarAccess.getIfAccess().getFonctionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalProjectWeb.g:961:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:965:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalProjectWeb.g:966:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalProjectWeb.g:973:1: rule__If__Group__2__Impl : ( ')' ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:977:1: ( ( ')' ) )
            // InternalProjectWeb.g:978:1: ( ')' )
            {
            // InternalProjectWeb.g:978:1: ( ')' )
            // InternalProjectWeb.g:979:2: ')'
            {
             before(grammarAccess.getIfAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalProjectWeb.g:988:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:992:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalProjectWeb.g:993:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalProjectWeb.g:1000:1: rule__If__Group__3__Impl : ( 'do' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1004:1: ( ( 'do' ) )
            // InternalProjectWeb.g:1005:1: ( 'do' )
            {
            // InternalProjectWeb.g:1005:1: ( 'do' )
            // InternalProjectWeb.g:1006:2: 'do'
            {
             before(grammarAccess.getIfAccess().getDoKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getDoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalProjectWeb.g:1015:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1019:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalProjectWeb.g:1020:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalProjectWeb.g:1027:1: rule__If__Group__4__Impl : ( ( ruleFonction )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1031:1: ( ( ( ruleFonction )* ) )
            // InternalProjectWeb.g:1032:1: ( ( ruleFonction )* )
            {
            // InternalProjectWeb.g:1032:1: ( ( ruleFonction )* )
            // InternalProjectWeb.g:1033:2: ( ruleFonction )*
            {
             before(grammarAccess.getIfAccess().getFonctionParserRuleCall_4()); 
            // InternalProjectWeb.g:1034:2: ( ruleFonction )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProjectWeb.g:1034:3: ruleFonction
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleFonction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getFonctionParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalProjectWeb.g:1042:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1046:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalProjectWeb.g:1047:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalProjectWeb.g:1054:1: rule__If__Group__5__Impl : ( ( ruleProc )* ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1058:1: ( ( ( ruleProc )* ) )
            // InternalProjectWeb.g:1059:1: ( ( ruleProc )* )
            {
            // InternalProjectWeb.g:1059:1: ( ( ruleProc )* )
            // InternalProjectWeb.g:1060:2: ( ruleProc )*
            {
             before(grammarAccess.getIfAccess().getProcParserRuleCall_5()); 
            // InternalProjectWeb.g:1061:2: ( ruleProc )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProjectWeb.g:1061:3: ruleProc
            	    {
            	    pushFollow(FOLLOW_8);
            	    ruleProc();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getProcParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalProjectWeb.g:1069:1: rule__If__Group__6 : rule__If__Group__6__Impl ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1073:1: ( rule__If__Group__6__Impl )
            // InternalProjectWeb.g:1074:2: rule__If__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalProjectWeb.g:1080:1: rule__If__Group__6__Impl : ( 'end' ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1084:1: ( ( 'end' ) )
            // InternalProjectWeb.g:1085:1: ( 'end' )
            {
            // InternalProjectWeb.g:1085:1: ( 'end' )
            // InternalProjectWeb.g:1086:2: 'end'
            {
             before(grammarAccess.getIfAccess().getEndKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__Proc__Group__0"
    // InternalProjectWeb.g:1096:1: rule__Proc__Group__0 : rule__Proc__Group__0__Impl rule__Proc__Group__1 ;
    public final void rule__Proc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1100:1: ( rule__Proc__Group__0__Impl rule__Proc__Group__1 )
            // InternalProjectWeb.g:1101:2: rule__Proc__Group__0__Impl rule__Proc__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Proc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__0"


    // $ANTLR start "rule__Proc__Group__0__Impl"
    // InternalProjectWeb.g:1108:1: rule__Proc__Group__0__Impl : ( 'Proc' ) ;
    public final void rule__Proc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1112:1: ( ( 'Proc' ) )
            // InternalProjectWeb.g:1113:1: ( 'Proc' )
            {
            // InternalProjectWeb.g:1113:1: ( 'Proc' )
            // InternalProjectWeb.g:1114:2: 'Proc'
            {
             before(grammarAccess.getProcAccess().getProcKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcAccess().getProcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__0__Impl"


    // $ANTLR start "rule__Proc__Group__1"
    // InternalProjectWeb.g:1123:1: rule__Proc__Group__1 : rule__Proc__Group__1__Impl rule__Proc__Group__2 ;
    public final void rule__Proc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1127:1: ( rule__Proc__Group__1__Impl rule__Proc__Group__2 )
            // InternalProjectWeb.g:1128:2: rule__Proc__Group__1__Impl rule__Proc__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Proc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__1"


    // $ANTLR start "rule__Proc__Group__1__Impl"
    // InternalProjectWeb.g:1135:1: rule__Proc__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Proc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1139:1: ( ( RULE_ID ) )
            // InternalProjectWeb.g:1140:1: ( RULE_ID )
            {
            // InternalProjectWeb.g:1140:1: ( RULE_ID )
            // InternalProjectWeb.g:1141:2: RULE_ID
            {
             before(grammarAccess.getProcAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__1__Impl"


    // $ANTLR start "rule__Proc__Group__2"
    // InternalProjectWeb.g:1150:1: rule__Proc__Group__2 : rule__Proc__Group__2__Impl rule__Proc__Group__3 ;
    public final void rule__Proc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1154:1: ( rule__Proc__Group__2__Impl rule__Proc__Group__3 )
            // InternalProjectWeb.g:1155:2: rule__Proc__Group__2__Impl rule__Proc__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Proc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__2"


    // $ANTLR start "rule__Proc__Group__2__Impl"
    // InternalProjectWeb.g:1162:1: rule__Proc__Group__2__Impl : ( ':' ) ;
    public final void rule__Proc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1166:1: ( ( ':' ) )
            // InternalProjectWeb.g:1167:1: ( ':' )
            {
            // InternalProjectWeb.g:1167:1: ( ':' )
            // InternalProjectWeb.g:1168:2: ':'
            {
             before(grammarAccess.getProcAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProcAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__2__Impl"


    // $ANTLR start "rule__Proc__Group__3"
    // InternalProjectWeb.g:1177:1: rule__Proc__Group__3 : rule__Proc__Group__3__Impl rule__Proc__Group__4 ;
    public final void rule__Proc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1181:1: ( rule__Proc__Group__3__Impl rule__Proc__Group__4 )
            // InternalProjectWeb.g:1182:2: rule__Proc__Group__3__Impl rule__Proc__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Proc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__3"


    // $ANTLR start "rule__Proc__Group__3__Impl"
    // InternalProjectWeb.g:1189:1: rule__Proc__Group__3__Impl : ( ( ruleGoto )? ) ;
    public final void rule__Proc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1193:1: ( ( ( ruleGoto )? ) )
            // InternalProjectWeb.g:1194:1: ( ( ruleGoto )? )
            {
            // InternalProjectWeb.g:1194:1: ( ( ruleGoto )? )
            // InternalProjectWeb.g:1195:2: ( ruleGoto )?
            {
             before(grammarAccess.getProcAccess().getGotoParserRuleCall_3()); 
            // InternalProjectWeb.g:1196:2: ( ruleGoto )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProjectWeb.g:1196:3: ruleGoto
                    {
                    pushFollow(FOLLOW_2);
                    ruleGoto();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcAccess().getGotoParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__3__Impl"


    // $ANTLR start "rule__Proc__Group__4"
    // InternalProjectWeb.g:1204:1: rule__Proc__Group__4 : rule__Proc__Group__4__Impl rule__Proc__Group__5 ;
    public final void rule__Proc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1208:1: ( rule__Proc__Group__4__Impl rule__Proc__Group__5 )
            // InternalProjectWeb.g:1209:2: rule__Proc__Group__4__Impl rule__Proc__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Proc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__4"


    // $ANTLR start "rule__Proc__Group__4__Impl"
    // InternalProjectWeb.g:1216:1: rule__Proc__Group__4__Impl : ( ( ruleFonction )* ) ;
    public final void rule__Proc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1220:1: ( ( ( ruleFonction )* ) )
            // InternalProjectWeb.g:1221:1: ( ( ruleFonction )* )
            {
            // InternalProjectWeb.g:1221:1: ( ( ruleFonction )* )
            // InternalProjectWeb.g:1222:2: ( ruleFonction )*
            {
             before(grammarAccess.getProcAccess().getFonctionParserRuleCall_4()); 
            // InternalProjectWeb.g:1223:2: ( ruleFonction )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==13||LA13_1==16) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalProjectWeb.g:1223:3: ruleFonction
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleFonction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProcAccess().getFonctionParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__4__Impl"


    // $ANTLR start "rule__Proc__Group__5"
    // InternalProjectWeb.g:1231:1: rule__Proc__Group__5 : rule__Proc__Group__5__Impl rule__Proc__Group__6 ;
    public final void rule__Proc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1235:1: ( rule__Proc__Group__5__Impl rule__Proc__Group__6 )
            // InternalProjectWeb.g:1236:2: rule__Proc__Group__5__Impl rule__Proc__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Proc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__5"


    // $ANTLR start "rule__Proc__Group__5__Impl"
    // InternalProjectWeb.g:1243:1: rule__Proc__Group__5__Impl : ( ( ruleDeclaration )* ) ;
    public final void rule__Proc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1247:1: ( ( ( ruleDeclaration )* ) )
            // InternalProjectWeb.g:1248:1: ( ( ruleDeclaration )* )
            {
            // InternalProjectWeb.g:1248:1: ( ( ruleDeclaration )* )
            // InternalProjectWeb.g:1249:2: ( ruleDeclaration )*
            {
             before(grammarAccess.getProcAccess().getDeclarationParserRuleCall_5()); 
            // InternalProjectWeb.g:1250:2: ( ruleDeclaration )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalProjectWeb.g:1250:3: ruleDeclaration
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProcAccess().getDeclarationParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__5__Impl"


    // $ANTLR start "rule__Proc__Group__6"
    // InternalProjectWeb.g:1258:1: rule__Proc__Group__6 : rule__Proc__Group__6__Impl rule__Proc__Group__7 ;
    public final void rule__Proc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1262:1: ( rule__Proc__Group__6__Impl rule__Proc__Group__7 )
            // InternalProjectWeb.g:1263:2: rule__Proc__Group__6__Impl rule__Proc__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Proc__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__6"


    // $ANTLR start "rule__Proc__Group__6__Impl"
    // InternalProjectWeb.g:1270:1: rule__Proc__Group__6__Impl : ( ( ruleProc )* ) ;
    public final void rule__Proc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1274:1: ( ( ( ruleProc )* ) )
            // InternalProjectWeb.g:1275:1: ( ( ruleProc )* )
            {
            // InternalProjectWeb.g:1275:1: ( ( ruleProc )* )
            // InternalProjectWeb.g:1276:2: ( ruleProc )*
            {
             before(grammarAccess.getProcAccess().getProcParserRuleCall_6()); 
            // InternalProjectWeb.g:1277:2: ( ruleProc )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProjectWeb.g:1277:3: ruleProc
            	    {
            	    pushFollow(FOLLOW_8);
            	    ruleProc();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProcAccess().getProcParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__6__Impl"


    // $ANTLR start "rule__Proc__Group__7"
    // InternalProjectWeb.g:1285:1: rule__Proc__Group__7 : rule__Proc__Group__7__Impl rule__Proc__Group__8 ;
    public final void rule__Proc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1289:1: ( rule__Proc__Group__7__Impl rule__Proc__Group__8 )
            // InternalProjectWeb.g:1290:2: rule__Proc__Group__7__Impl rule__Proc__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Proc__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__7"


    // $ANTLR start "rule__Proc__Group__7__Impl"
    // InternalProjectWeb.g:1297:1: rule__Proc__Group__7__Impl : ( 'return' ) ;
    public final void rule__Proc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1301:1: ( ( 'return' ) )
            // InternalProjectWeb.g:1302:1: ( 'return' )
            {
            // InternalProjectWeb.g:1302:1: ( 'return' )
            // InternalProjectWeb.g:1303:2: 'return'
            {
             before(grammarAccess.getProcAccess().getReturnKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProcAccess().getReturnKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__7__Impl"


    // $ANTLR start "rule__Proc__Group__8"
    // InternalProjectWeb.g:1312:1: rule__Proc__Group__8 : rule__Proc__Group__8__Impl rule__Proc__Group__9 ;
    public final void rule__Proc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1316:1: ( rule__Proc__Group__8__Impl rule__Proc__Group__9 )
            // InternalProjectWeb.g:1317:2: rule__Proc__Group__8__Impl rule__Proc__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Proc__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proc__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__8"


    // $ANTLR start "rule__Proc__Group__8__Impl"
    // InternalProjectWeb.g:1324:1: rule__Proc__Group__8__Impl : ( ruleVariable ) ;
    public final void rule__Proc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1328:1: ( ( ruleVariable ) )
            // InternalProjectWeb.g:1329:1: ( ruleVariable )
            {
            // InternalProjectWeb.g:1329:1: ( ruleVariable )
            // InternalProjectWeb.g:1330:2: ruleVariable
            {
             before(grammarAccess.getProcAccess().getVariableParserRuleCall_8()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getProcAccess().getVariableParserRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__8__Impl"


    // $ANTLR start "rule__Proc__Group__9"
    // InternalProjectWeb.g:1339:1: rule__Proc__Group__9 : rule__Proc__Group__9__Impl ;
    public final void rule__Proc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1343:1: ( rule__Proc__Group__9__Impl )
            // InternalProjectWeb.g:1344:2: rule__Proc__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Proc__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__9"


    // $ANTLR start "rule__Proc__Group__9__Impl"
    // InternalProjectWeb.g:1350:1: rule__Proc__Group__9__Impl : ( ';' ) ;
    public final void rule__Proc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1354:1: ( ( ';' ) )
            // InternalProjectWeb.g:1355:1: ( ';' )
            {
            // InternalProjectWeb.g:1355:1: ( ';' )
            // InternalProjectWeb.g:1356:2: ';'
            {
             before(grammarAccess.getProcAccess().getSemicolonKeyword_9()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProcAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proc__Group__9__Impl"


    // $ANTLR start "rule__WithNav__Group__0"
    // InternalProjectWeb.g:1366:1: rule__WithNav__Group__0 : rule__WithNav__Group__0__Impl rule__WithNav__Group__1 ;
    public final void rule__WithNav__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1370:1: ( rule__WithNav__Group__0__Impl rule__WithNav__Group__1 )
            // InternalProjectWeb.g:1371:2: rule__WithNav__Group__0__Impl rule__WithNav__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WithNav__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithNav__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithNav__Group__0"


    // $ANTLR start "rule__WithNav__Group__0__Impl"
    // InternalProjectWeb.g:1378:1: rule__WithNav__Group__0__Impl : ( 'with' ) ;
    public final void rule__WithNav__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1382:1: ( ( 'with' ) )
            // InternalProjectWeb.g:1383:1: ( 'with' )
            {
            // InternalProjectWeb.g:1383:1: ( 'with' )
            // InternalProjectWeb.g:1384:2: 'with'
            {
             before(grammarAccess.getWithNavAccess().getWithKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWithNavAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithNav__Group__0__Impl"


    // $ANTLR start "rule__WithNav__Group__1"
    // InternalProjectWeb.g:1393:1: rule__WithNav__Group__1 : rule__WithNav__Group__1__Impl ;
    public final void rule__WithNav__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1397:1: ( rule__WithNav__Group__1__Impl )
            // InternalProjectWeb.g:1398:2: rule__WithNav__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithNav__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithNav__Group__1"


    // $ANTLR start "rule__WithNav__Group__1__Impl"
    // InternalProjectWeb.g:1404:1: rule__WithNav__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__WithNav__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1408:1: ( ( RULE_ID ) )
            // InternalProjectWeb.g:1409:1: ( RULE_ID )
            {
            // InternalProjectWeb.g:1409:1: ( RULE_ID )
            // InternalProjectWeb.g:1410:2: RULE_ID
            {
             before(grammarAccess.getWithNavAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWithNavAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithNav__Group__1__Impl"


    // $ANTLR start "rule__Goto__Group__0"
    // InternalProjectWeb.g:1420:1: rule__Goto__Group__0 : rule__Goto__Group__0__Impl rule__Goto__Group__1 ;
    public final void rule__Goto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1424:1: ( rule__Goto__Group__0__Impl rule__Goto__Group__1 )
            // InternalProjectWeb.g:1425:2: rule__Goto__Group__0__Impl rule__Goto__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Goto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goto__Group__0"


    // $ANTLR start "rule__Goto__Group__0__Impl"
    // InternalProjectWeb.g:1432:1: rule__Goto__Group__0__Impl : ( 'goto' ) ;
    public final void rule__Goto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1436:1: ( ( 'goto' ) )
            // InternalProjectWeb.g:1437:1: ( 'goto' )
            {
            // InternalProjectWeb.g:1437:1: ( 'goto' )
            // InternalProjectWeb.g:1438:2: 'goto'
            {
             before(grammarAccess.getGotoAccess().getGotoKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGotoAccess().getGotoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goto__Group__0__Impl"


    // $ANTLR start "rule__Goto__Group__1"
    // InternalProjectWeb.g:1447:1: rule__Goto__Group__1 : rule__Goto__Group__1__Impl ;
    public final void rule__Goto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1451:1: ( rule__Goto__Group__1__Impl )
            // InternalProjectWeb.g:1452:2: rule__Goto__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goto__Group__1"


    // $ANTLR start "rule__Goto__Group__1__Impl"
    // InternalProjectWeb.g:1458:1: rule__Goto__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Goto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1462:1: ( ( RULE_ID ) )
            // InternalProjectWeb.g:1463:1: ( RULE_ID )
            {
            // InternalProjectWeb.g:1463:1: ( RULE_ID )
            // InternalProjectWeb.g:1464:2: RULE_ID
            {
             before(grammarAccess.getGotoAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGotoAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goto__Group__1__Impl"


    // $ANTLR start "rule__ProgramWeb__DeclarationsAssignment_0"
    // InternalProjectWeb.g:1474:1: rule__ProgramWeb__DeclarationsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__ProgramWeb__DeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1478:1: ( ( ruleDeclaration ) )
            // InternalProjectWeb.g:1479:2: ( ruleDeclaration )
            {
            // InternalProjectWeb.g:1479:2: ( ruleDeclaration )
            // InternalProjectWeb.g:1480:3: ruleDeclaration
            {
             before(grammarAccess.getProgramWebAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getProgramWebAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__DeclarationsAssignment_0"


    // $ANTLR start "rule__ProgramWeb__NavAssignment_1"
    // InternalProjectWeb.g:1489:1: rule__ProgramWeb__NavAssignment_1 : ( ruleWithNav ) ;
    public final void rule__ProgramWeb__NavAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1493:1: ( ( ruleWithNav ) )
            // InternalProjectWeb.g:1494:2: ( ruleWithNav )
            {
            // InternalProjectWeb.g:1494:2: ( ruleWithNav )
            // InternalProjectWeb.g:1495:3: ruleWithNav
            {
             before(grammarAccess.getProgramWebAccess().getNavWithNavParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWithNav();

            state._fsp--;

             after(grammarAccess.getProgramWebAccess().getNavWithNavParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__NavAssignment_1"


    // $ANTLR start "rule__ProgramWeb__GotoAssignment_2"
    // InternalProjectWeb.g:1504:1: rule__ProgramWeb__GotoAssignment_2 : ( ruleGoto ) ;
    public final void rule__ProgramWeb__GotoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1508:1: ( ( ruleGoto ) )
            // InternalProjectWeb.g:1509:2: ( ruleGoto )
            {
            // InternalProjectWeb.g:1509:2: ( ruleGoto )
            // InternalProjectWeb.g:1510:3: ruleGoto
            {
             before(grammarAccess.getProgramWebAccess().getGotoGotoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGoto();

            state._fsp--;

             after(grammarAccess.getProgramWebAccess().getGotoGotoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__GotoAssignment_2"


    // $ANTLR start "rule__ProgramWeb__IfAssignment_3"
    // InternalProjectWeb.g:1519:1: rule__ProgramWeb__IfAssignment_3 : ( ruleIf ) ;
    public final void rule__ProgramWeb__IfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1523:1: ( ( ruleIf ) )
            // InternalProjectWeb.g:1524:2: ( ruleIf )
            {
            // InternalProjectWeb.g:1524:2: ( ruleIf )
            // InternalProjectWeb.g:1525:3: ruleIf
            {
             before(grammarAccess.getProgramWebAccess().getIfIfParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getProgramWebAccess().getIfIfParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__IfAssignment_3"


    // $ANTLR start "rule__ProgramWeb__FonctionAssignment_4"
    // InternalProjectWeb.g:1534:1: rule__ProgramWeb__FonctionAssignment_4 : ( ruleFonction ) ;
    public final void rule__ProgramWeb__FonctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1538:1: ( ( ruleFonction ) )
            // InternalProjectWeb.g:1539:2: ( ruleFonction )
            {
            // InternalProjectWeb.g:1539:2: ( ruleFonction )
            // InternalProjectWeb.g:1540:3: ruleFonction
            {
             before(grammarAccess.getProgramWebAccess().getFonctionFonctionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFonction();

            state._fsp--;

             after(grammarAccess.getProgramWebAccess().getFonctionFonctionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__FonctionAssignment_4"


    // $ANTLR start "rule__ProgramWeb__ProcAssignment_5"
    // InternalProjectWeb.g:1549:1: rule__ProgramWeb__ProcAssignment_5 : ( ruleProc ) ;
    public final void rule__ProgramWeb__ProcAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectWeb.g:1553:1: ( ( ruleProc ) )
            // InternalProjectWeb.g:1554:2: ( ruleProc )
            {
            // InternalProjectWeb.g:1554:2: ( ruleProc )
            // InternalProjectWeb.g:1555:3: ruleProc
            {
             before(grammarAccess.getProgramWebAccess().getProcProcParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProc();

            state._fsp--;

             after(grammarAccess.getProgramWebAccess().getProcProcParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramWeb__ProcAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});

}