class TreeBinaryNode{
	int data;
	TreeBinaryNode left;
	TreeBinaryNode right;

	public TreeBinaryNode(int data){
		this.data = data;
	}

	public TreeBinaryNode(int data, TreeBinaryNode left, TreeBinaryNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}	
}

public class CheckTreeBinary{
	public static void main(String[] args){
		TreeBinaryNode tree = new TreeBinaryNode(12, new TreeBinaryNode(9, new TreeBinaryNode(8), new TreeBinaryNode(10)), new TreeBinaryNode(15, new TreeBinaryNode(14), new TreeBinaryNode(17)));
		System.out.println(isBinary(tree));
	}

	public static boolean isBinary(TreeBinaryNode tree){
		boolean flagLeft = true;
		boolean flagRight = true;

		if(tree.left!=null && tree.data < tree.left.data){
			flagLeft = false;
		}
		else if(tree.left!=null && tree.data > tree.left.data){
			flagLeft = isBinary(tree.left);
		}

		if(tree.right!=null && tree.data > tree.right.data){
			flagRight = false;
		}
		else if(tree.right!=null && tree.data < tree.right.data){
			flagRight = isBinary(tree.right);
		}

		if(flagLeft==false || flagRight == false){
			return false;
		}
		else{
			return true;
		}

	}
}