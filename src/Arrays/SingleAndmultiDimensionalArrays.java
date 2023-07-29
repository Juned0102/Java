package Arrays;

public class SingleAndmultiDimensionalArrays {
	public static void main(String[] args) {
		                                            // Single dimensional Array. (n-1)
		
				                                    // declare the array.
				int a[]=new int [5];
				
				                                    // add the values in the array
				a[0]=10;
				a[1]=20;
				a[2]=30;
				a[3]=40;
				a[4]=50;
				
				                                    // how  to check the size/capacity/length of array
				System.out.println("The Size of the array is "+ a.length);
				
				                                    
			//	System.out.println(a[2]);           //we use these to how to read single value in array.
				
				                                    // how to read all values in the array.
				for (int i=0; i<a.length;i++) {
					System.out.println(a[i]);
				}
	}			
	}


