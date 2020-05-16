package junit.demp;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.RegistrationPage;

import info.common.Common;

public class JunitTests {

	WebDriver driver;
	Common common = new Common();
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public static  void afterClass() {
		System.out.println("After class");
	}
	@Before
	public void before() {
		
		 driver = common.launchBrowser();
	}
	@After
	public void after() {
		common.closeBrowser(driver);
	}
	@Test
	public void performRegistration123() throws Exception {
		
		common.navigateUrl(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		common.clickObj(driver, HomePage.lnk_Register,"Registration");
	
		Thread.sleep(4000);
		RegistrationPage reg_Page=new RegistrationPage(driver);
		reg_Page.performRegistration();
		System.out.println(10/0);//Arthemetic exception
		
	}
	
	@Test
	public void performRegistration12345() throws Exception {
		
		common.navigateUrl(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		common.clickObj(driver, HomePage.lnk_Register,"Registration");
	
		Thread.sleep(4000);
		RegistrationPage reg_Page=new RegistrationPage(driver);
		reg_Page.performRegistration();
		
	}
}
