package TextNowTest;

import java.util.ArrayList;

public class TextNowTest {
	public static void main(String[] args){
		String[] result = getMessageParts("A short sentence.", 30);
		
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
	
	public static String[] getMessageParts(String long_message, int max_message_size){ 
		ArrayList<String> result = new ArrayList<>();
		int x = 5;
		
		if(max_message_size<10){
			String[] testResultArray = new String[1];
			testResultArray[0] = String.valueOf(-1);
			return testResultArray;
		}
		
		if(long_message.length()<max_message_size){
			String[] testResultArray = new String[1];
			testResultArray[0] = long_message;
			return testResultArray;
		}
		
		while(long_message.length()>=max_message_size-x){
			String element = "";
			
			while(element.length()<max_message_size-x){
				int currentSize = element.length();
				int currentIndex = long_message.indexOf(" ");
				if(currentIndex==-1){
					break;
				}
				
				if(currentIndex < max_message_size-x-currentSize){
					element = element + long_message.substring(0, currentIndex+1);
					long_message = long_message.substring(currentIndex+1);
				}
				else{
					break;
				}
			}
			result.add(element);
			
		}
		result.add(long_message + " ");
	
		String[] resultArray = new String[result.size()];
		for(int i=0; i<result.size(); i++){
			resultArray[i] = result.get(i) + "(" + (i+1) + "/" + result.size() + ")";
		}
		return resultArray;
	}
}
