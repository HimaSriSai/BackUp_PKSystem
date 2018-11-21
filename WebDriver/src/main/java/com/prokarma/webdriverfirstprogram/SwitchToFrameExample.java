package com.prokarma.webdriverfirstprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\driver1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.mortgagecalculator.org/");
		Actions s2 = new Actions(driver);
		WebElement sElement3 = driver.findElement(By.xpath("//a[contains(text(),'Widgets')]"));
		WebElement sElement4 = driver.findElement(By.xpath("//a[contains(text(),'Rate Tables')]"));
		s2.moveToElement(sElement3).click(sElement4).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		for (WebElement frames : count) {
			System.out.println(frames.getAttribute("id"));
		}
		System.out.println("Frame Count " + count.size());
		driver.switchTo().frame("advanced-text-widget");
		
		List<WebElement> sRow = driver.findElements(By.xpath("//table[@class='gt']/tbody/tr"));
		for (WebElement rows: sRow) {
			List<WebElement> sCells=rows.findElements(By.tagName("td"));
			for (int i = 0; i <= sCells.size() - 1; i++) {
				System.out.println("Cell Value" + sCells.get(i).getText());
				
			}
			
		}
	}
}
