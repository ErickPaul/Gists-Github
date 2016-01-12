import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data){
		this.data = data;
	}
}

public class BinaryTreeFromArray{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};

		TreeNode node = getTree(arr, 0, arr.length-1);

		printTree(node);

	}

	public static void printTree(TreeNode node){
		if(node!=null){
			System.out.println(node.data);
			printTree(node.left);
			printTree(node.right);
		}
	}

	public static TreeNode getTree(int[] arr, int start, int end){
		
		while(end>=start){
			int mid = (end + start)/2;

			TreeNode result = new TreeNode(arr[mid]);
			result.left = getTree(arr, start, mid-1);
			result.right = getTree(arr, mid+1, end);	
			return result;
		}

		return null;
	}
}