import java.util.*;

class Node{
	int value;
	Node next;

	public Node(int value){
		this.value = value;
		next = null;
	}

	public Node(int value, Node node){
		this.value = value;
		next = node;
	}
}


public class KthLastElement{
	public static void main(String[] args){
		Node list = new Node(4, new Node(5, new Node(67, new Node(90))));

		System.out.println(getKthElement(list));
	}

	public static int getKthElement(Node list){

		int size = 1;
		Node temp = list;
		while(temp.next!=null){
			size++;
			temp = temp.next;
		}

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the k value:");
		int k = input.nextInt();
		if(k>size){
			System.out.println("Enter the correct k value!");
			return -1;
		}
		else{
			temp = list;

			for(int i=0; i<k-1; i++){
				temp = temp.next;
			}

			while(temp.next!=null){
				temp = temp.next;
				list = list.next;
			}

			return list.value;
		}
	}
}