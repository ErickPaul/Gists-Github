import java.util.*;

public class PalindromePermutation{
	public static void main(String[] args){
		String str = "HellH";

		System.out.println(getResult1(str));

	}

	public static boolean getResult(String str){
		boolean oneOdd = false;
		char[] arr = str.toCharArray();

		int total = 1;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				total++;
			}
			else{
				if(total%2!=0){
					if(oneOdd == true){
						System.out.println("Multiple odds");
						return false;
					}
					else{
						oneOdd = true;
					}
				}
				total =1;
			}
		}

		if(total%2!=0 && oneOdd==true){
			System.out.println("Multiple oddssss");
			return false;
		}

		return true;
	}

	public static boolean getResult1(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i=0; i<str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i)+1));
			}
			else{
				map.put(str.charAt(i), 1);
			}
		}

		boolean hasOneOdd = false;

		for(Map.Entry<Character, Integer> e: map.entrySet()){
			char key = e.getKey();
			Object value = e.getValue();
			if(((int)value%2)!=0){
				if(hasOneOdd == false){
					hasOneOdd = true;
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
}