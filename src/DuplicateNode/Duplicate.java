package DuplicateNode;
import java.util.Scanner;

public class Duplicate{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of nodes in the linked list : ");
		int count = input.nextInt();
		Node head = null;
		Node p = head;
		
		for(int i=0; i<count; i++){
			System.out.println("Enter node " + (i+1) + " value: ");
			int value = input.nextInt();
			if(head == null){
				head = new Node(value);
				p = head;
			}
			else{
				p.next = new Node(value);
				p = p.next;
			}
		}
		
		head = removeDuplicates(head);
		
		while(head!=null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	
	public static Node removeDuplicates(Node head){
		
		Node p = head;
		Node q = p.next;
		
		while(q!=null){
			if(p.data == q.data){
				q = q.next;
				p.next = q;
			}
			else{
				p = p.next;
				q = q.next;
			}
		}
		
		return head;
	}
}
