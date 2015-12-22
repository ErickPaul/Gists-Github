import java.util.*;

public class Rotate{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix:");
		int size = input.nextInt();

		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.println("Enter element " + i + " - " + j);
				arr[i][j] = input.nextInt();
			}
		}		

		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print (arr[i][j] + " ");
			}
			System.out.println();
		}

		rotateMatrix(size, arr);

		System.out.println("Result: /n/n");

		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}		
	}

	public static int[][] rotateMatrix(int size, int[][] arr){

		int levels = size/2;
		int start = 0;
		int end = size-1;

		for(int i=0; i<levels; i++, start++, end--){

			int temp;

			for(int j=start; j<end; j++){
				temp = arr[start][j];
				arr[start][j] = arr[end-j][start];
				arr[end-j][start] = arr[end][end-j];
				arr[end][end-j] = arr[j][end];
				arr[j][end] = temp;
			}
		}

		return arr;
	}
}