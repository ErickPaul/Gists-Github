public class MergeSort{

	public static int[] arr = {12,98,45,2,9,43,23,76};
	public static int[] tarr = new int[arr.length];
	public static void main(String[] args){

		System.out.println("Before sorting");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		mergeSort(0, arr.length-1);

		System.out.println("After sorting");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void mergeSort(int low, int high){
		if(low<high){
			int mid = (low+high)/2;

			mergeSort(low, mid-1);
			mergeSort(mid+1, high);
			merge(low, mid, high);
		}
	}

	public static void merge(int low, int mid, int high){
		
		for(int i=low; i<=high; i++){
			tarr[i] = arr[i];
		}

		int i=low;
		int j=mid+1;
		int k=low;

		while(i<=mid && j<=high){
			if(tarr[i]>tarr[j]){
				arr[k] = tarr[j];
				j++;
			}
			else{
				arr[k] = tarr[i];
				i++;
			}
			k++;
		}

		while(i<=mid){
			arr[k] = tarr[i];
			i++;
			k++;
		}

		while(j<=high){
			arr[k] = tarr[j];
			j++;
			k++;
		}
	}
}