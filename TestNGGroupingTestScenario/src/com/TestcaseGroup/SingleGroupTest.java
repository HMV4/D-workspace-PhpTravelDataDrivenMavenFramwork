package com.TestcaseGroup;

import org.testng.annotations.Test;

public class SingleGroupTest {
	
  @Test(groups={"Sanity","Smoke	"})
  public void login() {
	  System.out.println(" Sanity and Smoke login");
 
  }
  
  
  
  @Test(groups={"Sanity","Smoke"})
  public void viewProduct() {
	  
	  System.out.println("Sanity and Smoke view product");
  }
  
  
  @Test(groups={"Smoke"})
  public void register() {
	  System.out.println("Smoke register only ");
  }
  
  @Test(groups={"Sanity"})
  public void cancel() {
	  
	  System.out.println(" sanity cancel  only");
  }
  
  
  @Test(groups={"Sanity","Smoke	"})
  public void logout() {
	  System.out.println(" Sanity and Smoke");
  }
}
