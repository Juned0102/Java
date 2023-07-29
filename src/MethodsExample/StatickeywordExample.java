package MethodsExample;

public class StatickeywordExample {
	
	int empid;
	String empname;
	static int  dept=10;
	
	
	public void display() {
		System.out.println("employee id is "+empid );
		System.out.println("employee name is "+empname);
		System.out.println("employee department is "+dept);
	
		
	}
	public static void main(String[] args) {
		StatickeywordExample sk1=new StatickeywordExample();
		sk1.empid=101;
		sk1.empname="ABC";
		
		sk1.display();
		System.out.println("================================+");
		
		StatickeywordExample sk2=new StatickeywordExample();
		sk2.empid=102;
		sk2.empname="XYZ";
		
		sk2.display();
		System.out.println("===============================+");
		
		StatickeywordExample sk3=new StatickeywordExample();
		sk3.empid=103;
		sk3.empname="zyx";
	
		System.out.println("=================================+");
		
		StatickeywordExample sk4=new StatickeywordExample();
		sk4.empid=104;
		sk4.empname="pqr";
	
		sk4.display();
		System.out.println("===================================+");
		
		StatickeywordExample sk5=new StatickeywordExample();
		sk5.empid=105;
		sk5.empname="cba";
		sk5.dept=6;
		sk5.display();
		System.out.println("====================================+");
		
		StatickeywordExample sk6=new StatickeywordExample();
		sk6.empid=106;
		sk6.empname="Junaid";
		
		sk6.display();
		System.out.println("======================================+");
	
		StatickeywordExample sk7=new StatickeywordExample();
		sk7.empid=107;
		sk7.empname="shaikh Junaid";
		
		sk7.display();
		
		
	}
}

