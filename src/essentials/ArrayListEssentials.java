package essentials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEssentials {
	public static void main(String[] args) {
		arrayListInit();
	}
	
	public static void arrayListInit() {
		// Define a new arraylist
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		System.out.println("Nums: " + nums);
		
		// In Java8, do not need to specify the type after new constructor
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(3);
		nums2.add(5);
		nums2.add(7);
		System.out.println("Nums2: " + nums2);
		
		// Shorthand version 
		List<Integer> nums3 = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		System.out.println("Nums3: " + nums3);
		
		// Shorthand version
		List<Integer> nums4 = new ArrayList<Integer>() {
			{
				add(2);
				add(5);
				add(7);
				add(11);
			}
		};
		System.out.println("Nums4: " + nums4);
	}
	
	public static void arraylistCRUD() {
		List<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		System.out.println("Nums: " + nums);
		
		// get element of array list
		System.out.println(nums.get(1));
		
		// update second element
		nums.set(1, nums.get(1) + 3);
		System.out.println("Nums: " + nums);
		
		// delete last element
		nums.remove(nums.indexOf(6));
		System.out.println("Nums: " + nums);
	}
	
	public static void iteratingArrayList() {
		List<Integer> nums = Arrays.asList(2, 3, 4);
		
		// iterating with foreach loop
		for (int num: nums) {
			System.out.println(num);
		}
		
		// iterating with for loop
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		// iterating with while loop and iterator
		Iterator<Integer> i = nums.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void containsMethod() {
		List<Integer> nums = Arrays.asList(2, 3, 4);
		if (nums.contains(3)) {
			System.out.println("Item " + Integer.toString(3) + " found in list");
		}
	}
	
	public static void indexOfMethod() {
		List<Integer> nums = Arrays.asList(2, 3, 4);
		int i = nums.indexOf(3);
		if (i > 0) {
			System.out.println("Found item " + Integer.toString(3) + " at index " 
		                       + Integer.toString(i) + " in list");
		}
	}
	
}
