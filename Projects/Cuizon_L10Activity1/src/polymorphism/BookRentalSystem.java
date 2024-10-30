package polymorphism;
//L10
public class BookRentalSystem {
	static Book[] books= {
			new FictionBook("The Lord of the Rings","J.R.R. Tolkien",1954),
			new FictionBook("To Kill a Mockingbird","Harper Lee",1960),
			new NonFictionBook("The Tipping Point","M. Gladwell",2000),
			new NonFictionBook("Guns, Germs, and Steel","Jared Diamond",1997)
	};

	public static void displayBooks() {
		System.out.println("* * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * *");
		for(Book book:books){
				System.out.println(book.toString());
		}
	}
	
	public static void rentedBooks() {
		System.out.println("\n* * * * * * * * * BOOKS RENTED , NEVER READ * * * * * * * * *");
		for(Book book:books){
			if(book.getRented()==true) {
					System.out.println(book.toString()+book.displayDates()+"\t\tFine: "+ book.calculateFine());
			}
		}
	}
	
}
