package OverloadingMethodConstructorMainmethod;

public class Method2 {
	
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(int a, double b) {
		System.out.println(a+b);
	}
	
	public void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	public void sum(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	
	public void sum(int a, double b, double c) {
		System.out.println(a+b+c);
	}

	
	// creating main method 
	public static void main(String[] args) {
		
		Method2 m2 = new Method2();
		m2.sum(10, 20);
		m2.sum(14, 10.5);
		m2.sum(5.5, 5.5);
		m2.sum(10.5, 20.5, 30.5);
		m2.sum(10,10.5, 10.5);
		
	}
	

}
