package abstract_and_interface;

import java.util.Scanner;

public class Hangman extends Game implements Playable {
	private String secretWord; // The word to be guessed
	private StringBuilder currentGuess; // The current state of the guessed word (with underscores)
	private int attemptsLeft; // The number of incorrect guesses remaining
	private boolean gameOver; // A flag to indicate if the game is over
	private Scanner scn = new Scanner(System.in); // Scanner to read user input

	/**
	 * Constructor to initialize the Hangman game with a secret word.
	 * 
	 * @param secretWord  The word to be guessed in the game.
	 */
	public Hangman(String secretWord) {
		super(secretWord); // Call the Game class constructor with the word as the game name
		this.secretWord = secretWord.toUpperCase();
		currentGuess = new StringBuilder(); // Initialize the current guess as an empty string

		// Initialize the current guess with underscores for each letter in the secret word
		for (int i = 0; i < secretWord.length(); i++) {
			currentGuess.append('_');
		}

		attemptsLeft = 6; // Set the initial number of attempts to 6
		gameOver = false; // The game is not over initially
	}

	/**
	 * Starts the game.
	 * 
	 * This method repeatedly prompts the player to guess a letter and updates the 
	 * game state after each guess, until the game ends (either through guessing the word 
	 * or running out of attempts).
	 */
	@Override
	public void start() {
		System.out.println("Welcome to Hangman!");
		while(attemptsLeft > 0 && currentGuess.toString().contains("_")) {
			play();
			if(attemptsLeft > 0) {
				System.out.println("Current guess: " + currentGuess);
			}
		}
	}

	/**
	 * Prompts the user for a letter guess and updates the game state.
	 * 
	 * This method checks if the guessed letter is valid and is in the secret word, updates the 
	 * current guess, and adjusts the number of attempts left. If the word is guessed 
	 * or the player runs out of attempts, it displays the appropriate message.
	 */
	@Override
	public void play() {
		System.out.println("Guesses left: " + attemptsLeft);

		if(attemptsLeft > 0) {
			System.out.print("Please input your character guess [UPPERCASE CHARCTER ONLY]: ");
		}

		String char_guess = scn.nextLine();

		if(char_guess.matches("[A-Z]+")) {
			if(char_guess.length()==1) {
				if(secretWord.contains(char_guess)) {
					System.out.println("Correct Guess!");
					updateCurrentGuess(char_guess.charAt(0));
				} else {
					System.out.println("Incorrect guess!");
					attemptsLeft--;
				}
			}else {
				System.out.println("Please input one character at a time.");
			}
		}else {
			System.out.println("Invalid input. Please try again.");
		}
		

		// Check for game-over conditions
		if(currentGuess.toString().contains("_") && attemptsLeft == 0) {
			System.out.println("Game over! The word was: " + secretWord);
		} else if(!currentGuess.toString().contains("_") && attemptsLeft > 0) {
			System.out.println("Congratulations! You've guessed the word.");
		}
	}

	/**
	 * Updates the current guess with the correct letter.
	 * 
	 * This method replaces the underscores in the `currentGuess` with the correctly 
	 * guessed letters at the correct positions.
	 * 
	 * @param guess  The correct guessed letter.
	 */
	public void updateCurrentGuess(char guess) {
		// Loop through the secret word and update the current guess with the correct letter
		for (int i = 0; i < secretWord.length(); i++) {
			if(secretWord.charAt(i) == guess) {
				currentGuess.setCharAt(i, guess);
			}
		}
	}
}
