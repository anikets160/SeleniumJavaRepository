package comaniket.automation.tests;

import org.testng.annotations.Test;

public class TwoDimensionalArray {

	@Test
	public void TwoDimArray()
	{
		String s[][] = new String[3][5];
		
		System.out.println(s.length);   // In two dim array s.length gives number of rows
		System.out.println(s[0].length);	 /// gives total number of columns
		
		// 1st row		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		// 2nd row
		s[1][0]="F";
		s[1][1]="G";
		s[1][2]="H";
		s[1][3]="I";
		s[1][4]="J";
		
		// 3rd row
		s[2][0]="K";
		s[2][1]="L";
		s[2][2]="M";
		s[2][3]="N";
		s[2][4]="O";
		
		//System.out.println(s[0][0]);
		//System.out.println(s[1][1]);
		
		// to print all values on 2-dim array: always have to use 2 for loops
		
		for(int row = 0;row<s.length;row++)		{
			for(int col = 0;col<s[0].length;col++){
				
				System.out.println(s[row][col]);
			}			
		}
		
	}
	
}
