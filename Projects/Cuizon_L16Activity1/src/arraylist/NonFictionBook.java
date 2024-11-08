package arraylist;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//L10
public class NonFictionBook extends Book {
	private final int FINE_PER_DAY = 5;
	private final int MAX_ALLOWABLE_DAY = 14;

	/**
	 * Calls the parent constructor and passes the valuesof title, author, and
	 * yearPublished
	 * 
	 * @param title         holds the value of String
	 * @param author        holds the value of String
	 * @param yearPublished holds the value of Integer
	 */
	public NonFictionBook(String title, String author, int yearPublished) {
		super(title, author, yearPublished);
	}

	/**
	 * Calls the parent class rent() function to mark the book as rented sets the
	 * book due date using LocalDate
	 * 
	 * @return void
	 */
	public void rent() {
		super.rent();
		super.dueDate = LocalDate.now().plusDays(MAX_ALLOWABLE_DAY);
	}
	/**
	 * sets the value of due date
	 * 
	 * @return dueDate holds the value of LocalDate
	 */
	public LocalDate getDueDate() {
		super.dueDate = LocalDate.now().plusDays(MAX_ALLOWABLE_DAY);
		return super.dueDate;
	}
	/**
	 * calculates the fine of book using the difference of dueDate and returnDate
	 * multiplied by the fine per day value
	 * 
	 * @return fine holds the value of type double
	 */
	public double calculateFine() {
		return super.getReturnDate() != null && super.getReturnDate().isAfter(super.dueDate)
				? FINE_PER_DAY * ChronoUnit.DAYS.between(super.dueDate, super.getReturnDate())
				: 0;
	}
	/**
	 * formats the output of due date and return date.
	 * 
	 * @return due date and return date of type String
	 */
	public String displayDates() {
		return "\tDue date: " + getDueDate() + "\tReturn date: " + super.getReturnDate();
	}
}
