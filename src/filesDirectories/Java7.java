// Ch.7: Managing files and directories (Java Advanced Training with David Gassner)
package filesDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Java7 {
	public static void main(String[] args) throws IOException {
		// The Path class
		filePath();
		
		// Copy file (in the same directory)
		copyFile();
		
		// Delete file
		deleteFile();
		
		// Move a file
		moveFile();
		
		// Rename a file (in the same directory)
		
		
		// Create directory
		createDir();
		
		// Delete (empty) directory
		deleteDir();
		
		// Walk directory
		
		// Walk directory manually using recursion
	}
	
	public static void filePath() throws IOException {
		Path path = Paths.get("sample.txt");
		System.out.println(path.toString()); // sample.txt
		System.out.println(path.getFileName()); // sample.txt
		
		File currentDir = new File(System.getProperty("user.dir"));
		System.out.println(currentDir);
		// C:/Dev/LocalGitRepos/Java\DavidGassner
		
		// Using relative path to the current working directory
		Path path2 = Paths.get("src/sandbox/ReadNetworkFile.java");
		System.out.println(path2.toString()); // src\sandbox\ReadNetworkFile.java
		System.out.println(path2.getFileName()); // ReadNetworkFile.java
		System.out.println(path2.getNameCount()); // 3
		System.out.println(path2.getName(0)); // src
		System.out.println(path2.getName(1)); // sandbox
		System.out.println(path2.getName(2)); // ReadNetworkFile.java
		// Returns the name of the file (regarding how many levels of directory)
		System.out.println(path2.getName(path2.getNameCount() - 1)); // ReadNetworkFile.java
		
		// use toRealPath() method to include the whole path to the file
		Path realPath = path2.toRealPath(LinkOption.NOFOLLOW_LINKS);
		System.out.println(realPath);
		// C:\Dev\LocalGitRepos\Java\DavidGassner\src\sandbox\ReadNetworkFile.java
		
		// Using absolute path 
		Path path3 = Paths.get("G:/Documents/debug.log");
		System.out.println(path3.toString()); // G:\Documents\debug.log
		System.out.println(path3.getFileName()); // debug.log
	}
	
	public static void copyFile() throws IOException {
		Path source = Paths.get("src/sandbox/file1.java");
		Path dest = Paths.get("src/sandbox/file2.java");
		Files.copy(source,  dest, StandardCopyOption.REPLACE_EXISTING);
	}
	
	public static void deleteFile() throws IOException {
		Path filename = Paths.get("src/sandbox/file2.java");
		Files.delete(filename);
	}
	
	public static void moveFile() throws IOException {
		Path sourceFile = Paths.get("src/sandbox/file1.java");
		Path destDir = Paths.get("src/sandbox");
		Files.copy(sourceFile,  destDir, StandardCopyOption.REPLACE_EXISTING);
	}
	
	public static void createDir() throws IOException {
		Path dir = Paths.get("G:/Downloads/TestJava7");
		Files.createDirectory(dir);
	}
	public static void deleteDir() throws IOException {
		// Only delete empty directory. Throws exception if directory is not empty
		Path dir = Paths.get("G:/Downloads/TestJava7");
		Files.delete(dir);
	}
	
}
