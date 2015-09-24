package DigitSum;

import java.util.Scanner;

public class DigitSum{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();

		System.out.println("Resultant sum : " + getDigitSum(num));
	}

	public static int getDigitSum(int num){
		int sum=0;
		while(num>0){
			if((num%10)>0)
				sum+=(num%10);	
			num-=(num%10);
			num/=10;
		}
		return sum;
	}
}
