package com.harmoneye.music.chord;

import com.harmoneye.music.chord.ChordLabel.Builder;
import com.harmoneye.music.chord.gen.ChordLabelsBaseListener;
import com.harmoneye.music.chord.gen.ChordLabelsParser;
import com.harmoneye.music.chord.gen.ChordLabelsParser.ComponentContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.DegreeContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.IntervalContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.MissingContext;

public class ChordLabelsReader extends ChordLabelsBaseListener {

	private static final String DEFAULT_SHORTHAND = "maj";

	private Builder chordBuilder;

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
	
	@Override
	public void enterModifier(ChordLabelsParser.ModifierContext ctx) {
		System.out.println("enter modifier: " + ctx.getText());
		pitchClass += pitchClassFromModifier(ctx.getText());
	}

	@Override
	public void exitModifier(ChordLabelsParser.ModifierContext ctx) {
		System.out.println("exit modifier: " + ctx.getText());
	}

	@Override
	public void enterShorthand(ChordLabelsParser.ShorthandContext ctx) {
		System.out.println("enter shorthand: " + ctx.getText());
		chordBuilder.addShorthand(ctx.getText());
		anyComponentSpecified = true;
	}

	@Override
	public void exitShorthand(ChordLabelsParser.ShorthandContext ctx) {
		System.out.println("exit shorthand: " + ctx.getText());
	}

	@Override
	public void enterRoot(ChordLabelsParser.RootContext ctx) {
		System.out.println("enter root: " + ctx.getText());
	}

	@Override
	public void exitRoot(ChordLabelsParser.RootContext ctx) {
		System.out.println("exit root: " + ctx.getText());
		chordBuilder.root(pitchClass);
	}

	@Override
	public void enterBass(ChordLabelsParser.BassContext ctx) {
		System.out.println("enter bass: " + ctx.getText());
		pitchClass = 0;
	}

	@Override
	public void exitBass(ChordLabelsParser.BassContext ctx) {
		System.out.println("exit bass: " + ctx.getText());
		chordBuilder.bass(pitchClass);
	}

	@Override
	public void enterComponents(ChordLabelsParser.ComponentsContext ctx) {
		System.out.println("enter components: " + ctx.getText());
	}

	@Override
	public void exitComponents(ChordLabelsParser.ComponentsContext ctx) {
		System.out.println("exit components: " + ctx.getText());
	}

	@Override
	public void enterNatural(ChordLabelsParser.NaturalContext ctx) {
		System.out.println("enter natural: " + ctx.getText());
		pitchClass = pitchClassFromNatural(ctx.getText());
	}

	@Override
	public void exitNatural(ChordLabelsParser.NaturalContext ctx) {
		System.out.println("exit natural: " + ctx.getText());
	}

	@Override
	public void enterComponent(ComponentContext ctx) {
		System.out.println("enter component: " + ctx.getText());
		shouldAddComponent = true;
		pitchClass = 0;
		anyComponentSpecified = true;
	}

	@Override
	public void exitComponent(ComponentContext ctx) {
		System.out.println("exit component: " + ctx.getText());
		if (shouldAddComponent) {
			chordBuilder.add(pitchClass);
		} else {
			chordBuilder.remove(pitchClass);
		}
	}

	@Override
	public void enterDegree(DegreeContext ctx) {
		System.out.println("enter degree: " + ctx.getText());
	}

	@Override
	public void exitDegree(DegreeContext ctx) {
		System.out.println("exit degree: " + ctx.getText());
	}

	@Override
	public void enterInterval(IntervalContext ctx) {
		System.out.println("enter interval: " + ctx.getText());
		int interval = Integer.valueOf(ctx.getText());
		pitchClass += pitchClassFromInterval(interval);
	}

	@Override
	public void exitInterval(IntervalContext ctx) {
		System.out.println("exit interval: " + ctx.getText());
	}

	@Override
	public void enterMissing(MissingContext ctx) {
		System.out.println("enter missing: " + ctx.getText());
		shouldAddComponent = false;
	}

	@Override
	public void exitMissing(MissingContext ctx) {
		System.out.println("exit missing: " + ctx.getText());
	}

	@Override
	public void enterChord(ChordLabelsParser.ChordContext ctx) {
		System.out.println("enter chord: " + ctx.getText());
		chordBuilder = Builder.create();
		anyComponentSpecified = false;
	}

	@Override
	public void exitChord(ChordLabelsParser.ChordContext ctx) {
		System.out.println("exit chord: " + ctx.getText());
		if (!anyComponentSpecified) {
			chordBuilder.addShorthand(DEFAULT_SHORTHAND);
		}
		chordLabel = chordBuilder.build();
	}
	
	public ChordLabel getChordLabel() {
		return chordLabel;
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
			return 11;
		} else if ("#".equals(modifier)) {
			return 1;
		}
		throw new IllegalArgumentException(modifier);
	}

	private static int modulo(int value, int base) {
		return ((value % base) + base) % base;
	}
}
