import java.io.*;
import java.util.*;

public class GameOfThrones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result = hasPalindrome(str)? "YES" : "NO";
        System.out.println(result);
    }
    
    public static boolean hasPalindrome(String str){
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        boolean isEven = (str.length()%2)==0 ? true : false;
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        
        if(isEven){
            for(Map.Entry<Character, Integer> e: map.entrySet()){
                if(e.getValue()%2 != 0){
                    return false;
                }
            }
            return true;
        }
        else{
            boolean oneOdd = false;
            for(Map.Entry<Character, Integer> e: map.entrySet()){
                if(e.getValue()%2 != 0){
                    if(oneOdd == false){
                        oneOdd = true;
                    }
                    else{
                        return false;   
                    }
                }
            }
            return true;
        }
    }
}