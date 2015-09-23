package reverseString;

import java.util.Scanner;

public class ReverseString{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.nextLine();
		System.out.println("Result string is: " + reverseString(str));
	}

	public static String reverseString(String str){
		
		for(int i=0; i<str.length()/2; i++){
			str = replace(str, i, str.length()-i-1);
		}
		return str;
	}

	public static String replace(String str, int i, int j){
		String result = ""; 
		String startStr = "";
		String midStr = "";
		String endStr = "";

		if(i<j && i<str.length() && j<str.length() && i>=0 && j>=0){
			startStr = str.substring(0,i);
			midStr = str.substring(i+1,j);
			endStr = str.substring(j+1);
		}
		result = startStr + str.charAt(j) + midStr + str.charAt(i) + endStr;
		return result;
	}
}
