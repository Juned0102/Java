package ConstructorExamples;

public class ParameterConstructor {
	
	int a;
	String str;
	
	ParameterConstructor( int b,String d){
		a=b;                                         // here b=a not allowed   always remember
		str=d;                                       // here d=str not allowed always remember
		System.out.println("these is with Parameter constructor");
	}
	
	public void test() {
		System.out.println(a);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		ParameterConstructor p = new ParameterConstructor(50,"shaikh junaid");
		p.test();
		
	}

}
