import java.util.HashSet;


public class RemoveduplicateArray {
	public static void main(String [] args){
		int arr [] = {1,2,5,3,7,1,3,5,8,9,3,6};
		RemoveduplicateArray.printDistinct(arr);
		
	}
	public static void printDistinct(int [] arr){
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr.length;i++)
		{
			if(!set.contains(arr[i])){
				set.add(arr[i]);
				System.out.println(arr[i]);
				
			}
			
		}
		
	}
}

