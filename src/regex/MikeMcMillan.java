package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MikeMcMillan {
	public static void main(String[] args) {
		
	}
	
	// 17.2 Creating Pattern and Matcher Objects (Mike McMillan Java 2)
		public static void search4Word() {
			String words = "now is the time or now is not the time";
			String patt = "now";
			
			Pattern pattern = Pattern.compile(patt);
			Matcher match = pattern.matcher(words);
			System.out.println(words);
			while (match.find()) {
				System.out.println("Found " + patt + " at: " + match.start());
				System.out.println("Match: " + match.group());
			}
		}
		
		// 17.3 Using meta characters  (Mike McMillan Java 2)
		public static void metacharacters() {
			// metacharacters: \w, \d, \s
			String words = "90 percent effort 100 percent of the time";
			System.out.println(words);
			
			Pattern pattern = Pattern.compile("");
			Matcher match = pattern.matcher(words);
			while (match.find()) {
				System.out.println("Found \\w+ at: " + match.start());
				System.out.println("Match: " + match.group());
			}
			String patt3 = "\\s";
			Pattern pattern3 = Pattern.compile(patt3);
			Matcher match3 = pattern3.matcher(words);
			int count = 0;
			while (match3.find()) {
				count++;
			}
			System.out.println("Total number of spaces: " + count);
		}
		
		// 17.4 Using regex to replace text (Mike McMillan Java 2)
		public static void correctLastName() {
			String names = "Mike McMillian Terri McMillen Allison McMillin.";
			System.out.println(names);
			Pattern pattern = Pattern.compile("McM.*?\\b");
			Matcher match = pattern.matcher(names);
			names = match.replaceAll("McMillan");
			System.out.println(names);
		}
		
		// 17.5 Regular Expression Exercise (Mike McMillan Java 2)
		public static void extractPhoneNumbers() {
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
		/* Output:
		 * Phone number found: 408-223-5500
		 * Phone number found: 408-956-5500
		 */
}
