package OverloadingMethodConstructorMainmethod;

public class Method1 {
	
	//we can overload method static and non static also		
	// Nature of method will not matter for overloading
	// in overloading method name is same only parameter(argument) should be different
	
	public static void sum() {
		System.out.println("this is zero argument Static method");
	}
	
	public static void sum(int a) {
		System.out.println("this is one argument Static method "+ a );
	}
	
	public static void sum(double a,double b,double c) {
		System.out.println(a+b+c);
	}
	
	// non static method 
	
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void sum(int a,double b) {
		System.out.println(a+b);
	}
	
// creating main method,we can create main method in same class also & in different class also both valid
	
	public static void main(String[] args) {
		//Static method calling we call static by class name
		
		Method1.sum();                 // Static method calling 
		Method1.sum(10);               // Static method calling
		Method1.sum(10.5, 15.5, 20.5); // Static method calling
		
		// non static method calling by creating objest of method
		
		Method1 m1 = new Method1();
		m1.sum(10,20,30);
		m1.sum(10,5.5);
		
	
	}

	

}
