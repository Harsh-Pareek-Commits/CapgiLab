package lab4.lab4_3;

import java.time.LocalDate;

public class Journal  extends WrittenItem   {
private String year;
	
	public String getYear() {
	return year;
}
	public void additem(int uid, String title, int no_copies,String year) {
		super.additem(uid, title, no_copies);
		this.year=year;
	}

public void setYear(String year) {
	this.year = year;
}

	public Journal() {
		super();
	
	}
}
