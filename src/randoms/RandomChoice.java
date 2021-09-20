package randoms;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomChoice {

	public static void main(String[] args) {
		randomChoiceArrayList();
	}
	
	public static void randomChoiceArray() {
		Random rand = new Random();

		// Select a random item from an array
		int[] numbers = {1, 2, 3, 4, 5};
		for (int i=0; i<5; i++) {
			int index = rand.nextInt(numbers.length);
			System.out.println(numbers[index]);
		}
	}
	
	public static void randomChoiceArrayList() {
		Random rand = new Random();

		// Select a random item from an arraylist
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		for (int i=0; i<5; i++) {
			int index = rand.nextInt(nums.size());
			System.out.println(nums.get(index));
		}
	}
}
