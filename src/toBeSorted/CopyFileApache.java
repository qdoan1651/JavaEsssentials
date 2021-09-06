package toBeSorted;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import sandbox.Strings;

public class CopyFileApache {

	public static void main(Strings[] args) throws FileNotFoundException {
		try {
			File f1 = new File("TestFile.txt");
			File f2 = new File("target.txt");
			
			FileUtils.copyFile(f1, f2);
			
			System.out.println("File copied.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
