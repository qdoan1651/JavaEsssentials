package coursera;

public class SchoolMonth extends Month {
	private boolean hasHolidays;
	private char semester;
	
	public SchoolMonth(int name) {
		super(name);
		setSemester();
		
	}
	
	public void setHolidays() {
		if ( getName() != 3 && getName() != 4 && getName() != 6 && getName() != 8) {
			hasHolidays = true;
		} else {
			hasHolidays = false;
		}
	}
	
	public void setSemester() {
		if ( getName() > 8 ) {
			semester = 'F';
		} else if ( getName() > 5 ) {
			semester = 'U';
		} else if ( getName() > 3) {
			semester = 'S';
		} else {
			semester = 'W';
		}
	}
	
	public boolean getHoliday() {
		return hasHolidays;
	}
	
	public char getSemester() {
		return semester;
	}
}
