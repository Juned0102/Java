package Automation;

public class DataType {
	public static void main(String[] args) {
		byte ab =1;                          // accept  3 numbers only
		short s= 25;                         // accept  5 numbers only
				
		int a = 10;                          //we can add number upto 8-9 numbers only not more
		long l = 250000000;                  //we can add upto 17-18 number by writing l in last(by using suffix)
		long l1 = 3612345678908765432l;
		
		float f = 2.3456f;                   //we use these to represent the values in points(write suffix f or F)
		double d = 25.34567787;              //we use to represent the value is decimal
		
		char c = 'h';                        //use for writing single character
		boolean b = true;                    // only for true or false
		int mobno =1234567896;
		
		System.out.println(ab);
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
		System.out.println(mobno);
		System.out.println(d);
		
	}

}
