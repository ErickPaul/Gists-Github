import java.util.*;

class Node{
	int data;
	Node next;

	public Node(int data){
		this.data = data;
		this.next = null;
	}

	public Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}

public class LinkedListAddition{
	public static void main(String[] args){
		Node num1 = new Node(7, new Node(6, new Node(5, new Node(1))));
		Node num2 = new Node(8, new Node(3, new Node(2)));
		Node result = null;
		Node temp = null;
		int carry=0;

		temp = num1;
		while(temp!=null){
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
		temp = num2;
		while(temp!=null){
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();

		while(num1!=null && num2!=null){
			
			int total = num1.data + num2.data + carry;
			carry = total>9 ? 1 : 0;
			total = total%10;

			if(result == null){
				result = new Node(total);
				temp = result;
			}
			else{
				temp.next = new Node(total);
				temp = temp.next;
			}
			num1 = num1.next;
			num2 = num2.next;
		}

		while(num1!=null){
			int total = num1.data + carry;
			carry = total>9 ? 1 : 0;
			total = total%10;

			if(result == null){
				result = new Node(total);
				temp = result;
			}
			else{
				temp.next = new Node(total);
				temp = temp.next;
			}	
			num1 = num1.next;
		}

		while(num2!=null){
			int total = num2.data + carry;
			carry = total>9 ? 1 : 0;
			total = total%10;

			if(result == null){
				result = new Node(total);
				temp = result;
			}
			else{
				temp.next = new Node(total);
				temp = temp.next;
			}	
			num2 = num2.next;
		}

		if(carry!=0){
			temp.next = new Node(carry);
		}

		while(result!=null){
			System.out.print(result.data);
			result = result.next;
		}
		System.out.println();
	}
}