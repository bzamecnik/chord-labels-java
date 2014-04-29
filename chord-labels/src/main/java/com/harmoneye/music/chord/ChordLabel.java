package com.harmoneye.music.chord;

import java.util.ArrayList;
import java.util.Collections;
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

	public static class Builder {
		private int octaveSize;
		private Map<String, List<Integer>> shorthands;

		private Set<Integer> relativeTones = new HashSet<Integer>();
		private Integer absRoot;
		private Integer relativeBass;

		private Builder(Map<String, List<Integer>> shorthands, int octaveSize) {
			this.shorthands = shorthands;
			this.octaveSize = octaveSize;
		}

		public static Builder create(Map<String, List<Integer>> shorthands,
			int octaveSize) {
			return new Builder(shorthands, octaveSize);
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
			List<Integer> tones = shorthands.get(name);
			for (Integer tone : tones) {
				add(tone);
			}
		}

		public ChordLabel build() {
			if (absRoot == null) {
				absRoot = 0;
				relativeBass = 0;
				relativeTones = Collections.emptySet();
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

		private int pitchClass(int tone) {
			return modulo(tone, octaveSize);
		}

		private static int modulo(int value, int base) {
			return ((value % base) + base) % base;
		}
	}
}
