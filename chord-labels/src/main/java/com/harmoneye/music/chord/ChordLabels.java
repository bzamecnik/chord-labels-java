package com.harmoneye.music.chord;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.harmoneye.music.chord.gen.ChordLabelsLexer;
import com.harmoneye.music.chord.gen.ChordLabelsParser;
import com.harmoneye.music.chord.gen.ChordLabelsParser.ChordContext;

public class ChordLabels {

	public ChordLabel parseChord(String chord) {
		ChordLabelsLexer lexer = new ChordLabelsLexer(new ANTLRInputStream(
			chord));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ChordLabelsParser parser = new ChordLabelsParser(tokens);
		ChordContext chordContext = parser.chord();
		ParseTreeWalker walker = new ParseTreeWalker();
		ChordLabelsReader listener = new ChordLabelsReader();
		walker.walk(listener, chordContext);

		return listener.getChordLabel();
	}
}
