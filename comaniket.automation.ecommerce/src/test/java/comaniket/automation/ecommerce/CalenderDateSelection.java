package comaniket.automation.ecommerce;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import comaniket.automation.libraryfunctions.CommonLibrary;

public class CalenderDateSelection {
	
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
			
		String dateValue = "17-FEBRUARY-2019";
		
		String dateValueArray[] = dateValue.split("-");
		
		String day = dateValueArray[0];
		String month = dateValueArray[1];
		String year = dateValueArray[2];
		
		int totalWeekDays = 7;
		
		// 5 rows and 7 columns
		// //div/div[1]/table/tbody/tr[2]/td[7]
		String beforeXpath = "";
		String afterXpath = "";
		
		// title xpath =             //div[@class='ui-datepicker-title']   -> 12 values
		// Next icon =               //span[text()='Next']   -> 6 values		
		// date xpath first table =  //div[@class='ui-datepicker-group ui-datepicker-group-first']//table[1]//tr[2]//td[7]
		                             //div[@class='ui-datepicker-group ui-datepicker-group-first']//table[1]//tr[3]//td[1]		
		// date xpath second table = //div[@class='ui-datepicker-group ui-datepicker-group-last']//table[1]//tr[3]//td[1]
		
		//List <WebElement>list = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']"));
		
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		boolean flag = false;
		for ( int rowNum = 1;rowNum<=5;rowNum++)
		{
			for (int colNum = 1;colNum<=totalWeekDays;colNum++)
			{				
				String dayValue = driver.findElement(By.xpath("//tr["+rowNum+"]//td["+colNum+"]")).getText();
				System.out.println(dayValue);
				
				if(dayValue.equalsIgnoreCase(day))
				{
					driver.findElement(By.xpath("//tr["+rowNum+"]//td["+colNum+"]")).click();
					flag = true;
					break;
				}
			}
			
			if(flag)
			{
				break;
			}
		}
		
		driver.quit();
		
	}
	
}
