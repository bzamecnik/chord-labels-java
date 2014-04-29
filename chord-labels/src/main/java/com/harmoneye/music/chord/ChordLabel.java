package com.harmoneye.music.chord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChordLabel {
	private List<Integer> tones;
	private int root;
	private int bass;

	public ChordLabel(List<Integer> tones, int root, int bass) {
		this.tones = new ArrayList<Integer>(new HashSet<Integer>(tones));
		Collections.sort(this.tones);
		this.root = root;
		this.bass = bass;
	}

	public List<Integer> getTones() {
		return tones;
	}

	public int getRoot() {
		return root;
	}

	public int getBass() {
		return bass;
	}

	public static class Builder {
		private static final int OCTAVE_SIZE = 12;

		private static final Map<String, List<Integer>> SHORTHANDS;
		static {
			HashMap<String, List<Integer>> s = new HashMap<String, List<Integer>>();
			s.put("maj", tones(4, 7));
			s.put("min", tones(3, 7));
			s.put("dim", tones(3, 6));
			s.put("aug", tones(4, 8));
			s.put("maj7", tones(4, 7, 11));
			s.put("min7", tones(3, 7, 10));
			s.put("7", tones(4, 7, 19));
			s.put("dim7", tones(3, 6, 9));
			s.put("hdim7", tones(3, 6, 10));
			s.put("minmaj7", tones(3, 7, 11));
			s.put("maj6", tones(4, 7, 9));
			s.put("min6", tones(3, 7, 9));
			s.put("9", tones(4, 7, 10, 2));
			s.put("maj9", tones(4, 7, 11, 2));
			s.put("min9", tones(3, 7, 10, 2));
			s.put("sus4", tones(5, 7));
			SHORTHANDS = s;
		}

		private Set<Integer> relativeTones = new HashSet<Integer>();
		private Integer absRoot;
		private Integer relativeBass;

		public static Builder create() {
			return new Builder();
		}

		public Builder root(int absRoot) {
			this.absRoot = absRoot;
			relativeTones.add(0);
			return this;
		}

		public Builder bass(int relativeBass) {
			this.relativeBass = relativeBass;
			relativeTones.add(relativeBass);
			return this;
		}

		public Builder add(int relativeTone) {
			relativeTones.add(relativeTone);
			return this;
		}

		public Builder remove(int relativeTone) {
			relativeTones.remove(relativeTone);
			return this;
		}

		public void addShorthand(String name) {
			List<Integer> tones = SHORTHANDS.get(name);
			for (Integer tone : tones) {
				add(tone);
			}
		}

		public ChordLabel build() {
			if (absRoot == null) {
				return null;
			}
			if (relativeBass == null) {
				relativeBass = 0;
			}
			List<Integer> absTones = new ArrayList<Integer>();
			for (Integer relativeTone : relativeTones) {
				absTones.add(pitchClass(relativeTone + absRoot));
			}
			return new ChordLabel(absTones, pitchClass(absRoot),
				pitchClass(relativeBass + absRoot));
		}

		private static int pitchClass(int tone) {
			return modulo(tone, OCTAVE_SIZE);
		}

		private static int modulo(int value, int base) {
			return ((value % base) + base) % base;
		}

		private static List<Integer> tones(int... tones) {
			List<Integer> list = new ArrayList<Integer>();
			for (Integer tone : tones) {
				list.add(tone);
			}
			return list;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bass;
		result = prime * result + root;
		result = prime * result + ((tones == null) ? 0 : tones.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChordLabel other = (ChordLabel) obj;
		if (bass != other.bass)
			return false;
		if (root != other.root)
			return false;
		if (tones == null) {
			if (other.tones != null)
				return false;
		} else if (!tones.equals(other.tones))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChordLabel [tones=" + tones + ", root=" + root + ", bass="
			+ bass + "]";
	}

}
