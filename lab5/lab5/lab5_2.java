package lab5;

import java.util.Scanner;

class Person {
	String fname;
	String lname;

	Person(String fn, String ln) throws InvalidDetails {
		checkName(fn, ln);

	}

	public void checkName(String fn, String ln) throws InvalidDetails {
		if ((fn.equals("")) || (ln.equals(""))) {
			throw new InvalidDetails("Blank first name or last name entered");
		} else {
			this.fname = fn;
			this.lname = ln;

		}
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}

class InvalidDetails extends Exception {
	InvalidDetails(String s) {
		super(s);
	}
}

public class lab5_2 {

	public static void main(String[] args) {
		System.out.println("Enter the first name:");
		Scanner sc = new Scanner(System.in);
		String fn = sc.nextLine();
		System.out.println("Enter the last name:");
		String ln = sc.nextLine();

		try {
			Person p = new Person(fn, ln);
		} catch (Exception e) {
			System.out.println("Exception= " + e);
		}
	}

}
