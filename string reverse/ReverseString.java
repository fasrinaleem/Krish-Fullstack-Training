public class ReverseString{
	public static void main(String args[]){
		
		String word = "abcd";
		char[] arr = word.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
	}
}