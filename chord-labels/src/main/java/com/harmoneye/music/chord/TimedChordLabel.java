package com.harmoneye.music.chord;

public class TimedChordLabel {
	private double startTime;
	private double endTime;
	private ChordLabel chord;

	public TimedChordLabel(double startTime, double endTime, ChordLabel chord) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.chord = chord;
	}

	public double getStartTime() {
		return startTime;
	}

	public double getEndTime() {
		return endTime;
	}

	public ChordLabel getChordLabel() {
		return chord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chord == null) ? 0 : chord.hashCode());
		long temp;
		temp = Double.doubleToLongBits(endTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(startTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		TimedChordLabel other = (TimedChordLabel) obj;
		if (chord == null) {
			if (other.chord != null)
				return false;
		} else if (!chord.equals(other.chord))
			return false;
		if (Double.doubleToLongBits(endTime) != Double
			.doubleToLongBits(other.endTime))
			return false;
		if (Double.doubleToLongBits(startTime) != Double
			.doubleToLongBits(other.startTime))
			return false;
		return true;
	}

}
