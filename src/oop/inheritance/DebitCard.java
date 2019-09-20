/* 
 * Intro to Computer Science - Programming With Java 201 with Andrew Perkins
 * Section 5: Inheritance and Polymorphism
 * Lecture 3: Creating subclasses
 */
package oop.inheritance;

public class DebitCard extends MoneyCard {
	public DebitCard(int amount) {
		balance = amount;
	}
	
	/**
	 * Make deposit with the provided amount
	 * @param amount of deposit
	 */
	public void makeDeposit(int amount) {
		balance = balance + amount;
	}
}

