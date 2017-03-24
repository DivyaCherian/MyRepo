package com.cba.weathergame.simula;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class SimulaRecord {
	public String cityName;
	public String location_lat;
	public String location_long;
	public String location_elevation;
	public DateTime day;
	public String conditions;
	public String temperature;
	public String pressure;
	public String himidity;

	public SimulaRecord(String[] seeds) {
		int index = 0;
		this.cityName = seeds[index++];
		this.location_lat = seeds[index++];
		this.location_long = seeds[index++];
		this.location_elevation = seeds[index++];

		DateTimeFormatter formatter = DateTimeFormat
				.forPattern("dd/MM/yyyy HH:mm:ss");
		this.day = formatter.parseDateTime(seeds[index++]);
		this.conditions = seeds[index++];
		this.temperature = seeds[index++];
		this.pressure = seeds[index++];
		this.himidity = seeds[index++];
	}

	public String toDelimitedString(String delimiter) {
		StringBuilder weatherData = new StringBuilder();
		weatherData.append(cityName).append(delimiter).append(location_lat)
				.append(delimiter).append(location_long).append(delimiter)
				.append(location_elevation).append(delimiter).append(cityName)
				.append(delimiter).append(conditions).append(delimiter)
				.append(temperature).append(delimiter).append(pressure)
				.append(delimiter).append(himidity);
		return delimiter;
	}

}
