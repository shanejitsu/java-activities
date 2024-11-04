package oop;

public class IsoscelesTriangle extends Triangle {

	public IsoscelesTriangle() {
		super(3.0, 5.0);
	}

	public double calculateArea() {
		return (((Math.pow(super.getSides(), 2) - Math.pow(super.getBase(), 2)) / 4) * super.getBase()) / 2;
	}

	public double calculatePerimeter() {
		return super.getBase() + (2 * super.getSides());
	}

	@Override
	public String toString() {
		return "[IsoscelesTriangle]\nArea = " + calculateArea() + "\nPerimeter = " + calculatePerimeter() + "\nSides = "
				+ getSides() + "\nBase = " + getBase();
	}

}
