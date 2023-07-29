package ConstructorExamples;

public class DefoultConstructor {
	
//	int a;
//	String b;
//	boolean c;
//	
////	DefoultConstructor(){		
////		System.out.println("these is defoult Constructor");
////	}
////	
//	public void disp() {
//		System.out.println(a+b+c);		
//	}
//	
//	public static void main(String[] args) {
//		
//		DefoultConstructor d=new DefoultConstructor();
//		d.disp();
//		
//	}
//	
	// another example for Defoult Constructor
	
	int id;                           // these is different class 
	String name;                      
	
	public static void main(String[] args) {    //these is in different class
		DefoultConstructor d=new DefoultConstructor();
		System.out.println("Student id is "+d.id);
		System.out.println("Student name is "+d.name);
		
	}
	
	
	
	
	

}
