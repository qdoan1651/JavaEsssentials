package toBeSorted;

import java.io.File;

//import java.io.*;

public class FilesAndDirs {

	public static void main(String[] args) {
		
		// User home directory
		File homeDir = new File(System.getProperty("user.home"));
		//System.out.println(homeDir); // -> /User/Quyen
		
		// Current working directory
		File currDir = new File(System.getProperty("user.dir"));
		//System.out.println(currDir); // -> /User/Quyen/Dropbox/Java/Java
		
		// or
		File f = new File("");
		String currDir1 = f.getAbsolutePath();
		//System.out.println(currDir1);
		
		// Create directory 'TestDir' in the current directory
		//File testDir = new File(currDir, "TestDir");
		File testDir = new File("TestDir");
		if (testDir.exists()) {
			System.out.println("Directory '" + testDir + "' already exists.");
		} else {
			System.out.println("Creating directory '" + testDir + "'.");
			testDir.mkdir();
		}

			
		// List all files in the src/fileProcessing directory
		File srcDir = new File(currDir,"src/fileProcessing");
		String[] allFiles = srcDir.list();
		for (String file : allFiles) {
			//System.out.println(file);
			File tmp = new File(file);
			//System.out.println(tmp.getAbsolutePath());
		}

		// Delete a file
		File f1 = new File("./Sandbox/chars.bak");
		if (! f1.exists()) {
			System.out.println("File '" + f1 + "' does not exist.");
		} else if (f1.canWrite()) {
			System.out.println("Deleting file '" + f1 + "'...");
			f1.delete();
		} else {
			System.out.println("File '" + f1 + "' cannot be deleted");
		}
		
		// Renaming a file
		File source = new File("./Sandbox/grades.txt");
		File bak = new File("./Sandbox/grades.bak");
		if (! source.exists()) {
			System.out.println("Source file '" + source + "' does not exist.");
		} else {
			System.out.println("Copying file '" + source + "' to '" + bak + "'...");
			source.renameTo(bak);
		}
		
		File testFile = new File("./Sandbox/targets.txt");
		testFile.delete();
		
	}

}
