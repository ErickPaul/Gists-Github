public class ReverseWords{

	public static void main(String[] args){
		String str = " My name is Vishal !";
		System.out.println(revWords(str));	
	}

	public static String revWords(String str){
		str = revStr(str.toCharArray());

		int i=0, start=0;
		StringBuilder sb = new StringBuilder();

		while(i<str.length()){
			if(str.charAt(i)==' '){
				sb.append(revStr(str.substring(start,i).toCharArray()) + " ");
				i++;
				start=i;
			}
			else{
				i++;
			}
		}
		sb.append(revStr(str.substring(start,i).toCharArray()));

		return sb.toString();

	}

	public static String revStr(char[] arr){
		int length = arr.length/2;

		for(int i=0; i<length; i++){
			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return String.valueOf(arr);
	}
	
}