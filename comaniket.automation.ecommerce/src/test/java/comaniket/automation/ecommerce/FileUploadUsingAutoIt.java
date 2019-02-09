package comaniket.automation.ecommerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

// Download AutoIt exe and editor from official website
// install both the exe
// Open AutoIt script editor and element finder
// Inspect file text box and open window button and write autoit script to upload file
// compile file to make it application file
// use Autoit script in selenium code

public class FileUploadUsingAutoIt {

	@Test
	public void FileUpload() throws IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse IDE\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");

		WebDriverWait wait = new WebDriverWait(driver, 50);

		// driver.findElement(By.id("usernameField")).sendKeys("aniket_shrikondawar@yahoo.com");
		// driver.findElement(By.id("passwordField")).sendKeys("pillu123");
		// driver.findElement(By.xpath("//button[text()='Login']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameField")))
				.sendKeys("aniket_shrikondawar@yahoo.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordField"))).sendKeys("pillu123");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='UPDATE PROFILE']"))).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Update']"))).click();

		WebElement element = driver.findElement(By.xpath("//div[@id='lazyAttachCV']//div[@class='uploadBtn']//input[@id='attachCV']"));
		Actions action = new Actions(driver);

		action.moveToElement(element).click().build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='lazyAttachCV']//div[@class='uploadBtn']//input[@id='attachCV']"))).click();

		// WebElement element = driver.findElement(By.id("attachCV"));
		// jse.executeScript("arguments[0].scrollIntoView()",wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attachCV"))));
		// element.click();

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uploadContainer']//input[@id='attachCV']"))).click();

		Runtime.getRuntime().exec("H:\\Eclipse IDE\\AutoIt\\Scripts\\FileUpload.exe");

		System.out.println("Pass1");
		driver.quit();

	}

}
