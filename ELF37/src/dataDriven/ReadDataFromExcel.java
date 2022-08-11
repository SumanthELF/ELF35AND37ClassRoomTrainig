package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String data = workbook.getSheet("Organisation").getRow(11).getCell(6).getStringCellValue();
		System.out.println(data);
		
		String data2 = workbook.getSheet("Sheet1").getRow(14).getCell(13).getStringCellValue();
		System.out.println(data2);
	}

}
