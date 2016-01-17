import java.util.*;

class AnimalNode{
	int data;
	int type;
	AnimalNode prev;
	AnimalNode prevType;

	public AnimalNode(int data, int type){
		this.data = data;
		this.type = type;
	}

	public AnimalNode(int data, int type, AnimalNode prev, AnimalNode prevType){
		this.data = data;
		this.type = type;
		this.prev = prev;
		this.prevType = prevType;
	}	
}

public class AnimalShelter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		AnimalNode head = null;
		AnimalNode tail = null;
		AnimalNode cHead = null;
		AnimalNode dHead = null;
		AnimalNode cTail = null;
		AnimalNode dTail = null;

		int dec = 0;
		do{
			System.out.println("Add New Animal(1) - Remove Oldest(2) - Remove Oldest Type(3) - Exit(0)");
			dec = input.nextInt();
			if(dec==1){
				System.out.println("Enter the value");
				int val = input.nextInt();
				System.out.println("Enter the type: Dog(1) - Cat(2)");
				int type = input.nextInt();

				if(head==null){
					head = new AnimalNode(val, type);
					tail = head;
					if(type==1){
						dHead = head;
						dTail = head;
					}
					else{
						cHead = head;
						cTail = head;
					}
				}
				else{
					AnimalNode temp = new AnimalNode(val, type);
					head.prev = temp;

					if(temp.type==1){
						if(dTail!=null){
							dTail.prevType = temp;
							dTail = temp;
						}
						else{
							dTail = temp;
						}
					}
					else{
						if(cTail!=null){
							cTail.prevType = temp;
							cTail = temp;
						}
						else{
							cTail = temp;
						}
					}

					head = head.prev;
				}
			}
			else if(dec==2){
				if(tail!=null){

					System.out.println("Animal you will get is: " + tail.data + " of type " + tail.type);
					tail = tail.prev;

					if(tail.type==1){
						dHead = dHead.prevType;
					}
					else{
						cHead = cHead.prevType;
					}
				}
			}
			else if(dec==3){
				System.out.println("Enter the type you want: ");
				int reqType = input.nextInt();
				if(reqType==1){
					System.out.println("Animal you will get is: " + dHead.data + " of type " + dHead.type);
					dHead = dHead.prev;
				}
				else{
					System.out.println("Animal you will get is: " + cHead.data + " of type " + cHead.type);
					cHead = cHead.prev;
				}
			}


		}while(dec!=0);
	}
}