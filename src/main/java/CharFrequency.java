import java.util.HashMap;


public class CharFrequency {
	
	public static void main(String[] args) {
		String str = "Java Programming"; 
		
		//if want to ignore case then str = str.toLowerCase(); can be used
		//Time Complexity of HashMap is O(1)
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			Integer count = hm.get(ch);
			if(count==null)
				count=1;
			else
				count++;
		hm.put(ch, count);	
		}
		System.out.println(hm);
		
		// Printing only repetitive characters or duplicates
		
		System.out.println("Repetitive characters in a string are:");
		
		for(char duplicate: hm.keySet())
		{
			if(hm.get(duplicate)>1){
				System.out.println(duplicate + "\t" +hm.get(duplicate));
			}
			
			
		}
	}


	
	
}
