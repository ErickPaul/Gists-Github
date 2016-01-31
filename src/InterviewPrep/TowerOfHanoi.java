public class TowerOfHanoi{
	public static void main(String[] args){
		getHanoi(4, 'A', 'B', 'C');
	}

	public static void getHanoi(int n, char source, char destination, char auxiliary){
		if(n==1){
			System.out.println(source + " -> " + destination);
		}
		else if (n>1) {
			getHanoi(n-1, source, auxiliary, destination);
			getHanoi(1, source, destination, auxiliary);
			getHanoi(n-1, auxiliary, destination, source);
		}
	}
}