package com.cba.weathergame.simula;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rasna Joseph
 * 
 */
public final class RandomRange {

	/**
	 * LOGGER initialized
	 */
	public static final Logger LOGGER = LoggerFactory
			.getLogger(RandomRange.class);

	/**
	 * @param aStart
	 * @param aEnd
	 * @param aRandom
	 * @return
	 */
	public static int getRandomInteger(int aStart, int aEnd, Random aRandom) {
		if (aStart > aEnd) {
			LOGGER.error("Start cannot exceed End.");
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		long range = (long) aEnd - (long) aStart + 1;
		long fraction = (long) (range * aRandom.nextDouble());
		return (int) (fraction + aStart);
	}

	/**
	 * @param min
	 * @param max
	 * @return
	 */
	public static double getRandomDecimal(double min, double max) {
		if (min > max) {
			LOGGER.error("Start cannot exceed End.");
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		Random r = new Random();
		return (r.nextInt((int) ((max - min) * 10 + 1)) + min * 10) / 10.0;
	}

}
