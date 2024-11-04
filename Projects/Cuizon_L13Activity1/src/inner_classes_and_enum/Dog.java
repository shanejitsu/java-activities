package inner_classes_and_enum;

public class Dog {
	private Size dogSize;
	
	public enum Size {
		SMALL("small"), MEDIUM("medium"), LARGE("large"), EXTRALARGE("extra large");

		public String size;

		Size(String size) {
			this.size = size;
		}

	}

	public Dog(Size s) {
		dogSize = s;
	}

	/*
	 * 
	 * Displays the appropriate dog size of Dog.
	 * 
	 * @return Returns nothing.
	 * 
	 */
	public void selectDogSize() {
		System.out.print("I am ");

		switch (dogSize) {
			case SMALL:
			case MEDIUM:
			case LARGE:
				System.out.print("a ");
				break;
			case EXTRALARGE:
				System.out.print("an ");
				break;
		}

		System.out.println(dogSize.size + " doggy.");
	}

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
		} catch (IllegalArgumentException e) {
			System.out.println("I don't know which you like.");
		}

	}
}
