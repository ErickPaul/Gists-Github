import java.util.*;

public class UniqueLetters{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = "HIMynAme Vishal";
		boolean flag = true;
		boolean[] arr = new boolean[256];

		for(int i=0; i<256; i++){
			arr[i] = false;
		}

		for(int i=0; i<str.length(); i++){
			int ch = (int)str.charAt(i);
			if(arr[ch]==false){
				arr[ch] = true;
			}
			else{
				flag = false;
				break;
			}
		}

		if(flag==true){
			System.out.println("Yes");	
		}
		else{
			System.out.println("No");
		}
		
	}
}