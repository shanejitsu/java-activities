package lesson3_2;

public class Cuizon_Exercise2 {

	public static void main(String[] args) {
		// 1.Application.
		// Write four different Java statements that each add 1 to integer variable x.
		// int x=0;
		// 1. x++;
		// 2. ++x;
		// 3. x=x+1;
		// 4. x+=1;

//		2. Application. Write Java statements to accomplish each of the following tasks:
//			a. Use one statement to assign the sum of x and y to z, then increment x by 1.
//			Answer: int total = x++ + y + z;

//			b. Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
//			Answer:
//				if(count>10)
//					System.out.println("Count is greater than 10");

//
//			c. Use one statement to decrement the variable x by 1, then subtract it from
//			variable total and store the result in variable total
//			Answer: int total -= --x;

//			d. Use two ways to write a statement that will find the remainder q of q and
//			divisor using modulo.
//			Answer:
//				int rem = q1%q2;
//				int divisor = q1/q2;

//
//			3. Understanding. Determine the values of the variables (product and x) in the
//			statement product *= x++; after the calculation is performed. Assume that all
//			variables are type int and initially have the value 5.
//			Answer:
//				product *= x++;
//				product = 5 * 5 = 25; //after this, the value of x becamee 6
//				
//				The new values are:
//					product = 25;
//					x = 6;
//			
//			4. Evaluation. Assume that i=1, j=2, k=3 and m=2. What does each of the following
//			statements print?
//			Answer:
//				a. System.out.println( i == 1 ); //true
//				b. System.out.println( j == 3 ); //false
//				c. System.out.println( ( i >= 1 ) && ( j < 4 ) );//true
//				d. System.out.println( ( m <= 99 ) & ( k < m ) );//false
//				e. System.out.println( ( j >= i ) || ( k == m ) );//true
//				f. System.out.println( (k+m= k ) );//error
//				g. System.out.println( !( k > m ) );//false

//			5. Application. Write a Java statement or a set of Java statements to accomplish
//			each of the following tasks:
		
//			a. Sum the odd integers between 1 and 99, using a for statement. Assume
//			that the integer variables sum and count have been declared.
//				int sum = 0;
//				for (int count = 1; count <= 99; count++) {
//					if (count % 2 != 0) {
//						sum += count;
//					}
//				}		

//			b. Calculate the value of 2.5 raised to the power of 3, using the pow method
//			Answer:
//				double pow=Math.pow(2.5,3);	
//				System.out.println(pow);//15.625

//			c. Print the integers from 1 to 20, using a while loop and the counter variable	 i.
//			Assume that the variable i has been declared, but not initialized. Print
//			only five integers per line. [Hint: Use the calculation i%5. When the value
//			of this expression is 0, print a newline character; otherwise, print a tab
//			character. Assume that this code is an application. Use the
//			System.out.println() method to output the newline character, and use the
//			System.out.print( '\t' ) method to output the tab character.]
//			Answer:
//				int i;
//				i=1;
//				while(i<= 20) {
//					
//					System.out.print(i);
//						if(i % 5 == 0) {
//							System.out.print("\n");
//						}else {
//							System.out.print("\t");
//						}
//					i++;
//				}
					
		
//			d. Repeat part (c), using a for statement.
//			Answer:
//				int i;
//					for(i=1;i<= 20;i++) {
//					
//					System.out.print(i);
//						if(i % 5 == 0) {
//							System.out.print("\n");
//						}else {
//							System.out.print("\t");
//						}
//				}
		
//			6. The Twelve Days of Christmas. Write a Java application that uses repetition
//			and switch statements to print the song “The Twelve Days of Christmas.” One
//			switch statement should be used to print the day (“first,” “second,” and so on). A
//			separate switch statement should be used to print the remainder of each verse.
			
	}

}
