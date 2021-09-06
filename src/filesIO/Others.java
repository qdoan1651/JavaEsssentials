package filesIO;
/* Other less commonly used file processing such as reading/writing character,
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Others {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void writeCharToFile(String[] args) {
		// What use case for reading/writing character?
		String fileName = "./Sandbox/chars.txt";
		try ( PrintWriter outFile = new PrintWriter(new FileWriter(fileName)) ) {		
			String sentence = "Now is the time for all good people";
			for (int i = 0; i < sentence.length(); ++i) {
				outFile.write(sentence.charAt(i));
				outFile.write("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("IOException. Message: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException. Message: " + e.getMessage());
		}
	}
	
	/* Use FileInputStream to read grades from text file 
	 * and display one CHARACTER per line on the screen */
	public static void readCharFromFile(String file) {
		// What use case for reading/writing character?
		int i;
		try (FileInputStream inFile = new FileInputStream(file)) {		
			do {
				i = inFile.read();
				if (i != -1) {
					System.out.println((char) i);
				}
			} while (i != -1);
			inFile.close();
		} catch (IOException e) {
			System.out.println(e);
		} 
	}
	
	public static void readCharFromFile2() throws IOException {
		// What use case for reading/writing character?
		
		String inputFile = "./Sandbox/chars.txt";
		String outputFile = "./Sandbox/chars.bak";
		FileReader inFile = new FileReader(inputFile);
		FileWriter outFile = new FileWriter(outputFile);
		int ch = 0;
		ch = inFile.read();
		while(ch != -1) {
			System.out.println(ch);
			outFile.write(ch);
			ch = inFile.read();
		}
		outFile.close();
		inFile.close();		
	}

}
