// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism\treelan.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class treelanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, BREAK=3, CASE=4, CATCH=5, CHAR=6, CONTINUE=7, CONFORMIFEQUAL=8, 
		DERIVEALWAYS=9, DERIVEIFNOTEQUAL=10, TERMINATEIFNOTEQUAL=11, TERMINATE=12, 
		OVERRIDE=13, EVALUATE=14, EXPLODE=15, DEFAULT=16, DO=17, DOUBLE=18, DROP=19, 
		ELSE=20, FLOAT=21, FOR=22, IF=23, INT=24, JOIN=25, LIST=26, LONG=27, MERGE=28, 
		NEW=29, NODE=30, RECOGNIZE=31, RETURN=32, SHORT=33, SWITCH=34, STRING=35, 
		PATH=36, WHILE=37, TREE=38, THROW=39, TRY=40, VOID=41, UNION=42, SELECT=43, 
		SET=44, GROUP=45, AGGREGATE=46, RENAME=47, REORDER=48, DECIMAL_LITERAL=49, 
		FLOAT_LITERAL=50, BOOL_LITERAL=51, CHAR_LITERAL=52, STRING_LITERAL=53, 
		NULL_LITERAL=54, LPAREN=55, RPAREN=56, LBRACE=57, RBRACE=58, LBRACK=59, 
		RBRACK=60, SEMI=61, COMMA=62, DOT=63, ASSIGN=64, GT=65, LT=66, BANG=67, 
		TILDE=68, QUESTION=69, COLON=70, EQUAL=71, LE=72, GE=73, NOTEQUAL=74, 
		AND=75, OR=76, INC=77, DEC=78, ADD=79, SUB=80, MUL=81, DIV=82, BITAND=83, 
		BITOR=84, CARET=85, MOD=86, ADD_ASSIGN=87, SUB_ASSIGN=88, MUL_ASSIGN=89, 
		DIV_ASSIGN=90, AND_ASSIGN=91, OR_ASSIGN=92, XOR_ASSIGN=93, MOD_ASSIGN=94, 
		LSHIFT_ASSIGN=95, RSHIFT_ASSIGN=96, URSHIFT_ASSIGN=97, WS=98, COMMENT=99, 
		LINE_COMMENT=100, IDENTIFIER=101;
	public static final int
		RULE_stats = 0, RULE_varDecl = 1, RULE_formalParameters = 2, RULE_formalParameter = 3, 
		RULE_block = 4, RULE_stat = 5, RULE_parExpr = 6, RULE_expr = 7, RULE_builtinfunction = 8, 
		RULE_conflictspec = 9, RULE_primary = 10, RULE_exprList = 11, RULE_typeType = 12, 
		RULE_literal = 13, RULE_primitiveType = 14, RULE_complexType = 15;
	public static final String[] ruleNames = {
		"stats", "varDecl", "formalParameters", "formalParameter", "block", "stat", 
		"parExpr", "expr", "builtinfunction", "conflictspec", "primary", "exprList", 
		"typeType", "literal", "primitiveType", "complexType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'byte'", "'break'", "'case'", "'catch'", "'char'", 
		"'continue'", "'conformifequal'", "'derivealways'", "'deriveifequal'", 
		"'terminateifnotequal'", "'terminate'", "'override'", "'evaluate'", "'explode'", 
		"'default'", "'do'", "'double'", "'drop'", "'else'", "'float'", "'for'", 
		"'if'", "'int'", "'join'", "'list'", "'long'", "'merge'", "'new'", "'node'", 
		"'recognize'", "'return'", "'short'", "'switch'", "'String'", "'Path'", 
		"'while'", "'Tree'", "'throw'", "'try'", "'void'", "'union'", "'select'", 
		"'set'", "'group'", "'aggregate'", "'rename'", "'reorder'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BYTE", "BREAK", "CASE", "CATCH", "CHAR", "CONTINUE", 
		"CONFORMIFEQUAL", "DERIVEALWAYS", "DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", 
		"TERMINATE", "OVERRIDE", "EVALUATE", "EXPLODE", "DEFAULT", "DO", "DOUBLE", 
		"DROP", "ELSE", "FLOAT", "FOR", "IF", "INT", "JOIN", "LIST", "LONG", "MERGE", 
		"NEW", "NODE", "RECOGNIZE", "RETURN", "SHORT", "SWITCH", "STRING", "PATH", 
		"WHILE", "TREE", "THROW", "TRY", "VOID", "UNION", "SELECT", "SET", "GROUP", 
		"AGGREGATE", "RENAME", "REORDER", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "treelan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public treelanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatsContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stats);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(34);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(32);
						varDecl();
						}
						break;
					case 2:
						{
						setState(33);
						stat();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(treelanParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(treelanParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			typeType();
			setState(39);
			match(IDENTIFIER);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(40);
				match(ASSIGN);
				setState(41);
				expr(0);
				}
			}

			setState(44);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			formalParameter();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(48);
				formalParameter();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(treelanParser.IDENTIFIER, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			typeType();
			setState(55);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					stat();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(64);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode IF() { return getToken(treelanParser.IF, 0); }
		public ParExprContext parExpr() {
			return getRuleContext(ParExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(treelanParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(IF);
				setState(69);
				parExpr();
				setState(70);
				stat();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(71);
					match(ELSE);
					setState(72);
					stat();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				expr(0);
				setState(76);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				varDecl();
				setState(79);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpr; }
	}

	public final ParExprContext parExpr() throws RecognitionException {
		ParExprContext _localctx = new ParExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LPAREN);
			setState(84);
			expr(0);
			setState(85);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public BuiltinfunctionContext builtinfunction() {
			return getRuleContext(BuiltinfunctionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(treelanParser.IDENTIFIER, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(treelanParser.SUB, 0); }
		public TerminalNode BANG() { return getToken(treelanParser.BANG, 0); }
		public TerminalNode LPAREN() { return getToken(treelanParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(treelanParser.RPAREN, 0); }
		public TerminalNode MUL() { return getToken(treelanParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(treelanParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(treelanParser.ADD, 0); }
		public TerminalNode ASSIGN() { return getToken(treelanParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(treelanParser.EQUAL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(88);
				primary();
				}
				break;
			case 2:
				{
				setState(89);
				builtinfunction();
				}
				break;
			case 3:
				{
				setState(90);
				match(IDENTIFIER);
				setState(91);
				match(LPAREN);
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(92);
					exprList();
					}
					break;
				}
				setState(95);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(96);
				match(IDENTIFIER);
				setState(97);
				match(LBRACK);
				setState(98);
				expr(0);
				setState(99);
				match(RBRACK);
				}
				break;
			case 5:
				{
				setState(101);
				match(SUB);
				setState(102);
				expr(8);
				}
				break;
			case 6:
				{
				setState(103);
				match(BANG);
				setState(104);
				expr(7);
				}
				break;
			case 7:
				{
				setState(105);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				setState(106);
				match(LPAREN);
				setState(107);
				expr(0);
				setState(108);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(113);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(116);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						match(ASSIGN);
						setState(120);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(122);
						match(EQUAL);
						setState(123);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BuiltinfunctionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(treelanParser.SELECT, 0); }
		public List<TerminalNode> TREE() { return getTokens(treelanParser.TREE); }
		public TerminalNode TREE(int i) {
			return getToken(treelanParser.TREE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(treelanParser.JOIN, 0); }
		public TerminalNode MERGE() { return getToken(treelanParser.MERGE, 0); }
		public ConflictspecContext conflictspec() {
			return getRuleContext(ConflictspecContext.class,0);
		}
		public TerminalNode PATH() { return getToken(treelanParser.PATH, 0); }
		public TerminalNode NODE() { return getToken(treelanParser.NODE, 0); }
		public TerminalNode RECOGNIZE() { return getToken(treelanParser.RECOGNIZE, 0); }
		public TerminalNode SET() { return getToken(treelanParser.SET, 0); }
		public TerminalNode EXPLODE() { return getToken(treelanParser.EXPLODE, 0); }
		public TerminalNode DROP() { return getToken(treelanParser.DROP, 0); }
		public BuiltinfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinfunction; }
	}

	public final BuiltinfunctionContext builtinfunction() throws RecognitionException {
		BuiltinfunctionContext _localctx = new BuiltinfunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_builtinfunction);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(SELECT);
				setState(131);
				match(LPAREN);
				setState(132);
				match(TREE);
				setState(133);
				match(COMMA);
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(134);
					expr(0);
					}
					break;
				}
				setState(137);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(JOIN);
				setState(139);
				match(LPAREN);
				setState(140);
				match(TREE);
				setState(141);
				match(COMMA);
				setState(142);
				match(TREE);
				setState(143);
				match(COMMA);
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(144);
					expr(0);
					}
					break;
				}
				setState(147);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(MERGE);
				setState(149);
				match(LPAREN);
				setState(150);
				match(TREE);
				setState(151);
				match(COMMA);
				setState(152);
				match(TREE);
				setState(153);
				match(COMMA);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONFORMIFEQUAL) | (1L << DERIVEALWAYS) | (1L << DERIVEIFNOTEQUAL) | (1L << TERMINATEIFNOTEQUAL) | (1L << TERMINATE) | (1L << OVERRIDE) | (1L << EVALUATE))) != 0)) {
					{
					setState(154);
					conflictspec();
					}
				}

				setState(157);
				match(COMMA);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(158);
					expr(0);
					}
					break;
				}
				setState(161);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(PATH);
				setState(163);
				match(LPAREN);
				setState(164);
				match(TREE);
				setState(165);
				match(COMMA);
				setState(166);
				match(NODE);
				setState(167);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(RECOGNIZE);
				setState(169);
				match(LPAREN);
				setState(170);
				match(NODE);
				setState(171);
				match(COMMA);
				setState(172);
				match(SET);
				setState(173);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(EXPLODE);
				setState(175);
				match(LPAREN);
				setState(176);
				match(TREE);
				setState(177);
				match(COMMA);
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(178);
					expr(0);
					}
					break;
				}
				setState(181);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				match(DROP);
				setState(183);
				match(LPAREN);
				setState(184);
				match(TREE);
				setState(185);
				match(COMMA);
				setState(186);
				match(NODE);
				setState(187);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConflictspecContext extends ParserRuleContext {
		public TerminalNode CONFORMIFEQUAL() { return getToken(treelanParser.CONFORMIFEQUAL, 0); }
		public TerminalNode DERIVEALWAYS() { return getToken(treelanParser.DERIVEALWAYS, 0); }
		public TerminalNode DERIVEIFNOTEQUAL() { return getToken(treelanParser.DERIVEIFNOTEQUAL, 0); }
		public TerminalNode TERMINATEIFNOTEQUAL() { return getToken(treelanParser.TERMINATEIFNOTEQUAL, 0); }
		public TerminalNode TERMINATE() { return getToken(treelanParser.TERMINATE, 0); }
		public TerminalNode OVERRIDE() { return getToken(treelanParser.OVERRIDE, 0); }
		public TerminalNode EVALUATE() { return getToken(treelanParser.EVALUATE, 0); }
		public ConflictspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflictspec; }
	}

	public final ConflictspecContext conflictspec() throws RecognitionException {
		ConflictspecContext _localctx = new ConflictspecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conflictspec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONFORMIFEQUAL) | (1L << DERIVEALWAYS) | (1L << DERIVEIFNOTEQUAL) | (1L << TERMINATEIFNOTEQUAL) | (1L << TERMINATE) | (1L << OVERRIDE) | (1L << EVALUATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(treelanParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(treelanParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(treelanParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(LPAREN);
				setState(193);
				expr(0);
				setState(194);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expr(0);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(201);
				match(COMMA);
				setState(202);
				expr(0);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case NODE:
			case STRING:
			case TREE:
			case SET:
				{
				setState(208);
				complexType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(209);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(212);
				match(LBRACK);
				setState(213);
				match(RBRACK);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(treelanParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(treelanParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(treelanParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(treelanParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(treelanParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(treelanParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(treelanParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(treelanParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(treelanParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(treelanParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(treelanParser.INT, 0); }
		public TerminalNode LONG() { return getToken(treelanParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(treelanParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(treelanParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexTypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(treelanParser.LIST, 0); }
		public TerminalNode TREE() { return getToken(treelanParser.TREE, 0); }
		public TerminalNode NODE() { return getToken(treelanParser.NODE, 0); }
		public TerminalNode SET() { return getToken(treelanParser.SET, 0); }
		public TerminalNode STRING() { return getToken(treelanParser.STRING, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << NODE) | (1L << STRING) | (1L << TREE) | (1L << SET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3g\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\6"+
		"\2%\n\2\r\2\16\2&\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\4\3\4\3\4\7\4\64"+
		"\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"T\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0094"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\3\n\5\n\u00a2\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00b6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bf\n\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c9\n\f\3\r\3\r\3\r\7\r\u00ce\n\r\f\r\16"+
		"\r\u00d1\13\r\3\16\3\16\5\16\u00d5\n\16\3\16\3\16\7\16\u00d9\n\16\f\16"+
		"\16\16\u00dc\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\3\20\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\b\3\2ST\3\2QR\3\2\n\20\3\2\638\t"+
		"\2\3\4\b\b\24\24\27\27\32\32\35\35##\7\2\34\34  %%((..\2\u00fa\2$\3\2"+
		"\2\2\4(\3\2\2\2\6\60\3\2\2\2\b8\3\2\2\2\n;\3\2\2\2\fS\3\2\2\2\16U\3\2"+
		"\2\2\20p\3\2\2\2\22\u00be\3\2\2\2\24\u00c0\3\2\2\2\26\u00c8\3\2\2\2\30"+
		"\u00ca\3\2\2\2\32\u00d4\3\2\2\2\34\u00dd\3\2\2\2\36\u00df\3\2\2\2 \u00e1"+
		"\3\2\2\2\"%\5\4\3\2#%\5\f\7\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2"+
		"&\'\3\2\2\2\'\3\3\2\2\2()\5\32\16\2),\7g\2\2*+\7B\2\2+-\5\20\t\2,*\3\2"+
		"\2\2,-\3\2\2\2-.\3\2\2\2./\7?\2\2/\5\3\2\2\2\60\65\5\b\5\2\61\62\7@\2"+
		"\2\62\64\5\b\5\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\7\3\2\2\2\67\65\3\2\2\289\5\32\16\29:\7g\2\2:\t\3\2\2\2;?\7;\2\2"+
		"<>\5\f\7\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2"+
		"BC\7<\2\2C\13\3\2\2\2DT\5\n\6\2ET\5\4\3\2FG\7\31\2\2GH\5\16\b\2HK\5\f"+
		"\7\2IJ\7\26\2\2JL\5\f\7\2KI\3\2\2\2KL\3\2\2\2LT\3\2\2\2MN\5\20\t\2NO\7"+
		"?\2\2OT\3\2\2\2PQ\5\4\3\2QR\7?\2\2RT\3\2\2\2SD\3\2\2\2SE\3\2\2\2SF\3\2"+
		"\2\2SM\3\2\2\2SP\3\2\2\2T\r\3\2\2\2UV\79\2\2VW\5\20\t\2WX\7:\2\2X\17\3"+
		"\2\2\2YZ\b\t\1\2Zq\5\26\f\2[q\5\22\n\2\\]\7g\2\2]_\79\2\2^`\5\30\r\2_"+
		"^\3\2\2\2_`\3\2\2\2`a\3\2\2\2aq\7:\2\2bc\7g\2\2cd\7=\2\2de\5\20\t\2ef"+
		"\7>\2\2fq\3\2\2\2gh\7R\2\2hq\5\20\t\nij\7E\2\2jq\5\20\t\tkq\7g\2\2lm\7"+
		"9\2\2mn\5\20\t\2no\7:\2\2oq\3\2\2\2pY\3\2\2\2p[\3\2\2\2p\\\3\2\2\2pb\3"+
		"\2\2\2pg\3\2\2\2pi\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\u0080\3\2\2\2rs\f\b\2"+
		"\2st\t\2\2\2t\177\5\20\t\tuv\f\7\2\2vw\t\3\2\2w\177\5\20\t\bxy\f\6\2\2"+
		"yz\7B\2\2z\177\5\20\t\7{|\f\5\2\2|}\7I\2\2}\177\5\20\t\6~r\3\2\2\2~u\3"+
		"\2\2\2~x\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\21\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u00bf\3\2\2\2\u0084"+
		"\u0085\7-\2\2\u0085\u0086\79\2\2\u0086\u0087\7(\2\2\u0087\u0089\7@\2\2"+
		"\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u00bf\7:\2\2\u008c\u008d\7\33\2\2\u008d\u008e\79\2\2\u008e"+
		"\u008f\7(\2\2\u008f\u0090\7@\2\2\u0090\u0091\7(\2\2\u0091\u0093\7@\2\2"+
		"\u0092\u0094\5\20\t\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u00bf\7:\2\2\u0096\u0097\7\36\2\2\u0097\u0098\79\2\2\u0098"+
		"\u0099\7(\2\2\u0099\u009a\7@\2\2\u009a\u009b\7(\2\2\u009b\u009d\7@\2\2"+
		"\u009c\u009e\5\24\13\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\7@\2\2\u00a0\u00a2\5\20\t\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00bf\7:\2\2\u00a4\u00a5\7&\2"+
		"\2\u00a5\u00a6\79\2\2\u00a6\u00a7\7(\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9"+
		"\7 \2\2\u00a9\u00bf\7:\2\2\u00aa\u00ab\7!\2\2\u00ab\u00ac\79\2\2\u00ac"+
		"\u00ad\7 \2\2\u00ad\u00ae\7@\2\2\u00ae\u00af\7.\2\2\u00af\u00bf\7:\2\2"+
		"\u00b0\u00b1\7\21\2\2\u00b1\u00b2\79\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b5"+
		"\7@\2\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00bf\7:\2\2\u00b8\u00b9\7\25\2\2\u00b9\u00ba\79"+
		"\2\2\u00ba\u00bb\7(\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7 \2\2\u00bd\u00bf"+
		"\7:\2\2\u00be\u0083\3\2\2\2\u00be\u0084\3\2\2\2\u00be\u008c\3\2\2\2\u00be"+
		"\u0096\3\2\2\2\u00be\u00a4\3\2\2\2\u00be\u00aa\3\2\2\2\u00be\u00b0\3\2"+
		"\2\2\u00be\u00b8\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1\25"+
		"\3\2\2\2\u00c2\u00c3\79\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\7:\2\2\u00c5"+
		"\u00c9\3\2\2\2\u00c6\u00c9\5\34\17\2\u00c7\u00c9\7g\2\2\u00c8\u00c2\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\27\3\2\2\2\u00ca"+
		"\u00cf\5\20\t\2\u00cb\u00cc\7@\2\2\u00cc\u00ce\5\20\t\2\u00cd\u00cb\3"+
		"\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\31\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\5 \21\2\u00d3\u00d5\5\36\20"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d7"+
		"\7=\2\2\u00d7\u00d9\7>\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\33\3\2\2\2\u00dc\u00da\3\2\2"+
		"\2\u00dd\u00de\t\5\2\2\u00de\35\3\2\2\2\u00df\u00e0\t\6\2\2\u00e0\37\3"+
		"\2\2\2\u00e1\u00e2\t\7\2\2\u00e2!\3\2\2\2\27$&,\65?KS_p~\u0080\u0089\u0093"+
		"\u009d\u00a1\u00b5\u00be\u00c8\u00cf\u00d4\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}