         package Arrays;

public class ArraysSingleAndMulti_dimensional {
//	public  static void main (String[] args) {
//	// Single dimensional Array. (n-1)
//	
//	// declare the array.
//	int a[]=new int [6];
//	
//	// add the values in the array
//	a[0]=10;
//	a[1]=20;
//	a[2]=30;
//	a[3]=40;
//	a[4]=50;
//	a[5]=60;
//	
//                                        	// how  to check the size/capacity/length of array
//	System.out.println("The Size of the array is "+ a.length);
//	
//	                                       // how to read single value in array.
////	System.out.println(a[2]);
//	
//	                                       // how to read all values in the array.
//	for (int i=0; i<a.length;i++) {
//		System.out.println(a[i]);
//	}
//	
	// this is for reference.(how to add multiple values in single line)
//	
public static void main(String[] args) {
		                       //we always write row first and column second
	                         //[row] [column]
		int a [] [] = new int [3] [2]; // array declaration
		// inserting the values.
		a[0] [0] = 100;                  // 100  200
		a[0] [1] = 200;                  // 300  400    this is similar to matrix method we studied in collage day
		                                 // 500  600
		a[1] [0] = 300; 
		a[1] [1] = 400;
		
		a[2] [0] = 500;
		a[2] [1] = 600;
		
	                                              	// find out the size 
		
		System.out.println("The Number of Rows "+ a.length );
		System.out.println("The Number of Columns "+ a[0].length);
		                                             // Program to read array.
		
		for (int i=0; i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
	}

	}
