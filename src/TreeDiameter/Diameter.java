package TreeDiameter;
public class Diameter{

	public static void main(String[] args){
	
		Tree head = new Tree(1, new Tree(2, new Tree(), new Tree()), new Tree(3, new Tree(), new Tree(4, new Tree(), new Tree())));

		int leftCount = 0;
		int rightCount = 0;

		if(head.left!=null)
			leftCount = getDiameter(head.left);

		if(head.right!=null)
			rightCount = getDiameter(head.right);

		System.out.println("Diameter of the tree is: " + (leftCount + rightCount + 1)); 
	}

	public static int getDiameter(Tree head){
		int leftCount; 
		int rightCount;

		if(head.left!=null)
			leftCount = getDiameter(head.left);
		else
			leftCount = 1;

		if(head.right!=null)
			rightCount = getDiameter(head.right);
		else
			rightCount = 1;
		
		if(leftCount>rightCount)
			return leftCount;
		else
			return rightCount;
	}
}
