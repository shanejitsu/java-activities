package arraylist;

import java.util.ArrayList;

//L10
public class BookRentalSystem {
	ArrayList<Book> library = new ArrayList<Book>() {
		private static final long serialVersionUID = 1L;
		{
			add(new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954));
			add(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
			add(new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
			add(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997));
		}
	};

	/**
	 * Displays a list of all the books in the ArrayList library
	 * 
	 * @return void
	 */
	public void displayBooks() {
		System.out.println("* * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * *");
		for (Book book : library) {
			System.out.println(book.toString());
		}
	}
	/**
	 * Displays a list of all the rented books in the ArrayList library
	 * 
	 * @return void
	 */
	public void rentedBooks() {
		System.out.println("\n* * * * * * * * * BOOKS RENTED , NEVER READ * * * * * * * * *");
		for (Book book : library) {
			if (book.getRented() == true) {
				System.out.println(book.toString() + book.displayDates() + "\t\tFine: " + book.calculateFine());
			}
		}
	}

}
