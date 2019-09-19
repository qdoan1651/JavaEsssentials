/* 
 * Intro to Computer Science - Programming With Java 301 (Tutsplus) with Andrew Perkins
 * Section 1: Intermediate Topics
 * Lecture 3: Practical Interface Example
 */

package oop.interfaces.moneycard;

public class MoneyCard {
	
	protected int balance;
	protected Acceptability acceptability;
	
	public int getBalance() {
		return balance;
	}
	
	public void makePurchase(int amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Amount of the purchase exceeds the balance");
		}
		
		balance = balance - amount;
	}
	
	public String getAcceptability() {
		return acceptability.location();
	}
}

