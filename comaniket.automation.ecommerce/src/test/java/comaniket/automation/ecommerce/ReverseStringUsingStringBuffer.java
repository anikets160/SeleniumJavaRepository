package comaniket.automation.ecommerce;

import org.testng.annotations.Test;

public class ReverseStringUsingStringBuffer {
	
	@Test
	public void ReverseString()
	{
		StringBuffer  strBfr = new StringBuffer("Aniket");
		System.out.println(strBfr.reverse());
		
	}

}
