package Arrays;

import java.io.*;
import java.util.*;

public class ClassCancel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        
        for(int x=0; x<tests; x++){
            int totalStudents = input.nextInt();
            int threshold = input.nextInt();
            
            int[] arr = new int[totalStudents];
            for(int i=0; i<totalStudents; i++){
                arr[i]=input.nextInt();
            }
            
            int studentsBeforeClass = 0;
            for(int i=0; i<totalStudents; i++){
                if(arr[i]<=0){
                    studentsBeforeClass++;
                }
            }
            
            if(studentsBeforeClass>=threshold){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
        }
    }
}