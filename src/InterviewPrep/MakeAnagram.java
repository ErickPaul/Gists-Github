import java.io.*;
import java.util.*;

public class MakeAnagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();        
        
        
        for(int i=0; i<str1.length(); i++){
            if(map1.containsKey(str1.charAt(i))){
                map1.put(str1.charAt(i), map1.get(str1.charAt(i))+1);
            }
            else{
                map1.put(str1.charAt(i), 1);
            }
        }
        
        for(int i=0; i<str2.length(); i++){
            if(map2.containsKey(str2.charAt(i))){
                map2.put(str2.charAt(i), map2.get(str2.charAt(i))+1);
            }
            else{
                map2.put(str2.charAt(i), 1);
            }
        }
        int totalDiff = 0;
        for(Map.Entry<Character, Integer> e: map1.entrySet()){
            char c = e.getKey();
            int v1 = e.getValue();
            
            if(map2.containsKey(c)){
                int v2 = map2.get(c);
                int diff = v2>v1? v2-v1 : v1-v2;
                totalDiff += diff;
                map2.remove(c);
            }
            else{
                totalDiff += v1;
            }
        }
        
        for(Map.Entry<Character, Integer> e: map2.entrySet()){
            int val = e.getValue();
            totalDiff += val;
        }
        
        System.out.println(totalDiff);
    }
}