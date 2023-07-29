package Inheritance;

public class ThiskeywordExample1 {
	
	int a=10;
	
	public void test() {
		int b=20;                       
		System.out.println(b);            // local variable  20
		System.out.println(this.a);       // Global variable 10
		
	}
	
	//============== main method is outside of the method we can use another class also
	public static void main(String[] args) {
		
		ThiskeywordExample1 tk =new ThiskeywordExample1();
		tk.test();
	
	}
	
}
