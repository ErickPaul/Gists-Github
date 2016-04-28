package ValidParenthesis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BracketPermutation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = input.nextInt();
		
		HashSet<String> arr = getPossibleBrackets(num);
		
		for(String str: arr){
			if(str.length() == (num*2)){
				System.out.println(str);
			}
		}
	}

	private static HashSet<String> getPossibleBrackets(int num) {
		
		HashSet<String> arr = new HashSet<String>();
		if(num == 0){
			arr.add("");
		}
		else{
			HashSet<String> set = getPossibleBrackets(num-1);
			for(String str: set){
				for(int i=0; i<str.length(); i++){
					if(str.charAt(i)=='('){
						String strBefore = str.substring(0, i+1);
						String strAfter = str.substring(i+1, str.length());
						arr.add(strBefore + "()" + strAfter);
					}
				}
				arr.add(str + "()");
			}
		}
		return arr;
	}
}
