package polymorphism;

import java.time.LocalDate;

public class Book {
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	LocalDate returnDate;
	LocalDate dueDate;
	
	

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
	
	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return title + "\t\t" + author + "\t\t" + yearPublished;
	}
	
}
