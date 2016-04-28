package Arrays;

public class SpiralArrayRead {

	public static void main(String[] args) {
		//int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] arr = {{1,2},{3,4}};
		//int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		getSpiralRead(arr, 2, 2);
	}
	
	public static void getSpiralRead(int[][] arr, int endi, int endj){
		
		int round = (endi<endj? (endi/2):(endj/2));
		
		int starti = 0;
		int startj = 0;
		
		for(int x=0; x<=round; x++){
			
			if(endj-startj>0){
				for(int j=startj; j<=endj; j++){
					System.out.println(arr[starti][j]);
				}
			}
			
			if(endi-starti>0){
				for(int i=starti+1; i<=endi-1; i++){
					System.out.println(arr[i][endj]);
				}
			}
			
			if(endj-startj>0){
				for(int j=endj; j>=startj; j--){
					System.out.println(arr[endi][j]);
				}
			}
			
			if(endi-starti>0){
				for(int i=endi-1; i>=starti+1; i--){
					System.out.println(arr[i][startj]);
				}
			}
			
			starti++;
			endi--;
			startj++;
			endj--;
		}
	}
}
