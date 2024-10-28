package polymorphism;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NonFictionBook extends Book{
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
	
	public LocalDate getDueDate() {
		super.dueDate = LocalDate.now().plusDays(MAX_ALLOWABLE_DAY);
		return super.dueDate;
	}

	public double calcuateFine() {
		return super.getReturnDate().isAfter(getDueDate())
				? getFine()* (ChronoUnit.DAYS.between(super.getReturnDate(), getDueDate()))
				: 0;
	}
	
	public String displayDates() {
		return "Due date: "+ getDueDate()+"\tReturn date: " + super.getReturnDate();
	}
}