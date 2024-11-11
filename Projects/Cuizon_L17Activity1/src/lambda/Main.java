package lambda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Playlist playlist = new Playlist();
	
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int option=0;
		System.out.println("Welcome to Spotify!");
		String title;
		playlist.addSong("Red", "Taylor Swift");
		playlist.addSong("Photograph", "Ed");
		playlist.addSong("Fireworks", "Katy Perry");
		playlist.addSong("Rolling in the Deep", "Adele");
		
		while (true) {
			displayMenu();
			System.out.print("Enter your choice: ");
			try {
				option = scn.nextInt();
				scn.nextLine();

				switch (option) {
					case 1:
						System.out.print("Enter song title: ");
						title = scn.nextLine();
						System.out.print("Enter song artist: ");
						String artist = scn.nextLine();
						playlist.addSong(title, artist);					
						break;
					case 2:
						playlist.displayPlayList();
						break;
					case 3:
						System.out.print("Enter song title to remove: ");
						title = scn.nextLine();
						playlist.removeSong(title);
						break;
					case 4:
						playlist.playCurrentSong();
						playlist.displayNextSong();
						break;
					case 5:
						System.out.print("Search for artist: ");
						String artist1 = scn.nextLine();
						playlist.searchArtist(artist1);
						break;
					case 6:
						System.out.println("Exiting playlist.");
						break;
					default:
						System.out.println("That's not from the choices.Please try again.\n");
						break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Make sure to only input an integer between 1-5.");
				scn.nextLine();
			}
			if(option==6) {
				break;
			}
		}
	}

	/**
	 * Displays the option menu
	 * @return void
	 */
	public static void displayMenu() {
		System.out.println("\nChoose and option:" + "\n1. Add a song to the playlist" + "\n2. Display the playlist"
				+ "\n3. Remove a song from the playlist" + "\n4. Play a song" + "\n5. Search Artist"+ "\n6. Exit" + "\n");
	}
}
