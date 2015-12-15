import java.io.*;
import java.util.*;

/*

James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

Input Format

The first line contains an integer , i.e., the number of test cases. 
The next  lines will contain a string each. The strings do not contain any spaces.

Constraints 
 
 length of string  
All characters are lower case English letters.

Output Format

A single line containing the number of minimum operations corresponding to each test case.

Sample Input

4
abc
abcba
abcd
cba
Sample Output

2
0
4
2
Explanation

For the first test case, abc -> abb -> aba.
For the second test case, abcba is already a palindromic string.
For the third test case, abcd -> abcc -> abcb -> abca = abca -> abba.
For the fourth test case, cba -> bba -> aba.

*/

public class LoveLetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine();
        
        for(int i=0; i<cases; i++){
            System.out.println(makePalindrome(input.nextLine()));
        }
    }
    
    public static int makePalindrome(String str){
        int loop = str.length()/2;
        boolean isPalindrome = true;
        for(int i=0; i<loop; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindrome = false;
            }
        }
        
        int total = 0;
        if(isPalindrome == false){
            for(int i=0; i<loop; i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    int diff = str.charAt(i) > str.charAt(str.length()-i-1) ? str.charAt(i) - str.charAt(str.length()-i-1) : str.charAt(str.length()-i-1) - str.charAt(i);
                    total += diff;
                }
            }
        }
        
        return total;
    }
}