import java.util.Scanner;
public class CTCI_1_1{  // check if any letter repeats in a string
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		System.out.println("Result: " + checkArr(line));
		//printmain(line);
	}

	public static boolean checkArr(String line){
		boolean[] checkArr = new boolean[256];
		for(int i=0; i<line.length(); i++){
		        int num = line.charAt(i);
		        if(checkArr[num]!=true){
		                checkArr[num] = true;
		        }
		        else{
		                return false;
		        }
		}
		return true;
	}
}
