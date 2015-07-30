package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SortedArrayIntersection {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of first array");
		int size = input.nextInt();
		int[] arr1 = new int[size];
		for(int i=0; i<size; i++){
			System.out.println("Enter number "+ i + " of array 1");
			arr1[i] = input.nextInt();
		}
		
		System.out.println("Enter size of second array");
		size = input.nextInt();
		int[] arr2 = new int[size];
		for(int i=0; i<size; i++){
			System.out.println("Enter number "+ i + " of array 2");
			arr2[i] = input.nextInt();
		}
		
		ArrayList<Integer> resultList = getIntersection(arr1, arr2);
		
		System.out.println("Result intersection array:");
		for(int i=0; i<resultList.size(); i++){
			System.out.println(resultList.get(i));
		}
	}

	public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2){
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				i++;
			}
			else if(arr1[i]>arr2[j]){
				j++;
			}
			else{
				resultList.add(arr1[i]);
				i++;
				j++;
			}
		}
		return resultList;
	}
}
