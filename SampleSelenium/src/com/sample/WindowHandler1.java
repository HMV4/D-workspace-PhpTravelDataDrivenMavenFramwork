package com.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandler1 {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium%20Softwares/31July2016/WebPages/WindowHandlerIndex.html");
		String MainHandler=driver.getWindowHandle();
		driver.findElement(By.linkText("Open New Seprate Window1")).click();
		driver.findElement(By.linkText("Open New Seprate Window2")).click();
		driver.findElement(By.linkText("Open New Seprate Window3")).click();

		Set<String> hwnds=driver.getWindowHandles();
		for (String wnd : hwnds) {
			driver.switchTo().window(wnd);
			if(driver.getTitle().equalsIgnoreCase("Window 2"))
				driver.findElement(By.id("1")).sendKeys("Rohit");		
		}
		
		driver.switchTo().window(MainHandler);
		driver.findElement(By.id("1")).sendKeys("Rohit");		
		





	}
}
