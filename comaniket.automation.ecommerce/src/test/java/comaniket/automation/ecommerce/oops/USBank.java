package comaniket.automation.ecommerce.oops;

public interface USBank {
	
	int min_bal = 100;
	
	// only method signatures/prototype. No method body
	// In interface, variables declared are always static. We cannot change value of variables
	// no static method in interface
	// no main method
	// we cannot create object of interface
	// interfaces are abstract in nature
	// variables are static final constant 
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	

}
