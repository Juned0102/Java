package Loops;

public class ForloopImportant {
	public static void main(String[] args) {   //program for ascending order
//		for(int i=1;i<=100;i++) {
//			System.out.println(i);
//		}
//
//
//	}
//	public static void main(String[] args) {    //program for descending order
//	
//	for(int i=100;i>=1;i--) {
//		System.out.println(i);
//	}

//	
//	}
//	public static void main(String [] args) {     //program for creating table
//	
//		int num=10;
//		  for (int i=1;i<=10;i++) {
//		  System.out.println(num+"*"+i+" = "+num*i); 
//	}
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=2;j<=4;j++) {
//				System.out.print(" *");
//			}
//			
//			System.out.println("   *");
//		}
//		
//	}
//	public static void main(String[] args) {                              //half diamond pattern
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" *");
//			
//			}
//			
//			System.out.println();
//			
//		}
//		for(int k=1;k<=5;k++) {
//			for(int p=4;p>=k;p--) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//	}
//	
//		
	
//}
//	public static void main(String[] args) {     //program to print A-Z character
//		for(char c='A';c<='Z';c++) {
//			System.out.print(c+ " ");
//		}		
//		
//	}
//-----------------------------------------------------------------------------------		
//	public static void main(String[] args) {          
//		
//		for(char c='A';c<='Z';c++) {
//			System.out.print(c+ " " );
//			
//		}
//			
//}
//------------------------------------------------------------------------------------		
//	public static void main(String[] args) {            // o/p is   jjjjj
//		for(int i=1;i<=4;i++) {                         //          jjjjj
//			for(int j=1;j<=5;j++) {                     //          jjjjj
//				System.out.print("j");                  //          jjjjj
//			}
//			System.out.println();
//		}
//-----------------------------------------------------------------------------------------------
		
//		for(int i=1;i<=5;i++) {                          //  o/p is  1 1 1 1 1
//			for(int j=1;j<=5;j++) {                      //          2 2 2 2 2 
//				System.out.print(" " +i);                //          3 3 3 3 3 
//			}                                            //          4 4 4 4 4
//			System.out.println();                        //          5 5 5 5 5                
//		}
//------------------------------------------------------------------------------------------------		
//		
//	    for(int i=1;i<=5;i++) {                            // o/p is  =>  1
//	    	for(int j=1;j<=i;j++) {                        //             1 2
//	    		System.out.print(" "+j);                   //             1 2 3
//	    	}                                              //             1 2 3 4
//	    	System.out.println();                          //             1 2 3 4 5
//	    }
//
//-------------------------------------------------------------------------------------------------		
//		for(int i=4;i<=8;i++) {                            // o/p is =>    4
//			for(int j=4;j<=i;j++) {                        //              5 5
//				System.out.print(" "+i);                   //              6 6 6
//			}                                              //              7 7 7 7
//			System.out.println();                          //              8 8 8 8 8
//		}
//------------------------------------------------------------------------------------------------		
//		
//		for(int i=1;i<=5;i++) {                            //prefer these method only o/p is   =>  5 4 3 2 1
//			for(int j=5;j>=i;j--) {                        //                                      5 4 3 2
//				System.out.print(" "+j);                   //                                      5 4 3
//			}                                              //                                      5 4
//			System.out.println();                          //                                      5

//-------------------------------------------------------------------------------------------------		
		
//		
//	for(int i=1;i<=5;i++) {                               //not these o/p is  =>    * * * * *
//		for(int j=i;j<=5;j++) {                           //                        * * * *
//			System.out.print(" *");                       //                        * * *
//		}                                                 //                        * *
//		System.out.println();                             //                        *
//	}
//---------------------------------------------------------------------------------------------		
	
//		                   //below program o/p is =>            *
//		                                                       **
//		                                                      ***  
//		                                                     ****
//		                                                    *****
//		
//	for(int i=1;i<=5;i++) {                      
//		for(int j=4;j>=i;j--) {
//			System.out.print(" ");                       // This for loop is to print spaces
//		}
//		for(int k=1;k<=i;k++) {
//			System.out.print("*");                     // This for loop is to print *
//		}
//		System.out.println();
//	}
//------------------------------------------------------------------------------------------------------		
		
