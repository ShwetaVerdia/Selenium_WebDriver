
/*Java Program to replace character in a given string
 * 
 */

public class StringReplaceChar {
	
	public static String ReplaceChar(String s, char c){
		StringBuffer sb = new StringBuffer(s.length());
		sb.setLength(s.length());
		int current =0;
		for(int i=0; i<s.length();i++){
			char newchar = s.charAt(i);
			if(newchar != c){
				sb.setCharAt(current++, newchar);
				
			}
		}
		return sb.toString();
	}

	
	public static String ReplaceCharBuiltIn(String s,String c){
		String s1 = s.replaceAll(c,"");
		return  s1;
		
	}
	
	
}
