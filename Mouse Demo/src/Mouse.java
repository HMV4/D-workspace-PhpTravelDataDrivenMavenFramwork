
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse {

	 static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://events.jquery.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
	    //WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#menu-item-374")));
	    //element.click();
		//WebElement N=driver.findElement(By.cssSelector("#name_3_firstname"));
		
		
		
		WebElement element = driver.findElement(By.xpath("//section/nav/div/ul[2]/li[2]/a"));
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
															
		//a.click(N).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		//a.doubleClick(N).build().perform();//to select text
	}
}