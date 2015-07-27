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
					+ "4. Change a node\n"
					+ "5. Get a node\n"
					+ "6. Print the List\n"
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
						
					}
					break;
			case 4: if(node!=null){
						
					}
					break;
			case 5: if(node!=null){
						
					}
					break;
			case 6: if(node!=null){
						printList(node);
					} 
					break;
			case 0: System.exit(0);
					break;
			default:System.out.println("Wrong option selected!");
					break;
			}
		}while(choice!=0);
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
		System.out.println("Enter the firsat node in the list:");
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
		if(pos<=1 || pos>node.getSize(node)+1){
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
}
