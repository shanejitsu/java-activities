package lesson3_2;

public class Cuizon_Exercise2 {

	public static void main(String[] args) {
		String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
				"eleventh", "Twelfth" };

		String[] gifts = { "A partridge in a pear tree", "Two turtle doves", "Three French hens", "Four calling birds",
				"Five gold rings", "Six geese a-laying", "Seven swans a-swimming", "Eight maids a-milking",
				"Nine ladies dancing", "Ten lords a-leaping", "Eleven pipers piping", "Twelve drummers drumming" };

		String day = null, gift = null;

		for (int i = 11; i >= 0; i--) {
			System.out.print("On the ");

			switch (i + 1) {
			case 1:
				System.out.print(days[i]);
				break;
			case 2:
				System.out.print(days[i]);
				break;
			case 3:
				System.out.print(days[i]);
				break;
			case 4:
				System.out.print(days[i]);
				break;
			case 5:
				System.out.print(days[i]);
				break;
			case 6:
				System.out.print(days[i]);
				break;
			case 7:
				System.out.print(days[i]);
				break;
			case 8:
				System.out.print(days[i]);
				break;
			case 9:
				System.out.print(days[i]);
				break;
			case 10:
				System.out.print(days[i]);
				break;
			case 11:
				System.out.print(days[i]);
				break;
			case 12:
				System.out.print(days[i]);
				break;
			}

			System.out.println(" day of Christmas my true love sent to me");

			switch (i + 1) {
			case 1:
				gift = gifts[i];
			case 2:
				gift = gifts[i];
			case 3:
				gift = gifts[i];
			case 4:
				gift = gifts[i];
			case 5:
				gift = gifts[i];
			case 6:
				gift = gifts[i];
			case 7:
				gift = gifts[i];
			case 8:
				gift = gifts[i];
			case 9:
				gift = gifts[i];
			case 10:
				gift = gifts[i];
			case 11:
				gift = gifts[i];
			case 12:
				gift = gifts[i];
			}
			System.out.println(gift + "\n");
		}
	}
}
