package ValidParenthesis;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class ValidBrackets {
	public static void main(String[] args) {
		String s;
		System.out.println("Enter a string of parenthesis:");
		Scanner input = new Scanner(System.in);
		s=input.nextLine();
		
		Boolean b = isValid(s);
		
		System.out.println("Answer is : " + b);
		
	}
	
	public static Boolean isValid(String s){
		
		ArrayList<Character> alist = new ArrayList<Character>();
		ArrayList<Character> cList = new ArrayList<Character>();
		int index=-1;
		
		for(char c: s.toCharArray()){
			alist.add(c);
		}
		
		if(alist.size()%2 != 0){
			return false;
		}
		
		for(int i=0; i< alist.size(); i++){
			if(alist.get(i) == '(' || alist.get(i) == '{' || alist.get(i) == '['){
				cList.add(alist.get(i));
				index++;
			}
			else if(alist.get(i) == ')' && index != -1){
				if(cList.get(index) == '('){
					cList.remove(index--);
				}
				else{
					return false;
				}
			}
			else if(alist.get(i) == '}' && index != -1){
				if(cList.get(index) == '{'){
					cList.remove(index--);
				}
				else{
					return false;
				}
			}
			else if(alist.get(i) == ']' && index != -1){
				if(cList.get(index) == '['){
					cList.remove(index--);
				}
				else{
					return false;
				}
			}
		}
		if(index == -1){
			return true;
		}
		else{
		    return false;
		}
	}
}
