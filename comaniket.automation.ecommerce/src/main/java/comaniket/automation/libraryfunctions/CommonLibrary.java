package comaniket.automation.libraryfunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonLibrary {
	
	static XSSFWorkbook wb;
	
	public static void SetDateUsingJS(WebDriver driver,WebElement element,String dateValue)
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	}

	public static String GetXcelData(int sheetNumber,int row,int column)
	{
		
		try {
			File src = new File("H:\\ExcelTestData\\TestData.xlsx");
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		XSSFSheet sheet1 = wb.getSheetAt(sheetNumber);
			
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
				
		//wb.close();
		
		return data;
	}
	
	public static int GetRowCount(int sheetIndex)
	{
		int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum();
		
		rowCount=rowCount+1;
		
		return rowCount;
		
	}
	
}