package RoundRobin;

import java.util.Scanner;

public class RoundRobin{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of processes:");
		int proc = input.nextInt();
		int[] arr = new int[proc];
		int[] exec = new int[proc];
	
		for(int i=0; i<proc; i++){
			System.out.println("Enter Arrival time for proc " + (i+1) );
			arr[i] = input.nextInt();
			System.out.println("Enter Execution time for proc " + (i+1));
			exec[i] = input.nextInt();
		}
	
		System.out.println("Enter the Quantum time:");
		int quan = input.nextInt();

		System.out.println("Average Wait time : " + getAverageWait(arr, exec, quan));
	}

	public static double getAverageWait(int[] arr, int[] exec, int quan){
		int[] wait = new int[arr.length];
		int time = 0;
		int currentProc=0;
		int execCount = 0;
		boolean changeProc = false;
		
		while(isCompleted(exec)){
			if(changeProc == true){
				if(getNextProc(currentProc, time, arr, exec)!=-1){
					changeProc = false;
					currentProc = getNextProc(currentProc, time, arr, exec);
				}
			}

			for(int i=0; i<arr.length; i++){
				if(arr[i]<=time){
					if(currentProc==i){
						if(execCount<quan){
							if(exec[i]>0){
								exec[i]--;
								execCount++;
								if(exec[i]==0){
									execCount = 0;
									changeProc = true;
								}
								if(execCount >= quan){
									execCount = 0;
									changeProc = true;
								}
							}
						}/*
						else{ // Add this in above if
							
							//currentProc = getNextProc(currentProc);
						}*/
					}
					else{
						if(exec[i]>0){
							wait[i]++;
						}
					}
				}
			}		
			time++;
		}
		int total=0;
		for(int i=0; i<wait.length; i++){
			total += wait[i];
		}
		double result = (double)total/wait.length;
		return result;
	}

	public static int getNextProc(int currentProc, int time, int[] arr, int[] exec){
		if((currentProc+1) == arr.length){
			currentProc = -1;
		}
		
		for(int i= currentProc+1; i<arr.length; i++){
			
			if(i==arr.length){
				i=0;
			}
			else if(i == currentProc && exec[i]<=0){
				return -1;
			}

			if(arr[i] < time && exec[i]>0){
				return i;
			}
		}
		return -1;
	}

	public static boolean isCompleted(int[] exec){
		for(int value: exec){
			if(value>0){
				return true;
			}
		}
		return false;
	}
}
