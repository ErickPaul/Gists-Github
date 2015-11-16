package ValidParenthesis;

import java.util.Stack;

public class ValisParenthesisUsingStack {
	public static void main(String[] args) {
		String[] str = new String[2];
		str[0] = "(){";
		str[1] = "(){]";
		String[] result = Braces(str);
		
		for(String strr: result){
			System.out.println(strr);
		}
	}
	
	public static String[] Braces(String[] values) {
        
        String[] resultArray = new String[values.length];
        int x=0;
        
        for(String value: values){
            Stack<Character> stack = new Stack<Character>();
            boolean flag = true;
            for(int i=0; i<value.length(); i++){
                if(value.charAt(i) == '{' || value.charAt(i) == '[' || value.charAt(i) == '('){
                    stack.push(value.charAt(i));
                }
                else if(value.charAt(i) == '}'){
                    if(stack.size()>0){
                        char c = stack.pop();    
                        if(c!='{'){
                            flag = false;
                            break;
                        }
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                else if(value.charAt(i) == ']'){
                    if(stack.size()>0){
                        char c = stack.pop();
                        if(c!='['){
                            flag = false;
                            break;
                        }
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                else if(value.charAt(i) == ')'){
                    if(stack.size()>0){
                        char c = stack.pop();
                        if(c!='('){
                            flag = false;
                            break;
                        }
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }

            if(stack.size()>0)
                flag = false;
            
            if(flag == true){
                resultArray[x] = "YES";
            }
            else{
                resultArray[x] = "NO";
            }
            x++;
        }
        return resultArray;
    }
}
