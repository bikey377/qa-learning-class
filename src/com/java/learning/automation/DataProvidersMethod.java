package com.java.learning.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataProvidersMethod {
	public WebDriver driver;
	
	private final static By SIGNON = By.xpath("//a[contains(text(),'SIGN-ON')]");
	private final static By SUBMIT = By.xpath("//input[@value='Login']");
	private final static By USERNAME = By.xpath("//input[@name='userName']");
	private final static By PASSWORD = By.xpath("//input[@name='password']");
	
	
	/*public boolean signingIn() {
		clickSubmit();
		return true;
	}*/
	
	public void clickSignOn () {
		driver.findElement(SIGNON).click();
		
		}
		
		public boolean signOnMethod (String userName, String password) {
		driver.findElement(USERNAME).sendKeys(userName);
		driver.findElement(PASSWORD).sendKeys(password);
		clickSubmit();
		return true;
		}
		
		public void clickSubmit() {
		driver.findElement(SUBMIT).click();
		}
		
		public boolean verifySignOnmethodIsSuccessful(){
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[contains(text(),'Flight ')]")).isDisplayed();	
			return true;
			}
		
}
