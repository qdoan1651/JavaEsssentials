/* 
 * Intro to Computer Science - Programming With Java 101 (Tutsplus) with Andrew Perkins
 * Section 3: Working with Classes
 * Lecture 1: Defining a Private Implementation - Creating Instance Variables
 * Lecture 2: Defining a Public Interface - Creating Methods
 */
package oop.classes;

public class CreditCard {
	private int creditLimit;
	private int balance;
	private String cardholder;
	
	/**
	 * Construct a credit card with a predetermined credit limit and 
	 * provided cardholder name
	 * 
	 * @param name the cardholder name
	 */
	public CreditCard(String name) {
		cardholder = name;
		creditLimit = 500;
		balance = 0;
	}
	
	/**
	 * Construct a credit card with provided name and credit limit
	 * 
	 * @param name the cardholder name
	 * @param creditLimit amount of credit limit
	 */
	public CreditCard(String name, int creditLimit) {
		cardholder = name;
		this.creditLimit = creditLimit;
		balance = 0;
	}
	
	/**
	 * Return the credit limit of the credit card
	 * 
	 * @return credit limit
	 */
	public int getCreditLimit() {
		return creditLimit;
	}
	
	/**
	 * Get the balance of the credit card
	 * 
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	
	/**
	 * Return the cardholder name
	 * 
	 * @return the cardholder
	 */
	public String getCardHolder() {
		return cardholder;
	}
	
	/**
	 * Make a purchase and increasing the balance of the credit card
	 * @param amount of purchase
	 */
	public void makePurchase(int amount) {
		balance = balance + amount;
	}
	
	/**
	 * Make a payment and reducing the balance of the credit card
	 * @param amount of payment
	 */
	public void makePayment(int amount) {
		balance = balance - amount;
	}
}
