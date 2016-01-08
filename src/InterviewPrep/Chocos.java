/*

Input Format: 
The first line contains the number of test cases, . 
 lines follow, each of which contains three integers, , , and .

Output Format: 
Print the total number of chocolates Bob eats.

Constraints: 
 
 
 

Sample input

3
10 2 5
12 4 4
6 2 2
Sample Output

6
3
5
Explanation 
In the first case, he can buy 5 chocolates with \$10 and exchange the 5 wrappers to get one more chocolate. Thus, the total number of chocolates is 6.

In the second case, he can buy 3 chocolates for \$12. However, it takes 4 wrappers to get one more chocolate. He can't avail the offer and hence the total number of chocolates remains 3.

In the third case, he can buy 3 chocolates for \$6. Now he can exchange 2 of the 3 wrappers and get 1 additional piece of chocolate. Now he can use his 1 unused wrapper and the 1 wrapper of the new piece of chocolate to get one more piece of chocolate. So the total is 5.


*/

import java.io.*;
import java.util.*;

public class Chocos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        
        int total = 0;
        
        for(int x=0; x<tests; x++){
            int money = input.nextInt();
            int price = input.nextInt();
            int wrappers = input.nextInt();
            
            int chocs = money/price;
            total = chocs;
            do{
                int extraChocs = chocs/wrappers;
                total += extraChocs;
                chocs -= (extraChocs*wrappers);
                chocs += extraChocs;
            }while(chocs>=wrappers);
            System.out.println(total);
        }
    }
}