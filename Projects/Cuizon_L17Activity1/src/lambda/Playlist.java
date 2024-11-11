package lambda;

import java.util.LinkedList;

public class Playlist {
	private LinkedList<Song> playlist;
	private int currentSongIndex;

	/**
	 * This is the Playlist class constructor. it initializes the Linkedlist of type
	 * Song called playlist it also initializes currentSongIndex to -1
	 */
	public Playlist() {
		playlist = new LinkedList<>();
		currentSongIndex = -1;
	}

	/**
	 * Adds a new song to the playlist.
	 * 
	 * @param title  holds the value String
	 * @param artist holds the value String
	 * @return void
	 */
	public void addSong(String title, String artist) {
		playlist.add(new Song(title, artist));
		if (currentSongIndex == 0) {
			currentSongIndex = playlist.size() - 2; // Set the first song as current
		}

	}

	/**
	 * Displays a list of songs inside the Linkedlist playlist
	 * 
	 * @return void
	 */
	public void displayPlayList() {
		if (playlist.size() == 0) {
			System.out.println("* * * Playlist empty * * *");
		} else {
			System.out.println("Playlist:");
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println((i + 1) + ". '" + playlist.get(i).title + "' by " + playlist.get(i).artist);
			}
		}
	}

	/**
	 * 
	 * removes a song from the Linkedlist playlist
	 */
	public void removeSong(String title) {
		for (int i = 0; i < playlist.size(); i++) {

			if ((playlist.get(i).title).toLowerCase().contentEquals(title.toLowerCase())) {
				playlist.remove(i);
				currentSongIndex--;
				playCurrentSong();
				displayNextSong();
			}
		}
	}

	/**
	 * Displays the current song being play inside the playlist by using the
	 * LinkedList function get() and currentSongIndex as its index parameter
	 * 
	 * @return void
	 */
	public void playCurrentSong() {
		if (currentSongIndex + 1 != playlist.size()) {
			currentSongIndex++;
			System.out.println("Current Song: " + "'" + (playlist.get(currentSongIndex)).title + "' by "
					+ (playlist.get(currentSongIndex)).artist);
		} else {
			System.out.println("Current Song: " + "'" + (playlist.get(currentSongIndex)).title + "' by "
					+ (playlist.get(currentSongIndex)).artist);
			currentSongIndex = -1;
		}
	}

	/**
	 * Displays the next song to be played by using the LinkedList function get()
	 * and currentSongIndex + 1 as its index parameter. It also checks if the
	 * current song is the last song of the list. If it is then it will update the
	 * currentSongIndex value back to -1 the next song will become the first in the
	 * list.
	 * 
	 * @return void
	 */
	public void displayNextSong() {
		if (currentSongIndex + 1 != playlist.size()) {
			System.out.println("Next Song: " + "'" + (playlist.get(currentSongIndex + 1)).title + "' by "
					+ (playlist.get(currentSongIndex + 1)).artist);
		} else {
			currentSongIndex = 0;
			System.out.println("Next Song: " + "'" + (playlist.get(currentSongIndex)).title + "' by "
					+ (playlist.get(currentSongIndex)).artist);
		}
	}

	/**
	 * displays the list of songs by the given parameter artist
	 * 
	 * @param holds the value String
	 * @return void
	 */
	public void searchArtist(String artist) {
			playlist.stream().filter(song -> song.artist.toLowerCase().contentEquals(artist.toLowerCase()))
				.forEach(System.out::println);
	}
	
	public boolean isEmpty() {
		return playlist.isEmpty();
	}
}
