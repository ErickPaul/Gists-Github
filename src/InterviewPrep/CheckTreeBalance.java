class TreeBalanceNode{
	int data; 
	TreeBalanceNode left;
	TreeBalanceNode right;

	public TreeBalanceNode(int data){
		this.data = data;
	}
	public TreeBalanceNode(int data, TreeBalanceNode left, TreeBalanceNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class CheckTreeBalance{
	public static void main(String[] args){
		TreeBalanceNode tree = new TreeBalanceNode(1, new TreeBalanceNode(2, new TreeBalanceNode(3), new TreeBalanceNode(4)), new TreeBalanceNode(5, new TreeBalanceNode(6), new TreeBalanceNode(7, new TreeBalanceNode(8), new TreeBalanceNode(9, new TreeBalanceNode(10), new TreeBalanceNode(11)))));
		//TreeBalanceNode tree = new TreeBalanceNode(1, new TreeBalanceNode(2, new TreeBalanceNode(3), new TreeBalanceNode(4)), new TreeBalanceNode(5, new TreeBalanceNode(6), new TreeBalanceNode(7, new TreeBalanceNode(8), new TreeBalanceNode(9))));
		int result = isBalanced(tree, 0);

		if(result>1){
			System.out.println("It is NOT a balanced tree " + result);
		}
		else{
			System.out.println("It is a balanced tree " + result);
		}
	}

	public static int isBalanced(TreeBalanceNode tree, int height){
		int lHeight = height;
		int rHeight = height;

		if(tree.left!=null){
			lHeight = isBalanced(tree.left, height+1);
		}

		if(tree.right!=null){
			rHeight = isBalanced(tree.right, height+1);
		}

		if(height==0){
			int result = lHeight>rHeight? lHeight - rHeight : rHeight - lHeight;
			return result;
		}
		else{
			int result = lHeight>rHeight? lHeight : rHeight;
			return result;
		}
	}
}