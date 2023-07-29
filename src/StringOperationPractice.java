
public class StringOperationPractice {
	public static void main(String[] args) {
		
		String s1="Junaid";
		long i = 9011777191l;
		int j=26;
		String s2="Engineering Graduate";
		float s3=75.79f;
		float s7=60.68f;
		double s4=90.1234567435435;
		char c='A';
		byte b=1;
		String s5="MY NAME IS";
		String s6="junaid";
		System.out.println("Customer Name is "+s1);
		System.out.println("Customer Mobile number is "+i);
		System.out.println("Customer Age is "+j);
		System.out.println("Customer Education is "+s2);
		System.out.println("Customer Percentage in 10th is "+s3);
		System.out.println("Customer Percentage in 12th is "+s7);
		System.out.println("Custemor percentage in Engineering is "+s4);
		System.out.println("Custemor Grade is "+c);
		System.out.println("Custemor Rank is "+b);
		System.out.println(s5);
		System.out.println(s5.trim());
		System.out.println(s5+" ".concat(s6));
		System.out.println(s6.length());
		System.out.println(s6.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s5.equals(s6));
		System.out.println(s6.charAt(3));
		System.out.println(s6.indexOf('n'));
		System.out.println(s6.replace('j','J'));
		
	}
	}

