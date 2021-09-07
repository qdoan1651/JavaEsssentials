package essentials;

import java.util.ArrayList;
import java.util.List;

public class StringEssentials {

	public static void main(String[] args) {
		String greeting = "Welcome   ";
		greeting = greeting.trim();
		System.out.println("'" + greeting + "'");
	}
	
	public static void stringEssential() {
		// split method
		String nums = "1, 2, 3";
		String[] arr = nums.split(", ");
		for (String s: arr) {
			System.out.println(s);
		}
		
		// join method
		String[] snums = {"1", "2", "3"};
		String s = String.join(", ", snums);
		System.out.println("'" + s + "'"); // '1, 2, 3'
		
		// converting an array list into string with join method
		List<String> sarr = new ArrayList<>();
		sarr.add("a");
		sarr.add("b");
		sarr.add("c");
		
		s = String.join(", ", sarr);
		System.out.println("'" + s + "'"); // 'a, b, c'
		
		// trim() method
		String greeting = "Welcome   ";
		greeting = greeting.trim();
		System.out.println("'" + greeting + "'");
	}
	
	public static void splitMethod() {
		// can specify the number of instances to split
		String s = "a b c d";
		String[] arr = s.split(" ", 2);
		for (String item: arr) {
			System.out.println(item); 
		}
		// a
		// b, c, d
	}

}
