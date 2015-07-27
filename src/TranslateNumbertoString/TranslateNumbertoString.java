package TranslateNumbertoString;

import java.util.LinkedList;
import java.util.Scanner;

/* Given a number, please translate it to a string, following the rules: 1 is translated to 'a', 2 to 'b', …, 12 to 'l', …, 
 * 26 to 'z'. For example, the number 12258 can be translated to "abbeh", "aveh", "abyh", "lbeh" and "lyh", so there are 
 * 5 different ways to translate 12258. How to write a function/method to count the different ways to translate a number?*/
public class TranslateNumbertoString {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number = input.nextLine();
		String[] stringArray = new String[number.length()];
		for(int i=0; i<number.length(); i++){
			stringArray[i] = String.valueOf(number.charAt(i));
		}
		getCombinations(stringArray);
	}
	
	public static void getCombinations(String[] numArray){
		EachNumArrayList.setSize(numArray.length);
		
		LinkedList<EachNumArrayList> listOfList1 = new LinkedList<EachNumArrayList>();
		LinkedList<EachNumArrayList> listOfList2 = new LinkedList<EachNumArrayList>();
		
		String[] num1 = {numArray[0]};
		listOfList1.add(new EachNumArrayList(num1));
		
		for(int i=1; i<numArray.length; i++){
			if(listOfList1.size()>0){
				for(int j=0; j<listOfList1.size(); j++){
					EachNumArrayList each = listOfList1.get(j);
					String[] newArray1 = new String[each.numArray.length + 1];
					String[] newArray2 = new String[each.numArray.length];
					
					//Adding extra element in array
					for(int x=0; x<each.numArray.length; x++){
						newArray1[x] = each.numArray[x];
						newArray2[x] = each.numArray[x];
					}
					newArray1[each.numArray.length] = numArray[i];
                    listOfList2.add(new EachNumArrayList(newArray1));
                    
                    newArray2[newArray2.length-1]= newArray2[newArray2.length-1]+numArray[i];
                    if(Integer.parseInt(newArray2[newArray2.length-1])<26 || Integer.parseInt(newArray2[newArray2.length-1])>0){
                    	listOfList2.add(new EachNumArrayList(newArray2));
                    }
				}
				listOfList1 = listOfList2;
				for(int y=listOfList2.size()-1; y>=0; y--){
					listOfList2.remove(y);
				}
			}
		}
	}

}
