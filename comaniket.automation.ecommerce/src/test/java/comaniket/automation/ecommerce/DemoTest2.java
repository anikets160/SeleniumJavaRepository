package comaniket.automation.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	@Test
	public void Google()
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse IDE\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//Quit  browser 
		
		driver.quit();
		
	}
	
	@Test
	public void Subtract()
	{
		System.out.println("Second Test");
	}

}
