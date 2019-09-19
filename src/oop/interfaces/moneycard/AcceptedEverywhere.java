/* 
 * Intro to Computer Science - Programming With Java 301 (Tutsplus) with Andrew Perkins
 * Section 1: Intermediate Topics
 * Lecture 2: Interfaces
 */
package oop.interfaces.moneycard;

public class AcceptedEverywhere implements Acceptability {
	
	public String location() {
		return "Acceptable at all locations.";
	}
}
