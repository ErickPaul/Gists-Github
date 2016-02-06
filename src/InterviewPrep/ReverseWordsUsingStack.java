import java.util.*;

public class ReverseWordsUsingStack{

	public static void main(String[] args){
		String str = " My name is Vishal !";
		System.out.println(revWords(str));	
	}

	public static String revWords(String str){
		Stack<Character> stack = new Stack<Character>();

		for(int i=0; i<str.length(); i++){
			stack.push(str.charAt(i));
		}

		int i=0, start=0;
		StringBuilder sb = new StringBuilder();
		String temp="";

		while(!stack.empty()){
			char c = stack.pop();
			System.out.println(c);
			if(c==' '){
				sb.append(temp + " ");
				temp = "";
			}
			else{
				temp = c + temp;
			}
		}

		return sb.toString();

	}
	
}