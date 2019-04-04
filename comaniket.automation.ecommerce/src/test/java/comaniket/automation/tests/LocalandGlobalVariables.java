package comaniket.automation.tests;

public class LocalandGlobalVariables {

	// Global or class variables
	String name = "Aniket";
	int age = 31;
	
	
	public static void main(String[] args) {
		
		int i = 10;   // local variable
		System.out.println(i);
		
		LocalandGlobalVariables obj = new LocalandGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
	
	public void sum()
	{
		int i = 11;  // local variable
		int j =2;    // local variable
			
		
	}

}
