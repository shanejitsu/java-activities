package inheritance;

public class Main {

	public static void main(String[] args) {
		BookRentalSystem rent = new BookRentalSystem();
		rent.displayBooks();
		rent.books[0].rent();
		rent.books[1].rent();
		rent.rentedBooks();
		
	}

}
