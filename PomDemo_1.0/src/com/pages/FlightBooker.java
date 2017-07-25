package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooker {
	
	 WebDriver driver =new FirefoxDriver();

	public void ConfirmFlight(String FirstName,String LastName,String SrceMeal,String CreditNum,String Bookflight) 
	{
		// TODO Auto-generated method stub
		
		// BOOK A FLIGHT page title
		System.out.println(driver.getTitle());
		
					//FIRST NAME    
					//  driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")).sendKeys(FirstName);

					driver.findElement(By.name("passFirst0")).sendKeys("Rohit");
					
					//LAST NAME   
				    driver.findElement(By.cssSelector("tr>td>input[name='passLast0']")).sendKeys(LastName);

						  //MEAL
						   WebElement Meal =driver.findElement(By.cssSelector("tr>td>select[name='pass.1.meal']"));
						   Select Mealoptions =new Select(Meal);
						   List<WebElement> MealList = Mealoptions.getOptions();
						   for(WebElement PickMeal:MealList)
						   {
							   if(PickMeal.getText().equalsIgnoreCase(SrceMeal))
							   {
								   System.out.println("MEAL SELECTED"+PickMeal.getText());
							       PickMeal.click();
							   }
							 break;

						   }


						  //creditnumber" 
						   
						   driver.findElement(By.cssSelector("tr>td>input[name='creditnumber']")).sendKeys(CreditNum);

						   //Secure Purchase
						   driver.findElement(By.cssSelector(Bookflight+"[name='buyFlights']")).click();
						   driver.wait(1000);
						   System.out.println("Purchase Successful");
						   //booking Confirmation
						   System.out.println(driver.findElement(By.cssSelector("p>font>b>font")).getText());
					 
				}

	}


