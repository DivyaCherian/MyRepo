package com.cba.weathergame;

import com.cba.weathergame.bootstrap.WeatherGame;

/**
 * Weather Game *
 */
public class App {
	public static void main(String[] args) {
		App appTest = new App();
		appTest.getWeatherData();
	}

	void getWeatherData() {
		String[] args = { "2000" };
		WeatherGame.main(args);
	}

}
