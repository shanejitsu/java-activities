package lesson3_2;

public class Cuizon_Exercise2 {

	public static void main(String[] args) {
		String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
				"eleventh", "Twelfth" };

		String[] gifts = { "A partridge in a pear tree", "Two turtle doves", "Three French hens", "Four calling birds",
				"Five gold rings", "Six geese a-laying", "Seven swans a-swimming", "Eight maids a-milking",
				"Nine ladies dancing", "Ten lords a-leaping", "Eleven pipers piping", "Twelve drummers drumming" };

		for (int i = 0; i < 12; i++) {
			System.out.print("On the ");
			System.out.print(days[i]);

			System.out.println(" day of Christmas my true love sent to me");
			
			for(int j=i;j>=0;j--) {
				System.out.println(gifts[j]);
			}
			System.out.println("\n");
		}
	}
}
