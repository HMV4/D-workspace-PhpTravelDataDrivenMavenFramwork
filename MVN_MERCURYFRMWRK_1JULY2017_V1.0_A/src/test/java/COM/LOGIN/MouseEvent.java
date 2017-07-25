package COM.LOGIN;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;




public class MouseEvent{
	static WebDriver driver;
	static WebDriverWait wait_20;
	
	@Test
	public static void mouseDemo() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\DriverExe\\chromedriver.exe");
		driver =new ChromeDriver();
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
	
		
		WebElement drag =driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions ae= new Actions(driver);
		
		//-----------------------------Right Click and Select context option--------------------------------------
		
	     //ae.contextClick(drag).perform();
		
		//------------------------------DRAG DROP------------------------------------------------------------------
		//ae.dragAndDrop(drag, drop).perform();
		//SnapshotUtilty.snapShots(driver, "BeforeDrag");
		ae.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		//SnapshotUtilty.snapShots(driver, "AfterDrag");
		//ae.dragAndDropBy(drag, 500, 600).perform();
	     
	     driver.switchTo().defaultContent();
	     //Resizable
	     driver.findElement(By.xpath("//aside[1]/ul/li[3]/a")).click();
		 driver.switchTo().frame(0);
		 //SnapshotUtilty.snapShots(driver, "BeforeResize");
		 WebElement resize =driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		 ae.clickAndHold(resize).moveByOffset(-80, -70).release(resize).build().perform();
		// SnapshotUtilty.snapShots(driver, "AfterResize");
		 
		 //--------------------------------------Slider------------------------------------------------------------------
		 
		 driver.switchTo().defaultContent();
		 //Silder click  driver.switchTo().defaultContent(); //div[@id='green']/span
		 driver.findElement(By.xpath("//ul/li/a[text()='Slider']")).click();
		 // color picker click
		 driver.findElement(By.xpath("//li//a[text()='Colorpicker']")).click();
		 driver.switchTo().frame(0);
		 //Color Slider wait min 50 reqd 
		 wait_20=new WebDriverWait(driver,55);
		 wait_20.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body")));
		 //wait_20.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='green']/span")));
		// SnapshotUtilty.snapShots(driver, "BeforeSlide");
		WebElement greenSlider= driver.findElement(By.xpath("//div[@id='green']/span"));
	    wait_20.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='red']/span")));
	     WebElement redSlider= driver.findElement(By.xpath("//div[@id='red']/span"));
	     wait_20.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='blue']/span")));
		 WebElement blueSlider= driver.findElement(By.xpath("//div[@id='blue']/span"));
		ae.clickAndHold(greenSlider).moveByOffset(-70, 0).release(greenSlider).build().perform();
		 ae.clickAndHold(redSlider).moveByOffset(-70, 0).release(redSlider).build().perform();
		ae.clickAndHold(blueSlider).moveByOffset(-60, 0).release(blueSlider).build().perform();
		//SnapshotUtilty.snapShots(driver, "AftercolorSlide");
		
		 
		 driver.quit();
			
	}
	
	
}
