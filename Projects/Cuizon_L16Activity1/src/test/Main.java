package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void testArrayList() {
		ArrayList<String> friends = new ArrayList<>();
		friends.add("Dayan");
		friends.add("Julya");
		friends.add("Osi");
		friends.add("Rid");
		friends.add("Adik");
		
		System.out.println("- - - - - - - -  -ArrayList-  - - - - - - - -");
		
		System.out.println("Friends List: " + friends);
		System.out.print("Search friend: ");
		String friend = scn.nextLine();
		if (friends.contains(friend)) {
			for (int i = 0; i < friends.size(); i++) {
				if (friends.get(i).contentEquals(friend)) {
					System.out.println("Your friend " + friends.get(i) + " is found.");
				}
			}
		} else {
			System.out.println("Friend not found :((");
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
	}

	public static void testLinkedList() {
		LinkedList<String> pets = new LinkedList<String>();
		pets.add("Jorjj");
		pets.add("Chuchay");
		pets.add("Chikay");
		pets.add("Spiky");
		pets.add("Miyan");
		pets.add("Pringol");
		System.out.println("- - - - - - - - - - - - - Linked List - - - - - - - - - - - - -");
		
		
		System.out.println("All owned pets: " + pets);
		System.out.println("Pet 2: " + pets.get(1));
		System.out.println("Remove dead pets:" + pets.get(1) + " and " + pets.get(3));
		pets.remove(1);
		pets.remove(3);
		System.out.println("All living pets: " + pets);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	}

	public static void main(String[] args) {
		//testArrayList();
		testLinkedList();

	}

}
