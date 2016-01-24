import java.io.*;
import java.util.*;

/*

You are given two strings,  and . Find if there is a substring that appears in both  and .

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer , the number of test cases.

Then there will be  descriptions of the test cases. Each description contains two lines. The first line contains the string  and the second line contains the string .

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.


Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
Explanation

For the 1st test case, the letter o is common between both strings, hence the answer YES. (Furthermore, the letter l is also common, but you only need to find one common substring.) 
For the 2nd test case, hi and world do not have a common substring, hence the answer NO.

*/

public class TwoStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.nextLine();
        
        for(int i=0; i<tests; i++){
            HashSet<Character> set = new HashSet<Character>();
            String str1 = input.nextLine();
            String str2 = input.nextLine();            
            
            for(int j=0; j<str1.length(); j++){
                set.add(str1.charAt(j));
            }
            
            boolean flag = false;
            for(int j=0; j<str2.length(); j++){
                if(set.contains(str2.charAt(j))){
                    flag=true;
                    break;
                }
            }
            
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}