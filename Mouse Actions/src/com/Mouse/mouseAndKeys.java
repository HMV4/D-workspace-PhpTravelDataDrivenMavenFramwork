package com.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAndKeys {

	public static void main(String args[])

	{
		WebDriver driver = new FirefoxDriver();
		Actions ae = new Actions(driver);
		driver.get("http://localhost/servlets/com.mercurytours.servlet.ReservationServlet");
		//driver.findElement(By.cssSelector(".mouseO" + "ut>a[href$='SignonServlet']")).click();
		
		// XPATH using preceding
		////select/option[contains(text(),'London')]/following-sibling::option[@value='San Francisco']--used to find particular option
		driver.findElement(By.xpath("//font/preceding::tr[6]/td[1]/a")).click();
		// send text in textbox using java script in selenium and click submits
		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('userName')[0].value='DDT1';");
		//executor.executeScript("document.getElementsByName('password')[0].value='DDT1';");
		//WebElement user=driver.findElement(By.name("userName"));
		
		// finding xpath of textbox  using its adjacent label
		WebElement user=driver.findElement(By.xpath("//tr[1]/td[1]/font/b/following::td[1]/input"));
		user.sendKeys("DDT1");
		driver.findElement(By.xpath("//tr[1]/td[1]/font/b/following::td[1]/input")).sendKeys(Keys.F5);
		driver.navigate().to(driver.getCurrentUrl());
		WebElement tab=driver.findElement(By.xpath("//table/tbody/tr[3]/td/p/font/a"));
		
		// Shift Tab
		tab.sendKeys(Keys.chord(Keys.SHIFT,"registration          form"));
		WebElement pass = driver.findElement(By.name("password"));
		
		// code to paste the content into textboxes
		/*ae.clickAndHold().moveToElement(user).release().keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).build().perform();
		ae.click(pass).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		*/
		
		
		// Sign on button click
		//executor.executeScript("document.getElementsByName('login')[0].click();");

		/*
		 * driver.findElement(By.cssSelector("input[name$='Name']")).sendKeys();
		 * driver.findElement(By.cssSelector("input[name^='pass']"))
		 */


		WebElement departFrom = driver.findElement(By.cssSelector("tr>td>select[name='fromPort']"));

		WebElement departOption = driver.findElement(By
				.cssSelector("tr>td>select>option[value$='York']"));

		// ae.moveToElement(departFrom).click().perform();

		// To select the values from drop using mouse actions ,we need to send
		// the keys.ArrowDown then keys.ENTER to select value in sendkeys() then
		// click() then keys.tab to move to next
		ae.moveToElement(departFrom).click().sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).click().sendKeys(Keys.TAB).build()
				.perform();

	}

}
