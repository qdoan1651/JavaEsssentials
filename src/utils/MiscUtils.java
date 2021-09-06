package utils;
/* This utility generates random numbers use for test data */

import java.util.Date;

import java.util.Random;

public class MiscUtils {

	public static void main(String[] args) throws InterruptedException {
		
		/* Testing genRandomNumber() */
//		for (int i = 0; i < 5; i++) {
//			System.out.println(getRandomNumber(100));
//		}
		
		/* testing datetime() */
		datetime();
	}
	
	public static int getRandomNumber(int limit) {
//		Random random = new Random(System.currentTimeMillis());
		Random random = new Random();
		return random.nextInt(limit);
	}
	
	public static void datetime() throws InterruptedException {
		/* Reference: 6.4 Working with date values (Java Essential with David Gassner) */
		Date t1 = new Date();
		System.out.println(t1);
		System.out.println(t1.getTime());
		Thread.sleep(10000);
		Date t2 = new Date();
		System.out.println(t2);
		System.out.println(t2.getTime());
		
		long lapseTime = t2.getTime() - t1.getTime();
		System.out.println("Lapse time in millisec: " + lapseTime/1000);
		
	}

}
