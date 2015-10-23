package Median;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers: (-9999 to exit)");
		
		int num;
		List<Integer> arr = new ArrayList<Integer>();
		while((num=input.nextInt())!=-9999){
			arr.add(num);
			Collections.sort(arr);
			double median = getMedian(arr);
			System.out.print("Arr: ");
			for(int ele: arr){
				System.out.print(ele + "-");
			}
			System.out.println("Median: " + median);
		}
	}

	public static double getMedian(List<Integer> arr){		
		int size = arr.size();
		if((size%2)==0){
			int mid = size/2;
			return (double)(arr.get(mid) + arr.get(mid-1))/2;
		}
		else{
			return arr.get(size/2);
		}
	}
}
