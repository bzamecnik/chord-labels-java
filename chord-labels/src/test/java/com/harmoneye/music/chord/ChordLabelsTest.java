package com.harmoneye.music.chord;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ChordLabelsTest {

	@Test
	public void parseSomeChord() {
		String chordString = "C:(b3,5,b7)";

		ChordLabel chordLabel = new ChordLabels().parseChord(chordString);
		assertEquals(new ChordLabel(Arrays.asList(0, 10, 7, 3), 0, 0),
			chordLabel);
	}

	@Test
	public void parseInsaneChord() {
		String chordString = "Cb#b#:maj7(4,#9,*5,bb7)/b9";

		ChordLabel chordLabel = new ChordLabels().parseChord(chordString);
		System.out.println(chordLabel.getTones());
		assertEquals(new ChordLabel(Arrays.asList(0, 1, 3, 4, 5, 9, 11), 0, 1),
			chordLabel);
	}
}
