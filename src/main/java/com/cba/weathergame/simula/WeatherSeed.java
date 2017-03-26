package com.cba.weathergame.simula;

import java.util.List;

/**
 * @author Rasna Joseph
 *
 */
public class WeatherSeed {

	/**
	 * 
	 */
	public List<SimulaRecord> simulaRecordList;

	/**
	 * @return
	 */
	public int seedRecordCount() {
		return simulaRecordList.size();
	}

	/**
	 * @param simulaRecordList
	 */
	public WeatherSeed(List<SimulaRecord> simulaRecordList) {
		this.simulaRecordList = simulaRecordList;
	}

}