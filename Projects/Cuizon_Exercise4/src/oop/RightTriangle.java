package oop;

public class RightTriangle extends Triangle {
	private double height;

	public RightTriangle(double h) {
		super(3.0, 4.0);
		height = h;
		calculateArea();
		calculatePerimeter();
	}

	public double calculateArea() {
		return (super.getBase() * height) / 2;
	}

	public double calculatePerimeter() {
		return super.getSides() + super.getBase() + height;
	}

	@Override
	public String toString() {
		return "[RightTriangle]\nheight=" + height + "\nArea = " + calculateArea() + "\nPerimeter = "
				+ calculatePerimeter() + "\nSides = " + getSides() + "\nBase = " + getBase();
	}

}
