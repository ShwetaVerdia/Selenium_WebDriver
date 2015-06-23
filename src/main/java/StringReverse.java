
public class StringReverse {
	public  String rev (String s){
		if(s==null){
			return "String is Null";
		}
		if(s.length()==0){
			return "String is empty";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--){
			sb=sb.append(s.charAt(i));			
		}
		
		return sb.toString();
	}

}
