package essentials;

public class CharacterClass {
	/* char is the primitive data type. 
	 * Use the method from the Character class to work with character */
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(Character.isUpperCase(ch)); // false
		System.out.println(Character.isLowerCase(ch)); // true
		System.out.println(Character.isDigit(ch)); // false
		System.out.println(Character.isAlphabetic(ch)); // true
		System.out.println(Character.charCount(ch)); // 1
		System.out.println(Character.toUpperCase(ch)); // 1
		System.out.println(Character.toLowerCase(ch)); // 1
		
		// Convert character to string
		String strCh = Character.toString(ch);
		System.out.println("Length of strCh is: " + strCh.length());
		
		/* Not commonly used */
		System.out.println(Character.getName(ch)); // LATIN SMALL LETTER A
		
	}

}
