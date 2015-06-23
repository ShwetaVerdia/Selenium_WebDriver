
public class CompressString {
	public static void main(String [] args){
		String original ="aaabbccc";
		String compress="";
		CompressString.compString(original, compress);
	
	}
	
	public static void compString (String org,String compressed){
		
		char ch=0;
		int count =1;
		for(int i=0; i<org.length();i++){
			if(ch==org.charAt(i)){
				count=count+1;
				
			}
				else
				{
					compressed=compressed+ch;
					if(count!=1){
						compressed=compressed+count;
					}
					ch=org.charAt(i);
					count=1;
				}
			}
		compressed=compressed+ch;
		if(count!=1){
			compressed=compressed+count;
		}
			System.out.println(compressed);
			
		}
		
		
		
	}
