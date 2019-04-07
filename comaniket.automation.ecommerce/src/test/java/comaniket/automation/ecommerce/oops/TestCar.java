package comaniket.automation.ecommerce.oops;

public class TestCar {

	public static void main(String[] args) {

		//Static polymorphism or compile-time polymorphism
		
		BMW b = new BMW();
		b.start(); // method overriding as parent class start method is ignored. Same method name and same arguments
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
	
		System.out.println("**********");
		
		//Top Casting
		Car c1 = new BMW(); // Child class object can be referred by parent class reference variable: dynamic or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		BMW b1 = (BMW) new Car();  // Down-casting is not allowed at runtime. Will give ClassCastException at runtime
		
		
	}

}
