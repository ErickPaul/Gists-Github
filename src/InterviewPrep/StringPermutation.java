import java.util.*;

public class StringPermutation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str1 = "Mango";
		String str2 = "anmgo";

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		boolean result = isSame(arr1, arr2);
		System.out.println(result + " is the answer");
	}

	public static boolean isSame(char[] arr1, char[] arr2){
		if(arr1.length != arr2.length){
			return false;
		}

		for(int i=0; i<arr1.length; i++){
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
}