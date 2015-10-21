package TreeDiameter;
public class Tree{
	int data;
	Tree left=null;
	Tree right=null;

	Tree(){
		this.data = 0;
		left = null;
		right = null;
	}
	
	Tree(int data, Tree t1, Tree t2){
		this.data = data;
		left = t1;
		right = t2;
	}
}
