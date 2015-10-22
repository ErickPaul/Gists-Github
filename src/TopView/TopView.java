package TopView;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TopView{
	public static void main(String[] args){
		Tree head = new Tree(11, new Tree(12, new Tree(14), new Tree(15)), new Tree(13, new Tree(17), new Tree(16, new Tree(18, new Tree(21), new Tree(20, new Tree(22), new Tree(23, new Tree(24), new Tree(25)))), new Tree(19))));
		System.out.println("PreOrder");
		preorder(head);
		System.out.println("PostOrder");
		postorder(head);
		System.out.println("InOrder");
		inorder(head);
		
		Map<Integer, Tree> map = new TreeMap<Integer, Tree>();
		topView(head, map);
	}

	public static int getMinSide(Tree head, Map<Integer, Tree> map, int cur){
		while(head!=null){
			map.put(--cur, head);
			head = head.left;
			getMinSide(head, map, cur);
		}
		return cur;
	}
	public static int getMaxSide(Tree head, Map<Integer, Tree> map, int cur){
		while(head!=null){
			map.put(++cur, head);
			head = head.right;
			getMaxSide(head, map, cur);
		}
		return cur;
	}

	public static void topView(Tree head, Map<Integer, Tree> map){
		map.put(0, head);
		int min = getMinSide(head.left, map, 0);
		int max = getMaxSide(head.right, map, 0);
		for(Map.Entry<Integer, Tree> entry: map.entrySet()){
			System.out.println(entry.getKey() + " - " + entry.getValue().data);
		}
		System.out.println("Min: " + min + " - Max: " + max + "\n\n");
		inOrderTopView(head, map, min, max, 0);
		for(Map.Entry<Integer, Tree> entry: map.entrySet()){
			System.out.println(entry. getKey() + " - " + entry.getValue().data);
		}
	}

	public static void inOrderTopView(Tree head, Map<Integer, Tree> map, int min, int max, int cur){
		if(cur>max || cur<min)
			map.put(cur, head);
		if(head.left!=null)
			inOrderTopView(head.left, map, min, max, cur-1);
		if(head.right!=null)
			inOrderTopView(head.right, map, min, max, cur+1);
	}

	public static void preorder(Tree head){
		System.out.print(head.data + " - ");
		if(head.left!=null)
			preorder(head.left);
		if(head.right!=null)
			preorder(head.right);
	}
	public static void postorder(Tree head){
		if(head.left!=null)
			postorder(head.left);
		if(head.right!=null)
			postorder(head.right);
		System.out.print(head.data + " - ");
	}
	public static void inorder(Tree head){
		if(head.left!=null)
			inorder(head.left);
		System.out.print(head.data + " - ");
		if(head.right!=null)	
			inorder(head.right);
	}
}
