package lesson3_2;

import java.util.Scanner;

public class Cuizon_Lesson32Activity3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] bag = { "Master Ball", "Pokeball", "Escape Rope", "Shards" };
		String[] stats = { "23042024", "Jorjj Ang Barker sa Mingla", "500000", "69" };
		String input;

		do {
			System.out.println("[A] BAG");
			System.out.println("[B] STATS");
			System.out.println("[C] SAVE");
			System.out.println("[D] EXIT\n");
			System.out.print("Enter option here: ");
			input = s.nextLine();
			
			switch (input.toLowerCase()) {
			case "a":
				for (String item : bag) {
					System.out.println("- " + item);
				}
				System.out.println("\n");
				break;
			case "b":
				System.out.println("Trainer's ID: " + stats[0]);
				System.out.println("Trainer's Name: " + stats[1]);
				System.out.println("Money: " + stats[2]);
				System.out.println("Pokedex: " + stats[3] + "\n");
				break;
			case "c":
				System.out.println("Game play saved!\n");
				break;
			case "d":
				System.out.println("Exit game...");
				break;
			default:
				System.out.println("I don't see that from the choices. Pick again! (>.<)\n");
				break;
			}

		} while (!input.toLowerCase().contentEquals("d"));
	}

}
