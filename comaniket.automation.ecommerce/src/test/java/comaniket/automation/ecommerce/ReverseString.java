package comaniket.automation.ecommerce;

import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
	public void ReverseString()
	{
		String s1 = "Pallavi";
		
		int count = s1.length();
		
		String s2="";
		
		for(int i=count-1;i>=0;i--)
		{
			s2 = s2 +s1.charAt(i);
		}
		
		System.out.println(s2);
		
	}

}
