package essentials;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Dictionary {

	public static void main(String[] args) {
		searchDictionary();
	}
	
	public static void iteratingDictionary() {
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		
		// Iterating dictionary
		Set<String> keys = map.keySet();
		Iterator<String> i = keys.iterator();
		while (i.hasNext()) {
			String state = i.next();
			String capital = map.get(state);
			System.out.println("Capital of " + state + " is " + capital);
		}
	}
	
	public static void updateDictionaryElement() {
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Portland");
		map.put("Washington", "Olympia");
		
		// correct capital of Oregon to Salem
		map.put("Oregon", "Salem");
	}
	
	public static void deleteDictionaryElement() {
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		
		// Deleting dictionary elements
		if (map.containsKey("Oregon")) {
			map.remove("Oregon");
		}
	}
	
	public static void searchDictionary() {
		HashMap<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		
		// searching if Oregon is in dictionary
		if (map.containsKey("Oregon")) {
			System.out.println("Oregon found in dictionary");
		}
		
		// searching if Salem is in dictionary
		if (map.containsValue("Salem")) {
			System.out.println("Salem found in dictionary");
		}
	}
}


