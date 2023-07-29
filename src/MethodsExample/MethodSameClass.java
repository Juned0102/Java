package MethodsExample;

public class MethodSameClass {
	 // method to call from same class
     // 2 static method and 2 non static methods
     // call them 
	
	public static void test1() {                               // static method
		System.out.println("this is method one - static");

		}
	
	public static void test2() {                              // static method
		System.out.println("thise is method two - static");
		}
	
	public void test3() {                                         // non static method
		System.out.println("thise is method three - non static");
		}
	
	public void test4(){                                             // non static method
		System.out.println("thise is method four - non static");

		}
	
	public static void main (String [] args) {
		System.out.println("Main method starts");
		// to call static method we don't need to create object,by taking class name we call.
		
		MethodSameClass.test1();
		MethodSameClass.test2();

		// to call non static method we need to create object of that class.
		
		MethodSameClass obj =new MethodSameClass();
		obj.test3();
		obj.test4();
	

	
}
}
