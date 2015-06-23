
import org.openqa.jetty.http.SSORealm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailVerificationTest {
	
	@Test(priority=1)
	public void launchGmail(){
		String expectedTitle ="Gmail";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String actualTitle =driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}

	
	@Test(priority=2)
	public void loginGmail(){
		System.out.println("login gmail");
		
		
	}
}