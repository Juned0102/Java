package MethodsExample;

public class Employee {
	public static int Employee;
	int empid;
	String empname;
	double empsal;
	int deptNo;
	String empJob;
	
	
	public void display() {                                 //non static method
		System.out.println("Employee id is "+ empid);
		System.out.println("Employee Name is "+ empname);
		System.out.println("Employee sallary is "+ empsal);
		System.out.println("Employee department is "+ deptNo);
		System.out.println("Employee Job is "+ empJob);	
	}
//------------------------------------------------------------------------
	//these for calling in same class
	
	
// these for calling in same class	
//	public static void main(String[] args) {                     
//		Employee emp1=new Employee();               // these is non static calling type example
//		emp1.empid=101;
//		emp1.empname="Junaid"; 
//		emp1.empsal=25333.33;
//		emp1.deptNo=05;
//		emp1.empJob="Developer";
//		emp1.display();
//		
//	System.out.println("employee 2 details Shown below" );	
//		
//		Employee emp2=new Employee();                // these is non static calling type example
//		emp2.empid=123;
//		emp2.empname="Junaid 3610";
//		emp2.empsal=50500.33;
//		emp2.deptNo=10;
//		emp2.empJob="Tester";
//		emp2.display();
//		
//
//	}
	
	
	
	
	
	
	
	
	
	
}


