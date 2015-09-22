package ReverseWords;

import java.util.Scanner;

public class Reverse{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = input.nextLine();

		String temp = totalReverse(str);

		temp = reverseWord(temp);

		System.out.println("Result string: " + temp);

	}

	public static String reverseWord(String str){
		int start=0;
		int end=0;
		String result = "";

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				end = i;
				result = result + totalReverse(str.substring(start, end)) + " ";
				start = i+1;
				end = i+1;
			}
		}
		result += totalReverse(str.substring(start, str.length()));
		return result;
	}

	public static String totalReverse(String str){
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--){
			str1 += str.charAt(i);
		}
		return str1;
	}

}
