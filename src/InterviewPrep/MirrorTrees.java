import java.util.*;

class Node{
	int data;
	Node left;
	Node right;

	public Node(int data){
		this.data = data;
	}
	public Node(int data, Node left, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class MirrorTrees{
	public static void main(String[] args){
		Node tree1 = new Node(1, new Node(3), new Node(2, new Node(5), new Node(4)));
		Node tree2 = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3));
		boolean result = isMirror(tree1, tree2);

		System.out.println("Result is " + result);
	}

	public static boolean isMirror(Node tree1, Node tree2){

		if(tree1==null && tree2==null){
			return true;
		}		
		
		if(tree1==null || tree2==null){
			return false;
		}

		if (tree1.data == tree2.data){
			boolean res1 = isMirror(tree1.left, tree2.right);
			boolean res2 = isMirror(tree1.right, tree2.left);	
			if(res1==false || res2==false){	
				return false;
			}
			return true;
		}
		return false;

	}
}