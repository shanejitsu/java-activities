package card_rules;

import java.util.Scanner;

public class Discount {
	static Scanner s = new Scanner(System.in);
	static long start, finish, timeElapsed;
	private int total_discount=0;
	static String input;
	private boolean[] account = new boolean[3];
	boolean hasError = false;
	
	public Discount() {}
	
	public Discount(boolean newUser) {
		this.account[0] = newUser;
		loyaltyStatus();
		couponStatus();
		setTotal_discount();
	}

	private void couponStatus() {
		System.out.print("Do you have a coupon? Y/N ");
		input = s.nextLine();
		if(input.toLowerCase().contentEquals("y")||input.toLowerCase().contentEquals("yes")) {
			this.account[2] = true;
		}
	}
	private void loyaltyStatus() {
		System.out.print("Do you have a loyalty card? Y/N ");
		input = s.nextLine();
		if(input.toLowerCase().contentEquals("y")||input.toLowerCase().contentEquals("yes")) {
			this.account[1] = true;
		}
	}
	
	public int getTotal_discount() {
		return total_discount;
	}
	
	
	private void setTotal_discount() {
	    long start = System.nanoTime();
	    if (this.account[0] && this.account[1]) {
	        this.hasError = true;
	    } else {
	        if (this.account[0]) {
	            this.total_discount = this.account[2] ? 20 : 15;
	        } else {
	            this.total_discount += (this.account[1] ? 10 : 0) + (this.account[2] ? 20 : 0);
	        }
	    }
	    long finish = System.nanoTime();
	    timeElapsed = finish - start;
	}

	
	
	public static void main(String[] args) {
	    String input;
	    
	    do {
	        Discount user = null;
	        System.out.println("What type of user are you?");
	        System.out.println("[A] NEW USER");
	        System.out.println("[B] HAS EXISTING ACCOUNT");
	        System.out.println("[E] EXIT\n");
	        
	        System.out.print("Enter option here: ");
	        input = s.nextLine();
	        
	        switch (input.toLowerCase()) {
	            case "a":
	                user = new Discount(true);
	                break;
	            case "b":
	                user = new Discount(false);
	                break;
	            case "e":
	                System.out.println("Bye.");
	                break;
	            default:
	                System.out.println("I don't see that from the choices. Please choose again!\n");
	                break;
	        }
	        if (user != null && !input.toLowerCase().contentEquals("e")) {
	            System.out.println("Total Discount: " + user.getTotal_discount());
	            System.out.println("Nanoseconds: " + timeElapsed + "\n");
	        }
	        if(user.hasError) {
	        	System.out.println("You can't be a new and existing customer at the same time.");
	        }
	        
	    } while (!input.toLowerCase().contentEquals("e"));
	}

}
