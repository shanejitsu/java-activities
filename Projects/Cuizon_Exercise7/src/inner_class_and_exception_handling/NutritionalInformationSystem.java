package inner_class_and_exception_handling;

import java.util.Scanner;

public class NutritionalInformationSystem {

	/**
	 * Enum of types of fruits. Each fruit has calories and vitamin.
	 */
	enum Fruit {
		APPLE(95, 7.9), BANANA(105, 9.1), ORANGE(63, 53.2);

		int calories;
		double vitamin;

		/**
		 * Constructor to initialize the calories and vitamin values for each fruit
		 * 
		 * @param calaories holds int value
		 * @param vitamin holds double value
		 */
		Fruit(int calories, double vitamin) {
			this.calories = calories;
			this.vitamin = vitamin;
		}

		/**
		 * toString format for displaying the fruit's nutritional info.
		 * 
		 * @return calories and vitamin
		 */
		public String toString() {
			return "Calories: " + calories + "\nVitamin: " + vitamin + " mg\n";
		}
	}

	/**
	 * Inner class with function for asking user input and retrieving fruit nutritional information.
	 * 
	 */
	class Nutrition {

		/**
		 * Asks the user to input a fruit name and displays its nutritional information.
		 * Handles invalid input gracefully by catching exceptions.
		 * 
		 * @return void
		 */
		public void getNutrition() {
			Scanner scn = new Scanner(System.in); // Scanner to read user input
			System.out.print("Enter a fruit name (Apple, Banana, Orange): ");

			try {
				Fruit fruit = Fruit.valueOf(scn.nextLine().toUpperCase()); // Convert input to uppercase to match enum
																			// constants
				System.out.println(
						"Nutritional Information for " + fruit.name().toLowerCase() + ":\n" + fruit.toString());
			} catch (IllegalArgumentException e) {
				System.out.println("Error: Invalid fruit name entered.");
			}
		}
	}
	
	/**
	 * This is the main function where the NutritionalInformationSystem is declared initialized
	 * It calls the function getNutrition() from the Nutrition class 
	 * 
	 * @param args holds String array value
	 *  @return void
	 * */
	public static void main(String args[]) {
		NutritionalInformationSystem.Nutrition n = new NutritionalInformationSystem().new Nutrition();

		while (true) {
			n.getNutrition();
		}
	}
}
