import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AlertDemo {
	WebDriver driver;
	
	
	@BeforeTest
	public void SetUp(){
		driver = new FirefoxDriver();
		driver.get("file:///C:/Shweta/Selenium_Eclipse/alert.html");
	}

	@Test
	public void TestWebAlert(){
		driver.findElement(By.xpath("//button[contains(text(),'Click on me')]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@AfterTest
	public void TearDown(){
		driver.close();
	}
}
