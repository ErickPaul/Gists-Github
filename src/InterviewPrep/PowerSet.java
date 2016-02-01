import java.util.*;

public class PowerSet{
	public static void main(String[] args){
		char[] arr = {'a', 'b', 'c', 'd'};
		ArrayList<String> res = new ArrayList<String>();
		res.add("");
		res = getSubSet(arr, res);

		for(String s: res){
			System.out.println(s);
		}
	}

	public static ArrayList<String> getSubSet(char[] arr, ArrayList<String> res){
		for(int i=0; i<arr.length; i++){
			ArrayList<String> temp = new ArrayList<String>();
			for(String s: res){
				temp.add(s + arr[i]);
			}

			for(String s: temp){
				res.add(s);
			}
		}
		return res;
	}
}