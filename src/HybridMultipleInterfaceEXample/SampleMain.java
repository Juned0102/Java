package HybridMultipleInterfaceEXample;

public class SampleMain implements Sample1,Sample2 {
	
	public void m1() {                           //void is not accepted here write public before void
		System.out.println("this is m1 method from Sample1 interface");
	}
	
	public void m2() {
		System.out.println("this is m2 method from Sample1 interface");
	}
	
	public void m3() {
		System.out.println("this is m3 method from Sample2 interface");
	}
	
	public void m4() {
		System.out.println("this is m4 method from Sample2 interface");
	}
	
	
	public static void main(String[] args) {
		
		SampleMain s = new SampleMain();
		
		s.m1();
		s.m2();
		s.m3();
		s.m4();
	
		
	}

}
