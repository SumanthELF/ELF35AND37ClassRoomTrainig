package dataDriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ToReadDataFromCSV {

	public static void main(String[] args) throws IOException, CsvException {
		
		File absPath = new File("./testData/testData.csv");
		FileReader fr = new FileReader(absPath);
		
		CSVReader reader = new CSVReader(fr);
		
		List<String[]> allData = reader.readAll();
		for(String[] linedata : allData) {
			for(String data : linedata) {
				System.out.print(data+", ");
			}
			System.out.println();
		}
		
		System.err.println(allData.get(1)[2]);
		
		String[] data = reader.readNext();
		System.out.println(data);
	}

}
