// Generated from D:/IMT/A1/UV-Langage_de_programmation/struct_exec/TP2/Calc/src/parser\Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, OP=19, IDENTIFIER=20, LITERAL=21, WS=22, LINE_COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "OP", "IDENTIFIER", "LITERAL", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'='", "')'", "'-'", "'!'", "'/'", "'*'", "'+'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "OP", "IDENTIFIER", "LITERAL", 
			"WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24`"+
		"\n\24\3\25\3\25\7\25d\n\25\f\25\16\25g\13\25\3\26\3\26\3\26\7\26l\n\26"+
		"\f\26\16\26o\13\26\5\26q\n\26\3\27\6\27t\n\27\r\27\16\27u\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\7\30~\n\30\f\30\16\30\u0081\13\30\3\30\3\30\3\30\3"+
		"\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\5\2,-//\61\61\4"+
		"\2\62;c|\5\2\13\f\17\17\"\"\3\2\f\f\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2"+
		"\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3"+
		"\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33K\3\2\2\2\35"+
		"N\3\2\2\2\37Q\3\2\2\2!T\3\2\2\2#W\3\2\2\2%Y\3\2\2\2\'_\3\2\2\2)a\3\2\2"+
		"\2+p\3\2\2\2-s\3\2\2\2/y\3\2\2\2\61\62\7*\2\2\62\4\3\2\2\2\63\64\7?\2"+
		"\2\64\6\3\2\2\2\65\66\7+\2\2\66\b\3\2\2\2\678\7/\2\28\n\3\2\2\29:\7#\2"+
		"\2:\f\3\2\2\2;<\7\61\2\2<\16\3\2\2\2=>\7,\2\2>\20\3\2\2\2?@\7-\2\2@\22"+
		"\3\2\2\2AB\7>\2\2B\24\3\2\2\2CD\7>\2\2DE\7?\2\2E\26\3\2\2\2FG\7@\2\2G"+
		"\30\3\2\2\2HI\7@\2\2IJ\7?\2\2J\32\3\2\2\2KL\7?\2\2LM\7?\2\2M\34\3\2\2"+
		"\2NO\7#\2\2OP\7?\2\2P\36\3\2\2\2QR\7(\2\2RS\7(\2\2S \3\2\2\2TU\7~\2\2"+
		"UV\7~\2\2V\"\3\2\2\2WX\7A\2\2X$\3\2\2\2YZ\7<\2\2Z&\3\2\2\2[`\t\2\2\2\\"+
		"]\7?\2\2]`\7?\2\2^`\7>\2\2_[\3\2\2\2_\\\3\2\2\2_^\3\2\2\2`(\3\2\2\2ae"+
		"\4c|\2bd\t\3\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f*\3\2\2\2ge\3"+
		"\2\2\2hq\7\62\2\2im\4\63;\2jl\4\62;\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn"+
		"\3\2\2\2nq\3\2\2\2om\3\2\2\2ph\3\2\2\2pi\3\2\2\2q,\3\2\2\2rt\t\4\2\2s"+
		"r\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\27\2\2x.\3\2\2\2"+
		"yz\7\61\2\2z{\7\61\2\2{\177\3\2\2\2|~\n\5\2\2}|\3\2\2\2~\u0081\3\2\2\2"+
		"\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0083\7\f\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\30\2\2\u0085\60"+
		"\3\2\2\2\t\2_empu\177\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}