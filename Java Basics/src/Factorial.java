import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = 1;
		//int num =7;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int size =s.nextInt();
		for(int i=size;i>=1;i--)
		{
			fact=fact*i;
			
			
		}
		
		System.out.println("Factorial of " +size + "  Is  " + fact  );
	}

}
