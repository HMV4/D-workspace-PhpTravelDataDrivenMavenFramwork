package inside;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isprime=true;
		
		Scanner sc= new Scanner(System.in);
		
		
		int num[]=  new int[50];
		
		System.out.println("totnumber");
		int arrnum= sc.nextInt();
		
		
		//int num =29;
				
		for(int i=0;i<arrnum;i++)
		{
			
			System.out.println("Enter numbers");
			
			num[i]=sc.nextInt();
			
			
		
		}
		
		
		for(int i=2;i<arrnum;i++)
		{
			
			System.out.println("Enter numbers");
		
			
			if(num[i-2]%i==0)
			{
				
				
				isprime=false;
				break;
				
			}
			
			
			
			if(isprime)
			{
				System.out.println(" prime num" + num[i-2]);
					
				
			}
			
			else{System.out.println("Not Prime"+num[i-2]);}
		}

	}

}
