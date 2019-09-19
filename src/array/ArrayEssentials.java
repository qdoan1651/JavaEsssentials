package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayEssentials {
	
	public static void arrayInitialization() {
		// Define an array of five elements of integer type
		int[] odds = new int[5];
		
		// Assigning value to array elements
		odds[0] = 1;
		odds[1] = 3;
		odds[2] = 5;
		odds[3] = 7;
		odds[4] = 9; 
		
		// Shorthand version to initialize an array of five integers
		int[] evens = {2, 4, 6, 8, 10};
		
		int[] evens3 = new int[] {2, 4, 6, 8, 10};
		
		/* https://www.tutorialspoint.com/java/util/arrays_sort_int.htm
		 * Placement of the square brackets is after variable instead of int???
		 */
		int nums[] = {2, 1, 9, 6, 4};
		
		String names[] = new String[]{"Tom", "Kim", "Nick", "Alice"};
		
		// Display array with Arrays.toString() method
		System.out.println(Arrays.toString(nums));
	}
	
	/*
	 * Searching an array
	 */
	public static void arraySearch() {
		int[] evens = {2, 4, 6, 8, 10};
		
		int searchNumber = 11;
		boolean found = false;
		for (int i=0; i < evens.length; i++) {
			if (evens[i] == searchNumber) {
				System.out.println("Number " + searchNumber + " found at index " + i);
				break;
			}
		}
		if (! found) {
			System.out.println("Number " + searchNumber + " not found in array.");
		}
	}
	
	
	/* java.util.Arrays.sort() Method
	 * https://www.tutorialspoint.com/java/util/arrays_sort_int.htm
	 * https://www.tutorialspoint.com/java/util/arrays_sort_int_index.htm
	 */
	public static void arraySortMethod() {
		// Define an array of integers
		int[] arr1 = {2, 1, 9, 6, 4};
		
		// Sorting the array with sort() method
		Arrays.sort(arr1); // [1, 2, 4, 6, 9]
		
		// Sort array from index 2 to 4 
		int[] arr2 = {2, 1, 9, 6, 4};
		Arrays.sort(arr2, 2, 4); // [2, 1, 6, 9, 4]
		
		System.out.println(Arrays.toString(arr2));
	}
	
	/*
	 * https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
	 */
	public static void reverseSort() {
		// Sorting in reverse order
		int[] nums = {13, 7, 6, 45, 21, 9, 2, 100};
//		Arrays.sort(nums, Collections.reverseOrder()); // compile error?
		Integer[] nums2 = {13, 7, 6, 45, 21, 9, 2, 100}; 
		Arrays.sort(nums2, Collections.reverseOrder()); // [100, 45, 21, 13, 9, 7, 6, 2]
		
		System.out.println(Arrays.toString(nums2));
	}
	
	/* java.util.Arrays.copyOf() Method
	 * https://www.tutorialspoint.com/java/util/arrays_copyof_double.htm
	 */
	public static void copyOfMethod() {
		// Defining new array of doubles
		double[] arr1 = new double[] {12.5, 3.2, 37.5};
		
		// Copy to arr2 with copyOf() method
		double[] arr2 = Arrays.copyOf(arr1, arr1.length); // [12.5, 3.2, 37.5]
		
		// truncating if size of new array is shorter
		double[] arr3 = Arrays.copyOf(arr1, 2); // [12.5, 3.2]
		
		// zero padded if size of new array is larger
		double[] arr4 = Arrays.copyOf(arr1, 4); // [12.5, 3.2, 37.5, 0.0]
		
		System.out.println(Arrays.toString(arr2));
	}
	
	/* java.util.Arrays.copyOfRange(int[], int, int) 
	 * https://www.tutorialspoint.com/java/util/arrays_copyofrange_int.htm
	 */
	public static void copyOfRangeMethod() {
		// Defining new array of integers
		int[] arr1 = new int[] {5, 62, 15, 31, 92};
		
		// Copying array with copyOfRange() method 
	    int[] arr2 = Arrays.copyOfRange(arr1, 1, 4); // [62, 15, 31]
	    int[] arr3 = Arrays.copyOfRange(arr1, 2, 6); // [15, 31, 92, 0]
	    
	    System.out.println(Arrays.toString(arr3)); 
	}
	
	/* How to Copy an Array to ArrayList in Java
	 * https://beginnersbook.com/2013/12/how-to-convert-array-to-arraylist-in-java/
	 */ 
	public static void copyArrayToArrayList() {
		String arr[]={"Hi", "Hello", "Howdy", "Bye"};
		
		// Define array list
		List<String> arrList= new ArrayList<String>();
		
		// Copy to array list using Collections.addAll() method
		Collections.addAll(arrList, arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
//		arrayInitialization();
//		copyArrayToArrayList();
//		reverseSort();
		arraySearch();
	}

}
