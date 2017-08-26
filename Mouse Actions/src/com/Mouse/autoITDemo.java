package com.Mouse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class autoITDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Steps to perform AutoIT operation

		/*
		 * While automating web-application many times you will get window based
		 * activity like- file upload, file download pop-up, window
		 * authentication for secure sites etc. In this case, Selenium fails and
		 * will not be able to handle desktop elements to avoid this we will use
		 * AutoIT script that will handle desktop or windows elements and will
		 * combine AutoIT script with our Selenium code.
		 * 
		 * Steps:
		 * Download and install -->SciTE4AutoIt3,autoit-v3-setup from web.
		 * Go to "C:\Program Files (x86)\AutoIt3\SciTE" and open "SciTE" .exe application editor
		 * Goto "C:\Program Files (x86)\AutoIt3 and open Au3Info .exe'"
		 * Click on Finder tool and drag and drop the finder tool to the location from where we want to pickUp the file.
		 * then write controlfocus("Windowtitle Name ","","controlIDi.e Class + instance id from autoid finder tool")
		 * then write cotrolSetText("Windowtitle Name","","controlIDi.e Class + instance id from autoid finder too","path of the file to upload")
		 * then write controlclick("Windowtitle Name","","control id of open button i.e 'Class + instance id from autoid finder too'")
		 * Chrome:
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
ChromeOptions options = new ChromeOptions();
options.addArguments("incognito");
capabilities.setCapability(ChromeOptions.CAPABILITY, options);

FireFox:
FirefoxProfile firefoxProfile = new FirefoxProfile();    
firefoxProfile.setPreference("browser.privatebrowsing.autostart", true);

Internet Explorer:
DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
capabilities.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true); 
capabilities.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
		 */

		ProfilesIni prfo = new ProfilesIni();
		FirefoxProfile fprof= prfo.getProfile(null);
		
		fprof.setAcceptUntrustedCertificates(true);
		fprof.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver = new FirefoxDriver(fprof);
		// Actions ae = new Actions(driver);
		driver.get("file:///D:/Selenium%20Softwares/31July2016/WebPages/WindowHandlerIndex.html");
		driver.findElement(By.xpath("html/body/form/input[1]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Hituj Velukar\\Documents\\uploadDemo.exe");
	}

}