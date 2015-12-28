import java.util.*;

public class TotalPalindromes{

	public static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.nextLine();

		for(int i=0; i<str.length(); i++){
			addPalindromes(str, i, i);
			addPalindromes(str, i, i+1);
		}

		for(Map.Entry e: map.entrySet()){
			System.out.println(e.getKey());
		}
	}

	public static void addPalindromes(String str, int i, int j){
		while(i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
			map.put(str.substring(i,j+1), 1);
			i--;
			j++;
		}
	}
}