package collections;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
	// Java Essential Training by David Gasner (6.3 Parsing string values)
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d); // Wed Aug 10 14:12:45 PDT 2016
		System.out.println(d.getTime()); // 1470863565768
		
		// Doing math with Gregorian Calendar
		GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime(); // convert GC to Date
		
		// Using DateFormat class to reformat the date
		DateFormat df = DateFormat.getDateInstance();
		String sd = df.format(d2);
		System.out.println(sd); // Mar 1, 2009
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
		String sd2 = df2.format(d2);
		System.out.println(sd2); // Sunday, March 1, 2009
	}
}
