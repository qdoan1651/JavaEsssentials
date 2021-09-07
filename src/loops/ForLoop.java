package loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
//		searching();
		String[] names = {"Anna", "Joe", "Mike"};
		for (String name: names) {
			System.out.println(name);
		}
	}
	
	public static void foreachLoop() {
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 3, 5, 6, 14, 16);
		for (int n: nums) {
			System.out.println(n);
		}
		
		List<String> words = Arrays.asList("Hello", "World");
		for (String w: words) {
			System.out.println(w);
		}
		
		String[] names = {"Anna", "Joe", "Mike"};
		for (String name: names) {
			System.out.println(name);
		}
	}
	
	public static void forLoop() {
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}
	
	public static void whileLoop() {
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		int i = 0;
		while (i < nums.size()) {
			System.out.println(nums.get(i));
			i++;
		}
	}
	
	public static void searching() {
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		int searchNumber = 6;
		Boolean found = false;
		for (int n: nums) {
			if (n == searchNumber) {
				found = true;
				break;
			}
		}
		System.out.println("Item " + Integer.toString(searchNumber) + " found in list");
	}
	
	public static void continueSample() {
		// Get even elements from list
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		List<Integer> evenNums = new ArrayList<>();
		for (int n: nums) {
			if (n%2 == 0) {
				evenNums.add(n);
			}
		}
	}
	
	public static void others() {
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
