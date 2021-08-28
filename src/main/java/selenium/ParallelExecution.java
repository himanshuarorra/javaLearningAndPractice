package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver","D:/RestAssuredApiAutomation/LearningAndPractice/src/main/java/selenium/chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
		d.get("https://www.pavantestingtools.com");
		
		Reporter.log("Started execution of first TC");
		
		d.manage().window().maximize();
		
		Reporter.log("Maximized");
		
		WebElement el = d.findElement(By.xpath("//a[text()='Training']"));
		
		WebElement el2 = d.findElement(By.xpath("//a[text()='Online']"));		
		
		el.click();
		Reporter.log("CLicked");

		el2.click();
		Reporter.log("Finished 1st TC");

		d.quit();
		
	}
	
	@Test
	public void TC2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:/RestAssuredApiAutomation/LearningAndPractice/src/main/java/selenium/chromedriver.exe");

		WebDriver d = new ChromeDriver();
		Reporter.log("Started execution of 2nd TC");

		d.get("https://www.pavantestingtools.com");
		
		d.manage().window().maximize();
		Reporter.log("Maximized");

		WebElement el = d.findElement(By.xpath("//a[text()='Training']"));
		
		WebElement el2 = d.findElement(By.xpath("//a[text()='Online']"));		
		
		el.click();
		Reporter.log("CLicked");

		el2.click();
		
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.navigate().back();
		
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try {
			el.click();
			
			el2.click();
		}
		
		catch(StaleElementReferenceException e) {
			System.out.println("Entering catch block and Re-Taking element selector.");
			
			WebElement e3 = d.findElement(By.xpath("//a[text()='Training']"));
			
			WebElement el4 = d.findElement(By.xpath("//a[text()='Online']"));
			
			e3.click();
			
			el4.click();
			Thread.sleep(2000);
		}
		
		
		d.quit();
		Reporter.log("Finished 2nd TC");


	}
	

}
