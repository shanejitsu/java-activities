package lesson3_2;

public class Cuizon_Lesson32Activity1 {

	public static void main(String[] args) {
		int gryffindor, ravenclaw;
		gryffindor = 400;
		ravenclaw = 200;
		output(gryffindor, ravenclaw);

		// other tests
		gryffindor = 850;
		ravenclaw = 500;
		output(gryffindor, ravenclaw);

		gryffindor = 500;
		ravenclaw = 500;
		output(gryffindor, ravenclaw);

		gryffindor = 450;
		ravenclaw = 500;
		output(gryffindor, ravenclaw);

		gryffindor = 100;
		ravenclaw = 500;
		output(gryffindor, ravenclaw);

		gryffindor = 450;
		ravenclaw = 550;
		output(gryffindor, ravenclaw);

		gryffindor = 100;
		ravenclaw = 205;
		output(gryffindor, ravenclaw);
	}

	public static void output(int gryffindor, int ravenclaw) {
		int margin = gryffindor - ravenclaw;
		if (margin >= 0) {// gryffindor is greater or equal t raven claw
			System.out.println("Margin: " + margin);
			if (margin >= 350) {
				System.out.println("Gryffindor takes the house cup!");
			} else {
				System.out.println("In second place, Gryffindor!");
			}
		} else { // gryffindor loser
			margin = ravenclaw - gryffindor;
			System.out.println("Margin: -" + margin);
			if (margin <= 100) {
				System.out.println("In third place, Gryffindor!Boo");
			} else {
				System.out.println("In fourth place, Gryffindor!BOOO");
			}
		}

	}

}
