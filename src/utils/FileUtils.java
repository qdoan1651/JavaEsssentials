package utils;
/* Utilities for dealing with files:
 * - renameFile(source, target): rename the source file name to target file name
 */

import java.io.File;

public class FileUtils {

	public static void main(String[] args) {
		File filename = new File("src/sandbox/grades_david.txt");
		
		// Delete a file
		deleteFile(filename);

	}
	
	public static void renameFile(File src, File dst) {
		// TODO: add code here
	}
	
	public static void copyFile(File src, File targetFolder) {
		// TODO: add code here
	}
	
	public static void deleteFile(File filename) {
		if (filename.exists()) {
			filename.delete();
//			System.out.println("File deleted!");
		} else {
			System.out.println("File not found!");
		}
	}

}
