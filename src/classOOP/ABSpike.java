package classOOP;
/* Java for Android, Week3.Part2.Inheritance and Polymorphism
 * 02 Class Hierarchy and Interfaces 
 */

public class ABSpike {
	private char color; // R for Red, B for Black
	private boolean captured;
	private int[] position = {0,0};
	private int life;
	
	// Constructor
	public ABSpike(char color, int[] initPos) {
		this.color = color;
		captured = false;
		life = 10;
		position[0] = initPos[0];
		position[1] = initPos[1];
	}
	// Accessor/Getter methods
	public char getColor() {
		return color;
	}
	
	public boolean isCaptured() {
		return captured;
	}
	
	public int getLife() {
		return life;
	}
	
	public int getX() {
		return position[0];
	}
	
	public int getY() {
		return position[1];
	}
	// Mutator/Setter methods
	public void setColor(char color) {
		this.color = color;
	}
	
	public void capture() {
		captured = true;
	}
	
	protected void setLife(int change) {
		life = life + change;
	}
	
	private void setPosition(int x, int y) {
		position[0] = x;
		position[1] = y;
	}
	
	public boolean move(int x, int y) {
		if ( life > 0 ) {
			setLife(-1);
			setPosition(x, y);
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "life: " + life + " at (" + position[0] + ", " + position[1] + ").";
	}
}
