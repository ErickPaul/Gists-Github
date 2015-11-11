package FibonacciModified;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Problem Statement

A series is defined in the following manner:

Given the nth and (n+1)th terms, the (n+2)th can be computed by the following relation 
Tn+2 = (Tn+1)2 + Tn

So, if the first two terms of the series are 0 and 1: 
the third term = 12 + 0 = 1 
fourth term = 12 + 1 = 2 
fifth term = 22 + 1 = 5 
... And so on.

Given three integers A, B and N, such that the first two terms of the series (1st and 2nd terms) are A and B respectively, compute the Nth term of the series.

Input Format

You are given three space separated integers A, B and N on one line.

Input Constraints 
0 <= A,B <= 2 
3 <= N <= 20

Output Format

One integer. 
This integer is the Nth term of the given series when the first two terms are A and B respectively.

Note

Some output may even exceed the range of 64 bit integer.
Sample Input

0 1 5  
Sample Output

5
Explanation

The first two terms of the series are 0 and 1. The fifth term is 5. How we arrive at the fifth term, is explained step by step in the introductory sections.*/

public class FibonacciModified {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        BigInteger result = getNthTerm(a, b, c);
        System.out.println(result);
    }
    
    public static BigInteger getNthTerm(int a, int b, int n){
        int count = 0;
        
        BigInteger num1 = new BigInteger(Integer.toString(a));
        BigInteger num2 = new BigInteger(Integer.toString(b));
        BigInteger answer = null;
        
        while(count < n-2){
            
            answer = (num2.multiply(num2)).add(num1);
            num1 = num2;
            num2 = answer;
            count++;
        }
        return answer;
    }
}