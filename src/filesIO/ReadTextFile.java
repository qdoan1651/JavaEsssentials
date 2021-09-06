package filesIO;
/* There are several ways to read text files.
 * 1. Using Java built-in 
 * 2. Using Apache FileUtils.readFileToString() method
 */

import java.io.FileReader;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFile {
	
	public static void main(String[] args) {
		readFileBufferedReader();
		readFileScanner();
		readFileApache();
		readFilePreJava7();
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
	
	public static void readFileApache() {
		// import org.apache.commons.io.FileUtils;
		
		File gradefile = new File("/src/sandbox/grades.txt");
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
	
	// Duke Coursera: Java3.Week4.Part2.Mainstream Java.pdf (page 50)
	public static void readAndPrint() throws IOException {
		/* Note: Path, Paths, Files are from java.nio package */
		Path p = Paths.get("src/sandbox/grades.txt");
		BufferedReader reader = Files.newBufferedReader(p);
		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
	}

}
