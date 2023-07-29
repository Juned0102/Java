package Casting;

public class Test {
	
	public static void main(String[] args) {
		
//		// Father class referance 
//		Father f = new Father ();
//		f.home();
//		f.money();
//		f.car();
//		
//		// child referance 
//		Son s = new Son();
//		s.bike();
//		s.car();
//		s.home();
//		s.money();
//		
		// upcasting Approach
		
		Father f= new Son();
		f.home();
		f.car();
		f.money();
	
		// Down-casting Approach
		// Not possible in java it gives compile time error
		Son s = (Son) new Father();
		s.home();
		s.bike();
		s.money();
		s.car();
		// we not get o/p for Down-casting
		// we got error 
		
		
		
		
		
		
		
	}
	
	

}
