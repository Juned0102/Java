package ConstructorExamples;

public class NoparameterConstructor {
	
	int a;
	String str;
	
	NoparameterConstructor (){
		a=30;
		str = "shaikh junaid";
		System.out.println("this is no parameter contructor");
		
	}
	
	public void test() {
		System.out.println(a);
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		
		NoparameterConstructor n = new NoparameterConstructor ();
		n.test();
	
	}

}
