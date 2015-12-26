import java.util.*;

public class ZeroMatrix{
	public static void main(String[] args){
		int[][] arr = {{1, 2, 0}, {0, 1, 9}, {2, 3, 4}};

		getZeroMatrix(arr, 3);

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] getZeroMatrix(int[][] arr, int size){
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> col = new ArrayList<Integer>();

		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(arr[i][j] == 0){
					row.add(i);
					col.add(j);
				}
			}
		}

		if(row.size()>0){
			for(Integer r: row){
				for(int i=0; i<size; i++){
					arr[r][i] = 0;
				}
			}

			for(Integer c: col){
				for(int i=0; i<size; i++){
					arr[i][c] = 0;
				}
			}
		}
		return arr;
	}
}