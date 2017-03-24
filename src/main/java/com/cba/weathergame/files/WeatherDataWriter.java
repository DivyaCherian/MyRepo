package com.cba.weathergame.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.cba.weathergame.simula.SimulaRecord;

public class WeatherDataWriter {

	private static final String FILENAME = "C:\\Users\\cherdi02\\Documents\\filename.txt";

	/*public void fileWriteUtil(List<SimulaRecord> fileContent) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			for (SimulaRecord content : fileContent) {
				bw.write(content);
			}
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();
			// thorw
			// logger

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

				// throw
				// logger

			}

		}

	}*/

}
