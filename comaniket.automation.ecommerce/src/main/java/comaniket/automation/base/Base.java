package comaniket.automation.base;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import comaniket.automation.enums.Browsers;

public class Base {
	
	static WebDriver driver;
	
	
	@BeforeTest
	public void Intialize()
	{
		String browserName;
		Browsers browser;
		try {
			FileReader reader = new FileReader("config.properties");
			Properties properties = new Properties();
			properties.load(reader);
			browserName = properties.getProperty("browser");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		browser = Browsers.CHROME;
		 switch (browser) {
		case CHROME:
			driver = new ChromeDriver();
			break;
			
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
			
		default:
			driver = new InternetExplorerDriver();
			break;
		}			
	}
	
	
	@AfterTest
	public void Cleanup()
	{
		driver.quit();
	}

}
