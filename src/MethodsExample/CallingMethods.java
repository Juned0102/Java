package MethodsExample;

public class CallingMethods {
	public static void main(String[] args) {
		
		MethodSameClass.test1();
		MethodSameClass.test2();        //for calling Static method
	
		
		MethodSameClass s =new MethodSameClass();    //this is for calling non-static method
		s.test3();
		s.test4();
		
		
	}
	
}
