package com.prokarma.webdriverfirstprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToDefaultContentExample {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\driver1\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.mortgagecalculator.org/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Actions s1 = new Actions(driver);
	WebElement element1 = driver.findElement(By.linkText("Widgets"));
	WebElement element2 = driver.findElement(By.linkText("Rate Tables"));
	s1.moveToElement(element1).click(element2).build().perform();
	
	
	
	
	driver.findElement(By.xpath("//input[@id='tdate-range']")).sendKeys("20");
	driver.switchTo().defaultContent();
}
}
