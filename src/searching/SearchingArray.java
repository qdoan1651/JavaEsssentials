package searching;

public class SearchingArray {

	public static void main(String[] args) {
		//findSmallestTest();
		indexOfTest();
	}
	
	public static int findSmallest(int[] in) {
		// This method searches the array sequentially and returns the smallest integer
		int out = in[0];
		for (int i = 1; i < in.length; i++) {
			if (in[i] < out) {
				out = in[i];
			}
		}
		
		return out;
	}
	
	public static void findSmallestTest() {
		
		int[] intNumbers = {56, 34, 45, 13, 33};
		
		// Display array content
		display(intNumbers);
		
		int found = findSmallest(intNumbers);
		System.out.println("Smallest integer found: " + found);
	}
	
	public static int indexOf(int[] in, int num) {
		// This method will return the index of the number num. Otherwise, returns -1
		
		for (int i = 0; i < in.length; i++) {
			if (num == in[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void indexOfTest() {
		int[] intNumbers = {56, 34, 45, 13, 33};
		
		// Display array content
		display(intNumbers);
		
		// Searching and displaying result
		int index = indexOf(intNumbers, 0);
		if (index != -1) {
			System.out.println("Number found at index: " + index);
		} else {
			System.out.println("Number not found!");
		}
		
	}
	
	public static void display(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			System.out.print(list[i] + ", ");
		}
		System.out.println(list[list.length - 1] + ".");
	}

}
