package TopView;
public class Tree{
	int data;
	Tree left = null;
	Tree right = null;

	Tree(int data){
		this.data = data;
	}

	Tree(int data, Tree left, Tree right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
