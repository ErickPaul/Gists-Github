import java.util.HashMap;


public class Duplicatee {
	public static void main(String[] args) {
		int[] arr = {-1,0};
		System.out.println("Max count is: " + getDuplicateCount(arr));
	}
	
	public static int getDuplicateCount(int[] arr){
		
		if(arr.length==0){
			return 0;
		}
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

	    for (int a : arr) {
	        Integer freq = m.get(a);
	        m.put(a, (freq == null) ? 1 : freq + 1);
	    }

	    int max = -1;
	    int mostFrequent = -1;

	    for (HashMap.Entry<Integer, Integer> e : m.entrySet()) {
	        if (e.getValue() > max) {
	            mostFrequent = e.getKey();
	            max = e.getValue();
	        }
	    }

	    return max;
	}

}
