package HybridMultipleInterfaceEXample;

public class DemoMain implements Demo1,Demo2 {
	
	public void m1() {                   //there is no need to write again method,when both methods are same
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		DemoMain dm =new DemoMain();
		dm.m1();
			
		
	}
	
}
