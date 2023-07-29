package Inheritance;

public class ThisKeywordExample2 {
	
	    // declaration global variable
		int a;
		int b;
		
		//we can initialize variable by 3 ways class-object,constructor,method.
		
		// veriable initialization by using method 
		
		public void getvalues(int a, int b) {  //method not returning anything but accepting the parameter
		  this.a=a;                            // local variables  
		  this.b=b;
		}
		
		public void display() {
			System.out.println(a);
			System.out.println(b);
		}
		
		public static void main(String[] args) {
			
			ThisKeywordExample2  tk = new ThisKeywordExample2 ();
			tk.getvalues(15, 20);
			tk.display();
		}
		
	}
	
