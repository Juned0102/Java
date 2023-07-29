package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {
	
	public static void main(String[] args) {
		// sorting the String
		
		ArrayList<String> cars = new ArrayList<String>();   // import from java.util
		cars.add("volkswagon");
		cars.add("bmw");
		cars.add("audi");
		cars.add("suzuki");
		cars.add("MercedezBenz");
		
// list of car before sorting.
		System.out.println("Before sorting of String "+ cars);
		Collections.sort(cars);                    //sorting in Ascending order
		
// list of car after sorting
		System.out.println("After sorting "+ cars);		
// Sorting cars in discending order 
		Collections.sort(cars,Collections.reverseOrder());
		System.out.println("After the sorting in discending "+cars);
	
		
		ArrayList<Integer> numbers = new  ArrayList<Integer>();
		numbers.add(5);                             // index is 0
		numbers.add(50);                            // index is 1
		numbers.add(15);                            //          2
		numbers.add(25);                            //          3
		numbers.add(58);                            //          4
		numbers.add(105);                           //          5
		numbers.add(5005);                          //          6
		
		
	
	
// In ascending order		
		System.out.println("Before sorting of "+ numbers);
		Collections.sort(numbers);           
        System.out.println(numbers);       
		
// In Descending order		
		System.out.println("To print numbers in reverse in order ");
		Collections.sort(numbers,Collections.reverseOrder());       
		System.out.println(numbers);
		
	
		
	}

	
	}
	


