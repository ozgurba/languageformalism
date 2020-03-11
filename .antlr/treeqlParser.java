// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism\treeql.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class treeqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INTEGER=3, DECIMAL=4, DOUBLE=5, INTEGER_POSITIVE=6, DECIMAL_POSITIVE=7, 
		DOUBLE_POSITIVE=8, INTEGER_NEGATIVE=9, DECIMAL_NEGATIVE=10, DOUBLE_NEGATIVE=11, 
		EXPONENT=12, STRING_LITERAL1=13, STRING_LITERAL2=14, STRING_LITERAL_LONG1=15, 
		STRING_LITERAL_LONG2=16, ECHAR=17, NIL=18, ANON=19, PN_CHARS_U=20, VARNAME=21, 
		LPAREN=22, RPAREN=23, LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, 
		COMMA=29, DOT=30, BOOLEAN=31, BYTE=32, CHAR=33, CONFORMIFEQUAL=34, DERIVEALWAYS=35, 
		DERIVEIFNOTEQUAL=36, TERMINATEIFNOTEQUAL=37, TERMINATE=38, OVERRIDE=39, 
		EVALUATE=40, EXPLODE=41, DROP=42, ELSE=43, FLOAT=44, FOR=45, IF=46, INT=47, 
		JOIN=48, LIST=49, LONG=50, MERGE=51, NODE=52, ON=53, RECOGNIZE=54, SHORT=55, 
		STRING=56, PATH=57, TREE=58, UNION=59, SELECT=60, FROM=61, WHERE=62, ALIAS=63, 
		ORDERBY=64, ASSIGN=65, GT=66, LT=67, BANG=68, TILDE=69, QUESTION=70, COLON=71, 
		EQUAL=72, LE=73, GE=74, NOTEQUAL=75, AND=76, OR=77, INC=78, DEC=79, ADD=80, 
		SUB=81, MUL=82, DIV=83, BITAND=84, BITOR=85, CARET=86, MOD=87, ADD_ASSIGN=88, 
		SUB_ASSIGN=89, MUL_ASSIGN=90, DIV_ASSIGN=91, AND_ASSIGN=92, OR_ASSIGN=93, 
		XOR_ASSIGN=94, MOD_ASSIGN=95, LSHIFT_ASSIGN=96, RSHIFT_ASSIGN=97, URSHIFT_ASSIGN=98, 
		PN_PREFIX=99, PN_LOCAL=100, WS=101;
	public static final int
		RULE_statements = 0, RULE_definition = 1, RULE_treeQuery = 2, RULE_selectQuery = 3, 
		RULE_joinQuery = 4, RULE_mergeQuery = 5, RULE_conflictspec = 6, RULE_explodeQuery = 7, 
		RULE_expressions = 8, RULE_selectorCondition = 9, RULE_booleanExpression = 10, 
		RULE_expression = 11, RULE_treeExpression = 12, RULE_stringExpression = 13, 
		RULE_typeType = 14, RULE_primitiveType = 15, RULE_complexType = 16, RULE_numericLiteral = 17, 
		RULE_numericLiteralUnsigned = 18, RULE_numericLiteralPositive = 19, RULE_numericLiteralNegative = 20, 
		RULE_booleanLiteral = 21, RULE_string = 22;
	public static final String[] ruleNames = {
		"statements", "definition", "treeQuery", "selectQuery", "joinQuery", "mergeQuery", 
		"conflictspec", "explodeQuery", "expressions", "selectorCondition", "booleanExpression", 
		"expression", "treeExpression", "stringExpression", "typeType", "primitiveType", 
		"complexType", "numericLiteral", "numericLiteralUnsigned", "numericLiteralPositive", 
		"numericLiteralNegative", "booleanLiteral", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'boolean'", "'byte'", 
		"'char'", "'conformifequal'", "'derivealways'", "'deriveifequal'", "'terminateifnotequal'", 
		"'terminate'", "'override'", "'evaluate'", "'explode'", "'drop'", "'else'", 
		"'float'", "'for'", "'if'", "'int'", "'join'", "'list'", "'long'", "'merge'", 
		"'node'", "'on'", "'recognize'", "'short'", "'String'", "'Path'", "'Tree'", 
		"'union'", "'select'", "'from'", "'where'", "'as'", "'orderby'", "'='", 
		"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
		"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
		"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", 
		"DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", 
		"DOUBLE_NEGATIVE", "EXPONENT", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
		"STRING_LITERAL_LONG2", "ECHAR", "NIL", "ANON", "PN_CHARS_U", "VARNAME", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "BOOLEAN", "BYTE", "CHAR", "CONFORMIFEQUAL", "DERIVEALWAYS", "DERIVEIFNOTEQUAL", 
		"TERMINATEIFNOTEQUAL", "TERMINATE", "OVERRIDE", "EVALUATE", "EXPLODE", 
		"DROP", "ELSE", "FLOAT", "FOR", "IF", "INT", "JOIN", "LIST", "LONG", "MERGE", 
		"NODE", "ON", "RECOGNIZE", "SHORT", "STRING", "PATH", "TREE", "UNION", 
		"SELECT", "FROM", "WHERE", "ALIAS", "ORDERBY", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "PN_PREFIX", "PN_LOCAL", "WS"
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
	public String getGrammarFileName() { return "treeql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public treeqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case LIST:
			case LONG:
			case NODE:
			case SHORT:
			case STRING:
			case TREE:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					definition();
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << NODE) | (1L << SHORT) | (1L << STRING) | (1L << TREE))) != 0) );
				}
				break;
			case EXPLODE:
			case JOIN:
			case MERGE:
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				treeQuery();
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

	public static class DefinitionContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(treeqlParser.VARNAME, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			typeType();
			setState(55);
			match(VARNAME);
			setState(56);
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

	public static class TreeQueryContext extends ParserRuleContext {
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public JoinQueryContext joinQuery() {
			return getRuleContext(JoinQueryContext.class,0);
		}
		public MergeQueryContext mergeQuery() {
			return getRuleContext(MergeQueryContext.class,0);
		}
		public ExplodeQueryContext explodeQuery() {
			return getRuleContext(ExplodeQueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(treeqlParser.LPAREN, 0); }
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(treeqlParser.RPAREN, 0); }
		public TreeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeQuery; }
	}

	public final TreeQueryContext treeQuery() throws RecognitionException {
		TreeQueryContext _localctx = new TreeQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_treeQuery);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				selectQuery();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				joinQuery();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				mergeQuery();
				}
				break;
			case EXPLODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				explodeQuery();
				setState(62);
				match(LPAREN);
				setState(63);
				treeQuery();
				setState(64);
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

	public static class SelectQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(treeqlParser.SELECT, 0); }
		public TreeExpressionContext treeExpression() {
			return getRuleContext(TreeExpressionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(treeqlParser.FROM, 0); }
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(treeqlParser.WHERE, 0); }
		public SelectorConditionContext selectorCondition() {
			return getRuleContext(SelectorConditionContext.class,0);
		}
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(SELECT);
			setState(69);
			treeExpression();
			setState(70);
			match(FROM);
			setState(71);
			treeQuery();
			setState(72);
			match(WHERE);
			setState(73);
			selectorCondition();
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

	public static class JoinQueryContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(treeqlParser.JOIN, 0); }
		public List<TreeQueryContext> treeQuery() {
			return getRuleContexts(TreeQueryContext.class);
		}
		public TreeQueryContext treeQuery(int i) {
			return getRuleContext(TreeQueryContext.class,i);
		}
		public TerminalNode ON() { return getToken(treeqlParser.ON, 0); }
		public SelectorConditionContext selectorCondition() {
			return getRuleContext(SelectorConditionContext.class,0);
		}
		public JoinQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinQuery; }
	}

	public final JoinQueryContext joinQuery() throws RecognitionException {
		JoinQueryContext _localctx = new JoinQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_joinQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(JOIN);
			setState(76);
			treeQuery();
			setState(77);
			match(COMMA);
			setState(78);
			treeQuery();
			setState(79);
			match(ON);
			setState(80);
			selectorCondition();
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

	public static class MergeQueryContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(treeqlParser.MERGE, 0); }
		public List<TreeQueryContext> treeQuery() {
			return getRuleContexts(TreeQueryContext.class);
		}
		public TreeQueryContext treeQuery(int i) {
			return getRuleContext(TreeQueryContext.class,i);
		}
		public ConflictspecContext conflictspec() {
			return getRuleContext(ConflictspecContext.class,0);
		}
		public MergeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeQuery; }
	}

	public final MergeQueryContext mergeQuery() throws RecognitionException {
		MergeQueryContext _localctx = new MergeQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mergeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(MERGE);
			setState(83);
			treeQuery();
			setState(84);
			match(COMMA);
			setState(85);
			treeQuery();
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(86);
				conflictspec();
				}
				break;
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

	public static class ConflictspecContext extends ParserRuleContext {
		public TerminalNode CONFORMIFEQUAL() { return getToken(treeqlParser.CONFORMIFEQUAL, 0); }
		public TerminalNode DERIVEALWAYS() { return getToken(treeqlParser.DERIVEALWAYS, 0); }
		public TerminalNode DERIVEIFNOTEQUAL() { return getToken(treeqlParser.DERIVEIFNOTEQUAL, 0); }
		public TerminalNode TERMINATEIFNOTEQUAL() { return getToken(treeqlParser.TERMINATEIFNOTEQUAL, 0); }
		public TerminalNode TERMINATE() { return getToken(treeqlParser.TERMINATE, 0); }
		public TerminalNode OVERRIDE() { return getToken(treeqlParser.OVERRIDE, 0); }
		public TerminalNode EVALUATE() { return getToken(treeqlParser.EVALUATE, 0); }
		public ConflictspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflictspec; }
	}

	public final ConflictspecContext conflictspec() throws RecognitionException {
		ConflictspecContext _localctx = new ConflictspecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conflictspec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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

	public static class ExplodeQueryContext extends ParserRuleContext {
		public TerminalNode EXPLODE() { return getToken(treeqlParser.EXPLODE, 0); }
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public ExplodeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explodeQuery; }
	}

	public final ExplodeQueryContext explodeQuery() throws RecognitionException {
		ExplodeQueryContext _localctx = new ExplodeQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_explodeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(EXPLODE);
			setState(92);
			treeQuery();
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		return expressions(0);
	}

	private ExpressionsContext expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, _parentState);
		ExpressionsContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressions);
					setState(97);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(98);
					match(DOT);
					setState(99);
					expressions(3);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class SelectorConditionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SelectorConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorCondition; }
	}

	public final SelectorConditionContext selectorCondition() throws RecognitionException {
		SelectorConditionContext _localctx = new SelectorConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectorCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			booleanExpression();
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expression();
			setState(108);
			match(EQUAL);
			setState(109);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TreeExpressionContext treeExpression() {
			return getRuleContext(TreeExpressionContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				treeExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				stringExpression();
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

	public static class TreeExpressionContext extends ParserRuleContext {
		public TreeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeExpression; }
	}

	public final TreeExpressionContext treeExpression() throws RecognitionException {
		TreeExpressionContext _localctx = new TreeExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_treeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StringExpressionContext extends ParserRuleContext {
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case NODE:
			case STRING:
			case TREE:
				{
				setState(119);
				complexType();
				}
				break;
			case DOUBLE:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(120);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(123);
				match(LBRACK);
				setState(124);
				match(RBRACK);
				}
				}
				setState(129);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(treeqlParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(treeqlParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(treeqlParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(treeqlParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(treeqlParser.INT, 0); }
		public TerminalNode LONG() { return getToken(treeqlParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(treeqlParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(treeqlParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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
		public TerminalNode LIST() { return getToken(treeqlParser.LIST, 0); }
		public TerminalNode TREE() { return getToken(treeqlParser.TREE, 0); }
		public TerminalNode NODE() { return getToken(treeqlParser.NODE, 0); }
		public TerminalNode STRING() { return getToken(treeqlParser.STRING, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << NODE) | (1L << STRING) | (1L << TREE))) != 0)) ) {
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralUnsignedContext numericLiteralUnsigned() {
			return getRuleContext(NumericLiteralUnsignedContext.class,0);
		}
		public NumericLiteralPositiveContext numericLiteralPositive() {
			return getRuleContext(NumericLiteralPositiveContext.class,0);
		}
		public NumericLiteralNegativeContext numericLiteralNegative() {
			return getRuleContext(NumericLiteralNegativeContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numericLiteral);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				numericLiteralUnsigned();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				numericLiteralNegative();
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

	public static class NumericLiteralUnsignedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(treeqlParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(treeqlParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(treeqlParser.DOUBLE, 0); }
		public NumericLiteralUnsignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralUnsigned; }
	}

	public final NumericLiteralUnsignedContext numericLiteralUnsigned() throws RecognitionException {
		NumericLiteralUnsignedContext _localctx = new NumericLiteralUnsignedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numericLiteralUnsigned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE))) != 0)) ) {
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

	public static class NumericLiteralPositiveContext extends ParserRuleContext {
		public TerminalNode INTEGER_POSITIVE() { return getToken(treeqlParser.INTEGER_POSITIVE, 0); }
		public TerminalNode DECIMAL_POSITIVE() { return getToken(treeqlParser.DECIMAL_POSITIVE, 0); }
		public TerminalNode DOUBLE_POSITIVE() { return getToken(treeqlParser.DOUBLE_POSITIVE, 0); }
		public NumericLiteralPositiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralPositive; }
	}

	public final NumericLiteralPositiveContext numericLiteralPositive() throws RecognitionException {
		NumericLiteralPositiveContext _localctx = new NumericLiteralPositiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numericLiteralPositive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_POSITIVE) | (1L << DECIMAL_POSITIVE) | (1L << DOUBLE_POSITIVE))) != 0)) ) {
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

	public static class NumericLiteralNegativeContext extends ParserRuleContext {
		public TerminalNode INTEGER_NEGATIVE() { return getToken(treeqlParser.INTEGER_NEGATIVE, 0); }
		public TerminalNode DECIMAL_NEGATIVE() { return getToken(treeqlParser.DECIMAL_NEGATIVE, 0); }
		public TerminalNode DOUBLE_NEGATIVE() { return getToken(treeqlParser.DOUBLE_NEGATIVE, 0); }
		public NumericLiteralNegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralNegative; }
	}

	public final NumericLiteralNegativeContext numericLiteralNegative() throws RecognitionException {
		NumericLiteralNegativeContext _localctx = new NumericLiteralNegativeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numericLiteralNegative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_NEGATIVE) | (1L << DECIMAL_NEGATIVE) | (1L << DOUBLE_NEGATIVE))) != 0)) ) {
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL1() { return getToken(treeqlParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(treeqlParser.STRING_LITERAL2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL1 || _la==STRING_LITERAL2) ) {
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
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3g\u0098\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5"+
		"\rt\n\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20|\n\20\3\20\3\20\7\20\u0080"+
		"\n\20\f\20\16\20\u0083\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u008c"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\3\22\31"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\n\3\2$*\b\2\7\7!#."+
		".\61\61\64\6499\6\2\63\63\66\66::<<\3\2\5\7\3\2\b\n\3\2\13\r\3\2\3\4\3"+
		"\2\17\20\2\u008c\2\66\3\2\2\2\48\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2\nM\3\2"+
		"\2\2\fT\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22`\3\2\2\2\24k\3\2\2\2\26m\3"+
		"\2\2\2\30s\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36{\3\2\2\2 \u0084\3\2\2\2"+
		"\"\u0086\3\2\2\2$\u008b\3\2\2\2&\u008d\3\2\2\2(\u008f\3\2\2\2*\u0091\3"+
		"\2\2\2,\u0093\3\2\2\2.\u0095\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\67\5\6\4\2\66\61"+
		"\3\2\2\2\66\65\3\2\2\2\67\3\3\2\2\289\5\36\20\29:\7\27\2\2:;\7\36\2\2"+
		";\5\3\2\2\2<E\5\b\5\2=E\5\n\6\2>E\5\f\7\2?@\5\20\t\2@A\7\30\2\2AB\5\6"+
		"\4\2BC\7\31\2\2CE\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3\2\2\2D?\3\2\2\2E\7\3"+
		"\2\2\2FG\7>\2\2GH\5\32\16\2HI\7?\2\2IJ\5\6\4\2JK\7@\2\2KL\5\24\13\2L\t"+
		"\3\2\2\2MN\7\62\2\2NO\5\6\4\2OP\7\37\2\2PQ\5\6\4\2QR\7\67\2\2RS\5\24\13"+
		"\2S\13\3\2\2\2TU\7\65\2\2UV\5\6\4\2VW\7\37\2\2WY\5\6\4\2XZ\5\16\b\2YX"+
		"\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[\\\t\2\2\2\\\17\3\2\2\2]^\7+\2\2^_\5\6\4"+
		"\2_\21\3\2\2\2`a\b\n\1\2ab\5\30\r\2bh\3\2\2\2cd\f\4\2\2de\7 \2\2eg\5\22"+
		"\n\5fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\23\3\2\2\2jh\3\2\2\2kl\5"+
		"\26\f\2l\25\3\2\2\2mn\5\30\r\2no\7J\2\2op\5\30\r\2p\27\3\2\2\2qt\5\32"+
		"\16\2rt\5\34\17\2sq\3\2\2\2sr\3\2\2\2t\31\3\2\2\2uv\3\2\2\2v\33\3\2\2"+
		"\2wx\3\2\2\2x\35\3\2\2\2y|\5\"\22\2z|\5 \21\2{y\3\2\2\2{z\3\2\2\2|\u0081"+
		"\3\2\2\2}~\7\34\2\2~\u0080\7\35\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\37\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0085\t\3\2\2\u0085!\3\2\2\2\u0086\u0087\t\4\2\2\u0087#\3\2\2\2"+
		"\u0088\u008c\5&\24\2\u0089\u008c\5(\25\2\u008a\u008c\5*\26\2\u008b\u0088"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c%\3\2\2\2\u008d"+
		"\u008e\t\5\2\2\u008e\'\3\2\2\2\u008f\u0090\t\6\2\2\u0090)\3\2\2\2\u0091"+
		"\u0092\t\7\2\2\u0092+\3\2\2\2\u0093\u0094\t\b\2\2\u0094-\3\2\2\2\u0095"+
		"\u0096\t\t\2\2\u0096/\3\2\2\2\13\63\66DYhs{\u0081\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}