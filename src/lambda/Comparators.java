/* Comparators - Lambda Expressions In Java 8: Tutorial 14 (Coding Basics)
 * https://www.youtube.com/watch?v=Aa_QczEh3Yw
 */
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {
	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("Justin", "Williams", 14));
		players.add(new Player("Sidney", "Crosby", 87));
		players.add(new Player("Evgeni", "Malkin", 71));
		
//		sortByLastName(players);
//		System.out.println(players);
		
		// Clone player to players2
		ArrayList<Player> players2 = (ArrayList<Player>) players.clone();
		reversedSortWithLambda(players2);
	}
	
	public static void sortByLastName(ArrayList<Player> players) {
		System.out.println("Before: " + players);
		
		// Define comparator
		Comparator<Player> comparator = new Comparator<Player>() {
			public int compare(Player p1, Player p2) {
				return p1.lastName.compareTo(p2.lastName);
			}
		};
		Collections.sort(players, comparator);
		
		System.out.println("After: " + players);
	}
	
	public static void sortWithLambda(ArrayList<Player> p) {
		System.out.println("Before: " + p);
		
		// Define comparator using lambda
		Comparator<Player> c2 = (Player p1, Player p2) -> p1.lastName.compareTo(p2.lastName);
		// Sorting ...
		Collections.sort(p, c2);

		System.out.println("After: " + p);
	}
	
	/**
	 * Sort with player number in reversed order
	 * @param player player
	 */
	public static void reversedSortWithLambda(ArrayList<Player> player) {
		System.out.println("Before: " + player);
		
		// Define comparator using lambda
		Comparator<Player> comparator = (Player p1, Player p2) ->  p1.lastName.compareTo(p2.lastName);
		// Sorting ...
		Collections.sort(player, comparator.reversed());

		System.out.println("After: " + player);
	}
	
	
	
}
