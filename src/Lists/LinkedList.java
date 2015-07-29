package Lists;

import java.util.Scanner;

public class LinkedList {
	
	public static void main(String[] args) {

		int choice;
		Node node=null;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Select an option:\n"
					+ "1. Create a list\n"
					+ "2. Add a node\n"
					+ "3. Delete a node\n"
					+ "4. Get a node\n"
					+ "5. Reverse the List\n"
					+ "6. Print the List\n"
					+ "7. Get Kth Node\n"
					+ "0. Exit");
			choice = input.nextInt();
			switch (choice) {
			case 1: if(node==null){
						node = createList();
					}
					break;
			case 2: if(node!=null){
						node = addNode(node);
					}
					break;
			case 3: if(node!=null){
						node = deleteNode(node);
					}
					break;
			case 4: if(node!=null){
						getNode(node);
					}
					break;
			case 5: if(node!=null){
						node = reverseList(node);
					}
					break;
			case 6: if(node!=null){
						printList(node);
					} 
					break;
			case 7: if(node!=null){
						getKthNode(node);
					}
					break;
			case 0: System.exit(0);
					break;
			default:System.out.println("Wrong option selected!");
					break;
			}
		}while(choice!=0);
	}
	
	public static void getKthNode(Node node){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Kth value:");
		int num = input.nextInt();
		
		Node i=node;
		Node j=node;
		
		if(num>getSize(node) || num<1){
			System.out.println("Wrong Kth value. It should be less than size of the list and greater than 0");
			return;
		}
		
		int x=1;
		while(x<num){
			j=j.next;
			x++;
		}
		
		while(j.next!=null){
			i=i.next;
			j=j.next;
		}
		
		System.out.println(num + "th node value is: " + i.getValue());
	}
	
	public static Node reverseList(Node node){
		Node i = null;
		Node j = node;
		Node k = null;
		
		while(j.next!=null){
			k = j.next;
			j.next=i;
			i = j;
			j = k;
		}
		j.next=i;
		return j;
	}
	
	public static Node deleteNode(Node node){
		System.out.println("Enter the position of the node to be deleted:");
		Scanner input = new Scanner(System.in);
		int pos = input.nextInt();
		if(pos<1 || pos>getSize(node)){
			System.out.println("Wrong position entered");
		}
		else{
			int i=1;
			Node startNode = node;
			while(node!=null){
				if(pos==1){
					node = node.next;
					return node;
				}
				else if(pos==i+1){
					node.next = node.next.next;
					return startNode;
				}
				else{
					node= node.next;
					i++;
				}
			}
		}
		return node;
	}
	
	public static void getNode(Node node){
		System.out.println("Enter the position of the node:");
		Scanner input = new Scanner(System.in);
		int pos = input.nextInt();
		int i=1;
		
		while(node!=null){
			if(pos==i){
				System.out.println("Value at position "+ pos +" is "+ node.getValue());
				return;
			}
			i++;
			node= node.next;
		}
		System.out.println("Node at this position does not exist");
	}
	
	public static void printList(Node node){
		while(node!=null){
			System.out.print(node.getValue()+"->");
			node=node.next;
		}
		System.out.print("null\n");
	}
	
	public static Node createList(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first node in the list:");
		int value = input.nextInt();
		return new Node(value);
	}
	
	public static Node addNode(Node node){
		System.out.println("Where do you want to add the node:");
		System.out.println("1. At the start");
		System.out.println("2. At the end");
		System.out.println("3. In the middle");
		System.out.println("Enter any one option:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.println("Enter the value of the node:");
		int value = input.nextInt();
		switch(choice){
			case 1: node = addAtStart(node, value);
					break;
			case 2: node = addAtEnd(node, value);
					break;
			case 3: node = addInMiddle(node, value);
					break;
			default:System.out.println("Wrong option selected!");
					break;
		}
		return node;
	}
	
	public static Node addAtStart(Node node, int value){
		Node newNode = new Node(value);
		newNode.next = node;
		return newNode;
	}
	
	public static Node addAtEnd(Node node, int value){
		Node newNode = new Node(value);
		Node startNode = node;
		while(node.next!=null){
			node = node.next;
		}
		node.next=newNode;
		return startNode;
	}
	
	public static Node addInMiddle(Node node, int value){
		System.out.println("Enter the position you want to enter the new node:");
		Scanner input = new Scanner(System.in);
		int pos = input.nextInt();
		if(pos<=1 || pos>getSize(node)+1){
			System.out.println("Enter position greater than 1");
			return node;
		}
		else{
			Node startNode = node;
			Node newNode = new Node(value);
			
			int i=1;
			while((i++)<pos-1){
				node = node.next;
			}
			newNode.next = node.next;
			node.next=newNode;
			return startNode;
		}
	}
	
	public static int getSize(Node node){
		int count=0;
		while(node!=null){
			count++;
			node = node.next;
		}
		return count;
	}
}
