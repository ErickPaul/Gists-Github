import java.util.*;

public class Partition{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of nodes in the linkedlist");
		int count = input.nextInt();

		Node head = null;
		Node start = null;
		for(int i=0; i<count; i++){
			System.out.println("Enter teh value of node " + (i+1));		
			if(head == null){
				head = new Node(input.nextInt());
				start = head;
			}
			else{
				start.next = new Node(input.nextInt());
				start = start.next;
			}
		}

		System.out.println("Enter the value for partition");
		int part = input.nextInt();
		print(head);

		Node result = partition(head, part);
		print(result);
	}

	public static void print(Node result){
		while(result!=null){
			System.out.print(result.value + " -> ");
			result=result.next;
		}
		System.out.println();
	}

	public static Node partition(Node head, int value){
		Node startSmall = null;
		Node startBig = null;
		Node endSmall = null;
		Node endBig = null;
		Node i = head;
		while(i!=null){
			Node next = i.next;
			i.next = null;
			if(i.value< value){
				if(startSmall == null){
					startSmall = i;
					endSmall = i;
				}
				else{
					endSmall.next = i;
					endSmall = endSmall.next;
				}
			}
			else{
				if(startBig == null){
					startBig = i;
					endBig = i;
				}
				else{
					endBig.next = i;
					endBig = endBig.next;
				}
			}
			i=next;
		}
		endSmall.next=startBig;
		return startSmall;
	}
}

class Node{
	int value;
	Node next;

	public Node(int value){
		this.value = value;
		this.next = null;
	}
}
