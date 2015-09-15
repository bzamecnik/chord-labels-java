package com.harmoneye.music.chord;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TimedChordLabelsTest {
	private static final double EPS = 1e-6;

	@Test
	public void parseMultipleChords() {
		String chordString = "0.000 2.123 C:min7\n" + "2.500 3.456 D:maj\n"
			+ "4.0 5.000 E:maj7";

		List<TimedChordLabel> chordLabels = new ChordLabels()
			.parseTimedChords(chordString);

		{
			TimedChordLabel timedLabel = chordLabels.get(0);
			assertEquals(0.0, timedLabel.getStartTime(), EPS);
			assertEquals(2.123, timedLabel.getEndTime(), EPS);
			assertEquals(new ChordLabel(Arrays.asList(0, 10, 7, 3), 0, 0),
				timedLabel.getChordLabel());
		}

		{
			TimedChordLabel timedLabel = chordLabels.get(1);
			assertEquals(2.5, timedLabel.getStartTime(), EPS);
			assertEquals(3.456, timedLabel.getEndTime(), EPS);
			assertEquals(new ChordLabel(Arrays.asList(2, 6, 9), 2, 2),
				timedLabel.getChordLabel());
		}

		{
			TimedChordLabel timedLabel = chordLabels.get(2);
			assertEquals(4, timedLabel.getStartTime(), EPS);
			assertEquals(5, timedLabel.getEndTime(), EPS);
			assertEquals(new ChordLabel(Arrays.asList(4, 8, 11, 3), 4, 4),
				timedLabel.getChordLabel());
		}
	}

}
