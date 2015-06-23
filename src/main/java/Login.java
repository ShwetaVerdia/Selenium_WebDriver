import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	Properties prop;

	@BeforeSuite
	public void setup() throws IOException {
		prop = new Properties();
		InputStream input = ReadFileData.class.getClassLoader()
				.getResourceAsStream("datafile.properties");
		prop.load(input);
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testGmail() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(
				prop.getProperty("username"));
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(
				prop.getProperty("password"));
		driver.findElement(By.id("signIn")).click();
		Assert.assertTrue(isElementPresent(By.xpath("//a[@title='Travel']")));
		Assert.assertTrue(isElementPresent(By.xpath("//a[@title='VISA DOCS']")));
		Assert.assertTrue(isElementPresent(By.xpath("//input[@id=':kw']")));

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		
		
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
