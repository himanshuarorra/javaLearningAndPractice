package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiess {
	@SuppressWarnings("deprecation")
	public static void main(String arg[]) {
		
		String prPath = System.getProperty("user.dir");
		System.out.println(prPath);
		
		ChromeOptions options = new ChromeOptions();
		
		DesiredCapabilities dc = new DesiredCapabilities("chrome","90.0.1",Platform.WIN10);
		dc.setBrowserName("Chrome");
		dc.setPlatform(Platform.WIN10);
		//dc.setVersion();
		
		System.setProperty("webdriver.chrome.driver","D:/RestAssuredApiAutomation/LearningAndPractice/src/main/java/selenium/chromedriver.exe");
		
		WebDriver d = new ChromeDriver(dc);
		d.get("https://google.com");	
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		d.quit();
	}

}
