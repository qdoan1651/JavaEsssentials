package filesDirectories;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;

public class Apache {
	public static void main(String[] args) {
		
	}
	
	public static void apacheCommonIO() {
		// http://stackoverflow.com/questions/5841620/how-to-read-directories-in-java
        // Get a Collection of files in a directory without looking in subdirectories
        Collection<File> files = FileUtils.listFiles(new File("G:/Learning Center"), FileFilterUtils.trueFileFilter(), null);

        for ( File f : files ) {
            System.out.println( f );
//            System.out.println( f.getName() );
        }
	}
}
