package CyclicLinkedList;
 
import java.util.Scanner;

public class CyclicLinkedList{
	public static void main(String args[]){
		Node head = createLinkedList();
		printLinkedList(head);
		//boolean result = isCyclic(head);
		//System.out.println("Result for linkedlist is: " + result);
	}

	public static Node createLinkedList(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of nodes: ");
		int count = input.nextInt();
		Node head = null;
		Node p = null;
		Node cycleNode = null;

		int i=0;
		while(i<count){
		        System.out.println("Enter the data for node " + (i+1));
		        int data = input.nextInt();
		        Node node = new Node(data);
		        node.next = null;
		        if(i==0){
		                head = node;
		                p = node;
		        }
		        else{
				if(i==2){      // To make a cyclic linkedlist
				        cycleNode = node;
				}
		                p.next = node;
		                p = p.next;
		        }
			
			i++;
		}

		p.next = cycleNode;         // To make a cyclic linkedlist
		System.out.println("Cyclic Node: " + cycleNode.data);

		return head;
	}

	public static void printLinkedList(Node head){
		
		if(isCyclic(head) == true){
			System.out.println("Sorry this is a cyclic linkedlist");
			return;
		}

		while(head!= null){
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print("null" + "\n");
	}

	public static boolean isCyclic(Node head){
		Node slow = head;
		Node fast = head.next;
		
		try{
			while(slow!=null && fast!=null){
				if(slow == fast){
					return true;
				}
		        	slow = slow.next;
		        	fast = fast.next.next;
			}
			return false;
		}
		catch(Exception ex){
			return true;
		}
	}
}
