package sandbox;

public class Strings {

	public static void main(String[] args) {
		// 6.1 Using the string class
		/*
		String s1 = "Welcome to California";
		String s2 = new String("Welcome to California");
		String s3 = "WELCOME to California";
		
		if (s1 == s2) {
			System.out.println("They match");
		} else {
			System.out.println("They don't match");
		}
		
		// equals() function
		if (s1.equals(s2)) {
			System.out.println("They match");
		} else {
			System.out.println("They don't match");
		}
		
		// equalsIgnoreCase() function
		if (s1.equalsIgnoreCase(s3)) {
			System.out.println("They match");
		} else {
			System.out.println("They don't match");
		}
		
		// Converting string to array of characters
		char[] chars = s1.toCharArray();
		for (char c : chars) {
			System.out.println(c);
		}
		*/
		
		// 6.2 Building string with string builder
		/*
		// Memory inefficient
		String s1 = "Welcome";
		s1 = s1 + " to California";
		System.out.println(s1);
		
		// StringBuilder
		String s1 = "Welcome";
		StringBuilder sb = new StringBuilder(s1); 
		sb.append(" to California");
		System.out.println(sb);
		*/	
		
		// 6.3 Parsing string values
		String s1 = "Welcome to California";
		System.out.println(s1.length());
		
		// Find position of California in the string s1
		int pos = s1.indexOf("California");
		System.out.println("Position of California: " + pos);
		
		// Extracting string from s1
		System.out.println(s1.substring(11));
		System.out.println(s1.substring(11, 14));
		
		// Trim a string
		String s2 = "Welcome     ";
		System.out.println(s2.length());
		String s3 = s2.trim();
		System.out.println(s3.length());
	}
}
