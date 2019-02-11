package comaniket.automation.ecommerce;

import org.testng.annotations.Test;

import comaniket.automation.libraryfunctions.CommonLibrary;

public class ExcelDataReadFromExcelUtility {

	@Test
	public void ExcelDataRead()
	{
		System.out.println(CommonLibrary.GetXcelData(0, 1, 1));
	}
}
