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
		INTERVAL=9, SHORTHAND=10, MISSING=11, NO_CHORD=12, SEPARATOR=13, TIME=14, 
		WS_SEP=15, COMMENT=16, WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'('", "'/'", "NATURAL", "MODIFIER", "'b'", 
		"'#'", "INTERVAL", "SHORTHAND", "'*'", "'N'", "':'", "TIME", "WS_SEP", 
		"COMMENT", "WS"
	};
	public static final int
		RULE_timedChords = 0, RULE_timedChord = 1, RULE_startTime = 2, RULE_endTime = 3, 
		RULE_chords = 4, RULE_chord = 5, RULE_root = 6, RULE_natural = 7, RULE_modifier = 8, 
		RULE_shorthand = 9, RULE_components = 10, RULE_component = 11, RULE_missing = 12, 
		RULE_degree = 13, RULE_interval = 14, RULE_bass = 15;
	public static final String[] ruleNames = {
		"timedChords", "timedChord", "startTime", "endTime", "chords", "chord", 
		"root", "natural", "modifier", "shorthand", "components", "component", 
		"missing", "degree", "interval", "bass"
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
	public static class TimedChordsContext extends ParserRuleContext {
		public TimedChordContext timedChord(int i) {
			return getRuleContext(TimedChordContext.class,i);
		}
		public List<TimedChordContext> timedChord() {
			return getRuleContexts(TimedChordContext.class);
		}
		public TimedChordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timedChords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterTimedChords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitTimedChords(this);
		}
	}

	public final TimedChordsContext timedChords() throws RecognitionException {
		TimedChordsContext _localctx = new TimedChordsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_timedChords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIME) {
				{
				{
				setState(32); timedChord();
				}
				}
				setState(37);
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

	public static class TimedChordContext extends ParserRuleContext {
		public EndTimeContext endTime() {
			return getRuleContext(EndTimeContext.class,0);
		}
		public TerminalNode WS_SEP(int i) {
			return getToken(ChordLabelsParser.WS_SEP, i);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public List<TerminalNode> WS_SEP() { return getTokens(ChordLabelsParser.WS_SEP); }
		public StartTimeContext startTime() {
			return getRuleContext(StartTimeContext.class,0);
		}
		public TimedChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timedChord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterTimedChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitTimedChord(this);
		}
	}

	public final TimedChordContext timedChord() throws RecognitionException {
		TimedChordContext _localctx = new TimedChordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_timedChord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); startTime();
			setState(39); match(WS_SEP);
			setState(40); endTime();
			setState(41); match(WS_SEP);
			setState(42); chord();
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

	public static class StartTimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(ChordLabelsParser.TIME, 0); }
		public StartTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterStartTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitStartTime(this);
		}
	}

	public final StartTimeContext startTime() throws RecognitionException {
		StartTimeContext _localctx = new StartTimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(TIME);
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

	public static class EndTimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(ChordLabelsParser.TIME, 0); }
		public EndTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).enterEndTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChordLabelsListener ) ((ChordLabelsListener)listener).exitEndTime(this);
		}
	}

	public final EndTimeContext endTime() throws RecognitionException {
		EndTimeContext _localctx = new EndTimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(TIME);
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
		enterRule(_localctx, 8, RULE_chords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); chord();
				}
				}
				setState(51); 
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
		enterRule(_localctx, 10, RULE_chord);
		int _la;
		try {
			setState(68);
			switch (_input.LA(1)) {
			case NATURAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); root();
				setState(62);
				_la = _input.LA(1);
				if (_la==SEPARATOR) {
					{
					setState(54); match(SEPARATOR);
					setState(60);
					switch (_input.LA(1)) {
					case 3:
						{
						setState(55); components();
						}
						break;
					case INTERVAL:
					case SHORTHAND:
						{
						setState(56); shorthand();
						setState(58);
						_la = _input.LA(1);
						if (_la==3) {
							{
							setState(57); components();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(65);
				_la = _input.LA(1);
				if (_la==4) {
					{
					setState(64); bass();
					}
				}

				}
				break;
			case NO_CHORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(NO_CHORD);
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
		enterRule(_localctx, 12, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); natural();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(71); modifier();
				}
				}
				setState(76);
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
		enterRule(_localctx, 14, RULE_natural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(NATURAL);
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
		enterRule(_localctx, 16, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(MODIFIER);
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
		public TerminalNode INTERVAL() { return getToken(ChordLabelsParser.INTERVAL, 0); }
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
		enterRule(_localctx, 18, RULE_shorthand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==INTERVAL || _la==SHORTHAND) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 20, RULE_components);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(3);
			setState(84); component();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(85); match(2);
				setState(86); component();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); match(1);
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
		enterRule(_localctx, 22, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if (_la==MISSING) {
				{
				setState(94); missing();
				}
			}

			setState(97); degree();
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
		enterRule(_localctx, 24, RULE_missing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(MISSING);
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
		enterRule(_localctx, 26, RULE_degree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(101); modifier();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107); interval();
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
		enterRule(_localctx, 28, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(INTERVAL);
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
		enterRule(_localctx, 30, RULE_bass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111); match(4);
			setState(112); degree();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n\2\f"+
		"\2\16\2\'\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6\64\n\6"+
		"\r\6\16\6\65\3\7\3\7\3\7\3\7\3\7\5\7=\n\7\5\7?\n\7\5\7A\n\7\3\7\5\7D\n"+
		"\7\3\7\5\7G\n\7\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\f\3\f\3\r\5\rb\n\r\3\r\3"+
		"\r\3\16\3\16\3\17\7\17i\n\17\f\17\16\17l\13\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2"+
		"\13\fo\2%\3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n\63\3\2\2\2\fF\3"+
		"\2\2\2\16H\3\2\2\2\20O\3\2\2\2\22Q\3\2\2\2\24S\3\2\2\2\26U\3\2\2\2\30"+
		"a\3\2\2\2\32e\3\2\2\2\34j\3\2\2\2\36o\3\2\2\2 q\3\2\2\2\"$\5\4\3\2#\""+
		"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2()\5\6\4"+
		"\2)*\7\21\2\2*+\5\b\5\2+,\7\21\2\2,-\5\f\7\2-\5\3\2\2\2./\7\20\2\2/\7"+
		"\3\2\2\2\60\61\7\20\2\2\61\t\3\2\2\2\62\64\5\f\7\2\63\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2\2\67@\5\16\b\28>\7\17"+
		"\2\29?\5\26\f\2:<\5\24\13\2;=\5\26\f\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>"+
		"9\3\2\2\2>:\3\2\2\2?A\3\2\2\2@8\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5 \21\2"+
		"CB\3\2\2\2CD\3\2\2\2DG\3\2\2\2EG\7\16\2\2F\67\3\2\2\2FE\3\2\2\2G\r\3\2"+
		"\2\2HL\5\20\t\2IK\5\22\n\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\17"+
		"\3\2\2\2NL\3\2\2\2OP\7\7\2\2P\21\3\2\2\2QR\7\b\2\2R\23\3\2\2\2ST\t\2\2"+
		"\2T\25\3\2\2\2UV\7\5\2\2V[\5\30\r\2WX\7\4\2\2XZ\5\30\r\2YW\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\3\2\2_\27\3\2\2\2"+
		"`b\5\32\16\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\34\17\2d\31\3\2\2\2ef\7"+
		"\r\2\2f\33\3\2\2\2gi\5\22\n\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"km\3\2\2\2lj\3\2\2\2mn\5\36\20\2n\35\3\2\2\2op\7\13\2\2p\37\3\2\2\2qr"+
		"\7\6\2\2rs\5\34\17\2s!\3\2\2\2\r%\65<>@CFL[aj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}