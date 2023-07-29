package PracticeInterfaceAbstract;

 class Sample1 {
	 
	int a;
	int b;
	
	public void getvalues( int a,int b) {
		this.a=a;
		this.b=b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Sample1 s =new Sample1();
		s.getvalues(12, 30);
		
	}
	
	
}
