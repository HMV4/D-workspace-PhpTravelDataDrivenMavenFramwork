package com.STOCK1;

com.STOCK;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseEvent{
	
	
	
	public static void main(String ARGS[])
	{
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement drag =driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions ae= new Actions(driver);
		ae.dragAndDrop(drag, drop).perform();
		
		
		
		
		
	}
	
	
}