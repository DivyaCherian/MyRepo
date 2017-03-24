package com.cba.weathergame.simula;

import java.util.Random;

public final class RandomRange {

	// Generating random integers in the range 1..10.

	public static int getRandomInteger(int aStart, int aEnd, Random aRandom) {
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		// get the range, casting to long to avoid overflow problems
		long range = (long) aEnd - (long) aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long) (range * aRandom.nextDouble());
		return (int) (fraction + aStart);
	}

	public static double getRandomDecimal(double min, double max) {
		if (min > max) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		Random r = new Random();
		return (r.nextInt((int) ((max - min) * 10 + 1)) + min * 10) / 10.0;
	}

}
