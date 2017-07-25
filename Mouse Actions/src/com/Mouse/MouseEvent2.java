package com.Mouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseEvent2 {

	static WebDriver driver;
	static WebDriverWait wait_20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\DriverExe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement automationTools = driver.findElement(By.xpath("//button"));
		Actions ae = new Actions(driver);
		ae.moveToElement(automationTools).perform();
		// Course drop down
		List<WebElement> courseoptions = driver.findElements(By
				.xpath("//div[@class='dropdown-content']/a"));
		System.out.println(courseoptions.size());
		for (WebElement option : courseoptions) {
			String Inneroptions = option.getAttribute("innerHTML");
			boolean status=option.isEnabled();
			System.out.println(Inneroptions+ "::"+status);
			if (option.getText().equals("Appium")) {

				option.click();
				System.out.println("Appium Clicked");
				break;
			}
		}
     
     
     //-------------------------------------Way to locate hidden elements or the the elements  which have same IDs-------------
     driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
     List<WebElement> sex=driver.findElements(By.xpath("//input[@id='male']"));
     System.out.println(sex.size());
     
     for(WebElement e : sex)
     {
    	 
    	 int x=e.getLocation().getX();
    	 int y=e.getLocation().getY();
    	 if(y==0)
    	 {
    		 System.out.println(e.getText());
    		 e.click();
    		 break;
    	 }
    	 
     }
	}

}
