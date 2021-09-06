/*
 * Use Apache common io for managing files and directories before Java7
 * Use Java7, use nio Path and Files class
 */

package filesDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Directories {
	
	public static void main(String[] args) throws IOException {
//		copyFiles();
//		createDir();
		listDir();
	}

	public static void misc() throws IOException {
		File homeDir = new File(System.getProperty("user.home"));
		System.out.println("User home directory is: " + homeDir);
		
		File currentDir = new File(System.getProperty("user.dir"));
		System.out.println("Current working directory: " + currentDir);
		
		/* Another way to get current working directory */
		File f = new File("");
		System.out.println("Current working directory: " + f.getAbsolutePath());
		
	}
	
	public static void listDir() {
		/* List directory 'regex' */
		File currentDir = new File(System.getProperty("user.dir"));
		File regexDir = new File(currentDir, "src/regex");
		String[] files = regexDir.list();
		System.out.println("Content of directory '" + regexDir + "':");
		for (String file: files) {
			System.out.println(file);
		}
	}
	
	public static void createDir() {
		// Creating a directory for output
		File currentDir = new File(System.getProperty("user.dir"));
		String outdirname = "output/HW1.2"; 
		File outputDir = new File(currentDir, outdirname);
		if (outputDir.exists()) {
			System.out.println("'" + outputDir + "' already exists. Cannot create this directory.");
		} else {
			System.out.println("Creating directory '" + outdirname + "'...");
			outputDir.mkdir();
		}
	}
	
	public static void copyFiles() throws IOException {
		/* Copying file in Java 7 using java.nio class */
		Path source = Paths.get("output/HW1.1/HW1.1_Q1.PNG");
		Path dest = Paths.get("output/HW1.2/HW1.1_Q1.PNG");
		System.out.println("Copying file 'HW1.1_Q1.PNG' from HW1.1 to HW1.2...");
		Files.copy(source,  dest, StandardCopyOption.REPLACE_EXISTING);
	}

}
