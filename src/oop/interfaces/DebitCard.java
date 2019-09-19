/* 
 * Intro to Computer Science - Programming With Java 301 (Tutsplus) with Andrew Perkins
 * Section 1: Intermediate Topics
 * Lecture 3: Practical Interface Example
 */

package oop.interfaces;

public class DebitCard extends MoneyCard {
	public DebitCard(int amount) {
		balance = amount;
		acceptability = new AcceptedEverywhere();
	}
	
	/**
	 * Make deposit with the provided amount
	 * @param amount
	 */
	public void deposit(int amount) {
		balance = balance + amount;
	}
}

