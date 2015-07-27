package Lists;

public class Node {

	private int value;
	public Node next;
	
	public Node(){
		this.value=(Integer) null;
		this.next=null;
	}
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getSize(Node node){
		int count=0;
		while(node!=null){
			count++;
			node = node.next;
		}
		return count;
	}
}
