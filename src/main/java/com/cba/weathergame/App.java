 package com.cba.weathergame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cba.weathergame.bootstrap.WeatherGame;

/**
 * Weather Game
 * 
 * 
 */
public class App {

	/**
	 *  LOGGER initialized
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Start Weather Game");
		App appTest = new App();
		appTest.getWeatherData();
		LOGGER.info("Ends Weather Game");
	}

	/**
	 * 
	 */
	void getWeatherData() {
		String[] args = { "2000" };
		WeatherGame.main(args);
	}

}
