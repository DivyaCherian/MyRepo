package com.cba.weathergame.bootstrap;

import com.cba.weathergame.files.SeedFileReader;
import com.cba.weathergame.simula.WeatherSeed;
import com.cba.weathergame.simula.WeatherSimulator;

public class WeatherGame {
	private static final String FILENAME = "weather_seed.txt";

	public static void main(String args[]) {

		int numRecords = Integer.parseInt(args[0].trim());

		SeedFileReader fRead = new SeedFileReader();
		WeatherSeed weatherSeed = new WeatherSeed(fRead.readSeedFile(FILENAME));
		WeatherSimulator simulator = new WeatherSimulator(weatherSeed);
		simulator.generateNSimulatedRecords(numRecords);
	}
}
