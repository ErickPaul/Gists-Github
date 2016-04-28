package ValidParenthesis;

import java.util.Scanner;

public class LongestPalindromeSubstring {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		
		String answer = getLongestSubstringPalindrome(str);
		System.out.println(answer);
	}

	private static String getLongestSubstringPalindrome(String str) {
		String answer="";
		
		if(str.length()==1){
			return str;
		}
		
		for(int i=0; i<str.length(); i++){
			String str1 = longest(str, i, i);
			String str2 = longest(str, i, i+1);
			if(str1.length()>str2.length() && str1.length()>answer.length()){
				answer = str1;
			}
			else if(str1.length()<str2.length() && str2.length()>answer.length()){
				answer = str2;
			}
		}
		return answer;
	}
	
	public static String longest(String str, int i, int j){
		String max="";
		while(i>=0 && j<str.length()){
			if(str.charAt(i) == str.charAt(j)){
				max = str.substring(i, j+1);
				i--;
				j++;
			}
			else{
				i++;
				max = str.substring(i, j);
				break;
			}
		}
		return max;
	}

}
