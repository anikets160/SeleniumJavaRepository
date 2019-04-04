package comaniket.automation.tests;

public class StaticAndNonStaticConcept {

	String name = "Aniket";
	static int age = 31;
	
	
	public static void main(String[] args) {
		
		
		// calling static method:  static methods and variables are not stored in an object memory
		// 1. direct calling
		
		sum();
		
		// 2. using Class Name
		
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		// calling non static methods
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		
		// can we call static methods by an object reference => Yes. But not a good practice.It will give u a warning.
		
		obj.sum();

	}

	public void sendMail()  // non-static method
	{
		System.out.println("send mail method");
	}
	
	public static void sum()   //  static method
	{
		System.out.println("sum method");
	}
	
}
