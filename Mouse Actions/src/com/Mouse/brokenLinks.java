package com.Mouse;

import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.net.*;
import org.apache.http.HttpClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class brokenLinks {

	public static void main(String [] args)
	{
		WebDriver driver = new FirefoxDriver();
		String url="";
		String homepage="http://localhost/servlets/com.mercurytours.servlet.ReservationServlet";
		HttpURLConnection urlCon= null;

		driver.get(homepage);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it= links.iterator();
		
		while(it.hasNext())
		{
			url=it.next().getAttribute("href");
			System.out.println(":::::::::>>>>>>>"+url);
			
			
			if(url==null || url.isEmpty())
			{
				
				System.out.println(" not configured or tag is empty");
				continue;
			}
			
			
		
		}
		
		if(!url.startsWith(homepage))
		{
			System.out.println("URL not belongs to expected domain");
			continue;
			
		}
		
		 try {
             urlCon = (HttpURLConnection)(((Object) new URL()).openConnection());
             
             urlCon.setRequestMethod("HEAD");
             
             urlCon.connect();
             
             respCode = urlCon.getResponseCode();
             
             if(respCode >= 400){
                 System.out.println(url+" is a broken link");
             }
             else{
                 System.out.println(url+" is a valid link");
             }
                 
         } catch (MalformedURLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
}
}
