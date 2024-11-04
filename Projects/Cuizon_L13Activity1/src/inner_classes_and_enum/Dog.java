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

}
