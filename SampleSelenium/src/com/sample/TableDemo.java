package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Hituj%20Velukar/Desktop/html3.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		
		for(int i=1;i<=rows.size();i++)
		{
			
			List<WebElement> cols = driver.findElements(By.xpath("//tr["+i+"]/td"));
			
			for(int j=1;j<=cols.size();j++)
			{
				
				WebElement cell =driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]"));
				
				System.out.println(cell.getText());
				break;
				
			}
		}
		
		
		//*[@id='txtOnwardCalendar']
	}

}