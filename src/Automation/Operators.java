package Automation;

public class Operators {
	public static void main (String[] args) {
		int a =25;
		int b = 26;
		int c= 45;
		System.out.println("multiplication of a and b is "+(a*b));  //arithmatic operators
		
		System.out.println(a!=b);                           //relational operator
		System.out.println(a>b);
		System.out.println(a>=b);
		
		System.out.println(a<c&& a>b);                      //logical operators
		System.out.println(a<c||c>a);
		System.out.println(a>b||b>c);
		
		                                                   // increament/decreament operators
		
		System.out.println(a++);          //post increament operator
		System.out.println(++a);          //pre increament operators
		
		
		
	}

}
	
