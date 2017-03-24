package com.cba.weathergame.simula;

import java.util.List;

public class WeatherSeed {

	private List<SimulaRecord> simulaRecordList;

	public int seedRecordCount() {
		return simulaRecordList.size();
	}

	public List<SimulaRecord> getSimulaRecordList() {
		return simulaRecordList;
	}

	public void setSimulaRecordList(List<SimulaRecord> simulaRecordList) {
		this.simulaRecordList = simulaRecordList;
	}

}