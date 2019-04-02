package comaniket.automation.tests;

import org.testng.annotations.Test;

public class ArrayConcepts {

	// One Dimensional Arrays
	@Test
	public void ArrayConcept() {
		// Array stores similar data type values
		//disadvantages of array:
		// a .size is fixed and hence static array: to overcome this problem, we use collections or dynamic array:ArrayList/Hashtable 
		// b. stores only same datatype values: to overcome this , we use Object arrays

		// 1. int array
		// lowest bound/index = 0
		// upper bound/index = n-1 where n is size of array
		// if given an index which does not exist, then an exception is raised
		// as "java.lang.ArrayIndexOutOfBoundsException"
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		// System.out.println(i[2]);
		// System.out.println(i[3]);
		System.out.println(i.length);

		// for printing all values of array, always use For Loop

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("**************");

		// 2. Double Array

		double d[] = new double[3];
		d[0] = 10.11;
		d[1] = 12.33;
		d[2] = 34.65;

		System.out.println(d[2]);

		// 3. Character Array

		char c[] = new char[3];

		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';

		System.out.println(c[0]);

		// 4. Boolean Array

		boolean b[] = new boolean[2];

		b[0] = true;
		b[1] = false;

		System.out.println(b[0]);

		// 5. String Array

		String s[] = new String[3];
		s[0] = "Aniket";
		s[1] = "Pallavi";
		s[2] = "Shubham";

		System.out.println(s[1]);
		System.out.println(s.length);

		
		// 6. Object array: heterogeneous values:  Object is a class
		
		Object obj[] = new Object[5];
		
		obj[0]="Aniket";
		obj[1]=1987;
		obj[2]='P';
		obj[3]=10.22;
		obj[4]=true;
		
		System.out.println(obj[1]);
		
		
	}

}
