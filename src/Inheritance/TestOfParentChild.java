package Inheritance;

public class TestOfParentChild {
	
	public static void main(String[] args) {
		
		// on parent referance you can call parent only
		
		Parent p=new Parent();             // only parent class call
		p.m1();
		
		System.out.println("===========");
		
		// on child refarance you can call parent as well as child class
		
		Child c=new Child();// this will call both parent class and child class b'coz child extends on parent
		c.m1();
		c.m2();
		
	}

}
