package com.cba.weathergame.simula;

import java.util.List;


public class WeatherSimulator {

	private WeatherSeed weatherSeed;

	public WeatherSimulator(WeatherSeed weatherSeed) {
		this.weatherSeed = weatherSeed;

	}

	public void generateNSimulatedRecords(int N) {
		// Randomly choose
		if (N <= weatherSeed.seedRecordCount()) {
			List<SimulaRecord> simulaRecordList = weatherSeed.getSimulaRecordList();
			//print necessary from list

		} else {
			
			List<SimulaRecord> simulaRecordList = weatherSeed.getSimulaRecordList();
			
			// Generate N records and send back

			// read position,city
			// time

		}
	}

	// Additional methods for Algo

}
