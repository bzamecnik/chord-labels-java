// Generated from ChordLabels.g4 by ANTLR 4.2.2
package com.harmoneye.music.chord.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChordLabelsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NATURAL=5, MODIFIER=6, FLAT=7, SHARP=8, 
		INTERVAL=9, SHORTHAND=10, MISSING=11, NO_CHORD=12, SEPARATOR=13, COMMENT=14, 
		WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'('", "'/'", "NATURAL", "MODIFIER", "'b'", 
		"'#'", "INTERVAL", "SHORTHAND", "'*'", "'N'", "':'", "COMMENT", "WS"
	};
	public static final int
		RULE_chords = 0, RULE_chord = 1, RULE_root = 2, RULE_natural = 3, RULE_modifier = 4, 
		RULE_shorthand = 5, RULE_components = 6, RULE_component = 7, RULE_missing = 8, 
		RULE_degree = 9, RULE_interval = 10, RULE_bass = 11;
	public static final String[] ruleNames = {
		"chords", "chord", "root", "natural", "modifier", "shorthand", "components", 
		"component", "missing", "degree", "interval", "bass"
	};

	@Override
	public String getGrammarFileName() { return "ChordLabels.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChordLabelsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChordsContext extends ParserRuleContext {
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public ChordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterChords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitChords(this);
		}
	}

	public final ChordsContext chords() throws RecognitionException {
		ChordsContext _localctx = new ChordsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24); chord();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NATURAL || _la==NO_CHORD );
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

	public static class ChordContext extends ParserRuleContext {
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public TerminalNode NO_CHORD() { return getToken(ChordLabelsParser.NO_CHORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(ChordLabelsParser.SEPARATOR, 0); }
		public BassContext bass() {
			return getRuleContext(BassContext.class,0);
		}
		public ShorthandContext shorthand() {
			return getRuleContext(ShorthandContext.class,0);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_chord);
		int _la;
		try {
			setState(44);
			switch (_input.LA(1)) {
			case NATURAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(29); root();
				setState(38);
				_la = _input.LA(1);
				if (_la==SEPARATOR) {
					{
					setState(30); match(SEPARATOR);
					setState(36);
					switch (_input.LA(1)) {
					case 3:
						{
						setState(31); components();
						}
						break;
					case SHORTHAND:
						{
						setState(32); shorthand();
						setState(34);
						_la = _input.LA(1);
						if (_la==3) {
							{
							setState(33); components();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(41);
				_la = _input.LA(1);
				if (_la==4) {
					{
					setState(40); bass();
					}
				}

				}
				break;
			case NO_CHORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); match(NO_CHORD);
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

	public static class RootContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public NaturalContext natural() {
			return getRuleContext(NaturalContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); natural();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(47); modifier();
				}
				}
				setState(52);
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

	public static class NaturalContext extends ParserRuleContext {
		public TerminalNode NATURAL() { return getToken(ChordLabelsParser.NATURAL, 0); }
		public NaturalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterNatural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitNatural(this);
		}
	}

	public final NaturalContext natural() throws RecognitionException {
		NaturalContext _localctx = new NaturalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_natural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(NATURAL);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(ChordLabelsParser.MODIFIER, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(MODIFIER);
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

	public static class ShorthandContext extends ParserRuleContext {
		public TerminalNode SHORTHAND() { return getToken(ChordLabelsParser.SHORTHAND, 0); }
		public ShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorthand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitShorthand(this);
		}
	}

	public final ShorthandContext shorthand() throws RecognitionException {
		ShorthandContext _localctx = new ShorthandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(SHORTHAND);
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

	public static class ComponentsContext extends ParserRuleContext {
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitComponents(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_components);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(3);
			setState(60); component();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(61); match(2);
				setState(62); component();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68); match(1);
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

	public static class ComponentContext extends ParserRuleContext {
		public DegreeContext degree() {
			return getRuleContext(DegreeContext.class,0);
		}
		public MissingContext missing() {
			return getRuleContext(MissingContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if (_la==MISSING) {
				{
				setState(70); missing();
				}
			}

			setState(73); degree();
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

	public static class MissingContext extends ParserRuleContext {
		public TerminalNode MISSING() { return getToken(ChordLabelsParser.MISSING, 0); }
		public MissingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterMissing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitMissing(this);
		}
	}

	public final MissingContext missing() throws RecognitionException {
		MissingContext _localctx = new MissingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_missing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(MISSING);
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

	public static class DegreeContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public DegreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitDegree(this);
		}
	}

	public final DegreeContext degree() throws RecognitionException {
		DegreeContext _localctx = new DegreeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_degree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(77); modifier();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); interval();
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(ChordLabelsParser.INTERVAL, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(INTERVAL);
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

	public static class BassContext extends ParserRuleContext {
		public DegreeContext degree() {
			return getRuleContext(DegreeContext.class,0);
		}
		public BassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterBass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitBass(this);
		}
	}

	public final BassContext bass() throws RecognitionException {
		BassContext _localctx = new BassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(87); match(4);
			setState(88); degree();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\5\3%\n\3"+
		"\5\3\'\n\3\5\3)\n\3\3\3\5\3,\n\3\3\3\5\3/\n\3\3\4\3\4\7\4\63\n\4\f\4\16"+
		"\4\66\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\bB\n\b\f\b\16\bE"+
		"\13\b\3\b\3\b\3\t\5\tJ\n\t\3\t\3\t\3\n\3\n\3\13\7\13Q\n\13\f\13\16\13"+
		"T\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\2Z\2\33\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\67\3\2\2\2\n9\3"+
		"\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20I\3\2\2\2\22M\3\2\2\2\24R\3\2\2\2\26W"+
		"\3\2\2\2\30Y\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37(\5\6\4\2 &\7\17\2\2!\'\5\16\b\2\""+
		"$\5\f\7\2#%\5\16\b\2$#\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&!\3\2\2\2&\"\3\2\2"+
		"\2\')\3\2\2\2( \3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\30\r\2+*\3\2\2\2+,\3\2"+
		"\2\2,/\3\2\2\2-/\7\16\2\2.\37\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\64\5\b\5"+
		"\2\61\63\5\n\6\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\65\7\3\2\2\2\66\64\3\2\2\2\678\7\7\2\28\t\3\2\2\29:\7\b\2\2:\13\3\2"+
		"\2\2;<\7\f\2\2<\r\3\2\2\2=>\7\5\2\2>C\5\20\t\2?@\7\4\2\2@B\5\20\t\2A?"+
		"\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\3\2\2G"+
		"\17\3\2\2\2HJ\5\22\n\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\24\13\2L\21\3"+
		"\2\2\2MN\7\r\2\2N\23\3\2\2\2OQ\5\n\6\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2R"+
		"S\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\5\26\f\2V\25\3\2\2\2WX\7\13\2\2X\27\3"+
		"\2\2\2YZ\7\6\2\2Z[\5\24\13\2[\31\3\2\2\2\f\35$&(+.\64CIR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}