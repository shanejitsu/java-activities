package exception_handling;

import java.util.Scanner;

public class Phonebook {
	private static Contact[] contacts = new Contact[5];
	int totalContacts = 0;
	Scanner s = new Scanner(System.in);

	public void open() {
		int ARRAY_LENGTH = 5;
		String choice;
		String input;
		int number;

		do {
			System.out.println(
					"[A] - Add contact\n" + "[S] - Search Contact\n" + "[L] - Show Contact List\n" + "[E] - Exit\n");
			System.out.print("Choice: ");
			choice = s.nextLine();
			switch (choice.toLowerCase()) {
			case "a":
				addContact();
				break;
			case "s":
				break;
			case "l":
				break;
			case "e":
				break;
			default:
				System.out.println("That's not on the choices. Please pick again.");
				break;
			}
		} while (!choice.toLowerCase().contentEquals("e") && totalContacts != contacts.length);
	}

	public void addContact() {
		
		System.out.println("Contact #" + (totalContacts+1));
		System.out.print("Name: ");
		String name = s.nextLine();
		System.out.print("Phone number: ");
		int phoneNumber = s.nextInt();
		try {
			if (Integer.toString(phoneNumber).length() != 10) {
                throw new IllegalArgumentException("Please make sure to input only 10 digits.");
            }
			contacts[totalContacts] = new Contact(name, phoneNumber);
		}catch(IllegalArgumentException ex) {
			System.out.println("Error: Phone number is more than 10 digits.");
		}
		
		
	}

	private static int getContactIndex(String contact) {
		if (contacts[0] == null) {
			return -1;
		} else {
			for (int i = 0; i < contacts.length; i++) {
				if (contacts[i].getName().toLowerCase().contentEquals(contact.toLowerCase())) {
					return i;
				} else {
					return -2;
				}
			}
		}
		return -1;
	}

	private static void getAllContactNames() {
		if (contacts[0] == null) {
			System.out.println("Message: You currently do not have any contacts.\n");
		} else {
			System.out.println("Contact List:");
			for (int i = 0; i < contacts.length; i++) {

				if (contacts[i] == null) {
					break;
				}
				System.out.println("\t[" + (i + 1) + "]\t" + contacts[i]);
			}
			System.out.println("\n");
		}
	}

}
