package lab4.lab4_3;

import java.time.LocalDate;

public abstract class Item {
	private int uid;
	private String title;
	private int no_copies;
	private LocalDate check_in;
	private LocalDate check_out;
	
	
	public void print(Item i) {
		System.out.println(i);
	}
	//constructors
	public Item(int uid, String title, int no_copies) {
		super();
		this.uid = uid;
		this.title = title;
		this.no_copies = no_copies;
		
	}
	public Item() {
		super();
		
		
	}
	public void additem(int uid, String title, int no_copies) {
		this.uid = uid;
		this.title = title;
		this.no_copies = no_copies;
	}
	
	//getters and setters
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo_copies() {
		return no_copies;
	}
	public void setNo_copies(int no_copies) {
		this.no_copies = no_copies;
	}
	public LocalDate getCheck_in() {
		return check_in;
	}
	public void setCheck_in(LocalDate check_in) {
		this.check_in = check_in;
	}
	public LocalDate getCheck_out() {
		return check_out;
	}
	public void setCheck_out(LocalDate check_out) {
		this.check_out = check_out;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((check_in == null) ? 0 : check_in.hashCode());
		result = prime * result + ((check_out == null) ? 0 : check_out.hashCode());
		result = prime * result + no_copies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + uid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (check_in == null) {
			if (other.check_in != null)
				return false;
		} else if (!check_in.equals(other.check_in))
			return false;
		if (check_out == null) {
			if (other.check_out != null)
				return false;
		} else if (!check_out.equals(other.check_out))
			return false;
		if (no_copies != other.no_copies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "uid=" + uid + "\ntitle=" + title + "\nno_copies=" + no_copies + "\ncheck_in=" + check_in
				+ "\n check_out=" + check_out;
	}
	
}
