package sandbox;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesAndTime {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		// Formatting date
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(date));		
		// DEFAULT (same as above)
		//DateFormat df1 = DateFormat.getDateInstance(DateFormat.DEFAULT);
		//System.out.println(df1.format(date));
		
		// FULL format
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df2.format(date));
		
		// SHORT format
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df3.format(date));
		
		// LONG format
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df4.format(date));
		
		//Use Gregorian calendar to manipulate date (add)
		GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();
	}
}
