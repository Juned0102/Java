package Inheritance;

public class Superkeyword2 extends Superkeyword1{
	
	int a=50;                                  // global variable
	
	public void m1() {
		int c=20;                             // local variable
		
		
		System.out.println(c+" this is local variable");       // this will call local variable
		
		System.out.println(this.a+" global variable");          //this will call global variable
		
System.out.println(super.a+" immidiate class global vrbl");// this will call immediate class global variable
		
	}
	
	
	public static void main(String[] args) {
		
		Superkeyword2 sk = new Superkeyword2();
	    sk.m1();
		
		
		
	}
	

}
