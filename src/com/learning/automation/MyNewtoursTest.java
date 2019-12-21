package com.learning.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyNewtoursTest extends AllMyMethods {

	//dataProvider
	//1 dimensional Array
	
	//
	@Test(enabled= false)
	public void learningArray() {
		int [] oneDimens = new int [3];
		oneDimens [0] = 1;
		oneDimens [1] = 2;
		oneDimens [2] = 3;
	
	
		
		for (int i = 0; i < oneDimens.length; i++) {
			System.out.println(i);
		} 
	}

	
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		//driver.manage().window().maximize();
	}
	
	
	
	
	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	
	@Test
	public void testSignOnLink() {
		Assert.assertTrue(verifySignOnLink ());
	}
	
	@Test
	public void testSubmitButton() {
	Assert.assertTrue(verifySubmitButton());
	}
	
	@Test
	public void testSignOn() {
		Assert.assertTrue(signingIn());
	}
	
	@Test
	public void testContinueButton1(){
	Assert.assertTrue(verifyContinueButton1());	
	}
	
	@Test
	public void testFlightFinder() {
		Assert.assertTrue(verifyFlightFinderInfo());
	}
	
	@Test
	public void testContinueButton2() {
		Assert.assertTrue(verifyContinueButton2());
	}
	
	@Test
	public void testSelectFlight() {
		Assert.assertTrue(verifySelectFlight());
	}
	
	@Test
	public void testBookFlight() {
		Assert.assertTrue(verifyBookFlight());
	}
	
	@Test
	public void testSecurePurchaseButton() {
		Assert.assertTrue(verifySecurePurchaseButton());
	}
	
	@Test(description= "Ticket is booked")
	public void testFlightBooked() {
		Assert.assertTrue(verifyTicketBooked());
	}

	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
