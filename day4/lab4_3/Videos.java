package lab4.lab4_3;

import java.time.LocalDate;

public class Videos  extends MediaItem   {
	private String director;
	private String genre;
	private String year_released;

	public Videos() {
		super();
		
	}
	public void additem(int uid, String title, int no_copies, int runtime,String director,String genre,String year) {
		super.additem(uid, title, no_copies, runtime);
		this.director=director;
		this.genre= genre;
		this.year_released=year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear_released() {
		return year_released;
	}

	public void setYear_released(String year_released) {
		this.year_released = year_released;
	}

}
