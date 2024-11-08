package hashmap;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phonebook {

	static HashMap<String, Long> contacts;
//	private static Contact[] contacts = new Contact[5];
	int totalContacts;
	Scanner scn = new Scanner(System.in);

	public static class OutOfBoundDigitsException extends Exception {
		private static final long serialVersionUID = 1L;

		public static void validateDigits(long number) throws OutOfBoundDigitsException {
			String str;
			int str_length;
			boolean isValid = false;
			str = Long.toString(number);
			str_length = str.length();
			if (str_length == 10) {
				isValid = true;
			} else {
				isValid = false;
			}
			if (isValid == false) {
				throw new OutOfBoundDigitsException();
			}
		}

	}

	public Phonebook() {
		contacts = new HashMap<>();
		contacts.put("Viktor Magtatanggol", 9876543210L);
		contacts.put("Viky Manananggal", 5467382910L);
		contacts.put("Pedro Penduko", 192837645L);
		contacts.put("Ultraman", 3692580147L);
		contacts.put("Power Rangers", 7410852963L);
	}

	/**
	 * Displays the option menu
	 * 
	 * @return void
	 */
	public static void showMenu() {
		System.out.println("[1] Add contact\n" + "[2] Display Contact\n" + "[3] Search Contact\n" + "[4] Close\n");
	}

	/**
	 * Opens the phonebook
	 * 
	 * @return void
	 */
	public void open() {
		int option = 0;

		while (true) {
			System.out.println("* - * - * - * - Shane's Phonebook - * - * - * - *");
			showMenu();
			System.out.print("Choice: ");
			try {
				option = scn.nextInt();
				scn.nextLine();
				switch (option) {
				case 1:// add
					addContact();
					break;
				case 2:// display
					displayContacts();
					break;
				case 3:// search
					searchContact();
					break;
				case 4:
					System.out.println("Bye.");
					break;
				default:
					System.out.println("That's not on the choices. Please pick again.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Make sure to only input an integer between 1-5.");
				scn.nextLine();
			}
			if (option == 4) {
				break;
			}
		}
	}

	/**
	 * Adds a contact
	 */
	public void addContact() {

		System.out.print("Input name here: ");
		String name = scn.nextLine();
		try {
			if (!name.matches("[a-zA-Z ]+")) {
				throw new IllegalArgumentException("Name can only contain letters and spaces.");
			}
			boolean validPhone = false;
			while (!validPhone) {
				System.out.print("Input number of " + name + " here: ");
				try {
					long tempNum = scn.nextLong();
					scn.nextLine();
					OutOfBoundDigitsException.validateDigits(tempNum);
					contacts.put(name, tempNum);
					validPhone = true;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input! Only whole numbers are allowed.");
					scn.nextLine();
				} catch (Phonebook.OutOfBoundDigitsException e) {
					System.out.println("Error: Make sure you input exactly 10 digits.");
				}
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

		long number = scn.nextLong();
		scn.nextLine();
		contacts.put(name, number);
	}

	public void displayContacts() {
		for (String contact : contacts.keySet()) {
			System.out.println("+ " + contact);

		}
		System.out.println("\n");
	}

	public void searchContact() {
		System.out.print("Search a name: ");
		String name = scn.nextLine().toLowerCase();
		boolean found = false;

		for (String contactName : contacts.keySet()) {
			if (contactName.toLowerCase().contains(name)) {
				System.out.println("Name: " + contactName + "\nPhone number: " + contacts.get(contactName));
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Contact not found.");
		}
	}

}
