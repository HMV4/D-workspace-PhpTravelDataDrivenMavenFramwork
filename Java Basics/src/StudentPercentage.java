
public class StudentPercentage { /// TO be Done

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int SecMark=55;
		int TotMark=100;
		int percent =SecMark / TotMark * 100;
		
		System.out.println(percent);
		
		if(percent<60)
			{
			System.out.println("Second Divsion");
			}
		else{
			
			if(percent>=60 && percent<75)
			{
				System.out.println("Kya Baat Frst Div ");
				
			}
			
			else{
				if(percent>=75)
				{
					System.out.println("BRAVOOOO");
				}
				
				else{System.out.println(" FAILED pls fill supplementry Form  :(");}
			
			}
			
			
			
		}
		
	}

}