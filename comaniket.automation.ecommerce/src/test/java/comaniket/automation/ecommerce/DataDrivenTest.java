package comaniket.automation.ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
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
		Object[][] data = new Object[2][2];
		
		data[0][0] = "admin1";
		data[0][1] = "password1";
		data[1][0] = "admin2";
		data[1][1] = "password2";
				
		return data;
			}
	
}
