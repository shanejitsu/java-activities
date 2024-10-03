package lesson3_2;

import java.util.Scanner;

public class Cuizon_Lesson32Activity2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Hey are you free on ");
		String day = input.nextLine();
		getResponse(day);

	}

	public static void getResponse(String day) {
		switch (day.toLowerCase()) {
		case "saturday":
		case "sunday":
			System.out.println("Of course! It's a weekend.");
			break;
		case "monday":
		case "tuesday":
		case "wednesday":
		case "friday":
			System.out.println("No. Sorry, I have work that day.");
			break;
		case "thursday":
			System.out.println("No. I have a coffee appointment on Thursday.");
			break;
		default:
			System.out.println("No such day exist :(");
		}
	}

}
