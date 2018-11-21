package com.prokarma.excels;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;


public class Atureports {
	

	
		
  @Test
  public void atureports1() throws AWTException, IOException {
 {
	  System.setProperty("webdriver.chrome.driver", "E://Gopimanohar-Prokarma//Cypress_Poc//SeleniumDemo//Resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElement(By.id("homeval"));
		// ATU Reports
		atumethods s = new atumethods();
		s.setIndexPageDescription();
		s.setAuthorInfoForReports();
		
		s.passResults("Login Step PASSED", "True", "True", "True");
		s.failResults("Login Failed", "False", "Flase", "False");
		s.warning("Login Step warning", "True", "True", "True");
		s.info("Login Step info", "True", "True", "True");
		
		//s.failResults1("Login Failed", "False", "Flase", "False");
  }
}
}
