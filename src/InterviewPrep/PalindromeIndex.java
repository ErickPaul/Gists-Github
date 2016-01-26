import java.io.*;
import java.util.*;

public class PalindromeIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.nextLine();
        
        for(int i=0; i<tests; i++){
            String str = input.nextLine();
            
            if(isPalin(str)){
               System.out.println("-1"); 
               continue;
            }
            else{
                int index = -2;
                for(int x=0, y=str.length()-1; x<=y; x++, y--){
                    if(str.charAt(x)!=str.charAt(y)){
                        if(isPalin(str.substring(x, y))){
                            index=y;
                            break;
                        }
                        else if(isPalin(str.substring(x+1,y+1))){
                            index=x;
                            break;
                        }
                        else{
                            index=-1;
                            break;   
                        }
                    }
                }
            
                if(index!=-2){
                    System.out.println(index);
                }
                else{
                    System.out.println("-1");
                }   
            } 
        }
    }
    
    public static boolean isPalin(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}