		      // This for  loop is for row increment                *****
		      //                     o/p is =>                       ****
		      //                                                      ***
		      //                                                       **
		      //                                                        *
		
		
//		for (int i=1;i<=5;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(" ");         // This for loop is to print spaces
//			} 
//			for (int k=5;k>=i;k--) {
//				System.out.print("*");        // This for loop is to print *
//			} 
//			System.out.println();
//		}
//	----------------------------------------------------------------------------	
		
		
//		for (int i=1;i<=5;i++) {             // o/p is =>           *          
//			for(int j=1;j<=i;j++) {          //                     **
//				System.out.print("*");       //                     ***
//			}                                //                     ****
//			System.out.println();            //                     *****
//		}                                    //                     ****
//		for(int i=1;i<=5;i++) {              //                     ***
//			for(int j=4;j>=i;j--) {          //                     **
//				System.out.print("*");       //                     *
//			}                                
//			System.out.println();            
//		}
//		
//	
		              // This for  loop is for row increment   //o/p is=>              *
//				for (int i=1;i<=5;i++) {                       //                     **
//					for (int j=4;j>=i;j--) {                   //                    ***
//						System.out.print(" ");                 //                   ****
//					} // This for loop is to print spaces      //                  *****
//					for (int k=1;k<=i;k++) {
//						System.out.print("*");
//					} // This for loop is to print *
//					System.out.println();
//				}
//------------------------------------------------------------------------------------------------------
//		for(int i=1;i<=5;i++) {                                         //o/p is =>        *****   
//			for(int j=1;j<=i;j++) {                                     //                  ****
//				System.out.print(" ");  //these for loop to print spaces//                   ***
//			}                                                           //                    **
//			for(int k=5;k>=i;k--) {                                     //                     *
//				System.out.print("*");  // to  print *
//			}
//			System.out.println();
//		}
//	----------------------------------------------------------------------------------------------------	
//			
			// This for  loop is for row increment
//			for (int i=1;i<=5;i++) {
//				for (int j=4;j>=i;j--) {                 //o/p is =>            *
//					System.out.print(" ");               //                    * *
//				} // This for loop is to print spaces    //                   * * *
//				for (int k=1;k<=i;k++) {                 //                  * * * *
//					System.out.print("* ");              //                 * * * * *
//				} // This for loop is to print *         
//				System.out.println();
//			}
//	-----------------------------------------------------------------------------------------------------	
	
		// Program:- Pattern 7
		// This Code is for Upper Triangle          //o/p is =>                  *
//			for (int i=1;i<=5;i++) {                //                          **
//				for (int j=4;j>=i;j--) {            //                         *** 
//					System.out.print(" ");          //                        **** 
//				} // This for loop is to print spaces //                     ***** 
//				for (int k=1;k<=i;k++) {            //                        ****
//					System.out.print("*");          //                         ***
//				} // This for loop is to print *    //                          **
//				System.out.println();               //                           *
//			} 
//		// This Code is for Lower Triangle
//			for (int i=1;i<=4;i++) {
//				for (int j=1;j<=i;j++) {
//					System.out.print(" ");
//				} // This for loop is to print spaces
//				for (int k=4;k>=i;k--) {
//					System.out.print("*");
//				} // This for loop is to print *
//			   System.out.println();
//			}	
	//----------------------------------------------------------------------------------------------------	
			// Program:- Pattern 9
//		
//			for (int i=1;i<=5;i++) {            // o/p is =>  11111          
//				for (int j=1;j<=5;j++) {        //            22222
//					System.out.print(i);        //            33333
//				}                               //            44444
//				System.out.println("");         //            55555
//			}	
			
//---------------------------------------------------------------------------------------------------------			
			// Program:- Pattern 10
//            
//			for(int i=1;i<=5;i++) {              //o/p is =>         12345
//				for(int j=1;j<=5;j++) {          //                  12345
//					System.out.print(j);         //                  12345
//				}                                //                  12345
//				System.out.println();            //                  12345
//			}
//			
			
//--------------------------------------------------------------------------------------------------------			
			
//		// Program:- Pattern 11                 //o/p is =>          1 
//		for(int i=1;i<=5;i++) {                 //                   22
//			for(int j=1;j<=i;j++) {             //                   333
//				System.out.print(i);            //                   4444
//			}                                   //                   55555
//			System.out.println();
//		}
		
//--------------------------------------------------------------------------------------------------------		
		
//		// Program:- Pattern 12 
//		for(int i=1;i<=5;i++) {                    //   o/p is =>         11111
//			for(int j=5;j>=i;j--) {                //                     2222
//				System.out.print(i);               //                     333
//			}                                      //                     44
//			System.out.println();                  //                     5
//		}
		
//---------------------------------------------------------------------------------------------------------		
		
