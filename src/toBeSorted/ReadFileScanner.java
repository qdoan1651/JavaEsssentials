package toBeSorted;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import utils.ArrayListUtils;

import java.io.FileReader;

public class ReadFileScanner {

	public static void main(String[] args)  {	
		String gradeFile = "./Sandbox/grades.txt";
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		/* Read grades from file and return an ArrayList of integers */
		grades = readGrades(gradeFile);
		
		/* Display grades */
		ArrayListUtils.display(grades);
		
		/* Sort grades */
		Collections.sort(grades);
		
		/* Display grades after sorting */
		ArrayListUtils.display(grades);
	} //main
	
	/* Use Scanner to read grades from text file (one grade per line) 
	 * and return an ArrayList of integers */
	public static ArrayList<Integer> readGrades(String file) {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		try (Scanner inFile = new Scanner(new FileReader(file))) {
			while (inFile.hasNextLine()) {
				grades.add(Integer.parseInt(inFile.nextLine()));
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e);
		}	
		return grades;
	} 
}
