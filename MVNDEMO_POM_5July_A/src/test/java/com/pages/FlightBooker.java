package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.SnapShot.SnapshotUtilty;

public class FlightBooker extends TestBase {
	
	 
    @Test
	public void ConfirmFlight() throws IOException 
	{
		// TODO Auto-generated method stub
		
		// BOOK A FLIGHT page titleFirstNameValue
		System.out.println(driver.getTitle());
		
					//FIRST NAME    
					//  driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")).sendKeys(FirstName);

					//driver.findElement(By.name("passFirst0")).sendKeys("Rohit");
					getCSSpath("FIRSTNAME").sendKeys(objrep.getProperty("FirstNameValue"));
					
					//LAST NAME   
				    //driver.findElement(By.cssSelector("tr>td>input[name='passLast0']")).sendKeys(LastName);
					getCSSpath("LASTNAME").sendKeys(objrep.getProperty("LastNameValue"));

						  //MEAL    driver.findElement(By.cssSelector("tr>td>select[name='pass.1.meal']"));
						 /* WebElement Meal =getCSSpath("MEAL");
						   Select Mealoptions =new Select(Meal);
						   List<WebElement> MealList = Mealoptions.getOptions();
						   for(WebElement PickMeal:MealList)
						   {
							   if(PickMeal.getText().equalsIgnoreCase(objrep.getProperty("SrceMeal")))
							   {
								   System.out.println("MEAL SELECTED"+PickMeal.getText());
							       PickMeal.click();
							   }
							 break;

						   }
                         
   							*/
						  //creditnumber" creditnumber
						   
						  // driver.findElement(By.cssSelector("tr>td>input[name='creditnumber']")).sendKeys(CreditNum);
						   
						   getCSSpath("CREDITNUMBER").sendKeys(objrep.getProperty("creditnumbervalue"));
						   

						   //Secure Purchase
						   //driver.findElement(By.cssSelector(Bookflight+"[name='buyFlights']")).click();
						   //driver.wait(1000);
						   getCSSpath("SecurePurchase").click();
						   System.out.println("Purchase Successful");
						   
						   //booking Confirmation
						   //System.out.println(driver.findElement(By.cssSelector("p>font>b>font")).getText());bookingConfirmation
						   //System.out.println(getCSSpath("bookingConfirmation").getText());
					 
						/* WebElement itr=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]"));
						 itr.getRect();*/
						// SnapshotUtilty.snapShots(driver,"IternaryBooked");
						 //System.out.println(itr);
					
				}

	}


