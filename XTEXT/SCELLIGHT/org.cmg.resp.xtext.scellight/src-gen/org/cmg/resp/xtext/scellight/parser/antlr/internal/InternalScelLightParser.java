package org.cmg.resp.xtext.scellight.parser.antlr.internal; 

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
import org.cmg.resp.xtext.scellight.services.ScelLightGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScelLightParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'attribute'", "':'", "';'", "'projection'", "'='", "'['", "']'", "'->'", "'const'", "'component'", "'('", "','", "')'", "'{'", "'}'", "'|'", "'nil'", "'<'", "'>'", "'id'", "'function'", "'process'", "'replace'", "'get'", "'@'", "'query'", "'put'", "'*'", "'?'", "'while'", "'if'", "'else'", "'&'", "'!'", "'+'", "'-'", "'/'", "'true'", "'false'", "'self'", "'.'", "'factorial'", "'ln'", "'mod'", "'pow'", "'floor'", "'ceil'", "'min'", "'man'", "'sin'", "'cos'", "'tan'", "'atan'", "'asin'", "'acos'", "'system'", "'||'", "'bool'", "'int'", "'double'", "'string'", "'!='", "'<='", "'>='"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalScelLightParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScelLightParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScelLightParser.tokenNames; }
    public String getGrammarFileName() { return "../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g"; }



     	private ScelLightGrammarAccess grammarAccess;
     	
        public InternalScelLightParser(TokenStream input, ScelLightGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ScelLightGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_constants_0_0= ruleConstantDeclaration ) ) | ( (lv_projections_1_0= ruleProjectionDeclaration ) ) | ( (lv_functions_2_0= ruleFunctionDeclaration ) ) | ( (lv_attributes_3_0= ruleAttributeDeclaration ) ) | ( (lv_processes_4_0= ruleProcessDeclaration ) ) | ( (lv_components_5_0= ruleComponentDeclaration ) ) | ( (lv_systems_6_0= ruleSystemDeclaration ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_constants_0_0 = null;

        EObject lv_projections_1_0 = null;

        EObject lv_functions_2_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_processes_4_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_systems_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:80:28: ( ( ( (lv_constants_0_0= ruleConstantDeclaration ) ) | ( (lv_projections_1_0= ruleProjectionDeclaration ) ) | ( (lv_functions_2_0= ruleFunctionDeclaration ) ) | ( (lv_attributes_3_0= ruleAttributeDeclaration ) ) | ( (lv_processes_4_0= ruleProcessDeclaration ) ) | ( (lv_components_5_0= ruleComponentDeclaration ) ) | ( (lv_systems_6_0= ruleSystemDeclaration ) ) )* )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:81:1: ( ( (lv_constants_0_0= ruleConstantDeclaration ) ) | ( (lv_projections_1_0= ruleProjectionDeclaration ) ) | ( (lv_functions_2_0= ruleFunctionDeclaration ) ) | ( (lv_attributes_3_0= ruleAttributeDeclaration ) ) | ( (lv_processes_4_0= ruleProcessDeclaration ) ) | ( (lv_components_5_0= ruleComponentDeclaration ) ) | ( (lv_systems_6_0= ruleSystemDeclaration ) ) )*
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:81:1: ( ( (lv_constants_0_0= ruleConstantDeclaration ) ) | ( (lv_projections_1_0= ruleProjectionDeclaration ) ) | ( (lv_functions_2_0= ruleFunctionDeclaration ) ) | ( (lv_attributes_3_0= ruleAttributeDeclaration ) ) | ( (lv_processes_4_0= ruleProcessDeclaration ) ) | ( (lv_components_5_0= ruleComponentDeclaration ) ) | ( (lv_systems_6_0= ruleSystemDeclaration ) ) )*
            loop1:
            do {
                int alt1=8;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 31:
                    {
                    alt1=3;
                    }
                    break;
                case 11:
                    {
                    alt1=4;
                    }
                    break;
                case 32:
                    {
                    alt1=5;
                    }
                    break;
                case 20:
                    {
                    alt1=6;
                    }
                    break;
                case 66:
                    {
                    alt1=7;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:81:2: ( (lv_constants_0_0= ruleConstantDeclaration ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:81:2: ( (lv_constants_0_0= ruleConstantDeclaration ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:82:1: (lv_constants_0_0= ruleConstantDeclaration )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:82:1: (lv_constants_0_0= ruleConstantDeclaration )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:83:3: lv_constants_0_0= ruleConstantDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getConstantsConstantDeclarationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConstantDeclaration_in_ruleModel131);
            	    lv_constants_0_0=ruleConstantDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constants",
            	              		lv_constants_0_0, 
            	              		"ConstantDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:100:6: ( (lv_projections_1_0= ruleProjectionDeclaration ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:100:6: ( (lv_projections_1_0= ruleProjectionDeclaration ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:101:1: (lv_projections_1_0= ruleProjectionDeclaration )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:101:1: (lv_projections_1_0= ruleProjectionDeclaration )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:102:3: lv_projections_1_0= ruleProjectionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getProjectionsProjectionDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProjectionDeclaration_in_ruleModel158);
            	    lv_projections_1_0=ruleProjectionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"projections",
            	              		lv_projections_1_0, 
            	              		"ProjectionDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:119:6: ( (lv_functions_2_0= ruleFunctionDeclaration ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:119:6: ( (lv_functions_2_0= ruleFunctionDeclaration ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:120:1: (lv_functions_2_0= ruleFunctionDeclaration )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:120:1: (lv_functions_2_0= ruleFunctionDeclaration )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:121:3: lv_functions_2_0= ruleFunctionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleModel185);
            	    lv_functions_2_0=ruleFunctionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functions",
            	              		lv_functions_2_0, 
            	              		"FunctionDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:138:6: ( (lv_attributes_3_0= ruleAttributeDeclaration ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:138:6: ( (lv_attributes_3_0= ruleAttributeDeclaration ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:139:1: (lv_attributes_3_0= ruleAttributeDeclaration )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:139:1: (lv_attributes_3_0= ruleAttributeDeclaration )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:140:3: lv_attributes_3_0= ruleAttributeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getAttributesAttributeDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributeDeclaration_in_ruleModel212);
            	    lv_attributes_3_0=ruleAttributeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_3_0, 
            	              		"AttributeDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:157:6: ( (lv_processes_4_0= ruleProcessDeclaration ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:157:6: ( (lv_processes_4_0= ruleProcessDeclaration ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:158:1: (lv_processes_4_0= ruleProcessDeclaration )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:158:1: (lv_processes_4_0= ruleProcessDeclaration )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:159:3: lv_processes_4_0= ruleProcessDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessDeclarationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProcessDeclaration_in_ruleModel239);
            	    lv_processes_4_0=ruleProcessDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processes",
            	              		lv_processes_4_0, 
            	              		"ProcessDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:176:6: ( (lv_components_5_0= ruleComponentDeclaration ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:176:6: ( (lv_components_5_0= ruleComponentDeclaration ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:177:1: (lv_components_5_0= ruleComponentDeclaration )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:177:1: (lv_components_5_0= ruleComponentDeclaration )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:178:3: lv_components_5_0= ruleComponentDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentDeclarationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComponentDeclaration_in_ruleModel266);
            	    lv_components_5_0=ruleComponentDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"components",
            	              		lv_components_5_0, 
            	              		"ComponentDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:195:6: ( (lv_systems_6_0= ruleSystemDeclaration ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:195:6: ( (lv_systems_6_0= ruleSystemDeclaration ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:196:1: (lv_systems_6_0= ruleSystemDeclaration )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:196:1: (lv_systems_6_0= ruleSystemDeclaration )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:197:3: lv_systems_6_0= ruleSystemDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSystemDeclaration_in_ruleModel293);
            	    lv_systems_6_0=ruleSystemDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"systems",
            	              		lv_systems_6_0, 
            	              		"SystemDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAttributeDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:221:1: entryRuleAttributeDeclaration returns [EObject current=null] : iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF ;
    public final EObject entryRuleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:222:2: (iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:223:2: iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration330);
            iv_ruleAttributeDeclaration=ruleAttributeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDeclaration340); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeDeclaration"


    // $ANTLR start "ruleAttributeDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:230:1: ruleAttributeDeclaration returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) ;
    public final EObject ruleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:233:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:234:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:234:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:234:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAttributeDeclaration377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeDeclarationAccess().getAttributeKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:238:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:239:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:239:1: (lv_name_1_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:240:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDeclaration394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAttributeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttributeDeclaration411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAttributeDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:260:1: ( (lv_type_3_0= ruleType ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:261:1: (lv_type_3_0= ruleType )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:261:1: (lv_type_3_0= ruleType )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:262:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getTypeTypeEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleAttributeDeclaration432);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAttributeDeclaration444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeDeclaration"


    // $ANTLR start "entryRuleProjectionDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:290:1: entryRuleProjectionDeclaration returns [EObject current=null] : iv_ruleProjectionDeclaration= ruleProjectionDeclaration EOF ;
    public final EObject entryRuleProjectionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectionDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:291:2: (iv_ruleProjectionDeclaration= ruleProjectionDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:292:2: iv_ruleProjectionDeclaration= ruleProjectionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleProjectionDeclaration_in_entryRuleProjectionDeclaration480);
            iv_ruleProjectionDeclaration=ruleProjectionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjectionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectionDeclaration490); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProjectionDeclaration"


    // $ANTLR start "ruleProjectionDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:299:1: ruleProjectionDeclaration returns [EObject current=null] : (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_projection_3_0= ruleProjectionExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleProjectionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_projection_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:302:28: ( (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_projection_3_0= ruleProjectionExpression ) ) otherlv_4= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:303:1: (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_projection_3_0= ruleProjectionExpression ) ) otherlv_4= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:303:1: (otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_projection_3_0= ruleProjectionExpression ) ) otherlv_4= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:303:3: otherlv_0= 'projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_projection_3_0= ruleProjectionExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProjectionDeclaration527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProjectionDeclarationAccess().getProjectionKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:307:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:308:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:308:1: (lv_name_1_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:309:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjectionDeclaration544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProjectionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProjectionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProjectionDeclaration561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProjectionDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:329:1: ( (lv_projection_3_0= ruleProjectionExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:330:1: (lv_projection_3_0= ruleProjectionExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:330:1: (lv_projection_3_0= ruleProjectionExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:331:3: lv_projection_3_0= ruleProjectionExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProjectionDeclarationAccess().getProjectionProjectionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProjectionExpression_in_ruleProjectionDeclaration582);
            lv_projection_3_0=ruleProjectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProjectionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"projection",
                      		lv_projection_3_0, 
                      		"ProjectionExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProjectionDeclaration594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProjectionDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProjectionDeclaration"


    // $ANTLR start "entryRuleProjectionExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:359:1: entryRuleProjectionExpression returns [EObject current=null] : iv_ruleProjectionExpression= ruleProjectionExpression EOF ;
    public final EObject entryRuleProjectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectionExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:360:2: (iv_ruleProjectionExpression= ruleProjectionExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:361:2: iv_ruleProjectionExpression= ruleProjectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleProjectionExpression_in_entryRuleProjectionExpression630);
            iv_ruleProjectionExpression=ruleProjectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectionExpression640); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProjectionExpression"


    // $ANTLR start "ruleProjectionExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:368:1: ruleProjectionExpression returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_template_1_0= ruleTemplate ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ':' )? ( (lv_default_6_0= ruleExpression ) ) ) ;
    public final EObject ruleProjectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_template_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_default_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:371:28: ( ( (otherlv_0= '[' ( (lv_template_1_0= ruleTemplate ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ':' )? ( (lv_default_6_0= ruleExpression ) ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:372:1: ( (otherlv_0= '[' ( (lv_template_1_0= ruleTemplate ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ':' )? ( (lv_default_6_0= ruleExpression ) ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:372:1: ( (otherlv_0= '[' ( (lv_template_1_0= ruleTemplate ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ':' )? ( (lv_default_6_0= ruleExpression ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:372:2: (otherlv_0= '[' ( (lv_template_1_0= ruleTemplate ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ':' )? ( (lv_default_6_0= ruleExpression ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:372:2: (otherlv_0= '[' ( (lv_template_1_0= ruleTemplate ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ':' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:372:4: otherlv_0= '[' ( (lv_template_1_0= ruleTemplate ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ':'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleProjectionExpression678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getProjectionExpressionAccess().getLeftSquareBracketKeyword_0_0());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:376:1: ( (lv_template_1_0= ruleTemplate ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:377:1: (lv_template_1_0= ruleTemplate )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:377:1: (lv_template_1_0= ruleTemplate )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:378:3: lv_template_1_0= ruleTemplate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProjectionExpressionAccess().getTemplateTemplateParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplate_in_ruleProjectionExpression699);
                    lv_template_1_0=ruleTemplate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProjectionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"template",
                              		lv_template_1_0, 
                              		"Template");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleProjectionExpression711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getProjectionExpressionAccess().getRightSquareBracketKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProjectionExpression723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getProjectionExpressionAccess().getHyphenMinusGreaterThanSignKeyword_0_3());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:402:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:403:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:403:1: (lv_value_4_0= ruleExpression )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:404:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProjectionExpressionAccess().getValueExpressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleProjectionExpression744);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProjectionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleProjectionExpression756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getProjectionExpressionAccess().getColonKeyword_0_5());
                          
                    }

                    }
                    break;

            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:424:3: ( (lv_default_6_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:425:1: (lv_default_6_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:425:1: (lv_default_6_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:426:3: lv_default_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProjectionExpressionAccess().getDefaultExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleProjectionExpression779);
            lv_default_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProjectionExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"default",
                      		lv_default_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProjectionExpression"


    // $ANTLR start "entryRuleConstantDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:450:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:451:2: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:452:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration815);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDeclaration825); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDeclaration"


    // $ANTLR start "ruleConstantDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:459:1: ruleConstantDeclaration returns [EObject current=null] : (otherlv_0= 'const' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:462:28: ( (otherlv_0= 'const' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:463:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:463:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:463:3: otherlv_0= 'const' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleConstantDeclaration862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclarationAccess().getConstKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:467:1: ( (lv_type_1_0= ruleType ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:468:1: (lv_type_1_0= ruleType )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:468:1: (lv_type_1_0= ruleType )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:469:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getTypeTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleConstantDeclaration883);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:485:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:486:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:486:1: (lv_name_2_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:487:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDeclaration900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleConstantDeclaration917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:507:1: ( (lv_value_4_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:508:1: (lv_value_4_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:508:1: (lv_value_4_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:509:3: lv_value_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConstantDeclaration938);
            lv_value_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleConstantDeclaration950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getConstantDeclarationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantDeclaration"


    // $ANTLR start "entryRuleComponentDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:537:1: entryRuleComponentDeclaration returns [EObject current=null] : iv_ruleComponentDeclaration= ruleComponentDeclaration EOF ;
    public final EObject entryRuleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:538:2: (iv_ruleComponentDeclaration= ruleComponentDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:539:2: iv_ruleComponentDeclaration= ruleComponentDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleComponentDeclaration_in_entryRuleComponentDeclaration986);
            iv_ruleComponentDeclaration=ruleComponentDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDeclaration996); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentDeclaration"


    // $ANTLR start "ruleComponentDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:546:1: ruleComponentDeclaration returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( (lv_component_8_0= ruleComponentExpression ) ) otherlv_9= ';' ) ;
    public final EObject ruleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_component_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:549:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( (lv_component_8_0= ruleComponentExpression ) ) otherlv_9= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:550:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( (lv_component_8_0= ruleComponentExpression ) ) otherlv_9= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:550:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( (lv_component_8_0= ruleComponentExpression ) ) otherlv_9= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:550:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( (lv_component_8_0= ruleComponentExpression ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleComponentDeclaration1033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentDeclarationAccess().getComponentKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:554:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:555:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:555:1: (lv_name_1_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:556:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDeclaration1050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleComponentDeclaration1067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComponentDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:576:1: ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=68 && LA4_0<=71)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:576:2: ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:576:2: ( (lv_parameters_3_0= ruleVariable ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:577:1: (lv_parameters_3_0= ruleVariable )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:577:1: (lv_parameters_3_0= ruleVariable )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:578:3: lv_parameters_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentDeclarationAccess().getParametersVariableParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleComponentDeclaration1089);
                    lv_parameters_3_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:594:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:594:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleComponentDeclaration1102); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getComponentDeclarationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:598:1: ( (lv_parameters_5_0= ruleVariable ) )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:599:1: (lv_parameters_5_0= ruleVariable )
                    	    {
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:599:1: (lv_parameters_5_0= ruleVariable )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:600:3: lv_parameters_5_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentDeclarationAccess().getParametersVariableParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleComponentDeclaration1123);
                    	    lv_parameters_5_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Variable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleComponentDeclaration1139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getComponentDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleComponentDeclaration1151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getComponentDeclarationAccess().getEqualsSignKeyword_5());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:624:1: ( (lv_component_8_0= ruleComponentExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:625:1: (lv_component_8_0= ruleComponentExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:625:1: (lv_component_8_0= ruleComponentExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:626:3: lv_component_8_0= ruleComponentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentDeclarationAccess().getComponentComponentExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComponentExpression_in_ruleComponentDeclaration1172);
            lv_component_8_0=ruleComponentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"component",
                      		lv_component_8_0, 
                      		"ComponentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleComponentDeclaration1184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getComponentDeclarationAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComponentDeclaration"


    // $ANTLR start "entryRuleComponentExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:654:1: entryRuleComponentExpression returns [EObject current=null] : iv_ruleComponentExpression= ruleComponentExpression EOF ;
    public final EObject entryRuleComponentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:655:2: (iv_ruleComponentExpression= ruleComponentExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:656:2: iv_ruleComponentExpression= ruleComponentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComponentExpression_in_entryRuleComponentExpression1220);
            iv_ruleComponentExpression=ruleComponentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentExpression1230); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentExpression"


    // $ANTLR start "ruleComponentExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:663:1: ruleComponentExpression returns [EObject current=null] : (this_ComponentConstant_0= ruleComponentConstant | this_ComponentReference_1= ruleComponentReference ) ;
    public final EObject ruleComponentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentConstant_0 = null;

        EObject this_ComponentReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:666:28: ( (this_ComponentConstant_0= ruleComponentConstant | this_ComponentReference_1= ruleComponentReference ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:667:1: (this_ComponentConstant_0= ruleComponentConstant | this_ComponentReference_1= ruleComponentReference )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:667:1: (this_ComponentConstant_0= ruleComponentConstant | this_ComponentReference_1= ruleComponentReference )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:668:5: this_ComponentConstant_0= ruleComponentConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComponentExpressionAccess().getComponentConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponentConstant_in_ruleComponentExpression1277);
                    this_ComponentConstant_0=ruleComponentConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComponentConstant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:678:5: this_ComponentReference_1= ruleComponentReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComponentExpressionAccess().getComponentReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponentReference_in_ruleComponentExpression1304);
                    this_ComponentReference_1=ruleComponentReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComponentReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComponentExpression"


    // $ANTLR start "entryRuleComponentReference"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:694:1: entryRuleComponentReference returns [EObject current=null] : iv_ruleComponentReference= ruleComponentReference EOF ;
    public final EObject entryRuleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentReference = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:695:2: (iv_ruleComponentReference= ruleComponentReference EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:696:2: iv_ruleComponentReference= ruleComponentReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleComponentReference_in_entryRuleComponentReference1339);
            iv_ruleComponentReference=ruleComponentReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentReference1349); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentReference"


    // $ANTLR start "ruleComponentReference"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:703:1: ruleComponentReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleComponentReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:706:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:707:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:707:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:707:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:707:2: ( (otherlv_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:708:1: (otherlv_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:708:1: (otherlv_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:709:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentReference1394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getComponentReferenceAccess().getReferenceComponentDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleComponentReference1406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentReferenceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:724:1: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==21||LA7_0==44||(LA7_0>=48 && LA7_0<=50)||(LA7_0>=52 && LA7_0<=65)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:724:2: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:724:2: ( (lv_arguments_2_0= ruleExpression ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:725:1: (lv_arguments_2_0= ruleExpression )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:725:1: (lv_arguments_2_0= ruleExpression )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:726:3: lv_arguments_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentReferenceAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleComponentReference1428);
                    lv_arguments_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:742:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:742:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleComponentReference1441); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getComponentReferenceAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:746:1: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:747:1: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:747:1: (lv_arguments_4_0= ruleExpression )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:748:3: lv_arguments_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentReferenceAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleComponentReference1462);
                    	    lv_arguments_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleComponentReference1478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getComponentReferenceAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComponentReference"


    // $ANTLR start "entryRuleComponentConstant"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:776:1: entryRuleComponentConstant returns [EObject current=null] : iv_ruleComponentConstant= ruleComponentConstant EOF ;
    public final EObject entryRuleComponentConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConstant = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:777:2: (iv_ruleComponentConstant= ruleComponentConstant EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:778:2: iv_ruleComponentConstant= ruleComponentConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentConstantRule()); 
            }
            pushFollow(FOLLOW_ruleComponentConstant_in_entryRuleComponentConstant1514);
            iv_ruleComponentConstant=ruleComponentConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentConstant1524); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentConstant"


    // $ANTLR start "ruleComponentConstant"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:785:1: ruleComponentConstant returns [EObject current=null] : (otherlv_0= '{' ( (lv_interface_1_0= ruleInterface ) ) otherlv_2= '}' otherlv_3= '[' ( ( (lv_knowledge_4_0= ruleKnowledge ) ) otherlv_5= ',' )? ( ( (lv_processes_6_0= ruleProcessExpression ) ) (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )* ) otherlv_9= ']' ) ;
    public final EObject ruleComponentConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_interface_1_0 = null;

        EObject lv_knowledge_4_0 = null;

        EObject lv_processes_6_0 = null;

        EObject lv_processes_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:788:28: ( (otherlv_0= '{' ( (lv_interface_1_0= ruleInterface ) ) otherlv_2= '}' otherlv_3= '[' ( ( (lv_knowledge_4_0= ruleKnowledge ) ) otherlv_5= ',' )? ( ( (lv_processes_6_0= ruleProcessExpression ) ) (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )* ) otherlv_9= ']' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:789:1: (otherlv_0= '{' ( (lv_interface_1_0= ruleInterface ) ) otherlv_2= '}' otherlv_3= '[' ( ( (lv_knowledge_4_0= ruleKnowledge ) ) otherlv_5= ',' )? ( ( (lv_processes_6_0= ruleProcessExpression ) ) (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )* ) otherlv_9= ']' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:789:1: (otherlv_0= '{' ( (lv_interface_1_0= ruleInterface ) ) otherlv_2= '}' otherlv_3= '[' ( ( (lv_knowledge_4_0= ruleKnowledge ) ) otherlv_5= ',' )? ( ( (lv_processes_6_0= ruleProcessExpression ) ) (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )* ) otherlv_9= ']' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:789:3: otherlv_0= '{' ( (lv_interface_1_0= ruleInterface ) ) otherlv_2= '}' otherlv_3= '[' ( ( (lv_knowledge_4_0= ruleKnowledge ) ) otherlv_5= ',' )? ( ( (lv_processes_6_0= ruleProcessExpression ) ) (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )* ) otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleComponentConstant1561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentConstantAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:793:1: ( (lv_interface_1_0= ruleInterface ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:794:1: (lv_interface_1_0= ruleInterface )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:794:1: (lv_interface_1_0= ruleInterface )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:795:3: lv_interface_1_0= ruleInterface
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentConstantAccess().getInterfaceInterfaceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInterface_in_ruleComponentConstant1582);
            lv_interface_1_0=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentConstantRule());
              	        }
                     		set(
                     			current, 
                     			"interface",
                      		lv_interface_1_0, 
                      		"Interface");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleComponentConstant1594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComponentConstantAccess().getRightCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleComponentConstant1606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentConstantAccess().getLeftSquareBracketKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:819:1: ( ( (lv_knowledge_4_0= ruleKnowledge ) ) otherlv_5= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:819:2: ( (lv_knowledge_4_0= ruleKnowledge ) ) otherlv_5= ','
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:819:2: ( (lv_knowledge_4_0= ruleKnowledge ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:820:1: (lv_knowledge_4_0= ruleKnowledge )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:820:1: (lv_knowledge_4_0= ruleKnowledge )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:821:3: lv_knowledge_4_0= ruleKnowledge
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentConstantAccess().getKnowledgeKnowledgeParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleKnowledge_in_ruleComponentConstant1628);
                    lv_knowledge_4_0=ruleKnowledge();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"knowledge",
                              		lv_knowledge_4_0, 
                              		"Knowledge");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleComponentConstant1640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getComponentConstantAccess().getCommaKeyword_4_1());
                          
                    }

                    }
                    break;

            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:841:3: ( ( (lv_processes_6_0= ruleProcessExpression ) ) (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )* )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:841:4: ( (lv_processes_6_0= ruleProcessExpression ) ) (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )*
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:841:4: ( (lv_processes_6_0= ruleProcessExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:842:1: (lv_processes_6_0= ruleProcessExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:842:1: (lv_processes_6_0= ruleProcessExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:843:3: lv_processes_6_0= ruleProcessExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentConstantAccess().getProcessesProcessExpressionParserRuleCall_5_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProcessExpression_in_ruleComponentConstant1664);
            lv_processes_6_0=ruleProcessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentConstantRule());
              	        }
                     		add(
                     			current, 
                     			"processes",
                      		lv_processes_6_0, 
                      		"ProcessExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:859:2: (otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:859:4: otherlv_7= '|' ( (lv_processes_8_0= ruleProcessExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleComponentConstant1677); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getComponentConstantAccess().getVerticalLineKeyword_5_1_0());
            	          
            	    }
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:863:1: ( (lv_processes_8_0= ruleProcessExpression ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:864:1: (lv_processes_8_0= ruleProcessExpression )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:864:1: (lv_processes_8_0= ruleProcessExpression )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:865:3: lv_processes_8_0= ruleProcessExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentConstantAccess().getProcessesProcessExpressionParserRuleCall_5_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProcessExpression_in_ruleComponentConstant1698);
            	    lv_processes_8_0=ruleProcessExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComponentConstantRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processes",
            	              		lv_processes_8_0, 
            	              		"ProcessExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleComponentConstant1713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getComponentConstantAccess().getRightSquareBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComponentConstant"


    // $ANTLR start "entryRuleProcessExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:893:1: entryRuleProcessExpression returns [EObject current=null] : iv_ruleProcessExpression= ruleProcessExpression EOF ;
    public final EObject entryRuleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:894:2: (iv_ruleProcessExpression= ruleProcessExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:895:2: iv_ruleProcessExpression= ruleProcessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression1749);
            iv_ruleProcessExpression=ruleProcessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessExpression1759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcessExpression"


    // $ANTLR start "ruleProcessExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:902:1: ruleProcessExpression returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= 'nil' ) ) ;
    public final EObject ruleProcessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:905:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= 'nil' ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:906:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= 'nil' ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:906:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= 'nil' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:906:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:906:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:906:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:906:3: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:907:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getProcessExpressionAccess().getProcessReferenceAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:912:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:913:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:913:1: (otherlv_1= RULE_ID )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:914:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getProcessExpressionRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessExpression1814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getProcessExpressionAccess().getReferenceProcessDeclarationCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleProcessExpression1826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getProcessExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:929:1: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==21||LA11_0==44||(LA11_0>=48 && LA11_0<=50)||(LA11_0>=52 && LA11_0<=65)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:929:2: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                            {
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:929:2: ( (lv_arguments_3_0= ruleExpression ) )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:930:1: (lv_arguments_3_0= ruleExpression )
                            {
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:930:1: (lv_arguments_3_0= ruleExpression )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:931:3: lv_arguments_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getProcessExpressionAccess().getArgumentsExpressionParserRuleCall_0_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleProcessExpression1848);
                            lv_arguments_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getProcessExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:947:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==22) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:947:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleProcessExpression1861); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getProcessExpressionAccess().getCommaKeyword_0_3_1_0());
                            	          
                            	    }
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:951:1: ( (lv_arguments_5_0= ruleExpression ) )
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:952:1: (lv_arguments_5_0= ruleExpression )
                            	    {
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:952:1: (lv_arguments_5_0= ruleExpression )
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:953:3: lv_arguments_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getProcessExpressionAccess().getArgumentsExpressionParserRuleCall_0_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleProcessExpression1882);
                            	    lv_arguments_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getProcessExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_5_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleProcessExpression1898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getProcessExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:974:6: ( () otherlv_8= 'nil' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:974:6: ( () otherlv_8= 'nil' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:974:7: () otherlv_8= 'nil'
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:974:7: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:975:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getProcessExpressionAccess().getEmptyProcessAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleProcessExpression1927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getProcessExpressionAccess().getNilKeyword_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProcessExpression"


    // $ANTLR start "entryRuleKnowledge"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:992:1: entryRuleKnowledge returns [EObject current=null] : iv_ruleKnowledge= ruleKnowledge EOF ;
    public final EObject entryRuleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledge = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:993:2: (iv_ruleKnowledge= ruleKnowledge EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:994:2: iv_ruleKnowledge= ruleKnowledge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKnowledgeRule()); 
            }
            pushFollow(FOLLOW_ruleKnowledge_in_entryRuleKnowledge1964);
            iv_ruleKnowledge=ruleKnowledge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKnowledge; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnowledge1974); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKnowledge"


    // $ANTLR start "ruleKnowledge"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1001:1: ruleKnowledge returns [EObject current=null] : (otherlv_0= '<' ( (lv_tuples_1_0= ruleTuple ) ) otherlv_2= '>' (otherlv_3= '|' otherlv_4= '<' ( (lv_tuples_5_0= ruleTuple ) ) otherlv_6= '>' )* ) ;
    public final EObject ruleKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1004:28: ( (otherlv_0= '<' ( (lv_tuples_1_0= ruleTuple ) ) otherlv_2= '>' (otherlv_3= '|' otherlv_4= '<' ( (lv_tuples_5_0= ruleTuple ) ) otherlv_6= '>' )* ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1005:1: (otherlv_0= '<' ( (lv_tuples_1_0= ruleTuple ) ) otherlv_2= '>' (otherlv_3= '|' otherlv_4= '<' ( (lv_tuples_5_0= ruleTuple ) ) otherlv_6= '>' )* )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1005:1: (otherlv_0= '<' ( (lv_tuples_1_0= ruleTuple ) ) otherlv_2= '>' (otherlv_3= '|' otherlv_4= '<' ( (lv_tuples_5_0= ruleTuple ) ) otherlv_6= '>' )* )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1005:3: otherlv_0= '<' ( (lv_tuples_1_0= ruleTuple ) ) otherlv_2= '>' (otherlv_3= '|' otherlv_4= '<' ( (lv_tuples_5_0= ruleTuple ) ) otherlv_6= '>' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleKnowledge2011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKnowledgeAccess().getLessThanSignKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1009:1: ( (lv_tuples_1_0= ruleTuple ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1010:1: (lv_tuples_1_0= ruleTuple )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1010:1: (lv_tuples_1_0= ruleTuple )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1011:3: lv_tuples_1_0= ruleTuple
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKnowledgeAccess().getTuplesTupleParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTuple_in_ruleKnowledge2032);
            lv_tuples_1_0=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKnowledgeRule());
              	        }
                     		add(
                     			current, 
                     			"tuples",
                      		lv_tuples_1_0, 
                      		"Tuple");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleKnowledge2044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getKnowledgeAccess().getGreaterThanSignKeyword_2());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1031:1: (otherlv_3= '|' otherlv_4= '<' ( (lv_tuples_5_0= ruleTuple ) ) otherlv_6= '>' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1031:3: otherlv_3= '|' otherlv_4= '<' ( (lv_tuples_5_0= ruleTuple ) ) otherlv_6= '>'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleKnowledge2057); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKnowledgeAccess().getVerticalLineKeyword_3_0());
            	          
            	    }
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleKnowledge2069); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getKnowledgeAccess().getLessThanSignKeyword_3_1());
            	          
            	    }
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1039:1: ( (lv_tuples_5_0= ruleTuple ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1040:1: (lv_tuples_5_0= ruleTuple )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1040:1: (lv_tuples_5_0= ruleTuple )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1041:3: lv_tuples_5_0= ruleTuple
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKnowledgeAccess().getTuplesTupleParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTuple_in_ruleKnowledge2090);
            	    lv_tuples_5_0=ruleTuple();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tuples",
            	              		lv_tuples_5_0, 
            	              		"Tuple");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleKnowledge2102); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getKnowledgeAccess().getGreaterThanSignKeyword_3_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleKnowledge"


    // $ANTLR start "entryRuleInterface"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1069:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1070:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1071:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface2140);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface2150); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1078:1: ruleInterface returns [EObject current=null] : ( ( ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) ) ) (otherlv_1= ',' ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) ) )* ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attributes_0_1 = null;

        EObject lv_attributes_0_2 = null;

        EObject lv_attributes_2_1 = null;

        EObject lv_attributes_2_2 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1081:28: ( ( ( ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) ) ) (otherlv_1= ',' ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) ) )* ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1082:1: ( ( ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) ) ) (otherlv_1= ',' ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) ) )* )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1082:1: ( ( ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) ) ) (otherlv_1= ',' ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) ) )* )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1082:2: ( ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) ) ) (otherlv_1= ',' ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) ) )*
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1082:2: ( ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1083:1: ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1083:1: ( (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1084:1: (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1084:1: (lv_attributes_0_1= ruleIdAttributeDefinition | lv_attributes_0_2= ruleAttributeInstantiation )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1085:3: lv_attributes_0_1= ruleIdAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getAttributesIdAttributeDefinitionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdAttributeDefinition_in_ruleInterface2198);
                    lv_attributes_0_1=ruleIdAttributeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                      	        }
                             		add(
                             			current, 
                             			"attributes",
                              		lv_attributes_0_1, 
                              		"IdAttributeDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1100:8: lv_attributes_0_2= ruleAttributeInstantiation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getAttributesAttributeInstantiationParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeInstantiation_in_ruleInterface2217);
                    lv_attributes_0_2=ruleAttributeInstantiation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                      	        }
                             		add(
                             			current, 
                             			"attributes",
                              		lv_attributes_0_2, 
                              		"AttributeInstantiation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1118:2: (otherlv_1= ',' ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1118:4: otherlv_1= ',' ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleInterface2233); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1122:1: ( ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1123:1: ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1123:1: ( (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1124:1: (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1124:1: (lv_attributes_2_1= ruleIdAttributeDefinition | lv_attributes_2_2= ruleAttributeInstantiation )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==30) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==RULE_ID) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1125:3: lv_attributes_2_1= ruleIdAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceAccess().getAttributesIdAttributeDefinitionParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleIdAttributeDefinition_in_ruleInterface2256);
            	            lv_attributes_2_1=ruleIdAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"attributes",
            	                      		lv_attributes_2_1, 
            	                      		"IdAttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1140:8: lv_attributes_2_2= ruleAttributeInstantiation
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceAccess().getAttributesAttributeInstantiationParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeInstantiation_in_ruleInterface2275);
            	            lv_attributes_2_2=ruleAttributeInstantiation();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"attributes",
            	                      		lv_attributes_2_2, 
            	                      		"AttributeInstantiation");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleIdAttributeDefinition"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1166:1: entryRuleIdAttributeDefinition returns [EObject current=null] : iv_ruleIdAttributeDefinition= ruleIdAttributeDefinition EOF ;
    public final EObject entryRuleIdAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdAttributeDefinition = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1167:2: (iv_ruleIdAttributeDefinition= ruleIdAttributeDefinition EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1168:2: iv_ruleIdAttributeDefinition= ruleIdAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleIdAttributeDefinition_in_entryRuleIdAttributeDefinition2316);
            iv_ruleIdAttributeDefinition=ruleIdAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdAttributeDefinition2326); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdAttributeDefinition"


    // $ANTLR start "ruleIdAttributeDefinition"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1175:1: ruleIdAttributeDefinition returns [EObject current=null] : (otherlv_0= 'id' otherlv_1= '=' ( (lv_componentId_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleIdAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_componentId_2_0=null;

         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1178:28: ( (otherlv_0= 'id' otherlv_1= '=' ( (lv_componentId_2_0= RULE_STRING ) ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1179:1: (otherlv_0= 'id' otherlv_1= '=' ( (lv_componentId_2_0= RULE_STRING ) ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1179:1: (otherlv_0= 'id' otherlv_1= '=' ( (lv_componentId_2_0= RULE_STRING ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1179:3: otherlv_0= 'id' otherlv_1= '=' ( (lv_componentId_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleIdAttributeDefinition2363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdAttributeDefinitionAccess().getIdKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleIdAttributeDefinition2375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIdAttributeDefinitionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1187:1: ( (lv_componentId_2_0= RULE_STRING ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1188:1: (lv_componentId_2_0= RULE_STRING )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1188:1: (lv_componentId_2_0= RULE_STRING )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1189:3: lv_componentId_2_0= RULE_STRING
            {
            lv_componentId_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdAttributeDefinition2392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_componentId_2_0, grammarAccess.getIdAttributeDefinitionAccess().getComponentIdSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIdAttributeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"componentId",
                      		lv_componentId_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdAttributeDefinition"


    // $ANTLR start "entryRuleAttributeInstantiation"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1213:1: entryRuleAttributeInstantiation returns [EObject current=null] : iv_ruleAttributeInstantiation= ruleAttributeInstantiation EOF ;
    public final EObject entryRuleAttributeInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeInstantiation = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1214:2: (iv_ruleAttributeInstantiation= ruleAttributeInstantiation EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1215:2: iv_ruleAttributeInstantiation= ruleAttributeInstantiation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeInstantiationRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeInstantiation_in_entryRuleAttributeInstantiation2433);
            iv_ruleAttributeInstantiation=ruleAttributeInstantiation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeInstantiation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeInstantiation2443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeInstantiation"


    // $ANTLR start "ruleAttributeInstantiation"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1222:1: ruleAttributeInstantiation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAttributeInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1225:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1226:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1226:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1226:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1226:2: ( (otherlv_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1227:1: (otherlv_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1227:1: (otherlv_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1228:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeInstantiationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeInstantiation2488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAttributeInstantiationAccess().getAttributeAttributeDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAttributeInstantiation2500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeInstantiationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1243:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1244:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1244:1: (lv_value_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1245:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeInstantiationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAttributeInstantiation2521);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeInstantiationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeInstantiation"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1269:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1270:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1271:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2557);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration2567); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1278:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_returnType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) otherlv_10= ';' ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_returnType_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1281:28: ( (otherlv_0= 'function' ( (lv_returnType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) otherlv_10= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1282:1: (otherlv_0= 'function' ( (lv_returnType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) otherlv_10= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1282:1: (otherlv_0= 'function' ( (lv_returnType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) otherlv_10= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1282:3: otherlv_0= 'function' ( (lv_returnType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleFunctionDeclaration2604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1286:1: ( (lv_returnType_1_0= ruleType ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1287:1: (lv_returnType_1_0= ruleType )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1287:1: (lv_returnType_1_0= ruleType )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1288:3: lv_returnType_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturnTypeTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleFunctionDeclaration2625);
            lv_returnType_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1304:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1305:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1305:1: (lv_name_2_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1306:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration2642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFunctionDeclaration2659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1326:1: ( ( (lv_parameters_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=68 && LA18_0<=71)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1326:2: ( (lv_parameters_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )*
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1326:2: ( (lv_parameters_4_0= ruleVariable ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1327:1: (lv_parameters_4_0= ruleVariable )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1327:1: (lv_parameters_4_0= ruleVariable )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1328:3: lv_parameters_4_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersVariableParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleFunctionDeclaration2681);
                    lv_parameters_4_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1344:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==22) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1344:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleFunctionDeclaration2694); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1348:1: ( (lv_parameters_6_0= ruleVariable ) )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1349:1: (lv_parameters_6_0= ruleVariable )
                    	    {
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1349:1: (lv_parameters_6_0= ruleVariable )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1350:3: lv_parameters_6_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersVariableParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleFunctionDeclaration2715);
                    	    lv_parameters_6_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"Variable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleFunctionDeclaration2731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDeclaration2743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionDeclarationAccess().getEqualsSignKeyword_6());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1374:1: ( (lv_body_9_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1375:1: (lv_body_9_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1375:1: (lv_body_9_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1376:3: lv_body_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionDeclaration2764);
            lv_body_9_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_9_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDeclaration2776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleProcessDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1404:1: entryRuleProcessDeclaration returns [EObject current=null] : iv_ruleProcessDeclaration= ruleProcessDeclaration EOF ;
    public final EObject entryRuleProcessDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1405:2: (iv_ruleProcessDeclaration= ruleProcessDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1406:2: iv_ruleProcessDeclaration= ruleProcessDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleProcessDeclaration_in_entryRuleProcessDeclaration2812);
            iv_ruleProcessDeclaration=ruleProcessDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessDeclaration2822); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcessDeclaration"


    // $ANTLR start "ruleProcessDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1413:1: ruleProcessDeclaration returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleBlock ) ) otherlv_9= '}' ) ;
    public final EObject ruleProcessDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1416:28: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleBlock ) ) otherlv_9= '}' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1417:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleBlock ) ) otherlv_9= '}' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1417:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleBlock ) ) otherlv_9= '}' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1417:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleBlock ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleProcessDeclaration2859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcessDeclarationAccess().getProcessKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1421:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1422:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1422:1: (lv_name_1_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1423:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessDeclaration2876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProcessDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProcessDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleProcessDeclaration2893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProcessDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1443:1: ( ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=68 && LA20_0<=71)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1443:2: ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1443:2: ( (lv_parameters_3_0= ruleVariable ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1444:1: (lv_parameters_3_0= ruleVariable )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1444:1: (lv_parameters_3_0= ruleVariable )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1445:3: lv_parameters_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcessDeclarationAccess().getParametersVariableParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleProcessDeclaration2915);
                    lv_parameters_3_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProcessDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1461:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==22) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1461:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleProcessDeclaration2928); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getProcessDeclarationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1465:1: ( (lv_parameters_5_0= ruleVariable ) )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1466:1: (lv_parameters_5_0= ruleVariable )
                    	    {
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1466:1: (lv_parameters_5_0= ruleVariable )
                    	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1467:3: lv_parameters_5_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProcessDeclarationAccess().getParametersVariableParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleProcessDeclaration2949);
                    	    lv_parameters_5_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProcessDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Variable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleProcessDeclaration2965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getProcessDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleProcessDeclaration2977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getProcessDeclarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1491:1: ( (lv_body_8_0= ruleBlock ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1492:1: (lv_body_8_0= ruleBlock )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1492:1: (lv_body_8_0= ruleBlock )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1493:3: lv_body_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessDeclarationAccess().getBodyBlockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleProcessDeclaration2998);
            lv_body_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcessDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_8_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleProcessDeclaration3010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getProcessDeclarationAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProcessDeclaration"


    // $ANTLR start "entryRuleVariable"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1521:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1522:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1523:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3046);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3056); if (state.failed) return current;

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
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1530:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1533:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1534:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1534:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1534:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1534:2: ( (lv_type_0_0= ruleType ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1535:1: (lv_type_0_0= ruleType )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1535:1: (lv_type_0_0= ruleType )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1536:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariable3102);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1552:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1553:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1553:1: (lv_name_1_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1554:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable3119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCommand"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1580:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1581:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1582:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand3162);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand3172); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1589:1: ruleCommand returns [EObject current=null] : (this_Action_0= ruleAction | this_IfThenElse_1= ruleIfThenElse | this_While_2= ruleWhile | this_VariableDeclaration_3= ruleVariableDeclaration | this_ProcessExpression_4= ruleProcessExpression | (otherlv_5= '{' this_Block_6= ruleBlock otherlv_7= '}' ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Action_0 = null;

        EObject this_IfThenElse_1 = null;

        EObject this_While_2 = null;

        EObject this_VariableDeclaration_3 = null;

        EObject this_ProcessExpression_4 = null;

        EObject this_Block_6 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1592:28: ( (this_Action_0= ruleAction | this_IfThenElse_1= ruleIfThenElse | this_While_2= ruleWhile | this_VariableDeclaration_3= ruleVariableDeclaration | this_ProcessExpression_4= ruleProcessExpression | (otherlv_5= '{' this_Block_6= ruleBlock otherlv_7= '}' ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1593:1: (this_Action_0= ruleAction | this_IfThenElse_1= ruleIfThenElse | this_While_2= ruleWhile | this_VariableDeclaration_3= ruleVariableDeclaration | this_ProcessExpression_4= ruleProcessExpression | (otherlv_5= '{' this_Block_6= ruleBlock otherlv_7= '}' ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1593:1: (this_Action_0= ruleAction | this_IfThenElse_1= ruleIfThenElse | this_While_2= ruleWhile | this_VariableDeclaration_3= ruleVariableDeclaration | this_ProcessExpression_4= ruleProcessExpression | (otherlv_5= '{' this_Block_6= ruleBlock otherlv_7= '}' ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
            case 36:
            case 37:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 40:
                {
                alt21=3;
                }
                break;
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt21=4;
                }
                break;
            case RULE_ID:
            case 27:
                {
                alt21=5;
                }
                break;
            case 24:
                {
                alt21=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1594:5: this_Action_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getActionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAction_in_ruleCommand3219);
                    this_Action_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Action_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1604:5: this_IfThenElse_1= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getIfThenElseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleCommand3246);
                    this_IfThenElse_1=ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfThenElse_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1614:5: this_While_2= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getWhileParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleCommand3273);
                    this_While_2=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_While_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1624:5: this_VariableDeclaration_3= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getVariableDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleCommand3300);
                    this_VariableDeclaration_3=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1634:5: this_ProcessExpression_4= ruleProcessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getProcessExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProcessExpression_in_ruleCommand3327);
                    this_ProcessExpression_4=ruleProcessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProcessExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1643:6: (otherlv_5= '{' this_Block_6= ruleBlock otherlv_7= '}' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1643:6: (otherlv_5= '{' this_Block_6= ruleBlock otherlv_7= '}' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1643:8: otherlv_5= '{' this_Block_6= ruleBlock otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleCommand3345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getBlockParserRuleCall_5_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCommand3367);
                    this_Block_6=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleCommand3378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_5_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1668:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1669:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1670:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3415);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3425); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1677:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_declaredVariable_0_0= ruleVariable ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleExpression ) ) )? otherlv_3= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredVariable_0_0 = null;

        EObject lv_init_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1680:28: ( ( ( (lv_declaredVariable_0_0= ruleVariable ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleExpression ) ) )? otherlv_3= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1681:1: ( ( (lv_declaredVariable_0_0= ruleVariable ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleExpression ) ) )? otherlv_3= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1681:1: ( ( (lv_declaredVariable_0_0= ruleVariable ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleExpression ) ) )? otherlv_3= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1681:2: ( (lv_declaredVariable_0_0= ruleVariable ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleExpression ) ) )? otherlv_3= ';'
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1681:2: ( (lv_declaredVariable_0_0= ruleVariable ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1682:1: (lv_declaredVariable_0_0= ruleVariable )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1682:1: (lv_declaredVariable_0_0= ruleVariable )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1683:3: lv_declaredVariable_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getDeclaredVariableVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleVariableDeclaration3471);
            lv_declaredVariable_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"declaredVariable",
                      		lv_declaredVariable_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1699:2: (otherlv_1= '=' ( (lv_init_2_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1699:4: otherlv_1= '=' ( (lv_init_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleVariableDeclaration3484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1703:1: ( (lv_init_2_0= ruleExpression ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1704:1: (lv_init_2_0= ruleExpression )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1704:1: (lv_init_2_0= ruleExpression )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1705:3: lv_init_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInitExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration3505);
                    lv_init_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleVariableDeclaration3519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1733:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1734:2: (iv_ruleAction= ruleAction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1735:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction3555);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction3565); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1742:1: ruleAction returns [EObject current=null] : (this_PutAction_0= rulePutAction | this_GetAction_1= ruleGetAction | this_QueryAction_2= ruleQueryAction | this_ReplaceAction_3= ruleReplaceAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_PutAction_0 = null;

        EObject this_GetAction_1 = null;

        EObject this_QueryAction_2 = null;

        EObject this_ReplaceAction_3 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1745:28: ( (this_PutAction_0= rulePutAction | this_GetAction_1= ruleGetAction | this_QueryAction_2= ruleQueryAction | this_ReplaceAction_3= ruleReplaceAction ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1746:1: (this_PutAction_0= rulePutAction | this_GetAction_1= ruleGetAction | this_QueryAction_2= ruleQueryAction | this_ReplaceAction_3= ruleReplaceAction )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1746:1: (this_PutAction_0= rulePutAction | this_GetAction_1= ruleGetAction | this_QueryAction_2= ruleQueryAction | this_ReplaceAction_3= ruleReplaceAction )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 36:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1747:5: this_PutAction_0= rulePutAction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getPutActionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePutAction_in_ruleAction3612);
                    this_PutAction_0=rulePutAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PutAction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1757:5: this_GetAction_1= ruleGetAction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getGetActionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGetAction_in_ruleAction3639);
                    this_GetAction_1=ruleGetAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GetAction_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1767:5: this_QueryAction_2= ruleQueryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getQueryActionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQueryAction_in_ruleAction3666);
                    this_QueryAction_2=ruleQueryAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QueryAction_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1777:5: this_ReplaceAction_3= ruleReplaceAction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getReplaceActionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReplaceAction_in_ruleAction3693);
                    this_ReplaceAction_3=ruleReplaceAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReplaceAction_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleReplaceAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1793:1: entryRuleReplaceAction returns [EObject current=null] : iv_ruleReplaceAction= ruleReplaceAction EOF ;
    public final EObject entryRuleReplaceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceAction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1794:2: (iv_ruleReplaceAction= ruleReplaceAction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1795:2: iv_ruleReplaceAction= ruleReplaceAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReplaceActionRule()); 
            }
            pushFollow(FOLLOW_ruleReplaceAction_in_entryRuleReplaceAction3728);
            iv_ruleReplaceAction=ruleReplaceAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReplaceAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceAction3738); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReplaceAction"


    // $ANTLR start "ruleReplaceAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1802:1: ruleReplaceAction returns [EObject current=null] : (otherlv_0= 'replace' otherlv_1= '[' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= '->' ( (lv_tuple_4_0= ruleTuple ) ) otherlv_5= ']' otherlv_6= ';' ) ;
    public final EObject ruleReplaceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_template_2_0 = null;

        EObject lv_tuple_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1805:28: ( (otherlv_0= 'replace' otherlv_1= '[' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= '->' ( (lv_tuple_4_0= ruleTuple ) ) otherlv_5= ']' otherlv_6= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1806:1: (otherlv_0= 'replace' otherlv_1= '[' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= '->' ( (lv_tuple_4_0= ruleTuple ) ) otherlv_5= ']' otherlv_6= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1806:1: (otherlv_0= 'replace' otherlv_1= '[' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= '->' ( (lv_tuple_4_0= ruleTuple ) ) otherlv_5= ']' otherlv_6= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1806:3: otherlv_0= 'replace' otherlv_1= '[' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= '->' ( (lv_tuple_4_0= ruleTuple ) ) otherlv_5= ']' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleReplaceAction3775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReplaceActionAccess().getReplaceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleReplaceAction3787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReplaceActionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1814:1: ( (lv_template_2_0= ruleTemplate ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1815:1: (lv_template_2_0= ruleTemplate )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1815:1: (lv_template_2_0= ruleTemplate )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1816:3: lv_template_2_0= ruleTemplate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReplaceActionAccess().getTemplateTemplateParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplate_in_ruleReplaceAction3808);
            lv_template_2_0=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReplaceActionRule());
              	        }
                     		set(
                     			current, 
                     			"template",
                      		lv_template_2_0, 
                      		"Template");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleReplaceAction3820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReplaceActionAccess().getHyphenMinusGreaterThanSignKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1836:1: ( (lv_tuple_4_0= ruleTuple ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1837:1: (lv_tuple_4_0= ruleTuple )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1837:1: (lv_tuple_4_0= ruleTuple )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1838:3: lv_tuple_4_0= ruleTuple
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReplaceActionAccess().getTupleTupleParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTuple_in_ruleReplaceAction3841);
            lv_tuple_4_0=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReplaceActionRule());
              	        }
                     		set(
                     			current, 
                     			"tuple",
                      		lv_tuple_4_0, 
                      		"Tuple");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleReplaceAction3853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getReplaceActionAccess().getRightSquareBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleReplaceAction3865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getReplaceActionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReplaceAction"


    // $ANTLR start "entryRuleGetAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1870:1: entryRuleGetAction returns [EObject current=null] : iv_ruleGetAction= ruleGetAction EOF ;
    public final EObject entryRuleGetAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1871:2: (iv_ruleGetAction= ruleGetAction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1872:2: iv_ruleGetAction= ruleGetAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetActionRule()); 
            }
            pushFollow(FOLLOW_ruleGetAction_in_entryRuleGetAction3901);
            iv_ruleGetAction=ruleGetAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetAction3911); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGetAction"


    // $ANTLR start "ruleGetAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1879:1: ruleGetAction returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleGetAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_template_2_0 = null;

        EObject lv_target_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1882:28: ( (otherlv_0= 'get' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1883:1: (otherlv_0= 'get' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1883:1: (otherlv_0= 'get' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1883:3: otherlv_0= 'get' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleGetAction3948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGetActionAccess().getGetKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleGetAction3960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGetActionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1891:1: ( (lv_template_2_0= ruleTemplate ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1892:1: (lv_template_2_0= ruleTemplate )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1892:1: (lv_template_2_0= ruleTemplate )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1893:3: lv_template_2_0= ruleTemplate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGetActionAccess().getTemplateTemplateParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplate_in_ruleGetAction3981);
            lv_template_2_0=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGetActionRule());
              	        }
                     		set(
                     			current, 
                     			"template",
                      		lv_template_2_0, 
                      		"Template");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleGetAction3993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGetActionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleGetAction4005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGetActionAccess().getCommercialAtKeyword_4());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1917:1: ( (lv_target_5_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1918:1: (lv_target_5_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1918:1: (lv_target_5_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1919:3: lv_target_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGetActionAccess().getTargetExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleGetAction4026);
            lv_target_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGetActionRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleGetAction4038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGetActionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGetAction"


    // $ANTLR start "entryRuleQueryAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1947:1: entryRuleQueryAction returns [EObject current=null] : iv_ruleQueryAction= ruleQueryAction EOF ;
    public final EObject entryRuleQueryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryAction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1948:2: (iv_ruleQueryAction= ruleQueryAction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1949:2: iv_ruleQueryAction= ruleQueryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryActionRule()); 
            }
            pushFollow(FOLLOW_ruleQueryAction_in_entryRuleQueryAction4074);
            iv_ruleQueryAction=ruleQueryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryAction4084); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQueryAction"


    // $ANTLR start "ruleQueryAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1956:1: ruleQueryAction returns [EObject current=null] : (otherlv_0= 'query' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleQueryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_template_2_0 = null;

        EObject lv_target_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1959:28: ( (otherlv_0= 'query' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1960:1: (otherlv_0= 'query' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1960:1: (otherlv_0= 'query' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1960:3: otherlv_0= 'query' otherlv_1= '(' ( (lv_template_2_0= ruleTemplate ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleQueryAction4121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQueryActionAccess().getQueryKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleQueryAction4133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQueryActionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1968:1: ( (lv_template_2_0= ruleTemplate ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1969:1: (lv_template_2_0= ruleTemplate )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1969:1: (lv_template_2_0= ruleTemplate )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1970:3: lv_template_2_0= ruleTemplate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQueryActionAccess().getTemplateTemplateParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplate_in_ruleQueryAction4154);
            lv_template_2_0=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQueryActionRule());
              	        }
                     		set(
                     			current, 
                     			"template",
                      		lv_template_2_0, 
                      		"Template");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleQueryAction4166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getQueryActionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleQueryAction4178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQueryActionAccess().getCommercialAtKeyword_4());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1994:1: ( (lv_target_5_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1995:1: (lv_target_5_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1995:1: (lv_target_5_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:1996:3: lv_target_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQueryActionAccess().getTargetExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleQueryAction4199);
            lv_target_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQueryActionRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleQueryAction4211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQueryActionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQueryAction"


    // $ANTLR start "entryRulePutAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2024:1: entryRulePutAction returns [EObject current=null] : iv_rulePutAction= rulePutAction EOF ;
    public final EObject entryRulePutAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutAction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2025:2: (iv_rulePutAction= rulePutAction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2026:2: iv_rulePutAction= rulePutAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutActionRule()); 
            }
            pushFollow(FOLLOW_rulePutAction_in_entryRulePutAction4247);
            iv_rulePutAction=rulePutAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePutAction4257); if (state.failed) return current;

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
    // $ANTLR end "entryRulePutAction"


    // $ANTLR start "rulePutAction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2033:1: rulePutAction returns [EObject current=null] : (otherlv_0= 'put' otherlv_1= '(' ( (lv_tuple_2_0= ruleTuple ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
    public final EObject rulePutAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tuple_2_0 = null;

        EObject lv_target_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2036:28: ( (otherlv_0= 'put' otherlv_1= '(' ( (lv_tuple_2_0= ruleTuple ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2037:1: (otherlv_0= 'put' otherlv_1= '(' ( (lv_tuple_2_0= ruleTuple ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2037:1: (otherlv_0= 'put' otherlv_1= '(' ( (lv_tuple_2_0= ruleTuple ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2037:3: otherlv_0= 'put' otherlv_1= '(' ( (lv_tuple_2_0= ruleTuple ) ) otherlv_3= ')' otherlv_4= '@' ( (lv_target_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePutAction4294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPutActionAccess().getPutKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulePutAction4306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPutActionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2045:1: ( (lv_tuple_2_0= ruleTuple ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2046:1: (lv_tuple_2_0= ruleTuple )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2046:1: (lv_tuple_2_0= ruleTuple )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2047:3: lv_tuple_2_0= ruleTuple
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutActionAccess().getTupleTupleParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTuple_in_rulePutAction4327);
            lv_tuple_2_0=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPutActionRule());
              	        }
                     		set(
                     			current, 
                     			"tuple",
                      		lv_tuple_2_0, 
                      		"Tuple");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePutAction4339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPutActionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,35,FOLLOW_35_in_rulePutAction4351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPutActionAccess().getCommercialAtKeyword_4());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2071:1: ( (lv_target_5_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2072:1: (lv_target_5_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2072:1: (lv_target_5_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2073:3: lv_target_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutActionAccess().getTargetExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePutAction4372);
            lv_target_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPutActionRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePutAction4384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPutActionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePutAction"


    // $ANTLR start "entryRuleTuple"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2103:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2104:2: (iv_ruleTuple= ruleTuple EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2105:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple4422);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple4432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2112:1: ruleTuple returns [EObject current=null] : ( ( (lv_fields_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2115:28: ( ( ( (lv_fields_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleExpression ) ) )* ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2116:1: ( ( (lv_fields_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleExpression ) ) )* )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2116:1: ( ( (lv_fields_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleExpression ) ) )* )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2116:2: ( (lv_fields_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleExpression ) ) )*
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2116:2: ( (lv_fields_0_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2117:1: (lv_fields_0_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2117:1: (lv_fields_0_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2118:3: lv_fields_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getFieldsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTuple4478);
            lv_fields_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleRule());
              	        }
                     		add(
                     			current, 
                     			"fields",
                      		lv_fields_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2134:2: (otherlv_1= ',' ( (lv_fields_2_0= ruleExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2134:4: otherlv_1= ',' ( (lv_fields_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTuple4491); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2138:1: ( (lv_fields_2_0= ruleExpression ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2139:1: (lv_fields_2_0= ruleExpression )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2139:1: (lv_fields_2_0= ruleExpression )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2140:3: lv_fields_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getFieldsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleTuple4512);
            	    lv_fields_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleTemplate"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2164:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2165:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2166:2: iv_ruleTemplate= ruleTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateRule()); 
            }
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate4550);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate4560); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2173:1: ruleTemplate returns [EObject current=null] : ( ( (lv_fields_0_0= ruleTemplateField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleTemplateField ) ) )* ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2176:28: ( ( ( (lv_fields_0_0= ruleTemplateField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleTemplateField ) ) )* ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2177:1: ( ( (lv_fields_0_0= ruleTemplateField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleTemplateField ) ) )* )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2177:1: ( ( (lv_fields_0_0= ruleTemplateField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleTemplateField ) ) )* )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2177:2: ( (lv_fields_0_0= ruleTemplateField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleTemplateField ) ) )*
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2177:2: ( (lv_fields_0_0= ruleTemplateField ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2178:1: (lv_fields_0_0= ruleTemplateField )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2178:1: (lv_fields_0_0= ruleTemplateField )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2179:3: lv_fields_0_0= ruleTemplateField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateAccess().getFieldsTemplateFieldParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplateField_in_ruleTemplate4606);
            lv_fields_0_0=ruleTemplateField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateRule());
              	        }
                     		add(
                     			current, 
                     			"fields",
                      		lv_fields_0_0, 
                      		"TemplateField");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2195:2: (otherlv_1= ',' ( (lv_fields_2_0= ruleTemplateField ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2195:4: otherlv_1= ',' ( (lv_fields_2_0= ruleTemplateField ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTemplate4619); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTemplateAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2199:1: ( (lv_fields_2_0= ruleTemplateField ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2200:1: (lv_fields_2_0= ruleTemplateField )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2200:1: (lv_fields_2_0= ruleTemplateField )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2201:3: lv_fields_2_0= ruleTemplateField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateAccess().getFieldsTemplateFieldParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemplateField_in_ruleTemplate4640);
            	    lv_fields_2_0=ruleTemplateField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_2_0, 
            	              		"TemplateField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleTemplateField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2225:1: entryRuleTemplateField returns [EObject current=null] : iv_ruleTemplateField= ruleTemplateField EOF ;
    public final EObject entryRuleTemplateField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateField = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2226:2: (iv_ruleTemplateField= ruleTemplateField EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2227:2: iv_ruleTemplateField= ruleTemplateField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateFieldRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateField_in_entryRuleTemplateField4678);
            iv_ruleTemplateField=ruleTemplateField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateField4688); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateField"


    // $ANTLR start "ruleTemplateField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2234:1: ruleTemplateField returns [EObject current=null] : (this_AnyFormalField_0= ruleAnyFormalField | this_FormalField_1= ruleFormalField | this_ActualField_2= ruleActualField | this_TypedFormalField_3= ruleTypedFormalField ) ;
    public final EObject ruleTemplateField() throws RecognitionException {
        EObject current = null;

        EObject this_AnyFormalField_0 = null;

        EObject this_FormalField_1 = null;

        EObject this_ActualField_2 = null;

        EObject this_TypedFormalField_3 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2237:28: ( (this_AnyFormalField_0= ruleAnyFormalField | this_FormalField_1= ruleFormalField | this_ActualField_2= ruleActualField | this_TypedFormalField_3= ruleTypedFormalField ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2238:1: (this_AnyFormalField_0= ruleAnyFormalField | this_FormalField_1= ruleFormalField | this_ActualField_2= ruleActualField | this_TypedFormalField_3= ruleTypedFormalField )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2238:1: (this_AnyFormalField_0= ruleAnyFormalField | this_FormalField_1= ruleFormalField | this_ActualField_2= ruleActualField | this_TypedFormalField_3= ruleTypedFormalField )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt26=1;
                }
                break;
            case 39:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 44:
            case 48:
            case 49:
            case 50:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt26=3;
                }
                break;
            case 21:
                {
                int LA26_4 = input.LA(2);

                if ( ((LA26_4>=RULE_ID && LA26_4<=RULE_INT)||LA26_4==21||LA26_4==44||(LA26_4>=48 && LA26_4<=50)||(LA26_4>=52 && LA26_4<=65)) ) {
                    alt26=3;
                }
                else if ( ((LA26_4>=68 && LA26_4<=71)) ) {
                    alt26=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2239:5: this_AnyFormalField_0= ruleAnyFormalField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateFieldAccess().getAnyFormalFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyFormalField_in_ruleTemplateField4735);
                    this_AnyFormalField_0=ruleAnyFormalField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnyFormalField_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2249:5: this_FormalField_1= ruleFormalField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateFieldAccess().getFormalFieldParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFormalField_in_ruleTemplateField4762);
                    this_FormalField_1=ruleFormalField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FormalField_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2259:5: this_ActualField_2= ruleActualField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateFieldAccess().getActualFieldParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActualField_in_ruleTemplateField4789);
                    this_ActualField_2=ruleActualField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActualField_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2269:5: this_TypedFormalField_3= ruleTypedFormalField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateFieldAccess().getTypedFormalFieldParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedFormalField_in_ruleTemplateField4816);
                    this_TypedFormalField_3=ruleTypedFormalField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedFormalField_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateField"


    // $ANTLR start "entryRuleAnyFormalField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2285:1: entryRuleAnyFormalField returns [EObject current=null] : iv_ruleAnyFormalField= ruleAnyFormalField EOF ;
    public final EObject entryRuleAnyFormalField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyFormalField = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2286:2: (iv_ruleAnyFormalField= ruleAnyFormalField EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2287:2: iv_ruleAnyFormalField= ruleAnyFormalField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyFormalFieldRule()); 
            }
            pushFollow(FOLLOW_ruleAnyFormalField_in_entryRuleAnyFormalField4851);
            iv_ruleAnyFormalField=ruleAnyFormalField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyFormalField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyFormalField4861); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnyFormalField"


    // $ANTLR start "ruleAnyFormalField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2294:1: ruleAnyFormalField returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleAnyFormalField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2297:28: ( ( () otherlv_1= '*' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2298:1: ( () otherlv_1= '*' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2298:1: ( () otherlv_1= '*' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2298:2: () otherlv_1= '*'
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2298:2: ()
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2299:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAnyFormalFieldAccess().getAnyFormalFieldAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleAnyFormalField4907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnyFormalFieldAccess().getAsteriskKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnyFormalField"


    // $ANTLR start "entryRuleTypedFormalField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2316:1: entryRuleTypedFormalField returns [EObject current=null] : iv_ruleTypedFormalField= ruleTypedFormalField EOF ;
    public final EObject entryRuleTypedFormalField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedFormalField = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2317:2: (iv_ruleTypedFormalField= ruleTypedFormalField EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2318:2: iv_ruleTypedFormalField= ruleTypedFormalField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedFormalFieldRule()); 
            }
            pushFollow(FOLLOW_ruleTypedFormalField_in_entryRuleTypedFormalField4943);
            iv_ruleTypedFormalField=ruleTypedFormalField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedFormalField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedFormalField4953); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedFormalField"


    // $ANTLR start "ruleTypedFormalField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2325:1: ruleTypedFormalField returns [EObject current=null] : (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypedFormalField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2328:28: ( (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2329:1: (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2329:1: (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2329:3: otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTypedFormalField4990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedFormalFieldAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2333:1: ( (lv_type_1_0= ruleType ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2334:1: (lv_type_1_0= ruleType )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2334:1: (lv_type_1_0= ruleType )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2335:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedFormalFieldAccess().getTypeTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleTypedFormalField5011);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedFormalFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleTypedFormalField5023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedFormalFieldAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypedFormalField"


    // $ANTLR start "entryRuleFormalField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2363:1: entryRuleFormalField returns [EObject current=null] : iv_ruleFormalField= ruleFormalField EOF ;
    public final EObject entryRuleFormalField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalField = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2364:2: (iv_ruleFormalField= ruleFormalField EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2365:2: iv_ruleFormalField= ruleFormalField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalFieldRule()); 
            }
            pushFollow(FOLLOW_ruleFormalField_in_entryRuleFormalField5059);
            iv_ruleFormalField=ruleFormalField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalField5069); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFormalField"


    // $ANTLR start "ruleFormalField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2372:1: ruleFormalField returns [EObject current=null] : (otherlv_0= '?' ( ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' ) ) ) ;
    public final EObject ruleFormalField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variable_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2375:28: ( (otherlv_0= '?' ( ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' ) ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2376:1: (otherlv_0= '?' ( ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' ) ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2376:1: (otherlv_0= '?' ( ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2376:3: otherlv_0= '?' ( ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleFormalField5106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalFieldAccess().getQuestionMarkKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2380:1: ( ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==16) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2380:2: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2380:2: ( () ( (otherlv_2= RULE_ID ) ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2380:3: () ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2380:3: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2381:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getFormalFieldAccess().getStandardFormalFieldAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2386:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2387:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2387:1: (otherlv_2= RULE_ID )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2388:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFormalFieldRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalField5137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getFormalFieldAccess().getReferenceVariableCrossReference_1_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2400:6: ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2400:6: ( () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2400:7: () otherlv_4= '[' ( (lv_variable_5_0= ruleVariable ) ) otherlv_6= ']'
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2400:7: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2401:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getFormalFieldAccess().getFormalFieldWithDeclarationAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFormalField5166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFormalFieldAccess().getLeftSquareBracketKeyword_1_1_1());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2410:1: ( (lv_variable_5_0= ruleVariable ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2411:1: (lv_variable_5_0= ruleVariable )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2411:1: (lv_variable_5_0= ruleVariable )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2412:3: lv_variable_5_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFormalFieldAccess().getVariableVariableParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleFormalField5187);
                    lv_variable_5_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFormalFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_5_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleFormalField5199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFormalFieldAccess().getRightSquareBracketKeyword_1_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFormalField"


    // $ANTLR start "entryRuleActualField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2440:1: entryRuleActualField returns [EObject current=null] : iv_ruleActualField= ruleActualField EOF ;
    public final EObject entryRuleActualField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualField = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2441:2: (iv_ruleActualField= ruleActualField EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2442:2: iv_ruleActualField= ruleActualField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActualFieldRule()); 
            }
            pushFollow(FOLLOW_ruleActualField_in_entryRuleActualField5237);
            iv_ruleActualField=ruleActualField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActualField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualField5247); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActualField"


    // $ANTLR start "ruleActualField"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2449:1: ruleActualField returns [EObject current=null] : ( (lv_value_0_0= ruleExpression ) ) ;
    public final EObject ruleActualField() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2452:28: ( ( (lv_value_0_0= ruleExpression ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2453:1: ( (lv_value_0_0= ruleExpression ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2453:1: ( (lv_value_0_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2454:1: (lv_value_0_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2454:1: (lv_value_0_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2455:3: lv_value_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActualFieldAccess().getValueExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleActualField5292);
            lv_value_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActualFieldRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleActualField"


    // $ANTLR start "entryRuleWhile"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2479:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2480:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2481:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile5327);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile5337); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2488:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_guard_2_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2491:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2492:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2492:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2492:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleWhile5374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleWhile5386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2500:1: ( (lv_guard_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2501:1: (lv_guard_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2501:1: (lv_guard_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2502:3: lv_guard_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getGuardExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile5407);
            lv_guard_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"guard",
                      		lv_guard_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleWhile5419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2522:1: ( (lv_body_4_0= ruleCommand ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2523:1: (lv_body_4_0= ruleCommand )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2523:1: (lv_body_4_0= ruleCommand )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2524:3: lv_body_4_0= ruleCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getBodyCommandParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleWhile5440);
            lv_body_4_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_4_0, 
                      		"Command");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleIfThenElse"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2548:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2549:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2550:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse5476);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse5486); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2557:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_guard_2_0 = null;

        EObject lv_thenBranch_4_0 = null;

        EObject lv_elseBranch_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2560:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2561:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2561:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2561:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleIfThenElse5523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleIfThenElse5535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2569:1: ( (lv_guard_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2570:1: (lv_guard_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2570:1: (lv_guard_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2571:3: lv_guard_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getGuardExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElse5556);
            lv_guard_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"guard",
                      		lv_guard_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleIfThenElse5568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2591:1: ( (lv_thenBranch_4_0= ruleCommand ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2592:1: (lv_thenBranch_4_0= ruleCommand )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2592:1: (lv_thenBranch_4_0= ruleCommand )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2593:3: lv_thenBranch_4_0= ruleCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenBranchCommandParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleIfThenElse5589);
            lv_thenBranch_4_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"thenBranch",
                      		lv_thenBranch_4_0, 
                      		"Command");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2609:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred1_InternalScelLight()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2609:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2609:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2609:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleIfThenElse5610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2614:2: ( (lv_elseBranch_6_0= ruleCommand ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2615:1: (lv_elseBranch_6_0= ruleCommand )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2615:1: (lv_elseBranch_6_0= ruleCommand )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2616:3: lv_elseBranch_6_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseBranchCommandParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommand_in_ruleIfThenElse5632);
                    lv_elseBranch_6_0=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBranch",
                              		lv_elseBranch_6_0, 
                              		"Command");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleBlock"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2640:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2641:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2642:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock5670);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock5680); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2649:1: ruleBlock returns [EObject current=null] : ( () ( (lv_commands_1_0= ruleCommand ) )* ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2652:28: ( ( () ( (lv_commands_1_0= ruleCommand ) )* ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2653:1: ( () ( (lv_commands_1_0= ruleCommand ) )* )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2653:1: ( () ( (lv_commands_1_0= ruleCommand ) )* )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2653:2: () ( (lv_commands_1_0= ruleCommand ) )*
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2653:2: ()
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2659:2: ( (lv_commands_1_0= ruleCommand ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==24||LA29_0==27||(LA29_0>=33 && LA29_0<=34)||(LA29_0>=36 && LA29_0<=37)||(LA29_0>=40 && LA29_0<=41)||(LA29_0>=68 && LA29_0<=71)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2660:1: (lv_commands_1_0= ruleCommand )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2660:1: (lv_commands_1_0= ruleCommand )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2661:3: lv_commands_1_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getCommandsCommandParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleBlock5735);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"commands",
            	              		lv_commands_1_0, 
            	              		"Command");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2685:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2686:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2687:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5772);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5782); if (state.failed) return current;

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
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2694:1: ruleExpression returns [EObject current=null] : this_Disjunction_0= ruleDisjunction ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2697:28: (this_Disjunction_0= ruleDisjunction )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2699:5: this_Disjunction_0= ruleDisjunction
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getDisjunctionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleExpression5828);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleDisjunction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2715:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2716:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2717:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction5862);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction5872); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2724:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleDisjunction ) ) )? ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2727:28: ( (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleDisjunction ) ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2728:1: (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleDisjunction ) ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2728:1: (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleDisjunction ) ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2729:5: this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleDisjunction ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction5919);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2737:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleDisjunction ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2737:2: () otherlv_2= '|' ( (lv_right_3_0= ruleDisjunction ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2737:2: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2738:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleDisjunction5940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_1_1());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2747:1: ( (lv_right_3_0= ruleDisjunction ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2748:1: (lv_right_3_0= ruleDisjunction )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2748:1: (lv_right_3_0= ruleDisjunction )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2749:3: lv_right_3_0= ruleDisjunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleDisjunction5961);
                    lv_right_3_0=ruleDisjunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Disjunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2773:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2774:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2775:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction5999);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction6009); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2782:1: ruleConjunction returns [EObject current=null] : (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleConjunction ) ) )? ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2785:28: ( (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleConjunction ) ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2786:1: (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleConjunction ) ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2786:1: (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleConjunction ) ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2787:5: this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleConjunction ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegation_in_ruleConjunction6056);
            this_Negation_0=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Negation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2795:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleConjunction ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2795:2: () otherlv_2= '&' ( (lv_right_3_0= ruleConjunction ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2795:2: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2796:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleConjunction6077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConjunctionAccess().getAmpersandKeyword_1_1());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2805:1: ( (lv_right_3_0= ruleConjunction ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2806:1: (lv_right_3_0= ruleConjunction )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2806:1: (lv_right_3_0= ruleConjunction )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2807:3: lv_right_3_0= ruleConjunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConjunction_in_ruleConjunction6098);
                    lv_right_3_0=ruleConjunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Conjunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2831:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2832:2: (iv_ruleNegation= ruleNegation EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2833:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation6136);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation6146); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2840:1: ruleNegation returns [EObject current=null] : ( (otherlv_0= '!' () ( (lv_arg_2_0= ruleRelation ) ) ) | this_Relation_3= ruleRelation ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_arg_2_0 = null;

        EObject this_Relation_3 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2843:28: ( ( (otherlv_0= '!' () ( (lv_arg_2_0= ruleRelation ) ) ) | this_Relation_3= ruleRelation ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2844:1: ( (otherlv_0= '!' () ( (lv_arg_2_0= ruleRelation ) ) ) | this_Relation_3= ruleRelation )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2844:1: ( (otherlv_0= '!' () ( (lv_arg_2_0= ruleRelation ) ) ) | this_Relation_3= ruleRelation )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||LA32_0==21||(LA32_0>=48 && LA32_0<=50)||(LA32_0>=52 && LA32_0<=65)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2844:2: (otherlv_0= '!' () ( (lv_arg_2_0= ruleRelation ) ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2844:2: (otherlv_0= '!' () ( (lv_arg_2_0= ruleRelation ) ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2844:4: otherlv_0= '!' () ( (lv_arg_2_0= ruleRelation ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleNegation6184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0_0());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2848:1: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2849:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegationAccess().getNegationAction_0_1(),
                                  current);
                          
                    }

                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2854:2: ( (lv_arg_2_0= ruleRelation ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2855:1: (lv_arg_2_0= ruleRelation )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2855:1: (lv_arg_2_0= ruleRelation )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2856:3: lv_arg_2_0= ruleRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegationAccess().getArgRelationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelation_in_ruleNegation6214);
                    lv_arg_2_0=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegationRule());
                      	        }
                             		set(
                             			current, 
                             			"arg",
                              		lv_arg_2_0, 
                              		"Relation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2874:5: this_Relation_3= ruleRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegationAccess().getRelationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelation_in_ruleNegation6243);
                    this_Relation_3=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Relation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleRelation"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2890:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2891:2: (iv_ruleRelation= ruleRelation EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2892:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation6278);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation6288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2899:1: ruleRelation returns [EObject current=null] : (this_SummationSubtraction_0= ruleSummationSubtraction ( () ( (lv_rel_2_0= ruleRelationSymbol ) ) ( (lv_right_3_0= ruleRelation ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_SummationSubtraction_0 = null;

        Enumerator lv_rel_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2902:28: ( (this_SummationSubtraction_0= ruleSummationSubtraction ( () ( (lv_rel_2_0= ruleRelationSymbol ) ) ( (lv_right_3_0= ruleRelation ) ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2903:1: (this_SummationSubtraction_0= ruleSummationSubtraction ( () ( (lv_rel_2_0= ruleRelationSymbol ) ) ( (lv_right_3_0= ruleRelation ) ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2903:1: (this_SummationSubtraction_0= ruleSummationSubtraction ( () ( (lv_rel_2_0= ruleRelationSymbol ) ) ( (lv_right_3_0= ruleRelation ) ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2904:5: this_SummationSubtraction_0= ruleSummationSubtraction ( () ( (lv_rel_2_0= ruleRelationSymbol ) ) ( (lv_right_3_0= ruleRelation ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationAccess().getSummationSubtractionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSummationSubtraction_in_ruleRelation6335);
            this_SummationSubtraction_0=ruleSummationSubtraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SummationSubtraction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2912:1: ( () ( (lv_rel_2_0= ruleRelationSymbol ) ) ( (lv_right_3_0= ruleRelation ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15||LA33_0==28||(LA33_0>=72 && LA33_0<=74)) ) {
                alt33=1;
            }
            else if ( (LA33_0==29) ) {
                int LA33_2 = input.LA(2);

                if ( ((LA33_2>=RULE_ID && LA33_2<=RULE_INT)||LA33_2==21||(LA33_2>=48 && LA33_2<=50)||(LA33_2>=52 && LA33_2<=65)) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2912:2: () ( (lv_rel_2_0= ruleRelationSymbol ) ) ( (lv_right_3_0= ruleRelation ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2912:2: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2913:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationAccess().getRelationLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2918:2: ( (lv_rel_2_0= ruleRelationSymbol ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2919:1: (lv_rel_2_0= ruleRelationSymbol )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2919:1: (lv_rel_2_0= ruleRelationSymbol )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2920:3: lv_rel_2_0= ruleRelationSymbol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationAccess().getRelRelationSymbolEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelationSymbol_in_ruleRelation6365);
                    lv_rel_2_0=ruleRelationSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"rel",
                              		lv_rel_2_0, 
                              		"RelationSymbol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2936:2: ( (lv_right_3_0= ruleRelation ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2937:1: (lv_right_3_0= ruleRelation )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2937:1: (lv_right_3_0= ruleRelation )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2938:3: lv_right_3_0= ruleRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationAccess().getRightRelationParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelation_in_ruleRelation6386);
                    lv_right_3_0=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Relation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleSummationSubtraction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2962:1: entryRuleSummationSubtraction returns [EObject current=null] : iv_ruleSummationSubtraction= ruleSummationSubtraction EOF ;
    public final EObject entryRuleSummationSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummationSubtraction = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2963:2: (iv_ruleSummationSubtraction= ruleSummationSubtraction EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2964:2: iv_ruleSummationSubtraction= ruleSummationSubtraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSummationSubtractionRule()); 
            }
            pushFollow(FOLLOW_ruleSummationSubtraction_in_entryRuleSummationSubtraction6424);
            iv_ruleSummationSubtraction=ruleSummationSubtraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSummationSubtraction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummationSubtraction6434); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSummationSubtraction"


    // $ANTLR start "ruleSummationSubtraction"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2971:1: ruleSummationSubtraction returns [EObject current=null] : (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? ) ;
    public final EObject ruleSummationSubtraction() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplicationDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2974:28: ( (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2975:1: (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2975:1: (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2976:5: this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSummationSubtractionAccess().getMultiplicationDivisionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicationDivision_in_ruleSummationSubtraction6481);
            this_MultiplicationDivision_0=ruleMultiplicationDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicationDivision_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2984:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=45 && LA35_0<=46)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2984:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2984:2: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2985:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2990:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2991:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2991:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2992:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2992:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==45) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==46) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2993:3: lv_op_2_1= '+'
                            {
                            lv_op_2_1=(Token)match(input,45,FOLLOW_45_in_ruleSummationSubtraction6510); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getSummationSubtractionAccess().getOpPlusSignKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSummationSubtractionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3005:8: lv_op_2_2= '-'
                            {
                            lv_op_2_2=(Token)match(input,46,FOLLOW_46_in_ruleSummationSubtraction6539); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getSummationSubtractionAccess().getOpHyphenMinusKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSummationSubtractionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3020:2: ( (lv_right_3_0= ruleSummationSubtraction ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3021:1: (lv_right_3_0= ruleSummationSubtraction )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3021:1: (lv_right_3_0= ruleSummationSubtraction )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3022:3: lv_right_3_0= ruleSummationSubtraction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSummationSubtractionAccess().getRightSummationSubtractionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSummationSubtraction_in_ruleSummationSubtraction6576);
                    lv_right_3_0=ruleSummationSubtraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSummationSubtractionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"SummationSubtraction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSummationSubtraction"


    // $ANTLR start "entryRuleMultiplicationDivision"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3046:1: entryRuleMultiplicationDivision returns [EObject current=null] : iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF ;
    public final EObject entryRuleMultiplicationDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivision = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3047:2: (iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3048:2: iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationDivisionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationDivision_in_entryRuleMultiplicationDivision6614);
            iv_ruleMultiplicationDivision=ruleMultiplicationDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationDivision; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationDivision6624); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicationDivision"


    // $ANTLR start "ruleMultiplicationDivision"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3055:1: ruleMultiplicationDivision returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? ) ;
    public final EObject ruleMultiplicationDivision() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_BaseExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3058:28: ( (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3059:1: (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3059:1: (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3060:5: this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationDivisionAccess().getBaseExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBaseExpression_in_ruleMultiplicationDivision6671);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BaseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3068:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38||LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3068:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3068:2: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3069:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3074:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3075:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3075:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3076:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3076:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==38) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==47) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3077:3: lv_op_2_1= '*'
                            {
                            lv_op_2_1=(Token)match(input,38,FOLLOW_38_in_ruleMultiplicationDivision6700); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getMultiplicationDivisionAccess().getOpAsteriskKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getMultiplicationDivisionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3089:8: lv_op_2_2= '/'
                            {
                            lv_op_2_2=(Token)match(input,47,FOLLOW_47_in_ruleMultiplicationDivision6729); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getMultiplicationDivisionAccess().getOpSolidusKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getMultiplicationDivisionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3104:2: ( (lv_right_3_0= ruleMultiplicationDivision ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3105:1: (lv_right_3_0= ruleMultiplicationDivision )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3105:1: (lv_right_3_0= ruleMultiplicationDivision )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3106:3: lv_right_3_0= ruleMultiplicationDivision
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicationDivisionAccess().getRightMultiplicationDivisionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicationDivision_in_ruleMultiplicationDivision6766);
                    lv_right_3_0=ruleMultiplicationDivision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicationDivisionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"MultiplicationDivision");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicationDivision"


    // $ANTLR start "entryRuleBaseExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3130:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3131:2: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3132:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression6804);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseExpression6814); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3139:1: ruleBaseExpression returns [EObject current=null] : ( (otherlv_0= 'true' () ) | (otherlv_2= 'false' () ) | (otherlv_4= '(' this_Expression_5= ruleExpression ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )? otherlv_11= ')' ) | this_StringLiteral_12= ruleStringLiteral | this_NumberLiteral_13= ruleNumberLiteral | this_MinExpression_14= ruleMinExpression | this_MaxExpression_15= ruleMaxExpression | this_FloorExpression_16= ruleFloorExpression | this_CeilExpression_17= ruleCeilExpression | this_PowExpression_18= rulePowExpression | this_ModExpression_19= ruleModExpression | this_LogExpression_20= ruleLogExpression | this_FactorialExpression_21= ruleFactorialExpression | this_SinExpression_22= ruleSinExpression | this_CosExpression_23= ruleCosExpression | this_TanExpression_24= ruleTanExpression | this_ASinExpression_25= ruleASinExpression | this_ACosExpression_26= ruleACosExpression | this_ATanExpression_27= ruleATanExpression | this_SelfExpression_28= ruleSelfExpression | this_ReferenceCallAccess_29= ruleReferenceCallAccess ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_Expression_5 = null;

        EObject lv_thenBranch_8_0 = null;

        EObject lv_elseBranch_10_0 = null;

        EObject this_StringLiteral_12 = null;

        EObject this_NumberLiteral_13 = null;

        EObject this_MinExpression_14 = null;

        EObject this_MaxExpression_15 = null;

        EObject this_FloorExpression_16 = null;

        EObject this_CeilExpression_17 = null;

        EObject this_PowExpression_18 = null;

        EObject this_ModExpression_19 = null;

        EObject this_LogExpression_20 = null;

        EObject this_FactorialExpression_21 = null;

        EObject this_SinExpression_22 = null;

        EObject this_CosExpression_23 = null;

        EObject this_TanExpression_24 = null;

        EObject this_ASinExpression_25 = null;

        EObject this_ACosExpression_26 = null;

        EObject this_ATanExpression_27 = null;

        EObject this_SelfExpression_28 = null;

        EObject this_ReferenceCallAccess_29 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3142:28: ( ( (otherlv_0= 'true' () ) | (otherlv_2= 'false' () ) | (otherlv_4= '(' this_Expression_5= ruleExpression ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )? otherlv_11= ')' ) | this_StringLiteral_12= ruleStringLiteral | this_NumberLiteral_13= ruleNumberLiteral | this_MinExpression_14= ruleMinExpression | this_MaxExpression_15= ruleMaxExpression | this_FloorExpression_16= ruleFloorExpression | this_CeilExpression_17= ruleCeilExpression | this_PowExpression_18= rulePowExpression | this_ModExpression_19= ruleModExpression | this_LogExpression_20= ruleLogExpression | this_FactorialExpression_21= ruleFactorialExpression | this_SinExpression_22= ruleSinExpression | this_CosExpression_23= ruleCosExpression | this_TanExpression_24= ruleTanExpression | this_ASinExpression_25= ruleASinExpression | this_ACosExpression_26= ruleACosExpression | this_ATanExpression_27= ruleATanExpression | this_SelfExpression_28= ruleSelfExpression | this_ReferenceCallAccess_29= ruleReferenceCallAccess ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3143:1: ( (otherlv_0= 'true' () ) | (otherlv_2= 'false' () ) | (otherlv_4= '(' this_Expression_5= ruleExpression ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )? otherlv_11= ')' ) | this_StringLiteral_12= ruleStringLiteral | this_NumberLiteral_13= ruleNumberLiteral | this_MinExpression_14= ruleMinExpression | this_MaxExpression_15= ruleMaxExpression | this_FloorExpression_16= ruleFloorExpression | this_CeilExpression_17= ruleCeilExpression | this_PowExpression_18= rulePowExpression | this_ModExpression_19= ruleModExpression | this_LogExpression_20= ruleLogExpression | this_FactorialExpression_21= ruleFactorialExpression | this_SinExpression_22= ruleSinExpression | this_CosExpression_23= ruleCosExpression | this_TanExpression_24= ruleTanExpression | this_ASinExpression_25= ruleASinExpression | this_ACosExpression_26= ruleACosExpression | this_ATanExpression_27= ruleATanExpression | this_SelfExpression_28= ruleSelfExpression | this_ReferenceCallAccess_29= ruleReferenceCallAccess )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3143:1: ( (otherlv_0= 'true' () ) | (otherlv_2= 'false' () ) | (otherlv_4= '(' this_Expression_5= ruleExpression ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )? otherlv_11= ')' ) | this_StringLiteral_12= ruleStringLiteral | this_NumberLiteral_13= ruleNumberLiteral | this_MinExpression_14= ruleMinExpression | this_MaxExpression_15= ruleMaxExpression | this_FloorExpression_16= ruleFloorExpression | this_CeilExpression_17= ruleCeilExpression | this_PowExpression_18= rulePowExpression | this_ModExpression_19= ruleModExpression | this_LogExpression_20= ruleLogExpression | this_FactorialExpression_21= ruleFactorialExpression | this_SinExpression_22= ruleSinExpression | this_CosExpression_23= ruleCosExpression | this_TanExpression_24= ruleTanExpression | this_ASinExpression_25= ruleASinExpression | this_ACosExpression_26= ruleACosExpression | this_ATanExpression_27= ruleATanExpression | this_SelfExpression_28= ruleSelfExpression | this_ReferenceCallAccess_29= ruleReferenceCallAccess )
            int alt39=21;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt39=1;
                }
                break;
            case 49:
                {
                alt39=2;
                }
                break;
            case 21:
                {
                alt39=3;
                }
                break;
            case RULE_STRING:
                {
                alt39=4;
                }
                break;
            case RULE_INT:
                {
                alt39=5;
                }
                break;
            case 58:
                {
                alt39=6;
                }
                break;
            case 59:
                {
                alt39=7;
                }
                break;
            case 56:
                {
                alt39=8;
                }
                break;
            case 57:
                {
                alt39=9;
                }
                break;
            case 55:
                {
                alt39=10;
                }
                break;
            case 54:
                {
                alt39=11;
                }
                break;
            case 53:
                {
                alt39=12;
                }
                break;
            case 52:
                {
                alt39=13;
                }
                break;
            case 60:
                {
                alt39=14;
                }
                break;
            case 61:
                {
                alt39=15;
                }
                break;
            case 62:
                {
                alt39=16;
                }
                break;
            case 64:
                {
                alt39=17;
                }
                break;
            case 65:
                {
                alt39=18;
                }
                break;
            case 63:
                {
                alt39=19;
                }
                break;
            case 50:
                {
                alt39=20;
                }
                break;
            case RULE_ID:
                {
                alt39=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3143:2: (otherlv_0= 'true' () )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3143:2: (otherlv_0= 'true' () )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3143:4: otherlv_0= 'true' ()
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleBaseExpression6852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBaseExpressionAccess().getTrueKeyword_0_0());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3147:1: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3148:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBaseExpressionAccess().getTrueExpressionAction_0_1(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3154:6: (otherlv_2= 'false' () )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3154:6: (otherlv_2= 'false' () )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3154:8: otherlv_2= 'false' ()
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleBaseExpression6881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBaseExpressionAccess().getFalseKeyword_1_0());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3158:1: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3159:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBaseExpressionAccess().getFalseExpressionAction_1_1(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3165:6: (otherlv_4= '(' this_Expression_5= ruleExpression ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )? otherlv_11= ')' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3165:6: (otherlv_4= '(' this_Expression_5= ruleExpression ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )? otherlv_11= ')' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3165:8: otherlv_4= '(' this_Expression_5= ruleExpression ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )? otherlv_11= ')'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleBaseExpression6910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBaseExpression6932);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3178:1: ( () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==39) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3178:2: () otherlv_7= '?' ( (lv_thenBranch_8_0= ruleExpression ) ) otherlv_9= ':' ( (lv_elseBranch_10_0= ruleExpression ) )
                            {
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3178:2: ()
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3179:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleBaseExpression6953); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getBaseExpressionAccess().getQuestionMarkKeyword_2_2_1());
                                  
                            }
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3188:1: ( (lv_thenBranch_8_0= ruleExpression ) )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3189:1: (lv_thenBranch_8_0= ruleExpression )
                            {
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3189:1: (lv_thenBranch_8_0= ruleExpression )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3190:3: lv_thenBranch_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBaseExpressionAccess().getThenBranchExpressionParserRuleCall_2_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleBaseExpression6974);
                            lv_thenBranch_8_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBaseExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"thenBranch",
                                      		lv_thenBranch_8_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleBaseExpression6986); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getBaseExpressionAccess().getColonKeyword_2_2_3());
                                  
                            }
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3210:1: ( (lv_elseBranch_10_0= ruleExpression ) )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3211:1: (lv_elseBranch_10_0= ruleExpression )
                            {
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3211:1: (lv_elseBranch_10_0= ruleExpression )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3212:3: lv_elseBranch_10_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBaseExpressionAccess().getElseBranchExpressionParserRuleCall_2_2_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleBaseExpression7007);
                            lv_elseBranch_10_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBaseExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"elseBranch",
                                      		lv_elseBranch_10_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleBaseExpression7021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3234:5: this_StringLiteral_12= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleBaseExpression7050);
                    this_StringLiteral_12=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3244:5: this_NumberLiteral_13= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getNumberLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleBaseExpression7077);
                    this_NumberLiteral_13=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3254:5: this_MinExpression_14= ruleMinExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getMinExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinExpression_in_ruleBaseExpression7104);
                    this_MinExpression_14=ruleMinExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MinExpression_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3264:5: this_MaxExpression_15= ruleMaxExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getMaxExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaxExpression_in_ruleBaseExpression7131);
                    this_MaxExpression_15=ruleMaxExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MaxExpression_15; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3274:5: this_FloorExpression_16= ruleFloorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getFloorExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloorExpression_in_ruleBaseExpression7158);
                    this_FloorExpression_16=ruleFloorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloorExpression_16; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3284:5: this_CeilExpression_17= ruleCeilExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getCeilExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCeilExpression_in_ruleBaseExpression7185);
                    this_CeilExpression_17=ruleCeilExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CeilExpression_17; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3294:5: this_PowExpression_18= rulePowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getPowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_rulePowExpression_in_ruleBaseExpression7212);
                    this_PowExpression_18=rulePowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PowExpression_18; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3304:5: this_ModExpression_19= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getModExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleBaseExpression7239);
                    this_ModExpression_19=ruleModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ModExpression_19; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3314:5: this_LogExpression_20= ruleLogExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getLogExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLogExpression_in_ruleBaseExpression7266);
                    this_LogExpression_20=ruleLogExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LogExpression_20; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3324:5: this_FactorialExpression_21= ruleFactorialExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getFactorialExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFactorialExpression_in_ruleBaseExpression7293);
                    this_FactorialExpression_21=ruleFactorialExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FactorialExpression_21; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3334:5: this_SinExpression_22= ruleSinExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getSinExpressionParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSinExpression_in_ruleBaseExpression7320);
                    this_SinExpression_22=ruleSinExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SinExpression_22; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3344:5: this_CosExpression_23= ruleCosExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getCosExpressionParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCosExpression_in_ruleBaseExpression7347);
                    this_CosExpression_23=ruleCosExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CosExpression_23; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3354:5: this_TanExpression_24= ruleTanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getTanExpressionParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTanExpression_in_ruleBaseExpression7374);
                    this_TanExpression_24=ruleTanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TanExpression_24; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3364:5: this_ASinExpression_25= ruleASinExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getASinExpressionParserRuleCall_16()); 
                          
                    }
                    pushFollow(FOLLOW_ruleASinExpression_in_ruleBaseExpression7401);
                    this_ASinExpression_25=ruleASinExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ASinExpression_25; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3374:5: this_ACosExpression_26= ruleACosExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getACosExpressionParserRuleCall_17()); 
                          
                    }
                    pushFollow(FOLLOW_ruleACosExpression_in_ruleBaseExpression7428);
                    this_ACosExpression_26=ruleACosExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ACosExpression_26; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3384:5: this_ATanExpression_27= ruleATanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getATanExpressionParserRuleCall_18()); 
                          
                    }
                    pushFollow(FOLLOW_ruleATanExpression_in_ruleBaseExpression7455);
                    this_ATanExpression_27=ruleATanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ATanExpression_27; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3394:5: this_SelfExpression_28= ruleSelfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getSelfExpressionParserRuleCall_19()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelfExpression_in_ruleBaseExpression7482);
                    this_SelfExpression_28=ruleSelfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfExpression_28; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3404:5: this_ReferenceCallAccess_29= ruleReferenceCallAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getReferenceCallAccessParserRuleCall_20()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceCallAccess_in_ruleBaseExpression7509);
                    this_ReferenceCallAccess_29=ruleReferenceCallAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCallAccess_29; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleSelfExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3420:1: entryRuleSelfExpression returns [EObject current=null] : iv_ruleSelfExpression= ruleSelfExpression EOF ;
    public final EObject entryRuleSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3421:2: (iv_ruleSelfExpression= ruleSelfExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3422:2: iv_ruleSelfExpression= ruleSelfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelfExpression_in_entryRuleSelfExpression7544);
            iv_ruleSelfExpression=ruleSelfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfExpression7554); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfExpression"


    // $ANTLR start "ruleSelfExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3429:1: ruleSelfExpression returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3432:28: ( ( () otherlv_1= 'self' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3433:1: ( () otherlv_1= 'self' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3433:1: ( () otherlv_1= 'self' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3433:2: () otherlv_1= 'self'
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3433:2: ()
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3434:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelfExpressionAccess().getSelfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleSelfExpression7600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfExpressionAccess().getSelfKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelfExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3453:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3454:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3455:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7638);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7648); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3462:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3465:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3466:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3466:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3467:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3467:1: (lv_value_0_0= RULE_STRING )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3468:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleReferenceCallAccess"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3492:1: entryRuleReferenceCallAccess returns [EObject current=null] : iv_ruleReferenceCallAccess= ruleReferenceCallAccess EOF ;
    public final EObject entryRuleReferenceCallAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCallAccess = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3493:2: (iv_ruleReferenceCallAccess= ruleReferenceCallAccess EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3494:2: iv_ruleReferenceCallAccess= ruleReferenceCallAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallAccessRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceCallAccess_in_entryRuleReferenceCallAccess7729);
            iv_ruleReferenceCallAccess=ruleReferenceCallAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCallAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceCallAccess7739); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceCallAccess"


    // $ANTLR start "ruleReferenceCallAccess"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3501:1: ruleReferenceCallAccess returns [EObject current=null] : (this_Reference_0= ruleReference ( ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )? ) ;
    public final EObject ruleReferenceCallAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Reference_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3504:28: ( (this_Reference_0= ruleReference ( ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3505:1: (this_Reference_0= ruleReference ( ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3505:1: (this_Reference_0= ruleReference ( ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3506:5: this_Reference_0= ruleReference ( ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getReferenceCallAccessAccess().getReferenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleReference_in_ruleReferenceCallAccess7786);
            this_Reference_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Reference_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3514:1: ( ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) && (synpred2_InternalScelLight())) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3514:2: ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3526:5: ( () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3526:6: () otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3526:6: ()
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3527:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getReferenceCallAccessAccess().getCallFunctionAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleReferenceCallAccess7852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReferenceCallAccessAccess().getLeftParenthesisKeyword_1_0_1());
                          
                    }
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3536:1: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||LA41_0==21||LA41_0==44||(LA41_0>=48 && LA41_0<=50)||(LA41_0>=52 && LA41_0<=65)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3536:2: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3536:2: ( (lv_args_3_0= ruleExpression ) )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3537:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3537:1: (lv_args_3_0= ruleExpression )
                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3538:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReferenceCallAccessAccess().getArgsExpressionParserRuleCall_1_0_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReferenceCallAccess7874);
                            lv_args_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReferenceCallAccessRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3554:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==22) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3554:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleReferenceCallAccess7887); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getReferenceCallAccessAccess().getCommaKeyword_1_0_2_1_0());
                            	          
                            	    }
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3558:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3559:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3559:1: (lv_args_5_0= ruleExpression )
                            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3560:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getReferenceCallAccessAccess().getArgsExpressionParserRuleCall_1_0_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleReferenceCallAccess7908);
                            	    lv_args_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getReferenceCallAccessRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_5_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleReferenceCallAccess7924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccessAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReferenceCallAccess"


    // $ANTLR start "entryRuleReference"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3588:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3589:2: (iv_ruleReference= ruleReference EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3590:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference7963);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference7973); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3597:1: ruleReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3600:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3601:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3601:1: ( (otherlv_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3602:1: (otherlv_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3602:1: (otherlv_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3603:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference8017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefReferenceableElementsCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3622:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3626:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3627:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral8058);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral8068); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3637:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_intpart_0_0= RULE_INT ) ) ( ( (lv_isDouble_1_0= '.' ) ) ( (lv_decimal_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intpart_0_0=null;
        Token lv_isDouble_1_0=null;
        Token lv_decimal_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3641:28: ( ( ( (lv_intpart_0_0= RULE_INT ) ) ( ( (lv_isDouble_1_0= '.' ) ) ( (lv_decimal_2_0= RULE_INT ) ) )? ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3642:1: ( ( (lv_intpart_0_0= RULE_INT ) ) ( ( (lv_isDouble_1_0= '.' ) ) ( (lv_decimal_2_0= RULE_INT ) ) )? )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3642:1: ( ( (lv_intpart_0_0= RULE_INT ) ) ( ( (lv_isDouble_1_0= '.' ) ) ( (lv_decimal_2_0= RULE_INT ) ) )? )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3642:2: ( (lv_intpart_0_0= RULE_INT ) ) ( ( (lv_isDouble_1_0= '.' ) ) ( (lv_decimal_2_0= RULE_INT ) ) )?
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3642:2: ( (lv_intpart_0_0= RULE_INT ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3643:1: (lv_intpart_0_0= RULE_INT )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3643:1: (lv_intpart_0_0= RULE_INT )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3644:3: lv_intpart_0_0= RULE_INT
            {
            lv_intpart_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral8114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_intpart_0_0, grammarAccess.getNumberLiteralAccess().getIntpartINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumberLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"intpart",
                      		lv_intpart_0_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3660:2: ( ( (lv_isDouble_1_0= '.' ) ) ( (lv_decimal_2_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3660:3: ( (lv_isDouble_1_0= '.' ) ) ( (lv_decimal_2_0= RULE_INT ) )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3660:3: ( (lv_isDouble_1_0= '.' ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3661:1: (lv_isDouble_1_0= '.' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3661:1: (lv_isDouble_1_0= '.' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3662:3: lv_isDouble_1_0= '.'
                    {
                    lv_isDouble_1_0=(Token)match(input,51,FOLLOW_51_in_ruleNumberLiteral8138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDouble_1_0, grammarAccess.getNumberLiteralAccess().getIsDoubleFullStopKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isDouble", true, ".");
                      	    
                    }

                    }


                    }

                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3675:2: ( (lv_decimal_2_0= RULE_INT ) )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3676:1: (lv_decimal_2_0= RULE_INT )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3676:1: (lv_decimal_2_0= RULE_INT )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3677:3: lv_decimal_2_0= RULE_INT
                    {
                    lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral8168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_decimal_2_0, grammarAccess.getNumberLiteralAccess().getDecimalINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"decimal",
                              		lv_decimal_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleFactorialExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3704:1: entryRuleFactorialExpression returns [EObject current=null] : iv_ruleFactorialExpression= ruleFactorialExpression EOF ;
    public final EObject entryRuleFactorialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorialExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3705:2: (iv_ruleFactorialExpression= ruleFactorialExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3706:2: iv_ruleFactorialExpression= ruleFactorialExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorialExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFactorialExpression_in_entryRuleFactorialExpression8215);
            iv_ruleFactorialExpression=ruleFactorialExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactorialExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactorialExpression8225); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFactorialExpression"


    // $ANTLR start "ruleFactorialExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3713:1: ruleFactorialExpression returns [EObject current=null] : (otherlv_0= 'factorial' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFactorialExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3716:28: ( (otherlv_0= 'factorial' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3717:1: (otherlv_0= 'factorial' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3717:1: (otherlv_0= 'factorial' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3717:3: otherlv_0= 'factorial' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleFactorialExpression8262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFactorialExpressionAccess().getFactorialKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleFactorialExpression8274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFactorialExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3725:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3726:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3726:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3727:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFactorialExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFactorialExpression8295);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFactorialExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleFactorialExpression8307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFactorialExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFactorialExpression"


    // $ANTLR start "entryRuleLogExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3755:1: entryRuleLogExpression returns [EObject current=null] : iv_ruleLogExpression= ruleLogExpression EOF ;
    public final EObject entryRuleLogExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3756:2: (iv_ruleLogExpression= ruleLogExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3757:2: iv_ruleLogExpression= ruleLogExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogExpression_in_entryRuleLogExpression8343);
            iv_ruleLogExpression=ruleLogExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogExpression8353); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogExpression"


    // $ANTLR start "ruleLogExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3764:1: ruleLogExpression returns [EObject current=null] : (otherlv_0= 'ln' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleLogExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3767:28: ( (otherlv_0= 'ln' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3768:1: (otherlv_0= 'ln' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3768:1: (otherlv_0= 'ln' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3768:3: otherlv_0= 'ln' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleLogExpression8390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLogExpressionAccess().getLnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleLogExpression8402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLogExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3776:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3777:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3777:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3778:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLogExpression8423);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleLogExpression8435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLogExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3806:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3807:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3808:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression8471);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression8481); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3815:1: ruleModExpression returns [EObject current=null] : (otherlv_0= 'mod' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_mod_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_mod_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3818:28: ( (otherlv_0= 'mod' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_mod_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3819:1: (otherlv_0= 'mod' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_mod_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3819:1: (otherlv_0= 'mod' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_mod_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3819:3: otherlv_0= 'mod' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_mod_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleModExpression8518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModExpressionAccess().getModKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleModExpression8530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3827:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3828:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3828:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3829:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleModExpression8551);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleModExpression8563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModExpressionAccess().getCommaKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3849:1: ( (lv_mod_4_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3850:1: (lv_mod_4_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3850:1: (lv_mod_4_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3851:3: lv_mod_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModExpressionAccess().getModExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleModExpression8584);
            lv_mod_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"mod",
                      		lv_mod_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleModExpression8596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getModExpressionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRulePowExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3879:1: entryRulePowExpression returns [EObject current=null] : iv_rulePowExpression= rulePowExpression EOF ;
    public final EObject entryRulePowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3880:2: (iv_rulePowExpression= rulePowExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3881:2: iv_rulePowExpression= rulePowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePowExpression_in_entryRulePowExpression8632);
            iv_rulePowExpression=rulePowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowExpression8642); if (state.failed) return current;

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
    // $ANTLR end "entryRulePowExpression"


    // $ANTLR start "rulePowExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3888:1: rulePowExpression returns [EObject current=null] : (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject rulePowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_base_2_0 = null;

        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3891:28: ( (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3892:1: (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3892:1: (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3892:3: otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_rulePowExpression8679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPowExpressionAccess().getPowKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulePowExpression8691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPowExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3900:1: ( (lv_base_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3901:1: (lv_base_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3901:1: (lv_base_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3902:3: lv_base_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPowExpressionAccess().getBaseExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePowExpression8712);
            lv_base_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"base",
                      		lv_base_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_rulePowExpression8724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPowExpressionAccess().getCommaKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3922:1: ( (lv_exp_4_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3923:1: (lv_exp_4_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3923:1: (lv_exp_4_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3924:3: lv_exp_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPowExpressionAccess().getExpExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePowExpression8745);
            lv_exp_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulePowExpression8757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPowExpressionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePowExpression"


    // $ANTLR start "entryRuleFloorExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3952:1: entryRuleFloorExpression returns [EObject current=null] : iv_ruleFloorExpression= ruleFloorExpression EOF ;
    public final EObject entryRuleFloorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloorExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3953:2: (iv_ruleFloorExpression= ruleFloorExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3954:2: iv_ruleFloorExpression= ruleFloorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFloorExpression_in_entryRuleFloorExpression8793);
            iv_ruleFloorExpression=ruleFloorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloorExpression8803); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloorExpression"


    // $ANTLR start "ruleFloorExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3961:1: ruleFloorExpression returns [EObject current=null] : (otherlv_0= 'floor' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFloorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3964:28: ( (otherlv_0= 'floor' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3965:1: (otherlv_0= 'floor' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3965:1: (otherlv_0= 'floor' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3965:3: otherlv_0= 'floor' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleFloorExpression8840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFloorExpressionAccess().getFloorKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleFloorExpression8852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloorExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3973:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3974:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3974:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3975:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFloorExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFloorExpression8873);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFloorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleFloorExpression8885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFloorExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFloorExpression"


    // $ANTLR start "entryRuleCeilExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4003:1: entryRuleCeilExpression returns [EObject current=null] : iv_ruleCeilExpression= ruleCeilExpression EOF ;
    public final EObject entryRuleCeilExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCeilExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4004:2: (iv_ruleCeilExpression= ruleCeilExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4005:2: iv_ruleCeilExpression= ruleCeilExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCeilExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCeilExpression_in_entryRuleCeilExpression8921);
            iv_ruleCeilExpression=ruleCeilExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCeilExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCeilExpression8931); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCeilExpression"


    // $ANTLR start "ruleCeilExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4012:1: ruleCeilExpression returns [EObject current=null] : (otherlv_0= 'ceil' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCeilExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4015:28: ( (otherlv_0= 'ceil' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4016:1: (otherlv_0= 'ceil' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4016:1: (otherlv_0= 'ceil' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4016:3: otherlv_0= 'ceil' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleCeilExpression8968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCeilExpressionAccess().getCeilKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCeilExpression8980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCeilExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4024:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4025:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4025:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4026:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCeilExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCeilExpression9001);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCeilExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleCeilExpression9013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCeilExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCeilExpression"


    // $ANTLR start "entryRuleMinExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4054:1: entryRuleMinExpression returns [EObject current=null] : iv_ruleMinExpression= ruleMinExpression EOF ;
    public final EObject entryRuleMinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4055:2: (iv_ruleMinExpression= ruleMinExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4056:2: iv_ruleMinExpression= ruleMinExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMinExpression_in_entryRuleMinExpression9049);
            iv_ruleMinExpression=ruleMinExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinExpression9059); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMinExpression"


    // $ANTLR start "ruleMinExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4063:1: ruleMinExpression returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMinExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4066:28: ( (otherlv_0= 'min' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4067:1: (otherlv_0= 'min' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4067:1: (otherlv_0= 'min' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4067:3: otherlv_0= 'min' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleMinExpression9096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMinExpressionAccess().getMinKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMinExpression9108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4075:1: ( (lv_left_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4076:1: (lv_left_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4076:1: (lv_left_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4077:3: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinExpressionAccess().getLeftExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleMinExpression9129);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMinExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMinExpression9141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMinExpressionAccess().getCommaKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4097:1: ( (lv_right_4_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4098:1: (lv_right_4_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4098:1: (lv_right_4_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4099:3: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinExpressionAccess().getRightExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleMinExpression9162);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMinExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleMinExpression9174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMinExpressionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMinExpression"


    // $ANTLR start "entryRuleMaxExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4127:1: entryRuleMaxExpression returns [EObject current=null] : iv_ruleMaxExpression= ruleMaxExpression EOF ;
    public final EObject entryRuleMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4128:2: (iv_ruleMaxExpression= ruleMaxExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4129:2: iv_ruleMaxExpression= ruleMaxExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMaxExpression_in_entryRuleMaxExpression9210);
            iv_ruleMaxExpression=ruleMaxExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxExpression9220); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMaxExpression"


    // $ANTLR start "ruleMaxExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4136:1: ruleMaxExpression returns [EObject current=null] : (otherlv_0= 'man' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMaxExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4139:28: ( (otherlv_0= 'man' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4140:1: (otherlv_0= 'man' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4140:1: (otherlv_0= 'man' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4140:3: otherlv_0= 'man' otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleMaxExpression9257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaxExpressionAccess().getManKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMaxExpression9269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4148:1: ( (lv_left_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4149:1: (lv_left_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4149:1: (lv_left_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4150:3: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaxExpressionAccess().getLeftExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleMaxExpression9290);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMaxExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMaxExpression9302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMaxExpressionAccess().getCommaKeyword_3());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4170:1: ( (lv_right_4_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4171:1: (lv_right_4_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4171:1: (lv_right_4_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4172:3: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaxExpressionAccess().getRightExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleMaxExpression9323);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMaxExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleMaxExpression9335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMaxExpressionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMaxExpression"


    // $ANTLR start "entryRuleSinExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4200:1: entryRuleSinExpression returns [EObject current=null] : iv_ruleSinExpression= ruleSinExpression EOF ;
    public final EObject entryRuleSinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4201:2: (iv_ruleSinExpression= ruleSinExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4202:2: iv_ruleSinExpression= ruleSinExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSinExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSinExpression_in_entryRuleSinExpression9371);
            iv_ruleSinExpression=ruleSinExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSinExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSinExpression9381); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSinExpression"


    // $ANTLR start "ruleSinExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4209:1: ruleSinExpression returns [EObject current=null] : (otherlv_0= 'sin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleSinExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4212:28: ( (otherlv_0= 'sin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4213:1: (otherlv_0= 'sin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4213:1: (otherlv_0= 'sin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4213:3: otherlv_0= 'sin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleSinExpression9418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSinExpressionAccess().getSinKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSinExpression9430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSinExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4221:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4222:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4222:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4223:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSinExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSinExpression9451);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSinExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSinExpression9463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSinExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSinExpression"


    // $ANTLR start "entryRuleCosExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4251:1: entryRuleCosExpression returns [EObject current=null] : iv_ruleCosExpression= ruleCosExpression EOF ;
    public final EObject entryRuleCosExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCosExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4252:2: (iv_ruleCosExpression= ruleCosExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4253:2: iv_ruleCosExpression= ruleCosExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCosExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCosExpression_in_entryRuleCosExpression9499);
            iv_ruleCosExpression=ruleCosExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCosExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCosExpression9509); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCosExpression"


    // $ANTLR start "ruleCosExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4260:1: ruleCosExpression returns [EObject current=null] : (otherlv_0= 'cos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCosExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4263:28: ( (otherlv_0= 'cos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4264:1: (otherlv_0= 'cos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4264:1: (otherlv_0= 'cos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4264:3: otherlv_0= 'cos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleCosExpression9546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCosExpressionAccess().getCosKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCosExpression9558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCosExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4272:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4273:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4273:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4274:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCosExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCosExpression9579);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCosExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleCosExpression9591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCosExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCosExpression"


    // $ANTLR start "entryRuleTanExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4302:1: entryRuleTanExpression returns [EObject current=null] : iv_ruleTanExpression= ruleTanExpression EOF ;
    public final EObject entryRuleTanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTanExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4303:2: (iv_ruleTanExpression= ruleTanExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4304:2: iv_ruleTanExpression= ruleTanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTanExpression_in_entryRuleTanExpression9627);
            iv_ruleTanExpression=ruleTanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTanExpression9637); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTanExpression"


    // $ANTLR start "ruleTanExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4311:1: ruleTanExpression returns [EObject current=null] : (otherlv_0= 'tan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4314:28: ( (otherlv_0= 'tan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4315:1: (otherlv_0= 'tan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4315:1: (otherlv_0= 'tan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4315:3: otherlv_0= 'tan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleTanExpression9674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTanExpressionAccess().getTanKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTanExpression9686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTanExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4323:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4324:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4324:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4325:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTanExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTanExpression9707);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTanExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTanExpression9719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTanExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTanExpression"


    // $ANTLR start "entryRuleATanExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4353:1: entryRuleATanExpression returns [EObject current=null] : iv_ruleATanExpression= ruleATanExpression EOF ;
    public final EObject entryRuleATanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATanExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4354:2: (iv_ruleATanExpression= ruleATanExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4355:2: iv_ruleATanExpression= ruleATanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getATanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleATanExpression_in_entryRuleATanExpression9755);
            iv_ruleATanExpression=ruleATanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleATanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleATanExpression9765); if (state.failed) return current;

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
    // $ANTLR end "entryRuleATanExpression"


    // $ANTLR start "ruleATanExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4362:1: ruleATanExpression returns [EObject current=null] : (otherlv_0= 'atan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleATanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4365:28: ( (otherlv_0= 'atan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4366:1: (otherlv_0= 'atan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4366:1: (otherlv_0= 'atan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4366:3: otherlv_0= 'atan' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleATanExpression9802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getATanExpressionAccess().getAtanKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleATanExpression9814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getATanExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4374:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4375:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4375:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4376:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getATanExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleATanExpression9835);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getATanExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleATanExpression9847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getATanExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleATanExpression"


    // $ANTLR start "entryRuleASinExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4404:1: entryRuleASinExpression returns [EObject current=null] : iv_ruleASinExpression= ruleASinExpression EOF ;
    public final EObject entryRuleASinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASinExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4405:2: (iv_ruleASinExpression= ruleASinExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4406:2: iv_ruleASinExpression= ruleASinExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASinExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleASinExpression_in_entryRuleASinExpression9883);
            iv_ruleASinExpression=ruleASinExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASinExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleASinExpression9893); if (state.failed) return current;

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
    // $ANTLR end "entryRuleASinExpression"


    // $ANTLR start "ruleASinExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4413:1: ruleASinExpression returns [EObject current=null] : (otherlv_0= 'asin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleASinExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4416:28: ( (otherlv_0= 'asin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4417:1: (otherlv_0= 'asin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4417:1: (otherlv_0= 'asin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4417:3: otherlv_0= 'asin' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleASinExpression9930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getASinExpressionAccess().getAsinKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleASinExpression9942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getASinExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4425:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4426:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4426:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4427:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getASinExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleASinExpression9963);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getASinExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleASinExpression9975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getASinExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleASinExpression"


    // $ANTLR start "entryRuleACosExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4455:1: entryRuleACosExpression returns [EObject current=null] : iv_ruleACosExpression= ruleACosExpression EOF ;
    public final EObject entryRuleACosExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACosExpression = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4456:2: (iv_ruleACosExpression= ruleACosExpression EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4457:2: iv_ruleACosExpression= ruleACosExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getACosExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleACosExpression_in_entryRuleACosExpression10011);
            iv_ruleACosExpression=ruleACosExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleACosExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleACosExpression10021); if (state.failed) return current;

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
    // $ANTLR end "entryRuleACosExpression"


    // $ANTLR start "ruleACosExpression"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4464:1: ruleACosExpression returns [EObject current=null] : (otherlv_0= 'acos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleACosExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4467:28: ( (otherlv_0= 'acos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4468:1: (otherlv_0= 'acos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4468:1: (otherlv_0= 'acos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4468:3: otherlv_0= 'acos' otherlv_1= '(' ( (lv_arg_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleACosExpression10058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getACosExpressionAccess().getAcosKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleACosExpression10070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getACosExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4476:1: ( (lv_arg_2_0= ruleExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4477:1: (lv_arg_2_0= ruleExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4477:1: (lv_arg_2_0= ruleExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4478:3: lv_arg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getACosExpressionAccess().getArgExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleACosExpression10091);
            lv_arg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getACosExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleACosExpression10103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getACosExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleACosExpression"


    // $ANTLR start "entryRuleSystemDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4506:1: entryRuleSystemDeclaration returns [EObject current=null] : iv_ruleSystemDeclaration= ruleSystemDeclaration EOF ;
    public final EObject entryRuleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDeclaration = null;


        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4507:2: (iv_ruleSystemDeclaration= ruleSystemDeclaration EOF )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4508:2: iv_ruleSystemDeclaration= ruleSystemDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration10139);
            iv_ruleSystemDeclaration=ruleSystemDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemDeclaration10149); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSystemDeclaration"


    // $ANTLR start "ruleSystemDeclaration"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4515:1: ruleSystemDeclaration returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleComponentExpression ) ) (otherlv_4= '||' ( (lv_elements_5_0= ruleComponentExpression ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4518:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleComponentExpression ) ) (otherlv_4= '||' ( (lv_elements_5_0= ruleComponentExpression ) ) )* otherlv_6= ';' ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4519:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleComponentExpression ) ) (otherlv_4= '||' ( (lv_elements_5_0= ruleComponentExpression ) ) )* otherlv_6= ';' )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4519:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleComponentExpression ) ) (otherlv_4= '||' ( (lv_elements_5_0= ruleComponentExpression ) ) )* otherlv_6= ';' )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4519:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleComponentExpression ) ) (otherlv_4= '||' ( (lv_elements_5_0= ruleComponentExpression ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleSystemDeclaration10186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4523:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4524:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4524:1: (lv_name_1_0= RULE_ID )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4525:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemDeclaration10203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSystemDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSystemDeclaration10220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSystemDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4545:1: ( (lv_elements_3_0= ruleComponentExpression ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4546:1: (lv_elements_3_0= ruleComponentExpression )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4546:1: (lv_elements_3_0= ruleComponentExpression )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4547:3: lv_elements_3_0= ruleComponentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemDeclarationAccess().getElementsComponentExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComponentExpression_in_ruleSystemDeclaration10241);
            lv_elements_3_0=ruleComponentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"elements",
                      		lv_elements_3_0, 
                      		"ComponentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4563:2: (otherlv_4= '||' ( (lv_elements_5_0= ruleComponentExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==67) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4563:4: otherlv_4= '||' ( (lv_elements_5_0= ruleComponentExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleSystemDeclaration10254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSystemDeclarationAccess().getVerticalLineVerticalLineKeyword_4_0());
            	          
            	    }
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4567:1: ( (lv_elements_5_0= ruleComponentExpression ) )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4568:1: (lv_elements_5_0= ruleComponentExpression )
            	    {
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4568:1: (lv_elements_5_0= ruleComponentExpression )
            	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4569:3: lv_elements_5_0= ruleComponentExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemDeclarationAccess().getElementsComponentExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComponentExpression_in_ruleSystemDeclaration10275);
            	    lv_elements_5_0=ruleComponentExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_5_0, 
            	              		"ComponentExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleSystemDeclaration10289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSystemDeclarationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSystemDeclaration"


    // $ANTLR start "ruleType"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4597:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'string' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4599:28: ( ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'string' ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4600:1: ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'string' ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4600:1: ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'string' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt45=1;
                }
                break;
            case 69:
                {
                alt45=2;
                }
                break;
            case 70:
                {
                alt45=3;
                }
                break;
            case 71:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4600:2: (enumLiteral_0= 'bool' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4600:2: (enumLiteral_0= 'bool' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4600:4: enumLiteral_0= 'bool'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleType10339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getSBOOLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getSBOOLEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4606:6: (enumLiteral_1= 'int' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4606:6: (enumLiteral_1= 'int' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4606:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleType10356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getSINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSINTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4612:6: (enumLiteral_2= 'double' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4612:6: (enumLiteral_2= 'double' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4612:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_70_in_ruleType10373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getSDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getSDOUBLEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4618:6: (enumLiteral_3= 'string' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4618:6: (enumLiteral_3= 'string' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4618:8: enumLiteral_3= 'string'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_71_in_ruleType10390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getSSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSSTRINGEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleRelationSymbol"
    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4628:1: ruleRelationSymbol returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) ) ;
    public final Enumerator ruleRelationSymbol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4630:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) ) )
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4631:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) )
            {
            // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4631:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) )
            int alt46=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt46=1;
                }
                break;
            case 72:
                {
                alt46=2;
                }
                break;
            case 28:
                {
                alt46=3;
                }
                break;
            case 73:
                {
                alt46=4;
                }
                break;
            case 74:
                {
                alt46=5;
                }
                break;
            case 29:
                {
                alt46=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4631:2: (enumLiteral_0= '=' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4631:2: (enumLiteral_0= '=' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4631:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_15_in_ruleRelationSymbol10435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationSymbolAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationSymbolAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4637:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4637:6: (enumLiteral_1= '!=' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4637:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleRelationSymbol10452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationSymbolAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationSymbolAccess().getNEQEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4643:6: (enumLiteral_2= '<' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4643:6: (enumLiteral_2= '<' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4643:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleRelationSymbol10469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationSymbolAccess().getLESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationSymbolAccess().getLESEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4649:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4649:6: (enumLiteral_3= '<=' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4649:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_73_in_ruleRelationSymbol10486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationSymbolAccess().getLEQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationSymbolAccess().getLEQEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4655:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4655:6: (enumLiteral_4= '>=' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4655:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_74_in_ruleRelationSymbol10503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationSymbolAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationSymbolAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4661:6: (enumLiteral_5= '>' )
                    {
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4661:6: (enumLiteral_5= '>' )
                    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:4661:8: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_29_in_ruleRelationSymbol10520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationSymbolAccess().getGTREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getRelationSymbolAccess().getGTREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationSymbol"

    // $ANTLR start synpred1_InternalScelLight
    public final void synpred1_InternalScelLight_fragment() throws RecognitionException {   
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2609:4: ( 'else' )
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:2609:6: 'else'
        {
        match(input,42,FOLLOW_42_in_synpred1_InternalScelLight5602); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalScelLight

    // $ANTLR start synpred2_InternalScelLight
    public final void synpred2_InternalScelLight_fragment() throws RecognitionException {   
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3514:2: ( ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3514:3: ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' )
        {
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3514:3: ( () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' )
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3514:4: () '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')'
        {
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3514:4: ()
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3515:1: 
        {
        }

        match(input,21,FOLLOW_21_in_synpred2_InternalScelLight7801); if (state.failed) return ;
        // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3516:1: ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )?
        int alt48=2;
        int LA48_0 = input.LA(1);

        if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==21||LA48_0==44||(LA48_0>=48 && LA48_0<=50)||(LA48_0>=52 && LA48_0<=65)) ) {
            alt48=1;
        }
        switch (alt48) {
            case 1 :
                // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3516:2: ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )*
                {
                // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3516:2: ( ( ruleExpression ) )
                // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3517:1: ( ruleExpression )
                {
                // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3517:1: ( ruleExpression )
                // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3518:1: ruleExpression
                {
                pushFollow(FOLLOW_ruleExpression_in_synpred2_InternalScelLight7809);
                ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3520:2: ( ',' ( ( ruleExpression ) ) )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==22) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3520:4: ',' ( ( ruleExpression ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred2_InternalScelLight7816); if (state.failed) return ;
                	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3521:1: ( ( ruleExpression ) )
                	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3522:1: ( ruleExpression )
                	    {
                	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3522:1: ( ruleExpression )
                	    // ../org.cmg.resp.xtext.scellight/src-gen/org/cmg/resp/xtext/scellight/parser/antlr/internal/InternalScelLight.g:3523:1: ruleExpression
                	    {
                	    pushFollow(FOLLOW_ruleExpression_in_synpred2_InternalScelLight7823);
                	    ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop47;
                    }
                } while (true);


                }
                break;

        }

        match(input,23,FOLLOW_23_in_synpred2_InternalScelLight7833); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalScelLight

    // Delegated rules

    public final boolean synpred2_InternalScelLight() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalScelLight_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalScelLight() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalScelLight_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000000180184802L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleProjectionDeclaration_in_ruleModel158 = new BitSet(new long[]{0x0000000180184802L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleModel185 = new BitSet(new long[]{0x0000000180184802L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_ruleModel212 = new BitSet(new long[]{0x0000000180184802L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleProcessDeclaration_in_ruleModel239 = new BitSet(new long[]{0x0000000180184802L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleComponentDeclaration_in_ruleModel266 = new BitSet(new long[]{0x0000000180184802L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_ruleModel293 = new BitSet(new long[]{0x0000000180184802L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAttributeDeclaration377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDeclaration394 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttributeDeclaration411 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttributeDeclaration432 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttributeDeclaration444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionDeclaration_in_entryRuleProjectionDeclaration480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectionDeclaration490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProjectionDeclaration527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjectionDeclaration544 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProjectionDeclaration561 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectionExpression_in_ruleProjectionDeclaration582 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProjectionDeclaration594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpression_in_entryRuleProjectionExpression630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectionExpression640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProjectionExpression678 = new BitSet(new long[]{0xFFF710C000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleProjectionExpression699 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProjectionExpression711 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProjectionExpression723 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProjectionExpression744 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProjectionExpression756 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProjectionExpression779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDeclaration825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleConstantDeclaration862 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstantDeclaration883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDeclaration900 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstantDeclaration917 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstantDeclaration938 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstantDeclaration950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDeclaration_in_entryRuleComponentDeclaration986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDeclaration996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleComponentDeclaration1033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDeclaration1050 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleComponentDeclaration1067 = new BitSet(new long[]{0x0000000000800000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleComponentDeclaration1089 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleComponentDeclaration1102 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleComponentDeclaration1123 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleComponentDeclaration1139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponentDeclaration1151 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleComponentExpression_in_ruleComponentDeclaration1172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponentDeclaration1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentExpression_in_entryRuleComponentExpression1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentExpression1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentConstant_in_ruleComponentExpression1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentReference_in_ruleComponentExpression1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentReference_in_entryRuleComponentReference1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentReference1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentReference1394 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleComponentReference1406 = new BitSet(new long[]{0xFFF7100000A10070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleComponentReference1428 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleComponentReference1441 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleComponentReference1462 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleComponentReference1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentConstant_in_entryRuleComponentConstant1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentConstant1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComponentConstant1561 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleComponentConstant1582 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleComponentConstant1594 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponentConstant1606 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_ruleKnowledge_in_ruleComponentConstant1628 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleComponentConstant1640 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleComponentConstant1664 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleComponentConstant1677 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleComponentConstant1698 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleComponentConstant1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessExpression1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessExpression1814 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProcessExpression1826 = new BitSet(new long[]{0xFFF7100000A10070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProcessExpression1848 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleProcessExpression1861 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProcessExpression1882 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleProcessExpression1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleProcessExpression1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnowledge_in_entryRuleKnowledge1964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnowledge1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKnowledge2011 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleKnowledge2032 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleKnowledge2044 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleKnowledge2057 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleKnowledge2069 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleKnowledge2090 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleKnowledge2102 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdAttributeDefinition_in_ruleInterface2198 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttributeInstantiation_in_ruleInterface2217 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInterface2233 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleIdAttributeDefinition_in_ruleInterface2256 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttributeInstantiation_in_ruleInterface2275 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleIdAttributeDefinition_in_entryRuleIdAttributeDefinition2316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdAttributeDefinition2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleIdAttributeDefinition2363 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIdAttributeDefinition2375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdAttributeDefinition2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeInstantiation_in_entryRuleAttributeInstantiation2433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeInstantiation2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeInstantiation2488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttributeInstantiation2500 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAttributeInstantiation2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunctionDeclaration2604 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionDeclaration2625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration2642 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionDeclaration2659 = new BitSet(new long[]{0x0000000000800000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleFunctionDeclaration2681 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionDeclaration2694 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleFunctionDeclaration2715 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionDeclaration2731 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration2743 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionDeclaration2764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDeclaration2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessDeclaration_in_entryRuleProcessDeclaration2812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessDeclaration2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleProcessDeclaration2859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessDeclaration2876 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProcessDeclaration2893 = new BitSet(new long[]{0x0000000000800000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleProcessDeclaration2915 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleProcessDeclaration2928 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleProcessDeclaration2949 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleProcessDeclaration2965 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleProcessDeclaration2977 = new BitSet(new long[]{0x000003361B000010L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleProcessDeclaration2998 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProcessDeclaration3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable3102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleCommand3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleCommand3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleCommand3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleCommand3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleCommand3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCommand3345 = new BitSet(new long[]{0x000003361B000010L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCommand3367 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableDeclaration3471 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDeclaration3484 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration3505 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVariableDeclaration3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutAction_in_ruleAction3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetAction_in_ruleAction3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_ruleAction3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceAction_in_ruleAction3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceAction_in_entryRuleReplaceAction3728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceAction3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleReplaceAction3775 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleReplaceAction3787 = new BitSet(new long[]{0xFFF710C000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleReplaceAction3808 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReplaceAction3820 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleReplaceAction3841 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReplaceAction3853 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleReplaceAction3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetAction_in_entryRuleGetAction3901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetAction3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGetAction3948 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGetAction3960 = new BitSet(new long[]{0xFFF710C000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleGetAction3981 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGetAction3993 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGetAction4005 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleGetAction4026 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGetAction4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_entryRuleQueryAction4074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryAction4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleQueryAction4121 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQueryAction4133 = new BitSet(new long[]{0xFFF710C000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleQueryAction4154 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQueryAction4166 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleQueryAction4178 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleQueryAction4199 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQueryAction4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutAction_in_entryRulePutAction4247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePutAction4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePutAction4294 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePutAction4306 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTuple_in_rulePutAction4327 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePutAction4339 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePutAction4351 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePutAction4372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePutAction4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple4422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTuple4478 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTuple4491 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTuple4512 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate4550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateField_in_ruleTemplate4606 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTemplate4619 = new BitSet(new long[]{0xFFF710C000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleTemplateField_in_ruleTemplate4640 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTemplateField_in_entryRuleTemplateField4678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateField4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyFormalField_in_ruleTemplateField4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalField_in_ruleTemplateField4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualField_in_ruleTemplateField4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedFormalField_in_ruleTemplateField4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyFormalField_in_entryRuleAnyFormalField4851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyFormalField4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAnyFormalField4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedFormalField_in_entryRuleTypedFormalField4943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedFormalField4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTypedFormalField4990 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypedFormalField5011 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTypedFormalField5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalField_in_entryRuleFormalField5059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalField5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFormalField5106 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalField5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFormalField5166 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleFormalField5187 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFormalField5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualField_in_entryRuleActualField5237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualField5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleActualField5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile5327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleWhile5374 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWhile5386 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile5407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhile5419 = new BitSet(new long[]{0x0000033619000010L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleWhile5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse5476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleIfThenElse5523 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleIfThenElse5535 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElse5556 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIfThenElse5568 = new BitSet(new long[]{0x0000033619000010L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleIfThenElse5589 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleIfThenElse5610 = new BitSet(new long[]{0x0000033619000010L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleIfThenElse5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock5670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleBlock5735 = new BitSet(new long[]{0x0000033619000012L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleExpression5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction5862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction5919 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleDisjunction5940 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleDisjunction5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction5999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleConjunction6056 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleConjunction6077 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConjunction6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation6136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNegation6184 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleNegation6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleNegation6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation6278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummationSubtraction_in_ruleRelation6335 = new BitSet(new long[]{0x0000000030008002L,0x0000000000000700L});
    public static final BitSet FOLLOW_ruleRelationSymbol_in_ruleRelation6365 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleRelation6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummationSubtraction_in_entryRuleSummationSubtraction6424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummationSubtraction6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationDivision_in_ruleSummationSubtraction6481 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleSummationSubtraction6510 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_46_in_ruleSummationSubtraction6539 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSummationSubtraction_in_ruleSummationSubtraction6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationDivision_in_entryRuleMultiplicationDivision6614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationDivision6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_ruleMultiplicationDivision6671 = new BitSet(new long[]{0x0000804000000002L});
    public static final BitSet FOLLOW_38_in_ruleMultiplicationDivision6700 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_47_in_ruleMultiplicationDivision6729 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMultiplicationDivision_in_ruleMultiplicationDivision6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression6804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseExpression6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBaseExpression6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBaseExpression6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBaseExpression6910 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBaseExpression6932 = new BitSet(new long[]{0x0000008000800000L});
    public static final BitSet FOLLOW_39_in_ruleBaseExpression6953 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBaseExpression6974 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBaseExpression6986 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBaseExpression7007 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBaseExpression7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleBaseExpression7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleBaseExpression7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinExpression_in_ruleBaseExpression7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxExpression_in_ruleBaseExpression7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloorExpression_in_ruleBaseExpression7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCeilExpression_in_ruleBaseExpression7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_ruleBaseExpression7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleBaseExpression7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogExpression_in_ruleBaseExpression7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorialExpression_in_ruleBaseExpression7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSinExpression_in_ruleBaseExpression7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCosExpression_in_ruleBaseExpression7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTanExpression_in_ruleBaseExpression7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASinExpression_in_ruleBaseExpression7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACosExpression_in_ruleBaseExpression7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATanExpression_in_ruleBaseExpression7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfExpression_in_ruleBaseExpression7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceCallAccess_in_ruleBaseExpression7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfExpression_in_entryRuleSelfExpression7544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpression7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSelfExpression7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceCallAccess_in_entryRuleReferenceCallAccess7729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceCallAccess7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleReferenceCallAccess7786 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleReferenceCallAccess7852 = new BitSet(new long[]{0xFFF7100000A10070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReferenceCallAccess7874 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleReferenceCallAccess7887 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReferenceCallAccess7908 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleReferenceCallAccess7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral8058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral8114 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumberLiteral8138 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorialExpression_in_entryRuleFactorialExpression8215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactorialExpression8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleFactorialExpression8262 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFactorialExpression8274 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFactorialExpression8295 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFactorialExpression8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogExpression_in_entryRuleLogExpression8343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogExpression8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLogExpression8390 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLogExpression8402 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogExpression8423 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLogExpression8435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression8471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleModExpression8518 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleModExpression8530 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModExpression8551 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModExpression8563 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModExpression8584 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleModExpression8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_entryRulePowExpression8632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowExpression8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePowExpression8679 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePowExpression8691 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePowExpression8712 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePowExpression8724 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePowExpression8745 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePowExpression8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloorExpression_in_entryRuleFloorExpression8793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloorExpression8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFloorExpression8840 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFloorExpression8852 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFloorExpression8873 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFloorExpression8885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCeilExpression_in_entryRuleCeilExpression8921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCeilExpression8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCeilExpression8968 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCeilExpression8980 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCeilExpression9001 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCeilExpression9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinExpression_in_entryRuleMinExpression9049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinExpression9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMinExpression9096 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMinExpression9108 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMinExpression9129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMinExpression9141 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMinExpression9162 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMinExpression9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxExpression_in_entryRuleMaxExpression9210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxExpression9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMaxExpression9257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMaxExpression9269 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMaxExpression9290 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMaxExpression9302 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMaxExpression9323 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMaxExpression9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSinExpression_in_entryRuleSinExpression9371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSinExpression9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSinExpression9418 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSinExpression9430 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSinExpression9451 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSinExpression9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCosExpression_in_entryRuleCosExpression9499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCosExpression9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCosExpression9546 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCosExpression9558 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCosExpression9579 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCosExpression9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTanExpression_in_entryRuleTanExpression9627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTanExpression9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTanExpression9674 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTanExpression9686 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTanExpression9707 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTanExpression9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATanExpression_in_entryRuleATanExpression9755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATanExpression9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleATanExpression9802 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleATanExpression9814 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleATanExpression9835 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleATanExpression9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASinExpression_in_entryRuleASinExpression9883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASinExpression9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleASinExpression9930 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleASinExpression9942 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleASinExpression9963 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleASinExpression9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACosExpression_in_entryRuleACosExpression10011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACosExpression10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleACosExpression10058 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleACosExpression10070 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleACosExpression10091 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleACosExpression10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration10139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemDeclaration10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSystemDeclaration10186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemDeclaration10203 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSystemDeclaration10220 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleComponentExpression_in_ruleSystemDeclaration10241 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSystemDeclaration10254 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleComponentExpression_in_ruleSystemDeclaration10275 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_13_in_ruleSystemDeclaration10289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleType10339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleType10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleType10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleType10390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRelationSymbol10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleRelationSymbol10452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRelationSymbol10469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleRelationSymbol10486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleRelationSymbol10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRelationSymbol10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred1_InternalScelLight5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred2_InternalScelLight7801 = new BitSet(new long[]{0xFFF7100000A10070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred2_InternalScelLight7809 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_synpred2_InternalScelLight7816 = new BitSet(new long[]{0xFFF7100000210070L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred2_InternalScelLight7823 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_synpred2_InternalScelLight7833 = new BitSet(new long[]{0x0000000000000002L});

}