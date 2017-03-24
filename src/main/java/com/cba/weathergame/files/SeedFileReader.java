package com.cba.weathergame.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cba.weathergame.exception.WeatherGameRuntimeException;
import com.cba.weathergame.simula.SimulaRecord;
import com.cba.weathergame.simula.WeatherConstants;

/*
 Reads the seed file and populates the Weather SeedFileReader
 */
public class SeedFileReader {

	public List<SimulaRecord> readSeedFile(String fileName) {

		List<SimulaRecord> seedList = new ArrayList<SimulaRecord>();

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;

			br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) {
				String[] seed = line.split(WeatherConstants.COMMA_DELIMITER);
				seedList.add(new SimulaRecord(seed));
			}

		} catch (IOException e) {
			throw new WeatherGameRuntimeException(e);
		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		return seedList;

	}

}
