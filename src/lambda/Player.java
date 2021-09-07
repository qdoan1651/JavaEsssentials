/* Comparators - Lambda Expressions In Java 8: Tutorial 14 (Coding Basics)
 * https://www.youtube.com/watch?v=Aa_QczEh3Yw
 */
package lambda;

public class Player {
	public String firstName;
	public String lastName;
	public int number;
	
	public Player(String first, String last, int n) {
		firstName = first;
		lastName = last;
		number = n;
	}
	
	public String toString() {
		return firstName + ", " + lastName;
	}
}
