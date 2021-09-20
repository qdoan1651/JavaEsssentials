package classOOP;

import resources.FileResource;
import org.apache.commons.csv.CSVRecord;


public class AccountTest {

	public static void main(String[] args) {
//		arrayObject();
		arrayObject1();

	}
	
public static void arrayObject1() {
	// Create an array of 3 Account objects
	Account[] accounts1 = {new Account(), new Account(), new Account()};
	
	// Manually instantiate the accounts
	Account[] accounts2 = {new Account("Tom Brady", 100, 500000),
						   new Account("Jerry West", 200, 123456),
						   new Account("Arnold Palmer", 300, 99999)
						  };
	// Display info from accounts
	System.out.println("Display accounts information");
	for (Account account: accounts2) {
		account.displayAccountInfo();
	}
}
	
public static void arrayObject() {
	// Create an array of 5 Account objects
	Account[] accounts = new Account[5];

	// Instantiate the accounts
	for (int i = 0; i < accounts.length; i = i + 1) {
		accounts[i] = new Account();
	}

	// Read account info from file and set up the accounts with this info
	FileResource fr = new FileResource("src/coursera/testData.txt");
	int counter = 0;
	for (CSVRecord record: fr.getCSVParser(false)) {
//		System.out.println(record.get(0) + ", " + record.get(1) + ", " + record.get(2));
		String name = record.get(0);
		int number = Integer.parseInt(record.get(1).trim());
		double initialBalance = Double.parseDouble(record.get(2).trim());
		accounts[counter].setAccountHolderName(name);
		accounts[counter].setAccountNumber(number);
		accounts[counter].setInitialBalance(initialBalance);
		counter = counter + 1;
	}
			
	// Display info from accounts
	System.out.println("Display accounts information");
	for (Account account: accounts) {
		account.displayAccountInfo();
	}
}
	
	public static void misc() {
		Account accnt1 = new Account("John Myers", 100);
		Account accnt2 = new Account("John Smith", 200, 499.99);
		System.out.println(accnt2.getName());
		System.out.println(accnt2.getBalance());
	}

}
