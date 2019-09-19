/* 
 * Intro to Computer Science - Programming With Java 301 (Tutsplus) with Andrew Perkins
 * Section 1: Intermediate Topics
 * Lecture 2: Interfaces
 */
package oop.interfaces.moneycard;

public class AcceptedSelectLocations implements Acceptability {
	public String location() {
		return "Acceptable only at select locations.";
	}
}
