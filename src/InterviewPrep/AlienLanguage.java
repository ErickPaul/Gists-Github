package InterviewPrep;

import java.util.*;

class AlienNode{
	char c;
	AlienNode next;

	public AlienNode(char c){
		this.c = c;
		next = null;
	}
}

public class AlienLanguage{

	public static AlienNode result = null;
	public static AlienNode temp = null;
	public static HashMap<Character, AlienNode> map = new HashMap<Character, AlienNode>();

	public static void main(String[] args){
		String[] words = {"caa", "aaa", "aab"};
		getSequence(words);

		while(result!=null){
			System.out.println(result.c);
			result = result.next;
		}
	}

	public static void getSequence(String[] words){
		for(int i=0; i<words.length-1; i++){
			int len = words[i].length() > words[i+1].length()? words[i+1].length() : words[i].length();
			for(int j=0; j<len; j++){
				if(words[i].charAt(j) == words[i+1].charAt(j)){

				}
				else{
					if(result == null){
						AlienNode node1 = new AlienNode(words[i].charAt(j));
						AlienNode node2 = new AlienNode(words[i+1].charAt(j));
						result = node1;
						temp = node1;
						temp.next = node2;
						temp = temp.next;
						map.put(words[i].charAt(j), node1);
						map.put(words[i+1].charAt(j), node2);
					}
					else{

						if(map.containsKey(words[i].charAt(j))){
							if(map.containsKey(words[i+1].charAt(j))){
								map.get(words[i].charAt(j)).next = map.get(words[i+1].charAt(j));
							}
							else{
								AlienNode t = new AlienNode(words[i+1].charAt(j));
								map.get(words[i].charAt(j)).next = t;
								map.put(words[i+1].charAt(j), t);	
							}
						}
						else{
							if(map.containsKey(words[i+1].charAt(j))){
								AlienNode t = new AlienNode(words[i].charAt(j));
								t.next = map.get(words[i+1].charAt(j));
								map.put(words[i].charAt(j), t);
							}
							else{
								AlienNode t1 = new AlienNode(words[i].charAt(j));
								AlienNode t2 = new AlienNode(words[i+1].charAt(j));
								t1.next = t2;
								map.put(words[i].charAt(j), t1);
								map.put(words[i+1].charAt(j), t2);	
							}
						}
					}
					break;
				}
			}
		}
	}
}