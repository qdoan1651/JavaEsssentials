package coursera;

public class Month {
	private int name;
	private int days;
	
	public Month(int name) {
		setMonth(name);
		
	}
	
	// Getters
	public int getName() {
		return name;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setMonth(int name) {
		this.name = name;
		if ( name ==  4 || name ==  6 || name == 9 || name == 11 ) {
			days = 30;
		} else if ( name == 2 ) {
			days = 28;
		} else {
			days = 31;
		}
	}
	
	public String toString() {
		return convertToString() + " has " + days + " days.";
	}
	
	public String convertToString() {
		switch (name) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
			default: return "Invalid month";
		}
	}

}
