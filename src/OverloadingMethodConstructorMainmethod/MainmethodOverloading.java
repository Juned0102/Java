package OverloadingMethodConstructorMainmethod;

public class MainmethodOverloading {
	
	
	public static void main(int x) {
		System.out.println("single argument main method "+x);
	}
	public static void main(int x,int y) {
		System.out.println("two argument main method "+(x+y));
	}
	public static void main(int x,int y, int z) {
		System.out.println("three argument main method "+(x+y+z));
	}
	public static void main(int x,double y) {
		System.out.println((x+y));
	}
	
	public static void main(String[] args) {
		
		MainmethodOverloading mo = new MainmethodOverloading();
		mo.main(10);               // call int
		mo.main(10, 20);           // call int-int
		mo.main(10,10, 10);        // call int-int-int
		mo.main(10, 5.5);          // call int-double
		
	}

}
