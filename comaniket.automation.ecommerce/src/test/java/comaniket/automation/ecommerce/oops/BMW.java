package comaniket.automation.ecommerce.oops;

public class BMW extends Car{  // has-a relationship
	
	// when same method is present in parent and child class with same name and arguments, its method overriding
	
	public void start()  // overridden method :
	{
		System.out.println("BMW Start");
	}

	
	public void theftSafety()
	{
		System.out.println("BMW Theft Safety");
	}
}
