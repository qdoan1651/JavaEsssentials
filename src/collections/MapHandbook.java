package collections;
/* References:
 * Chapter 8: Using Data Collections (Java Essential Training with David Gassner
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapHandbook {
	// 8.4 Managing unordered data with HashMap
	// 8.5 Looping through collections with iterators
	public static void main(String[] args) {
		general();
	}
	
	public static void general() {
		// Declaration
		HashMap<String, String> map = new HashMap<>();
		
		// Add element to HashMap with put(Object) method
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		// Delete element from a HashMap with remove() method
		if (map.containsKey("Oregon")) {
			map.remove("Oregon");
			System.out.println("After deleting Oregon from the map: " + map);
		} else {
			System.out.println("Oregon does not exist in the map");
		}

		// Use containsValue() to check of certain item is in the keys set
		System.out.println("Sacramento exists in the map? " + map.containsValue("Sacramento"));
		
		// Get size of the collection with size() method
		System.out.println("Number of records: " + map.size());
		
		// Extract all the keys using keySet() method
		Set<String>  keys = map.keySet();
		System.out.println("keySet(): " + keys);
		
		// Iterating a HashMap with foreach loop (Mike McMillan)
		for (String key: keys) {
			System.out.println("The capital of " + key + " is " + map.get(key));
		}
		
		// Iterating over a HashMap with iterator() method
		Iterator<String> i = keys.iterator();
		while (i.hasNext()) {
			String key = i.next();
			System.out.println("The capital of " + key + " is " + map.get(key));
		}
		
		// Iterating a TreeMap with entrySet() (Mike McMillan) - very awkward approach
		Set entries = map.entrySet();
		System.out.println("entrySet(): " + entries); 
		Iterator j = entries.iterator(); // Mike's code does not have () after iterator
		while (j.hasNext()) {
			Map.Entry me = (Map.Entry)j.next();
			System.out.println(me);
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		
		// Clear out the map with the clear() method
		map.clear();
		System.out.println("After clear(): " + map);
		
		// Check to see if HashMap is empty
		System.out.println("Is the map empty? " + map.isEmpty());
		
		// Getting the number of elements in the HashMap with size() method
		System.out.println("There are " + map.size() + " items.");
		
		// TreeMap keys are inorder!
		TreeMap<String, String> map1 = new TreeMap<>();
		map1.put("California", "Sacramento");
		map1.put("Oregon", "Salem");
		map1.put("Washington", "Olympia");
		System.out.println("Using TreeMap class: " + map1);
	}
	
	public static void testing() {
		// HashMap keys are not in order
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
	}
	
	public static void testingRemove() {
		// HashMap keys are not in order
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		map.remove("Washington");
		System.out.println("After deleting Washington: " + map);
		
		// Remove non-exist element (no error message at all)
		map.remove("Washington");  
		System.out.println("After deleting Washington again: " + map);
		
		// This works also!
		map.remove("California", "Sacramento");  
		System.out.println("After deleting California: " + map);
		
		map.clear();
		System.out.println("After clear: " + map);
		
		// Delete from an empty collection (no error message at all)
		map.remove("Oregon");
		System.out.println("After clear and deleting Oregon: " + map);
		
		/* Output:
		 * {Oregon=Salem, California=Sacramento, Washington=Olympia}
		 * After deleting Washington: {Oregon=Salem, California=Sacramento}
		 * After deleting Washington again: {Oregon=Salem, California=Sacramento}
		 * After deleting California: {Oregon=Salem}
		 * After clear: {}
		 * After clear and deleting Oregon: {}
		 */
	}
	
	public static void testingDuplicate() {
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		// Insert identical entry --> map remains the same
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		// Insert entry with key "Washington" and "Tacoma" value
		// New value "Tacoma" replaces "Olympia"
		map.put("Washington", "Tacoma");
		System.out.println(map);
		
		/* Output:
		 * {Oregon=Salem, California=Sacramento, Washington=Olympia}
		 * {Oregon=Salem, California=Sacramento, Washington=Olympia}
		 * {Oregon=Salem, California=Sacramento, Washington=Tacoma}
		 */
	}
	
	public static void testingHashMapVersusTreeMap() {
		// HashMap keys are not in order
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		// TreeMap keys are inorder!
		TreeMap<String, String> map1 = new TreeMap<>();
		map1.put("California", "Sacramento");
		map1.put("Oregon", "Salem");
		map1.put("Washington", "Olympia");
		System.out.println(map1);
		
		/* Output:
		 * {Oregon=Salem, California=Sacramento, Washington=Olympia}
		 * {California=Sacramento, Oregon=Salem, Washington=Olympia} 
		 * */
	}
}
