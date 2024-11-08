package generics;

public class GenericsCalculator<T extends Number> {
	private T num_1, num_2;

	/**
	 * Constructs a GenericsCalculator with two numbers.
	 *
	 * @param num_1 holds the value T
	 * @param num_2 holds the value T
	 */
	public GenericsCalculator(T num_1, T num_2) {
		this.num_1 = num_1;
		this.num_2 = num_2;
	}

	/**
	 * Adds the two numbers
	 * 
	 * @return the sum of num_1 and num_2, formatted to two decimal places
	 */
	public Double add() {
		double result = num_1.doubleValue() + num_2.doubleValue();
		return Double.parseDouble(String.format("%.2f", result));
	}

	/**
	 * Subtracts num_2 from num_1
	 * 
	 * @return the difference between num_1 and num_2, formatted to two decimal
	 *         places
	 */
	public Double subtract() {
		double result = num_1.doubleValue() - num_2.doubleValue();
		return Double.parseDouble(String.format("%.2f", result));
	}

	/**
	 * Multiplies the two numbers
	 * 
	 * @return the product of num_1 and num_2, formatted to two decimal places
	 */
	public Double multiply() {
		double result = num_1.doubleValue() * num_2.doubleValue();
		return Double.parseDouble(String.format("%.2f", result));
	}

	/**
	 * Divides num_1 by num_2
	 * 
	 * @return the quotient of num_1 divided by num_2, formatted to two decimal
	 *         places
	 * @throws ArithmeticException if num_2 is zero
	 */
	public Double divide() {
		if (num_2.doubleValue() == 0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		double result = num_1.doubleValue() / num_2.doubleValue();
		return Double.parseDouble(String.format("%.2f", result));
	}
}
