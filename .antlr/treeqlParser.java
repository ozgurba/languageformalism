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
		T__0=1, BOOLEAN_LITERAL=2, STRING_LITERAL=3, NUMERIC_LITERAL=4, TRUE=5, 
		FALSE=6, LPAREN=7, RPAREN=8, LBRACE=9, RBRACE=10, LBRACK=11, RBRACK=12, 
		SEMI=13, COMMA=14, DOT=15, AS=16, BOOLEAN=17, BYTE=18, CHAR=19, DOUBLE=20, 
		CONFORMIFEQUAL=21, DERIVEALWAYS=22, DERIVEIFNOTEQUAL=23, TERMINATEIFNOTEQUAL=24, 
		TERMINATE=25, OVERRIDE=26, EVALUATE=27, EXPLODE=28, DROP=29, FLOAT=30, 
		INT=31, JOIN=32, LONG=33, MERGE=34, ON=35, RECOGNIZE=36, SHORT=37, STRING=38, 
		PATH=39, TREE=40, UNION=41, SELECT=42, FROM=43, WHERE=44, ASSIGN=45, GT=46, 
		LT=47, BANG=48, TILDE=49, QUESTION=50, COLON=51, EQUAL=52, LE=53, GE=54, 
		NOTEQUAL=55, AND=56, OR=57, INC=58, DEC=59, ADD=60, SUB=61, DIV=62, MOD=63, 
		STAR=64, VAR_NAME=65, CHARACTER=66, ESCAPE_CHARACTER=67, WS=68, COMMENT=69;
	public static final int
		RULE_stats = 0, RULE_definition = 1, RULE_assignmentExpr = 2, RULE_treeQuery = 3, 
		RULE_selectQuery = 4, RULE_joinQuery = 5, RULE_mergeQuery = 6, RULE_conflictspec = 7, 
		RULE_explodeQuery = 8, RULE_rangeVariableDeclaration = 9, RULE_abstractTreeName = 10, 
		RULE_selectExpression = 11, RULE_expression = 12, RULE_booleanExpression = 13, 
		RULE_booleanOperand = 14, RULE_comparisonOperand = 15, RULE_mathOperand = 16, 
		RULE_treeExpression = 17, RULE_treeElement = 18, RULE_typeType = 19, RULE_primitiveType = 20, 
		RULE_complexType = 21, RULE_json = 22, RULE_json_value = 23, RULE_obj = 24, 
		RULE_pair = 25, RULE_arr = 26, RULE_mathOperator = 27, RULE_booleanOperator = 28, 
		RULE_comparisonOperator = 29, RULE_signed_number = 30;
	public static final String[] ruleNames = {
		"stats", "definition", "assignmentExpr", "treeQuery", "selectQuery", "joinQuery", 
		"mergeQuery", "conflictspec", "explodeQuery", "rangeVariableDeclaration", 
		"abstractTreeName", "selectExpression", "expression", "booleanExpression", 
		"booleanOperand", "comparisonOperand", "mathOperand", "treeExpression", 
		"treeElement", "typeType", "primitiveType", "complexType", "json", "json_value", 
		"obj", "pair", "arr", "mathOperator", "booleanOperator", "comparisonOperator", 
		"signed_number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", null, null, null, "'true'", "'false'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'as'", "'boolean'", "'byte'", 
		"'char'", "'double'", "'conform if equal'", "'derive always'", "'derive if equal'", 
		"'terminate if not equal'", "'terminate'", "'override'", "'evaluate'", 
		"'explode'", "'drop'", "'float'", "'int'", "'join'", "'long'", "'merge'", 
		"'on'", "'recognize'", "'short'", "'String'", "'Path'", "'Tree'", "'union'", 
		"'select'", "'from'", "'where'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
		"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'/'", "'%'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BOOLEAN_LITERAL", "STRING_LITERAL", "NUMERIC_LITERAL", "TRUE", 
		"FALSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "AS", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "CONFORMIFEQUAL", 
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(62);
				match(COMMENT);
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << TREE))) != 0)) {
				{
				{
				setState(65);
				definition();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			treeQuery();
			setState(72);
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
			setState(74);
			typeType();
			setState(75);
			match(VAR_NAME);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(76);
				match(ASSIGN);
				setState(77);
				assignmentExpr();
				}
			}

			setState(80);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				signed_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				selectQuery();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				joinQuery();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				mergeQuery();
				}
				break;
			case EXPLODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				explodeQuery();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(LPAREN);
				setState(92);
				treeQuery();
				setState(93);
				match(RPAREN);
				}
				break;
			case VAR_NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
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
			setState(98);
			match(SELECT);
			setState(99);
			treeExpression();
			setState(100);
			match(FROM);
			setState(101);
			treeQuery();
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(102);
				match(WHERE);
				setState(103);
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
			setState(106);
			match(JOIN);
			setState(107);
			treeQuery();
			setState(114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(108);
					match(COMMA);
					setState(109);
					treeQuery();
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(110);
						match(ON);
						setState(111);
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
				setState(116); 
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
			setState(118);
			match(MERGE);
			setState(119);
			treeQuery();
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					treeQuery();
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(122);
						match(ON);
						setState(123);
						selectExpression();
						}
						break;
					}
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(126);
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
				setState(131); 
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
			setState(133);
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
			setState(135);
			match(EXPLODE);
			setState(136);
			match(LPAREN);
			setState(137);
			treeExpression();
			setState(138);
			match(COMMA);
			setState(139);
			expression();
			setState(140);
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
			setState(142);
			abstractTreeName();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(143);
				match(AS);
				setState(144);
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
			setState(147);
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
			setState(149);
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				treeExpression();
				}
				break;
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
			case LPAREN:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		public List<BooleanOperandContext> booleanOperand() {
			return getRuleContexts(BooleanOperandContext.class);
		}
		public BooleanOperandContext booleanOperand(int i) {
			return getRuleContext(BooleanOperandContext.class,i);
		}
		public List<BooleanOperatorContext> booleanOperator() {
			return getRuleContexts(BooleanOperatorContext.class);
		}
		public BooleanOperatorContext booleanOperator(int i) {
			return getRuleContext(BooleanOperatorContext.class,i);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			booleanOperand();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << AND) | (1L << OR))) != 0)) {
				{
				{
				setState(156);
				booleanOperator();
				setState(157);
				booleanOperand();
				}
				}
				setState(163);
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

	public static class BooleanOperandContext extends ParserRuleContext {
		public List<ComparisonOperandContext> comparisonOperand() {
			return getRuleContexts(ComparisonOperandContext.class);
		}
		public ComparisonOperandContext comparisonOperand(int i) {
			return getRuleContext(ComparisonOperandContext.class,i);
		}
		public List<ComparisonOperatorContext> comparisonOperator() {
			return getRuleContexts(ComparisonOperatorContext.class);
		}
		public ComparisonOperatorContext comparisonOperator(int i) {
			return getRuleContext(ComparisonOperatorContext.class,i);
		}
		public BooleanOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperand; }
	}

	public final BooleanOperandContext booleanOperand() throws RecognitionException {
		BooleanOperandContext _localctx = new BooleanOperandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			comparisonOperand();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) {
				{
				{
				setState(165);
				comparisonOperator();
				setState(166);
				comparisonOperand();
				}
				}
				setState(172);
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

	public static class ComparisonOperandContext extends ParserRuleContext {
		public List<MathOperandContext> mathOperand() {
			return getRuleContexts(MathOperandContext.class);
		}
		public MathOperandContext mathOperand(int i) {
			return getRuleContext(MathOperandContext.class,i);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
		}
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public ComparisonOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperand; }
	}

	public final ComparisonOperandContext comparisonOperand() throws RecognitionException {
		ComparisonOperandContext _localctx = new ComparisonOperandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparisonOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			mathOperand();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (ADD - 60)) | (1L << (SUB - 60)) | (1L << (DIV - 60)) | (1L << (MOD - 60)) | (1L << (STAR - 60)))) != 0)) {
				{
				{
				setState(174);
				mathOperator();
				setState(175);
				mathOperand();
				}
				}
				setState(181);
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

	public static class MathOperandContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TreeQLParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TreeQLParser.STRING_LITERAL, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TreeQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TreeQLParser.RPAREN, 0); }
		public MathOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperand; }
	}

	public final MathOperandContext mathOperand() throws RecognitionException {
		MathOperandContext _localctx = new MathOperandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mathOperand);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(BOOLEAN_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				signed_number();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(LPAREN);
				setState(186);
				expression();
				setState(187);
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
		enterRule(_localctx, 34, RULE_treeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(191);
				match(STAR);
				}
				break;
			case VAR_NAME:
				{
				setState(192);
				treeElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					treeElement();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 36, RULE_treeElement);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				abstractTreeName();
				setState(203);
				match(DOT);
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==VAR_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(205);
					match(AS);
					setState(206);
					match(VAR_NAME);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(VAR_NAME);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(210);
					match(AS);
					setState(211);
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
		enterRule(_localctx, 38, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case TREE:
				{
				setState(216);
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
				setState(217);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(220);
				match(LBRACK);
				setState(221);
				match(RBRACK);
				}
				}
				setState(226);
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
			setState(227);
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
			setState(229);
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
			setState(231);
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
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_json_value);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				signed_number();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				obj();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				arr();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(BOOLEAN_LITERAL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(LBRACE);
				setState(242);
				pair();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(243);
					match(COMMA);
					setState(244);
					pair();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(LBRACE);
				setState(253);
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
			setState(256);
			match(STRING_LITERAL);
			setState(257);
			match(COLON);
			setState(258);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(LBRACK);
				setState(261);
				json_value();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(262);
					match(COMMA);
					setState(263);
					json_value();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(LBRACK);
				setState(272);
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

	public static class MathOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(TreeQLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TreeQLParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(TreeQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TreeQLParser.MOD, 0); }
		public TerminalNode STAR() { return getToken(TreeQLParser.STAR, 0); }
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (ADD - 60)) | (1L << (SUB - 60)) | (1L << (DIV - 60)) | (1L << (MOD - 60)) | (1L << (STAR - 60)))) != 0)) ) {
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

	public static class BooleanOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(TreeQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(TreeQLParser.OR, 0); }
		public TerminalNode BANG() { return getToken(TreeQLParser.BANG, 0); }
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << AND) | (1L << OR))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 60, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(281);
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

			setState(284);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\5\2B\n\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3"+
		"Q\n\3\3\3\3\3\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"s\n\7\6\7u\n\7\r\7\16\7v\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\5\b\u0082"+
		"\n\b\6\b\u0084\n\b\r\b\16\b\u0085\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u0094\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u009c\n"+
		"\16\3\17\3\17\3\17\3\17\7\17\u00a2\n\17\f\17\16\17\u00a5\13\17\3\20\3"+
		"\20\3\20\3\20\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\21\3\21\3\21\3"+
		"\21\7\21\u00b4\n\21\f\21\16\21\u00b7\13\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00c0\n\22\3\23\3\23\5\23\u00c4\n\23\3\23\3\23\7\23\u00c8"+
		"\n\23\f\23\16\23\u00cb\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d2\n\24"+
		"\3\24\3\24\3\24\5\24\u00d7\n\24\5\24\u00d9\n\24\3\25\3\25\5\25\u00dd\n"+
		"\25\3\25\3\25\7\25\u00e1\n\25\f\25\16\25\u00e4\13\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f2\n\31\3\32\3\32"+
		"\3\32\3\32\7\32\u00f8\n\32\f\32\16\32\u00fb\13\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0101\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u010b\n"+
		"\34\f\34\16\34\u010e\13\34\3\34\3\34\3\34\3\34\5\34\u0114\n\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \5 \u011d\n \3 \3 \3 \2\2!\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\n\3\2\27\35\3\2BC\6\2"+
		"\23\26 !##\'\'\4\2((**\3\2>B\4\2\62\62:;\4\2\60\61\669\3\2>?\2\u012a\2"+
		"A\3\2\2\2\4L\3\2\2\2\6W\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fl\3\2\2\2\16x\3"+
		"\2\2\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u0090\3\2\2\2\26\u0095\3\2"+
		"\2\2\30\u0097\3\2\2\2\32\u009b\3\2\2\2\34\u009d\3\2\2\2\36\u00a6\3\2\2"+
		"\2 \u00af\3\2\2\2\"\u00bf\3\2\2\2$\u00c3\3\2\2\2&\u00d8\3\2\2\2(\u00dc"+
		"\3\2\2\2*\u00e5\3\2\2\2,\u00e7\3\2\2\2.\u00e9\3\2\2\2\60\u00f1\3\2\2\2"+
		"\62\u0100\3\2\2\2\64\u0102\3\2\2\2\66\u0113\3\2\2\28\u0115\3\2\2\2:\u0117"+
		"\3\2\2\2<\u0119\3\2\2\2>\u011c\3\2\2\2@B\7G\2\2A@\3\2\2\2AB\3\2\2\2BF"+
		"\3\2\2\2CE\5\4\3\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2H"+
		"F\3\2\2\2IJ\5\b\5\2JK\7\2\2\3K\3\3\2\2\2LM\5(\25\2MP\7C\2\2NO\7/\2\2O"+
		"Q\5\6\4\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\17\2\2S\5\3\2\2\2TX\5\32\16"+
		"\2UX\5> \2VX\5.\30\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2Yc\5\n\6"+
		"\2Zc\5\f\7\2[c\5\16\b\2\\c\5\22\n\2]^\7\t\2\2^_\5\b\5\2_`\7\n\2\2`c\3"+
		"\2\2\2ac\5\24\13\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2"+
		"ba\3\2\2\2c\t\3\2\2\2de\7,\2\2ef\5$\23\2fg\7-\2\2gj\5\b\5\2hi\7.\2\2i"+
		"k\5\30\r\2jh\3\2\2\2jk\3\2\2\2k\13\3\2\2\2lm\7\"\2\2mt\5\b\5\2no\7\20"+
		"\2\2or\5\b\5\2pq\7%\2\2qs\5\30\r\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tn\3\2"+
		"\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2\2xy\7$\2\2y\u0083\5\b\5\2"+
		"z{\7\20\2\2{~\5\b\5\2|}\7%\2\2}\177\5\30\r\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080\u0082\5\20\t\2\u0081\u0080\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0084\3\2\2\2\u0083z\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\17\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\21\3\2\2\2\u0089\u008a\7\36\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5$\23"+
		"\2\u008c\u008d\7\20\2\2\u008d\u008e\5\32\16\2\u008e\u008f\7\n\2\2\u008f"+
		"\23\3\2\2\2\u0090\u0093\5\26\f\2\u0091\u0092\7\22\2\2\u0092\u0094\7C\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096"+
		"\7C\2\2\u0096\27\3\2\2\2\u0097\u0098\5\34\17\2\u0098\31\3\2\2\2\u0099"+
		"\u009c\5$\23\2\u009a\u009c\5\34\17\2\u009b\u0099\3\2\2\2\u009b\u009a\3"+
		"\2\2\2\u009c\33\3\2\2\2\u009d\u00a3\5\36\20\2\u009e\u009f\5:\36\2\u009f"+
		"\u00a0\5\36\20\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\35\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00ac\5 \21\2\u00a7\u00a8\5<\37\2\u00a8\u00a9\5 "+
		"\21\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b5\5\"\22\2\u00b0\u00b1\58\35\2\u00b1\u00b2\5\"\22\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00c0"+
		"\7\4\2\2\u00b9\u00c0\7\5\2\2\u00ba\u00c0\5> \2\u00bb\u00bc\7\t\2\2\u00bc"+
		"\u00bd\5\32\16\2\u00bd\u00be\7\n\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b8\3"+
		"\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0"+
		"#\3\2\2\2\u00c1\u00c4\7B\2\2\u00c2\u00c4\5&\24\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c9\3\2\2\2\u00c5\u00c6\7\20\2\2\u00c6\u00c8\5"+
		"&\24\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5\26\f\2"+
		"\u00cd\u00ce\7\21\2\2\u00ce\u00d1\t\3\2\2\u00cf\u00d0\7\22\2\2\u00d0\u00d2"+
		"\7C\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d9\3\2\2\2\u00d3"+
		"\u00d6\7C\2\2\u00d4\u00d5\7\22\2\2\u00d5\u00d7\7C\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8"+
		"\u00d3\3\2\2\2\u00d9\'\3\2\2\2\u00da\u00dd\5,\27\2\u00db\u00dd\5*\26\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e2\3\2\2\2\u00de\u00df"+
		"\7\r\2\2\u00df\u00e1\7\16\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e2\3"+
		"\2\2\2\u00e5\u00e6\t\4\2\2\u00e6+\3\2\2\2\u00e7\u00e8\t\5\2\2\u00e8-\3"+
		"\2\2\2\u00e9\u00ea\5\60\31\2\u00ea/\3\2\2\2\u00eb\u00f2\7\5\2\2\u00ec"+
		"\u00f2\5> \2\u00ed\u00f2\5\62\32\2\u00ee\u00f2\5\66\34\2\u00ef\u00f2\7"+
		"\4\2\2\u00f0\u00f2\7\3\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\61\3\2\2\2\u00f3\u00f4\7\13\2\2\u00f4\u00f9\5\64\33\2\u00f5"+
		"\u00f6\7\20\2\2\u00f6\u00f8\5\64\33\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7\f\2\2\u00fd\u0101\3\2\2\2\u00fe\u00ff\7\13"+
		"\2\2\u00ff\u0101\7\f\2\2\u0100\u00f3\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\63\3\2\2\2\u0102\u0103\7\5\2\2\u0103\u0104\7\65\2\2\u0104\u0105\5\60"+
		"\31\2\u0105\65\3\2\2\2\u0106\u0107\7\r\2\2\u0107\u010c\5\60\31\2\u0108"+
		"\u0109\7\20\2\2\u0109\u010b\5\60\31\2\u010a\u0108\3\2\2\2\u010b\u010e"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\7\16\2\2\u0110\u0114\3\2\2\2\u0111\u0112\7"+
		"\r\2\2\u0112\u0114\7\16\2\2\u0113\u0106\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\67\3\2\2\2\u0115\u0116\t\6\2\2\u01169\3\2\2\2\u0117\u0118\t\7\2\2\u0118"+
		";\3\2\2\2\u0119\u011a\t\b\2\2\u011a=\3\2\2\2\u011b\u011d\t\t\2\2\u011c"+
		"\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\6"+
		"\2\2\u011f?\3\2\2\2 AFPWbjrv~\u0081\u0085\u0093\u009b\u00a3\u00ac\u00b5"+
		"\u00bf\u00c3\u00c9\u00d1\u00d6\u00d8\u00dc\u00e2\u00f1\u00f9\u0100\u010c"+
		"\u0113\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}