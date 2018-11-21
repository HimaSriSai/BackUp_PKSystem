package com.prokarma.SeleniumSamples;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginLogoutSample {
	static WebDriver driver =null;
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 //Navigate to a URL
		 driver.navigate().to("https://www.snapfish.com/photo-gift/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void loginLogoutSample() {
		//Logging into a site and  verify success or failure cases
		WebElement signInBtn=driver.findElement(By.id("globalHeaderSignInRegister"));
		signInBtn.click();
		WebElement emailId=driver.findElement(By.name("EmailAddress"));
		emailId.sendKeys("himasrikchinnu@gmail.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("hima@1296");
		WebElement SignInClick=driver.findElement(By.id("loginsubmit"));
		SignInClick.click();
		WebElement elementVisibleForSuccessLogin=driver.findElement(By.xpath("//div[text()='Welcome to Snapfish!']"));
		System.out.println("element visibility if we are successfully loggeed is"+elementVisibleForSuccessLogin.isDisplayed());
		//Log out
		WebElement userProfile=driver.findElement(By.id("globalHeaderUserMenu"));
		userProfile.click();
		  Actions action = new Actions(driver);
		  WebElement mouserHoverToSignOut=driver.findElement(By.cssSelector("a[omniture-data-id='header_topnav_user_dropdown_sign out']"));
	      action.moveToElement(mouserHoverToSignOut).build().perform();
	      //Clicking on a button 
	      mouserHoverToSignOut.click();
	}
}
