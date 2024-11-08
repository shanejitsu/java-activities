package arraylist;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//L10
public class Book {
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	LocalDate returnDate;
	LocalDate dueDate;

	/**
	 * Initializes the values of the fields title,author,yearPublished using the
	 * parameters. It also initializes the value of isRented to false.
	 * 
	 * @param title         holds the value of type String
	 * @param author        holds the value of type String
	 * @param yearPublished holds the value of type Integer
	 */
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.isRented = false;
	}

	/**
	 * Gets the value of the isRented field
	 * 
	 * @return true if the book is rented
	 * @return false if the book is not rented
	 */
	public boolean getRented() {
		return isRented;
	}

	/**
	 * updates the value of isRented field to true.
	 * 
	 * @return void
	 */
	public void rent() {
		this.isRented = true;
	}

	/**
	 * gets the value of returnDate field
	 * 
	 * @return returnDate of the rented book of type LocalDate
	 */
	public LocalDate getReturnDate() {
		return returnDate;
	}

	/**
	 * sets the value of the returnDate field
	 * 
	 * @return void
	 */
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	/**
	 * sets the value of the setDueDate field
	 * 
	 * @return void
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * calculates the fine of book using the dueDate and returnDate Implemented by
	 * the child class
	 * 
	 * @return fine holds the value of type double
	 */
	public double calculateFine() {
		return 0;
	}

	public String displayDates() {
		return "";
	}

	/**
	 * Overrides the Object function toString and formats it by returning books'
	 * title,author,and yearPublished
	 * 
	 * @return title, author, and yearPublished in the value of String*/
	@Override
	public String toString() {
		return title + "\t\t" + author + "\t\t" + yearPublished;
	}

}
