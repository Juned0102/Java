package HybridMultipleInterfaceEXample;

public class HybridInheritance extends Test implements Test1,Test2   {
	
	public void m2() {
		System.out.println("this is from Test1 interface,method method m2");		
	}
	
	public void m3() {
		System.out.println("this is from Test2 interface,and method m3 ");
	}

	public static void main(String[] args) {
		HybridInheritance hi = new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();
				
	}
	
	
}
