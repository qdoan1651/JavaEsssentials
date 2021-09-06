package sorting;

import java.util.ArrayList;

public class SortingArrayList {

	public static void main(String[] args) {
		sortArrayListTest();
		
		// in-place sort
		sortArrayList4Test();
	}
	
public static void sortArrayListTest() {
	// Sorting an ArrayList of integers
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(56);
	numbers.add(34);
	numbers.add(45);
	numbers.add(13);
	
	// Display content of array list numbers
	display(numbers);
	
	// Performance selection sorting
	ArrayList<Integer> sorted = sortArrayList(numbers);
	
	// Display content of array list numbers after sorting (which remains unchanged)
	display(numbers);
	
	// Display content of sorted array list
	display(sorted);

}
	
public static void sortArrayList4Test() {
	// Sorting an ArrayList of integers
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(56);
	numbers.add(34);
	numbers.add(45);
	numbers.add(13);
	
	// Display content of array list numbers
	display(numbers);
	
	// Performance in-place sorting which will sort the original array list
	sortArrayList4(numbers);
	
	// Display content of array list numbers after sorting
	display(numbers);

}	

public static ArrayList<Integer> sortArrayList(ArrayList<Integer> al) {
	ArrayList<Integer> copy = new ArrayList<>(al);
	
	for (int i = 0; i < copy.size(); i++) {
		for (int j = i + 1; j < copy.size(); j++) {
			//System.out.println(i + ", " + j);
			if (copy.get(i) > copy.get(j)) {
				int temp = copy.get(i);
				copy.set(i, copy.get(j));
				copy.set(j, temp);
			}
		}
	}
	return copy;
}
	
public static ArrayList<Integer> sortArrayList2(ArrayList<Integer> in) {
	// This sort method will remove the smallest number from each iteration
	ArrayList<Integer> out = new ArrayList<>();
	
	ArrayList<Integer> copy = new ArrayList<>(in);
	
	for (int i = 0; i < in.size(); i++ ) {
		int minIndex = 0;
		for (int j = 1; j < copy.size(); j++) {
			if ( copy.get(j) < copy.get(minIndex)) {
				minIndex = j;
			}
		}
		out.add(copy.get(minIndex));
		copy.remove(minIndex);
	}
	
	return out;
}
	
public static ArrayList<Integer> sortArrayList3(ArrayList<Integer> in) {
	// Similar to sortArrayList2 but using while loop which is more intuitive
	ArrayList<Integer> out = new ArrayList<>();
	
	ArrayList<Integer> copy = new ArrayList<>(in);
	
	while (!copy.isEmpty()) {
		int minIndex = 0;
		for (int i = 1; i < copy.size(); i++) {
			if (copy.get(i) < copy.get(minIndex)) {
				minIndex = i;
			}
		}
		
		out.add(copy.get(minIndex));
		copy.remove(minIndex);
	}
	
	return out;
}
	
public static void sortArrayList4(ArrayList<Integer> in) {
	// This sort method performs in place sorting which the parameter in will be sorted.
	// No need to make copy of the parameter in.
	for (int i = 0; i < in.size(); i++) {
		for (int j = i + 1; j < in.size(); j++) {
			//System.out.println(i + ", " + j);
			if (in.get(i) > in.get(j)) {
				int temp = in.get(i);
				in.set(i, in.get(j));
				in.set(j, temp);
			}
		}
	}	

}
	
public static void display(ArrayList<Integer> in) {
	for (int i = 0; i < in.size() - 1; i++) {
		System.out.print(in.get(i) + ", ");
	}
	System.out.println(in.get(in.size() -1) + ".");
}

}
