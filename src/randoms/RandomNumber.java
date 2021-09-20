// https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
package randoms;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {
		randomNumber3();
	}
	
	public static void randomNumber1() {
		Random rand = new Random();
		
		// Random integer
		int limit = 25;
		int rint = rand.nextInt(limit);
		System.out.println("Random integer: " + String.valueOf(rint));
		
		// Random double between 0 and 1.0
		double rdouble = rand.nextDouble();
		System.out.println("Random double: " + String.valueOf(rdouble));
		
		// Random double between 0 and 1.0
		float rfloat = rand.nextFloat();
		System.out.println("Random float: " + String.valueOf(rfloat));
	}
	
	public static void randomNumber2() {
		// Generate numbers between 0 and 24
		for (int i=0; i<5; i++) {
			int rint = (int) Math.floor(Math.random() * 25);
			System.out.println(rint);
		}
		System.out.println();
	
		// Generate numbers between min and max 
		int min = 50;
		int max = 100;
		for (int i=0; i<5; i++) {
			int rint = (int) Math.floor(Math.random() * (max - min + 1) + min);
			System.out.println(rint);
		}
	}
	
	public static void randomNumber3() {
		// Generate random integers  
		int int_random = ThreadLocalRandom.current().nextInt();  
		System.out.println("Random Integers: " + int_random); 
		
		// Generate Random doubles 
		double double_rand = ThreadLocalRandom.current().nextDouble(); 
		System.out.println("Random Doubles: " + double_rand); 
		   
		// Generate random booleans 
		boolean boolean_rand = ThreadLocalRandom.current().nextBoolean(); 
		System.out.println("Random Booleans: " + boolean_rand); 
	}
}
