package Lists;

import java.util.Scanner;

/* Nodes in a list represent a number. For example, the nodes in Figure 1 (a) and (b) represent numbers 123 and 4567 respectively. 
 * Please implement a function/method to add numbers in two lists, and store the sum into a new list. 
 * 
 * Restriction: Addition should be done within the LinkedList only. 
 * */
public class NumberAdditionUsingLinkedList {

	public static void main(String[] args) {
		
		Node i=null;
		Node j=null;
		Node node1 = null;
		Node node2 = null;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter digits in Number 1");
		int num1Digits = input.nextInt();
		while ((num1Digits--) > 0) {
			System.out.println("Enter digit:");
			int digit = input.nextInt();
			
			if (digit < 0 || digit > 9) {
				System.out.println("Wrong digit entered");
			} else {	
				if(node1==null){
					i = new Node(digit);
					node1=i;
				}
				else{
					i.next = new Node(digit);
					i=i.next;
				}
			}
		}
		
		int num2Digits = input.nextInt();
		while ((num2Digits--) > 0) {
			System.out.println("Enter digit:");
			int digit = input.nextInt();
			
			if (digit < 0 || digit > 9) {
				System.out.println("Wrong digit entered");
			} else {	
				if(node2==null){
					j = new Node(digit);
					node2=j;
				}
				else{
					j.next = new Node(digit);
					j=j.next;
				}
			}
		}
		
		Node resultNode = getAddition(node1, node2);
		
		LinkedList.printList(resultNode);
		
	}

	public static Node getAddition(Node node1, Node node2) {
		Node i = LinkedList.reverseList(node1);
		Node j = LinkedList.reverseList(node2);
		Node k=null;
		Node resultNode=null;
		
		int iSize = LinkedList.getSize(i);
		int jSize = LinkedList.getSize(j);
		int count = iSize<jSize ? iSize : jSize;
		int tensVal=0;
		int val=0;
 		
		while(count>0){
			if(tensVal != 0){
				val = i.getValue() + j.getValue() + tensVal;
				tensVal = 0;
			}
			else{
				val = i.getValue() + j.getValue();
			}
			
			if(val<10){
				if(k==null){
					k=new Node(val);
					resultNode = k;
				}
				else{
					k.next = new Node(val);
					k = k.next;
				}
			}
			else{
				int unitVal = val%10;
				if(k==null){
					k=new Node(unitVal);
					resultNode = k;
				}
				else{
					k.next = new Node(unitVal);
					k = k.next;
				}
				tensVal = val%100;
			}
			i=i.next;
			j=j.next;
			count--;
		}
		
		while(i!=null){
			if(tensVal != 0){
				val = i.getValue() + tensVal;
				tensVal = 0;
			}
			else{
				val = i.getValue();
			}
			
			if(val<10){
				k.next = new Node(val);
				k = k.next;
			}
			else{
				int unitVal = val%10;
				k.next = new Node(unitVal);
				k = k.next;
				tensVal = val%100-unitVal;
			}
			i=i.next;
		}
		
		while(j!=null){
			if(tensVal != 0){
				val = j.getValue() + tensVal;
				tensVal = 0;
			}
			else{
				val = j.getValue();
			}
			
			if(val<10){
				k.next = new Node(val);
				k = k.next;
			}
			else{
				int unitVal = val%10;
				k.next = new Node(unitVal);
				k = k.next;
				tensVal = val%100-unitVal;
			}
			j=j.next;
		}
		
		if(tensVal!=0){
			k.next = new Node(tensVal);
		}
		return resultNode;
	}

}
