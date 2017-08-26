package com.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomeRetryListener implements IRetryAnalyzer{

	private int retryCounter=0;
	private int retryLimit=4;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE && retryCounter<=retryLimit)
		{
			
			try{
				
				Thread.sleep(3000);
				System.out.println(String.format("MethodName::%s RetryCount::%d", result.getMethod(),retryCounter));
				
				retryCounter++;
				return true;
				
			}
			catch(Exception e){
				
				
				
				
			}
			
			
		}
		// TODO Auto-generated method stub
		return false;
	}

}
