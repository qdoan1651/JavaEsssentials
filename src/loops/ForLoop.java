package loops;

public class ForLoop {

	public static void main(String[] args) {
		for (int i=0; i<=3; i++) { //This loop will be executed 4 times
			System.out.println("Value Of Variable i is " +i);
		}
		  
		System.out.println("");
		int i=0;
		int k = 200;
		for (int j=3; j>=i; j--) { //This loop will be executed 4 times
			System.out.println("Value Of Variable j is " +j);
			k = k-10;
		}
		System.out.println("");
		System.out.println("Value Of Variable k is " +k);
	}
}
