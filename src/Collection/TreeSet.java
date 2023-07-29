package Collection;

import java.util.Iterator;

public class TreeSet {
	
	public static void main(String[] args) {
		java.util.TreeSet ts = new java.util.TreeSet ();
		// add element 		
		ts.add("F");
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		ts.add("A");
		// adding duplicates
		
		ts.add("A"); 
		System.out.println(ts);
		
		// Getting the first value
		System.out.println("first value is :- "+ ts.first());
	
		// immediate elements
		String val = "C";
		System.out.println("Higher member "+ ts.higher(val));
		System.out.println("lower member "+ ts.lower(val));
		
		//remove first and last => pollfirst(),polllast()
//		ts.pollFirst();
//		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	
	}
	

}
