package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
	
	public static void main(String[] args) {
	// creating linkedHashset	
		 
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
//   	lhs.add(1);	
		
// try to adding duplicate
		lhs.add("A");
		lhs.add("E");
		System.out.println(lhs);
// to check the size 		
		System.out.println("the size is :- "+lhs.size());
// to check element present in list ore not o/p will be boolean		
		System.out.println("checking the present elelment "+ lhs.contains("A"));
		
// to remove element 
		lhs.remove("E"); 
		System.out.println(lhs);         // remove Method
		
		System.out.println("the element Z is available for removal "+lhs.remove("Z"));// o/p is false b'coz Z is not available
		System.out.println(lhs);
		
		
// to read
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
	

}
