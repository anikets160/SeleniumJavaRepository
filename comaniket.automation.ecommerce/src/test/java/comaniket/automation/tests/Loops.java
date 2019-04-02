package comaniket.automation.tests;

import org.testng.annotations.Test;

public class Loops {
	
	@Test(priority = 0)
	public void WhileLoop()
	{
		// 1. While Loop 
		// Disadvantage is that it will generate infinite loop if we do not specify incremental/decremental part
		
		int i =0;  //initialization part
		while(i<=10)  // conditional part
		{
			System.out.println(i);
			i++;  //incremental or decremental part
		}
		
		System.out.println("***********");
		// 2. For loop
		
		for(int j=1;j<=10;j++){
			System.out.println(j);
		}
		
		System.out.println("***********");
		for(int k=10;k>=1;k--){
			
			System.out.println(k);
			
		}
	}
	
	
	
	

}
