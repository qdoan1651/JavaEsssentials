package array;

import java.util.Arrays;

//import com.sun.javafx.collections.SortableList;

public class ArraySort {
	/* Advanced Java Programming by Mike McMillan (Lesson 0404)
	 * Lesson: 4. Associative Collections - Exercise (sort() method was used in exercise) 
	 */
	public static void builtinArraySortString() {
		String text = "Either the well was very deep or she fell very slowly "
				+ "for she had plenty of time as she went down to look about"
				+ "her and to what was going to happen next First";
		String[] words = text.split(" ");
		
		// Sorting an array with Arrays.sort() method which performs a in-placed sort.
		Arrays.sort(words);
		
		// Iteration over an array with for(each) loop
		for (String word: words) {
			System.out.println(word);
		}
	}
	
	public static void builtinArraySortIntegers() {
		int[] intNumbers = {56, 34, 45, 13};
		System.out.println(Arrays.toString(intNumbers));
		
		// Sort with Arrays.sort() method which performs in-place sort.
		Arrays.sort(intNumbers);
		
		// Display array after sorting
		System.out.println(Arrays.toString(intNumbers));
	}
	
	/*
	 * Perform in-place sorting with bubble sort 
	 */
	public static void bubbleSort(int[] in) {
		for (int i = 1; i < in.length; i++) {
			for (int j = 0; j < in.length - i; j++) {
				//System.out.println(j + ", " + i);
				int num1 = in[j];
				int num2 = in[j+1];
				if (num1 > num2) {
					in[j] = num2;
					in[j+1] = num1;
				}
			}
		}
	}
	
	/* Performs selection sort on a copy of the array
	 * and returns the sorted array. 
	 */
	public static int[] selectionSort(int[] nums) {
		
		int[] sorted = Arrays.copyOf(nums, nums.length);
		
		// Performing selection sort on array 'out'
		for (int i = 0; i <  sorted.length; i ++) {
			for (int j = i + 1; j < nums.length; j++) {
				//System.out.println(i + ", " + j);
				if (sorted[i] > sorted[j]) {
					int temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
				}
			}
		}
		
		return sorted;
	}
	
	/* Perform the selection sort on the array nums itself (in-place sort)
	 * No need to return since the original array is sorted 
	 */
	public static void selectionSort2(int[] nums) {
		for (int i = 0; i <  nums.length; i ++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	/*
	 * Check to see if array is in ascending order.
	 */
	public static boolean isInOrder(int[] in) {
		for (int i = 0; i < in.length - 1; i++) {
			if (in[i] > in[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void sortArrayTest() {
		int[] intNumbers = {56, 34, 45, 13};
		
		// Display array intNumbers
		System.out.println(Arrays.toString(intNumbers));
		
		// Sort the array intNumbers and return array sorted
		int[] sortedNumbers = selectionSort(intNumbers);
		
		// Display sorted array sortedNumbers
		System.out.println(Arrays.toString(sortedNumbers));
		
	}
	
	public static void main(String[] args) {
		sortArrayTest();
	}
	

	
}
