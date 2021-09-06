package classOOP;

public class AccountGeneric<Number> {
	private String accountHolderName;
	private Number accountNumber;
	private double balance;
	
	// Constructor
	public AccountGeneric(String name, Number number, double initialBalance) {
		accountHolderName = name;
		accountNumber = number;
		setInitialBalance(initialBalance);
	}
	
	// Setter-Mutator methods
	public void setAccountNumber(Number number) {
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
	
	// Accessor-Getter methods
	public Number getAccountNumber() {
		return accountNumber;
	}
	
	public void displayAccountInfo() {
		System.out.print(accountHolderName + ", ");
		System.out.print(accountNumber + ", ");
		System.out.print(balance + "\n");
	}
}
