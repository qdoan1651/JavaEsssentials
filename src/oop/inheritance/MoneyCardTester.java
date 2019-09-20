/* 
 * Intro to Computer Science - Programming With Java 201 with Andrew Perkins
 * Section 5: Inheritance and Polymorphism
 * Lecture 3: Creating subclasses
 * Lecture 4: Overriding methods and polymorphism
 */
package oop.inheritance;

public class MoneyCardTester {

	public static void main(String[] args) {
//		testGiftCard();
//		testDebitCard();
		testCreditCard();
	}
	
	public static void testGiftCard() {
		System.out.println("The GiftCard Class:");
		GiftCard gc = new GiftCard(150);
		gc.makePurchase(50);
		System.out.println("Balance: " + gc.getBalance());
	}
	
	public static void testDebitCard() {
		System.out.println("The DebitCard Class:");
		DebitCard dc = new DebitCard(500);
		dc.makePurchase(250);
		System.out.println("Balance: " + dc.getBalance());
		dc.makeDeposit(100);
		System.out.println("Balance: " + dc.getBalance());
	}
	
	public static void testCreditCard() {
		System.out.println("The CreditCard Class:");
		CreditCard cc = new CreditCard(2500);
		cc.makePurchase(1000);
		System.out.println("Available credit: " + cc.getAvailableCredit());
		System.out.println("Balance: " + cc.getBalance());
		cc.makePayment(500);
		System.out.println("Available credit: " + cc.getAvailableCredit());
		System.out.println("Balance: " + cc.getBalance());
	}
 }
