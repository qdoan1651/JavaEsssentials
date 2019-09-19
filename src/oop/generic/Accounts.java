package oop.generic;

public class Accounts {
	public static void main(String[] args) {
		AccountGeneric<String> account1 = new AccountGeneric<>("Time Kane", "12345", 100);
		AccountGeneric<Integer> account2 = new AccountGeneric<>("Morgan West", 12345, 200);
		
		System.out.println("Account 1 number: " + account1.getAccountNumber());
		System.out.println("Account 2 number: " + account2.getAccountNumber());
	}
}
