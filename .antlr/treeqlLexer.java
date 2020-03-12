// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism\treeql.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class treeqlLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ALIAS", "LPAREN", "RPAREN", 
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
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "DIGIT", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", 
		"WS"
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


	public treeqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "treeql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u0247\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A"+
		"\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S"+
		"\3S\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3X\3X\7X\u0236\nX\fX"+
		"\16X\u0239\13X\3Y\3Y\3Y\3Y\3Z\3Z\3[\6[\u0242\n[\r[\16[\u0243\3[\3[\2\2"+
		"\\\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad\2\u00afX\u00b1Y\u00b3Z\u00b5"+
		"[\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2))^^\5\2\13\f\17\17\"\"\2\u0247\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2\2\5\u00bc\3\2\2\2\7\u00c2\3\2\2\2\t\u00c5"+
		"\3\2\2\2\13\u00c7\3\2\2\2\r\u00c9\3\2\2\2\17\u00cb\3\2\2\2\21\u00cd\3"+
		"\2\2\2\23\u00cf\3\2\2\2\25\u00d1\3\2\2\2\27\u00d3\3\2\2\2\31\u00d5\3\2"+
		"\2\2\33\u00d7\3\2\2\2\35\u00d9\3\2\2\2\37\u00db\3\2\2\2!\u00dd\3\2\2\2"+
		"#\u00df\3\2\2\2%\u00e2\3\2\2\2\'\u00ea\3\2\2\2)\u00ef\3\2\2\2+\u00f4\3"+
		"\2\2\2-\u00fb\3\2\2\2/\u010a\3\2\2\2\61\u0117\3\2\2\2\63\u0125\3\2\2\2"+
		"\65\u0139\3\2\2\2\67\u0143\3\2\2\29\u014c\3\2\2\2;\u0155\3\2\2\2=\u015d"+
		"\3\2\2\2?\u0162\3\2\2\2A\u0167\3\2\2\2C\u016d\3\2\2\2E\u0171\3\2\2\2G"+
		"\u0174\3\2\2\2I\u0178\3\2\2\2K\u017d\3\2\2\2M\u0182\3\2\2\2O\u0187\3\2"+
		"\2\2Q\u018d\3\2\2\2S\u0192\3\2\2\2U\u0195\3\2\2\2W\u019f\3\2\2\2Y\u01a5"+
		"\3\2\2\2[\u01ac\3\2\2\2]\u01b1\3\2\2\2_\u01b6\3\2\2\2a\u01bc\3\2\2\2c"+
		"\u01c3\3\2\2\2e\u01c8\3\2\2\2g\u01ce\3\2\2\2i\u01d6\3\2\2\2k\u01d8\3\2"+
		"\2\2m\u01da\3\2\2\2o\u01dc\3\2\2\2q\u01de\3\2\2\2s\u01e0\3\2\2\2u\u01e2"+
		"\3\2\2\2w\u01e4\3\2\2\2y\u01e7\3\2\2\2{\u01ea\3\2\2\2}\u01ed\3\2\2\2\177"+
		"\u01f0\3\2\2\2\u0081\u01f3\3\2\2\2\u0083\u01f6\3\2\2\2\u0085\u01f9\3\2"+
		"\2\2\u0087\u01fc\3\2\2\2\u0089\u01fe\3\2\2\2\u008b\u0200\3\2\2\2\u008d"+
		"\u0202\3\2\2\2\u008f\u0204\3\2\2\2\u0091\u0206\3\2\2\2\u0093\u0208\3\2"+
		"\2\2\u0095\u020a\3\2\2\2\u0097\u020c\3\2\2\2\u0099\u020f\3\2\2\2\u009b"+
		"\u0212\3\2\2\2\u009d\u0215\3\2\2\2\u009f\u0218\3\2\2\2\u00a1\u021b\3\2"+
		"\2\2\u00a3\u021e\3\2\2\2\u00a5\u0221\3\2\2\2\u00a7\u0224\3\2\2\2\u00a9"+
		"\u0228\3\2\2\2\u00ab\u022c\3\2\2\2\u00ad\u0231\3\2\2\2\u00af\u0233\3\2"+
		"\2\2\u00b1\u023a\3\2\2\2\u00b3\u023e\3\2\2\2\u00b5\u0241\3\2\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\4\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n"+
		"\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\6\3\2\2\2\u00c2\u00c3"+
		"\7>\2\2\u00c3\u00c4\7@\2\2\u00c4\b\3\2\2\2\u00c5\u00c6\7)\2\2\u00c6\n"+
		"\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8\f\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca\16"+
		"\3\2\2\2\u00cb\u00cc\5\u00afX\2\u00cc\20\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce"+
		"\22\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0\24\3\2\2\2\u00d1\u00d2\7}\2\2\u00d2"+
		"\26\3\2\2\2\u00d3\u00d4\7\177\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\7]\2\2"+
		"\u00d6\32\3\2\2\2\u00d7\u00d8\7_\2\2\u00d8\34\3\2\2\2\u00d9\u00da\7=\2"+
		"\2\u00da\36\3\2\2\2\u00db\u00dc\7.\2\2\u00dc \3\2\2\2\u00dd\u00de\7\60"+
		"\2\2\u00de\"\3\2\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7u\2\2\u00e1$\3\2"+
		"\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"&\3\2\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec\7{\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee(\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7j\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3*\3\2\2\2\u00f4\u00f5\7f\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7n\2\2"+
		"\u00f9\u00fa\7g\2\2\u00fa,\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7q\2"+
		"\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7q\2\2\u0100\u0101"+
		"\7t\2\2\u0101\u0102\7o\2\2\u0102\u0103\7k\2\2\u0103\u0104\7h\2\2\u0104"+
		"\u0105\7g\2\2\u0105\u0106\7s\2\2\u0106\u0107\7w\2\2\u0107\u0108\7c\2\2"+
		"\u0108\u0109\7n\2\2\u0109.\3\2\2\2\u010a\u010b\7f\2\2\u010b\u010c\7g\2"+
		"\2\u010c\u010d\7t\2\2\u010d\u010e\7k\2\2\u010e\u010f\7x\2\2\u010f\u0110"+
		"\7g\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7y\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7{\2\2\u0115\u0116\7u\2\2\u0116\60\3\2\2\2\u0117"+
		"\u0118\7f\2\2\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a\u011b\7k\2\2"+
		"\u011b\u011c\7x\2\2\u011c\u011d\7g\2\2\u011d\u011e\7k\2\2\u011e\u011f"+
		"\7h\2\2\u011f\u0120\7g\2\2\u0120\u0121\7s\2\2\u0121\u0122\7w\2\2\u0122"+
		"\u0123\7c\2\2\u0123\u0124\7n\2\2\u0124\62\3\2\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\7g\2\2\u0127\u0128\7t\2\2\u0128\u0129\7o\2\2\u0129\u012a\7k\2\2"+
		"\u012a\u012b\7p\2\2\u012b\u012c\7c\2\2\u012c\u012d\7v\2\2\u012d\u012e"+
		"\7g\2\2\u012e\u012f\7k\2\2\u012f\u0130\7h\2\2\u0130\u0131\7p\2\2\u0131"+
		"\u0132\7q\2\2\u0132\u0133\7v\2\2\u0133\u0134\7g\2\2\u0134\u0135\7s\2\2"+
		"\u0135\u0136\7w\2\2\u0136\u0137\7c\2\2\u0137\u0138\7n\2\2\u0138\64\3\2"+
		"\2\2\u0139\u013a\7v\2\2\u013a\u013b\7g\2\2\u013b\u013c\7t\2\2\u013c\u013d"+
		"\7o\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2\2\u013f\u0140\7c\2\2\u0140"+
		"\u0141\7v\2\2\u0141\u0142\7g\2\2\u0142\66\3\2\2\2\u0143\u0144\7q\2\2\u0144"+
		"\u0145\7x\2\2\u0145\u0146\7g\2\2\u0146\u0147\7t\2\2\u0147\u0148\7t\2\2"+
		"\u0148\u0149\7k\2\2\u0149\u014a\7f\2\2\u014a\u014b\7g\2\2\u014b8\3\2\2"+
		"\2\u014c\u014d\7g\2\2\u014d\u014e\7x\2\2\u014e\u014f\7c\2\2\u014f\u0150"+
		"\7n\2\2\u0150\u0151\7w\2\2\u0151\u0152\7c\2\2\u0152\u0153\7v\2\2\u0153"+
		"\u0154\7g\2\2\u0154:\3\2\2\2\u0155\u0156\7g\2\2\u0156\u0157\7z\2\2\u0157"+
		"\u0158\7r\2\2\u0158\u0159\7n\2\2\u0159\u015a\7q\2\2\u015a\u015b\7f\2\2"+
		"\u015b\u015c\7g\2\2\u015c<\3\2\2\2\u015d\u015e\7f\2\2\u015e\u015f\7t\2"+
		"\2\u015f\u0160\7q\2\2\u0160\u0161\7r\2\2\u0161>\3\2\2\2\u0162\u0163\7"+
		"g\2\2\u0163\u0164\7n\2\2\u0164\u0165\7u\2\2\u0165\u0166\7g\2\2\u0166@"+
		"\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169\7n\2\2\u0169\u016a\7q\2\2\u016a"+
		"\u016b\7c\2\2\u016b\u016c\7v\2\2\u016cB\3\2\2\2\u016d\u016e\7h\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0170\7t\2\2\u0170D\3\2\2\2\u0171\u0172\7k\2\2\u0172"+
		"\u0173\7h\2\2\u0173F\3\2\2\2\u0174\u0175\7k\2\2\u0175\u0176\7p\2\2\u0176"+
		"\u0177\7v\2\2\u0177H\3\2\2\2\u0178\u0179\7l\2\2\u0179\u017a\7q\2\2\u017a"+
		"\u017b\7k\2\2\u017b\u017c\7p\2\2\u017cJ\3\2\2\2\u017d\u017e\7n\2\2\u017e"+
		"\u017f\7k\2\2\u017f\u0180\7u\2\2\u0180\u0181\7v\2\2\u0181L\3\2\2\2\u0182"+
		"\u0183\7n\2\2\u0183\u0184\7q\2\2\u0184\u0185\7p\2\2\u0185\u0186\7i\2\2"+
		"\u0186N\3\2\2\2\u0187\u0188\7o\2\2\u0188\u0189\7g\2\2\u0189\u018a\7t\2"+
		"\2\u018a\u018b\7i\2\2\u018b\u018c\7g\2\2\u018cP\3\2\2\2\u018d\u018e\7"+
		"p\2\2\u018e\u018f\7q\2\2\u018f\u0190\7f\2\2\u0190\u0191\7g\2\2\u0191R"+
		"\3\2\2\2\u0192\u0193\7q\2\2\u0193\u0194\7p\2\2\u0194T\3\2\2\2\u0195\u0196"+
		"\7t\2\2\u0196\u0197\7g\2\2\u0197\u0198\7e\2\2\u0198\u0199\7q\2\2\u0199"+
		"\u019a\7i\2\2\u019a\u019b\7p\2\2\u019b\u019c\7k\2\2\u019c\u019d\7|\2\2"+
		"\u019d\u019e\7g\2\2\u019eV\3\2\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1\7j\2"+
		"\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7t\2\2\u01a3\u01a4\7v\2\2\u01a4X\3\2"+
		"\2\2\u01a5\u01a6\7U\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9"+
		"\7k\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7i\2\2\u01abZ\3\2\2\2\u01ac\u01ad"+
		"\7R\2\2\u01ad\u01ae\7c\2\2\u01ae\u01af\7v\2\2\u01af\u01b0\7j\2\2\u01b0"+
		"\\\3\2\2\2\u01b1\u01b2\7V\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7g\2\2\u01b4"+
		"\u01b5\7g\2\2\u01b5^\3\2\2\2\u01b6\u01b7\7w\2\2\u01b7\u01b8\7p\2\2\u01b8"+
		"\u01b9\7k\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7p\2\2\u01bb`\3\2\2\2\u01bc"+
		"\u01bd\7u\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7n\2\2\u01bf\u01c0\7g\2\2"+
		"\u01c0\u01c1\7e\2\2\u01c1\u01c2\7v\2\2\u01c2b\3\2\2\2\u01c3\u01c4\7h\2"+
		"\2\u01c4\u01c5\7t\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7o\2\2\u01c7d\3\2"+
		"\2\2\u01c8\u01c9\7y\2\2\u01c9\u01ca\7j\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc"+
		"\7t\2\2\u01cc\u01cd\7g\2\2\u01cdf\3\2\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0"+
		"\7t\2\2\u01d0\u01d1\7f\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3\7t\2\2\u01d3"+
		"\u01d4\7d\2\2\u01d4\u01d5\7{\2\2\u01d5h\3\2\2\2\u01d6\u01d7\7?\2\2\u01d7"+
		"j\3\2\2\2\u01d8\u01d9\7@\2\2\u01d9l\3\2\2\2\u01da\u01db\7>\2\2\u01dbn"+
		"\3\2\2\2\u01dc\u01dd\7#\2\2\u01ddp\3\2\2\2\u01de\u01df\7\u0080\2\2\u01df"+
		"r\3\2\2\2\u01e0\u01e1\7A\2\2\u01e1t\3\2\2\2\u01e2\u01e3\7<\2\2\u01e3v"+
		"\3\2\2\2\u01e4\u01e5\7?\2\2\u01e5\u01e6\7?\2\2\u01e6x\3\2\2\2\u01e7\u01e8"+
		"\7>\2\2\u01e8\u01e9\7?\2\2\u01e9z\3\2\2\2\u01ea\u01eb\7@\2\2\u01eb\u01ec"+
		"\7?\2\2\u01ec|\3\2\2\2\u01ed\u01ee\7#\2\2\u01ee\u01ef\7?\2\2\u01ef~\3"+
		"\2\2\2\u01f0\u01f1\7(\2\2\u01f1\u01f2\7(\2\2\u01f2\u0080\3\2\2\2\u01f3"+
		"\u01f4\7~\2\2\u01f4\u01f5\7~\2\2\u01f5\u0082\3\2\2\2\u01f6\u01f7\7-\2"+
		"\2\u01f7\u01f8\7-\2\2\u01f8\u0084\3\2\2\2\u01f9\u01fa\7/\2\2\u01fa\u01fb"+
		"\7/\2\2\u01fb\u0086\3\2\2\2\u01fc\u01fd\7-\2\2\u01fd\u0088\3\2\2\2\u01fe"+
		"\u01ff\7/\2\2\u01ff\u008a\3\2\2\2\u0200\u0201\7,\2\2\u0201\u008c\3\2\2"+
		"\2\u0202\u0203\7\61\2\2\u0203\u008e\3\2\2\2\u0204\u0205\7(\2\2\u0205\u0090"+
		"\3\2\2\2\u0206\u0207\7~\2\2\u0207\u0092\3\2\2\2\u0208\u0209\7`\2\2\u0209"+
		"\u0094\3\2\2\2\u020a\u020b\7\'\2\2\u020b\u0096\3\2\2\2\u020c\u020d\7-"+
		"\2\2\u020d\u020e\7?\2\2\u020e\u0098\3\2\2\2\u020f\u0210\7/\2\2\u0210\u0211"+
		"\7?\2\2\u0211\u009a\3\2\2\2\u0212\u0213\7,\2\2\u0213\u0214\7?\2\2\u0214"+
		"\u009c\3\2\2\2\u0215\u0216\7\61\2\2\u0216\u0217\7?\2\2\u0217\u009e\3\2"+
		"\2\2\u0218\u0219\7(\2\2\u0219\u021a\7?\2\2\u021a\u00a0\3\2\2\2\u021b\u021c"+
		"\7~\2\2\u021c\u021d\7?\2\2\u021d\u00a2\3\2\2\2\u021e\u021f\7`\2\2\u021f"+
		"\u0220\7?\2\2\u0220\u00a4\3\2\2\2\u0221\u0222\7\'\2\2\u0222\u0223\7?\2"+
		"\2\u0223\u00a6\3\2\2\2\u0224\u0225\7>\2\2\u0225\u0226\7>\2\2\u0226\u0227"+
		"\7?\2\2\u0227\u00a8\3\2\2\2\u0228\u0229\7@\2\2\u0229\u022a\7@\2\2\u022a"+
		"\u022b\7?\2\2\u022b\u00aa\3\2\2\2\u022c\u022d\7@\2\2\u022d\u022e\7@\2"+
		"\2\u022e\u022f\7@\2\2\u022f\u0230\7?\2\2\u0230\u00ac\3\2\2\2\u0231\u0232"+
		"\4\62;\2\u0232\u00ae\3\2\2\2\u0233\u0237\t\2\2\2\u0234\u0236\t\3\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u00b0\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7)\2\2\u023b"+
		"\u023c\n\4\2\2\u023c\u023d\7)\2\2\u023d\u00b2\3\2\2\2\u023e\u023f\5\u00b1"+
		"Y\2\u023f\u00b4\3\2\2\2\u0240\u0242\t\5\2\2\u0241\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2"+
		"\2\2\u0245\u0246\b[\2\2\u0246\u00b6\3\2\2\2\5\2\u0237\u0243\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}