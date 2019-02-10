package comaniket.automation.libraryfunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonLibrary {
	
	public static void SetDateUsingJS(WebDriver driver,WebElement element,String dateValue)
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	}

}