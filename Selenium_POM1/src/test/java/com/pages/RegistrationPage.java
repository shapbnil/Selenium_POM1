package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import info.common.Common;

public class RegistrationPage extends Common {

	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public static By txt_UserName = By.xpath("//input[@id='userName']");
	public static By txt_Pwd = By.id("usrPwd");
	public static By con_pwd = By.id("cnfUsrPwd");
	
	public static By Sec_question = By.xpath("(//*[text()='Select Security Question'])[2]");
	public static By first_car = By.xpath("(//*[text()='What make was your first car or bike?'])[2]");
										 
	public static By sec_answer = By.xpath("//input[@placeholder='Security Answer']");

	public static By pre_language = By.xpath("(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[2]");
	public static By pre_lan = By.xpath("(//*[text()='English'])[2]");

	public static By txt_first = By.id("firstName");
	public static By txt_mid = By.id("middleName");
	public static By txt_last = By.id("lastname");

	public static By gender = By.id("M");
		
	public static By sec_dob = By.xpath("//*[@autocomplete='off']");
	public static By sec_date = By.xpath("(//a[@draggable='false'])[9]");
	
	
	public static By sec_occ = By.xpath("(//*[text()='Select Occupation'])[2]");
	public static By sec_occup = By.xpath("(//*[text()='PUBLIC'])[2]");
	
	public static By marital = By.xpath("(//input[@type='radio' and @value='M'] )[2]");
	
	public static By country = By.xpath("//*[@formcontrolname='resCountry']");
	
	
	
	public void performRegistration() throws Exception {
		// Enter Username
		enterText(driver, RegistrationPage.txt_UserName, "Shapbnil", "UserName");
		
		// Enter Password
		enterText(driver, RegistrationPage.txt_Pwd, "Smith1234", "Password");
		
		// Enter Confirm Password
		enterText(driver, RegistrationPage.con_pwd, "Smith1234", "confirmPassword");
		
		// Click on Security Question droupdown.
		clickObj(driver, RegistrationPage.Sec_question, "security_Question");
		Thread.sleep(2000);
		clickObj(driver, RegistrationPage.first_car, "First car");
		
		// Security Question Answer
		enterText(driver, RegistrationPage.sec_answer, "Toyota", "Security Answer");
		
		// Preferred Language
		Thread.sleep(2000);
		clickObj(driver, RegistrationPage.pre_language, "EnglishClick");
		Thread.sleep(2000);
		clickObj(driver, RegistrationPage.pre_lan, "English");
		
		// Enter Personal Details
		enterText(driver, RegistrationPage.txt_first, "Shapbnil", "FirstName");
		enterText(driver, RegistrationPage.txt_mid, "Mahmud", "MiddleName");
		enterText(driver, RegistrationPage.txt_last, "Karim", "Lastname");
		
		//Click on Gender
		clickObj(driver, RegistrationPage.gender, "Male");

		
		//Click on Date of Birth
		clickObj(driver, RegistrationPage.sec_dob, "DOB");
		clickObj(driver, RegistrationPage.sec_date, "Date");
		
		//Click on Occupation
		clickObj(driver, RegistrationPage.sec_occ, "Occ");
		clickObj(driver, RegistrationPage.sec_occup, "Occupation");
		
		//Click on Marital Status
		clickObj(driver, RegistrationPage.marital, "Marital");
		
		//Select country
		select(driver, RegistrationPage.country, "United States of America", "Country");
		
		
	}
}
