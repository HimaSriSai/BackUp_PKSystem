package com.prokarma.SeleniumSamples;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionsSample {
	static WebDriver driver =null;
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
    public void actionSample() {
		//Click a checkbox and validate select and unselect
		WebElement checkBoxBtn=driver.findElement(By.id("bmwcheck"));
		checkBoxBtn.click();
		System.out.println("Element checked is "+checkBoxBtn.isSelected());
		WebElement notCheckedBtn=driver.findElement(By.id("benzcheck"));
		System.out.println("Element checked is "+notCheckedBtn.isSelected()+",means not checked");
		
        //Clicking on a dropdown menu & selecting an option
        Select selectOption = new Select(driver.findElement(By.id("carselect")));
        selectOption.selectByIndex(1);//index,value,visible text
        
        //Click a link and validate the response
        WebElement linkExample=driver.findElement(By.linkText("Open Tab"));
        linkExample.click();
       /* List<WebElement> anchors = driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        while(i.hasNext()) {
            WebElement anchor = i.next();
            if(anchor.getAttribute("href").contains("http://letskodeit.teachable.com/courses")) {
                anchor.click();
                break;
            }
        }*/
        String parentWindow = driver.getWindowHandle();
		for(String childWindow:driver.getWindowHandles()){
        if(!childWindow.equals(parentWindow)) {
            driver.switchTo().window(childWindow);
        WebElement elementVisibilityInLink=driver.findElement(By.cssSelector("input[placeholder='Find a course']"));
        System.out.println("Element visibility after clicking a link is "+elementVisibilityInLink.isDisplayed());
        }
        }
		driver.switchTo().window(parentWindow);
		
	}
}
