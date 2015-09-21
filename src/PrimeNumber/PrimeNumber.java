package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the range in which you want to get the prime numbers from 1: ");
		int num = input.nextInt();

		for(int i=2; i<num; i++){
			if(checkPrime(i))
			System.out.println(i + " is a prime number");
		}
	}

	public static boolean checkPrime(int num){
		for(int i=2; i<num/i; i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
}
