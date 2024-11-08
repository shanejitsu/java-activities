package generics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static GenericsCalculator<Double> calculator;
	static double num1;
	static double num2;
	static String op;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Double result;
		System.out.println("Hi I am Calculator-sama!\n");
		do {
			System.out.print("1st Number: ");
			try {
				num1 = scn.nextDouble();

				try {
					System.out.print("2nd Number: ");
					num2 = scn.nextDouble();
					// Only create a calculator for the if both inputs are Numbers
					calculator = new GenericsCalculator<Double>(num1, num2);
					// Display the menu and accept the operation choice
					displayMenu();
					System.out.print("Enter operation: ");
					scn.nextLine();
					op = scn.nextLine().toLowerCase();

					if (op != "e" && op.length() == 1) {
						// Call the operation based on user choice
						result = callOperation(op.charAt(0));

						// If the result is not null, print it
						if (result != null) {
							System.out
									.println("Result: " + num1 + " " + op.charAt(0) + " " + num2 + " = " + result + "\n");
						}
					} else if(op.length() != 1){
						System.out.println("Kindly choose from the menu.\n");
					}
					else{// terminate program
						System.out.println("Thank you for using me.\n");
					}
				} catch (InputMismatchException e) {
					System.out.println(
							"Result:\n" + "\tError: Second Number input is invalid. Make sure to input a number.\n");
					scn.nextLine();
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"Result:\n" + "\tError: First Number input is invalid. Make sure to input a number.\n");
				scn.nextLine();
			}

		} while (op != "e");

		scn.close();
	}

	/**
	 * Get the appropriate operation symbol based from the user input
	 * 
	 * @param op holds the char value inputed by the user
	 * @return the operation symbol
	 */
	public static char getOp(char op) {
		switch (op) {
		case 'a':
			return '+';
		case 'b':
			return '-';
		case 'c':
			return '*';
		case 'd':
			return '/';
		default:
			return (Character) null;
		}
	}

	/**
	 * Calls a specific operation function from GenericsCalculator class based on
	 * the parameter op
	 * 
	 * @param op hold the value char
	 * @return the output of the called operation function
	 */
	public static Double callOperation(char op) {
		switch (op) {
		case 'a':
			return calculator.add();
		case 'b':
			return calculator.subtract();
		case 'c':
			return calculator.multiply();
		case 'd':
			return calculator.divide();
		default:
			System.out.println("Kindly choose from the menu.\n");
			return null;
		}
	}

	/**
	 * Display the menu for operations
	 * 
	 * @return void
	 */
	public static void displayMenu() {
		System.out.println("[A] - Addition");
		System.out.println("[B] - Subtraction");
		System.out.println("[C] - Multiplication");
		System.out.println("[D] - Division");
		System.out.println("[E] - Exit program");
	}
}