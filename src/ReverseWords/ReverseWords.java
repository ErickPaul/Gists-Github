package ReverseWords;

import java.util.Stack;

/*
 * Reverse the order of words in a sentence, but keep words themselves unchanged. Words in a sentence are divided by blanks. 
 * For instance, the reversed output should be “student. a am I” when the input is “I am a student”. 
 */

public class ReverseWords {

	public static void main(String[] args) {
		String str="Im am a student";
		str = getStringReverse(str);
		
		char[] charArray = str.toCharArray();
		Stack<Character> charStack = new Stack<Character>();
		int start=0;
		int i=0;
		while(i<charArray.length){
			if(charArray[i]!=' '){
				charStack.push(charArray[i]);
				i++;
			}
			else{
				while(start<i){
					if(charArray[start]!=' '){
						charArray[start]=charStack.pop();
					}
					start++;
				}
				i++;
				start++;
			}
		}
		
		while(start<i){
			if(charArray[start]!=' '){
				charArray[start]=charStack.pop();
			}
			start++;
		}
		System.out.println(new String(charArray));
	}
	
	public static String getStringReverse(String str){
		String str1="";
		for(int i=str.length()-1; i>=0; i--){
			str1+=str.charAt(i);
		}
		return str1;
	}
}
