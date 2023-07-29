package Loops;

public class MyNameJUNED {
	
	public static void main(String [] args) {      //i is for row
		                                           // j is for column
		
		System.out.println("MY name using For loop");
		
		for(int i=1;i<=1;i++) {                         //horizontal star for j
			for(int j=1;j<=6;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print("      *");           //     vertical star for j
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(" *");                 // horizontal star for j
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print(" *"+"        *");     //vertical two lines  for u
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("  *");                //horizontal line  for u
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=2;j++) {
				System.out.print("  *");              //two vertical star  for n
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print(" *"+"    *"+"    *");    // vertical three lines  for n
			}
			System.out.println();
		}
	
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print("       * *");            //horizontal two star for n
			}
			System.out.println();
		}

		for(int i=1;i<=1;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("  *");                  // three horizontal star  for E
			}
			System.out.println();
		}
		
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print(" *");                   // two vertical star  for E
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("  *");                 // three horizontal star  for E
			}
			System.out.println();
		}
		
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print(" *");                   // two vertical star  for E
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("  *");                 // three horizontal star  for E
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print(" *");                  // six horizontal star  for D
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print("   *"+"       *");       // two vertical star line for D
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print(" *");                  // six horizontal star  for D
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print(" *");                //horizontal six lines
			}
			System.out.println();
		}
		
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print(" *");                // vertical 2 star 
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print(" *");                //horizontal six lines
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print("           *");                // vertical 2 star 
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print(" *");                //horizontal six lines
			}
			System.out.println();
		}
		
		
		int fp=20/2;                    // first point
		int sp=20/2;                    // second point
		
		for(int i=1;i<=10;i++) {                   // row
			for(int j=1;j<=20;j++) {               // column 
				
			    //(j==fp is for cross line for i) (j==sp is for opposite cross line for j) 
				//i =10/2 is print start in middle
				//j>fp is print star from 5 position
				//j<sp is for remove star from last 5 position
				//j%2 is for giving space between each star
				
				if(j==fp  || j==sp || i==10/2 && j>fp && j<sp && j%2==0 )
				System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			System.out.println();
			fp--;                        // cross line
			sp++;                        // opposite cross line
		}
		
	
	
		
		}	

}
