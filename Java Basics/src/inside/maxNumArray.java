package inside;

import java.util.Scanner;

public class maxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstmax ,totalnumbers;



		Scanner s= new Scanner(System.in);	
		System.out.println("Enter  total num in the array");
		totalnumbers = s.nextInt();
		int a[]= new int[totalnumbers];
		System.out.println("Enter elements of array:");
		for(int i=0;i<totalnumbers;i++)
		{
			
			
			a[i]=s.nextInt();
			
		}
		
		firstmax=0;
		int secondmax = 0;
		int Thirddmax=0;
		int Fourthmax=0;
		
		
		for(int i=0;i<totalnumbers;i++)
		{
			if(firstmax < a[i])
			{
				
				Fourthmax=Thirddmax;

				Thirddmax=secondmax;
				
				secondmax=firstmax;
				
			    firstmax=a[i];	
			    
			    
			}
			else if(secondmax<a[i])
				
			{
				Fourthmax=Thirddmax;
				Thirddmax=secondmax;
				secondmax=a[i
				            ];
			}
			else if(Thirddmax <a[i]){
				
				Fourthmax=Thirddmax;
				Thirddmax = a[i];
				
			}
			else if(Fourthmax <a[i])
			{
				
				Fourthmax=a[i];
			}
			
		}
		
		
		{
		
	}
		
		
		System.out.println(" 1 MAX VALUE IS " + firstmax);
		System.out.println("2 MAX VALUE IS " + secondmax);
		System.out.println("3 MAX VALUE IS " + Thirddmax);
		System.out.println("4 MAX VALUE IS " + Fourthmax);
	}

}
