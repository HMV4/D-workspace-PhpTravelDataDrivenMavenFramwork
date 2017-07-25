package com.SnapShot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.win32.WinBase.SYSTEMTIME;

public class SnapshotUtilty {

    static Random r= new Random(System.currentTimeMillis());
	static int random = r.nextInt(1000);
	

	public static void snapShots(WebDriver driver,String snapname) throws IOException {
		try {
			Thread.sleep(1000);
			TakesScreenshot Sshot = (TakesScreenshot) driver;
			File source = Sshot.getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\SelscreenShots\\"+snapname+random+".png");

			FileUtils.copyFile(source, dest);
			System.out.println("CAPTURED");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" Snap Exeption" + e.getMessage());
		}

	}

}
