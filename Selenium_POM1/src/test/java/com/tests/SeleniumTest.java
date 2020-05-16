package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;
import com.pages.RegistrationPage;

import info.common.Common;

public class SeleniumTest {
	
	public void performLogin() {
		
		Common common = new Common();
		WebDriver driver = common.launchBrowser();
		common.navigateUrl(driver);
			
		
		common.closeBrowser(driver);
		//Enter urser name and password
	}
	
	public void performRegistration123() throws Exception {
		Common common = new Common();
		WebDriver driver = common.launchBrowser();
		common.navigateUrl(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		HomePage hp=new HomePage(driver);
		hp.perform();
		
		//common.clickObj(driver, HomePage.lnk_Register,"Registration");
	
		Thread.sleep(4000);
		RegistrationPage reg_Page=new RegistrationPage(driver);
		reg_Page.performRegistration();
		
	    common.closeBrowser(driver);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SeleniumTest st =new SeleniumTest();
		st.performRegistration123();
		//st.performLogin();
	}

}
