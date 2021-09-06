package classOOP;
/* Java for Android, Week3.Part2.Inheritance and Polymorphism
 * 02 Class Hierarchy and Interfaces 
 */

public class Client {
	public static void main(String[] args) {
		int[] position = {0, 0};
		Ghoul Jim = new Ghoul('R', position);
		System.out.println(Jim.toString());
		Jim.capture();
		Jim.move(1,	1);
		Jim.toString();
		System.out.println(Jim.toString());
	}
}
