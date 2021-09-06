package toBeSorted;

import java.util.ArrayList;
import java.util.Collections;

import utils.ArrayListUtils;

import java.io.IOException;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileBufferedReaderJava7 {
	public static void main(String[] args) {
		Path fileName = Paths.get("./Sandbox/grades.txt");		
		Charset charset = Charset.forName("US-ASCII");
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		/* Read grades from file and return an ArrayList of integers */
		grades = readGrades(fileName, charset);
		
		/* Display grades */
		ArrayListUtils.display(grades);
		
		/* Sort grades */
		Collections.sort(grades);
		
		/* Display grades after sorting */
		ArrayListUtils.display(grades);	
	} //main
	
	/* New in Java7: class Files and Path */
	static ArrayList<Integer> readGrades(Path fn, Charset cs) {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		try  (BufferedReader inFile = Files.newBufferedReader(fn, cs)) {
			String line;
			while ((line = inFile.readLine()) != null) {
				grades.add(Integer.parseInt(line));
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return grades;
	} //readGrades
}
