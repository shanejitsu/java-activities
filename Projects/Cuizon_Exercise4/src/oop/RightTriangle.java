package oop;

public class RightTriangle extends Triangle {
	private double height;
	/*
	 * This is the Right Triangle constructor.
	 * This calls the parent's constructor and initializes the sides with 3.0 and the base with 4.0
	 * 
	 * @param h
	 * @return Returns nothing.
	 */
	public RightTriangle(double h) {
		super(3.0, 4.0);
		height = h;
	}
	
	/*
	 * This calculates the triangle's area. 
	 * 
	 * @return Returns the calculated area of type double.
	 */
	public double calculateArea() {
		return (super.getBase() * height) / 2;
	}
	
	/*
	 * This calculates the triangle's perimeter. 
	 * 
	 * @return Returns the calculated perimeter of type double.
	 */
	public double calculatePerimeter() {
		return super.getSides() + super.getBase() + height;
	}

	@Override
	public String toString() {
		return "[RightTriangle]" + "\n\tSides = " + getSides() + "\n\tBase = " + getBase() + "\n\theight=" + height
				+ "\n\tArea = " + calculateArea() + "\n\tPerimeter = " + calculatePerimeter() + "\n";
	}

}
