package com.prokarma.SeleniumSamples;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	static WebDriver driver =null;
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void dragAndDrop() {
		//Drag and Drop a file
	WebElement accountDragFrom=driver.findElement(By.xpath("//li[@id='credit2']/a"));
	WebElement accountDropTo=driver.findElement(By.xpath("//ol[@id='bank']/li"));
	 Actions actions=new Actions(driver);	
	 actions.dragAndDrop(accountDragFrom, accountDropTo).build().perform();
	 
	 WebElement amountDragFrom=driver.findElement(By.xpath("//li[@id='fourth']/a"));
		WebElement amountDropTo=driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		 Actions action=new Actions(driver);	
		 action.dragAndDrop(amountDragFrom, amountDropTo).build().perform();
	}
}
