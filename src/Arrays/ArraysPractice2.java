package Arrays;

public class ArraysPractice2 {
	public static void main(String[] args) {
//		//declaration,memory allocation,and initialization together and it is use when we know the final value
//		int [] marks = {98,45,79,99,80} ;
//		                    //marks[5] =96;throws an error
//		System.out.println(marks[3]);
//		

		int a[] [] =new int [3] [3];
		a[0] [0] =10;
		a[0] [1] =20;
		a[0] [2] =30;
		a[1] [0] =40;
		a[1] [1] =50;
		a[1] [2] =60;
		a[2] [0] =70;
		a[2] [1] =80;
		a[2] [2] =90;
		for(int i=0 ;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] +" ");				
			}
			System.out.println();
		}
		
    }	
}
