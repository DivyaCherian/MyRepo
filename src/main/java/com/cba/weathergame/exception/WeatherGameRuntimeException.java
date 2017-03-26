package com.cba.weathergame.exception;

/**
 * @author Rasna Joseph
 *
 */
public class WeatherGameRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1804964740345836956L;

	/**
	 * @param ex
	 */
	public WeatherGameRuntimeException(Throwable ex) {
		super(ex);
	}

}