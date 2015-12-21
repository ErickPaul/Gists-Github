import java.util.*;

public class RedundantBracket{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the expression: ");
		String str = input.nextLine();

		boolean result = getRedundancy(str);
		System.out.println("Result is :" + result);
	}

	public static boolean getRedundancy(String str){
		Stack<Character> open = new Stack<Character>();
		Stack<Character> close = new Stack<Character>();


		for(int i=0; i<str.length()-1; i++){
			if(str.charAt(i) == '(' && str.charAt(i+1) == '('){
				open.push('(');
				open.push('(');
				i++;
			}
			else if(str.charAt(i) == ')' && str.charAt(i+1) == ')' && open.size()>2){
				char c1 = open.pop();
				char c2 = open.pop();

				if(c1 == '(' && c2 == '('){
					return true;
				}
			}
			else if(str.charAt(i) == ')' && str.charAt(i+1) != ')' && open.size()!=0){
				char c1 = open.pop();
				char c2 = open.pop();
			}
		}
		return false;
	}
}