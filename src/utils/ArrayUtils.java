package utils;

public class ArrayUtils {

	public static void display(int[] in) {
		for (int i = 0; i < in.length - 1; i += 1) {
			System.out.print(in[i] + ", ");
		}
		System.out.println(in[in.length - 1] + ".");
	} 
}
