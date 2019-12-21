package com.learning.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyNewtoursAutomation {
	static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		clickSignOn ();
		signOnMethod ("bikey277", "Practice12");
		flightDetailsType("oneway");
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
		clickContinue2();
		passenger1("BIKEY", "KC");
		chooseMeal1("HNML");
		passenger2("ANGEL", "KC");
		chooseMeal2("HNML");
		creditCard("BA", "12345678");
		cardExp("07", "2010");
		payerName("Bikey", "", "KC");
		ticketLessOption();
		billingAddress("2300 Valley View","RM 1050","Irving","TX","76121","215");
		sameAsBilling();
		clickSecurePurchase();
		//clickSignOff();
	}
	
	public static void clickSignOn () {
	driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();
	
	}
	
	public static void signOnMethod (String userName, String password) {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	}
	
	public static void flightDetailsType(String tripType) {
	if(tripType=="oneway")	{
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}
	else {
	driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
	}
	}
	
	public static void numberOfPassengers(String numberOfPass) {
	Select dropPassengers = new Select(driver.findElement(By.xpath("//*[@name='passCount']")));
	dropPassengers.selectByValue(numberOfPass);
	}
	
	public static void departingFrom(String departingCity) {
	Select dropDepartingFrom = new Select(driver.findElement(By.xpath("//*[@name='fromPort']")));
	dropDepartingFrom.selectByValue(departingCity);
	}
	
	public static void departingOn(String onMonth, String onDay) {
	Select dropOn1 = new Select(driver.findElement(By.xpath("//*[@name='fromMonth']")));
	dropOn1.selectByValue(onMonth);
	Select dropOn2 = new Select(driver.findElement(By.xpath("//*[@name='fromDay']")));
	dropOn2.selectByValue(onDay);
	}
	
	public static void arrivingIn(String arrivingCity) {
	Select dropArrivingIn = new Select(driver.findElement(By.xpath("//*[@name='toPort']")));
	dropArrivingIn.selectByValue(arrivingCity);
	}
	
	public static void returningOn(String onMonth, String onDay) {
	Select dropReturning1 = new Select(driver.findElement(By.xpath("//*[@name='toMonth']")));
	dropReturning1.selectByValue(onMonth);

	Select dropReturning2 = new Select(driver.findElement(By.xpath("//*[@name='toDay']")));
	dropReturning2.selectByValue(onDay);
	}
	
	public static void preferencesClass(String servClass) {
		if(servClass=="Coach") {
	driver.findElement(By.xpath("//input[@value='Coach']")).click();
	} else if (servClass== "Business") {
	driver.findElement(By.xpath("//input[@value='Business']")).click();
	}
	else {
	driver.findElement(By.xpath("//input[@value='First']")).click();
	}
	}
	
	public static void preferencesAirline(String airline) {
	Select dropAirline = new Select(driver.findElement(By.xpath("//*[@name='airline']")));
	dropAirline.selectByVisibleText(airline);	
	}

	
	public static void clickContinue1() {
	driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	}

	public static void clickDepart(String outFlight) {
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
	
	public static void clickReturn(String inFlight) {
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
	
	public static void clickContinue2() {
	driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	}
	
	public static void passenger1(String firstName, String lastName) {
	driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys(firstName);
	driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys(lastName);
	}
	
	public static void chooseMeal1(String meal1) {
	Select dropMeal1 = new Select(driver.findElement(By.xpath("//*[@name='pass.0.meal']")));
	dropMeal1.selectByValue(meal1);
	}
	
	public static void passenger2(String firstName, String lastName) {
	driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys(firstName);
	driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys(lastName);
	}
	
	
	public static void chooseMeal2(String meal2) {
	Select dropMeal2 = new Select(driver.findElement(By.xpath("//*[@name='pass.1.meal']")));
	dropMeal2.selectByValue(meal2);
	}
	
	public static void creditCard(String cardType, String cardNumber) {
	Select dropCardType = new Select(driver.findElement(By.xpath("//*[@name='creditCard']")));
	dropCardType.selectByValue(cardType);
	driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys(cardNumber);
	}
	
	public static void cardExp(String month, String year) {
	Select dropExpMth = new Select(driver.findElement(By.xpath("//*[@name='cc_exp_dt_mn']")));
	dropExpMth.selectByVisibleText(month);
	Select dropExpYr = new Select(driver.findElement(By.xpath("//*[@name='cc_exp_dt_yr']")));
	dropExpYr.selectByValue(year);
	}
	
	public static void payerName(String firstName,String middleName, String lastName) {
	driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys(firstName);
	driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys(middleName);
	driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(lastName);
	}
	
	public static void ticketLessOption() {
	driver.findElement(By.xpath("(//input[@name='ticketLess'])[1]")).click();
	}
	
	public static void billingAddress(String address1, String address2, String city,String state, String postalCode, String chooseCountry) {
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
	
	public static void sameAsBilling() {
	driver.findElement(By.xpath("(//input[@name='ticketLess'])[2]")).click();
		
	}
	
	public static void clickSecurePurchase() {
	driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
	
	}
	
	public static void clickSignOff() {
	driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	}
}

