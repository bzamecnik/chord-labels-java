// Generated from ChordLabels.g4 by ANTLR 4.2.2
package com.harmoneye.music.chord.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChordLabelsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NATURAL=5, MODIFIER=6, FLAT=7, SHARP=8, 
		SHORTHAND=9, INTERVAL=10, MISSING=11, NO_CHORD=12, SEPARATOR=13, TIME=14, 
		WS_SEP=15, COMMENT=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "'/'", "NATURAL", "MODIFIER", "'b'", "'#'", "SHORTHAND", 
		"INTERVAL", "'*'", "'N'", "':'", "TIME", "WS_SEP", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "NATURAL", "MODIFIER", "FLAT", "SHARP", 
		"SHORTHAND", "INTERVAL", "MISSING", "NO_CHORD", "SEPARATOR", "TIME", "WS_SEP", 
		"COMMENT", "WS"
	};


	public ChordLabelsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChordLabels.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15: return COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return getCharPositionInLine()==1;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\5\13u\n\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\6\17~\n\17\r\17\16\17\177\3\17\3\17\6\17\u0084\n"+
		"\17\r\17\16\17\u0085\5\17\u0088\n\17\3\20\3\20\3\21\3\21\3\21\7\21\u008f"+
		"\n\21\f\21\16\21\u0092\13\21\3\21\3\21\3\22\6\22\u0097\n\22\r\22\16\22"+
		"\u0098\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\7\3\2\63;\3\2\62\65\3\2\62;"+
		"\4\2\13\13\"\"\4\2\f\f\17\17\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2"+
		"\2\t+\3\2\2\2\13-\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2\2\23"+
		"o\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2\35}\3\2\2\2"+
		"\37\u0089\3\2\2\2!\u008b\3\2\2\2#\u0096\3\2\2\2%&\7+\2\2&\4\3\2\2\2\'"+
		"(\7.\2\2(\6\3\2\2\2)*\7*\2\2*\b\3\2\2\2+,\7\61\2\2,\n\3\2\2\2-.\4CI\2"+
		".\f\3\2\2\2/\62\5\17\b\2\60\62\5\21\t\2\61/\3\2\2\2\61\60\3\2\2\2\62\16"+
		"\3\2\2\2\63\64\7d\2\2\64\20\3\2\2\2\65\66\7%\2\2\66\22\3\2\2\2\678\7o"+
		"\2\289\7c\2\29p\7l\2\2:;\7o\2\2;<\7k\2\2<p\7p\2\2=>\7f\2\2>?\7k\2\2?p"+
		"\7o\2\2@A\7c\2\2AB\7w\2\2Bp\7i\2\2CD\7o\2\2DE\7c\2\2EF\7l\2\2Fp\79\2\2"+
		"GH\7o\2\2HI\7k\2\2IJ\7p\2\2Jp\79\2\2KL\7f\2\2LM\7k\2\2MN\7o\2\2Np\79\2"+
		"\2OP\7j\2\2PQ\7f\2\2QR\7k\2\2RS\7o\2\2Sp\79\2\2TU\7o\2\2UV\7k\2\2VW\7"+
		"p\2\2WX\7o\2\2XY\7c\2\2YZ\7l\2\2Zp\79\2\2[\\\7o\2\2\\]\7c\2\2]^\7l\2\2"+
		"^p\78\2\2_`\7o\2\2`a\7k\2\2ab\7p\2\2bp\78\2\2cd\7o\2\2de\7c\2\2ef\7l\2"+
		"\2fp\7;\2\2gh\7o\2\2hi\7k\2\2ij\7p\2\2jp\7;\2\2kl\7u\2\2lm\7w\2\2mn\7"+
		"u\2\2np\7\66\2\2o\67\3\2\2\2o:\3\2\2\2o=\3\2\2\2o@\3\2\2\2oC\3\2\2\2o"+
		"G\3\2\2\2oK\3\2\2\2oO\3\2\2\2oT\3\2\2\2o[\3\2\2\2o_\3\2\2\2oc\3\2\2\2"+
		"og\3\2\2\2ok\3\2\2\2p\24\3\2\2\2qu\t\2\2\2rs\7\63\2\2su\t\3\2\2tq\3\2"+
		"\2\2tr\3\2\2\2u\26\3\2\2\2vw\7,\2\2w\30\3\2\2\2xy\7P\2\2y\32\3\2\2\2z"+
		"{\7<\2\2{\34\3\2\2\2|~\t\4\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0087\3\2\2\2\u0081\u0083\7\60\2\2\u0082\u0084\t"+
		"\4\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\36\3\2\2\2\u0089\u008a\t\5\2\2\u008a \3\2\2\2\u008b\u008c\6"+
		"\21\2\2\u008c\u0090\7%\2\2\u008d\u008f\n\6\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\b\21\2\2\u0094\"\3\2\2\2\u0095\u0097"+
		"\t\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\22\2\2\u009b$\3\2\2\2"+
		"\13\2\61ot\177\u0085\u0087\u0090\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}