/* 
 * Intro to Computer Science - Programming With Java 301 (Tutsplus) with Andrew Perkins
 * Section 1: Intermediate Topics
 * Lecture 3: Practical Interface Example
 */

package oop.interfaces;

public class CreditCard extends MoneyCard {
	private int creditLimit;
	
	public CreditCard(int amount) {
		balance = 0;
		creditLimit = amount;
		acceptability = new AcceptedEverywhere();
	}
	
	/**
	 * Make balance with provided amount
	 * @param amount of payment
	 */
	public void makePayment(int amount) {
		balance = balance - amount;
	}
	
	public int getAvailableCredit() {
		return creditLimit - balance;
	}
	
	public void makePurchase(int amount) {
		if (amount > getAvailableCredit()) {
			throw new IllegalArgumentException("Amount of the purchase exceeds available credit");
		}
		
		balance = balance + amount;
	}
}

