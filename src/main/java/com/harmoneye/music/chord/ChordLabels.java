package com.harmoneye.music.chord;

import com.harmoneye.music.chord.gen.ChordLabelsLexer;
import com.harmoneye.music.chord.gen.ChordLabelsParser;
import com.harmoneye.music.chord.gen.ChordLabelsParser.ChordsContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.TimedChordsContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class ChordLabels {

	// DEMO:
	// converts timed symbolic chord labels to explicit pitch class set label
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = args[0];
		InputStreamReader reader = new InputStreamReader(new FileInputStream(
			fileName));
		List<TimedChordLabel> labels = new ChordLabels()
			.parseTimedChords(reader);
		for (TimedChordLabel label : labels) {
			System.out.print(label.getStartTime());
			System.out.print(" " + label.getEndTime());
			System.out.println(" " + label.getChordLabel().getTones());
		}
	}

	public ChordLabel parseChord(String chord) {
		List<ChordLabel> chords = parseChords(chord);
		return chords.get(0);
	}

	public List<ChordLabel> parseChords(String chords) {
		return parseChords(new StringReader(chords));
	}

	public List<TimedChordLabel> parseTimedChords(String chords) {
		return parseTimedChords(new StringReader(chords));
	}

	public List<ChordLabel> parseChords(Reader inputReader) {
		ANTLRInputStream stream;
		try {
			stream = new ANTLRInputStream(inputReader);
		} catch (IOException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
		ChordLabelsLexer lexer = new ChordLabelsLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ChordLabelsParser parser = new ChordLabelsParser(tokens);
		ChordsContext chordContext = parser.chords();
		ParseTreeWalker walker = new ParseTreeWalker();
		ChordLabelsReader listener = new ChordLabelsReader();
		walker.walk(listener, chordContext);

		List<ChordLabel> chordLabels = listener.getChordLabels();
		return chordLabels;
	}

	public List<TimedChordLabel> parseTimedChords(Reader inputReader) {
		ANTLRInputStream stream;
		try {
			stream = new ANTLRInputStream(inputReader);
		} catch (IOException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
		ChordLabelsLexer lexer = new ChordLabelsLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ChordLabelsParser parser = new ChordLabelsParser(tokens);
		TimedChordsContext chordContext = parser.timedChords();
		ParseTreeWalker walker = new ParseTreeWalker();
		TimedChordLabelsReader listener = new TimedChordLabelsReader();
		walker.walk(listener, chordContext);

		return listener.getTimedChords();
	}
}
