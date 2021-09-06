package utils;

import java.util.ArrayList;

public class ArrayListUtils {
	public static void display(ArrayList<Integer> al) {
		for (int i = 0; i < al.size(); ++i) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
	}
	
	public static int sum(ArrayList<Integer> al) {
		int sum = 0;
		for (int i = 0; i < al.size(); i += 1) {
			sum += al.get(i);
		}
		return sum;
	}
}
