package Collection;

import java.util.ArrayList;

public class ArraylistAddallMethod {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList ();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		
		ArrayList al1 =new ArrayList ();
		al1.add("One");
		al1.add("Two");
		al1.add("Three");
		al1.add("four");
		System.out.println(al1);
		
		al.addAll(al1);                            // this will add teo arraylist and make one arraylist.
		System.out.println(al);
		
		
		
		
		
	}

}
