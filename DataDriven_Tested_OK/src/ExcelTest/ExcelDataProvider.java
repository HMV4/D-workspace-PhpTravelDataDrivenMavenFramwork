package ExcelTest;

import org.testng.annotations.DataProvider;
import ExcelTest.ExcelApi;

public class ExcelDataProvider {
	static ExcelApi eat = null;
	static String xlPath="C:\\Users\\Hituj Velukar\\Desktop\\Data\\Book5.xls";
	static String sheetNames="MercuryLogin";

	
	/*@DataProvider(name="QuickBook")
	public Object[][] userQuickBookData() throws Exception
	{
		Object[][] bookingData=testData("C:\\Users\\Hituj Velukar\\Desktop\\Data\\Book5.xls", "Login");
		return bookingData;
	}*/
	
	@DataProvider(name="mercurylogin")
	public static Object[][] mercuryloginData() throws Exception
	{
		Object[][] bookingData=testData(xlPath, sheetNames);
		return bookingData;
	}
	
	
	
	//-------------------Method to get data from ExcelAPI Class------------------------------------------------------------------
	//@SuppressWarnings("null")
	public  static Object[][] testData(String excelPath, String sheetName)
			throws Exception {

		eat = new ExcelApi(excelPath);

		int retRowNum = eat.getRowCount(sheetName);
		int retColNum = eat.getColCount(sheetName);

		System.out.println("Total Row::::" + retRowNum);
		System.out.println("Total Column::::" + retColNum);
		

		Object getExcelData[][] = new Object[retRowNum][retColNum];

		for (int i = 1; i <= retRowNum; i++) {
			for (int j = 0; j < retColNum; j++) {

				getExcelData[i-1][j] = eat.getCellData(sheetName, i, j);

			}

		}

		return getExcelData;

	}

}
