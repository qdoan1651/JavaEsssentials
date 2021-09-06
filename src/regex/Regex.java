// Advanced Java Programming by Mike McMillan, Chapter 17

package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		extractPhoneNumbers();
	}
	
	public static void extractPhoneNumbers() {
		//String date = "(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01)/(19|20)\\d{2}";
		String phrase = "My phone number are 408-223-5500 (Mobile) "
				      + "and 408-956-5500 (Home)";
		String phoneNoPattern = "[2-9]\\d{2}-\\d{3}-\\d{4}";
		Pattern pattern = Pattern.compile(phoneNoPattern);
		Matcher match = pattern.matcher(phrase);
		while (match.find()) {
			System.out.println("Phone number found: " + match.group());
		}
	}
	
	public static void extractPhoneNumbers0() {
		//String date = "(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01)/(19|20)\\d{2}";
		String phrase = "My phone number are 408-223-5500 (Mobile) "
				      + "and 408-956-5500 (Home)";
		String phoneNoPattern = "[2-9]\\d{2}-\\d{3}-\\d{4}";
		Pattern pattern = Pattern.compile(phoneNoPattern);
		Matcher match = pattern.matcher(phrase);
		if (match.find()) {
			System.out.println("Phone number found: " + match.group());
			while (match.find()) {
				System.out.println("Phone number found: " + match.group());
			}
		} else {
			System.out.print("Phone number not found!");
		}
	}
	
	public static void removeRepeatingWords() {
		// Remove second repeating word, i.e., 'the the' --> 'the'
		String phrase = "I can see the light at the the end of the tunnel";
		
		System.out.println(phrase);
		
		// Using built-in method
		System.out.println(phrase.replaceAll("\\s+(\\w+)(\\s+)\\1", " $1"));
		
		// Using Pattern and Matcher
		Pattern pattern = Pattern.compile("\\s(\\w+)\\s\\1");
		Matcher match = pattern.matcher(phrase);
		System.out.println(match.replaceAll(" $1"));

	}

	
	
	
}
