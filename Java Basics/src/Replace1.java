import java.lang.*;
public class Replace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=0;
		
		String str = "this is my book";
		
		
		
	do
		{
			
			
			pos=str.indexOf('s');
			
			str=str.substring(0, pos)+"RR"+str.substring(pos+1);
			
			
		}while(pos>1);
			
			
			

		System.out.println(str);
	
		
		
		
	}

}
