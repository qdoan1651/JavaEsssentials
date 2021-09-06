package collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class SetHandbook {
	public static void main(String[] args) {
//		general();
//		toArrayDemo();
//		addAllDemo();
		demoTreeSet();
	}
	
	public static void general() {
		// Declaration
		Set<Integer> numbers = new HashSet<>();
		
		// Add element to the set with the add(Element) method
		int count[] = {34, 22, 10, 60, 30, 22};
		for (int i=0; i<count.length; i++) {
			numbers.add(count[i]); 
		}
		System.out.println(numbers); // [34, 22, 10, 60, 30]
		System.out.println("The size of the set is: " + numbers.size());
		System.out.println("Is the element 10 in the set: " + numbers.contains(10));
		
		// Remove element from the set with the remove(Object) method
		numbers.remove(10);
		System.out.println(numbers); // [34, 22, 60, 30]

		// Access element from the set
		
		// Iteration with foreach loop
		System.out.println("Iteration with foreach loop:");
		for (int number: numbers) {
			System.out.println(number);
		}
		
		// Iteration with iterator
		System.out.println("Iteration with iterator:");
		Iterator<Integer> iter = numbers.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Delete all element from set with the clear() method
		numbers.clear();
		System.out.println("After clearing the set 'numbers':" + numbers);
		
		// Checking to see if the set is empty with the isEmpty() method
		System.out.println("Is the set 'numbers'empty? " + numbers.isEmpty());
		
		// Other methods (http://docs.oracle.com/javase/7/docs/api/java/util/Set.html)
		// containsAll(Collection)
		// equals(Object)
		// removeAll(Collection)
		// retainAll(Collection)
		
	}
	
	public static void demoTreeSet() {
		Set<Integer> numbers = new HashSet<>();
		int count[] = {34, 22, 10, 60, 30, 22};
		for (int i=0; i<count.length; i++) {
			numbers.add(count[i]); 
		}
		System.out.println("HashSet numbers: " + numbers);
		
		// TreeSet is an ordered set
		TreeSet<Integer> sortedSet = new TreeSet<>(numbers);
		System.out.println("TreeSet sortedSet: " + sortedSet); // [10, 22, 30, 34, 60]
		
		// first() and last() only available in TreeSet class
		System.out.println("The first element is: " + sortedSet.first()); // 10
		System.out.println("The last element is: " + sortedSet.last());  // 60
		
		/* Output:
		 * HashSet numbers: [34, 22, 10, 60, 30]
		 * TreeSet sortedSet: [10, 22, 30, 34, 60]
		 * The first element is: 10
		 * The last element is: 60
		 */
	}
	
	public static void addAllDemo() {
		Set<Integer> numbers = new HashSet<>();
		int count[] = {34, 22, 10, 60, 30, 22};
		for (int i=0; i<count.length; i++) {
			numbers.add(count[i]); 
		}
		System.out.println(numbers);
		
		Set<Integer> numbers2 = new HashSet<>();
		int count2[] = {34, 67, 75, 60};
		for (int i=0; i<count2.length; i++) {
			numbers2.add(count2[i]); 
		}
		System.out.println(numbers2);
		
		// addAll()
		numbers.addAll(numbers2);
		System.out.println(numbers);
		
		/* Output:
		 * [34, 22, 10, 60, 30]
		 * [34, 67, 75, 60]
		 * [34, 67, 22, 10, 75, 60, 30]
		 */
	}
	
	public static void toArrayDemo() {
		Set<Integer> numbers = new HashSet<>();
		int count[] = {34, 22, 10, 60, 30, 22};
		for (int i=0; i<count.length; i++) {
			numbers.add(count[i]); 
		}
		// toArray()
		Integer[] numarr = numbers.toArray(new Integer[numbers.size()]);
		for (int i=0; i< numarr.length; i++) {
			System.out.println(numarr[i]);
		}
	}
	
} 
