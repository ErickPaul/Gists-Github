import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for(int i=0; i<count; i++){
            int size = input.nextInt();
            System.out.println(getDecent(size));   
        }
    }
    
    public static String getDecent(int size){
        int temp = size;
        while(temp>=3){
            if((temp%3)==0){
                String result = "";
                for(int i=0; i<temp; i++){
                    result = result + 5;
                }   
                return result;
            }
            else{
                int reminder = (temp%3) + 3;
                temp = temp - reminder - 3; // Will always be divisible by 3 so can be a 555555 number
                
                while(temp>0){
                    if(reminder%5 == 0){
                        String result1 = "";
                        for(int i=0; i<temp; i++){
                            result1 = result1 + 5;
                        }
                        for(int i=0; i<reminder; i++){
                            result1 = result1 + 3;
                        }
                        return result1;
                    }
                    else{
                        reminder = reminder + 3;
                        temp = temp - 3;
                    }
                }
                if(size%5==0){
                    String result2 = "";
                    for(int i=0; i<size; i++){
                        result2 = result2 + 3;
                    }            
                }
            }
        }
        return "-1";
    }
}