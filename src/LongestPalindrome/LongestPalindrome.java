package LongestPalindrome;

import java.util.Scanner;

public class LongestPalindrome {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = input.nextLine();

		str = longestPalindrome(str);
		System.out.println("Result longest palindrome is: " + str);
	}

	public static String longestPalindrome(String str) {
		if (str.isEmpty())
			return null;

		if (str.length() == 1)
			return str;

		String longest = "";
		for (int i = 0; i < str.length(); i++) {
			String tmp = findLongest(str, i, i);
			if (tmp.length() > longest.length())
				longest = tmp;

			tmp = findLongest(str, i, i + 1);
			if (tmp.length() > longest.length())
				longest = tmp;
		}
		return longest;
	}

	public static String findLongest(String str, int begin, int end) {
		while (begin >= 0 && end <= str.length() - 1
				&& str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		return str.substring(begin + 1, end);
	}
}
