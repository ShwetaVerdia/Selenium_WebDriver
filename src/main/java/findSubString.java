
public class findSubString {
	
	public static void main(String [] args){
		String mainString =" Can you find me";
		String subString="find me";
		findSubString.findSubStr(mainString, subString);
		findSubString.checkSubstring(mainString, subString);
		findSubString.useSubString();
	}
	//Using contains method
	 public static void findSubStr(String str, String substr){
		if(str.contains(substr)){
			System.out.println("Using contains method");
			System.out.println("Mainstring contains substring");
		}
		else 
			System.out.println("MainString does not contain substring");
		
	}

	//Using indexOf method
	public static void checkSubstring(String str, String substr){
		int index1=str.indexOf(substr);
		System.out.println("Using indexOf Method");
		if (index1 != -1)
			System.out.println("Mainstring contains substring");
		else
			System.out.println("MainString does not contain substring");
		
	}
	
	//Using substring method
	
	public static void useSubString (){
		String Value ="Welcome to Java Programming";
		String Java = Value.substring(11,15);
		System.out.println(Java);
		
		
	}
	
	
	
}
