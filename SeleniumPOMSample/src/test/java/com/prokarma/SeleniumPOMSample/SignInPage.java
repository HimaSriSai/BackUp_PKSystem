package com.prokarma.SeleniumPOMSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	@FindBy(id = "EmailAddress")
	private WebElement emailTextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	@FindBy(name = "log in")
	private WebElement signupButton;
	
	public SignInPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public void emailId(String email){
		emailTextBox.sendKeys(email);
	}

	public void pswrd(String password) {
		passwordTextBox.sendKeys(password);
	}
	public void loginBtn() {
		signupButton.click();
	}
}
