package lab4.lab4_3;

public class CDs  extends MediaItem   {
	private String artist;
	private String genre;
	

	public void additem(int uid, String title, int no_copies, int runtime,String artist,String genre) {
		super.additem(uid, title, no_copies, runtime);
		this.artist=artist;
		this.genre= genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public CDs() {
		super();
		
	}

}
