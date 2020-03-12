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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ALIAS=7, LPAREN=8, RPAREN=9, 
		LBRACE=10, RBRACE=11, LBRACK=12, RBRACK=13, SEMI=14, COMMA=15, DOT=16, 
		AS=17, BOOLEAN=18, BYTE=19, CHAR=20, DOUBLE=21, CONFORMIFEQUAL=22, DERIVEALWAYS=23, 
		DERIVEIFNOTEQUAL=24, TERMINATEIFNOTEQUAL=25, TERMINATE=26, OVERRIDE=27, 
		EVALUATE=28, EXPLODE=29, DROP=30, ELSE=31, FLOAT=32, FOR=33, IF=34, INT=35, 
		JOIN=36, LIST=37, LONG=38, MERGE=39, NODE=40, ON=41, RECOGNIZE=42, SHORT=43, 
		STRING=44, PATH=45, TREE=46, UNION=47, SELECT=48, FROM=49, WHERE=50, ORDERBY=51, 
		ASSIGN=52, GT=53, LT=54, BANG=55, TILDE=56, QUESTION=57, COLON=58, EQUAL=59, 
		LE=60, GE=61, NOTEQUAL=62, AND=63, OR=64, INC=65, DEC=66, ADD=67, SUB=68, 
		MUL=69, DIV=70, BITAND=71, BITOR=72, CARET=73, MOD=74, ADD_ASSIGN=75, 
		SUB_ASSIGN=76, MUL_ASSIGN=77, DIV_ASSIGN=78, AND_ASSIGN=79, OR_ASSIGN=80, 
		XOR_ASSIGN=81, MOD_ASSIGN=82, LSHIFT_ASSIGN=83, RSHIFT_ASSIGN=84, URSHIFT_ASSIGN=85, 
		VAR_NAME=86, CHARACTER=87, ESCAPE_CHARACTER=88, WS=89;
	public static final int
		RULE_stats = 0, RULE_definition = 1, RULE_treeQuery = 2, RULE_selectQuery = 3, 
		RULE_joinQuery = 4, RULE_mergeQuery = 5, RULE_conflictspec = 6, RULE_explodeQuery = 7, 
		RULE_rangeVariableDeclaration = 8, RULE_abstractTreeName = 9, RULE_expressions = 10, 
		RULE_selectorCondition = 11, RULE_expression = 12, RULE_booleanExpression = 13, 
		RULE_treeExpression = 14, RULE_stringExpression = 15, RULE_numberExpression = 16, 
		RULE_typeType = 17, RULE_primitiveType = 18, RULE_complexType = 19, RULE_booleanLiteral = 20, 
		RULE_comparisonOperator = 21, RULE_stringLiteral = 22;
	public static final String[] ruleNames = {
		"stats", "definition", "treeQuery", "selectQuery", "joinQuery", "mergeQuery", 
		"conflictspec", "explodeQuery", "rangeVariableDeclaration", "abstractTreeName", 
		"expressions", "selectorCondition", "expression", "booleanExpression", 
		"treeExpression", "stringExpression", "numberExpression", "typeType", 
		"primitiveType", "complexType", "booleanLiteral", "comparisonOperator", 
		"stringLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'<>'", "'''", "'\\'", "'\"'", null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'as'", "'boolean'", 
		"'byte'", "'char'", "'double'", "'conformifequal'", "'derivealways'", 
		"'deriveifequal'", "'terminateifnotequal'", "'terminate'", "'override'", 
		"'evaluate'", "'explode'", "'drop'", "'else'", "'float'", "'for'", "'if'", 
		"'int'", "'join'", "'list'", "'long'", "'merge'", "'node'", "'on'", "'recognize'", 
		"'short'", "'String'", "'Path'", "'Tree'", "'union'", "'select'", "'from'", 
		"'where'", "'orderby'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ALIAS", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "AS", 
		"BOOLEAN", "BYTE", "CHAR", "DOUBLE", "CONFORMIFEQUAL", "DERIVEALWAYS", 
		"DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", "TERMINATE", "OVERRIDE", "EVALUATE", 
		"EXPLODE", "DROP", "ELSE", "FLOAT", "FOR", "IF", "INT", "JOIN", "LIST", 
		"LONG", "MERGE", "NODE", "ON", "RECOGNIZE", "SHORT", "STRING", "PATH", 
		"TREE", "UNION", "SELECT", "FROM", "WHERE", "ORDERBY", "ASSIGN", "GT", 
		"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
		"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", 
		"WS"
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
	public static class StatsContext extends ParserRuleContext {
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << NODE) | (1L << SHORT) | (1L << STRING) | (1L << TREE))) != 0)) {
				{
				{
				setState(46);
				definition();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(treeqlParser.VAR_NAME, 0); }
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
			match(VAR_NAME);
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
		public RangeVariableDeclarationContext rangeVariableDeclaration() {
			return getRuleContext(RangeVariableDeclarationContext.class,0);
		}
		public TreeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeQuery; }
	}

	public final TreeQueryContext treeQuery() throws RecognitionException {
		TreeQueryContext _localctx = new TreeQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_treeQuery);
		try {
			setState(67);
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
			case VAR_NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				rangeVariableDeclaration();
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
			setState(69);
			match(SELECT);
			setState(70);
			treeExpression();
			setState(71);
			match(FROM);
			setState(72);
			treeQuery();
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(73);
				match(WHERE);
				setState(74);
				selectorCondition();
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
			setState(77);
			match(JOIN);
			setState(78);
			treeQuery();
			setState(79);
			match(COMMA);
			setState(80);
			treeQuery();
			setState(81);
			match(ON);
			setState(82);
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
			setState(84);
			match(MERGE);
			setState(85);
			treeQuery();
			setState(86);
			match(COMMA);
			setState(87);
			treeQuery();
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(88);
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
			setState(91);
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
			setState(93);
			match(EXPLODE);
			setState(94);
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

	public static class RangeVariableDeclarationContext extends ParserRuleContext {
		public AbstractTreeNameContext abstractTreeName() {
			return getRuleContext(AbstractTreeNameContext.class,0);
		}
		public List<TerminalNode> AS() { return getTokens(treeqlParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(treeqlParser.AS, i);
		}
		public List<TerminalNode> ALIAS() { return getTokens(treeqlParser.ALIAS); }
		public TerminalNode ALIAS(int i) {
			return getToken(treeqlParser.ALIAS, i);
		}
		public RangeVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeVariableDeclaration; }
	}

	public final RangeVariableDeclarationContext rangeVariableDeclaration() throws RecognitionException {
		RangeVariableDeclarationContext _localctx = new RangeVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rangeVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			abstractTreeName();
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(AS);
				setState(98);
				match(ALIAS);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AS );
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

	public static class AbstractTreeNameContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(treeqlParser.VAR_NAME, 0); }
		public AbstractTreeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractTreeName; }
	}

	public final AbstractTreeNameContext abstractTreeName() throws RecognitionException {
		AbstractTreeNameContext _localctx = new AbstractTreeNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_abstractTreeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(VAR_NAME);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressions);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					match(DOT);
					setState(110);
					expressions(3);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 22, RULE_selectorCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				treeExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public List<TreeExpressionContext> treeExpression() {
			return getRuleContexts(TreeExpressionContext.class);
		}
		public TreeExpressionContext treeExpression(int i) {
			return getRuleContext(TreeExpressionContext.class,i);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			treeExpression();
			setState(123);
			match(EQUAL);
			setState(124);
			booleanLiteral();
			setState(125);
			treeExpression();
			setState(126);
			comparisonOperator();
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(127);
				treeExpression();
				}
				break;
			case 2:
				{
				setState(128);
				stringExpression();
				}
				break;
			case 3:
				{
				setState(129);
				numberExpression();
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

	public static class TreeExpressionContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(treeqlParser.VAR_NAME, 0); }
		public AbstractTreeNameContext abstractTreeName() {
			return getRuleContext(AbstractTreeNameContext.class,0);
		}
		public TreeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeExpression; }
	}

	public final TreeExpressionContext treeExpression() throws RecognitionException {
		TreeExpressionContext _localctx = new TreeExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_treeExpression);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(VAR_NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				abstractTreeName();
				setState(135);
				match(DOT);
				setState(136);
				match(VAR_NAME);
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

	public static class StringExpressionContext extends ParserRuleContext {
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringExpression);
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

	public static class NumberExpressionContext extends ParserRuleContext {
		public NumberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberExpression; }
	}

	public final NumberExpressionContext numberExpression() throws RecognitionException {
		NumberExpressionContext _localctx = new NumberExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numberExpression);
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
		enterRule(_localctx, 34, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case NODE:
			case STRING:
			case TREE:
				{
				setState(144);
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
				setState(145);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(148);
				match(LBRACK);
				setState(149);
				match(RBRACK);
				}
				}
				setState(154);
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
		enterRule(_localctx, 36, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 38, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
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

	public static class StringLiteralContext extends ParserRuleContext {
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			match(T__3);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__4 || _la==T__5) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(170);
			match(T__3);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\6\nf\n\n\r\n\16\ng\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\fr\n\f\f\f"+
		"\16\fu\13\f\3\r\3\r\3\16\3\16\5\16{\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0085\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008d\n"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u0095\n\23\3\23\3\23\7\23\u0099"+
		"\n\23\f\23\16\23\u009c\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\7\30\u00a8\n\30\f\30\16\30\u00ab\13\30\3\30\3\30\3\30\2\3\26"+
		"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\b\3\2\30\36\7\2"+
		"\24\27\"\"%%((--\6\2\'\'**..\60\60\3\2\3\4\5\2\5\5\668>?\3\2\7\b\2\u00a8"+
		"\2\63\3\2\2\2\48\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nO\3\2\2\2\fV\3\2\2\2\16"+
		"]\3\2\2\2\20_\3\2\2\2\22b\3\2\2\2\24i\3\2\2\2\26k\3\2\2\2\30v\3\2\2\2"+
		"\32z\3\2\2\2\34|\3\2\2\2\36\u008c\3\2\2\2 \u008e\3\2\2\2\"\u0090\3\2\2"+
		"\2$\u0094\3\2\2\2&\u009d\3\2\2\2(\u009f\3\2\2\2*\u00a1\3\2\2\2,\u00a3"+
		"\3\2\2\2.\u00a5\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\5\6\4\2\67\3"+
		"\3\2\2\289\5$\23\29:\7X\2\2:;\7\20\2\2;\5\3\2\2\2<F\5\b\5\2=F\5\n\6\2"+
		">F\5\f\7\2?@\5\20\t\2@A\7\n\2\2AB\5\6\4\2BC\7\13\2\2CF\3\2\2\2DF\5\22"+
		"\n\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2E?\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\7"+
		"\62\2\2HI\5\36\20\2IJ\7\63\2\2JM\5\6\4\2KL\7\64\2\2LN\5\30\r\2MK\3\2\2"+
		"\2MN\3\2\2\2N\t\3\2\2\2OP\7&\2\2PQ\5\6\4\2QR\7\21\2\2RS\5\6\4\2ST\7+\2"+
		"\2TU\5\30\r\2U\13\3\2\2\2VW\7)\2\2WX\5\6\4\2XY\7\21\2\2Y[\5\6\4\2Z\\\5"+
		"\16\b\2[Z\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2]^\t\2\2\2^\17\3\2\2\2_`\7\37"+
		"\2\2`a\5\6\4\2a\21\3\2\2\2be\5\24\13\2cd\7\23\2\2df\7\t\2\2ec\3\2\2\2"+
		"fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\23\3\2\2\2ij\7X\2\2j\25\3\2\2\2kl\b\f"+
		"\1\2lm\5\32\16\2ms\3\2\2\2no\f\4\2\2op\7\22\2\2pr\5\26\f\5qn\3\2\2\2r"+
		"u\3\2\2\2sq\3\2\2\2st\3\2\2\2t\27\3\2\2\2us\3\2\2\2vw\5\34\17\2w\31\3"+
		"\2\2\2x{\5\36\20\2y{\5 \21\2zx\3\2\2\2zy\3\2\2\2{\33\3\2\2\2|}\5\36\20"+
		"\2}~\7=\2\2~\177\5*\26\2\177\u0080\5\36\20\2\u0080\u0084\5,\27\2\u0081"+
		"\u0085\5\36\20\2\u0082\u0085\5 \21\2\u0083\u0085\5\"\22\2\u0084\u0081"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\35\3\2\2\2\u0086"+
		"\u008d\7G\2\2\u0087\u008d\7X\2\2\u0088\u0089\5\24\13\2\u0089\u008a\7\22"+
		"\2\2\u008a\u008b\7X\2\2\u008b\u008d\3\2\2\2\u008c\u0086\3\2\2\2\u008c"+
		"\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008d\37\3\2\2\2\u008e\u008f\3\2\2"+
		"\2\u008f!\3\2\2\2\u0090\u0091\3\2\2\2\u0091#\3\2\2\2\u0092\u0095\5(\25"+
		"\2\u0093\u0095\5&\24\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u009a"+
		"\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0099\7\17\2\2\u0098\u0096\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b%\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\t\3\2\2\u009e\'\3\2\2\2\u009f\u00a0"+
		"\t\4\2\2\u00a0)\3\2\2\2\u00a1\u00a2\t\5\2\2\u00a2+\3\2\2\2\u00a3\u00a4"+
		"\t\6\2\2\u00a4-\3\2\2\2\u00a5\u00a9\7\6\2\2\u00a6\u00a8\n\7\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad"+
		"/\3\2\2\2\16\63EM[gsz\u0084\u008c\u0094\u009a\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}