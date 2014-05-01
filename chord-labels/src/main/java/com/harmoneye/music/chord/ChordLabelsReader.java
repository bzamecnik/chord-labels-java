package com.harmoneye.music.chord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.harmoneye.music.chord.ChordLabel.Builder;
import com.harmoneye.music.chord.gen.ChordLabelsBaseListener;
import com.harmoneye.music.chord.gen.ChordLabelsParser;
import com.harmoneye.music.chord.gen.ChordLabelsParser.ComponentContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.IntervalContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.MissingContext;

public class ChordLabelsReader extends ChordLabelsBaseListener {

	private static final int OCTAVE_SIZE = 12;
	private static final String DEFAULT_SHORTHAND = "maj";
	private static final Map<String, List<Integer>> SHORTHANDS;
	static {
		HashMap<String, List<Integer>> s = new HashMap<String, List<Integer>>();
		s.put("maj", tones(4, 7));
		s.put("min", tones(3, 7));
		s.put("dim", tones(3, 6));
		s.put("aug", tones(4, 8));
		s.put("maj7", tones(4, 7, 11));
		s.put("min7", tones(3, 7, 10));
		s.put("7", tones(4, 7, 10));
		s.put("dim7", tones(3, 6, 9));
		s.put("hdim7", tones(3, 6, 10));
		s.put("minmaj7", tones(3, 7, 11));
		s.put("maj6", tones(4, 7, 9));
		s.put("min6", tones(3, 7, 9));
		s.put("9", tones(4, 7, 10, 2));
		s.put("maj9", tones(4, 7, 11, 2));
		s.put("min9", tones(3, 7, 10, 2));
		s.put("sus4", tones(5, 7));
		s.put("sus2", tones(2, 7));
		SHORTHANDS = s;
	}

	private Builder chordBuilder;
	private List<ChordLabel> chordLabels = new ArrayList<ChordLabel>();

	/**
	 * Currently processed pitch class. For root tone it is absolute, for
	 * components (including the bass tone) it is relative to the root.
	 * 
	 * This variable might be modified by the diatonic natural tone symbol (for
	 * root), diatonic interval symbol (for further components) and flat/sharp
	 * modifiers.
	 */
	private int pitchClass;
	/**
	 * Indicates whether the current component should be added (default) or
	 * removed as marked by an asterisk (*).
	 */
	private boolean shouldAddComponent = true;
	private boolean anyComponentSpecified = false;
	
	private ChordLabel chordLabel;

	public List<ChordLabel> getChordLabels() {
		return chordLabels;
	}
	
	protected ChordLabel getChordLabel() {
		return chordLabel;
	}

	@Override
	public void enterModifier(ChordLabelsParser.ModifierContext ctx) {
		pitchClass += pitchClassFromModifier(ctx.getText());
	}

	@Override
	public void enterShorthand(ChordLabelsParser.ShorthandContext ctx) {
		chordBuilder.addShorthand(ctx.getText());
		anyComponentSpecified = true;
	}

	@Override
	public void exitRoot(ChordLabelsParser.RootContext ctx) {
		chordBuilder.root(pitchClass);
	}

	@Override
	public void enterBass(ChordLabelsParser.BassContext ctx) {
		pitchClass = 0;
	}

	@Override
	public void exitBass(ChordLabelsParser.BassContext ctx) {
		chordBuilder.bass(pitchClass);
	}

	@Override
	public void enterNatural(ChordLabelsParser.NaturalContext ctx) {
		pitchClass = pitchClassFromNatural(ctx.getText());
	}

	@Override
	public void enterComponent(ComponentContext ctx) {
		shouldAddComponent = true;
		pitchClass = 0;
		anyComponentSpecified = true;
	}

	@Override
	public void exitComponent(ComponentContext ctx) {
		if (shouldAddComponent) {
			chordBuilder.add(pitchClass);
		} else {
			chordBuilder.remove(pitchClass);
		}
	}

	@Override
	public void enterInterval(IntervalContext ctx) {
		int interval = Integer.valueOf(ctx.getText());
		pitchClass += pitchClassFromInterval(interval);
	}

	@Override
	public void enterMissing(MissingContext ctx) {
		shouldAddComponent = false;
	}

	@Override
	public void enterChord(ChordLabelsParser.ChordContext ctx) {
		chordBuilder = Builder.create(SHORTHANDS, OCTAVE_SIZE);
		anyComponentSpecified = false;
	}

	@Override
	public void exitChord(ChordLabelsParser.ChordContext ctx) {
		if (!anyComponentSpecified) {
			chordBuilder.addShorthand(DEFAULT_SHORTHAND);
		}
		chordBuilder.title(ctx.getText());
		chordLabel = chordBuilder.build();
		chordLabels.add(chordLabel);
	}

	private int pitchClassFromNatural(String natural) {
		if ("A".equals(natural)) {
			return 9;
		} else if ("B".equals(natural)) {
			return 11;
		} else if ("C".equals(natural)) {
			return 0;
		} else if ("D".equals(natural)) {
			return 2;
		} else if ("E".equals(natural)) {
			return 4;
		} else if ("F".equals(natural)) {
			return 5;
		} else if ("G".equals(natural)) {
			return 7;
		}
		throw new IllegalArgumentException(natural);
	}

	private int pitchClassFromInterval(int interval) {
		interval = modulo(interval - 1, 7) + 1;
		switch (interval) {
		case 1:
			return 0;
		case 2:
			return 2;
		case 3:
			return 4;
		case 4:
			return 5;
		case 5:
			return 7;
		case 6:
			return 9;
		case 7:
			return 11;
		default:
			throw new IllegalArgumentException(String.valueOf(interval));
		}
	}

	private int pitchClassFromModifier(String modifier) {
		if ("b".equals(modifier)) {
			return OCTAVE_SIZE - 1;
		} else if ("#".equals(modifier)) {
			return 1;
		}
		throw new IllegalArgumentException(modifier);
	}

	private static List<Integer> tones(int... tones) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer tone : tones) {
			list.add(tone);
		}
		return list;
	}

	private static int modulo(int value, int base) {
		return ((value % base) + base) % base;
	}
}
