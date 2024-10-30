package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import library.Book;
import library.FictionBook;
import library.NonFictionBook;

public class BookRentalSystem {
	private File f = new File("D:\\Cuizon\\Java Activities\\java-activities\\Projects\\Cuizon_L11Activity1\\Files\\library.txt");
	ObjectInputStream oiStream;
	ObjectOutputStream ooStream;
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
	/**
	 * Displays rented books with their due date, return date, and fine
	 * 
	 * @return No return value.
	 * */
	public static void rentedBooks() {
		System.out.println("\n* * * * * * * * * BOOKS RENTED , NEVER READ * * * * * * * * *");
		for(Book book:books){
			if(book.getRented()==true) {
					System.out.println(book.toString()+book.displayDates()+"\t\tFine: "+ book.calculateFine());
			}
		}
	}
	/**
	 * Writes the file library.txt
	 * 
	 * Stores the books array into the File f
	 * @return No return value.
	 * */
	public void writeToFile() {
		try {
			ooStream = new ObjectOutputStream(new FileOutputStream(f));
			ooStream.writeObject(books);
			ooStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	/**
	 * Reads the file library.txt
	 * 
	 * Converts the object to a Book array
	 * Iterate the array and prints each book
	 * 
	 * @return No return value.
	 * 
	 * */
	public void readFromFile() {
		System.out.println("* * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * *");
		try {
			oiStream  = new ObjectInputStream(new FileInputStream(f));
			Book[] readBooks = (Book[]) oiStream.readObject();
			for (Book book : readBooks) {
	            System.out.println(book);
	        }
			oiStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
