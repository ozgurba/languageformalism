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
		T__0=1, NUMBER=2, BOOLEAN_LITERAL=3, STRING_LITERAL=4, NUMERIC_LITERAL=5, 
		TRUE=6, FALSE=7, LPAREN=8, RPAREN=9, LBRACE=10, RBRACE=11, LBRACK=12, 
		RBRACK=13, SEMI=14, COMMA=15, DOT=16, AS=17, BOOLEAN=18, BYTE=19, CHAR=20, 
		DOUBLE=21, CONFORMIFEQUAL=22, DERIVEALWAYS=23, DERIVEIFNOTEQUAL=24, TERMINATEIFNOTEQUAL=25, 
		TERMINATE=26, OVERRIDE=27, EVALUATE=28, EXPLODE=29, DROP=30, FLOAT=31, 
		INT=32, JOIN=33, LONG=34, MERGE=35, ON=36, RECOGNIZE=37, SHORT=38, STRING=39, 
		PATH=40, TREE=41, UNION=42, SELECT=43, FROM=44, WHERE=45, ASSIGN=46, GT=47, 
		LT=48, BANG=49, TILDE=50, QUESTION=51, COLON=52, EQUAL=53, LE=54, GE=55, 
		NOTEQUAL=56, AND=57, OR=58, INC=59, DEC=60, ADD=61, SUB=62, DIV=63, MOD=64, 
		STAR=65, VAR_NAME=66, CHARACTER=67, ESCAPE_CHARACTER=68, WS=69, COMMENT=70;
	public static final int
		RULE_stats = 0, RULE_definition = 1, RULE_assignmentExpr = 2, RULE_treeQuery = 3, 
		RULE_selectQuery = 4, RULE_joinQuery = 5, RULE_mergeQuery = 6, RULE_conflictspec = 7, 
		RULE_explodeQuery = 8, RULE_rangeVariableDeclaration = 9, RULE_abstractTreeName = 10, 
		RULE_selectExpression = 11, RULE_expression = 12, RULE_booleanExpression = 13, 
		RULE_treeExpression = 14, RULE_treeElement = 15, RULE_typeType = 16, RULE_primitiveType = 17, 
		RULE_complexType = 18, RULE_json = 19, RULE_json_value = 20, RULE_obj = 21, 
		RULE_pair = 22, RULE_arr = 23, RULE_comparisonOperator = 24, RULE_signed_number = 25;
	public static final String[] ruleNames = {
		"stats", "definition", "assignmentExpr", "treeQuery", "selectQuery", "joinQuery", 
		"mergeQuery", "conflictspec", "explodeQuery", "rangeVariableDeclaration", 
		"abstractTreeName", "selectExpression", "expression", "booleanExpression", 
		"treeExpression", "treeElement", "typeType", "primitiveType", "complexType", 
		"json", "json_value", "obj", "pair", "arr", "comparisonOperator", "signed_number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", null, null, null, null, "'true'", "'false'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'as'", "'boolean'", 
		"'byte'", "'char'", "'double'", "'conform if equal'", "'derive always'", 
		"'derive if equal'", "'terminate if not equal'", "'terminate'", "'override'", 
		"'evaluate'", "'explode'", "'drop'", "'float'", "'int'", "'join'", "'long'", 
		"'merge'", "'on'", "'recognize'", "'short'", "'String'", "'Path'", "'Tree'", 
		"'union'", "'select'", "'from'", "'where'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'/'", "'%'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NUMBER", "BOOLEAN_LITERAL", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"TRUE", "FALSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "AS", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "CONFORMIFEQUAL", 
		"DERIVEALWAYS", "DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", "TERMINATE", 
		"OVERRIDE", "EVALUATE", "EXPLODE", "DROP", "FLOAT", "INT", "JOIN", "LONG", 
		"MERGE", "ON", "RECOGNIZE", "SHORT", "STRING", "PATH", "TREE", "UNION", 
		"SELECT", "FROM", "WHERE", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "DIV", "MOD", "STAR", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", 
		"WS", "COMMENT"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(52);
				match(COMMENT);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << TREE))) != 0)) {
				{
				{
				setState(55);
				definition();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			treeQuery();
			setState(62);
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
			setState(64);
			typeType();
			setState(65);
			match(VAR_NAME);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(66);
				match(ASSIGN);
				setState(67);
				assignmentExpr();
				}
			}

			setState(70);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TreeQLParser.BOOLEAN_LITERAL, 0); }
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				signed_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				selectQuery();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				joinQuery();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				mergeQuery();
				}
				break;
			case EXPLODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				explodeQuery();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(LPAREN);
				setState(83);
				treeQuery();
				setState(84);
				match(RPAREN);
				}
				break;
			case VAR_NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
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
		public SelectExpressionContext selectExpression() {
			return getRuleContext(SelectExpressionContext.class,0);
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
			setState(89);
			match(SELECT);
			setState(90);
			treeExpression();
			setState(91);
			match(FROM);
			setState(92);
			treeQuery();
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(93);
				match(WHERE);
				setState(94);
				selectExpression();
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
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
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
			setState(97);
			match(JOIN);
			setState(98);
			treeQuery();
			setState(105); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					treeQuery();
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(101);
						match(ON);
						setState(102);
						selectExpression();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107); 
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
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
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
			setState(109);
			match(MERGE);
			setState(110);
			treeQuery();
			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					treeQuery();
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(113);
						match(ON);
						setState(114);
						selectExpression();
						}
						break;
					}
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(117);
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
				setState(122); 
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
			setState(124);
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
			setState(126);
			match(EXPLODE);
			setState(127);
			match(LPAREN);
			setState(128);
			treeExpression();
			setState(129);
			match(COMMA);
			setState(130);
			expression();
			setState(131);
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
			setState(133);
			abstractTreeName();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(134);
				match(AS);
				setState(135);
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
			setState(138);
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

	public static class SelectExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TreeQLParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TreeQLParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TreeQLParser.NUMERIC_LITERAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				treeExpression();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(BOOLEAN_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(NUMERIC_LITERAL);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TreeQLParser.BOOLEAN_LITERAL, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanExpression);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				expression();
				setState(149);
				comparisonOperator();
				setState(150);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(BOOLEAN_LITERAL);
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
		public TerminalNode STAR() { return getToken(TreeQLParser.STAR, 0); }
		public List<TreeElementContext> treeElement() {
			return getRuleContexts(TreeElementContext.class);
		}
		public TreeElementContext treeElement(int i) {
			return getRuleContext(TreeElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TreeQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TreeQLParser.COMMA, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(155);
				match(STAR);
				}
				break;
			case VAR_NAME:
				{
				setState(156);
				treeElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(COMMA);
					setState(160);
					treeElement();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class TreeElementContext extends ParserRuleContext {
		public AbstractTreeNameContext abstractTreeName() {
			return getRuleContext(AbstractTreeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TreeQLParser.DOT, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(TreeQLParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(TreeQLParser.VAR_NAME, i);
		}
		public TerminalNode STAR() { return getToken(TreeQLParser.STAR, 0); }
		public TerminalNode AS() { return getToken(TreeQLParser.AS, 0); }
		public TreeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeElement; }
	}

	public final TreeElementContext treeElement() throws RecognitionException {
		TreeElementContext _localctx = new TreeElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_treeElement);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				abstractTreeName();
				setState(167);
				match(DOT);
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==VAR_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(169);
					match(AS);
					setState(170);
					match(VAR_NAME);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(VAR_NAME);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(174);
					match(AS);
					setState(175);
					match(VAR_NAME);
					}
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
		enterRule(_localctx, 32, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case TREE:
				{
				setState(180);
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
				setState(181);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(184);
				match(LBRACK);
				setState(185);
				match(RBRACK);
				}
				}
				setState(190);
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
		enterRule(_localctx, 34, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 36, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 38, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TreeQLParser.BOOLEAN_LITERAL, 0); }
		public Json_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_value; }
	}

	public final Json_valueContext json_value() throws RecognitionException {
		Json_valueContext _localctx = new Json_valueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_json_value);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(STRING_LITERAL);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(NUMBER);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				obj();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				arr();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(BOOLEAN_LITERAL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
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
		enterRule(_localctx, 42, RULE_obj);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(LBRACE);
				setState(206);
				pair();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					match(COMMA);
					setState(208);
					pair();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(LBRACE);
				setState(217);
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
		enterRule(_localctx, 44, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(STRING_LITERAL);
			setState(221);
			match(COLON);
			setState(222);
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
		enterRule(_localctx, 46, RULE_arr);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(LBRACK);
				setState(225);
				json_value();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(226);
					match(COMMA);
					setState(227);
					json_value();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(LBRACK);
				setState(236);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(TreeQLParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(TreeQLParser.NOTEQUAL, 0); }
		public TerminalNode GT() { return getToken(TreeQLParser.GT, 0); }
		public TerminalNode GE() { return getToken(TreeQLParser.GE, 0); }
		public TerminalNode LT() { return getToken(TreeQLParser.LT, 0); }
		public TerminalNode LE() { return getToken(TreeQLParser.LE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(241);
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

			setState(244);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u00f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\5\28\n\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\6\7l\n\7\r\7\16\7m\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bv\n\b\3\b\5\by\n\b\6\b{\n\b\r\b\16\b|\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u009c\n\17\3"+
		"\20\3\20\5\20\u00a0\n\20\3\20\3\20\7\20\u00a4\n\20\f\20\16\20\u00a7\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\5\21\u00ae\n\21\3\21\3\21\3\21\5\21\u00b3"+
		"\n\21\5\21\u00b5\n\21\3\22\3\22\5\22\u00b9\n\22\3\22\3\22\7\22\u00bd\n"+
		"\22\f\22\16\22\u00c0\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00ce\n\26\3\27\3\27\3\27\3\27\7\27\u00d4\n\27\f"+
		"\27\16\27\u00d7\13\27\3\27\3\27\3\27\3\27\5\27\u00dd\n\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\7\31\u00e7\n\31\f\31\16\31\u00ea\13\31\3"+
		"\31\3\31\3\31\3\31\5\31\u00f0\n\31\3\32\3\32\3\33\5\33\u00f5\n\33\3\33"+
		"\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\b\3\2\30\36\3\2CD\6\2\24\27!\"$$((\4\2))++\4\2\61\62\67:\3\2?@\2"+
		"\u0105\2\67\3\2\2\2\4B\3\2\2\2\6N\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\fc\3\2"+
		"\2\2\16o\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2\2\24\u0087\3\2\2\2\26\u008c"+
		"\3\2\2\2\30\u008e\3\2\2\2\32\u0094\3\2\2\2\34\u009b\3\2\2\2\36\u009f\3"+
		"\2\2\2 \u00b4\3\2\2\2\"\u00b8\3\2\2\2$\u00c1\3\2\2\2&\u00c3\3\2\2\2(\u00c5"+
		"\3\2\2\2*\u00cd\3\2\2\2,\u00dc\3\2\2\2.\u00de\3\2\2\2\60\u00ef\3\2\2\2"+
		"\62\u00f1\3\2\2\2\64\u00f4\3\2\2\2\668\7H\2\2\67\66\3\2\2\2\678\3\2\2"+
		"\28<\3\2\2\29;\5\4\3\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2"+
		"\2><\3\2\2\2?@\5\b\5\2@A\7\2\2\3A\3\3\2\2\2BC\5\"\22\2CF\7D\2\2DE\7\60"+
		"\2\2EG\5\6\4\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\20\2\2I\5\3\2\2\2JO\7"+
		"\6\2\2KO\7\5\2\2LO\5\64\33\2MO\5(\25\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2N"+
		"M\3\2\2\2O\7\3\2\2\2PZ\5\n\6\2QZ\5\f\7\2RZ\5\16\b\2SZ\5\22\n\2TU\7\n\2"+
		"\2UV\5\b\5\2VW\7\13\2\2WZ\3\2\2\2XZ\5\24\13\2YP\3\2\2\2YQ\3\2\2\2YR\3"+
		"\2\2\2YS\3\2\2\2YT\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[\\\7-\2\2\\]\5\36\20\2"+
		"]^\7.\2\2^a\5\b\5\2_`\7/\2\2`b\5\30\r\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2"+
		"\2cd\7#\2\2dk\5\b\5\2ef\7\21\2\2fi\5\b\5\2gh\7&\2\2hj\5\30\r\2ig\3\2\2"+
		"\2ij\3\2\2\2jl\3\2\2\2ke\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\r\3\2"+
		"\2\2op\7%\2\2pz\5\b\5\2qr\7\21\2\2ru\5\b\5\2st\7&\2\2tv\5\30\r\2us\3\2"+
		"\2\2uv\3\2\2\2vx\3\2\2\2wy\5\20\t\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2zq\3"+
		"\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~\177\t\2\2\2\177\21\3"+
		"\2\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7\n\2\2\u0082\u0083\5\36\20\2"+
		"\u0083\u0084\7\21\2\2\u0084\u0085\5\32\16\2\u0085\u0086\7\13\2\2\u0086"+
		"\23\3\2\2\2\u0087\u008a\5\26\f\2\u0088\u0089\7\23\2\2\u0089\u008b\7D\2"+
		"\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c\u008d"+
		"\7D\2\2\u008d\27\3\2\2\2\u008e\u008f\5\34\17\2\u008f\31\3\2\2\2\u0090"+
		"\u0095\5\36\20\2\u0091\u0095\7\5\2\2\u0092\u0095\7\6\2\2\u0093\u0095\7"+
		"\7\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097\5\32\16\2\u0097\u0098\5\62"+
		"\32\2\u0098\u0099\5\32\16\2\u0099\u009c\3\2\2\2\u009a\u009c\7\5\2\2\u009b"+
		"\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\35\3\2\2\2\u009d\u00a0\7C\2\2"+
		"\u009e\u00a0\5 \21\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a5"+
		"\3\2\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a4\5 \21\2\u00a3\u00a1\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\37"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\26\f\2\u00a9\u00aa\7\22\2\2"+
		"\u00aa\u00ad\t\3\2\2\u00ab\u00ac\7\23\2\2\u00ac\u00ae\7D\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b5\3\2\2\2\u00af\u00b2\7D\2\2\u00b0"+
		"\u00b1\7\23\2\2\u00b1\u00b3\7D\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5"+
		"!\3\2\2\2\u00b6\u00b9\5&\24\2\u00b7\u00b9\5$\23\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bd"+
		"\7\17\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\t"+
		"\4\2\2\u00c2%\3\2\2\2\u00c3\u00c4\t\5\2\2\u00c4\'\3\2\2\2\u00c5\u00c6"+
		"\5*\26\2\u00c6)\3\2\2\2\u00c7\u00ce\7\6\2\2\u00c8\u00ce\7\4\2\2\u00c9"+
		"\u00ce\5,\27\2\u00ca\u00ce\5\60\31\2\u00cb\u00ce\7\5\2\2\u00cc\u00ce\7"+
		"\3\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce+\3\2\2\2"+
		"\u00cf\u00d0\7\f\2\2\u00d0\u00d5\5.\30\2\u00d1\u00d2\7\21\2\2\u00d2\u00d4"+
		"\5.\30\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\r"+
		"\2\2\u00d9\u00dd\3\2\2\2\u00da\u00db\7\f\2\2\u00db\u00dd\7\r\2\2\u00dc"+
		"\u00cf\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd-\3\2\2\2\u00de\u00df\7\6\2\2"+
		"\u00df\u00e0\7\66\2\2\u00e0\u00e1\5*\26\2\u00e1/\3\2\2\2\u00e2\u00e3\7"+
		"\16\2\2\u00e3\u00e8\5*\26\2\u00e4\u00e5\7\21\2\2\u00e5\u00e7\5*\26\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\17\2\2\u00ec"+
		"\u00f0\3\2\2\2\u00ed\u00ee\7\16\2\2\u00ee\u00f0\7\17\2\2\u00ef\u00e2\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\61\3\2\2\2\u00f1\u00f2\t\6\2\2\u00f2"+
		"\63\3\2\2\2\u00f3\u00f5\t\7\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2"+
		"\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\7\2\2\u00f7\65\3\2\2\2\35\67<FNY"+
		"aimux|\u008a\u0094\u009b\u009f\u00a5\u00ad\u00b2\u00b4\u00b8\u00be\u00cd"+
		"\u00d5\u00dc\u00e8\u00ef\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}