package ConstructorExamples;

public class Demo {
	int a;
	String str;
	
	Demo(){                                        // these is no Argument Constructor
		System.out.println("these is no argument constructor");    
		a=78;
		str="Shaikh";
		
	}
	Demo(int c,String d){                           // these is Argument Constructor
		System.out.println("with argument Constructor");
		a=c;
		d=str;
		
	}
	
	public void test() {
		System.out.println(a);
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		
		Demo d=new Demo();                            // calling no Argument Constructor
		d.test();
		
		Demo d1=new Demo(50,"The Hindustan Stone ");     // calling with Argument Constructor
		d1.test();
		
		
	}
		
	}
	
	
	


   




















