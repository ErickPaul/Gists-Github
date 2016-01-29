import java.util.*;

public class NumberInWords{

	public static HashMap<String, String> map = new HashMap<String, String>();
	public static StringBuilder str = new StringBuilder();
	public static void main(String[] args){
		
		map.put("00", "Zero");
		map.put("01", "One");
		map.put("02", "Two");
		map.put("03", "Three");
		map.put("04", "Four");
		map.put("05", "Five");
		map.put("06", "Six");
		map.put("07", "Seven");
		map.put("08", "Eight");
		map.put("09", "Nine");
		map.put("10", "Ten");
		map.put("11", "Eleven");
		map.put("12", "Twelve");
		map.put("13", "Thirteen");
		map.put("14", "Fourteen");
		map.put("15", "Fifteen");
		map.put("16", "Sixteen");
		map.put("17", "Seventeen");
		map.put("18", "Eighteen");
		map.put("19", "Nineteen");
		map.put("20", "Twenty");
		map.put("30", "Thirty");
		map.put("40", "Fourty");
		map.put("50", "Fifty");
		map.put("60", "Sixty");
		map.put("70", "Seventy");
		map.put("80", "Eighty");
		map.put("90", "Ninty");
		map.put("100", "Hundred");
		map.put("1000", "Thousand");
		
		String value = "-1";
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your number OR -1 for Exit");
			value = input.nextLine();
			
			if(value.length()==1){
				System.out.println(getUnitString(value));		
			}
			else if(value.length()==2){
				System.out.println(getTenString(value));
			}
			else if(value.length()==3){
				System.out.println(getHundredString(value));
			}
			else if(value.length()==4){
				System.out.println(getThousandString(value));
			}

		}while(!value.equals("-1"));
	}

	public static String getUnitString(String value){
		if(value.equals("0")){
			return "";
		}
		else{
			return map.get("0"+value);
		}
	}

	public static String getTenString(String value){
		if(value.charAt(0)=='0'){
			return getUnitString(value.substring(1));	
		}
		else if(value.charAt(0)=='1'){
			return map.get(value);
		}
		else{
			StringBuilder tempStr = new StringBuilder();
			tempStr.append(map.get(value.charAt(0)+"0") + getUnitString(value.substring(1)));
			return tempStr.toString();
		}
	}	

	public static String getHundredString(String value){
		StringBuilder tempStr = new StringBuilder();
		if(value.charAt(0)!='0'){
			tempStr.append(map.get("0" + value.charAt(0)) + " ");
			tempStr.append(map.get("100"));
		}
		return tempStr.append(getTenString(value.substring(1))).toString();
	}

	public static String getThousandString(String value){
		StringBuilder tempStr = new StringBuilder();
		if(value.charAt(0)!='0'){
			tempStr.append(map.get("0" + value.charAt(0)) + " ");
			tempStr.append(map.get("1000"));
		}
		return tempStr.append(getHundredString(value.substring(1))).toString();
	}


}