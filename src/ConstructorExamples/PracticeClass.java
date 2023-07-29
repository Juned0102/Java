package ConstructorExamples;

public class PracticeClass {
	int a;
	String str;
	
	PracticeClass(int b,String d){		
		a=b; 
		str=d;
		System.out.println("these is parameter constructor");
		
        }
	
	public void test() {
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args) {
		PracticeClass p = new PracticeClass(12,"shaikh junaid");
		p.test();
		
	}
	
	
	
}
