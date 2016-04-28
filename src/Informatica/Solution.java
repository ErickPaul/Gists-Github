package Informatica;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    	
    	Stack<Integer> stack = new Stack<Integer>();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.nextLine();
        ArrayList<Integer> stack1 = new ArrayList<Integer>();
        int top = 0;
        
        while(count-- > 0){
            String line = input.nextLine();
            int spacePos = line.indexOf(' ');
            if(spacePos>-1){
                String operation = line.substring(0,spacePos);
                if(operation.equals("push")){
                    int newNum = Integer.parseInt(line.substring(spacePos+1));
                    addElement(stack1, newNum);
                    top++;
                    printTop(stack1, top);
                }
                else{
                    String str = line.substring(spacePos+1);
                    int newSpacePos = str.indexOf(' ');
                    int iterate = Integer.parseInt(str.substring(0, str.indexOf(' ')));
                    int inc = Integer.parseInt(str.substring(str.indexOf(' ') + 1));
                    incrementElements(stack1, iterate, inc, top);
                    printTop(stack1, top);
                }
            }
            else{
            	top = removeElement(stack1, top);
                printTop(stack1, top);
            }
        }
    }
    
    public static ArrayList<Integer> incrementElements(ArrayList<Integer> stack, int iterate, int inc, int top){
        int i = 0;
        while(iterate-- > 0){
            stack.set(i, stack.get(i) + inc);
            i++;
        }
        return stack;
    }
    
    public static void addElement(ArrayList<Integer> stack, int num){
        stack.add(num);
    }
    
    public static int removeElement(ArrayList<Integer> stack, int top){
        if(top==0){
            return 0;
        }
        else{
            stack.remove(top-1);
            return top-1;
        }
    }
    
    public static void printTop(ArrayList<Integer> stack, int top){
        if(top==0){
            System.out.println("EMPTY");
        }
        else{
            System.out.println(stack.get(top-1));
        }
    }
}