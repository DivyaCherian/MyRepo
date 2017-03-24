package com.cba.weathergame.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.cba.weathergame.simula.WeatherConstants;

public class WeatherDataWriter {

	public void fileWriteUtil(List<String> fileContent) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {

			fw = new FileWriter(WeatherConstants.OUTFILE);
			bw = new BufferedWriter(fw);
			for (String content : fileContent) {
				bw.write(content);
				bw.newLine();
			}

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

	}

}
