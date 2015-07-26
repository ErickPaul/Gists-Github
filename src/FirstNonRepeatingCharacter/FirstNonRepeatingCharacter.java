package FirstNonRepeatingCharacter;

/* Implement a function to find the first character in a string which only appears once.
 * For example: It returns ‘b’ when the input is “abaccdeff”.*/

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		String str = "heellloooohhhkkklklmkkklll";
		System.out.println(getFirstCharacter(str));
	}

	public static char getFirstCharacter(String str){
		int[] value = new int[256];
		int[] index = new int[256];
		
		for(int i=0; i<str.length(); i++){
			value[(int)str.charAt(i)] += 1;
			if(index[(int)str.charAt(i)]<=0){
				index[(int)str.charAt(i)] = i;
			}
		}
		
		int finalIndex=9999;
		for(int i=0; i<256; i++){
			if(value[i]==1 && i<finalIndex){
				finalIndex = i;
			}
		}
		
		if(finalIndex==9999){
			return (Character) null;
		}
		else{
			return (char)finalIndex;
		}
	}
}
