class ListNode{
	int data;
	ListNode next;

	public ListNode(int data){
		this.data = data;
	}

	public ListNode(int data, ListNode next){
		this.data = data;
		this.next = next;
	}
}

public class IntersectLinkedList{
	public static void main(String[] args){
		ListNode list1 = new ListNode(3, new ListNode(1, new ListNode(5, new ListNode(9, new ListNode(7, new ListNode(2, new ListNode(1)))))));
		ListNode list2 = new ListNode(4, new ListNode(6, list1.next.next.next.next));
		ListNode l1 = list1;
		ListNode l2 = list2;

		int size1 = 0;
		int size2 = 0;

		while(l1!=null){
			System.out.print(l1.data + "->");
			l1 = l1.next;
			size1++;
		}
		System.out.println("Null");

		while(l2!=null){
			System.out.print(l2.data + "->");
			l2 = l2.next;
			size2++;
		}
		System.out.println("Null");

		System.out.println("Size1: " + size1 + " Size2: " + size2);

		if(size1>size2){
			int diff = size1 - size2;
			for(int i=0; i<diff; i++){
				list1 = list1.next;
			}
		}
		else if(size2 > size1){
			int diff = size2 - size1;
			for(int i=0; i<diff; i++){
				list2 = list2.next;
			}
		}

		while(list1!=null){
			if(list1 == list2){
				System.out.println("Intersection at :" + list1.data);
				break;
			}
			list1 = list1.next;
			list2 = list2.next;
		}
	}
}