package test;

public abstract class Animal {

	protected abstract void makeSound();
	public void displayName() {
		System.out.println();
	}
	public static void main(String[] args) {
		Cub c = new Cub();
		c.sing();
	}
}
