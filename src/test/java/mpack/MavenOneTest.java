package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenOneTest {
	
	
	WebDriver driver;
	@Test
	public void mOne() {
		
		System.out.println("mOne executed");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		String actualText = driver.findElement(By.id("pah")).getText();
		
		System.out.println(actualText);
		
		Assert.assertEquals(actualText,"PracticeAutomationHere");
	}
	@AfterMethod
	public void closure() {
	
		driver.close();
	}

}
