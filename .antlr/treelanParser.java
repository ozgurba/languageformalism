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
		RULE_stats = 0, RULE_varDecl = 1, RULE_functionDecl = 2, RULE_formalParameters = 3, 
		RULE_formalParameter = 4, RULE_block = 5, RULE_stat = 6, RULE_parExpr = 7, 
		RULE_expr = 8, RULE_builtinfunction = 9, RULE_conflictspec = 10, RULE_primary = 11, 
		RULE_qualifiedName = 12, RULE_exprList = 13, RULE_typeType = 14, RULE_literal = 15, 
		RULE_primitiveType = 16, RULE_complexType = 17;
	public static final String[] ruleNames = {
		"stats", "varDecl", "functionDecl", "formalParameters", "formalParameter", 
		"block", "stat", "parExpr", "expr", "builtinfunction", "conflictspec", 
		"primary", "qualifiedName", "exprList", "typeType", "literal", "primitiveType", 
		"complexType"
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
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(37);
					stat();
					}
					break;
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << EXPLODE) | (1L << DOUBLE) | (1L << DROP) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << JOIN) | (1L << LIST) | (1L << LONG) | (1L << MERGE) | (1L << NODE) | (1L << RECOGNIZE) | (1L << SHORT) | (1L << STRING) | (1L << PATH) | (1L << WHILE) | (1L << TREE) | (1L << VOID) | (1L << SELECT) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0) );
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
			setState(42);
			typeType();
			setState(43);
			match(IDENTIFIER);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(44);
				match(ASSIGN);
				setState(45);
				expr(0);
				}
			}

			setState(48);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(treelanParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			typeType();
			setState(51);
			match(IDENTIFIER);
			setState(52);
			match(LPAREN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << NODE) | (1L << SHORT) | (1L << STRING) | (1L << TREE) | (1L << VOID) | (1L << SET))) != 0)) {
				{
				setState(53);
				formalParameters();
				}
			}

			setState(56);
			match(RPAREN);
			setState(57);
			block();
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
		enterRule(_localctx, 6, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			formalParameter();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				formalParameter();
				}
				}
				setState(66);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			typeType();
			setState(68);
			qualifiedName();
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LBRACE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << EXPLODE) | (1L << DOUBLE) | (1L << DROP) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << JOIN) | (1L << LIST) | (1L << LONG) | (1L << MERGE) | (1L << NODE) | (1L << RECOGNIZE) | (1L << SHORT) | (1L << STRING) | (1L << PATH) | (1L << WHILE) | (1L << TREE) | (1L << VOID) | (1L << SELECT) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(71);
				stat();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
		public TerminalNode WHILE() { return getToken(treelanParser.WHILE, 0); }
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
		enterRule(_localctx, 12, RULE_stat);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(IF);
				setState(82);
				parExpr();
				setState(83);
				stat();
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(84);
					match(ELSE);
					setState(85);
					stat();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(WHILE);
				setState(89);
				parExpr();
				setState(90);
				stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				expr(0);
				setState(93);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				varDecl();
				setState(96);
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
		enterRule(_localctx, 14, RULE_parExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(LPAREN);
			setState(101);
			expr(0);
			setState(102);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(105);
				primary();
				}
				break;
			case 2:
				{
				setState(106);
				builtinfunction();
				}
				break;
			case 3:
				{
				setState(107);
				qualifiedName();
				setState(108);
				match(LPAREN);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXPLODE) | (1L << DROP) | (1L << JOIN) | (1L << MERGE) | (1L << RECOGNIZE) | (1L << PATH) | (1L << SELECT) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(109);
					exprList();
					}
				}

				setState(112);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(114);
				qualifiedName();
				setState(115);
				match(LBRACK);
				setState(116);
				expr(0);
				setState(117);
				match(RBRACK);
				}
				break;
			case 5:
				{
				setState(119);
				match(SUB);
				setState(120);
				expr(8);
				}
				break;
			case 6:
				{
				setState(121);
				match(BANG);
				setState(122);
				expr(7);
				}
				break;
			case 7:
				{
				setState(123);
				qualifiedName();
				}
				break;
			case 8:
				{
				setState(124);
				match(LPAREN);
				setState(125);
				expr(0);
				setState(126);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						match(ASSIGN);
						setState(138);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(140);
						match(EQUAL);
						setState(141);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
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
		public TerminalNode RECOGNIZE() { return getToken(treelanParser.RECOGNIZE, 0); }
		public TerminalNode NODE() { return getToken(treelanParser.NODE, 0); }
		public TerminalNode EXPLODE() { return getToken(treelanParser.EXPLODE, 0); }
		public TerminalNode DROP() { return getToken(treelanParser.DROP, 0); }
		public BuiltinfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinfunction; }
	}

	public final BuiltinfunctionContext builtinfunction() throws RecognitionException {
		BuiltinfunctionContext _localctx = new BuiltinfunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_builtinfunction);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(SELECT);
				setState(148);
				match(LPAREN);
				setState(149);
				qualifiedName();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(150);
					match(COMMA);
					setState(151);
					expr(0);
					}
				}

				setState(154);
				match(RPAREN);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(JOIN);
				setState(157);
				match(LPAREN);
				setState(158);
				qualifiedName();
				setState(159);
				match(COMMA);
				setState(160);
				qualifiedName();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(161);
					match(COMMA);
					setState(162);
					expr(0);
					}
				}

				setState(165);
				match(RPAREN);
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(MERGE);
				setState(168);
				match(LPAREN);
				setState(169);
				qualifiedName();
				setState(170);
				match(COMMA);
				setState(171);
				qualifiedName();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(172);
					match(COMMA);
					setState(173);
					conflictspec();
					}
					break;
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(176);
					match(COMMA);
					setState(177);
					expr(0);
					}
				}

				setState(180);
				match(RPAREN);
				}
				break;
			case PATH:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(PATH);
				setState(183);
				match(LPAREN);
				setState(184);
				qualifiedName();
				setState(185);
				match(COMMA);
				setState(186);
				qualifiedName();
				setState(187);
				match(RPAREN);
				}
				break;
			case RECOGNIZE:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(RECOGNIZE);
				setState(190);
				match(LPAREN);
				setState(191);
				match(NODE);
				setState(192);
				match(COMMA);
				setState(193);
				qualifiedName();
				setState(194);
				match(RPAREN);
				}
				break;
			case EXPLODE:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(EXPLODE);
				setState(197);
				match(LPAREN);
				setState(198);
				qualifiedName();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(199);
					match(COMMA);
					setState(200);
					expr(0);
					}
				}

				setState(203);
				match(RPAREN);
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				match(DROP);
				setState(206);
				match(LPAREN);
				setState(207);
				qualifiedName();
				setState(208);
				match(COMMA);
				setState(209);
				qualifiedName();
				setState(210);
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
		enterRule(_localctx, 20, RULE_conflictspec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primary);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(LPAREN);
				setState(217);
				expr(0);
				setState(218);
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
				setState(220);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				qualifiedName();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(treelanParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(treelanParser.IDENTIFIER, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IDENTIFIER);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(DOT);
					setState(226);
					match(IDENTIFIER);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 26, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expr(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				expr(0);
				}
				}
				setState(239);
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
		enterRule(_localctx, 28, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case NODE:
			case STRING:
			case TREE:
			case SET:
				{
				setState(240);
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
			case VOID:
				{
				setState(241);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(244);
				match(LBRACK);
				setState(245);
				match(RBRACK);
				}
				}
				setState(250);
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
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		public TerminalNode VOID() { return getToken(treelanParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3g\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5A\n\5\f\5\16\5"+
		"D\13\5\3\6\3\6\3\6\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"e\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00a6\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00b1\n\13\3\13\3\13\5\13\u00b5\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00cc\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00d7\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e1\n"+
		"\r\3\16\3\16\3\16\7\16\u00e6\n\16\f\16\16\16\u00e9\13\16\3\17\3\17\3\17"+
		"\7\17\u00ee\n\17\f\17\16\17\u00f1\13\17\3\20\3\20\5\20\u00f5\n\20\3\20"+
		"\3\20\7\20\u00f9\n\20\f\20\16\20\u00fc\13\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\2\3\22\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\b\3"+
		"\2ST\3\2QR\3\2\n\20\3\2\638\n\2\3\4\b\b\24\24\27\27\32\32\35\35##++\7"+
		"\2\34\34  %%((..\2\u011a\2(\3\2\2\2\4,\3\2\2\2\6\64\3\2\2\2\b=\3\2\2\2"+
		"\nE\3\2\2\2\fH\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22\u0082\3\2\2\2\24\u00d6"+
		"\3\2\2\2\26\u00d8\3\2\2\2\30\u00e0\3\2\2\2\32\u00e2\3\2\2\2\34\u00ea\3"+
		"\2\2\2\36\u00f4\3\2\2\2 \u00fd\3\2\2\2\"\u00ff\3\2\2\2$\u0101\3\2\2\2"+
		"&)\5\6\4\2\')\5\16\b\2(&\3\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2"+
		"\2\2+\3\3\2\2\2,-\5\36\20\2-\60\7g\2\2./\7B\2\2/\61\5\22\n\2\60.\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7?\2\2\63\5\3\2\2\2\64\65\5\36\20"+
		"\2\65\66\7g\2\2\668\79\2\2\679\5\b\5\28\67\3\2\2\289\3\2\2\29:\3\2\2\2"+
		":;\7:\2\2;<\5\f\7\2<\7\3\2\2\2=B\5\n\6\2>?\7@\2\2?A\5\n\6\2@>\3\2\2\2"+
		"AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB\3\2\2\2EF\5\36\20\2FG\5\32"+
		"\16\2G\13\3\2\2\2HL\7;\2\2IK\5\16\b\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM"+
		"\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7<\2\2P\r\3\2\2\2Qe\5\f\7\2Re\5\4\3\2S"+
		"T\7\31\2\2TU\5\20\t\2UX\5\16\b\2VW\7\26\2\2WY\5\16\b\2XV\3\2\2\2XY\3\2"+
		"\2\2Ye\3\2\2\2Z[\7\'\2\2[\\\5\20\t\2\\]\5\16\b\2]e\3\2\2\2^_\5\22\n\2"+
		"_`\7?\2\2`e\3\2\2\2ab\5\4\3\2bc\7?\2\2ce\3\2\2\2dQ\3\2\2\2dR\3\2\2\2d"+
		"S\3\2\2\2dZ\3\2\2\2d^\3\2\2\2da\3\2\2\2e\17\3\2\2\2fg\79\2\2gh\5\22\n"+
		"\2hi\7:\2\2i\21\3\2\2\2jk\b\n\1\2k\u0083\5\30\r\2l\u0083\5\24\13\2mn\5"+
		"\32\16\2np\79\2\2oq\5\34\17\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7:\2\2s"+
		"\u0083\3\2\2\2tu\5\32\16\2uv\7=\2\2vw\5\22\n\2wx\7>\2\2x\u0083\3\2\2\2"+
		"yz\7R\2\2z\u0083\5\22\n\n{|\7E\2\2|\u0083\5\22\n\t}\u0083\5\32\16\2~\177"+
		"\79\2\2\177\u0080\5\22\n\2\u0080\u0081\7:\2\2\u0081\u0083\3\2\2\2\u0082"+
		"j\3\2\2\2\u0082l\3\2\2\2\u0082m\3\2\2\2\u0082t\3\2\2\2\u0082y\3\2\2\2"+
		"\u0082{\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\u0092\3\2\2\2\u0084"+
		"\u0085\f\b\2\2\u0085\u0086\t\2\2\2\u0086\u0091\5\22\n\t\u0087\u0088\f"+
		"\7\2\2\u0088\u0089\t\3\2\2\u0089\u0091\5\22\n\b\u008a\u008b\f\6\2\2\u008b"+
		"\u008c\7B\2\2\u008c\u0091\5\22\n\7\u008d\u008e\f\5\2\2\u008e\u008f\7I"+
		"\2\2\u008f\u0091\5\22\n\6\u0090\u0084\3\2\2\2\u0090\u0087\3\2\2\2\u0090"+
		"\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\7-\2\2\u0096\u0097\79\2\2\u0097\u009a\5\32\16\2\u0098\u0099\7@\2\2\u0099"+
		"\u009b\5\22\n\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009d\7:\2\2\u009d\u00d7\3\2\2\2\u009e\u009f\7\33\2\2\u009f"+
		"\u00a0\79\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7@\2\2\u00a2\u00a5\5\32"+
		"\16\2\u00a3\u00a4\7@\2\2\u00a4\u00a6\5\22\n\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7:\2\2\u00a8\u00d7\3\2"+
		"\2\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab\79\2\2\u00ab\u00ac\5\32\16\2\u00ac"+
		"\u00ad\7@\2\2\u00ad\u00b0\5\32\16\2\u00ae\u00af\7@\2\2\u00af\u00b1\5\26"+
		"\f\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b3\7@\2\2\u00b3\u00b5\5\22\n\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7:\2\2\u00b7\u00d7\3\2\2\2\u00b8"+
		"\u00b9\7&\2\2\u00b9\u00ba\79\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7@"+
		"\2\2\u00bc\u00bd\5\32\16\2\u00bd\u00be\7:\2\2\u00be\u00d7\3\2\2\2\u00bf"+
		"\u00c0\7!\2\2\u00c0\u00c1\79\2\2\u00c1\u00c2\7 \2\2\u00c2\u00c3\7@\2\2"+
		"\u00c3\u00c4\5\32\16\2\u00c4\u00c5\7:\2\2\u00c5\u00d7\3\2\2\2\u00c6\u00c7"+
		"\7\21\2\2\u00c7\u00c8\79\2\2\u00c8\u00cb\5\32\16\2\u00c9\u00ca\7@\2\2"+
		"\u00ca\u00cc\5\22\n\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\7:\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7\25\2\2\u00d0"+
		"\u00d1\79\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\5\32"+
		"\16\2\u00d4\u00d5\7:\2\2\u00d5\u00d7\3\2\2\2\u00d6\u0095\3\2\2\2\u00d6"+
		"\u009e\3\2\2\2\u00d6\u00a9\3\2\2\2\u00d6\u00b8\3\2\2\2\u00d6\u00bf\3\2"+
		"\2\2\u00d6\u00c6\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d9"+
		"\t\4\2\2\u00d9\27\3\2\2\2\u00da\u00db\79\2\2\u00db\u00dc\5\22\n\2\u00dc"+
		"\u00dd\7:\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e1\5 \21\2\u00df\u00e1\5\32"+
		"\16\2\u00e0\u00da\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\31\3\2\2\2\u00e2\u00e7\7g\2\2\u00e3\u00e4\7A\2\2\u00e4\u00e6\7g\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\33\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ef\5\22\n\2\u00eb\u00ec"+
		"\7@\2\2\u00ec\u00ee\5\22\n\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\35\3\2\2\2\u00f1\u00ef\3\2\2"+
		"\2\u00f2\u00f5\5$\23\2\u00f3\u00f5\5\"\22\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00fa\3\2\2\2\u00f6\u00f7\7=\2\2\u00f7\u00f9\7>\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\37\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\t\5\2\2\u00fe"+
		"!\3\2\2\2\u00ff\u0100\t\6\2\2\u0100#\3\2\2\2\u0101\u0102\t\7\2\2\u0102"+
		"%\3\2\2\2\31(*\608BLXdp\u0082\u0090\u0092\u009a\u00a5\u00b0\u00b4\u00cb"+
		"\u00d6\u00e0\u00e7\u00ef\u00f4\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}