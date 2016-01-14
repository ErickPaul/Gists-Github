import java.util.*;

class DepthTreeNode{
	int data;
	DepthTreeNode left;
	DepthTreeNode right;

	public DepthTreeNode(int data){
		this.data = data;
	}

	public DepthTreeNode(int data, DepthTreeNode left, DepthTreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

class DepthListNode{
	int data;
	DepthListNode next;
	public DepthListNode(int data){
		this.data = data;
	}
}

public class ListDepth{
	public static HashMap<Integer, DepthListNode> map = new HashMap<Integer, DepthListNode>();
	public static void main(String[] args){
		DepthTreeNode tree = new DepthTreeNode(5, new DepthTreeNode(2, new DepthTreeNode(1), new DepthTreeNode(3)), new DepthTreeNode(7, new DepthTreeNode(6), new DepthTreeNode(8, new DepthTreeNode(11), new DepthTreeNode(12))));
		getLists(tree, 0);
		for(Map.Entry<Integer, DepthListNode> e: map.entrySet()){
			DepthListNode temp = e.getValue();
			System.out.println("Depth :" + e.getKey());
			while(temp!=null){
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("Null");
		}
	}

	public static void getLists(DepthTreeNode node, int depth){
		if(node!=null){
			if(map.containsKey(depth)){
				DepthListNode temp = map.get(depth);
				while(temp.next!=null){
					temp = temp.next;
				}
				temp.next = new DepthListNode(node.data);
			}
			else{
				map.put(depth, new DepthListNode(node.data));
			}
			getLists(node.left, depth+1);
			getLists(node.right, depth+1);
		}
	}
}