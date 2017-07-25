
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				//if(i==1||i==3||j==1||j==4)
				//{
				int k=i+j-1;
				if(k>5)
				{
				System.out.print(k-5);
				}
				
				//}
				else
				{
				System.out.print(" ");
				}
			
			}
			
			System.out.println("");
		}

	}

}
