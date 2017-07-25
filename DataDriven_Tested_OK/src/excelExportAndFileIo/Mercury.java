package excelExportAndFileIo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelTest.ExcelApi;
import ExcelTest.ExcelDataProvider;


public class Mercury {

	 ExcelApi eat=null;
	 String xlPath="C:\\Users\\Hituj Velukar\\Desktop\\Data\\Book5.xls";
     String sheetNames="MercuryLogin";

	
	//@Test(dataProvider="mercurylogin", dataProviderClass=ExcelDataProvider.class)
	//public  static void SIGNIN(String User,String pwd)
	//public  static void SIGNIN()
	@Test(dataProvider="mercurylogin", dataProviderClass=ExcelDataProvider.class)
	public  static void SIGNIN(String User,String pwd)
	{
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://localhost/servlets/com.mercurytours.servlet.WelcomeServlet");
		driver.findElement(By.xpath("//td/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.cssSelector("tr>td>input[name='userName']")).sendKeys(User);
		driver.findElement(By.cssSelector("tr>td>input[name='password']")).sendKeys(pwd);

	}
	
	
	/*
	 * 
	 * ===============================BELOW CODE IS FOR TESTING PURPOSE AND WORKS AS EXPECTED=========================================
	 *  
	 */
	
	/*public Object[][] testData(String excelPath, String sheetName)
			throws Exception {

		
		eat = new ExcelApi(excelPath);

		int retRowNum = eat.getRowCount(sheetName);
		int retColNum = eat.getColCount(sheetName);
		Object getExcelData[][] = new Object[retRowNum][retColNum];

		System.out.println("Total Row::::" + retRowNum);
		System.out.println("Total Column::::" + retColNum);

		for (int i = 1; i <= retRowNum; i++) {
			for (int j = 0; j < retColNum; j++) {

				System.out.println(eat.getCellData(sheetName, i, j));
				//Always keep row col combination as [i-1][j] to avoid array out of bound exception
				getExcelData[i-1][j] = eat.getCellData(sheetName, i, j);
				

			}

		}

		return getExcelData;

	}
	
	
	@DataProvider(name="mercurylogin")
	public Object[][] loginData() throws Exception
	{
		Object data[][]=testData(xlPath, sheetNames);
		
		return data;
	}
	*/
	
	}

