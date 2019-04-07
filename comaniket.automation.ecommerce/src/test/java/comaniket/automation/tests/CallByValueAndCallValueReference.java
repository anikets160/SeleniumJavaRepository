package comaniket.automation.tests;

public class CallByValueAndCallValueReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallValueReference obj = new CallByValueAndCallValueReference();
		
		int x = 10;
		int y = 20;
		int sum = obj.testSum(x, y); // call by value or pass by value
		
		System.out.println(sum);
		
		obj.p=50;
		obj.q=60;

		obj.swap(obj);
		System.out.println("After Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int testSum(int a, int b)
	{
		a=30;
		b=40;
		int c = a+ b;
		return c;
	}
	
	// Call by reference: passing value of object reference
	public void swap(CallByValueAndCallValueReference t)
	{
		int temp;
		temp = t.p;  // 50
		t.p = t.q;  // 60
		t.q = temp;  //50
		
		
		
	}

}
