import java.util.*;

public class LongestSubstring{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.nextLine();

		for(int i=0; i<str.length(); i++){
			String str1 = getPalindrome(str, i, i);
			String str2 = getPalindrome(str, i, i+1);

			System.out.println(str1 + " - " + str2);
		}
	}

	public static String getPalindrome(String str, int i, int j){
		String result;

		while(i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
				i--;
				j++;
		}
		i++;
		return str.substring(i,j);
	}
}