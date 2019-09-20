/* 
 * Intro to Computer Science - Programming With Java 201 with Andrew Perkins
 * Section 5: Inheritance and Polymorphism
 * Lecture 4: Overriding methods and polymorphism
 */
package oop.inheritance;

public class CreditCard extends MoneyCard {
	private int creditLimit;
	
	/**
	 * Construct a credit card with given credit limit
	 * 
	 * @param amount of credit limit
	 */
	public CreditCard(int amount) {
		balance = 0;
		creditLimit = amount;
	}
	
	/**
	 * Make payment with provided amount
	 * 
	 * @param amount of payment
	 */
	public void makePayment(int amount) {
		balance = balance - amount;
	}
	
	/**
	 * Get the credit limit amount
	 * 
	 * @return credit limit
	 */
	public int getAvailableCredit() {
		return creditLimit - balance;
	}
	
	/**
	 * Override method makePurchase() from superclass MoneyCard
	 */
	public void makePurchase(int amount) {
		if (amount > getAvailableCredit()) {
			throw new IllegalArgumentException("Purchase amount exceeds available credit");
		}
		
		balance = balance + amount;
	}
}

