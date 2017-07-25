import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class TestReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CreateHeader();
		InsertStep("1","Launch","Passed" );
	}
		
		public static void CreateHeader() throws IOException
		{
		String filePath="src/abc.txt";
		File f=new File(filePath);
		FileWriter fw=new FileWriter(f,true);
		fw.write("TCID ||"+ "  " + "Stepname ||" + "  " + "STATUS ||" +"\n");
		fw.close();
	

	}
		public static void InsertStep(String StepID,String Stepname,String Desc ) throws IOException
		{
		String filePath="src/abc.txt";
		File f=new File(filePath);
		FileWriter fw=new FileWriter(f,true);
		fw.write(StepID   + " | " + Stepname + " | " + Desc +"\n");
		fw.close();
	

	}
		

}
