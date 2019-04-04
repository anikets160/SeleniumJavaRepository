package comaniket.automation.tests;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		obj.sum(10.00);

		
	}
	
	// you cannot create method inside method
	// duplicate methods: with same name and parameters not allowed within same class
	// we can overload main method like below
	// same method name with different number of input parameters or with different datatype parameters are allowed
	
	
	public static void main(int a)
	{
		
	}
	
	public void sum()
	{
		System.out.println("sum method");
	}
	
	public void sum(double i)
	{
		System.out.println("sum method");
	}
	
	public void sum(int i)
	{
		System.out.println("sum method"+i);
	}
	
	public void sum(int i,int j)
	{
		System.out.println("sum method"+i+j);
	}

}
