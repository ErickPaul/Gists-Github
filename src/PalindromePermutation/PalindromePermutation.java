package PalindromePermutation;

import java.util.*;

public class PalindromePermutation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the string:");
		String str = input.nextLine();
		
		boolean result = palinPerm(str);
		System.out.println("Is string palindrome? " + result);
	}
	
	public static boolean palinPerm(String str){
		char[] strArr = str.toCharArray();
		Arrays.sort(strArr);
		//System.out.println(strArr);
			
		int count = 0;
		boolean oddCount = false;
		char temp = ' ';
		for(int i=0; i< strArr.length; i++){
			if(temp==' '){
				temp = strArr[i];
				count++;
			}
			else if(strArr[i] == temp){
				count++;
			}
			else{
				if((count%2)==1 && oddCount!=true){
					oddCount = true;
				}
				else if((count%2)==1 && oddCount==true){
					return false;
				}
				temp = strArr[i];
				count = 1;
			}
		}
		if((count%2)==1 && oddCount==true){
			return false;
		}
		return true;
	}
}


