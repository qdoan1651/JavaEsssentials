/* 
 * Intro to Computer Science - Programming With Java 301 (Tutsplus) with Andrew Perkins
 * Section 1: Intermediate Topics
 * Lecture 3: Practical Interface Example
 */

package oop.interfaces.moneycard;

public class MoneyCardTester {
	public static void main(String[] args) {
		testGiftCard();
		testDebitCard();
		testCreditCard();
	}
	
	public static void testGiftCard() {
		System.out.println("The GiftCard Class:");
		GiftCard gc = new GiftCard(150);
		gc.makePurchase(50);
		System.out.println("Balance: " + gc.getBalance());
		System.out.println(gc.getAcceptability());
	}
	
	public static void testDebitCard() {
		System.out.println("The DebitCard Class:");
		DebitCard dc = new DebitCard(500);
		dc.makePurchase(100);
		dc.deposit(25);
		System.out.println("Balance: " + dc.getBalance());
		System.out.println(dc.getAcceptability());
	}
	
	public static void testCreditCard() {
		System.out.println("The CreditCard Class:");
		CreditCard cc = new CreditCard(1500);
		cc.makePurchase(300);
		cc.makePayment(75);
		System.out.println("Balance: " + cc.getBalance());
		System.out.println("Avaialbe Credit: " + cc.getAvailableCredit());
		System.out.println(cc.getAcceptability());
	}
}

