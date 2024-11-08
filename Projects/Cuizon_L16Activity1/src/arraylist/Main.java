package arraylist;
//L10
import java.time.LocalDate;

public class Main {
	/**
	 * Initializes a BookRentalSystem
	 * 
	 *  @param args holds the value of a String array*/
	public static void main(String[] args) {
		BookRentalSystem rent = new BookRentalSystem();
		rent.displayBooks();
		rent.library.get(0).rent();
		rent.library.get(2).rent();
		rent.library.get(0).returnDate=LocalDate.of(2024, 11, 30);
		rent.library.get(2).returnDate=LocalDate.of(2024, 11, 23);
		rent.rentedBooks();
		
		
	}

}
