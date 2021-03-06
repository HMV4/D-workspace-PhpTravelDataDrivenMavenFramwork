package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Quickbook {

	static WebDriver driver;

	static By quickBookButton = By.xpath(".//*[@id='content']/div[1]/div[1]");

	// ----------------Apply Tax------------------
	static By applyTax = By.name("applytax");

	// ------------Service-------------------------
	static By service = By.name("service");

	// -------------Next Button--------------------
	static By nextButton = By.xpath(".//*[@id='quickbook']//div//button[2]");

	public Quickbook(WebDriver driver) {

		this.driver = driver;
	}

	public static void quickBookButtonClick() {
		// Anonymous class
		new WebDriverWait(driver, 15).until(ExpectedConditions
				.elementToBeClickable(quickBookButton));

		driver.findElement(quickBookButton).click();

	}

	public static  void applyTax() {
		Select taxoption = new Select(driver.findElement(applyTax));
		System.out.println(taxoption.isMultiple());
		taxoption.selectByVisibleText("Yes");

	}

	public static void service() {
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.visibilityOf(driver.findElement(service)));
		Select serviceOpt = new Select(driver.findElement(service));
		serviceOpt.selectByIndex(1);

	}

	public static void nextButtonClick() {
		driver.findElement(nextButton).click();

	}

}
