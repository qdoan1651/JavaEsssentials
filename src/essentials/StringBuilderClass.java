package essentials;

public class StringBuilderClass {
	public static void main(String[] args) {
		StringBuilder key = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(key);
		
		/* Shift key by three characters: XYZABCDEFGHIJKLMNOPQRSTUVW */
		// StringBuilder insert(int index, String str) 
		key.insert(0, key.substring(key.length() - 3));
		System.out.println(key);
		
		// String substr(int star, int end)
		String newKey = key.substring(0, key.length() - 3);
		System.out.println(newKey);
		
		// StringBuilder append(String str) - multiple append methods
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Tim!");
		System.out.println(sb);
		
		// Object insert(int index, String str)
		sb.insert(6, "there ");
		System.out.println(sb);
		
		// Object setCharAt(int index, Char c)
		sb.setCharAt(6, 'T');
		System.out.println(sb);
		
		// Object replace(int start, int end, String str)
		sb.replace(1, 5, "i");
		System.out.println(sb);
		
		// Object deleteCharAt(int index)
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
		
		// Object delete(int start, int end)
		sb.delete(2, sb.length());
		System.out.println(sb);
		
		// Object reverse()
		sb.reverse();
		System.out.println(sb);
		
		// Boolean equals(Object obj)
		// Char charAt(int index)
		// int indexOf(String str)
		// int indexOf(String str, int from)
		// int lastIndexOf(String str)
		
	}
}
