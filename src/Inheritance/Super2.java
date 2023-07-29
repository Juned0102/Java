package Inheritance;

public class Super2 extends Super1 {
	
	int b=20;
	
	public void test() {
		int b=30;
		System.out.println(b);      //local variable o/p is 30
		System.out.println(this.b); // Global variable o/p is 20 
		System.out.println(super.a);  // Global variable of imidiate parent class o/p is 10 
		
		// if you are interested to some action then it is possible
		
		System.out.println(b+this.a);    //o/p b+a i.e 30+10=40
		
		System.out.println(super.a+this.a+b);  //o/p is a+b+b i.e 10+20+30=50
		
	}
	
	
	public static void main(String[] args) {
		
		Super2 s1= new Super2();     //object creation
		s1.test();
		
	}

}
