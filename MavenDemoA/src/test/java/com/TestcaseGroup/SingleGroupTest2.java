package com.TestcaseGroup;

import org.testng.annotations.Test;

public class SingleGroupTest2 {
	
  @Test(groups={"Sanity","Smoke	"})
  public void login() {
	  System.out.println(" Sanity and Smoke 2");
 
  }
  
  
  
  @Test(groups={"Sanity","Smoke"})
  public void viewProduct() {
	  
	  System.out.println("Sanity and Smoke2");
  }
  
  
  @Test(groups={"Smoke"})
  public void register() {
	  System.out.println("Smoke2");
  }
  
  @Test(groups={"Sanity"})
  public void cancel() {
	  
	  System.out.println(" Sanity2 ");
  }
  
  
  @Test(groups={"Sanity","Smoke	"})
  public void logout() {
	  System.out.println(" Sanity and Smoke2");
  }
}







