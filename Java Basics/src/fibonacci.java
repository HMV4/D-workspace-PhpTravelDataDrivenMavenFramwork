
public class fibonacci implements Myinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonacci f= new fibonacci();
		f.show();
		f.display();
		
		int k=0;
		int a=1,b=1;
		System.out.print("1 1");
		
		while(k<=50)
		{
			
			k=a+b;
			System.out.print(" "+k + "  ");
			//System.out.println(" ");
			a=b;
			b=k;
			
			
		}
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("SHOW");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display");
		
	}

}
