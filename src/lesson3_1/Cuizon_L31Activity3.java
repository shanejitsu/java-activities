package lesson3_1;

public class Cuizon_L31Activity3 {

	public static void main(String[] args) {
		double foodPrice = 911.42;
		double myMoney = 1000.00;

		System.out.println("Question: Hi Java, do I have enough to buy chips?");
		System.out.println("Java: " + (myMoney > foodPrice));

		int capacity = 15;
		int people = 20;
		System.out.println("Question: Hi Java, can the elevator hold everyone?");
		System.out.println("Java: " + (people <= capacity));

		String preferredGift = "Money";
		String myGift = "Car";
		System.out.println("Question: Hi Java, will my friend be happy?");
		System.out.println("Java: " + (preferredGift == myGift));

		int invited = 20;
		int attending = 20;
		System.out.println("Question: Hi Java, can everyone attend my dinner party?");
		System.out.println("Java: " + (invited == attending));

		int rivalVotes = 911911;
		int myVotes = 420420;
		System.out.println("Question: Hi Java, Will I win the election");
		System.out.println("Java: " + (myVotes > rivalVotes));
	}

}
