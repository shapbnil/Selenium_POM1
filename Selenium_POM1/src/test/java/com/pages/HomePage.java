package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import info.common.Common;

public class HomePage extends Common{
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public static By alert=By.xpath("//button[@type='submit']");
	public static By lnk_Register = By.xpath("//*[text()=' REGISTER ']");
	
	public void perform() throws InterruptedException {
		
	clickObj(driver, HomePage.alert, "OK" );
	Thread.sleep(2000);
	clickObj(driver, HomePage.lnk_Register, "Register");
	
	
		
	}
	
}
