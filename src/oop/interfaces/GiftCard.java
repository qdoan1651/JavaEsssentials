/* 
 * Intro to Computer Science - Programming With Java 301 (Tutsplus) with Andrew Perkins
 * Section 1: Intermediate Topics
 * Lecture 3: Practical Interface Example
 */

package oop.interfaces;

public class GiftCard extends MoneyCard {
	public GiftCard(int amount) {
		balance = amount;
		acceptability = new AcceptedSelectLocations();
	}
}

