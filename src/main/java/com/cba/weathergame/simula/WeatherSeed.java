package com.cba.weathergame.simula;

import java.util.List;

public class WeatherSeed {

	public List<SimulaRecord> simulaRecordList;

	public int seedRecordCount() {
		return simulaRecordList.size();
	}

	public WeatherSeed(List<SimulaRecord> simulaRecordList) {
		this.simulaRecordList = simulaRecordList;
	}

}