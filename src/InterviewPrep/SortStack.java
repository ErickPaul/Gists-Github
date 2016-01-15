import java.util.*;

public class SortStack{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Stack<Integer> mainStack = new Stack<Integer>();
		Stack<Integer> tempStack = new Stack<Integer>();

		int dec = 0;
		do{
			System.out.println("Push(1) or Pop(2) or Exit(0)");
			dec = input.nextInt();

			if(dec == 1){

				System.out.println("Enter the number:");
				int num = input.nextInt();

				if(mainStack.empty()){
					mainStack.push(num);
				}
				else{
					while((!mainStack.empty()) && mainStack.peek()<num){
						tempStack.push(mainStack.pop());
					}
					mainStack.push(num);
					while(!tempStack.empty()){
						mainStack.push(tempStack.pop());
					}
				}
			}
			else if(dec == 2){
				mainStack.pop();
			}

			System.out.println(mainStack);
		}while(dec!=0);
	}
}