package essentials;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		System.out.println(fac(number));

	}
	
	public static int fac(Integer num) {
		if ((num == 0) || (num == 1)) {
			return 1;
		} else {
			return num * fac(num - 1);
		}
	}

}
