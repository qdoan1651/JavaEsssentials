package classOOP;
/* Java for Android, Week3.Part2.Inheritance and Polymorphism
 * 02 Class Hierarchy and Interfaces 
 */

public class Ghoul extends ABSpike {
	public Ghoul(char team, int[] startingPos) {
		super(team, startingPos);
		setLife(5);
	}
	
	public boolean move(int x, int y) {
		if (  1 == Math.abs(getX() - x) && 1 == Math.abs(getY() - y) ){
			return(super.move(x, y));
		}
		return false;
	}
}
