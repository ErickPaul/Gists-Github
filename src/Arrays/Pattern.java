package Arrays;

import java.io.*;
import java.util.*;

public class Pattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        
        for(int i=1; i<=count; i++){
            for(int j=1;j<=count-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}