package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Cuizon_Exercise3 {
	static Scanner s = new Scanner(System.in);

	private static boolean hasVacant(int num, boolean[] seats) {
		if (num == 1) {
			for (int i = 0; i < 5; i++) {
				if (seats[i] == false) {
					return true;
				}
			}
		} else if (num == 2) {
			for (int i = 5; i < 10; i++) {
				if (seats[i] == false) {
					return true;
				}
			}
		}
		return false;
	}

	private static int assignSeat(int num, boolean[] seats) {
		int input;
		if (num == 1) {// first class
			for (int i = 0; i < 5; i++) {
				if (seats[i] == false) {
					seats[i] = true;
					return i + 1;
				}
			}

			System.out.println("Unfortunately, this class is full. Would you like to go economy?\n" + "\t[1] - Yes\n"
					+ "\t[2] - No");
			System.out.print("Choice: ");
			input = s.nextInt();

			if (input == 1) {
				return assignSeat(2, seats);
			}
		} else if (num == 2) {// economy
			for (int i = 5; i < 10; i++) {
				if (seats[i] == false) {
					seats[i] = true;
					return i + 1;
				}
			}
			System.out.println("Unfortunately, this class is full. Would you like to go first class?\n"
					+ "\t[1] - Yes\n" + "\t[2] - No");
			System.out.print("Choice: ");
			input = s.nextInt();

			if (input == 1) {
				return assignSeat(1, seats);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int ARRAY_SIZE = 10;
		boolean[] planeSeats = new boolean[ARRAY_SIZE];
		Arrays.fill(planeSeats, false);
		int choice;

		do {
			System.out.println("Airline Reservations System:\n" 
								+ "\tType [1] for First Class\n" 
								+ "\tType [2] for Economy\n"
								+ "\tType [0] to Cancel");
			System.out.print("Choice: ");

			choice = s.nextInt();
			switch (choice) {
			case 0:
				break;
			case 1:
			case 2:
				int seat = assignSeat(choice, planeSeats);
				if (seat != -1) {
					System.out.println("You are in seat #" + seat + ".\nHave a safe flight!\n");
				} else {
					System.out.println("Next flight leaves in 3 hours.");
				}
				break;
			default:
				System.out.println("That's not on the choices. Please pick again.");
				break;
			}

		} while (choice!=0 && (hasVacant(1, planeSeats) || hasVacant(2, planeSeats)));

		System.out.println("The plane is full. Time to take off.");

	}

}
