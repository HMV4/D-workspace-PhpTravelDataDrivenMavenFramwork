import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class snap {
	int x;
	
	 
	
	

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		//snap s= new snap(x);
		String str = "Java";
		String str1 = new String("Java");
		  
		System.out.println(str.equals(str1));
		System.out.println(str == str1);
		System.out.println( str.compareTo(str1) );
		
		String str2 = "StudyTonight";
		str2.concat(".com");
		System.out.println(str2);
		str2 = str2.toUpperCase();
		str2.replace("TONIGHT","today");
		System.out.println(str2);
		String str8 = "Java was developed by James Ghosling";
		System.out.println(str8.substring(19));
		
		String str9 = "Java Learners";
		  StringBuffer sb = new StringBuffer();
		  for(int i=0; i < str9.length(); i++)
		  sb.append(str9.charAt(i));
		  System.out.println(sb);
		
		  
		  
		  try
		  {
		    int arr[]={1,2};
		    arr[2]=3/0;
		    System.out.println(a[0]);         
		  }
		  catch(Exception e)
		  {
		    System.out.println("Exception");
		  }
		  catch(ArithmeticException e)
		  {
		    System.out.println("Divide by Zero");
		  }
		WebDriver driver =new FirefoxDriver();
	
			driver.get("https://google.com");
				TakesScreenshot Sshot = (TakesScreenshot) driver;
				File source = Sshot.getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\SelscreenShots\\"+"Error4.png");

				FileUtils.copyFile(source, dest);
				System.out.println("CAPTURED");

		
	}
}
