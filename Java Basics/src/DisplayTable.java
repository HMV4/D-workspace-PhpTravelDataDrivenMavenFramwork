import java.util.Scanner;


public class DisplayTable {

	public static void main(String[] args) {
		
		int b[]={1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
			
		int a[]={10,20,30,40,50,60,70,80,90,100};
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter next value");
			a[i]=sc.nextInt();
		}
		
	
		//print
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
