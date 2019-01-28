package comaniket.automation.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	@Test
	public void Sum()
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse IDE\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.quit();
		
	}
	
	@Test
	public void Subtract()
	{
		System.out.println("Second Test");
	}

}
