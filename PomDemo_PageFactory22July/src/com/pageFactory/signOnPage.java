package com.pageFactory;

import com.pages.TestBase;

public class signOnPage extends TestBase {

	public static void userName(String username) {
		driver.get(config.getProperty("HomePage_URL"));
		getXpath("SIGNON").click();
		// getXpath("userName").sendKeys(objrep.getProperty("userNamevalue"));
		getXpath("userName").sendKeys(username);

	}

	public static void passWord(String passWord) {
		// getXpath("password").sendKeys(objrep.getProperty("passwordvalue"));
		getXpath("password").sendKeys(passWord);
	}

	public static void signONSubmitButton_Click() {
		getXpath("Submit").click();

	}

	public static void mercurySignOn(String username, String password) {

		signOnPage.userName(username);
		signOnPage.passWord(password);
		signOnPage.signONSubmitButton_Click();

	}

}
