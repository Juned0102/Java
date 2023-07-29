package ConstructorExamples;

public class Student {
	// Declare the variable
	int rollno;
	String sname;
	char grade;
	
	// by using constructor for approach 3 in main
	Student(int rn,String sn,char ch){
		rollno=rn;
		sname=sn;
		grade= ch;
	}
	
	// by using method for approach 2 in main
	public void getstudentdetails(int rn,String sn,char ch) {
		rollno=rn;
		sname=sn;
		grade= ch;
	}
	
	// to print the values.
	public void display() {
		System.out.println("The Student Rollno is "+ rollno);
		System.out.println("The Student name is "+ sname);
		System.out.println("The Student grade is "+ grade);
	}
//	public static void main(String[] args) {
//		int rollNo=103;
//		String sname="Junaid";
//		char ch='A';
//		
//		
//		
//	}
	
	
}
	