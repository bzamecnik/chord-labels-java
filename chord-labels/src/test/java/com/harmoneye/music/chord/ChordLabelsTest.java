package com.harmoneye.music.chord;

import static org.junit.Assert.*;

import java.util.List;
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
		assertEquals(new ChordLabel(Arrays.asList(0, 1, 3, 4, 5, 9, 11), 0, 1),
			chordLabel);
	}
	
	@Test
	public void parseMultipleChords() {
		String chordString = "C:min7\nD:maj\nE:7";

		List<ChordLabel> chordLabels = new ChordLabels().parseChords(chordString);
		assertEquals(new ChordLabel(Arrays.asList(0, 10, 7, 3), 0, 0),
			chordLabels.get(0));
		assertEquals(new ChordLabel(Arrays.asList(2, 6, 9), 2, 2),
			chordLabels.get(1));
		assertEquals(new ChordLabel(Arrays.asList(4, 8, 11, 2), 4, 4),
			chordLabels.get(2));
	}
	
	@Test
	public void parseSeventhChord() {
		String chordString = "E:7";

		ChordLabel chordLabel = new ChordLabels().parseChord(chordString);
		assertEquals(new ChordLabel(Arrays.asList(4, 8, 11, 2), 4, 4),
			chordLabel);
	}
}
