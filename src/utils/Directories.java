package utils;
/* This script will traverse the entire directory tree
 * and returns/displays its content using some specified filters.
 */

import java.io.File;
import java.util.ArrayList;

public class Directories {

	public static void main(String[] args) {
		File dirname = new File("G:/Learning Center/Java/Java Programming 2 - Arrays, Lists, and Structured Data (Coursera Duke)");
		
		// Display the content of the entire directory tree
		displayDirectoryTree(dirname);
		
		// Not quite there yet. Only returns directory name. Why?
		// Get the content of the entire directory tree and returns as an ArrayList
//		ArrayList<String> dirFiles = getDirectoryTree(dirname);
//		for (String file: dirFiles) {
//			System.out.println(file);
//		}
		
	}
	
	public static void displayDirectoryTree(File dir) {
		// Display the content of the directory tree
		File[] files = dir.listFiles();
		
		for (File file: files) {
			Boolean dirFilter = !file.toString().contains("Resource");
			Boolean fileFilter= !file.toString().startsWith(".");
			if ( file.isDirectory() && dirFilter ) {
				System.out.println(file.getAbsolutePath());
//				System.out.println(file.getName());
				displayDirectoryTree(file);
			} else if ( file.isFile() && fileFilter ) {
				System.out.println(file.getName());
			}
		}
	}
	
	public static ArrayList<String> getDirectoryTree(File dir) {
		// Return the content of the directory tree with specified filters
		// Data is returned as an ArrayList
		ArrayList<String> retList = new ArrayList<>();
		
		// Traverse the directory tree and add content to retList ArrayList
		File[] files = dir.listFiles();
		for (File file: files) {
			Boolean dirFilter = true;
			Boolean fileFilter= true;
			if ( file.isDirectory() && dirFilter ) {
				retList.add(file.getAbsolutePath());
				getDirectoryTree(file);
			} else if ( file.isFile() && fileFilter ) {
				retList.add(file.getName());
			}
		}
		
		return retList;
		
	}

}
