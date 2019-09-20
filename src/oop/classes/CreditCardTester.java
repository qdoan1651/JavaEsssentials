/* 
 * Intro to Computer Science - Programming With Java 101 (Tutsplus) with Andrew Perkins
 * Section 3: Working with Classes
 * Lecture 4: Unit Test
 */
package oop.classes;

public class CreditCardTester {

	public static void main(String[] args) {
		CreditCard card = new CreditCard("Andrew Perkins", 2500);
		System.out.println(card.getCardHolder());
		System.out.println(card.getCreditLimit());
		card.makePurchase(1500);
		System.out.println(card.getBalance());
		card.makePayment(200);
		System.out.println(card.getBalance());
	}
}
