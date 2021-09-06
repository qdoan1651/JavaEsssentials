package filesIO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWriting {

	// Handle exception using try-with-resource in Java7
	public static void main0(String[] args) {
		String filename = "\\src\\testData\\Sample.txt";
		try ( PrintWriter outFile = new PrintWriter(new FileWriter(filename)) ) {
			outFile.print(89);
			outFile.print("\n");
			outFile.println(95);
			outFile.println("something gud");
			outFile.close();
		} catch (Exception e) {
			System.out.println("File not found. Message: " + e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		String filename = "\\src\\testData\\Sample.txt";
		try ( PrintWriter outFile = new PrintWriter(new FileWriter(filename)) ) {
			outFile.print(89);
			outFile.print("\n");
			outFile.println(95);
			outFile.println("something gud");
			outFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Message: " + e.getMessage());
		}
	}
	
	// Handle exception with try/catch/finally in (pre)Java7
	public static void main2(String[] args) throws IOException  {
		String filename = "src\\testData\\Sample.txt";
		PrintWriter outFile = null;
		try {
			outFile = new PrintWriter(new FileWriter(filename));
			outFile.print(89);
			outFile.print("\n");
			outFile.println(95);
			outFile.println("something gud");
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Message: ");
			System.out.println(e.getMessage());
		} finally {
			if (outFile != null) {
				outFile.close();
			}
		}
	}

	// Default exception handle in Java (not sufficient to handle FileNotFoundException)
	public static void main3(String[] args) throws IOException {
		PrintWriter outFile = new PrintWriter(new FileWriter("src\\testData\\grades.txt"));
		outFile.print(89);
		outFile.print("\n");
		outFile.println(95);
		outFile.println("something gud");
		outFile.close();
	}
	
}
