package comaniket.automation.tests;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		
		System.out.println(x+20);
		
		
		// Data conversion: String to int
		int i = Integer.parseInt(x);
		
		System.out.println(i+20);
		
		// Wrapper Classes: Integer,Double,Character,Boolean
		
		String y ="12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		String k = "true";
		boolean b =Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string
		int j = 200;
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		String r = "100A";
		Integer.parseInt(r);
	}

}
