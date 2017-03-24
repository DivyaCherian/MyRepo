package com.cba.weathergame.bootstrap;

import com.cba.weathergame.files.SeedFileReader;
import com.cba.weathergame.simula.WeatherConstants;
import com.cba.weathergame.simula.WeatherSeed;
import com.cba.weathergame.simula.WeatherSimulator;

public class WeatherGame {
	

	public static void main(String args[]) {

		int minOutRecords = Integer.parseInt(args[0].trim());
		SeedFileReader fRead = new SeedFileReader();
		WeatherSeed weatherSeed = new WeatherSeed(fRead.readSeedFile(WeatherConstants.INFILE));
		WeatherSimulator simulator = new WeatherSimulator(weatherSeed);
		simulator.generateNSimulatedRecords(minOutRecords);
	}
}
