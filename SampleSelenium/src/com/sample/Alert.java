package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium%20Softwares/31July2016/WebPages/Alert.html");
		
		driver.findElement(By.xpath("//p")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
		
		

}
}
