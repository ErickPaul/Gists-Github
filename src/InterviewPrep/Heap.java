class HeapNode{
	int data;
	HeapNode left;
	HeapNode right;

	public HeapNode(int data){
		this.data = data;
	}

	public HeapNode(int data, HeapNode left, HeapNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class Heap{
	public static void main(String[] args){
		HeapNode heap = new HeapNode(1, new HeapNode(16, new HeapNode(30, new HeapNode(2), new HeapNode(57)), new HeapNode(27, new HeapNode(3), new HeapNode(90))), new HeapNode(5, new HeapNode(17), new HeapNode(20)));
		HeapNode heap1 = new HeapNode(1, new HeapNode(16, new HeapNode(30, new HeapNode(2), new HeapNode(57)), new HeapNode(27, new HeapNode(3), new HeapNode(90))), new HeapNode(5, new HeapNode(17), new HeapNode(20)));
		System.out.println("Max Heap");
		maxHeapify(heap);
		printHeap(heap);

		System.out.println("Min Heap");
		minHeapify(heap1);
		printHeap(heap1);
	}	

	public static void printHeap(HeapNode heap){
		if(heap!=null){
			System.out.println(heap.data);
			printHeap(heap.left);
			printHeap(heap.right);
		}
	}

	public static HeapNode minHeapify(HeapNode heap){
		if(heap!=null){

			minHeapify(heap.left);
			minHeapify(heap.right);

			if(heap.left!=null && heap.right!=null){
				if(heap.left.data<heap.right.data && heap.left.data<heap.data){
					int temp = heap.data;
					heap.data = heap.left.data;
					heap.left.data = temp;
					minHeapify(heap.left);
				}
				else if(heap.left.data>heap.right.data && heap.right.data<heap.data){
					int temp = heap.data;
					heap.data = heap.right.data;
					heap.right.data = temp;
					minHeapify(heap.right);
				}
			}
			else if(heap.left!=null || heap.right!=null){
				if(heap.left!=null && heap.left.data<heap.data){
					int temp = heap.data;
					heap.data = heap.left.data;
					heap.left.data = temp;
					minHeapify(heap.left);
				}
				else if(heap.right!=null && heap.right.data<heap.data){
					int temp = heap.data;
					heap.data = heap.right.data;
					heap.right.data = temp;
					minHeapify(heap.right);
				}
			}
		}

		return heap;
	}

	public static HeapNode maxHeapify(HeapNode heap){
		if(heap!=null){

			maxHeapify(heap.left);
			maxHeapify(heap.right);

			if(heap.left!=null && heap.right!=null){
				if(heap.left.data>heap.right.data && heap.left.data>heap.data){
					int temp = heap.data;
					heap.data = heap.left.data;
					heap.left.data = temp;
					maxHeapify(heap.left);
				}
				else if(heap.left.data<heap.right.data && heap.right.data>heap.data){
					int temp = heap.data;
					heap.data = heap.right.data;
					heap.right.data = temp;
					maxHeapify(heap.right);
				}
			}
			else if(heap.left!=null || heap.right!=null){
				if(heap.left!=null && heap.left.data>heap.data){
					int temp = heap.data;
					heap.data = heap.left.data;
					heap.left.data = temp;
					maxHeapify(heap.left);
				}
				else if(heap.right!=null && heap.right.data>heap.data){
					int temp = heap.data;
					heap.data = heap.right.data;
					heap.right.data = temp;
					maxHeapify(heap.right);
				}
			}
		}

		return heap;
	}
}