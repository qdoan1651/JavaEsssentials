package classOOP;

public class Account {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	public Account() {
		accountHolder = null;
		accountNumber = 0;
		balance = 0;
	}
	
	public Account(String name, int number) {
		accountHolder = name;
		accountNumber = number;
		balance = 0;
	}
	
	public Account(String name, int number, double initialBalance) {
		this(name, number);
		balance = initialBalance;
	}
	
	// Accessor/getter methods
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return accountHolder;
	}
	
	public void displayBalance() {
		System.out.println(balance);
	}
	
	public void displayAccountInfo() {
		System.out.print(accountHolder + ", ");
		System.out.print(accountNumber + ", ");
		System.out.print(balance + "\n");
	}
	
	// Mutators/setter methods
	public void setAccountHolderName(String name) {
		accountHolder = name;
	}
	
	public void setAccountNumber(int number) {
		accountNumber = number;
	}
	
	public boolean setInitialBalance(double initialBalance) {
		if (initialBalance < 0) {
			return false;
		} else {
			balance = initialBalance;
			return true;
		}
	}
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public boolean withdrawn(double amount) {
		if (amount < balance) {
			balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}

}
