// http://www.tutorialspoint.com/java/java_regular_expressions.htm
// Find the digit string in an alphanumeric string

package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSearchingPatterns {
	
    public static void main( String args[] ){

      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3456! OK?";
      String pattern = "(.*?)(\\d+)(.*)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Number of match group: " + m.groupCount()); 
         System.out.println("Group 0 value: " + m.group(0) );
         System.out.println("Group 1 value: " + m.group(1) );
         System.out.println("Group 2 value: " + m.group(2) );
         System.out.println("Group 3 value: " + m.group(3) );
      } else {
         System.out.println("NO MATCH");
      }
   }
}
/* Output:
 * Number of match group: 3
 * Group 0 value: This order was placed for QT3456! OK?
 * Group 1 value: This order was placed for QT
 * Group 2 value: 3456
 * Group 3 value: ! OK?
*/
