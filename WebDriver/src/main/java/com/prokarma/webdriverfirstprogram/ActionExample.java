package com.prokarma.webdriverfirstprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\driver1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.mortgagecalculator.org/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		long startTime = System.currentTimeMillis();
		System.out.println("start time" + startTime);

		Actions s1 = new Actions(driver);
		WebElement element1 = driver.findElement(By.linkText("Widgets"));
		WebElement element2 = driver.findElement(By.linkText("Rate Tables"));
		s1.moveToElement(element1).click(element2).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tdate-from']")));
		driver.findElement(By.xpath("//input[@id='tdate-from']")).sendKeys("1945-08-15");

		long stopTime = System.currentTimeMillis();
		System.out.println("stop time" + stopTime);
		long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	}

}
