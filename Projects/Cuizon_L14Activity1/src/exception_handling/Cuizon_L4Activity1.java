package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.OutOfBoundDigitsException;

public class Cuizon_L4Activity1 {

	private static int getContact(String[] list, String contact) {
		if (list[0] == null) {
			return -1;
		} else {
			for (int i = 0; i < list.length; i++) {
				if (list[i].toLowerCase().contentEquals(contact.toLowerCase())) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * Prints the names of all contacts in the names array
	 * 
	 * @param name String[]
	 * @return void
	 */
	private static void getContactNames(String[] names) {
		if (names[0] == null) {
			System.out.println("Message: You currently do not have any contacts.\n");
		} else {
			System.out.println("Contact List:");
			for (int i = 0; i < names.length; i++) {
				if (names[i] == null) {
					break;
				}
				System.out.println("\t[" + (i + 1) + "]\t" + names[i]);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int ARRAY_LENGTH = 2;
		String[] name = new String[ARRAY_LENGTH];
		long[] phoneNumber = new long[ARRAY_LENGTH];
		String choice;
		String input;
		int current = 0;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println(
					"[A] - Add contact\n" + "[S] - Search Contact\n" + "[L] - Show Contact List\n" + "[E] - Exit\n");
			System.out.print("Choice: ");
			choice = s.nextLine();
			switch (choice.toLowerCase()) {
			case "a":
				for (int i = current; i < ARRAY_LENGTH;) {
					System.out.print("Input name #" + (i + 1) + " here: ");
					input = s.nextLine();
					try {
						// Ensure name contains only letters and spaces (no numbers)
						if (!input.matches("[a-zA-Z ]+")) {
							throw new IllegalArgumentException("Name can only contain letters and spaces.");
						}
						name[i] = input;

						boolean validPhone = false;
						while (!validPhone) {
							System.out.print("Input number of name #" + (i + 1) + " here: ");
							try {
								long tempNum = s.nextLong();
								s.nextLine();

								// Validate phone number using OutOfBoundDigitsException
								OutOfBoundDigitsException.validateDigits(tempNum);
								phoneNumber[i] = tempNum;
								validPhone = true;
							} catch (InputMismatchException e) {
								System.out.println("Invalid input! Only whole numbers are allowed.");
								s.nextLine();
							} catch (OutOfBoundDigitsException e) {
								System.out.println("Error: Make sure you input exactly 10 digits.");
							}
						}

						i++; 
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage());
					}
				}
				current = current + 1;
				System.out.println("\n");
				break;

			case "s":
				System.out.print("Search a name: ");
				input = s.nextLine();
				int index = getContact(name, input);
				if (index >= 0 && index < name.length) {
					System.out.println("Name: " + name[index]);
					System.out.println("Phone number: " + phoneNumber[index] + "\n");
				} else {
					System.out.println("There is no contact with this name.\n");
				}
				break;

			case "l":
				getContactNames(name);
				break;

			case "e":
				break;

			default:
				System.out.println("That's not on the choices. Please pick again.");
				break;
			}
		} while (!choice.toLowerCase().contentEquals("e"));
	}
}
