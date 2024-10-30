package library;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BookRentalSystem rent = new BookRentalSystem();
		rent.books[0].rent();
		rent.books[2].rent();
		rent.books[0].returnDate=LocalDate.of(2024, 11, 22);
		rent.books[2].returnDate=LocalDate.of(2024, 11, 15);
		rent.writeToFile();
		rent.readFromFile();
		rent.rentedBooks();
		
		
	}

}

