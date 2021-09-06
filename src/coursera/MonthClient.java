package coursera;

public class MonthClient {

	public static void main(String[] args) {
		Month[] m = new Month[12];
		for (int i = 0; i < 12; i = i + 1) {
			m[i] = new Month(i+1);
			System.out.println(m[i].toString());
		}
		

	}

}
