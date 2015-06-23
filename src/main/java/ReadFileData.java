import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ReadFileData {
	
	protected Properties prop = null;
	protected InputStream input = null;
	public ReadFileData() throws Exception{
		prop=new Properties();
		input =ReadFileData.class.getClassLoader().getResourceAsStream("datafile.properties");
	}
	
	public String getURL(){
		return prop.getProperty("URL");
	}
	public String getUserName(){
		return prop.getProperty("username");
	}
	public String getPassword(){
		return prop.getProperty("password");
	}

}
