public class IncDecArray{
	public static void main(String[] args){
		int arr[] = {1, 3, 50, 10, 9, 7, 6};//8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};

		int value = getMax(arr, 0, arr.length-1);	
		System.out.println(value);
		
	}

	public static int getMax(int[] arr, int low, int high){
		
		while(low<=high){
			int mid = (low+high)/2;
			System.out.println("mid:"+mid);
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
				return arr[mid];
			}
			else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
				return getMax(arr, mid+1, high);
			}
			else{
				return getMax(arr, low, mid-1);
			}
		}
		return -1;
	}
}