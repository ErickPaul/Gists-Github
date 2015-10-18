import java.util.Scanner;

class MissingTermInAP{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of terms in Arithematic Progression:");
		int count = input.nextInt();
		int[] arr = new int[count];

		for(int i=0; i<count; i++){
			System.out.println("Enter the term " + (i+1));
			arr[i] = input.nextInt();
		}
		int answer = getMissingTerm(arr);
		System.out.println("Answer is: " + answer);
	}

	public static int getMissingTerm(int[] arr){
		int diff1 = arr[1] - arr[0];
		int diff2 = arr[2] - arr[1];
		int diff;

		if(diff1 < diff2)
			diff = diff1;
		else
			diff = diff2;

		for(int i=0, j=1; j<arr.length; i++, j++){
			if((arr[j] - arr[i])!=diff)
				return (arr[i] + diff);
		}
		return -9999;
	}
}
