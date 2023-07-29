package ConstructorExamples;

public class StudentCalling {
	
public static void main(String[] args) {
		
		// initialization by object.
		// approach 1
//		Student s = new Student();               // created the object
//		s.rollno=101;                            //initialization
//		s.sname="ABC";
//		s.grade='c';
//		s.display();
		
		// approach 2.
//		System.out.println("==========================================================");
//		Student s1 = new Student();
//		s1.getstudentdetails(102, "xyz", 'A');      // With parameter
//		s1.display();
		
		// approch 3 constructor
		
		Student s3= new Student (103,"PQR",'A');
		s3.display();
		System.out.println("========================");
		
		Student s4=new Student(104,"junaid",'A');
		s4.display();
	}
}

