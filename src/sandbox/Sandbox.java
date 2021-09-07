package sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandbox {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 3, 5, 6, 14, 16);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
//		Integer max = null;
//		Integer min = null;
//		int sum = 0;
//		for (Integer i: nums) {
//			if (max == null) {
//				max = i;
//				min = i;
//			} else if (max < i) {
//				max = i;
//			} else if (min > i) {
//				min = i;
//			}
//			sum += i;
//		}
//		float average = (float) sum/nums.size();
//		System.out.println("Max: " + max);
//		System.out.println("Min: " + min);
//		System.out.println("Sum: " + sum);
//		System.out.println("Avg: " + average);
		
		
	}
}
