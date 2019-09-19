package oop.generic;

public class AccountGeneric<Number> {
	private String accountHolderName;
	private Number accountNumber;
	private double balance;	
	
	// Constructor
	public AccountGeneric(String name, Number number, double initialBalance) {
		accountHolderName = name;
		accountNumber = number;
		balance = initialBalance;
	}
	// Setter-Mutator methods
	public void setAccountNumber(Number number) {
		accountNumber = number;
	}
	// Accessor-Getter methods
	public Number getAccountNumber() {
		return accountNumber;
	}

}
