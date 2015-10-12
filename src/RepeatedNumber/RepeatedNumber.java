import java.util.Scanner;

public class RepeatedNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of integers: ");
		int count = input.nextInt();

		int[] numArr = new int[count];
		for(int i=0; i<count; i++){
			System.out.println("Enter Number " + (i+1));
			numArr[i] = input.nextInt();
		}
		System.out.println("Result is : " + checkRepeatedNumber(numArr));
	}

	public static int checkRepeatedNumber(int[] numArr){
		int size = numArr.length;
		
		int slowValue = numArr[0];
		int fastValue = numArr[1];

		while(slowValue<size && fastValue<size){
			if(slowValue == fastValue){
				return slowValue;
			}
			else{
				slowValue = numArr[slowValue];
				if(fastValue<size){
					fastValue = numArr[fastValue];
					if(fastValue<size){
						fastValue = numArr[fastValue];
					}
					else{
						return -9999;
					}
				}
				else{
					return -9999;
				}
			}
		}
		return -9999;
	}
}
