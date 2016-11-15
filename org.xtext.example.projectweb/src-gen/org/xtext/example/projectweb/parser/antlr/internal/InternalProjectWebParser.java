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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectWebParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'('", "','", "')'", "'()'", "'if('", "'do'", "'end'", "'Proc'", "':'", "'return'", "'with'", "'goto'"
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




    // $ANTLR start "entryRuleprogramWeb"
    // InternalProjectWeb.g:64:1: entryRuleprogramWeb returns [EObject current=null] : iv_ruleprogramWeb= ruleprogramWeb EOF ;
    public final EObject entryRuleprogramWeb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogramWeb = null;


        try {
            // InternalProjectWeb.g:64:51: (iv_ruleprogramWeb= ruleprogramWeb EOF )
            // InternalProjectWeb.g:65:2: iv_ruleprogramWeb= ruleprogramWeb EOF
            {
             newCompositeNode(grammarAccess.getProgramWebRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogramWeb=ruleprogramWeb();

            state._fsp--;

             current =iv_ruleprogramWeb; 
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
    // $ANTLR end "entryRuleprogramWeb"


    // $ANTLR start "ruleprogramWeb"
    // InternalProjectWeb.g:71:1: ruleprogramWeb returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_nav_1_0= ruleWithNav ) ) ( (lv_goto_2_0= ruleGoto ) ) ( (lv_if_3_0= ruleIf ) )* ( (lv_fonction_4_0= ruleFonction ) )* ( (lv_proc_5_0= ruleProc ) )* otherlv_6= ';' ) ;
    public final EObject ruleprogramWeb() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_declarations_0_0 = null;

        AntlrDatatypeRuleToken lv_nav_1_0 = null;

        AntlrDatatypeRuleToken lv_goto_2_0 = null;

        AntlrDatatypeRuleToken lv_if_3_0 = null;

        AntlrDatatypeRuleToken lv_fonction_4_0 = null;

        AntlrDatatypeRuleToken lv_proc_5_0 = null;



        	enterRule();

        try {
            // InternalProjectWeb.g:77:2: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_nav_1_0= ruleWithNav ) ) ( (lv_goto_2_0= ruleGoto ) ) ( (lv_if_3_0= ruleIf ) )* ( (lv_fonction_4_0= ruleFonction ) )* ( (lv_proc_5_0= ruleProc ) )* otherlv_6= ';' ) )
            // InternalProjectWeb.g:78:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_nav_1_0= ruleWithNav ) ) ( (lv_goto_2_0= ruleGoto ) ) ( (lv_if_3_0= ruleIf ) )* ( (lv_fonction_4_0= ruleFonction ) )* ( (lv_proc_5_0= ruleProc ) )* otherlv_6= ';' )
            {
            // InternalProjectWeb.g:78:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_nav_1_0= ruleWithNav ) ) ( (lv_goto_2_0= ruleGoto ) ) ( (lv_if_3_0= ruleIf ) )* ( (lv_fonction_4_0= ruleFonction ) )* ( (lv_proc_5_0= ruleProc ) )* otherlv_6= ';' )
            // InternalProjectWeb.g:79:3: ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_nav_1_0= ruleWithNav ) ) ( (lv_goto_2_0= ruleGoto ) ) ( (lv_if_3_0= ruleIf ) )* ( (lv_fonction_4_0= ruleFonction ) )* ( (lv_proc_5_0= ruleProc ) )* otherlv_6= ';'
            {
            // InternalProjectWeb.g:79:3: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectWeb.g:80:4: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalProjectWeb.g:80:4: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalProjectWeb.g:81:5: lv_declarations_0_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getProgramWebAccess().getDeclarationsDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramWebRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_0_0,
            	    						"org.xtext.example.projectweb.ProjectWeb.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalProjectWeb.g:98:3: ( (lv_nav_1_0= ruleWithNav ) )
            // InternalProjectWeb.g:99:4: (lv_nav_1_0= ruleWithNav )
            {
            // InternalProjectWeb.g:99:4: (lv_nav_1_0= ruleWithNav )
            // InternalProjectWeb.g:100:5: lv_nav_1_0= ruleWithNav
            {

            					newCompositeNode(grammarAccess.getProgramWebAccess().getNavWithNavParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nav_1_0=ruleWithNav();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramWebRule());
            					}
            					set(
            						current,
            						"nav",
            						lv_nav_1_0,
            						"org.xtext.example.projectweb.ProjectWeb.WithNav");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProjectWeb.g:117:3: ( (lv_goto_2_0= ruleGoto ) )
            // InternalProjectWeb.g:118:4: (lv_goto_2_0= ruleGoto )
            {
            // InternalProjectWeb.g:118:4: (lv_goto_2_0= ruleGoto )
            // InternalProjectWeb.g:119:5: lv_goto_2_0= ruleGoto
            {

            					newCompositeNode(grammarAccess.getProgramWebAccess().getGotoGotoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_goto_2_0=ruleGoto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramWebRule());
            					}
            					set(
            						current,
            						"goto",
            						lv_goto_2_0,
            						"org.xtext.example.projectweb.ProjectWeb.Goto");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProjectWeb.g:136:3: ( (lv_if_3_0= ruleIf ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProjectWeb.g:137:4: (lv_if_3_0= ruleIf )
            	    {
            	    // InternalProjectWeb.g:137:4: (lv_if_3_0= ruleIf )
            	    // InternalProjectWeb.g:138:5: lv_if_3_0= ruleIf
            	    {

            	    					newCompositeNode(grammarAccess.getProgramWebAccess().getIfIfParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_if_3_0=ruleIf();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramWebRule());
            	    					}
            	    					set(
            	    						current,
            	    						"if",
            	    						lv_if_3_0,
            	    						"org.xtext.example.projectweb.ProjectWeb.If");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalProjectWeb.g:155:3: ( (lv_fonction_4_0= ruleFonction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProjectWeb.g:156:4: (lv_fonction_4_0= ruleFonction )
            	    {
            	    // InternalProjectWeb.g:156:4: (lv_fonction_4_0= ruleFonction )
            	    // InternalProjectWeb.g:157:5: lv_fonction_4_0= ruleFonction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramWebAccess().getFonctionFonctionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_fonction_4_0=ruleFonction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramWebRule());
            	    					}
            	    					set(
            	    						current,
            	    						"fonction",
            	    						lv_fonction_4_0,
            	    						"org.xtext.example.projectweb.ProjectWeb.Fonction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalProjectWeb.g:174:3: ( (lv_proc_5_0= ruleProc ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectWeb.g:175:4: (lv_proc_5_0= ruleProc )
            	    {
            	    // InternalProjectWeb.g:175:4: (lv_proc_5_0= ruleProc )
            	    // InternalProjectWeb.g:176:5: lv_proc_5_0= ruleProc
            	    {

            	    					newCompositeNode(grammarAccess.getProgramWebAccess().getProcProcParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_proc_5_0=ruleProc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramWebRule());
            	    					}
            	    					set(
            	    						current,
            	    						"proc",
            	    						lv_proc_5_0,
            	    						"org.xtext.example.projectweb.ProjectWeb.Proc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramWebAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleprogramWeb"


    // $ANTLR start "entryRuleDeclaration"
    // InternalProjectWeb.g:201:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalProjectWeb.g:201:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalProjectWeb.g:202:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration.getText(); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalProjectWeb.g:208:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Variable_1= ruleVariable (kw= '=' this_Content_3= ruleContent )? ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Variable_1 = null;

        AntlrDatatypeRuleToken this_Content_3 = null;



        	enterRule();

        try {
            // InternalProjectWeb.g:214:2: ( (this_ID_0= RULE_ID this_Variable_1= ruleVariable (kw= '=' this_Content_3= ruleContent )? ) )
            // InternalProjectWeb.g:215:2: (this_ID_0= RULE_ID this_Variable_1= ruleVariable (kw= '=' this_Content_3= ruleContent )? )
            {
            // InternalProjectWeb.g:215:2: (this_ID_0= RULE_ID this_Variable_1= ruleVariable (kw= '=' this_Content_3= ruleContent )? )
            // InternalProjectWeb.g:216:3: this_ID_0= RULE_ID this_Variable_1= ruleVariable (kw= '=' this_Content_3= ruleContent )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getDeclarationAccess().getIDTerminalRuleCall_0());
            		

            			newCompositeNode(grammarAccess.getDeclarationAccess().getVariableParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Variable_1=ruleVariable();

            state._fsp--;


            			current.merge(this_Variable_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalProjectWeb.g:233:3: (kw= '=' this_Content_3= ruleContent )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProjectWeb.g:234:4: kw= '=' this_Content_3= ruleContent
                    {
                    kw=(Token)match(input,12,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getDeclarationAccess().getContentParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Content_3=ruleContent();

                    state._fsp--;


                    				current.merge(this_Content_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleFonction"
    // InternalProjectWeb.g:254:1: entryRuleFonction returns [String current=null] : iv_ruleFonction= ruleFonction EOF ;
    public final String entryRuleFonction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFonction = null;


        try {
            // InternalProjectWeb.g:254:48: (iv_ruleFonction= ruleFonction EOF )
            // InternalProjectWeb.g:255:2: iv_ruleFonction= ruleFonction EOF
            {
             newCompositeNode(grammarAccess.getFonctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonction=ruleFonction();

            state._fsp--;

             current =iv_ruleFonction.getText(); 
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
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // InternalProjectWeb.g:261:1: ruleFonction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '(' (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) (kw= ',' this_Variable_5= ruleVariable )* kw= ')' ) | (this_ID_7= RULE_ID kw= '()' ) ) ;
    public final AntlrDatatypeRuleToken ruleFonction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_STRING_2=null;
        Token this_ID_3=null;
        Token this_ID_7=null;
        AntlrDatatypeRuleToken this_Variable_5 = null;



        	enterRule();

        try {
            // InternalProjectWeb.g:267:2: ( ( (this_ID_0= RULE_ID kw= '(' (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) (kw= ',' this_Variable_5= ruleVariable )* kw= ')' ) | (this_ID_7= RULE_ID kw= '()' ) ) )
            // InternalProjectWeb.g:268:2: ( (this_ID_0= RULE_ID kw= '(' (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) (kw= ',' this_Variable_5= ruleVariable )* kw= ')' ) | (this_ID_7= RULE_ID kw= '()' ) )
            {
            // InternalProjectWeb.g:268:2: ( (this_ID_0= RULE_ID kw= '(' (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) (kw= ',' this_Variable_5= ruleVariable )* kw= ')' ) | (this_ID_7= RULE_ID kw= '()' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==13) ) {
                    alt8=1;
                }
                else if ( (LA8_1==16) ) {
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
                    // InternalProjectWeb.g:269:3: (this_ID_0= RULE_ID kw= '(' (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) (kw= ',' this_Variable_5= ruleVariable )* kw= ')' )
                    {
                    // InternalProjectWeb.g:269:3: (this_ID_0= RULE_ID kw= '(' (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) (kw= ',' this_Variable_5= ruleVariable )* kw= ')' )
                    // InternalProjectWeb.g:270:4: this_ID_0= RULE_ID kw= '(' (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) (kw= ',' this_Variable_5= ruleVariable )* kw= ')'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,13,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFonctionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalProjectWeb.g:282:4: (this_STRING_2= RULE_STRING | this_ID_3= RULE_ID )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_STRING) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalProjectWeb.g:283:5: this_STRING_2= RULE_STRING
                            {
                            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            					current.merge(this_STRING_2);
                            				

                            					newLeafNode(this_STRING_2, grammarAccess.getFonctionAccess().getSTRINGTerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalProjectWeb.g:291:5: this_ID_3= RULE_ID
                            {
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                            					current.merge(this_ID_3);
                            				

                            					newLeafNode(this_ID_3, grammarAccess.getFonctionAccess().getIDTerminalRuleCall_0_2_1());
                            				

                            }
                            break;

                    }

                    // InternalProjectWeb.g:299:4: (kw= ',' this_Variable_5= ruleVariable )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalProjectWeb.g:300:5: kw= ',' this_Variable_5= ruleVariable
                    	    {
                    	    kw=(Token)match(input,14,FOLLOW_8); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFonctionAccess().getCommaKeyword_0_3_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFonctionAccess().getVariableParserRuleCall_0_3_1());
                    	    				
                    	    pushFollow(FOLLOW_12);
                    	    this_Variable_5=ruleVariable();

                    	    state._fsp--;


                    	    					current.merge(this_Variable_5);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    kw=(Token)match(input,15,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFonctionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectWeb.g:323:3: (this_ID_7= RULE_ID kw= '()' )
                    {
                    // InternalProjectWeb.g:323:3: (this_ID_7= RULE_ID kw= '()' )
                    // InternalProjectWeb.g:324:4: this_ID_7= RULE_ID kw= '()'
                    {
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_13); 

                    				current.merge(this_ID_7);
                    			

                    				newLeafNode(this_ID_7, grammarAccess.getFonctionAccess().getIDTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFonctionAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleContent"
    // InternalProjectWeb.g:341:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // InternalProjectWeb.g:341:47: (iv_ruleContent= ruleContent EOF )
            // InternalProjectWeb.g:342:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent.getText(); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalProjectWeb.g:348:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Fonction_1= ruleFonction ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_Fonction_1 = null;



        	enterRule();

        try {
            // InternalProjectWeb.g:354:2: ( (this_STRING_0= RULE_STRING | this_Fonction_1= ruleFonction ) )
            // InternalProjectWeb.g:355:2: (this_STRING_0= RULE_STRING | this_Fonction_1= ruleFonction )
            {
            // InternalProjectWeb.g:355:2: (this_STRING_0= RULE_STRING | this_Fonction_1= ruleFonction )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProjectWeb.g:356:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProjectWeb.g:364:3: this_Fonction_1= ruleFonction
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getFonctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fonction_1=ruleFonction();

                    state._fsp--;


                    			current.merge(this_Fonction_1);
                    		

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleVariable"
    // InternalProjectWeb.g:378:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // InternalProjectWeb.g:378:48: (iv_ruleVariable= ruleVariable EOF )
            // InternalProjectWeb.g:379:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalProjectWeb.g:385:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalProjectWeb.g:391:2: (this_ID_0= RULE_ID )
            // InternalProjectWeb.g:392:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getVariableAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleIf"
    // InternalProjectWeb.g:402:1: entryRuleIf returns [String current=null] : iv_ruleIf= ruleIf EOF ;
    public final String entryRuleIf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIf = null;


        try {
            // InternalProjectWeb.g:402:42: (iv_ruleIf= ruleIf EOF )
            // InternalProjectWeb.g:403:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf.getText(); 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalProjectWeb.g:409:1: ruleIf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if(' this_Fonction_1= ruleFonction kw= ')' kw= 'do' (this_Fonction_4= ruleFonction )* (this_Proc_5= ruleProc )* kw= 'end' ) ;
    public final AntlrDatatypeRuleToken ruleIf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Fonction_1 = null;

        AntlrDatatypeRuleToken this_Fonction_4 = null;

        AntlrDatatypeRuleToken this_Proc_5 = null;



        	enterRule();

        try {
            // InternalProjectWeb.g:415:2: ( (kw= 'if(' this_Fonction_1= ruleFonction kw= ')' kw= 'do' (this_Fonction_4= ruleFonction )* (this_Proc_5= ruleProc )* kw= 'end' ) )
            // InternalProjectWeb.g:416:2: (kw= 'if(' this_Fonction_1= ruleFonction kw= ')' kw= 'do' (this_Fonction_4= ruleFonction )* (this_Proc_5= ruleProc )* kw= 'end' )
            {
            // InternalProjectWeb.g:416:2: (kw= 'if(' this_Fonction_1= ruleFonction kw= ')' kw= 'do' (this_Fonction_4= ruleFonction )* (this_Proc_5= ruleProc )* kw= 'end' )
            // InternalProjectWeb.g:417:3: kw= 'if(' this_Fonction_1= ruleFonction kw= ')' kw= 'do' (this_Fonction_4= ruleFonction )* (this_Proc_5= ruleProc )* kw= 'end'
            {
            kw=(Token)match(input,17,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIfAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIfAccess().getFonctionParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_Fonction_1=ruleFonction();

            state._fsp--;


            			current.merge(this_Fonction_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIfAccess().getRightParenthesisKeyword_2());
            		
            kw=(Token)match(input,18,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIfAccess().getDoKeyword_3());
            		
            // InternalProjectWeb.g:442:3: (this_Fonction_4= ruleFonction )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProjectWeb.g:443:4: this_Fonction_4= ruleFonction
            	    {

            	    				newCompositeNode(grammarAccess.getIfAccess().getFonctionParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_16);
            	    this_Fonction_4=ruleFonction();

            	    state._fsp--;


            	    				current.merge(this_Fonction_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalProjectWeb.g:454:3: (this_Proc_5= ruleProc )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProjectWeb.g:455:4: this_Proc_5= ruleProc
            	    {

            	    				newCompositeNode(grammarAccess.getIfAccess().getProcParserRuleCall_5());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_Proc_5=ruleProc();

            	    state._fsp--;


            	    				current.merge(this_Proc_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            kw=(Token)match(input,19,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIfAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleProc"
    // InternalProjectWeb.g:475:1: entryRuleProc returns [String current=null] : iv_ruleProc= ruleProc EOF ;
    public final String entryRuleProc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProc = null;


        try {
            // InternalProjectWeb.g:475:44: (iv_ruleProc= ruleProc EOF )
            // InternalProjectWeb.g:476:2: iv_ruleProc= ruleProc EOF
            {
             newCompositeNode(grammarAccess.getProcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProc=ruleProc();

            state._fsp--;

             current =iv_ruleProc.getText(); 
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
    // $ANTLR end "entryRuleProc"


    // $ANTLR start "ruleProc"
    // InternalProjectWeb.g:482:1: ruleProc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Proc' this_ID_1= RULE_ID kw= ':' (this_Goto_3= ruleGoto )? (this_Fonction_4= ruleFonction )* (this_Declaration_5= ruleDeclaration )* (this_Proc_6= ruleProc )* kw= 'return' this_Variable_8= ruleVariable kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleProc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Goto_3 = null;

        AntlrDatatypeRuleToken this_Fonction_4 = null;

        AntlrDatatypeRuleToken this_Declaration_5 = null;

        AntlrDatatypeRuleToken this_Proc_6 = null;

        AntlrDatatypeRuleToken this_Variable_8 = null;



        	enterRule();

        try {
            // InternalProjectWeb.g:488:2: ( (kw= 'Proc' this_ID_1= RULE_ID kw= ':' (this_Goto_3= ruleGoto )? (this_Fonction_4= ruleFonction )* (this_Declaration_5= ruleDeclaration )* (this_Proc_6= ruleProc )* kw= 'return' this_Variable_8= ruleVariable kw= ';' ) )
            // InternalProjectWeb.g:489:2: (kw= 'Proc' this_ID_1= RULE_ID kw= ':' (this_Goto_3= ruleGoto )? (this_Fonction_4= ruleFonction )* (this_Declaration_5= ruleDeclaration )* (this_Proc_6= ruleProc )* kw= 'return' this_Variable_8= ruleVariable kw= ';' )
            {
            // InternalProjectWeb.g:489:2: (kw= 'Proc' this_ID_1= RULE_ID kw= ':' (this_Goto_3= ruleGoto )? (this_Fonction_4= ruleFonction )* (this_Declaration_5= ruleDeclaration )* (this_Proc_6= ruleProc )* kw= 'return' this_Variable_8= ruleVariable kw= ';' )
            // InternalProjectWeb.g:490:3: kw= 'Proc' this_ID_1= RULE_ID kw= ':' (this_Goto_3= ruleGoto )? (this_Fonction_4= ruleFonction )* (this_Declaration_5= ruleDeclaration )* (this_Proc_6= ruleProc )* kw= 'return' this_Variable_8= ruleVariable kw= ';'
            {
            kw=(Token)match(input,20,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getProcAccess().getProcKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getProcAccess().getIDTerminalRuleCall_1());
            		
            kw=(Token)match(input,21,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getProcAccess().getColonKeyword_2());
            		
            // InternalProjectWeb.g:507:3: (this_Goto_3= ruleGoto )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProjectWeb.g:508:4: this_Goto_3= ruleGoto
                    {

                    				newCompositeNode(grammarAccess.getProcAccess().getGotoParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_20);
                    this_Goto_3=ruleGoto();

                    state._fsp--;


                    				current.merge(this_Goto_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalProjectWeb.g:519:3: (this_Fonction_4= ruleFonction )*
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
            	    // InternalProjectWeb.g:520:4: this_Fonction_4= ruleFonction
            	    {

            	    				newCompositeNode(grammarAccess.getProcAccess().getFonctionParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_20);
            	    this_Fonction_4=ruleFonction();

            	    state._fsp--;


            	    				current.merge(this_Fonction_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalProjectWeb.g:531:3: (this_Declaration_5= ruleDeclaration )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalProjectWeb.g:532:4: this_Declaration_5= ruleDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getProcAccess().getDeclarationParserRuleCall_5());
            	    			
            	    pushFollow(FOLLOW_20);
            	    this_Declaration_5=ruleDeclaration();

            	    state._fsp--;


            	    				current.merge(this_Declaration_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalProjectWeb.g:543:3: (this_Proc_6= ruleProc )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProjectWeb.g:544:4: this_Proc_6= ruleProc
            	    {

            	    				newCompositeNode(grammarAccess.getProcAccess().getProcParserRuleCall_6());
            	    			
            	    pushFollow(FOLLOW_21);
            	    this_Proc_6=ruleProc();

            	    state._fsp--;


            	    				current.merge(this_Proc_6);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            kw=(Token)match(input,22,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getProcAccess().getReturnKeyword_7());
            		

            			newCompositeNode(grammarAccess.getProcAccess().getVariableParserRuleCall_8());
            		
            pushFollow(FOLLOW_22);
            this_Variable_8=ruleVariable();

            state._fsp--;


            			current.merge(this_Variable_8);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,11,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getProcAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleProc"


    // $ANTLR start "entryRuleWithNav"
    // InternalProjectWeb.g:579:1: entryRuleWithNav returns [String current=null] : iv_ruleWithNav= ruleWithNav EOF ;
    public final String entryRuleWithNav() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWithNav = null;


        try {
            // InternalProjectWeb.g:579:47: (iv_ruleWithNav= ruleWithNav EOF )
            // InternalProjectWeb.g:580:2: iv_ruleWithNav= ruleWithNav EOF
            {
             newCompositeNode(grammarAccess.getWithNavRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithNav=ruleWithNav();

            state._fsp--;

             current =iv_ruleWithNav.getText(); 
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
    // $ANTLR end "entryRuleWithNav"


    // $ANTLR start "ruleWithNav"
    // InternalProjectWeb.g:586:1: ruleWithNav returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'with' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleWithNav() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalProjectWeb.g:592:2: ( (kw= 'with' this_ID_1= RULE_ID ) )
            // InternalProjectWeb.g:593:2: (kw= 'with' this_ID_1= RULE_ID )
            {
            // InternalProjectWeb.g:593:2: (kw= 'with' this_ID_1= RULE_ID )
            // InternalProjectWeb.g:594:3: kw= 'with' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,23,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getWithNavAccess().getWithKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getWithNavAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleWithNav"


    // $ANTLR start "entryRuleGoto"
    // InternalProjectWeb.g:610:1: entryRuleGoto returns [String current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final String entryRuleGoto() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoto = null;


        try {
            // InternalProjectWeb.g:610:44: (iv_ruleGoto= ruleGoto EOF )
            // InternalProjectWeb.g:611:2: iv_ruleGoto= ruleGoto EOF
            {
             newCompositeNode(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoto=ruleGoto();

            state._fsp--;

             current =iv_ruleGoto.getText(); 
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
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // InternalProjectWeb.g:617:1: ruleGoto returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goto' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleGoto() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalProjectWeb.g:623:2: ( (kw= 'goto' this_ID_1= RULE_ID ) )
            // InternalProjectWeb.g:624:2: (kw= 'goto' this_ID_1= RULE_ID )
            {
            // InternalProjectWeb.g:624:2: (kw= 'goto' this_ID_1= RULE_ID )
            // InternalProjectWeb.g:625:3: kw= 'goto' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,24,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGotoAccess().getGotoKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getGotoAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleGoto"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000120810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001D00010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000D00010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});

}