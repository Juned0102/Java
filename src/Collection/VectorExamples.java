package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExamples {
	
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		vec.add('A');
		vec.add("PQR");
		vec.add(2);
		vec.add("Delhi");
		vec.add("Pune");
		vec.add(5000);             //		
		System.out.println(vec);              // add all element which are present vec.		
		System.out.println(vec.capacity());   
		
		vec.set(3, "XYZ");                    // this will at place of 3rd index
		System.out.println(vec);
		
		System.out.println("checking the Emptiness:- "+ vec.isEmpty());   // o/p is in boolean
		
// to check the size of vec.this will show the size of vec not on index basis,its on counting basis		
		System.out.println("checking the vector size:- "+vec.size()); 

// to check the perticular element or number available inside or not. o/p is in boolean		
		System.out.println("contain method:-"+vec.contains(2));  

// to check by index number which element is present then we use .get(indexnumber)		
		System.out.println("check the index:- "+ vec.get(1) );
		
		
// Reading the vector by using iterator
		
                               	//   Iterator
//		Iterator itr =vec.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
// Reading vector by using Enumeration		
	
//		Enumeration en = vec.elements();
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
//		
		
		ListIterator litr = vec.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		
		
		
		
	}
	

}
