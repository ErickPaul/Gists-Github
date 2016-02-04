import java.util.*;

public class HistogramDepth{
	public static void main(String[] args){
		int[] arr = {5,3,7,2,6,4,5,9,1,2};
		System.out.println(getDepth(arr));
	}

	public static int getDepth(int[] arr){
	
		int[] maxLeft = new int[arr.length];
		int[] maxRight = new int[arr.length];

		Arrays.fill(maxLeft, 0);
		Arrays.fill(maxRight, 0);

		if(arr.length<=2){
			return 0;
		}
		int total =0;
	
		maxLeft[0] = arr[0];
		for(int i=1; i<arr.length; i++){
			maxLeft[i] = Math.max(arr[i], maxLeft[i-1]);
		}

		maxRight[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--){
			maxRight[i] = Math.max(arr[i], maxRight[i+1]);
		}

		for(int i=0; i<arr.length; i++){
			total = total + (Math.min(maxLeft[i], maxRight[i]) - arr[i]);
		}

		return total;
	}
}