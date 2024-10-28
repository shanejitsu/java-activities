package polymorphism;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BookRentalSystem rent = new BookRentalSystem();
		rent.displayBooks();
		rent.books[0].rent();
		rent.books[1].rent();
		rent.books[0].returnDate=LocalDate.of(2025, 04, 10);
		rent.books[1].returnDate=LocalDate.of(2025, 04, 10);
		rent.rentedBooks();
		
		
	}

}
