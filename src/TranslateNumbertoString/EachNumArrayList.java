package TranslateNumbertoString;

import java.util.ArrayList;

public class EachNumArrayList {

	public static int size=0;
	public String[] numArray = new String[size];
	
	public EachNumArrayList(String[] numArray) {
		this.numArray = numArray;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		EachNumArrayList.size = size;
	}
}
