/* There are many ways to handle exceptions when processing files
 * The most preferable method would be using try-with-resource available in Java7 (readFileBufferedReader)
 * readFilePreJava7 is the equivalence (however, the code is longer, and closing file handle manually)
 * readFileApache3() is not recommended because it poorly handles when the file is not found
 * Note: For some reason, readFileApache() cannot be implemented with try-with-resource
 */
package filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class ExceptionHandling {
	public static void main1(String[] args) {
		readFilePreJava7();
		readFileApache();
	}
	
	public static void main(String[] args) throws IOException {
//		readFileApache2();
		readFileApache3();
	}

	public static void readFileBufferedReader() {
		String gradefile = "src/sandbox/grades.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(gradefile)) ) {
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Message: " + e.getMessage());
		} catch (IOException e) {
			System.out.print("IOException. Message: " + e.getMessage());
		}
	}
	
	public static void readFileScanner() {
		String gradefile = "src/sandbox/grades.txt";
		try (Scanner inFile = new Scanner(new FileReader(gradefile));) {
			
			int grade;
			while (inFile.hasNextLine()) {
				grade = Integer.parseInt(inFile.nextLine());
				System.out.println(grade);
			}
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Message: " + e.getMessage());
		} 
	}
	// Pre-Java7: Need to close the file handle manually.
	public static void readFilePreJava7() {
		// 17.03 Reading Data from a File (Beginner Java Programming by Mike McMillan)
		
		String gradefile = "src/sandbox/grades.txt";
		Scanner inFile = null;
		try {
			inFile = new Scanner(new FileReader(gradefile));
			int grade;
			while (inFile.hasNextLine()) {
				grade = Integer.parseInt(inFile.nextLine());
				System.out.println(grade);
			}
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Message: " + e.getMessage());
		} finally {
			if (inFile != null) {
				inFile.close();
			}
		}
	}
	
	public static void readFileApache() {
		File gradefile = new File("src/sandbox/grades.txt");
		try {
			String content = FileUtils.readFileToString(gradefile);
			// Display the file content
			System.out.println(content);
			
		    String[] lines = content.split("\\n");
		    for (String line: lines) {
		    	 System.out.println("***: " + line);
		    }
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Message: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException. Message: " + e.getMessage());
		}
	}
	
	public static void readFileApache2() throws IOException {
		File gradefile = new File("/src/sandbox/grades.txt");
		if (gradefile.isFile()) {
			String content = FileUtils.readFileToString(gradefile);
			// Display the file content
			System.out.println(content);
			
		    String[] lines = content.split("\\n");
		    for (String line: lines) {
		    	 System.out.println("***: " + line);
		    }
		} else {
			System.out.println("File not found!!!");
		}
	}
	
	public static void readFileApache3() throws IOException {
		File gradefile = new File("/src/sandbox/grades.txt");
		String content = FileUtils.readFileToString(gradefile);
		// Display the file content
		System.out.println(content);
		
	    String[] lines = content.split("\\n");
	    for (String line: lines) {
	    	 System.out.println("***: " + line);
	    }
	}
	
}
