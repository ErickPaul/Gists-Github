package GCDandLCM;

import java.util.*;

public class FindGCD{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total numbers in array:");
		int arrSize = input.nextInt();
		int arr[] = new int[arrSize];
		for(int i=0; i<arrSize; i++){
			System.out.println("Enter num " + i + " :");
			arr[i] = input.nextInt();			
		}
		int result = findGCD(arr);
		System.out.println("Result GCD is: " + result);
	}

	public static int findGCD(int[] arr){
		List<Integer> result = new ArrayList<Integer>();
		for(int num: arr){
			List<Integer> temp = getPrimeFactors(num);
			if(result.size() == 0){
				result = temp;
			}
			else{
				result = getIntersection(result, temp);
			}
		}
		
		int resultNum=1;
		for(Integer num: result){
			resultNum = resultNum * num;
		}

		return resultNum;
	}

	public static List<Integer> getIntersection(List<Integer> result, List<Integer> temp){
		result.retainAll(temp);
		return result;
	}

	public static List<Integer> getPrimeFactors(int num){
		int temp=1;
		List<Integer> result = new ArrayList<Integer>();
		result.add(1);
		for(int i=2; i<=num; i++){
			if(num%i==0){
				result.add(i);
				num /= i;
				i=temp;
			}
			else{
				temp=i;
			}
		}
		return result;
	}
}
