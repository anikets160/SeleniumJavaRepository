package comaniket.automation.base;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import comaniket.automation.enums.Browsers;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties;
	
	@BeforeTest
	public void Intialize()
	{
		String browserName;
		Browsers browser;
		
		try {
			FileReader reader = new FileReader("//comaniket.automation.ecommerce//src//main//java//comaniket//automation//config//config.properties");
			properties = new Properties();
			properties.load(reader);
			browserName = properties.getProperty("browser");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		browser = Browsers.CHROME;
		 switch (browser) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", properties.getProperty("chromedriverPath"));
			driver = new ChromeDriver();
			break;
			
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
			
		default:
			driver = new InternetExplorerDriver();
			break;
		}
		 
		 driver.get(properties.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void Cleanup()
	{
		driver.quit();
	}

}