		// Program:- Pattern 13
		//these for loop to row increment                    //o/p is =>               1
//		for(int i=1;i<=5;i++) {                              //                       22
//			for(int j=4;j>=i;j--) {                          //                      333
//				System.out.print(" ");                       //                     4444
//			}                       // these for loop to print spaces  //          55555
//			for(int k=1;k<=i;k++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

//----------------------------------------------------------------------------------------------------------		
		
		
			 //*         *
			 //**       **
			 //***     ***
			 //****   ****
			 //***** *****
			 //****   ****
			 //***     ***
			 //**       **
			 //*         * ( Remember : Star Space Space Star)
			 
//			 int star = 1; // Star on the first Row Left
//			 int space = 5; // Space on the first Row Left
//			 int star2 = 1; // Star on the first Row Right
//			 int space2 = 4; // Space on the first Row Right
//			 
//			 for(int i=1; i<=9; i++) //Outer for loop used for No. of Rows = 9
//			 { 
//			 for(int j=1; j<=star; j++) // Inner For loop for Star(Left)
//			 { 
//			 System.out.print("*"); 
//			 } 
//			 for(int k=1;k<=space; k++) // Inner For loop for space(Left)
//			 { 
//			 System.out.print(" "); 
//			 } 
//			 for(int m=1; m<=space2; m++) 
//			 { 
//			 System.out.print(" "); 
//			 } 
//			 for(int l=1; l<=star2;l++) 
//			 { 
//			 System.out.print("*"); // Inner For loop for Star(Right)
//			 } 
//			 
//			 if(i<5) 
//			 { 
//			 star++; 
//			 space--; 
//			 star2++; 
//			 space2--; 
//			 } 
//			 else
//			 { 
//			 star--; 
//			 space++; 
//			 star2--; 
//			 space2++; 
//			 } 
//			 System.out.println(); 
//			 } 
			 
//=========================================================================		
//		int a=1;                           //  o/p is        1
//		for(int i=1;i<=4;i++) {            //                2 3
//			for(int j=1;j<=i;j++) {        //                4 5 6 
//				System.out.print(a+" ");   //                7 8 9 10
//				a=a+1;
//			}
//			System.out.println();
//		    }
////	
//		for(int i=1;i<=1;i++) {          // i is for row
//			for(int j=1;j<=5;j++) {      // j is for column
//				System.out.print(" *");  // o/p is * * * * *
//			}
//			System.out.println();
//		}
//		
		
		for(int i=1;i<=5;i++) {                       // o/p is      *
			for(int j=5;j>=i;j--) {                   //            * *
				System.out.print(" ");                //           * * *
			}                                         //          * * * *  
			for(int k=1;k<=i;k++) {                   //         * * * * *  
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
		
//		for(int i=1;i<=5;i++) {                    // o/p is    * * * * *
//			for(int j=1;j<=i;j++) {                //            * * * *
//				System.out.print(" ");             //             * * *
//			}                                      //              * *
//			for(int k=5;k>=i;k--) {                //               *
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
}	
}		
	
	



