package RotateMatrix;

public class Rotate{
	public static void main(String[] args){
		int[][] arr = {{1, 2},{3, 4}};
		int n=2;
		rotate(arr, n);

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("N="+n);
	}

	public static int[][] rotate(int[][] mat, int n){
		for(int z=0; z<n/2; z++){
			int i = z;
			int j = n - z - 1;
			for(int x=i; x<j; x++){
				int temp = mat[i][x];
				mat[i][x] = mat[j-x][i];
				mat[j-x][i] = mat[j][j-x];
				mat[j][j-x] = mat[x][j];
				mat[x][j] = temp;
			}
		}
		n = 7;
		return mat;
	}
}
