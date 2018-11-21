package com.prokarma.SeleniumPOMSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginLogoutPOMSample {
	static WebDriver driver =null;
	SignInPage signInPage;
	LandingPage landingPage;
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.snapfish.com/photo-gift/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void loginLogoutPOMSample() throws Throwable {
		signInPage=new SignInPage(driver);
		landingPage=new LandingPage(driver);
		//Goto sign In page
		landingPage.userChoosesToSignUp();
		//Enter Credentials and login
		signInPage.emailId("himasrikchinnu@gmail.com");
		signInPage.pswrd("hima@1296");
		signInPage.loginBtn();
		//Log Out
		landingPage.goToUserProfile();
		landingPage.mouseHoverToLogOut();	
	}
	@AfterClass
	public void closeWindow() {
		driver.quit();
	}
}
