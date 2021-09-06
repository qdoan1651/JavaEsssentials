package collections;
/* Reference: 
 * - Beginner Java Programming with Mike McMillan (Chapter 11: ArrayList)
 * - Java Essential Training with David Gassner (Chapter 8: Using Collections)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class ListHandbook {

	public static void main(String[] args) {
		
		// Declare an ArrayList of type integer
		ArrayList<Integer> grades = new ArrayList<>();
		
		// Add element to an ArrayList using add() method
		grades.add(78);
		grades.add(84);
		grades.add(90);
		grades.add(78);
		grades.add(80);
		grades.add(95);
		System.out.println(grades);
		
		// Deleting element from an ArrayList?
		grades.remove(0); // remove by index number
		grades.remove(90); // remove with object 
		
		// Access element of an ArrayList with get() method
		System.out.println(grades.get(3)); // display the value of the 3rd element
		
		// Modify element of an ArrayList with set() method
		grades.set(3,  grades.get(3) + 1); // increment the 3rd element by 1
		
		// Iterate an ArrayList with for loop
		System.out.println("for loop");
		for (int i = 0; i < grades.size(); ++i) {
			System.out.println(grades.get(i));
		}
		
		// Iterate an ArrayList with for(each) loop
		System.out.println("for(each) loop");
		for (int grade : grades) {
			System.out.println(grade);
		}
		
		// Iterate an ArrayList with listIterator()
		System.out.println("listIterator()");
		ListIterator<Integer> listIterator = grades.listIterator();
		while (listIterator.hasNext()) {
			//int value = listIterator.next();
			//System.out.println(value);
			System.out.println(listIterator.next());
		}
		
		// Iterate an ArrayList with iterator()
		// http://crunchify.com/how-to-iterate-through-java-list-4-way-to-iterate-through-loop/
		System.out.println("Iterating an ArrayList with iterator()");
		Iterator<Integer> iterator = grades.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Display ArrayList 'grades'
		display(grades);
	}
	
	public static void main1(String[] args) {
//		sortingArrayList();
//		containsMethod();
	}
	
	public static void display(ArrayList<Integer> al) {
		// Passing ArrayList as method argument
		for (int i = 0; i < al.size(); ++i) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void change(ArrayList<Integer> al, int num) {
		// Reference: 1105 Passing ArrayLists as method arguments (Mike McMillan's Java1)
		for (int i = 0; i < al.size(); ++i) {
			al.set(i, al.get(i) + num);
		}
	}	
	
	public static void containsMethod() {
		// Reference: 1107 Searching an ArrayList (Mike McMillan's Java1)
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random random = new Random();
		
		// Populate ArrayList with random number
		for (int i=0; i<10; i=i+1) {
			int number = random.nextInt(100);
			numbers.add(number);
		}
		display(numbers);
		
		// Using contains() method to check if an item exists in the ArrayList
		if (numbers.contains(50)) {
			System.out.println("50 exists in 'numbers' at index " + numbers.indexOf(50));
		} else {
			System.out.println("50 does not exist in 'numbers'");
		}
	}
	
	public static void sortingArrayList() {
		// Reference: 1108 Sorting an ArrayList (Mike McMillan's Java1)
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random random = new Random();
		
		// Populate ArrayList with random number
		for (int i=0; i<10; i=i+1) {
			int number = random.nextInt(100);
			numbers.add(number);
		}
		display(numbers);
		
		// Sort the ArrayList using Collections.sort() method
		Collections.sort(numbers);
		display(numbers);
	}
}