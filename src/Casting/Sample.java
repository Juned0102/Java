package Casting;

public class Sample {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();  // creating the object of parent class
		Demo1 d1 =new Demo1(); // creating object for child class
		
	// upcasting  object		
		Demo d11 =new Demo1();     // this is upcasting object
		
		
// non static method => upcasting approach => child class method
		// calling non-static methods
	//	d.m1();              // Parent class
	//	d1.m1();             // child class
		// casting Approach(Object class)
	//	d11.m1();            // child class   
		// Static method 
		System.out.println("======");
				
		d.m1();       // parent class
		d.m2();
		System.out.println("=======");
		d1.m1();
		d1.m2();               // child class
		System.out.println("========");
		d11.m1(); 
 // d11.m2 this will call my static method from parent class b'coz static method from chid class will be hide.
		// this happen in case static keywords.   
		d11.m2();
		
		
		
		
	}
	
	

}
