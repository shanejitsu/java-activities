package oop;

public class IsoscelesTriangle extends Triangle {
	
	/*
	 * This is the Isosceles Triangle constructor.
	 * This calls the parent's constructor and initializes the sides with 3.0 and the base with 5.0
	 * 
	 * @return Returns nothing.
	 */
	public IsoscelesTriangle() {
		super(3.0, 5.0);
	}
	/*
	 * This calculates the triangle's area. 
	 * 
	 * @return Returns the calculated area of type double.
	 */
	public double calculateArea() {
		return (((Math.pow(super.getSides(), 2) - Math.pow(super.getBase(), 2)) / 4) * super.getBase()) / 2;
	}
	
	/*
	 * This calculates the triangle's perimeter. 
	 * 
	 * @return Returns the calculated perimeter of type double.
	 */
	public double calculatePerimeter() {
		return super.getBase() + (2 * super.getSides());
	}

	@Override
	public String toString() {
		return "[IsoscelesTriangle]"+ "\n\tSides = "
				+ getSides() + "\n\tBase = " + getBase()+ "\n\tArea = " + calculateArea() + "\n\tPerimeter = " + calculatePerimeter() +"\n";
	}

}
