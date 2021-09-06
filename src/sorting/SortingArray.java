package sorting;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.javafx.collections.SortableList;

public class SortingArray {
	public static void main(String[] args) {
		//sortArrayIntegersTest();
		//builtinArraySortString();
		//builtinArraySortIntegers();
		//sortBubbleTest();
		isInOrderTest();
	}
	
	public static void builtinArraySortString() {
		// Advanced Java Programming by Mike McMillan (Lesson 0404)
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
		
		// Display array intNumbers
		for (int n: intNumbers) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// Sort with Arrays.sort() method which performs in-place sort.
		Arrays.sort(intNumbers);
		
		// Display array intNumbers
		for (int n: intNumbers) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static void sortArrayIntegersTest() {
		
		int[] intNumbers = {56, 34, 45, 13};
		
		// Display array intNumbers
		display(intNumbers);
		
		// Sort the array intNumbers and return array sorted
		int[] sortedNumbers = sortArrayIntegers(intNumbers);
		
		// Display sorted array sortedNumbers
		display(sortedNumbers);
		
		/* Testing of in-placed selection sort. The array intNumbers will be sorted */
		sortArrayIntegers2(intNumbers);
		
		// Display array intNumbers (after sorting)
		display(intNumbers);
	}
	
public static void sortBubbleTest() {
	
	int[] intNumbers = {56, 34, 45, 13};
	
	// Display array intNumbers
	display(intNumbers);
	
	// Perform in-place bubble sort on the array intNumbers
	sortBubble(intNumbers);
	
	// Display array intNumbers (after sorting)
	display(intNumbers);
}

public static void sortBubble(int[] in) {
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
	
public static int[] sortArrayIntegers(int[] in) {
	/* This method performs selection sort on the array 'in'
	   and returns an array of sorted numbers */
	int[] out = new int[in.length];
	
	// Need to copy array 'in' to array 'copy' before sorting
	for (int i = 0; i < in.length; i++) {
		out[i] = in[i];
	}
	
	// Performing selection sort on array 'out'
	for (int i = 0; i <  out.length; i ++) {
		for (int j = i + 1; j < in.length; j++) {
			//System.out.println(i + ", " + j);
			if (out[i] > out[j]) {
				int temp = out[i];
				out[i] = out[j];
				out[j] = temp;
			}
		}
	}
	
	return out;
}
	
public static void sortArrayIntegers2(int[] in) {
	/* This method performs the selection sort in place. The array 'in'
	   will be sorted.  No need to make copy of the array. */
	for (int i = 0; i <  in.length; i ++) {
		for (int j = i + 1; j < in.length; j++) {
			//System.out.println(i + ", " + j);
			if (in[i] > in[j]) {
				int temp = in[i];
				in[i] = in[j];
				in[j] = temp;
			}
		}
	}
}

public static void isInOrderTest() {
	
	int[] intNumbers = {13, 34, 33, 56};
	
	// Display array intNumbers
	display(intNumbers);

	System.out.println(isInOrder(intNumbers));
}
public static boolean isInOrder(int[] in) {
	for (int i = 0; i < in.length - 1; i++) {
		System.out.println(in[i] + ", " + in[i+1]);
		if (in[i] > in[i+1]) {
			return false;
		}
	}
	return true;
}

public static void display(int[] in) {
	for (int i = 0; i < in.length - 1; i++) {
		System.out.print(in[i] + ", ");
	}
	System.out.println(in[in.length - 1] + ".");
}
}
