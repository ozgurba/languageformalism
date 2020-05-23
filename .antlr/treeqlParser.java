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
		NOTEQUAL=55, AND=56, OR=57, INC=58, DEC=59, ADD=60, SUBORNEGATION=61, 
		DIV=62, MOD=63, STAR=64, VAR_NAME=65, CHARACTER=66, ESCAPE_CHARACTER=67, 
		WS=68, COMMENT=69;
	public static final int
		RULE_stats = 0, RULE_definition = 1, RULE_assignmentExpr = 2, RULE_treeQuery = 3, 
		RULE_selectQuery = 4, RULE_joinQuery = 5, RULE_mergeQuery = 6, RULE_conflictspec = 7, 
		RULE_explodeQuery = 8, RULE_rangeVariableDeclaration = 9, RULE_abstractTreeName = 10, 
		RULE_selectExpression = 11, RULE_expression = 12, RULE_arithmeticLogicExpression = 13, 
		RULE_binaryOperand = 14, RULE_unaryOperand = 15, RULE_treeExpression = 16, 
		RULE_treeElement = 17, RULE_typeType = 18, RULE_primitiveType = 19, RULE_complexType = 20, 
		RULE_json = 21, RULE_json_value = 22, RULE_obj = 23, RULE_pair = 24, RULE_arr = 25, 
		RULE_binaryOperator = 26, RULE_unaryOperator = 27, RULE_signed_number = 28;
	public static final String[] ruleNames = {
		"stats", "definition", "assignmentExpr", "treeQuery", "selectQuery", "joinQuery", 
		"mergeQuery", "conflictspec", "explodeQuery", "rangeVariableDeclaration", 
		"abstractTreeName", "selectExpression", "expression", "arithmeticLogicExpression", 
		"binaryOperand", "unaryOperand", "treeExpression", "treeElement", "typeType", 
		"primitiveType", "complexType", "json", "json_value", "obj", "pair", "arr", 
		"binaryOperator", "unaryOperator", "signed_number"
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
		"SUBORNEGATION", "DIV", "MOD", "STAR", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", 
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(58);
				match(COMMENT);
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << TREE))) != 0)) {
				{
				{
				setState(61);
				definition();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			treeQuery();
			setState(68);
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
			setState(70);
			typeType();
			setState(71);
			match(VAR_NAME);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(72);
				match(ASSIGN);
				setState(73);
				assignmentExpr();
				}
			}

			setState(76);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				signed_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				selectQuery();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				joinQuery();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				mergeQuery();
				}
				break;
			case EXPLODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				explodeQuery();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(LPAREN);
				setState(88);
				treeQuery();
				setState(89);
				match(RPAREN);
				}
				break;
			case VAR_NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
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
			setState(94);
			match(SELECT);
			setState(95);
			treeExpression();
			setState(96);
			match(FROM);
			setState(97);
			treeQuery();
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(98);
				match(WHERE);
				setState(99);
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
			setState(102);
			match(JOIN);
			setState(103);
			treeQuery();
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					treeQuery();
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(106);
						match(ON);
						setState(107);
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
				setState(112); 
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
			setState(114);
			match(MERGE);
			setState(115);
			treeQuery();
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(116);
					match(COMMA);
					setState(117);
					treeQuery();
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(118);
						match(ON);
						setState(119);
						selectExpression();
						}
						break;
					}
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(122);
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
				setState(127); 
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
			setState(129);
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
			setState(131);
			match(EXPLODE);
			setState(132);
			match(LPAREN);
			setState(133);
			treeExpression();
			setState(134);
			match(COMMA);
			setState(135);
			expression();
			setState(136);
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
			setState(138);
			abstractTreeName();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(139);
				match(AS);
				setState(140);
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
			setState(143);
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
		public ArithmeticLogicExpressionContext arithmeticLogicExpression() {
			return getRuleContext(ArithmeticLogicExpressionContext.class,0);
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
			setState(145);
			arithmeticLogicExpression();
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
		public ArithmeticLogicExpressionContext arithmeticLogicExpression() {
			return getRuleContext(ArithmeticLogicExpressionContext.class,0);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				treeExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				arithmeticLogicExpression();
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

	public static class ArithmeticLogicExpressionContext extends ParserRuleContext {
		public List<BinaryOperandContext> binaryOperand() {
			return getRuleContexts(BinaryOperandContext.class);
		}
		public BinaryOperandContext binaryOperand(int i) {
			return getRuleContext(BinaryOperandContext.class,i);
		}
		public List<BinaryOperatorContext> binaryOperator() {
			return getRuleContexts(BinaryOperatorContext.class);
		}
		public BinaryOperatorContext binaryOperator(int i) {
			return getRuleContext(BinaryOperatorContext.class,i);
		}
		public ArithmeticLogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticLogicExpression; }
	}

	public final ArithmeticLogicExpressionContext arithmeticLogicExpression() throws RecognitionException {
		ArithmeticLogicExpressionContext _localctx = new ArithmeticLogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmeticLogicExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			binaryOperand();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					binaryOperator();
					setState(153);
					binaryOperand();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class BinaryOperandContext extends ParserRuleContext {
		public UnaryOperandContext unaryOperand() {
			return getRuleContext(UnaryOperandContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public BinaryOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperand; }
	}

	public final BinaryOperandContext binaryOperand() throws RecognitionException {
		BinaryOperandContext _localctx = new BinaryOperandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(160);
				unaryOperator();
				}
				break;
			}
			setState(163);
			unaryOperand();
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

	public static class UnaryOperandContext extends ParserRuleContext {
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
		public TerminalNode VAR_NAME() { return getToken(TreeQLParser.VAR_NAME, 0); }
		public UnaryOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperand; }
	}

	public final UnaryOperandContext unaryOperand() throws RecognitionException {
		UnaryOperandContext _localctx = new UnaryOperandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryOperand);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(BOOLEAN_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
			case ADD:
			case SUBORNEGATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				signed_number();
				}
				break;
			case LPAREN:
			case VAR_NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR_NAME) {
					{
					setState(168);
					match(VAR_NAME);
					}
				}

				setState(171);
				match(LPAREN);
				setState(172);
				expression();
				setState(173);
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
		enterRule(_localctx, 32, RULE_treeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(177);
				match(STAR);
				}
				break;
			case VAR_NAME:
				{
				setState(178);
				treeElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					match(COMMA);
					setState(182);
					treeElement();
					}
					} 
				}
				setState(187);
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
		enterRule(_localctx, 34, RULE_treeElement);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				abstractTreeName();
				setState(189);
				match(DOT);
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==VAR_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(191);
					match(AS);
					setState(192);
					match(VAR_NAME);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(VAR_NAME);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(196);
					match(AS);
					setState(197);
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
		enterRule(_localctx, 36, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case TREE:
				{
				setState(202);
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
				setState(203);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(206);
				match(LBRACK);
				setState(207);
				match(RBRACK);
				}
				}
				setState(212);
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
		enterRule(_localctx, 38, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 40, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 42, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		enterRule(_localctx, 44, RULE_json_value);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
			case ADD:
			case SUBORNEGATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				signed_number();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				obj();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				arr();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(BOOLEAN_LITERAL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
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
		enterRule(_localctx, 46, RULE_obj);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(LBRACE);
				setState(228);
				pair();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(229);
					match(COMMA);
					setState(230);
					pair();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(LBRACE);
				setState(239);
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
		enterRule(_localctx, 48, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(STRING_LITERAL);
			setState(243);
			match(COLON);
			setState(244);
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
		enterRule(_localctx, 50, RULE_arr);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(LBRACK);
				setState(247);
				json_value();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(248);
					match(COMMA);
					setState(249);
					json_value();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(LBRACK);
				setState(258);
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(TreeQLParser.ADD, 0); }
		public TerminalNode SUBORNEGATION() { return getToken(TreeQLParser.SUBORNEGATION, 0); }
		public TerminalNode DIV() { return getToken(TreeQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TreeQLParser.MOD, 0); }
		public TerminalNode STAR() { return getToken(TreeQLParser.STAR, 0); }
		public TerminalNode AND() { return getToken(TreeQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(TreeQLParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(TreeQLParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(TreeQLParser.NOTEQUAL, 0); }
		public TerminalNode GT() { return getToken(TreeQLParser.GT, 0); }
		public TerminalNode GE() { return getToken(TreeQLParser.GE, 0); }
		public TerminalNode LT() { return getToken(TreeQLParser.LT, 0); }
		public TerminalNode LE() { return getToken(TreeQLParser.LE, 0); }
		public TerminalNode COMMA() { return getToken(TreeQLParser.COMMA, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (COMMA - 14)) | (1L << (GT - 14)) | (1L << (LT - 14)) | (1L << (EQUAL - 14)) | (1L << (LE - 14)) | (1L << (GE - 14)) | (1L << (NOTEQUAL - 14)) | (1L << (AND - 14)) | (1L << (OR - 14)) | (1L << (ADD - 14)) | (1L << (SUBORNEGATION - 14)) | (1L << (DIV - 14)) | (1L << (MOD - 14)) | (1L << (STAR - 14)))) != 0)) ) {
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode SUBORNEGATION() { return getToken(TreeQLParser.SUBORNEGATION, 0); }
		public TerminalNode BANG() { return getToken(TreeQLParser.BANG, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==BANG || _la==SUBORNEGATION) ) {
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
		public TerminalNode ADD() { return getToken(TreeQLParser.ADD, 0); }
		public TerminalNode SUBORNEGATION() { return getToken(TreeQLParser.SUBORNEGATION, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUBORNEGATION) {
				{
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUBORNEGATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(268);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\6\7q\n\7"+
		"\r\7\16\7r\3\b\3\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\b\5\b~\n\b\6\b\u0080\n\b"+
		"\r\b\16\b\u0081\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13"+
		"\u0090\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\17\3"+
		"\17\7\17\u009e\n\17\f\17\16\17\u00a1\13\17\3\20\5\20\u00a4\n\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\5\21\u00ac\n\21\3\21\3\21\3\21\3\21\5\21\u00b2"+
		"\n\21\3\22\3\22\5\22\u00b6\n\22\3\22\3\22\7\22\u00ba\n\22\f\22\16\22\u00bd"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c4\n\23\3\23\3\23\3\23\5\23\u00c9"+
		"\n\23\5\23\u00cb\n\23\3\24\3\24\5\24\u00cf\n\24\3\24\3\24\7\24\u00d3\n"+
		"\24\f\24\16\24\u00d6\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00e4\n\30\3\31\3\31\3\31\3\31\7\31\u00ea\n\31\f"+
		"\31\16\31\u00ed\13\31\3\31\3\31\3\31\3\31\5\31\u00f3\n\31\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\7\33\u00fd\n\33\f\33\16\33\u0100\13\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0106\n\33\3\34\3\34\3\35\3\35\3\36\5\36\u010d"+
		"\n\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\t\3\2\27\35\3\2BC\6\2\23\26 !##\'\'\4\2((**\6\2"+
		"\20\20\60\61\66;>B\4\2\62\62??\3\2>?\2\u011c\2=\3\2\2\2\4H\3\2\2\2\6S"+
		"\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fh\3\2\2\2\16t\3\2\2\2\20\u0083\3\2\2\2"+
		"\22\u0085\3\2\2\2\24\u008c\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2\2\32"+
		"\u0097\3\2\2\2\34\u0099\3\2\2\2\36\u00a3\3\2\2\2 \u00b1\3\2\2\2\"\u00b5"+
		"\3\2\2\2$\u00ca\3\2\2\2&\u00ce\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,"+
		"\u00db\3\2\2\2.\u00e3\3\2\2\2\60\u00f2\3\2\2\2\62\u00f4\3\2\2\2\64\u0105"+
		"\3\2\2\2\66\u0107\3\2\2\28\u0109\3\2\2\2:\u010c\3\2\2\2<>\7G\2\2=<\3\2"+
		"\2\2=>\3\2\2\2>B\3\2\2\2?A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2"+
		"\2\2CE\3\2\2\2DB\3\2\2\2EF\5\b\5\2FG\7\2\2\3G\3\3\2\2\2HI\5&\24\2IL\7"+
		"C\2\2JK\7/\2\2KM\5\6\4\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\17\2\2O\5\3"+
		"\2\2\2PT\5\32\16\2QT\5:\36\2RT\5,\27\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T"+
		"\7\3\2\2\2U_\5\n\6\2V_\5\f\7\2W_\5\16\b\2X_\5\22\n\2YZ\7\t\2\2Z[\5\b\5"+
		"\2[\\\7\n\2\2\\_\3\2\2\2]_\5\24\13\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3"+
		"\2\2\2^Y\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`a\7,\2\2ab\5\"\22\2bc\7-\2\2cf\5"+
		"\b\5\2de\7.\2\2eg\5\30\r\2fd\3\2\2\2fg\3\2\2\2g\13\3\2\2\2hi\7\"\2\2i"+
		"p\5\b\5\2jk\7\20\2\2kn\5\b\5\2lm\7%\2\2mo\5\30\r\2nl\3\2\2\2no\3\2\2\2"+
		"oq\3\2\2\2pj\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tu\7$\2\2"+
		"u\177\5\b\5\2vw\7\20\2\2wz\5\b\5\2xy\7%\2\2y{\5\30\r\2zx\3\2\2\2z{\3\2"+
		"\2\2{}\3\2\2\2|~\5\20\t\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177v\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17"+
		"\3\2\2\2\u0083\u0084\t\2\2\2\u0084\21\3\2\2\2\u0085\u0086\7\36\2\2\u0086"+
		"\u0087\7\t\2\2\u0087\u0088\5\"\22\2\u0088\u0089\7\20\2\2\u0089\u008a\5"+
		"\32\16\2\u008a\u008b\7\n\2\2\u008b\23\3\2\2\2\u008c\u008f\5\26\f\2\u008d"+
		"\u008e\7\22\2\2\u008e\u0090\7C\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\25\3\2\2\2\u0091\u0092\7C\2\2\u0092\27\3\2\2\2\u0093\u0094"+
		"\5\34\17\2\u0094\31\3\2\2\2\u0095\u0098\5\"\22\2\u0096\u0098\5\34\17\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\33\3\2\2\2\u0099\u009f"+
		"\5\36\20\2\u009a\u009b\5\66\34\2\u009b\u009c\5\36\20\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\58\35"+
		"\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\5 \21\2\u00a6\37\3\2\2\2\u00a7\u00b2\7\4\2\2\u00a8\u00b2\7\5\2\2\u00a9"+
		"\u00b2\5:\36\2\u00aa\u00ac\7C\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\5\32\16\2\u00af"+
		"\u00b0\7\n\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a8\3\2"+
		"\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b2!\3\2\2\2\u00b3\u00b6"+
		"\7B\2\2\u00b4\u00b6\5$\23\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00bb\3\2\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00ba\5$\23\2\u00b9\u00b7\3"+
		"\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"#\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7\21\2"+
		"\2\u00c0\u00c3\t\3\2\2\u00c1\u00c2\7\22\2\2\u00c2\u00c4\7C\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c8\7C\2\2\u00c6"+
		"\u00c7\7\22\2\2\u00c7\u00c9\7C\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb"+
		"%\3\2\2\2\u00cc\u00cf\5*\26\2\u00cd\u00cf\5(\25\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d3"+
		"\7\16\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\'\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\t"+
		"\4\2\2\u00d8)\3\2\2\2\u00d9\u00da\t\5\2\2\u00da+\3\2\2\2\u00db\u00dc\5"+
		".\30\2\u00dc-\3\2\2\2\u00dd\u00e4\7\5\2\2\u00de\u00e4\5:\36\2\u00df\u00e4"+
		"\5\60\31\2\u00e0\u00e4\5\64\33\2\u00e1\u00e4\7\4\2\2\u00e2\u00e4\7\3\2"+
		"\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4/\3\2\2\2\u00e5"+
		"\u00e6\7\13\2\2\u00e6\u00eb\5\62\32\2\u00e7\u00e8\7\20\2\2\u00e8\u00ea"+
		"\5\62\32\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef"+
		"\7\f\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f1\7\13\2\2\u00f1\u00f3\7\f\2\2"+
		"\u00f2\u00e5\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\61\3\2\2\2\u00f4\u00f5"+
		"\7\5\2\2\u00f5\u00f6\7\65\2\2\u00f6\u00f7\5.\30\2\u00f7\63\3\2\2\2\u00f8"+
		"\u00f9\7\r\2\2\u00f9\u00fe\5.\30\2\u00fa\u00fb\7\20\2\2\u00fb\u00fd\5"+
		".\30\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\16"+
		"\2\2\u0102\u0106\3\2\2\2\u0103\u0104\7\r\2\2\u0104\u0106\7\16\2\2\u0105"+
		"\u00f8\3\2\2\2\u0105\u0103\3\2\2\2\u0106\65\3\2\2\2\u0107\u0108\t\6\2"+
		"\2\u0108\67\3\2\2\2\u0109\u010a\t\7\2\2\u010a9\3\2\2\2\u010b\u010d\t\b"+
		"\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\7\6\2\2\u010f;\3\2\2\2 =BLS^fnrz}\u0081\u008f\u0097\u009f\u00a3"+
		"\u00ab\u00b1\u00b5\u00bb\u00c3\u00c8\u00ca\u00ce\u00d4\u00e3\u00eb\u00f2"+
		"\u00fe\u0105\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}