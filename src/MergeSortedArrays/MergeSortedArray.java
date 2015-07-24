package MergeSortedArrays;

/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.
Note:
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
*/

import java.util.Scanner;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of numbers in array 1:");
		Scanner input = new Scanner(System.in);
		int cnt1 = input.nextInt();
		int[] arr1 = new int[cnt1];
		
		System.out.println("Enter numbers of array 1:");
		for(int i=0;i<cnt1;i++){
			arr1[i] = input.nextInt();
		}
		
		System.out.println("Enter number of numbers in array 2:");
		Scanner input1 = new Scanner(System.in);
		int cnt2 = input1.nextInt();
		int[] arr2 = new int[cnt2];
		
		System.out.println("Enter numbers of array 2:");
		for(int i=0;i<cnt2;i++){
			arr2[i] = input1.nextInt();
		}
		merge(arr1, cnt1, arr2, cnt2);
	}
	
	public static void merge(int A[], int m, int B[], int n){
		int x=0;
		int y=0;
		int z=0;
		int[] result = new int[m+n];
		
		while(m>0 && n>0){
			if(A[x] > B[y]){
				result[z++] = B[y++];
				n--;
			}
			else if(A[x] < B[y]){
				result[z++] = A[x++];
				m--;
			}
			else{
				result[z++] = B[y++];
				n--;
			}
		}
		while(m>0){
			result[z++] = A[x++];
			m--;
		}
		while(n>0){
			result[z++] = B[y++];
			n--;
		}
		A = result;

		System.out.println("Merge list is:");
		for(int j=0; j<A.length; j++){
			System.out.println(A[j]);
		}
	}
}