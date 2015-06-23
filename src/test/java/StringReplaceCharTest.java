

import org.testng.Assert;
import org.testng.annotations.*;


public class StringReplaceCharTest {
	String str =" Programming languages";
	char ch ='a';
	String str1 ="a";
	@Test(description = "remove character from string using iteration approach")
	public void removeCharMethod1(){
		Assert.assertEquals(StringReplaceChar.ReplaceChar(str,ch).trim(), "Progrmming lnguges","Output is not equal" );
}
	
	@Test(description="check string length")
	public void checkCharPresent(){
		if(str.contains(str1)){
			Assert.assertTrue(StringReplaceChar.ReplaceCharBuiltIn(str, str1).length()<str.length());
		}
		else
				Assert.assertTrue(StringReplaceChar.ReplaceCharBuiltIn(str, str1).length()==str.length());
			
		}
		
	@Test(description ="remove character from string using string library")
	public void removeCharMethod2(){
	
		Assert.assertEquals(StringReplaceChar.ReplaceCharBuiltIn(str, str1).trim(),"Progrmming lnguges");
		
		
	}
}
