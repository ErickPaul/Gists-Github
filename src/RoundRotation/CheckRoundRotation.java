package RoundRotation;

/* Given problem is to check if the two strings are round rotationally equal. 
 * Example, "abc" and "cab" are equal if checked rotatinally.
 */


public class CheckRoundRotation {
	
	public static void main(String[] args) {
		String arr1="abdc";
		String arr2="cdab";
		
		boolean result = CheckRoundRotation.checkRotation(arr1, arr2);
		System.out.println(result);
	}
	
	public static boolean checkRotation(String arr1, String arr2){
		
		if(arr1.length() != arr2.length()){
			return false;
		}
		
		int i=0;
		
		while(i<arr2.length()){
			
			if(arr2.charAt(i)==arr1.charAt(0)){
				int arr1Start = 0;
				int arr2Start = i;
				boolean flag=false;
				
				for(int x=0; x<arr1.length(); x++, arr1Start++, arr2Start++){
					if(arr2Start==arr2.length()){
						arr2Start=0;
					}
					if(arr1.charAt(arr1Start)==arr2.charAt(arr2Start)){
						flag = true;
					}
					else{
						flag=false;
						break;
					}
				}
				if(flag==true){
					return true;
				}
			}
			
			i++;
		}
		return false;
	}
}
