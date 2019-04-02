/**
 * 
 */
package comaniket.automation.tests;

import org.testng.annotations.Test;

/**
 * @author ++ and --
 *
 */
public class IncreamentDecreamentOperators {

	@Test
	public void IncreamentDecreament()
	{
		int i = 1;
		int j = i++;   // post increament 
		
		System.out.println(i);
		System.out.println(j);
		
		int k = 1;
		int l = ++k; // pre increament
		
		System.out.println(k);
		System.out.println(l);
		
		int m = 2;
		int n = m--;  // post decreament
		
		System.out.println(m);
		System.out.println(n);
		
		
		int p = 2;
		int q = --p;    // pre decreament
		
		System.out.println(p);
		System.out.println(q);
		
	}
	
}
