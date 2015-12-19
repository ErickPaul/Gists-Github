import java.util.*;

public class OneAway{
	public static void main(String[] args){
		String str1 = "pale";
		String str2 = "aalp";
		System.out.println(isOneAway(str1, str2));
	}

	public static boolean isOneAway(String str1, String str2){
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		for(int i=0; i<str1.length(); i++){
			if(map1.containsKey(str1.charAt(i))){
				map1.put(str1.charAt(i), map1.get(str1.charAt(i)+1));
			}
			else{
				map1.put(str1.charAt(i), 1);
			}
		}

		for(int i=0; i<str2.length(); i++){
			if(map2.containsKey(str2.charAt(i))){
				map2.put(str2.charAt(i), map2.get(str2.charAt(i)+1));
			}
			else{
				map2.put(str2.charAt(i), 1);
			}
		}

		if(str1.length() == str2.length()){
			return getReplace(map1, map2);
		}

		return false;
		//else{
			//return getInsert(map1, map2);
		//}
	}

	public static boolean getReplace(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
		boolean oneChange = false;

		for(Map.Entry entry: map1.entrySet()){

			if(map2.containsKey(entry.getKey())){
				if(entry.getValue()!=map2.get(entry.getKey())){
					int diff = (int)entry.getValue() > (int)map2.get(entry.getKey()) ? (int)entry.getValue()-(int)map2.get(entry.getKey()) : (int)map2.get(entry.getKey())-(int)entry.getValue();
					if(diff>1){
						return false;
					}
					else{
						if(oneChange == false){
							oneChange = true;
						}
						else{
							return false;
						}
					}
				}
			}
			else{
				if((int)entry.getValue()>1){
					return false;
				}
				else{
					if(oneChange == false){
						oneChange = true;
					}
					else{
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean getInsert(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
	
	return true;	
	}
}