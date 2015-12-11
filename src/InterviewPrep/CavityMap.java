import java.io.*;
import java.util.*;

/*

You are given a square map of size . Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, , denoting the size of the map. Each of the following  lines contains  positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 

Output Format

Output  lines, denoting the resulting map. Each cavity should be replaced with character X.

Sample Input

4
1112
1912
1892
1234
Sample Output

1112
1X12
18X2
1234
Explanation

The two cells with the depth of 9 fulfill all the conditions of the Cavity definition and have been replaced by X.

*/


public class CavityMap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.nextLine();
        char[][] arr = new char[size][size];
        
        for(int i=0; i<size; i++){
            String temp = input.nextLine();
            for(int j=0; j<size; j++){
                arr[i][j] = temp.charAt(j);   
            }    
        }
        
        getCavity(arr, size);
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(arr[i][j]);
            }    
            System.out.println();
        }
    }
    
    public static char[][] getCavity(char[][] arr, int size){
        if(size<3){
            return arr;
        }
        
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();
        
        for(int i=1; i<size-1; i++){
            for(int j=1; j<size-1; j++){
                if(isCavity(arr, i, j)){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i=0; i<row.size(); i++){
            arr[row.get(i)][col.get(i)] = 'X';
        }
        return arr;
    }
    
    public static boolean isCavity(char[][] arr, int i, int j){
        if(arr[i-1][j]-'0' >= arr[i][j]-'0'){
            return false;
        }else if(arr[i][j-1]-'0' >= arr[i][j]-'0'){
            return false;
        }
        else if(arr[i][j+1]-'0' >= arr[i][j]-'0'){
            return false;
        }
        else if(arr[i+1][j]-'0' >= arr[i][j]-'0'){
            return false;
        }
        
        return true;
    }
}