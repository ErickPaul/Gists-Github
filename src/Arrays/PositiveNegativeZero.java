package Arrays;

import java.io.*;
import java.util.*;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]= input.nextInt();
        }
        
        double count_pos=0;
        double count_neg=0;
        double count_zero=0;
        
        for(int i=0; i<count; i++){
            if(arr[i]>0){
                count_pos++;   
            }
            else if(arr[i]<0){
                count_neg++;
            }
            else{
                count_zero++;
            }
        }
        
        double percent_pos = (count_pos/count);
        double percent_neg = (count_neg/count);
        double percent_zero = (count_zero/count);
        
        System.out.println(percent_pos);
        System.out.println(percent_neg);
        System.out.println(percent_zero);
    }
}