package library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
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
		this.isRented = false;
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
	public LocalDate getDueDate() {
		return dueDate;
	}

	public double calculateFine() {
		return getReturnDate().isAfter(dueDate)
		? ChronoUnit.DAYS.between(getReturnDate(), dueDate)
		: 0;
	}

	public String displayDates() {
		return "\tDue date: " + dueDate + "\tReturn date: " + getReturnDate();
	}
	

	@Override
	public String toString() {
		return title + "\t\t" + author + "\t\t" + yearPublished;
	}

}
