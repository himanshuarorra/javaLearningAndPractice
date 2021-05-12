package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementExcption {
	public static void main(String ar[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:/RestAssuredApiAutomation/LearningAndPractice/src/main/java/selenium/chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
		d.get("https://www.pavantestingtools.com");
		
		d.manage().window().maximize();
		
		WebElement el = d.findElement(By.xpath("//a[text()='Training']"));
		
		WebElement el2 = d.findElement(By.xpath("//a[text()='Online']"));		
		
		el.click();
		
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

	}

}
