package MethodsExample;

public class Calculation {
	// declaring the variable
	
	int x=200;
	int y=100;
	
//	  case 1- method are not accepting the parameter and not returning the value.
	
//	public void sum() {
//	System.out.println(x+y);
//	}
	
	//case 2- method are not accepting the parameter and they are returning the value.
//	
//	public int sum() {
//		return x+y;
//	}
//	
	//case 3- method are accepting the parameter and not returning the value.
	
//	public void sum(int a,int b) {
//		System.out.println(a+b);
//	}
	
//  // case 4- method are accepting the parameter and returning the value.
	public int sum(int a, int b) {
		//int c= a+b;
		return a+b;

	}

	public static void main(String[] args) {
//		// case 1
//		Calculation cal =new Calculation();
//		cal.sum();
		
//		// case 2
//		Calculation cal = new Calculation();
//		System.out.println(cal.sum());
		
//		// case 3
//		Calculation cal = new Calculation();
//		cal.sum(50, 30);
//		cal.sum(20, 10);
//		cal.sum(200, 330);
		
		// case 4
		Calculation cal = new Calculation();
		cal.sum(100, 200);
		cal.sum(10, 20);
	
	}
}
