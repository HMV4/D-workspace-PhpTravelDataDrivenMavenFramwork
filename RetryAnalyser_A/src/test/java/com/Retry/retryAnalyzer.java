package com.Retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer{
	
	int count=0;
	int retryLimit=3;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(result.getStatus()==ITestResult.FAILURE && count<=retryLimit)
		{
			try {
				Thread.sleep(1000);
				System.out.println(String.format("Mehodname: %s retrycount :%d", result.getMethod(),count));
				count ++;
				return true;	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return false;
	}
	
	
	
	

}
