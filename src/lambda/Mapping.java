/* Mapping - Lambda Expressions In Java 8: Tutorial 4 (Coding Basics)
 * https://www.youtube.com/watch?v=trpBJ36a28E
 */
package lambda;

import java.util.List;
import java.util.ArrayList;

public class Mapping {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		
		players.add(new Player("Sidney", "Crosby", 87));
		players.add(new Player("Evgeni", "Malkin", 71));
		players.add(new Player("Kris", "Letang", 58));
		players.add(new Player("Martin", "St-Louis", 26));
		players.add(new Player("Anze", "Kopitar", 11));
		players.add(new Player("Drew", "Doughty", 8));
		players.add(new Player("Booby", "Ryan", 6));
		
		System.out.println("Non-lamdba: ");
		// Java 6, 7
		for (Player p: players) {
			System.out.println("# " + p.number);
		}
		
		// Using map with lambda expression which is new in Java 8
		System.out.println("\nLambda: ");
		players.stream().map(x -> x.number).forEach(x -> System.out.println("# " + x));
		
		// using mapToInt()
		System.out.println("\nUsing mapToInt(): ");
		players.stream().mapToInt(x -> x.number).forEach(x -> System.out.println("# " + x));
	}
}

