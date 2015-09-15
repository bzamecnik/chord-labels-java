package com.harmoneye.music.chord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.List;

public class ChordLabelsToPitchClassesApp {

    // converts timed symbolic chord labels to explicit binary pitch class set
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 1) {
            System.err.println("Usage: app FILE.tsv");
            System.exit(-1);
        }
        String fileName = args[0];
        InputStreamReader reader = new InputStreamReader(new FileInputStream(
            fileName));
        List<TimedChordLabel> labels = new ChordLabels().parseTimedChords(reader);
        System.out.println("start\tend\troot\tbass\tC\tDb\tD\tEb\tE\tF\tGb\tG\tAb\tA\tBb\tB");
        for (TimedChordLabel label : labels) {
            System.out.print(label.getStartTime());
            System.out.print("\t" + label.getEndTime());
            ChordLabel chordLabel = label.getChordLabel();
            System.out.print("\t" + chordLabel.getRoot());
            System.out.print("\t" + chordLabel.getBass());
            for (Integer tone : chordLabel.getTonesAsBinarySet()) {
                System.out.print("\t" + tone);
            }
            System.out.println();
        }
        System.out.flush();
    }
}
