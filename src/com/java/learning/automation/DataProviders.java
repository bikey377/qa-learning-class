package com.java.learning.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends DataProvidersMethod {
	

	@DataProvider
	public Object[][] signOnData(){
		
		return new Object[][] {
				{"bikey277", "Practice12"},{"bhotebabu", "Cali123"},{ "kppanta" , "Hello1234$"},{"binda" , "Binda123"},
				{"^%&*%^&* ", "  "}
		};
	}


	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	
}
	
	@Test(dataProvider = "signOnData")
	public void signingInWithDataProvider(String Username , String Password) {
		signOnMethod (Username, Password);	
		Assert.assertTrue(verifySignOnmethodIsSuccessful());
	}
}
