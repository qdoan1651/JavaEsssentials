package essentials;

public class IntegerClass {
	public static void main(String[] args) {
		// Use Integer.ParseInt() method to convert a string to integer
		String thirtyFive = "35";
		int i = Integer.parseInt(thirtyFive);
		System.out.println(i + 5); // 40
		
		// Use Integer.toString(int num) method to convert an integer to string.
		int j = 75;
		String strj = Integer.toString(j);
		System.out.println("strj: " + strj); // strj: 75
		
		// Can also use String.valueOf(int j) to convert an integer to string
		String strj2 = String.valueOf(j);
		System.out.println("strj2: " + strj2); // strj2: 75
		
	}
}
