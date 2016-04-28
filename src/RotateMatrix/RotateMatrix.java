package RotateMatrix;


//package RotateMatrix;

import java.util.Scanner;

class RotateMatrix{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size N of the matrix(N X N)");
		int size = input.nextInt();

		int[][] matrix = new int[size][size];

		for(int i=0; i< size; i++){
			for(int j=0; j< size; j++){
				System.out.println("Enter number [" + (i+1) + "][" + (j+1) + "]");
				matrix[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		rotateMatrix(matrix, size);

		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
	
	public static void rotateMatrix(int[][] matrix, int size){
		
		int rings = size/2;
		
		for(int i=0; i<rings; i++){
			int j = size-(i+1);
						
			for(int l=i; l<j; l++){
				int temp = matrix[i][l];
				matrix[i][l] = matrix[j-l][i];
				matrix[j-l][i] = matrix[j][j-l];
				matrix[j][j-l] = matrix[l][j];
				matrix[l][j] = temp;
			}	
		}
	}
}
