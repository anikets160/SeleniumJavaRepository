package comaniket.automation.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XcelDataReader {
	
	@Test
	public void ReadExcelData() throws IOException
	{
		File src = new File("H:\\ExcelTestData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
//		String username1 = sheet1.getRow(0).getCell(0).getStringCellValue();
//		String password1 = sheet1.getRow(0).getCell(1).getStringCellValue();
//		
//		System.out.println(username1);
//		System.out.println(password1);
		
		int rowCount = sheet1.getLastRowNum();
		
		for (int i=0 ; i< rowCount;i++)
		{
			String username = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
		}
		
		wb.close();
	}

}
