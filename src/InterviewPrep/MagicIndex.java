public class MagicIndex{
	public static void main(String[] args){
		int[] arr = {-2,0,1,3,19,21,89};

		System.out.println(getIndex(arr, 0, arr.length-1));
	}

	public static int getIndex(int[] arr, int low, int high){
		if(low<=high){
			int mid = (low+high)/2;

			if(mid == arr[mid]){
				return mid;
			}
			else if(mid>arr[mid]){
				return getIndex(arr, mid+1, high);
			}
			else if(mid<arr[mid]){
				return getIndex(arr, low, mid-1);
			}
		}
		return -1;
	}
}