package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileResource {
	private String filename;
	public FileResource(String filename) {
		this.filename = filename;
	}
	
	/* Method to return an array list of lines from the file 
	 * Usage: 
	 * FileResource fr = new FileResource("filename.txt");
	 * for (String line: fr.lines() {
	 *    System.out.println(line); 
	 * } 
	 */
	public ArrayList<String> lines() {
		ArrayList<String> content = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filename)) ) {
			String line;
			while ( (line = reader.readLine()) != null ) {
				//System.out.println(s);
				content.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Message: " + e.getMessage());
		} catch (IOException e) {
			System.out.print("IOException. Message: " + e.getMessage());
		}
		
		return content;
	}
	
	/* Method to return an array list of words from the file with comma, period, ! stripped off.
	 * Usage: 
	 * FileResource fr = new FileResource("filename.txt");
	 * for (String word: fr.words() {
	 *    System.out.println(word); 
	 * } 
	 */
	public ArrayList<String> words() {
		ArrayList<String> content = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filename)) ) {
			String line;
			while ( (line = reader.readLine()) != null ) {
				//System.out.println(s);
				String pattern = "\\s|\\.|,|!";
				String[] items = line.split(pattern);
				for (String item: items) {
					content.add(item);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Message: " + e.getMessage());
		} catch (IOException e) {
			System.out.print("IOException. Message: " + e.getMessage());
		}
		
		return content;
	}
}
