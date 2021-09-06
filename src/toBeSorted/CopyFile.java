package toBeSorted;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sandbox.Strings;

public class CopyFile {

	public static void main(Strings[] args) throws FileNotFoundException {
		try {
			File f1 = new File("TestFile.txt");
			File f2 = new File("target.txt");
			
			InputStream in = new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2);
			
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			in.close();
			out.close();
			System.out.println("File copied.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
