package library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NonFictionBook extends Book{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int FINE_PER_DAY = 5;
	private final int MAX_ALLOWABLE_DAY = 14;
	
	public NonFictionBook(String title, String author, int yearPublished) {
		super( title, author,yearPublished);
	}
	
	public int getFine() {
		return FINE_PER_DAY;
	}
	
	public int getMaxDays() {
		return MAX_ALLOWABLE_DAY;
	}
	
	public void rent() {
	    super.rent();
	    super.dueDate = LocalDate.now().plusDays(getMaxDays());
	}
	
	public LocalDate getDueDate() {
		super.dueDate = LocalDate.now().plusDays(MAX_ALLOWABLE_DAY);
		return super.dueDate;
	}

	public double calculateFine() {
	    return super.getReturnDate() != null && super.getReturnDate().isAfter(super.dueDate)
	            ? getFine() * ChronoUnit.DAYS.between(super.dueDate, super.getReturnDate())
	            : 0;
	}
	
	public String displayDates() {
		return "\tDue date: "+ getDueDate()+"\tReturn date: " + super.getReturnDate();
	}
}

