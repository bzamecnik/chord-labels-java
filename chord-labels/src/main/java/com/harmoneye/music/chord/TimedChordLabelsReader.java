package com.harmoneye.music.chord;

import java.util.ArrayList;
import java.util.List;

import com.harmoneye.music.chord.gen.ChordLabelsParser.EndTimeContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.StartTimeContext;
import com.harmoneye.music.chord.gen.ChordLabelsParser.TimedChordContext;

public class TimedChordLabelsReader extends ChordLabelsReader {

	private List<TimedChordLabel> timedChordLabels = new ArrayList<TimedChordLabel>();

	private double startTime;
	private double endTime;
	
	public List<TimedChordLabel> getTimedChords() {
		return timedChordLabels;
	}
	
	@Override
	public void enterStartTime(StartTimeContext ctx) {
		startTime = Double.parseDouble(ctx.getText());
	}
	
	@Override
	public void enterEndTime(EndTimeContext ctx) {
		endTime = Double.parseDouble(ctx.getText());
	}
	
	@Override
	public void exitTimedChord(TimedChordContext ctx) {
		TimedChordLabel timedChordLabel = new TimedChordLabel(startTime, endTime, getChordLabel());
		timedChordLabels.add(timedChordLabel);
	}

}
