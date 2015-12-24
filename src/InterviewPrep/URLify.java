import java.util.*;

public class URLify{
	public static void main(String[] args){
		String str = "Hello how r u      ";
		char[] arr = str.toCharArray();

		int j=arr.length-1;
		while(arr[j]==' '){
			j--;
		}

		for(int i=arr.length-1; i>=0; i--){
			if(arr[j]!=' '){
				arr[i] = arr[j];	
			}
			else{
				arr[i--] = '0';
				arr[i--] = '2';
				arr[i] = '%';
			}
			j--;
		}

		System.out.println(new String(arr));
	}
}