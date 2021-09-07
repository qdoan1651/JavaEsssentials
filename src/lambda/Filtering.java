/* Filtering - Lambda Expressions In Java 8: Tutorial 3 (Coding Basics)
 * https://www.youtube.com/watch?v=bWancbLvluo
 */
package lambda;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class Filtering {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(3); nums.add(2); nums.add(10);
		
		// Java 6, 7
		List<Integer> filtered = new ArrayList<Integer>();
		for (int i: nums) {
			if (i%2 == 0) {
				filtered.add(i);
			}
		}
		System.out.println(filtered);
		
		// Using filter function with lambda (new in Java 8)
		List<Integer> filtered2 = nums.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println(filtered2);
		
		// Using Predicate
		Predicate<Integer> even = (x) -> (x%2 == 0);
		List<Integer> filtered3 = nums.stream().filter(even).collect(Collectors.toList());
		System.out.println(filtered3);
	}
}

