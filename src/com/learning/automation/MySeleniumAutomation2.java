package com.learning.automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MySeleniumAutomation2 {
	
	//Xpath- relative(short), Absolute(HTML)
	//POM(Design Pattern)- Easy to maintain, Separating Xpath/data from the code
	private final static By REGISTER = By.xpath("//a[contains(text(),'REGISTER')]");
	private final static By SUBMIT = By.xpath("//input[@name='register']");
	private final static By COMPLETEREGISTRATION = By.xpath("//*[contains(text(),'Thank you for registering')]");
	private final static By FIRSTNAME = By.xpath("//input[@name = 'firstName']");
	private final static By LASTNAME = By.xpath("//input[@name = 'lastName']");
	private final static By PHONE = By.xpath("//input[@name = 'phone']");
	private final static By USERNAME = By.xpath("//*[@id=\'userName\']");
	private final static By ADDRESS1 = By.xpath("//input[@name = 'address1']");
	private final static By ADDRESS2 = By.xpath("//input[@name = 'address2']");
	private final static By CITY = By.xpath("//input[@name = 'city']");
	private final static By STATE = By.xpath("//input[@name = 'state']");
	private final static By POSTALCODE = By.xpath("//input[@name = 'postalCode']");
	private final static By COUNTRY = By.xpath("//select[@name = 'country']");
	private final static By EMAIL = By.xpath("//*[@id=\"email\"]");
	private final static By PASSWORD = By.xpath("//input[@name = 'password']");
	private final static By CONFIRMPASSWORD = By.xpath("//input[@name='confirmPassword']");
	
	
		public WebDriver driver;
		

		public void clickRegister() {
		//driver.manage().window().maximize();
		//driver.navigate().refresh();
		driver.findElement(REGISTER).click();	
		}
	
		public boolean verifySubmitButton() {
		clickRegister();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(SUBMIT).isDisplayed();
		return true;
		}
	
		public boolean verifyTheRegisterLink() {
		driver.findElement(REGISTER).isDisplayed();
		return true;
		}
	
		public boolean completeRegistration() {
		clickRegister();
		contactInformation("Bikey", "KC", "123456789", "bikey277@gmail.com");
		mailingInformation("2300 Valley View", "Room 1050", "Irving", "Texas", "12345", "NEPAL" );
		userInformation("bikey277@gmail.com", "12345", "12345");
		clickSubmit();
		return true;
		}
		
		public boolean verifyRegistered() {
		driver.findElement(COMPLETEREGISTRATION).isDisplayed();
		return true;
		}
		
		public boolean verifyClickSubmit() throws InterruptedException {
			Thread.sleep(5000);
			System.out.println("***Its after Thread ***");
		driver.findElement(REGISTER).click();	
		driver.findElement(SUBMIT).click();
		return true;
			
		}

		public void contactInformation(String firstName, String lastName, String phone, String email) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(FIRSTNAME).sendKeys(firstName);
		driver.findElement(LASTNAME).sendKeys(lastName);
		driver.findElement(PHONE).sendKeys(phone);
		driver.findElement(USERNAME).sendKeys(email);
		}
		
		public void mailingInformation(String address1, String address2, String city, String state, String postalCode, String country) {
		driver.findElement(ADDRESS1).sendKeys(address1);
		driver.findElement(ADDRESS2).sendKeys(address2);
		driver.findElement(CITY).sendKeys(city);
		driver.findElement(STATE).sendKeys(state);
		driver.findElement(POSTALCODE).sendKeys(postalCode);
		Select dropCountry = new Select(driver.findElement(COUNTRY));
		dropCountry.selectByVisibleText(country);
		}
		
		public void userInformation(String email, String passwordOnce, String passwordTwice) {
			
		driver.findElement(EMAIL).sendKeys(email);
		driver.findElement(PASSWORD).sendKeys(passwordOnce);
		driver.findElement(CONFIRMPASSWORD).sendKeys(passwordTwice);
		}
		
		
		
		public void clickSubmit() {
		driver.findElement(SUBMIT).click();
			
			
		}
		
		public void takescreenshot(WebDriver webdriver, String fileWithPath) throws IOException {
		TakesScreenshot scrnShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrnShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileHandler.copy(SrcFile, DestFile);
		
		
		}
}


