package com.prokarma.webdriverfirstprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\driver1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.mortgagecalculator.org/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions s1 = new Actions(driver);
		WebElement sElement3 = driver.findElement(By.xpath("//a[contains(text(),'Widgets')]"));
		WebElement sElement4 = driver.findElement(By.xpath("//a[contains(text(),'Rate Tables')]"));
		s1.moveToElement(sElement3).click(sElement4).build().perform();
		
		long startTime = System.currentTimeMillis();
		System.out.println("start time" + startTime);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(16, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tdate-custom-period']")));
		driver.findElement(By.xpath("//input[@id='tdate-custom-period']")).click();
		long stopTime = System.currentTimeMillis();
		System.out.println("stop time" + stopTime);
		long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	}
}
