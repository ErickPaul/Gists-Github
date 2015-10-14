package isBinary;

import java.util.Scanner;

public class IsBinary{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();

		System.out.println("Result is :"+isBinary(num));
		System.out.println("Result is by String:" + isBinaryByString(num));
	}

	public static boolean isBinary(int num){		
		while(num>0){
			if((num%10)>1){
				return false;
			}
			else{
				//Do Nothing;
			}
			num-=(num%10);
			num/=10;
		}
		return true;
	}

	public static boolean isBinaryByString(int num){
		String number = Integer.toString(num);
		int i=0;
		while(i<number.length()){
			if(number.charAt(i) == '0' || number.charAt(i) == '1'){
				//Do nothing
			}
			else{
				return false;
			}
			i++;
		}
		return true;
	}
}
