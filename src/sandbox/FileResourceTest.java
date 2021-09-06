package sandbox;

import utils.FileResource;

public class FileResourceTest {

	public static void main(String[] args) {
		FileResource fr = new FileResource("src/sandbox/Sample.txt");
		
		// test lines() method
		for (String line: fr.lines()) {
			System.out.println(line);
		}
		
		// test words() method
		for (String word: fr.words()) {
			System.out.println(word);
		}
		
	}
	
}
