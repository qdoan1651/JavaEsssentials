/* Using only String Built-in Methods for Regular Expression */

package regex;

public class StringBuiltinMethods {
	public static void main(String[] args) {
		simpleUsage();
//		removeRepeatingWord();
//		swappingWords();
	}
	
	public static void simpleUsage() {
		// String's built-in methods that support regular expression
		// split(), matches(), replaceFirst(), replaceAll(), 
		String phrase = "Now is the time or now is not the time.";
		System.out.println(phrase);
		
		String repString = "time";
		for (String word: phrase.split("\\s")) {
			if (word.matches(repString)) {
				// Replace the word 'time' with '*time*'
				System.out.println(word.replace(repString, "+" + repString + "+"));
			} else {
				System.out.println(word);
			}
		}
		
		// Replace the 1st occurrence of 'is' with 'was'
		System.out.println(phrase.replaceFirst("is", "was"));
		// Output: Now was the time or now is not the time.
		
		// Replace all occurrences of 'is' with 'was'
		System.out.println(phrase.replaceAll("is", "was"));
		// Output: Now was the time or now was not the time.
	}

	
	public static void removeRepeatingWord() {
		// Remove second repeating word, i.e., 'the the' --> 'the'
		String phrase = "I can see the light at the the end of the tunnel";
		System.out.println(phrase);
		System.out.println(phrase.replaceAll("\\s+(\\w+)(\\s+)\\1", " $1"));
	}
	
	public static void swappingWords() {
		// Swap places of the words Tom and Jerry
		String phrase = "Let's change Tom and Jerry location.";
		String pattern = "\\s+(\\w+)\\s+and\\s+(\\w+)\\s+";
		
		System.out.println(phrase);
		//After swapping (have to assign to new variable since string is immutable)
		String newPhrase = phrase.replaceAll(pattern, " $2 and $1 ");
		System.out.println(newPhrase);
	}
}
