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


public class ListPartition{
	public static void main(String[] args){
		Node list = new Node(4, new Node(91, new Node(67, new Node(90))));

		list = partition(list);
		System.out.println("nulkl");

		while(list!=null){
			System.out.print(list.value + " ->" );
			list=list.next;
		}
		System.out.print("null");
	}

	public static Node partition(Node list){
		Node first = null;
		Node second = null;
		Node firstEnd = null;
		Node secondEnd = null;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the partition value:");
		int num = input.nextInt();

		Node temp = list;
		boolean hasElement = false;
		while(temp!=null){
			if(temp.value == num){
				hasElement = true;
			}
			temp=temp.next;
		}

		if(hasElement==true){
			while(list!=null){
				Node now = list;
				list = list.next;
				now.next = null;

				if(now.value > num){
					if(second==null){
						second = now;
						secondEnd = now;
					}
					else{
						secondEnd.next = now;
						secondEnd = secondEnd.next;
					}
				}
				else if(now.value < num){
					if(first==null){
						first = now;
						firstEnd = now;
					}
					else{
						firstEnd.next = now;
						firstEnd = firstEnd.next;
					}
				}
				else{
					if(second==null){
						second = now;
						secondEnd = now;
					}
					else{
						now.next = second;
						second = now;
					}
				}
			}
			firstEnd.next = second;
			return first;
		}
		else{
			return null;
		}
	}
}