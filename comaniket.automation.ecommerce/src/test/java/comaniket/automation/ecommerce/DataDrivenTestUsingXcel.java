package comaniket.automation.ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import comaniket.automation.libraryfunctions.CommonLibrary;

public class DataDrivenTestUsingXcel {
	
	@Test(dataProvider="testdata")
	public void DataDrivenTestCase(String username,String password)
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse IDE\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);		
		driver.quit();
	}
	
	
    @DataProvider(name ="testdata")
	public Object[][] PassData()
	{
    	int rows = CommonLibrary.GetRowCount(0);
		Object[][] data = new Object[rows][2];
		
		for (int i =0;i<rows;i++)
		{
			data[i][0]=CommonLibrary.GetXcelData(0, i, 0);
			data[i][1]=CommonLibrary.GetXcelData(0, i, 1);
		}
				
		return data;
	}
	
}
