/*List Statistics - Lambda Expressions In Java 8: Tutorial 10
 * https://www.youtube.com/watch?v=T4nHJYX19mA
 */
package lambda;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Arrays;

public class ListStatistics {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		
		System.out.println("Non-lambda");
		Integer max = null;
		Integer min = null;
		int sum = 0;
		for (Integer i: nums) {
			if (max == null) {
				max = i;
				min = i;
			} else if (max < i) {
				max = i;
			} else if (min > i) {
				min = i;
			}
			sum += i;
		}
		float average = (float) sum/nums.size();
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + average);
		
		System.out.println("\nLambda");
		IntSummaryStatistics stats = nums.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Max: " + stats.getMax());
		System.out.println("Min: " + stats.getMin());
		System.out.println("Sum: " + stats.getSum());
		System.out.println("Avg: " + stats.getAverage());
	}
}

