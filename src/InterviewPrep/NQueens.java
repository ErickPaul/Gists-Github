import java.util.*;

public class NQueens{
	public static int n=8;
	
	public static void main(String[] args){
		int[][] board = new int[8][8];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=0;
			}
		}
		solveNQ(board);
	}

	public static boolean solveNQ(int[][] board){
		if(solveNQUntil(board, 0)){
			printBoard(board);
			return true;
		}
		else{
			System.out.println("Not possible");
			return false;
		}
	}

	public static boolean solveNQUntil(int[][] board, int col){
		if(col>=n){
			return true;
		}

		for(int i=0; i<n; i++){
			if(isSafe(board, i, col)){
				board[i][col] = 1;
				if(solveNQUntil(board, col+1)){
					return true;
				}
				board[i][col] = 0;				
			}
		}


		return false;
	}

	public static boolean isSafe(int[][] board, int row, int col){

		for(int i=col-1; i>=0; i--){
			if(board[row][i]==1){
				return false;
			}
		}

		for(int i=row, j=col; i>=0 && j>=0; i--, j--){
			if(board[i][j]==1){
				return false;
			}
		}

		for(int i=row, j=col; i<n && j>=0; i++, j--){
			if(board[i][j]==1){
				return false;
			}
		}

		return true;
	}

	public static void printBoard(int[][] board){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(" " + board[i][j] + " ");
			}
			System.out.println();
		}
	}
}