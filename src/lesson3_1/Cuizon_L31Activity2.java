package lesson3_1;
import java.util.Scanner;

public class Cuizon_L31Activity2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello. What is your name?");
		String name = input.nextLine();
		
		System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
		String place = input.nextLine();
		
		System.out.println("\nI hear it's beautiful in " + place + "! I'm a place called Oracle");
		System.out.println("\nHow old are you?");
		int age = input.nextInt();
		
		System.out.println("\nSo you're" + age + ", cool! I am " + (8 * age) + "years old!");
		System.out.println("This means I'm 8 times older than you!");
		System.out.println("\nEnough about me.What's your favorite programming language?" + "(Just don't say C)");
		String lang = input.nextLine();
		lang = input.nextLine();
		
		System.out.println(
				"\n" + lang + "? That's great! Nice chatting with you, " + name + ". I have to log off now. See ya!");
	}

}
