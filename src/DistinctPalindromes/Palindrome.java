package DistinctPalindromes;

import java.util.Scanner;
import java.util.HashSet;

public class Palindrome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = input.nextLine();
		
		String longestSubString = longestPalindrome(str);
		System.out.println("Longest Palindrome" + longestSubString);
		
		HashSet<String> ans = subsetPalindrome(str);
		for( String answer : ans){
			System.out.println(answer);
		}
	}
	
	public static String longestPalindrome(String str){
		String result= "";
		
		for(int i=0; i<str.length(); i++){
			String str1 = getPalindrome(str, i, i);
			String str2 = getPalindrome(str, i, i+1);
			if(str1.length()>str2.length() && str1.length()>result.length()){
				result = str1;
			}
			else if(str1.length()<=str2.length() && str2.length()>result.length()){
				result = str2;
			}
		}
		return result;
	}
	
	public static String getPalindrome(String str, int i, int j){
		String result = "";
		while(i>=0 && j<str.length() && str.charAt(i) == str.charAt(j)){
			result = str.substring(i, j+1);
			i--; j++;
		}
		return result;
	}

	public static HashSet<String> subsetPalindrome(String str){
		HashSet<String> array = new HashSet<String>();

		for(int i=0; i<str.length(); i++){
			addPalindromes(str, array, i, i);
			addPalindromes(str, array, i, i+1);
		}

		return array;
	}

	public static void addPalindromes(String str, HashSet<String> result, int i, int j){
		while(i>=0 && j<str.length() && str.charAt(i) == str.charAt(j)){
			result.add(str.substring(i, j+1));
			i--; j++;
		}
	}
}