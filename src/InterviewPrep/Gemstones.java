import java.io.*;
import java.util.*;

/*

John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a gem-element if it occurs at least once in each of the rocks.

Given the list of  rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of an integer, , the number of rocks. 
Each of the next  lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.

Constraints 
 
Each composition consists of only lower-case Latin letters ('a'-'z'). 
 length of each composition 

Output Format

Print the number of gem-elements that are common in these rocks. If there are none, print 0.

Sample Input

3
abcdde
baccd
eeabg
Sample Output

2
Explanation

Only "a" and "b" are the two kinds of gem-elements, since these are the only characters that occur in every rock's composition.

*/

public class Gemstones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.nextLine();
        String[] strs = new String[count];
        for(int i=0; i<count; i++){
            strs[i] = input.nextLine();
        }
        
        HashSet<Character> set1 = new HashSet<Character>();
        for(int i=0; i<strs[0].length(); i++){
            set1.add(strs[0].charAt(i));
        }
        
        for(int i=1; i<count; i++){
            HashSet<Character> set2 = new HashSet<Character>();
            for(int j=0; j<strs[i].length(); j++){
                if(set1.contains(strs[i].charAt(j))){
                    set2.add(strs[i].charAt(j));    
                }
            }
            set1 = set2;
        }
        
        System.out.println(set1.size());
    }
}