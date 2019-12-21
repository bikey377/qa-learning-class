package com.learning.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmailPractice2 extends MySeleniumAutomation2{
	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	}
	 // verifying the title of the page
	@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	// verifying the 'SUBMIT' button is there or not ?
	@Test
	public boolean testSubmitButton() {
	clickRegister();
	Assert.assertEquals(testSubmitButton(), true);//assertEquals(testSubmitButton(), true);
	return true;

	}
	
		

	// closing browser after each test case run
	/*@AfterMethod
	public void closeTheBrowser() {
	driver.close();
	}

	*/
}
