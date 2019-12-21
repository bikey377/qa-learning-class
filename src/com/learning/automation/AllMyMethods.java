package com.learning.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class AllMyMethods {
	
	public WebDriver driver;
	
	
	private final static By REGISTER = By.xpath("//a[contains(text(),'REGISTER')]");
	private final static By BOOKED = By.xpath("//*[@src=\"/images/masts/mast_confirmation.gif\"]");
	private final static By SIGNON = By.xpath("//a[contains(text(),'SIGN-ON')]");
	private final static By SUBMIT = By.xpath("//input[@value='Login']");
	private final static By USERNAME = By.xpath("//input[@name='userName']");
	private final static By PASSWORD = By.xpath("//input[@name='password']");
	private final static By BUYFLIGHTS = By.xpath("//input[@name='buyFlights']");
	private final static By RESERVEFLIGHTS = By.xpath("//input[@name='reserveFlights']");
	private final static By FINDFLIGHTS = By.xpath("//input[@name='findFlights']");
	private final static By ONEWAY = By.xpath("//input[@value='oneway']");
	private final static By ROUNDTRIP = By.xpath("//input[@value='roundtrip']");
	private final static By PASSCOUNT = By.xpath("//*[@name='passCount']");
	private final static By FROMPORT = By.xpath("//*[@name='fromPort']");
	private final static By FROMMONTH = By.xpath("//*[@name='fromMonth']");
	private final static By FROMDAY = By.xpath("//*[@name='fromDay']");
	private final static By TOPORT = By.xpath("//*[@name='toPort']");
	private final static By TOMONTH = By.xpath("//*[@name='toMonth']");
	private final static By TODAY = By.xpath("//*[@name='toDay']");
	private final static By	AIRLINE = By.xpath("//*[@name='airline']");
	private final static By COACH = By.xpath("//input[@value='Coach']");
	private final static By BUSINESS = By.xpath("//input[@value='Business']");
	private final static By FIRST = By.xpath("//input[@value='First']");
	/*private final static By
	private final static By
	private final static By
	private final static By
	
	
	
	*/
	
	public void clickSignOn () {
		driver.findElement(SIGNON).click();
		
		}
		
		public void signOnMethod (String userName, String password) {
		driver.findElement(USERNAME).sendKeys(userName);
		driver.findElement(PASSWORD).sendKeys(password);
		}
		
		public void clickSubmit() {
		driver.findElement(SUBMIT).click();
		}
	
	
	public boolean verifySignOnLink () {
		driver.findElement(SIGNON).isDisplayed();
		return true;
	}
	
	public boolean verifySubmitButton() {
		clickSignOn ();
		driver.findElement(SUBMIT).isDisplayed();
		return true;
		
	}
	
	
		
	public boolean signingIn() {
		signOnMethod ("bikey277", "Practice12");	
		clickSubmit();
		return true;
		
	}
	
	public boolean verifyContinueButton1() {
		signOnMethod ("bikey277", "Practice12");
		clickSubmit();
		driver.findElement(FINDFLIGHTS).isDisplayed();
		return true;
	}
	
	
	public boolean verifyFlightFinderInfo() {
		signOnMethod ("bikey277", "Practice12");
		clickSubmit();
		flightDetailsType("roundtrip");
		numberOfPassengers("2");
		departingFrom("New York");
		departingOn("11", "21");
		arrivingIn("London");
		returningOn("12", "25");
		preferencesClass("First");
		preferencesAirline("Unified Airlines");
		clickContinue1();
		return true;	
	}
	
	
	
	
	
	
	
	public boolean verifyContinueButton2() {
		signOnMethod ("bikey277", "Practice12");
		clickSubmit();
		clickContinue1();
		driver.findElement(RESERVEFLIGHTS).isDisplayed();
		return true;
	}
	
	public boolean verifySelectFlight() {
		signOnMethod ("bikey277", "Practice12");
		clickSubmit();
		flightDetailsType("roundtrip");
		numberOfPassengers("2");
		departingFrom("New York");
		departingOn("11", "21");
		arrivingIn("London");
		returningOn("12", "25");
		preferencesClass("First");
		preferencesAirline("Unified Airlines");
		clickContinue1();
		clickDepart("Blue Skies Airlines$361$271$7:10");
		clickReturn("Unified Airlines$633$303$18:44");
		return true;
	}
	
	

	public boolean verifyBookFlight() {
		signOnMethod ("bikey277", "Practice12");
		clickSubmit();
		flightDetailsType("roundtrip");
		numberOfPassengers("2");
		departingFrom("New York");
		departingOn("11", "21");
		arrivingIn("London");
		returningOn("12", "25");
		preferencesClass("First");
		preferencesAirline("Unified Airlines");
		clickContinue1();
		clickDepart("Blue Skies Airlines");
		clickReturn("Unified Airlines$633$303$18:44");
		clickContinue2();
		passenger1("BIKEY", "KC");
		chooseMeal1("HNML");
		passenger2("BIKASH", "KC");
		chooseMeal2("HNML");
		creditCard("BA", "12345678");
		cardExp("07", "2010");
		payerName("Bikey", "", "KC");
		ticketLessOption();
		billingAddress("2300 Valley View","RM 1050","Irving","TX","76121","215");
		sameAsBilling();
		clickSecurePurchase();
		return true;
		
		
	}
	public boolean verifySecurePurchaseButton() {
		signOnMethod ("bikey277", "Practice12");
		clickSubmit();
		clickContinue1();
		clickContinue2();
		driver.findElement(BUYFLIGHTS).isDisplayed();
		return true;
	}
	
	public boolean verifyTicketBooked() {
		signOnMethod ("bikey277", "Practice12");
		clickSubmit();
		clickContinue1();
		clickContinue2();
		clickSecurePurchase();
		driver.findElement(BOOKED).isDisplayed();
		return true;
		
	}
	
		
		
		public void flightDetailsType(String tripType) {
		if(tripType=="oneway")	{
		driver.findElement(ONEWAY).click();
		}
		else {
		driver.findElement(ROUNDTRIP).click();
		}
		}
		
		public void numberOfPassengers(String numberOfPass) {
		Select dropPassengers = new Select(driver.findElement(PASSCOUNT));
		dropPassengers.selectByValue(numberOfPass);
		}
		
		public void departingFrom(String departingCity) {
		Select dropDepartingFrom = new Select(driver.findElement(FROMPORT));
		dropDepartingFrom.selectByValue(departingCity);
		}
		
		public void departingOn(String onMonth, String onDay) {
		Select dropOn1 = new Select(driver.findElement(FROMMONTH));
		dropOn1.selectByValue(onMonth);
		Select dropOn2 = new Select(driver.findElement(FROMDAY));
		dropOn2.selectByValue(onDay);
		}
		
		public void arrivingIn(String arrivingCity) {
		Select dropArrivingIn = new Select(driver.findElement(TOPORT));
		dropArrivingIn.selectByValue(arrivingCity);
		}
		
		public void returningOn(String onMonth, String onDay) {
		Select dropReturning1 = new Select(driver.findElement(TOMONTH));
		dropReturning1.selectByValue(onMonth);

		Select dropReturning2 = new Select(driver.findElement(TODAY));
		dropReturning2.selectByValue(onDay);
		}
		
		public void preferencesClass(String servClass) {
			if(servClass=="Coach") {
		driver.findElement(COACH).click();
		} else if (servClass== "Business") {
		driver.findElement(BUSINESS).click();
		}
		else {
		driver.findElement(FIRST).click();
		}
		}
		
		public void preferencesAirline(String airline) {
		Select dropAirline = new Select(driver.findElement(AIRLINE));
		dropAirline.selectByVisibleText(airline);	
		}

		
		public void clickContinue1() {
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		}

		public void clickDepart(String outFlight) {
		if(outFlight=="Unified Airlines$363$281$11:24") {
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();	
		}else if(outFlight=="Blue Skies Airlines$360$270$5:03") {
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']")).click();
		}else if(outFlight=="Blue Skies Airlines$361$271$7:10") {	
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		}
		else {
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();	
		}
		}
		
		public void clickReturn(String inFlight) {
		if(inFlight=="Unified Airlines$633$303$18:44"){
		driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']")).click();	
		}else if(inFlight=="Blue Skies Airlines$631$273$14:30"){
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
		}else if(inFlight=="Blue Skies Airlines$630$270$12:23"){
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$630$270$12:23']")).click();
		}else {
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();	
		}
		}
		
		public void clickContinue2() {
		driver.findElement(RESERVEFLIGHTS).click();
		}
		
		public void passenger1(String firstName, String lastName) {
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys(lastName);
		}
		
		public void chooseMeal1(String meal1) {
		Select dropMeal1 = new Select(driver.findElement(By.xpath("//*[@name='pass.0.meal']")));
		dropMeal1.selectByValue(meal1);
		}
		
		public void passenger2(String firstName, String lastName) {
		driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys(lastName);
		}
		
		
		public void chooseMeal2(String meal2) {
		Select dropMeal2 = new Select(driver.findElement(By.xpath("//*[@name='pass.1.meal']")));
		dropMeal2.selectByValue(meal2);
		}
		
		public void creditCard(String cardType, String cardNumber) {
		Select dropCardType = new Select(driver.findElement(By.xpath("//*[@name='creditCard']")));
		dropCardType.selectByValue(cardType);
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys(cardNumber);
		}
		
		public void cardExp(String month, String year) {
		Select dropExpMth = new Select(driver.findElement(By.xpath("//*[@name='cc_exp_dt_mn']")));
		dropExpMth.selectByVisibleText(month);
		Select dropExpYr = new Select(driver.findElement(By.xpath("//*[@name='cc_exp_dt_yr']")));
		dropExpYr.selectByValue(year);
		}
		
		public void payerName(String firstName,String middleName, String lastName) {
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys(middleName);
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(lastName);
		}
		
		public void ticketLessOption() {
		driver.findElement(By.xpath("(//input[@name='ticketLess'])[1]")).click();
		}
		
		public void billingAddress(String address1, String address2, String city,String state, String postalCode, String chooseCountry) {
		driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
		driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys(address1);
		driver.findElement(By.xpath("//input[@name='billAddress2']")).clear();
		driver.findElement(By.xpath("//input[@name='billAddress2']")).sendKeys(address2);
		driver.findElement(By.xpath("//input[@name='billCity']")).clear();
		driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='billState']")).clear();
		driver.findElement(By.xpath("//input[@name='billState']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name='billZip']")).clear();
		driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys(postalCode);
		
		Select dropCountry = new Select(driver.findElement(By.xpath("//*[@name='billCountry']")));
		dropCountry.selectByValue(chooseCountry);
		}
		
		public void sameAsBilling() {
		driver.findElement(By.xpath("(//input[@name='ticketLess'])[2]")).click();
			
		}
		
		public void clickSecurePurchase() {
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		}
		
}