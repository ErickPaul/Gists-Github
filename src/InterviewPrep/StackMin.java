import java.util.*;

public class StackMin{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> topPos = new Stack<Integer>();
		Stack<Integer> topVal = new Stack<Integer>();

		int top = -1;
		int min = Integer.MAX_VALUE;
		do{

			System.out.println("What do you want? Push(1) or Pop(2)");
			int decision = input.nextInt();

			if(decision==1){
				System.out.println("Enter number :");
				int num = input.nextInt();
				stack.push(num);
				top++;

				if(num<min){
					min = num;
					topPos.push(top);
					topVal.push(num);
				}
			}
			else{
				top--;
				int num = stack.pop();
				int topp = topPos.pop();
				if(topp<top){
					topPos.pop();
					topVal.pop();
					min = topVal.pop();
					topVal.push(min);
				}else{
					topPos.push(topp);
				}
			}
			
			System.out.println("Min value: " + min);
		}while(top!=-1);
	}
}