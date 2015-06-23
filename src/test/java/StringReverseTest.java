import  org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class StringReverseTest {
	
		 StringReverse sr = new StringReverse();
		
		 
		  @Test(groups= "MainTests",dataProvider = "data-provider")
		  public void testStringRev(String data) {
			  StringBuilder sb = new  StringBuilder(data);
			  Assert.assertEquals(sr.rev(data), sb.reverse().toString());
			 
}
		  
		  @Test(groups="SecondaryTest, MainTests")
		  public void testNullString(){
			  Assert.assertEquals(sr.rev(null), "String is Null");
			  Assert.assertNotNull(sr.rev("dsfgfs"));
			  Assert.assertEquals(sr.rev(""), "String is empty");
		  }
		  
		  @Test(groups="SecondaryTest")
		  public void checkPalindrome(){
			  Assert.assertEquals(sr.rev("madam"),"madam");
			  
		  }
		  
		  @Test(groups="SecondaryTest")
		  public void checkSpecialCharacters(){
			  Assert.assertNotSame(sr.rev("$%&%"), "%&%$");
			  
		  }
		  
		  @DataProvider(name = "data-provider")
			 public Object[][] dataProviderMethod() {
			        return new Object[][] { { "shweta" }, {"Johm Kim"}};
			    }
		  
}
