package comaniket.automation.ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import comaniket.automation.libraryfunctions.CommonLibrary;

public class CalenderDateSelectionUsingJS {
	
	@Test
	public void SelectDate()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse IDE\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		driver.get("https://www.makemytrip.com/flights/");
			
		String dateValue = "18-02-2019";
		
		WebElement departureDate = driver.findElement(By.xpath("//input[@id='hp-widget__depart']"));
		//departureDate.click();
		
		CommonLibrary.SetDateUsingJS(driver, departureDate, dateValue);
	}
	
}
