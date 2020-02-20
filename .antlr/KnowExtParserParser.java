// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism\KnowExtParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnowExtParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, BREAK=3, CASE=4, CATCH=5, CHAR=6, CONTINUE=7, DEFAULT=8, 
		DO=9, DOUBLE=10, ELSE=11, FLOAT=12, FOR=13, IF=14, INT=15, JOIN=16, LIST=17, 
		LONG=18, NEW=19, NODE=20, RETURN=21, SHORT=22, SWITCH=23, STRING=24, WHILE=25, 
		TREE=26, THROW=27, TRY=28, VOID=29, UNION=30, SELECT=31, SET=32, GROUP=33, 
		AGGREGATE=34, RENAME=35, REORDER=36, DECIMAL_LITERAL=37, FLOAT_LITERAL=38, 
		BOOL_LITERAL=39, CHAR_LITERAL=40, STRING_LITERAL=41, NULL_LITERAL=42, 
		LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, LBRACK=47, RBRACK=48, SEMI=49, 
		COMMA=50, DOT=51, ASSIGN=52, GT=53, LT=54, BANG=55, TILDE=56, QUESTION=57, 
		COLON=58, EQUAL=59, LE=60, GE=61, NOTEQUAL=62, AND=63, OR=64, INC=65, 
		DEC=66, ADD=67, SUB=68, MUL=69, DIV=70, BITAND=71, BITOR=72, CARET=73, 
		MOD=74, ADD_ASSIGN=75, SUB_ASSIGN=76, MUL_ASSIGN=77, DIV_ASSIGN=78, AND_ASSIGN=79, 
		OR_ASSIGN=80, XOR_ASSIGN=81, MOD_ASSIGN=82, LSHIFT_ASSIGN=83, RSHIFT_ASSIGN=84, 
		URSHIFT_ASSIGN=85, WS=86, COMMENT=87, LINE_COMMENT=88, IDENTIFIER=89;
	public static final int
		RULE_file = 0, RULE_varDecl = 1, RULE_formalParameters = 2, RULE_formalParameter = 3, 
		RULE_block = 4, RULE_stat = 5, RULE_parExpr = 6, RULE_expr = 7, RULE_builtinfunction = 8, 
		RULE_primary = 9, RULE_exprList = 10, RULE_typeType = 11, RULE_literal = 12, 
		RULE_primitiveType = 13, RULE_complexType = 14;
	public static final String[] ruleNames = {
		"file", "varDecl", "formalParameters", "formalParameter", "block", "stat", 
		"parExpr", "expr", "builtinfunction", "primary", "exprList", "typeType", 
		"literal", "primitiveType", "complexType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'byte'", "'break'", "'case'", "'catch'", "'char'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'float'", "'for'", 
		"'if'", "'int'", "'join'", "'list'", "'long'", "'new'", "'node'", "'return'", 
		"'short'", "'switch'", "'String'", "'while'", "'Tree'", "'throw'", "'try'", 
		"'void'", "'union'", "'select'", "'set'", "'group'", "'aggregate'", "'rename'", 
		"'reorder'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BYTE", "BREAK", "CASE", "CATCH", "CHAR", "CONTINUE", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "JOIN", 
		"LIST", "LONG", "NEW", "NODE", "RETURN", "SHORT", "SWITCH", "STRING", 
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
	public String getGrammarFileName() { return "KnowExtParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KnowExtParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
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
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					varDecl();
					}
					break;
				case 2:
					{
					setState(31);
					stat();
					}
					break;
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << JOIN) | (1L << LIST) | (1L << LONG) | (1L << NODE) | (1L << SHORT) | (1L << STRING) | (1L << TREE) | (1L << SELECT) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG))) != 0) || _la==SUB || _la==IDENTIFIER );
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
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParserParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KnowExtParserParser.ASSIGN, 0); }
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
			setState(36);
			typeType();
			setState(37);
			match(IDENTIFIER);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(38);
				match(ASSIGN);
				setState(39);
				expr(0);
				}
			}

			setState(42);
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
			setState(44);
			formalParameter();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(45);
				match(COMMA);
				setState(46);
				formalParameter();
				}
				}
				setState(51);
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
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParserParser.IDENTIFIER, 0); }
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
			setState(52);
			typeType();
			setState(53);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LBRACE);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << JOIN) | (1L << LIST) | (1L << LONG) | (1L << NODE) | (1L << SHORT) | (1L << STRING) | (1L << TREE) | (1L << SELECT) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG))) != 0) || _la==SUB || _la==IDENTIFIER) {
				{
				{
				setState(56);
				stat();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
		public TerminalNode IF() { return getToken(KnowExtParserParser.IF, 0); }
		public ParExprContext parExpr() {
			return getRuleContext(ParExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KnowExtParserParser.ELSE, 0); }
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(IF);
				setState(67);
				parExpr();
				setState(68);
				stat();
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(69);
					match(ELSE);
					setState(70);
					stat();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				expr(0);
				setState(74);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				varDecl();
				setState(77);
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
			setState(81);
			match(LPAREN);
			setState(82);
			expr(0);
			setState(83);
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
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParserParser.IDENTIFIER, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(KnowExtParserParser.SUB, 0); }
		public TerminalNode BANG() { return getToken(KnowExtParserParser.BANG, 0); }
		public TerminalNode LPAREN() { return getToken(KnowExtParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KnowExtParserParser.RPAREN, 0); }
		public TerminalNode MUL() { return getToken(KnowExtParserParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(KnowExtParserParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(KnowExtParserParser.ADD, 0); }
		public TerminalNode ASSIGN() { return getToken(KnowExtParserParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(KnowExtParserParser.EQUAL, 0); }
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(86);
				primary();
				}
				break;
			case 2:
				{
				setState(87);
				builtinfunction();
				}
				break;
			case 3:
				{
				setState(88);
				match(IDENTIFIER);
				setState(89);
				match(LPAREN);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JOIN) | (1L << SELECT) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG))) != 0) || _la==SUB || _la==IDENTIFIER) {
					{
					setState(90);
					exprList();
					}
				}

				setState(93);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(94);
				match(IDENTIFIER);
				setState(95);
				match(LBRACK);
				setState(96);
				expr(0);
				setState(97);
				match(RBRACK);
				}
				break;
			case 5:
				{
				setState(99);
				match(SUB);
				setState(100);
				expr(8);
				}
				break;
			case 6:
				{
				setState(101);
				match(BANG);
				setState(102);
				expr(7);
				}
				break;
			case 7:
				{
				setState(103);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				setState(104);
				match(LPAREN);
				setState(105);
				expr(0);
				setState(106);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						match(ASSIGN);
						setState(118);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(EQUAL);
						setState(121);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(126);
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
		public TerminalNode SELECT() { return getToken(KnowExtParserParser.SELECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(KnowExtParserParser.JOIN, 0); }
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
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(SELECT);
				setState(128);
				match(LPAREN);
				setState(129);
				expr(0);
				setState(130);
				match(COMMA);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JOIN) | (1L << SELECT) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG))) != 0) || _la==SUB || _la==IDENTIFIER) {
					{
					setState(131);
					expr(0);
					}
				}

				setState(134);
				match(RPAREN);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(JOIN);
				setState(137);
				match(LPAREN);
				setState(138);
				expr(0);
				setState(139);
				match(COMMA);
				setState(140);
				expr(0);
				setState(141);
				match(COMMA);
				setState(142);
				expr(0);
				setState(143);
				match(RPAREN);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KnowExtParserParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KnowExtParserParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParserParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primary);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(LPAREN);
				setState(148);
				expr(0);
				setState(149);
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
				setState(151);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
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
		enterRule(_localctx, 20, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			expr(0);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(156);
				match(COMMA);
				setState(157);
				expr(0);
				}
				}
				setState(162);
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
		enterRule(_localctx, 22, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case NODE:
			case STRING:
			case TREE:
			case SET:
				{
				setState(163);
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
				setState(164);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(167);
				match(LBRACK);
				setState(168);
				match(RBRACK);
				}
				}
				setState(173);
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(KnowExtParserParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(KnowExtParserParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(KnowExtParserParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(KnowExtParserParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(KnowExtParserParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(KnowExtParserParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		public TerminalNode BOOLEAN() { return getToken(KnowExtParserParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(KnowExtParserParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(KnowExtParserParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(KnowExtParserParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(KnowExtParserParser.INT, 0); }
		public TerminalNode LONG() { return getToken(KnowExtParserParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(KnowExtParserParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(KnowExtParserParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		public TerminalNode LIST() { return getToken(KnowExtParserParser.LIST, 0); }
		public TerminalNode TREE() { return getToken(KnowExtParserParser.TREE, 0); }
		public TerminalNode NODE() { return getToken(KnowExtParserParser.NODE, 0); }
		public TerminalNode SET() { return getToken(KnowExtParserParser.SET, 0); }
		public TerminalNode STRING() { return getToken(KnowExtParserParser.STRING, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\4\3\4\3\4\7\4\62\n\4\f\4\16"+
		"\4\65\13\4\3\5\3\5\3\5\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7J\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0087\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0094\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3\f\7\f\u00a1"+
		"\n\f\f\f\16\f\u00a4\13\f\3\r\3\r\5\r\u00a8\n\r\3\r\3\r\7\r\u00ac\n\r\f"+
		"\r\16\r\u00af\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\3\20\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2GH\3\2EF\3\2\',\t\2\3\4\b\b\f"+
		"\f\16\16\21\21\24\24\30\30\7\2\23\23\26\26\32\32\34\34\"\"\2\u00c4\2\""+
		"\3\2\2\2\4&\3\2\2\2\6.\3\2\2\2\b\66\3\2\2\2\n9\3\2\2\2\fQ\3\2\2\2\16S"+
		"\3\2\2\2\20n\3\2\2\2\22\u0093\3\2\2\2\24\u009b\3\2\2\2\26\u009d\3\2\2"+
		"\2\30\u00a7\3\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2\2\2\36\u00b4\3\2\2\2"+
		" #\5\4\3\2!#\5\f\7\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2"+
		"\2\2%\3\3\2\2\2&\'\5\30\r\2\'*\7[\2\2()\7\66\2\2)+\5\20\t\2*(\3\2\2\2"+
		"*+\3\2\2\2+,\3\2\2\2,-\7\63\2\2-\5\3\2\2\2.\63\5\b\5\2/\60\7\64\2\2\60"+
		"\62\5\b\5\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\5\30\r\2\678\7[\2\28\t\3\2\2\29=\7/\2\2:"+
		"<\5\f\7\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2"+
		"@A\7\60\2\2A\13\3\2\2\2BR\5\n\6\2CR\5\4\3\2DE\7\20\2\2EF\5\16\b\2FI\5"+
		"\f\7\2GH\7\r\2\2HJ\5\f\7\2IG\3\2\2\2IJ\3\2\2\2JR\3\2\2\2KL\5\20\t\2LM"+
		"\7\63\2\2MR\3\2\2\2NO\5\4\3\2OP\7\63\2\2PR\3\2\2\2QB\3\2\2\2QC\3\2\2\2"+
		"QD\3\2\2\2QK\3\2\2\2QN\3\2\2\2R\r\3\2\2\2ST\7-\2\2TU\5\20\t\2UV\7.\2\2"+
		"V\17\3\2\2\2WX\b\t\1\2Xo\5\24\13\2Yo\5\22\n\2Z[\7[\2\2[]\7-\2\2\\^\5\26"+
		"\f\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_o\7.\2\2`a\7[\2\2ab\7\61\2\2bc\5\20"+
		"\t\2cd\7\62\2\2do\3\2\2\2ef\7F\2\2fo\5\20\t\ngh\79\2\2ho\5\20\t\tio\7"+
		"[\2\2jk\7-\2\2kl\5\20\t\2lm\7.\2\2mo\3\2\2\2nW\3\2\2\2nY\3\2\2\2nZ\3\2"+
		"\2\2n`\3\2\2\2ne\3\2\2\2ng\3\2\2\2ni\3\2\2\2nj\3\2\2\2o~\3\2\2\2pq\f\b"+
		"\2\2qr\t\2\2\2r}\5\20\t\tst\f\7\2\2tu\t\3\2\2u}\5\20\t\bvw\f\6\2\2wx\7"+
		"\66\2\2x}\5\20\t\7yz\f\5\2\2z{\7=\2\2{}\5\20\t\6|p\3\2\2\2|s\3\2\2\2|"+
		"v\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\21\3\2\2"+
		"\2\u0080~\3\2\2\2\u0081\u0082\7!\2\2\u0082\u0083\7-\2\2\u0083\u0084\5"+
		"\20\t\2\u0084\u0086\7\64\2\2\u0085\u0087\5\20\t\2\u0086\u0085\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7.\2\2\u0089\u0094"+
		"\3\2\2\2\u008a\u008b\7\22\2\2\u008b\u008c\7-\2\2\u008c\u008d\5\20\t\2"+
		"\u008d\u008e\7\64\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7\64\2\2\u0090"+
		"\u0091\5\20\t\2\u0091\u0092\7.\2\2\u0092\u0094\3\2\2\2\u0093\u0081\3\2"+
		"\2\2\u0093\u008a\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096\7-\2\2\u0096\u0097"+
		"\5\20\t\2\u0097\u0098\7.\2\2\u0098\u009c\3\2\2\2\u0099\u009c\5\32\16\2"+
		"\u009a\u009c\7[\2\2\u009b\u0095\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\25\3\2\2\2\u009d\u00a2\5\20\t\2\u009e\u009f\7\64\2\2\u009f"+
		"\u00a1\5\20\t\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\5\36\20\2\u00a6\u00a8\5\34\17\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ac\7\62\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\t\4\2\2\u00b1"+
		"\33\3\2\2\2\u00b2\u00b3\t\5\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\t\6\2\2\u00b5"+
		"\37\3\2\2\2\23\"$*\63=IQ]n|~\u0086\u0093\u009b\u00a2\u00a7\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}