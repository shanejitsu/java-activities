package lambda;

public class Song {
	String title;
	String artist;

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String toString() {
		return title +" - " + artist;
	}
}
