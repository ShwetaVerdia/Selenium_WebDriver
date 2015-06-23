import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

import java.net.*;

public class GridExample {
	
	WebDriver driver;
	String baseURL = "http://newtours.demoaut.com/";
	String nodeURL = "http://192.168.8.107:5555/wd/hub";

	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN8_1);
		driver = new RemoteWebDriver(new URL(nodeURL),cap);
	}
	
	@Test
	public void simpleTest(){
		driver.get(baseURL);
	}
	
	@AfterTest
	public void verifyTitle(){
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}
	
	@Test
	public void loginTest(){
		
		
	}
	
	

}
