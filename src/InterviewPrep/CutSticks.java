/*

You are given  sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following: 
3 2 2 6

The above step is repeated until no sticks are left.


*/

import java.io.*;
import java.util.*;

public class CutSticks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int[] arr = new int[total];
        
        for(int i=0; i<total; i++){
            arr[i] = input.nextInt();
        }
        getSticks(arr);
        
    }
    
    public static void getSticks(int[] arr){
        int min = Integer.MAX_VALUE;
        while(isPositive(arr)){
            min = getMin(arr);
            int sticks=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>0){
                    sticks++;
                }
                arr[i] = arr[i] - min;
            }
            System.out.println(sticks);
        }
    }
    
    public static int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min && arr[i]>0){
                min = arr[i];
            }
        }
        return min;
    }
    
    public static boolean isPositive(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                return true;
            }
        }
        return false;
    }
}