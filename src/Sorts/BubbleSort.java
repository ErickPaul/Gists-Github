package Sorts;


/*Basic Bubble sort algorithm*/ 


import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of numbers in the array");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int[] array = new int[count];
		
		System.out.println("Enter the numbers:");
		for(int i=0; i<count; i++){
			array[i] = input.nextInt();
		}
		
		bubbleSort(array);
		
	}
	
	public static void bubbleSort(int[] array){
		
		int count = array.length;
		
		while(count>1)
		{
			for (int i =0; i<array.length-1; i++){
				int j = i+1;
				if(array[i] > array[j]){
					int flag = array[i];
					array[i] = array[j];
					array[j] = flag;
				}                            // No need to swap for other cases
			}
			count--;
		}
		
		System.out.print("Array is ");
		for(int i=0; i<array.length; i++){
			System.out.print(" - " + array[i]);
		}
	}
}