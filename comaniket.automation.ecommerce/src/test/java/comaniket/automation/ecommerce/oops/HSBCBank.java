package comaniket.automation.ecommerce.oops;

public class HSBCBank implements USBank,BRAZILBank {  // achieving multiple inheritance using interfaces.  
	//interface and class relationship is-a relationship

	// if a class is implementing any interface, then its mandatory to define all methods of interface	
	public void credit() {
		System.out.println("HSBC credit");
		
	}

	
	public void debit() {
		System.out.println("HSBC debit");
		
	}

	
	public void transferMoney() {
		System.out.println("HSBC transferMoney");
		
	}
	
	public void educationLoan()
	{
		System.out.println("HSBC educationLoan");
	}
	
	public void carLoan()
	{
		System.out.println("HSBC carLoan");
	}


	
	public void mutualFund() {
		System.out.println("HSBC mutualFund");
		
	}

	
	
}
