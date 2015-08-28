import java.util.Scanner;

public class LongestPalindrome{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter new input string:");
		String str = input.nextLine();
	
		String result="";
		for(int i=0; i<str.length(); i++){
			
			String temp1 = getLongestPalindrome(str, i, i);
			String temp2 = getLongestPalindrome(str, i, i+1);
			if(result.length()<temp1.length())
				result = temp1;
			
			if(result.length()<temp2.length())
				result = temp2;
		}
		System.out.println("Longest Palindrome is :" + result);
	}

	public static String getLongestPalindrome(String str, int start, int end){
		while(start>=0 && end < str.length()){
			if(str.charAt(start) == str.charAt(end)){
				start--;
				end++;
			}
			else{
				return str.substring(++start, end);
			}
		}
		return str.substring(++start, end);
	}
}
