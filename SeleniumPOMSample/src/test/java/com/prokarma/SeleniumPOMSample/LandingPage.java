package com.prokarma.SeleniumPOMSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	
	@FindBy(id = "globalHeaderSignInRegister")
	private WebElement signIn;
	
	@FindBy(xpath = "//div[text()='Welcome to Snapfish!']")
	private WebElement elementVisibleForSuccessLogin;
	
	@FindBy(id = "globalHeaderUserMenu")
	private WebElement userProfile;
	
	@FindBy(css = "a[omniture-data-id='header_topnav_user_dropdown_sign out']")
	private  WebElement mouserHoverToSignOut;
	
	
	public LandingPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	} 

	public void userChoosesToSignUp() {
		signIn.click();
	}
	
	public void elementVisibilityAfterLogin()  {
		System.out.println("element visibility if we are successfully loggeed is"+elementVisibleForSuccessLogin.isDisplayed());
	}
	
	public void goToUserProfile()  {
		userProfile.click();
	}
	
	public void mouseHoverToLogOut()  {
		Actions action = new Actions(driver);
	    action.moveToElement(mouserHoverToSignOut).build().perform();
		mouserHoverToSignOut.click();
	}
}
	