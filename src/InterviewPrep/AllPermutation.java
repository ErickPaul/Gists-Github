import java.util.*;

public class AllPermutation{
	public static void main(String[] args){
		String str = "abc";
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<str.length(); i++){
			set.add(String.valueOf(str.charAt(i)));
		}
		getPermutations(str.toCharArray(), set);

		for(String s: set){
			if(s.length()==str.length()){
				System.out.println(s);
			} 
		}
	}

	public static void getPermutations(char[] arr, HashSet<String> set){
		for(int i=0; i<arr.length; i++){
			HashSet<String> temp = new HashSet<String>();

			for(String s: set){
				temp.add(s+arr[i]);
			}

			set.addAll(temp);
		}

		for(int i=0; i<arr.length; i++){
			HashSet<String> temp = new HashSet<String>();

			for(String s: set){
				temp.add(s+arr[i]);
			}

			set.addAll(temp);
		}
	}
}