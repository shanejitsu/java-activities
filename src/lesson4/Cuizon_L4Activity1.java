package lesson4;

import java.util.Scanner;

public class Cuizon_L4Activity1 {
	// create print function para chada
	private static int getContact(String[] list, String contact) {
		if(list[0]==null) {
			return -1;
		}else {
			for (int i = 0; i < list.length; i++) {
				if (list[i].toLowerCase().contentEquals(contact)) {
					return i;
				}
			}
		}
		return -1;
	}

	private static void getContactNames(String[] name) {
		if (name[0] == null) {
			System.out.println("Message: You currently do not have any contacts.\n");
		}else {
			System.out.println("Contact List:");
			for (int i = 0; i < name.length; i++) {
				
				if (name[i] == null) {
					break;
				}
				System.out.println("\t[" + (i+1) + "]\t" + name[i]);
			}
			System.out.println("\n");
		}
	}


	public static void main(String[] args) {
		int ARRAY_LENGTH = 5;
		String[] name = new String[ARRAY_LENGTH];
		String[] phoneNumber = new String[ARRAY_LENGTH];
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
				for (int i = current; i < ARRAY_LENGTH; i++) {
					System.out.print("Input name #" + (i + 1) + " here: ");
					input = s.nextLine();
					if (input.toLowerCase().contentEquals("n/a")) {
						current = i;
						System.out.println("\n");
						break;
					}
					name[i] = input;

					System.out.print("Input number of name #" + (i + 1) + " here: ");
					phoneNumber[i] = s.nextLine();
				}
				System.out.println("\n");
				break;
			case "s":
				System.out.print("Search a name: ");
				input = s.nextLine();
				int index = getContact(name, input);
				if (index >= 0 && index < name.length) {
					System.out.println("Name:" + name[index]);
					System.out.println("Phone number:" + phoneNumber[index] + "\n");
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
