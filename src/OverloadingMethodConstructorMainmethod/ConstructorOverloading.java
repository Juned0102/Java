package OverloadingMethodConstructorMainmethod;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("this is zero argument constructor");
	}
	ConstructorOverloading(int a){
		System.out.println("this is argument constructor int "+ a);
	}
	
	ConstructorOverloading(int a,int b){
		System.out.println("this is argumented constructor int-int-int "+a+b);
	}
	
	ConstructorOverloading(int a, double b){
		System.out.println("this is argumented constructor int-double "+(a+b));
	}
	
	ConstructorOverloading(double a, double b){
		System.out.println("this is argumented constructor double-double "+(a+b));
	}
	
	ConstructorOverloading(double a,double b, int c){
		System.out.println("double-double-int "+(a+b+c));
	}
	
	
	
	// creating main method 
	
	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading(); // this will call zero argument
		
		ConstructorOverloading co1 = new ConstructorOverloading(25); // call Argument int
		
		ConstructorOverloading co2 = new ConstructorOverloading(12,12); // call int-int
		
		ConstructorOverloading co3 = new ConstructorOverloading(10,10.5);   // int-double
		
		ConstructorOverloading co4 = new ConstructorOverloading(10.5,10.5); // call double-double
		
		ConstructorOverloading co5 = new ConstructorOverloading(10.5, 10.5, 10); // double-double-int
	}
	

}
