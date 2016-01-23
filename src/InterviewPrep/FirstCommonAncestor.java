import java.util.*;

class AncestorTree{
	int data;
	AncestorTree left;
	AncestorTree right;

	public AncestorTree(int data){
		this.data = data;
	}

	public AncestorTree(int data, AncestorTree left, AncestorTree right){
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public String toString(){
		return String.valueOf(data);
	}
}


public class FirstCommonAncestor{

	public static Stack<AncestorTree> stack1 = new Stack<AncestorTree>();
	public static Stack<AncestorTree> stack2 = new Stack<AncestorTree>();
	public static boolean found1 = false;
	public static boolean found2 = false;

	public static void main(String[] args){

		AncestorTree tree = new AncestorTree(20, new AncestorTree(10, new AncestorTree(5, new AncestorTree(3), new AncestorTree(7)), new AncestorTree(15, new AncestorTree(14), new AncestorTree(17))), new AncestorTree(30));
		leftInOrder(tree, 7 );
		rightInOrder(tree, 17);

		System.out.println(stack1);
		System.out.println(stack2);

		if(stack1.size()>stack2.size()){
			int diff = stack1.size() - stack2.size();
			for(int i=0; i<diff; i++){
				stack1.pop();
			}
		}
		else if(stack2.size() > stack1.size()){
			int diff = stack2.size() - stack1.size();
			for(int i=0; i<diff; i++){
				stack2.pop();
			}
		}

		while(!stack1.empty()){
			int val1 = stack1.pop().data;
			int val2 = stack2.pop().data;

			if(val1 == val2){
				System.out.println("Answer is : " + val1);
				break;
			}
		}
	}

	public static void leftInOrder(AncestorTree tree, int num1){
		if(tree!=null && !found1){
			
			stack1.push(tree);
			if(tree.data == num1){
				found1 = true;
			}
			else{
				leftInOrder(tree.left, num1);
				leftInOrder(tree.right, num1);
			}	
			if(!found1){
				stack1.pop();
			}
		}
	}

	public static void rightInOrder(AncestorTree tree, int num1){
		if(tree!=null && !found2){
			
			stack2.push(tree);
			if(tree.data == num1){
				found2 = true;
			}
			else{
				rightInOrder(tree.left, num1);
				rightInOrder(tree.right, num1);
			}	
			if(!found2){
				stack2.pop();
			}
		}
	}
}