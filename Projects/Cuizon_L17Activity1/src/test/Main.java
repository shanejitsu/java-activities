package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Consumer;

import lambda.Playlist;
import lambda.Song;

public class Main {

	public static void main(String[] args) {
		LinkedList<Song> playlist = playlist = new LinkedList<>();;
		playlist.add(new Song("Red", "Taylor Swift"));
		playlist.add(new Song("22", "Taylor Swift"));
		playlist.add(new Song("Photograph", "Ed"));
		playlist.add(new Song("Fireworks", "Katy Perry"));
		playlist.add(new Song("Rolling in the Deep", "Adele"));
		
		playlist.stream().filter(song->song.equals("Taylor Swift")).forEach(System.out::println);
		
	}
}
