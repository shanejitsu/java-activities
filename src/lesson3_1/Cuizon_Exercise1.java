package lesson3_1;

import java.util.Scanner;

public class Cuizon_Exercise1 {

	public static void main(String[] args) {

		// 1. Application
		Scanner input = new Scanner(System.in);
		short x, y, z;

		System.out.print("x: ");
		x = input.nextShort();

		System.out.print("y: ");
		y = input.nextShort();

		System.out.print("z: ");
		z = input.nextShort();

		System.out.println("Product is " + (x * y * z));

		// 2. Evaluation
		// x = 2 and y = 3
		// a. System.out.printf("x = %d\n", x);
		// Output: x = 2

		// b. System.out.printf("Value of %d + %d is %d\n", x, x, (x + x));
		// Output: Value of 2 + 2 is 4
		// c. System.out.printf("x =");
		// Output: x =
		// d. System.out.printf("%d = %d\n", (x + y), (y + x));
		// Output: 5 = 5

		// 3. d. value = input.nextInt();
		// Reason: because the scanner initializes the value of the variable "value"

		// 4. a. y=a*x*x*x+ 7;
		// Reason: because in the order of precedence, the multiplication operator will be performed first

		// 5. Application * / % + -
		// a. x = 7 + 3 * 6 / 2 - 1;
		// Multiplication: 7 + 18 / 2 - 1
		// Division: 7 + 9 - 1
		// Addition: 16 - 1
		// Subtraction: 15
		
		// b. x = 2 % 2 + 2 * 2 - 2 / 2;
		// Multiplication: 2 % 2 + 4 - 2 / 2
		// Division: 2 % 2 + 4 - 1
		// Modulus: 0 + 4 - 1
		// Addition: 4 - 1
		// Subtraction: 3
		
		// c. x = (3 * 9 * (3 + (9 * 3 / (3))));
		// Parentheses: (3 * 9 * (3 + (9 * 3 / 3)))
		// Multiplication: (3 * 9 * (3 + (27 / 3)))
		// Division: (3 * 9 * (3 + 9))
		// Parentheses:3 * 9 * (12)
		// Multiplication: 27*12
		// Multiplication: 324
	}

}
