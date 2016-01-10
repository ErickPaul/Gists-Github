/*Given an integer, NN, traverse its digits (dd1,dd2,...,ddn) and determine how many digits evenly divide NN (i.e.: count the number of times NN divided by each digit has a remainder of 0). Print the number of evenly divisible digits.*/

import java.io.*;
import java.util.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        
        for(int x=0; x<count; x++){
            int num = input.nextInt();
            
            if(num<=10){
                System.out.println("1");
            }
            else{
                int current=num;
                int total=0;
                int rem;
                do{
                    rem = current%10;
                    if(rem!=0 && (num%rem)==0){
                        total++;
                    }
                    current = current/10;
                }while(current>9);
                
                if((num%current)==0){
                    total++;
                }
                System.out.println(total);
            }
        }
    }
}