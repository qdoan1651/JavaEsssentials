/* 
 * Intro to Computer Science - Programming With Java 201 with Andrew Perkins
 * Section 5: Inheritance and Polymorphism
 * Lecture 2: Creating a superclass
 */

package oop.inheritance;

public class MoneyCard {
	
	protected int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void makePurchase(int amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Amount of the purchase exceeds the balance");
		}
		
		balance = balance - amount;
	}
}

