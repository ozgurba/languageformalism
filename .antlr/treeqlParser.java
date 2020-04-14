// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism\TreeQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TreeQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, STRING_LITERAL=6, NUMERIC_LITERAL=7, 
		LPAREN=8, RPAREN=9, LBRACE=10, RBRACE=11, LBRACK=12, RBRACK=13, SEMI=14, 
		COMMA=15, DOT=16, AS=17, BOOLEAN=18, BYTE=19, CHAR=20, DOUBLE=21, CONFORMIFEQUAL=22, 
		DERIVEALWAYS=23, DERIVEIFNOTEQUAL=24, TERMINATEIFNOTEQUAL=25, TERMINATE=26, 
		OVERRIDE=27, EVALUATE=28, EXPLODE=29, DROP=30, ELSE=31, FLOAT=32, FOR=33, 
		IF=34, INT=35, JOIN=36, LONG=37, MERGE=38, ON=39, RECOGNIZE=40, SHORT=41, 
		STRING=42, PATH=43, TREE=44, UNION=45, SELECT=46, FROM=47, WHERE=48, ORDERBY=49, 
		ASSIGN=50, GT=51, LT=52, BANG=53, TILDE=54, QUESTION=55, COLON=56, EQUAL=57, 
		LE=58, GE=59, NOTEQUAL=60, AND=61, OR=62, INC=63, DEC=64, ADD=65, SUB=66, 
		DIV=67, BITAND=68, BITOR=69, CARET=70, MOD=71, STAR=72, ADD_ASSIGN=73, 
		SUB_ASSIGN=74, MUL_ASSIGN=75, DIV_ASSIGN=76, AND_ASSIGN=77, OR_ASSIGN=78, 
		XOR_ASSIGN=79, MOD_ASSIGN=80, LSHIFT_ASSIGN=81, RSHIFT_ASSIGN=82, URSHIFT_ASSIGN=83, 
		VAR_NAME=84, CHARACTER=85, ESCAPE_CHARACTER=86, WS=87, COMMENT=88;
	public static final int
		RULE_stats = 0, RULE_definition = 1, RULE_assignmentExpr = 2, RULE_treeQuery = 3, 
		RULE_selectQuery = 4, RULE_joinQuery = 5, RULE_mergeQuery = 6, RULE_conflictspec = 7, 
		RULE_explodeQuery = 8, RULE_rangeVariableDeclaration = 9, RULE_abstractTreeName = 10, 
		RULE_expressions = 11, RULE_selectorCondition = 12, RULE_expression = 13, 
		RULE_booleanExpression = 14, RULE_treeExpression = 15, RULE_treeElement = 16, 
		RULE_stringExpression = 17, RULE_numberExpression = 18, RULE_typeType = 19, 
		RULE_primitiveType = 20, RULE_complexType = 21, RULE_json = 22, RULE_json_value = 23, 
		RULE_obj = 24, RULE_pair = 25, RULE_arr = 26, RULE_booleanLiteral = 27, 
		RULE_comparisonOperator = 28, RULE_signed_number = 29;
	public static final String[] ruleNames = {
		"stats", "definition", "assignmentExpr", "treeQuery", "selectQuery", "joinQuery", 
		"mergeQuery", "conflictspec", "explodeQuery", "rangeVariableDeclaration", 
		"abstractTreeName", "expressions", "selectorCondition", "expression", 
		"booleanExpression", "treeExpression", "treeElement", "stringExpression", 
		"numberExpression", "typeType", "primitiveType", "complexType", "json", 
		"json_value", "obj", "pair", "arr", "booleanLiteral", "comparisonOperator", 
		"signed_number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'<>'", null, null, null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'as'", "'boolean'", 
		"'byte'", "'char'", "'double'", "'conform if equal'", "'derive always'", 
		"'derive if equal'", "'terminate if not equal'", "'terminate'", "'override'", 
		"'evaluate'", "'explode'", "'drop'", "'else'", "'float'", "'for'", "'if'", 
		"'int'", "'join'", "'long'", "'merge'", "'on'", "'recognize'", "'short'", 
		"'String'", "'Path'", "'Tree'", "'union'", "'select'", "'from'", "'where'", 
		"'orderby'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'/'", "'&'", "'|'", "'^'", "'%'", "'*'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NUMBER", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "AS", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "CONFORMIFEQUAL", "DERIVEALWAYS", 
		"DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", "TERMINATE", "OVERRIDE", "EVALUATE", 
		"EXPLODE", "DROP", "ELSE", "FLOAT", "FOR", "IF", "INT", "JOIN", "LONG", 
		"MERGE", "ON", "RECOGNIZE", "SHORT", "STRING", "PATH", "TREE", "UNION", 
		"SELECT", "FROM", "WHERE", "ORDERBY", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
		"DEC", "ADD", "SUB", "DIV", "BITAND", "BITOR", "CARET", "MOD", "STAR", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "TreeQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TreeQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatsContext extends ParserRuleContext {
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TreeQLParser.EOF, 0); }
		public TerminalNode COMMENT() { return getToken(TreeQLParser.COMMENT, 0); }
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(60);
				match(COMMENT);
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << TREE))) != 0)) {
				{
				{
				setState(63);
				definition();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			treeQuery();
			setState(70);
			match(EOF);
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
		public TerminalNode VAR_NAME() { return getToken(TreeQLParser.VAR_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(TreeQLParser.ASSIGN, 0); }
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			typeType();
			setState(73);
			match(VAR_NAME);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(74);
				match(ASSIGN);
				setState(75);
				assignmentExpr();
				}
			}

			setState(78);
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

	public static class AssignmentExprContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(TreeQLParser.STRING_LITERAL, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignmentExpr);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				booleanLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				signed_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				json();
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
		public TerminalNode LPAREN() { return getToken(TreeQLParser.LPAREN, 0); }
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TreeQLParser.RPAREN, 0); }
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
		enterRule(_localctx, 6, RULE_treeQuery);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				selectQuery();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				joinQuery();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				mergeQuery();
				}
				break;
			case EXPLODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				explodeQuery();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(LPAREN);
				setState(91);
				treeQuery();
				setState(92);
				match(RPAREN);
				}
				break;
			case VAR_NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
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
		public TerminalNode SELECT() { return getToken(TreeQLParser.SELECT, 0); }
		public TreeExpressionContext treeExpression() {
			return getRuleContext(TreeExpressionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TreeQLParser.FROM, 0); }
		public TreeQueryContext treeQuery() {
			return getRuleContext(TreeQueryContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(TreeQLParser.WHERE, 0); }
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
		enterRule(_localctx, 8, RULE_selectQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SELECT);
			setState(98);
			treeExpression();
			setState(99);
			match(FROM);
			setState(100);
			treeQuery();
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(101);
				match(WHERE);
				setState(102);
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
		public TerminalNode JOIN() { return getToken(TreeQLParser.JOIN, 0); }
		public List<TreeQueryContext> treeQuery() {
			return getRuleContexts(TreeQueryContext.class);
		}
		public TreeQueryContext treeQuery(int i) {
			return getRuleContext(TreeQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TreeQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TreeQLParser.COMMA, i);
		}
		public List<TerminalNode> ON() { return getTokens(TreeQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(TreeQLParser.ON, i);
		}
		public List<SelectorConditionContext> selectorCondition() {
			return getRuleContexts(SelectorConditionContext.class);
		}
		public SelectorConditionContext selectorCondition(int i) {
			return getRuleContext(SelectorConditionContext.class,i);
		}
		public JoinQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinQuery; }
	}

	public final JoinQueryContext joinQuery() throws RecognitionException {
		JoinQueryContext _localctx = new JoinQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_joinQuery);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(JOIN);
			setState(106);
			treeQuery();
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107);
					match(COMMA);
					setState(108);
					treeQuery();
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(109);
						match(ON);
						setState(110);
						selectorCondition();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class MergeQueryContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(TreeQLParser.MERGE, 0); }
		public List<TreeQueryContext> treeQuery() {
			return getRuleContexts(TreeQueryContext.class);
		}
		public TreeQueryContext treeQuery(int i) {
			return getRuleContext(TreeQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TreeQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TreeQLParser.COMMA, i);
		}
		public List<TerminalNode> ON() { return getTokens(TreeQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(TreeQLParser.ON, i);
		}
		public List<SelectorConditionContext> selectorCondition() {
			return getRuleContexts(SelectorConditionContext.class);
		}
		public SelectorConditionContext selectorCondition(int i) {
			return getRuleContext(SelectorConditionContext.class,i);
		}
		public List<ConflictspecContext> conflictspec() {
			return getRuleContexts(ConflictspecContext.class);
		}
		public ConflictspecContext conflictspec(int i) {
			return getRuleContext(ConflictspecContext.class,i);
		}
		public MergeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeQuery; }
	}

	public final MergeQueryContext mergeQuery() throws RecognitionException {
		MergeQueryContext _localctx = new MergeQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mergeQuery);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(MERGE);
			setState(118);
			treeQuery();
			setState(128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					treeQuery();
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(121);
						match(ON);
						setState(122);
						selectorCondition();
						}
						break;
					}
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(125);
						conflictspec();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ConflictspecContext extends ParserRuleContext {
		public TerminalNode CONFORMIFEQUAL() { return getToken(TreeQLParser.CONFORMIFEQUAL, 0); }
		public TerminalNode DERIVEALWAYS() { return getToken(TreeQLParser.DERIVEALWAYS, 0); }
		public TerminalNode DERIVEIFNOTEQUAL() { return getToken(TreeQLParser.DERIVEIFNOTEQUAL, 0); }
		public TerminalNode TERMINATEIFNOTEQUAL() { return getToken(TreeQLParser.TERMINATEIFNOTEQUAL, 0); }
		public TerminalNode TERMINATE() { return getToken(TreeQLParser.TERMINATE, 0); }
		public TerminalNode OVERRIDE() { return getToken(TreeQLParser.OVERRIDE, 0); }
		public TerminalNode EVALUATE() { return getToken(TreeQLParser.EVALUATE, 0); }
		public ConflictspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflictspec; }
	}

	public final ConflictspecContext conflictspec() throws RecognitionException {
		ConflictspecContext _localctx = new ConflictspecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conflictspec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		public TerminalNode EXPLODE() { return getToken(TreeQLParser.EXPLODE, 0); }
		public TerminalNode LPAREN() { return getToken(TreeQLParser.LPAREN, 0); }
		public TreeExpressionContext treeExpression() {
			return getRuleContext(TreeExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TreeQLParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TreeQLParser.RPAREN, 0); }
		public ExplodeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explodeQuery; }
	}

	public final ExplodeQueryContext explodeQuery() throws RecognitionException {
		ExplodeQueryContext _localctx = new ExplodeQueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_explodeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(EXPLODE);
			setState(135);
			match(LPAREN);
			setState(136);
			treeExpression();
			setState(137);
			match(COMMA);
			setState(138);
			expression();
			setState(139);
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

	public static class RangeVariableDeclarationContext extends ParserRuleContext {
		public AbstractTreeNameContext abstractTreeName() {
			return getRuleContext(AbstractTreeNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TreeQLParser.AS, 0); }
		public TerminalNode VAR_NAME() { return getToken(TreeQLParser.VAR_NAME, 0); }
		public RangeVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeVariableDeclaration; }
	}

	public final RangeVariableDeclarationContext rangeVariableDeclaration() throws RecognitionException {
		RangeVariableDeclarationContext _localctx = new RangeVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rangeVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			abstractTreeName();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(142);
				match(AS);
				setState(143);
				match(VAR_NAME);
				}
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

	public static class AbstractTreeNameContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(TreeQLParser.VAR_NAME, 0); }
		public AbstractTreeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractTreeName; }
	}

	public final AbstractTreeNameContext abstractTreeName() throws RecognitionException {
		AbstractTreeNameContext _localctx = new AbstractTreeNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_abstractTreeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressions);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				expression();
				setState(149);
				match(DOT);
				setState(150);
				expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expression();
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

	public static class SelectorConditionContext extends ParserRuleContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_selectorCondition);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				expressions();
				setState(156);
				comparisonOperator();
				setState(157);
				expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				booleanExpression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TreeExpressionContext treeExpression() {
			return getRuleContext(TreeExpressionContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				treeExpression();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				stringExpression();
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				numberExpression();
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				booleanExpression();
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			booleanLiteral();
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
		public List<TerminalNode> VAR_NAME() { return getTokens(TreeQLParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(TreeQLParser.VAR_NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TreeQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TreeQLParser.COMMA, i);
		}
		public TerminalNode STAR() { return getToken(TreeQLParser.STAR, 0); }
		public List<TreeElementContext> treeElement() {
			return getRuleContexts(TreeElementContext.class);
		}
		public TreeElementContext treeElement(int i) {
			return getRuleContext(TreeElementContext.class,i);
		}
		public TreeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeExpression; }
	}

	public final TreeExpressionContext treeExpression() throws RecognitionException {
		TreeExpressionContext _localctx = new TreeExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_treeExpression);
		int _la;
		try {
			int _alt;
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(VAR_NAME);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						match(COMMA);
						setState(172);
						match(VAR_NAME);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(178);
					match(STAR);
					}
					break;
				case VAR_NAME:
					{
					setState(179);
					treeElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR_NAME) {
					{
					{
					setState(182);
					treeElement();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TreeElementContext extends ParserRuleContext {
		public AbstractTreeNameContext abstractTreeName() {
			return getRuleContext(AbstractTreeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TreeQLParser.DOT, 0); }
		public TerminalNode VAR_NAME() { return getToken(TreeQLParser.VAR_NAME, 0); }
		public TerminalNode STAR() { return getToken(TreeQLParser.STAR, 0); }
		public TreeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeElement; }
	}

	public final TreeElementContext treeElement() throws RecognitionException {
		TreeElementContext _localctx = new TreeElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_treeElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			abstractTreeName();
			setState(191);
			match(DOT);
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==VAR_NAME) ) {
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

	public static class StringExpressionContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(TreeQLParser.STRING_LITERAL, 0); }
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(STRING_LITERAL);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(TreeQLParser.NUMERIC_LITERAL, 0); }
		public NumberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberExpression; }
	}

	public final NumberExpressionContext numberExpression() throws RecognitionException {
		NumberExpressionContext _localctx = new NumberExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(NUMERIC_LITERAL);
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
		enterRule(_localctx, 38, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case TREE:
				{
				setState(198);
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
				setState(199);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(202);
				match(LBRACK);
				setState(203);
				match(RBRACK);
				}
				}
				setState(208);
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
		public TerminalNode BOOLEAN() { return getToken(TreeQLParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(TreeQLParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(TreeQLParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(TreeQLParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(TreeQLParser.INT, 0); }
		public TerminalNode LONG() { return getToken(TreeQLParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(TreeQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(TreeQLParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		public TerminalNode TREE() { return getToken(TreeQLParser.TREE, 0); }
		public TerminalNode STRING() { return getToken(TreeQLParser.STRING, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==TREE) ) {
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

	public static class JsonContext extends ParserRuleContext {
		public Json_valueContext json_value() {
			return getRuleContext(Json_valueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			json_value();
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

	public static class Json_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(TreeQLParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(TreeQLParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public Json_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_value; }
	}

	public final Json_valueContext json_value() throws RecognitionException {
		Json_valueContext _localctx = new Json_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_json_value);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(STRING_LITERAL);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(NUMBER);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				obj();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				arr();
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				booleanLiteral();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				match(T__0);
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

	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_obj);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(LBRACE);
				setState(224);
				pair();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(225);
					match(COMMA);
					setState(226);
					pair();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(LBRACE);
				setState(235);
				match(RBRACE);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(TreeQLParser.STRING_LITERAL, 0); }
		public Json_valueContext json_value() {
			return getRuleContext(Json_valueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(STRING_LITERAL);
			setState(239);
			match(COLON);
			setState(240);
			json_value();
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

	public static class ArrContext extends ParserRuleContext {
		public List<Json_valueContext> json_value() {
			return getRuleContexts(Json_valueContext.class);
		}
		public Json_valueContext json_value(int i) {
			return getRuleContext(Json_valueContext.class,i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arr);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(LBRACK);
				setState(243);
				json_value();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					json_value();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(LBRACK);
				setState(254);
				match(RBRACK);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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
		enterRule(_localctx, 56, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(TreeQLParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(264);
			match(NUMERIC_LITERAL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"+
		"\n\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3O\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"r\n\7\6\7t\n\7\r\7\16\7u\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\5\b\u0081"+
		"\n\b\6\b\u0083\n\b\r\b\16\b\u0084\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u009c"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00a9\n\17\3\20\3\20\3\21\3\21\3\21\7\21\u00b0\n\21\f\21\16\21\u00b3"+
		"\13\21\3\21\3\21\5\21\u00b7\n\21\3\21\7\21\u00ba\n\21\f\21\16\21\u00bd"+
		"\13\21\5\21\u00bf\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\5\25\u00cb\n\25\3\25\3\25\7\25\u00cf\n\25\f\25\16\25\u00d2\13\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e0"+
		"\n\31\3\32\3\32\3\32\3\32\7\32\u00e6\n\32\f\32\16\32\u00e9\13\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00ef\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\7\34\u00f9\n\34\f\34\16\34\u00fc\13\34\3\34\3\34\3\34\3\34\5\34\u0102"+
		"\n\34\3\35\3\35\3\36\3\36\3\37\5\37\u0109\n\37\3\37\3\37\3\37\2\2 \2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t\3\2\30"+
		"\36\4\2JJVV\7\2\24\27\"\"%%\'\'++\4\2,,..\3\2\4\5\5\2\6\6\65\66;>\3\2"+
		"CD\2\u0115\2?\3\2\2\2\4J\3\2\2\2\6V\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fk\3"+
		"\2\2\2\16w\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\u008f\3\2\2\2"+
		"\26\u0094\3\2\2\2\30\u009b\3\2\2\2\32\u00a2\3\2\2\2\34\u00a8\3\2\2\2\36"+
		"\u00aa\3\2\2\2 \u00be\3\2\2\2\"\u00c0\3\2\2\2$\u00c4\3\2\2\2&\u00c6\3"+
		"\2\2\2(\u00ca\3\2\2\2*\u00d3\3\2\2\2,\u00d5\3\2\2\2.\u00d7\3\2\2\2\60"+
		"\u00df\3\2\2\2\62\u00ee\3\2\2\2\64\u00f0\3\2\2\2\66\u0101\3\2\2\28\u0103"+
		"\3\2\2\2:\u0105\3\2\2\2<\u0108\3\2\2\2>@\7Z\2\2?>\3\2\2\2?@\3\2\2\2@D"+
		"\3\2\2\2AC\5\4\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F"+
		"D\3\2\2\2GH\5\b\5\2HI\7\2\2\3I\3\3\2\2\2JK\5(\25\2KN\7V\2\2LM\7\64\2\2"+
		"MO\5\6\4\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\20\2\2Q\5\3\2\2\2RW\7\b\2"+
		"\2SW\58\35\2TW\5<\37\2UW\5.\30\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2"+
		"\2W\7\3\2\2\2Xb\5\n\6\2Yb\5\f\7\2Zb\5\16\b\2[b\5\22\n\2\\]\7\n\2\2]^\5"+
		"\b\5\2^_\7\13\2\2_b\3\2\2\2`b\5\24\13\2aX\3\2\2\2aY\3\2\2\2aZ\3\2\2\2"+
		"a[\3\2\2\2a\\\3\2\2\2a`\3\2\2\2b\t\3\2\2\2cd\7\60\2\2de\5 \21\2ef\7\61"+
		"\2\2fi\5\b\5\2gh\7\62\2\2hj\5\32\16\2ig\3\2\2\2ij\3\2\2\2j\13\3\2\2\2"+
		"kl\7&\2\2ls\5\b\5\2mn\7\21\2\2nq\5\b\5\2op\7)\2\2pr\5\32\16\2qo\3\2\2"+
		"\2qr\3\2\2\2rt\3\2\2\2sm\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\r\3\2"+
		"\2\2wx\7(\2\2x\u0082\5\b\5\2yz\7\21\2\2z}\5\b\5\2{|\7)\2\2|~\5\32\16\2"+
		"}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\5\20\t\2\u0080\177\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082y\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\17\3\2\2\2\u0086"+
		"\u0087\t\2\2\2\u0087\21\3\2\2\2\u0088\u0089\7\37\2\2\u0089\u008a\7\n\2"+
		"\2\u008a\u008b\5 \21\2\u008b\u008c\7\21\2\2\u008c\u008d\5\34\17\2\u008d"+
		"\u008e\7\13\2\2\u008e\23\3\2\2\2\u008f\u0092\5\26\f\2\u0090\u0091\7\23"+
		"\2\2\u0091\u0093\7V\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\25\3\2\2\2\u0094\u0095\7V\2\2\u0095\27\3\2\2\2\u0096\u0097\5\34\17\2"+
		"\u0097\u0098\7\22\2\2\u0098\u0099\5\30\r\2\u0099\u009c\3\2\2\2\u009a\u009c"+
		"\5\34\17\2\u009b\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\31\3\2\2\2\u009d"+
		"\u009e\5\30\r\2\u009e\u009f\5:\36\2\u009f\u00a0\5\30\r\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u00a3\5\36\20\2\u00a2\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\33\3\2\2\2\u00a4\u00a9\5 \21\2\u00a5\u00a9\5$\23\2\u00a6\u00a9\5&\24"+
		"\2\u00a7\u00a9\5\36\20\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\58\35"+
		"\2\u00ab\37\3\2\2\2\u00ac\u00b1\7V\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00b0"+
		"\7V\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00bf\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\7J"+
		"\2\2\u00b5\u00b7\5\"\22\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00bb\3\2\2\2\u00b8\u00ba\5\"\22\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00ac\3\2\2\2\u00be\u00b6\3\2\2\2\u00bf!\3\2\2\2"+
		"\u00c0\u00c1\5\26\f\2\u00c1\u00c2\7\22\2\2\u00c2\u00c3\t\3\2\2\u00c3#"+
		"\3\2\2\2\u00c4\u00c5\7\b\2\2\u00c5%\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7"+
		"\'\3\2\2\2\u00c8\u00cb\5,\27\2\u00c9\u00cb\5*\26\2\u00ca\u00c8\3\2\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\7\16\2\2\u00cd\u00cf"+
		"\7\17\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d0\u00d1\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\t"+
		"\4\2\2\u00d4+\3\2\2\2\u00d5\u00d6\t\5\2\2\u00d6-\3\2\2\2\u00d7\u00d8\5"+
		"\60\31\2\u00d8/\3\2\2\2\u00d9\u00e0\7\b\2\2\u00da\u00e0\7\7\2\2\u00db"+
		"\u00e0\5\62\32\2\u00dc\u00e0\5\66\34\2\u00dd\u00e0\58\35\2\u00de\u00e0"+
		"\7\3\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df"+
		"\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\61\3\2\2"+
		"\2\u00e1\u00e2\7\f\2\2\u00e2\u00e7\5\64\33\2\u00e3\u00e4\7\21\2\2\u00e4"+
		"\u00e6\5\64\33\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7\r\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ed\7\f\2\2\u00ed\u00ef\7\r"+
		"\2\2\u00ee\u00e1\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\63\3\2\2\2\u00f0\u00f1"+
		"\7\b\2\2\u00f1\u00f2\7:\2\2\u00f2\u00f3\5\60\31\2\u00f3\65\3\2\2\2\u00f4"+
		"\u00f5\7\16\2\2\u00f5\u00fa\5\60\31\2\u00f6\u00f7\7\21\2\2\u00f7\u00f9"+
		"\5\60\31\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe"+
		"\7\17\2\2\u00fe\u0102\3\2\2\2\u00ff\u0100\7\16\2\2\u0100\u0102\7\17\2"+
		"\2\u0101\u00f4\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\67\3\2\2\2\u0103\u0104"+
		"\t\6\2\2\u01049\3\2\2\2\u0105\u0106\t\7\2\2\u0106;\3\2\2\2\u0107\u0109"+
		"\t\b\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\7\t\2\2\u010b=\3\2\2\2\35?DNVaiqu}\u0080\u0084\u0092\u009b\u00a2"+
		"\u00a8\u00b1\u00b6\u00bb\u00be\u00ca\u00d0\u00df\u00e7\u00ee\u00fa\u0101"+
		"\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}