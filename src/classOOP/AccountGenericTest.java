package classOOP;

public class AccountGenericTest {

	public static void main(String[] args) {
		AccountGeneric<String> account1 = new AccountGeneric<>("Tim Kane", "12345-67890", 100000);
		AccountGeneric<Integer> account2 = new AccountGeneric<>("George McGovern", 1234567890, 200000);
		account1.displayAccountInfo();
		account2.displayAccountInfo();
	}

}
