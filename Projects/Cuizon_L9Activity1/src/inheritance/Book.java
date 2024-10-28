package inheritance;

public class Book {
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	
	

	public Book() {
	}
	
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.isRented=false;
	}
	
	public boolean getRented() {
		return isRented;
	}
	public void rent() {
		this.isRented = true;
	}

	@Override
	public String toString() {
		return title + "\t\t" + author + "\t\t" + yearPublished;
	}
	
}
