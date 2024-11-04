package inner_classes_and_enum;

import inner_classes_and_enum.Dog.Size;

public class Main {

	public static void main(String[] args) {
		try {
			Dog d1 = new Dog(Size.valueOf("SMALL"));
			d1.selectDogSize();
			Dog d2 = new Dog(Size.valueOf("MEDIUM"));
			d2.selectDogSize();
			Dog d3 = new Dog(Size.valueOf("LARGE"));
			d3.selectDogSize();
			Dog d4 = new Dog(Size.valueOf("EXTRALARGE"));
			d4.selectDogSize();
			Dog d5 = new Dog(Size.valueOf("TINY"));
			d5.selectDogSize();
		} catch (IllegalArgumentException e) { //catches initialization error
			System.out.println("I don't know which you like.");
		}

	}

}
