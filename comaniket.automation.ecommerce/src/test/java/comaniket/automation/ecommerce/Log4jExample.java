package comaniket.automation.ecommerce;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Log4jExample {
		
	@Test
	public void HandleAlert()
	{		
		
		Logger logger = Logger.getLogger("Log4jExample");
		
	    PropertyConfigurator.configure("Log4j.properties");
	    
	    
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse IDE\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		logger.info("Browser Started");
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		
		logger.info("URL launched");
	    
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		
		String actualText =driver.switchTo().alert().getText();
		
		System.out.println(actualText);
		
		Assert.assertEquals(actualText, "Please select start place.");
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		logger.info("Browser closed");
		
	}
	

}
