package com.learning.automation;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MySeleniumAutomation extends MySeleniumAutomation2{

	@BeforeMethod
		public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
	@Test
		public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	
	@Test
		public void testTheRegisterLink() {
		Assert.assertTrue(verifyTheRegisterLink());
		}
	
	@Test
		public void testSubmitButton() {
			Assert.assertEquals(verifySubmitButton(), true);
		}
	
	@Test
		public void verifyRegistration() {
		//completeRegistration();
		//verifyRegistered();
		Assert.assertTrue(completeRegistration());
		Assert.assertTrue(verifyRegistered());
		}
		
	@Test
	public void SubmitButton() throws InterruptedException {
		Assert.assertTrue(verifyClickSubmit());
	}
	
	@Test
	public void takeScreenshotView() throws IOException {
		takescreenshot(driver, "C:\\Users\\kaash\\Desktop\\JavaAssign\\LearningMyFirstCoreJava.png");
	}
	
	@AfterMethod
		public void closeTheBrowser() {
			driver.close();
		}
		
		
	}
