package Automation;

public class CS2ifElse {
	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c=15;
//		if(b<a) {
//			System.out.println("b is greater");
//			
//		}
//		else {
//			if(b>c) {
//				System.out.println("b is greater");		
//			}
//			else {
//				System.out.println("c is greater");
//			}
//		}		
			
		if (a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else if(c>a && c>b) {
			System.out.println("c is greater");
		}
		else if (a==b ) {
			System.out.println(" a and b is equal");
		}
		else if(b==c) {
			System.out.println(" b and c is equal");
		}
		else if(a==c) {
			System.out.println(" a and c is equal");
		}
	}

}
