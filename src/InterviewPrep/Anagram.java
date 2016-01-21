import java.io.*;
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.nextLine();
        
        for(int i=0; i<tests; i++){
            String str = input.nextLine();
            
            if(str.length()%2!=0){
                System.out.println(-1);
            }
            else{
                String str1 = str.substring(0, (str.length()/2));
                String str2 = str.substring((str.length()/2));                
                
                HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
                HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();                
                
                for(int j=0; j<str1.length(); j++){
                    if(map1.containsKey(str1.charAt(j))){
                        map1.put(str1.charAt(j), map1.get(str1.charAt(j)) + 1);
                    }
                    else{
                        map1.put(str1.charAt(j), 1);
                    }
                }
                
                for(int j=0; j<str2.length(); j++){
                    if(map2.containsKey(str2.charAt(j))){
                        map2.put(str2.charAt(j), map2.get(str2.charAt(j)) + 1);
                    }
                    else{
                        map2.put(str2.charAt(j), 1);
                    }
                }
                
                int total = 0;
                for(Map.Entry<Character, Integer> e : map2.entrySet()){
                    char c = e.getKey();
                    int v = e.getValue();
                    
                    if(map1.containsKey(c)){
                        int diff = map1.get(c)>v ? 0 : v-map1.get(c);
                        total+=diff;
                    }
                    else{
                        total+=v;
                    }
                }
                System.out.println(total);
            }
        }
    }
}