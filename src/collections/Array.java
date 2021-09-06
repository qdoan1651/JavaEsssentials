package collections;

import java.util.Random;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		tutPlus();
	}
	// TutPlus Programming with Java 301
	public static void tutPlus() {
		// Searching an array (Lesson 04)
		String[] toys = {"Bike", "Pogo Stick", "Yoyo", "Action Figure"};
		int result = searchArray(toys, "yoyo");
		if (result == -1) {
			System.out.println("No match found");
		} else {
			System.out.println("Result: " + result);
		}
		
		// Filling an array (Lesson 05)
		Random rand = new Random(System.currentTimeMillis());
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = rand.nextInt(101);
		}
		System.out.println(Arrays.toString(numbers));
		
		// Sorting an array (Lesson 06)
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		// Finding minimum/maximum value of an array (Lesson 07)
		int currentMin = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < currentMin) {
				currentMin = numbers[i];
			}
		}
		System.out.println("Mininum value is: " + currentMin);
	}
	
	// Searching an array (Lesson 04)
	public static int searchArray(String[] arr, String searchString) {
		// Returns the index of the matched object, otherwise -1
		int match = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(searchString)) {
				match = i;
				break;
			}
		}
		return match;
	}
	

}
