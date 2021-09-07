/* Predicate as Parameter - Lambda Expressions in Java 8 - Tutorial 15 (Coding Basics)
 * https://www.youtube.com/watch?v=ybrCxVWyGo8
 */
package lambda;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateAsParameter {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8, 9, 7, 2, 3, 10, 7);

		// Test1: print out numbers that are greater than 5
		System.out.println("Test1: Print out numbers greater than 5.");
		printFilter(numList, (x) -> x>5);
		
		// Test2: predicate = true
		System.out.println("Test2: Predicate = true");
		printFilter(numList, (x) -> true);
		
		// Test3: predicate = false
		System.out.println("Test3: Predicate = false");
		printFilter(numList, (x) -> false);
	}

	public static void printFilter(List<Integer> nums, Predicate<Integer> condition) {
		for (Integer num: nums) {
			if (condition.test(num)) {
				System.out.println(num);
			}
		}
	}
}

