package toBeSorted;

import java.util.Scanner;

public class UserInputSampleCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.println("Enter your name: ");
		name = input.next();
		System.out.println("Your name is: " + name);
	}
}
