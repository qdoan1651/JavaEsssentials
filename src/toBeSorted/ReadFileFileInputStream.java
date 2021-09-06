/* Java, A Beginner's Guide
 * Chapter 10 Using IO (Reading and Writing Files Using Byte Stream) */

package toBeSorted;

import java.io.IOException;
import java.io.FileInputStream;

public class ReadFileFileInputStream {
	public static void main(String[] args)  {	
		String fileName = "./Sandbox/grades.txt";
		try {
			FileInputStream inFile = new FileInputStream(fileName);
			int i;
			while ((i = inFile.read()) != -1) {
				System.out.println(i);
			}
			inFile.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	} //main
	

	
}
