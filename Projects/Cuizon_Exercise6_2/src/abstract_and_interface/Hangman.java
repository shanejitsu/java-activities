package abstract_and_interface;

import java.util.Scanner;

public class Hangman extends Game implements Playable {
	private String secretWord;
	private StringBuilder currentGuess;
	private int attemptsLeft;
	private boolean gameOver;
	Scanner scn = new Scanner(System.in);

	public Hangman(String secretWord) {
		super(secretWord);
		this.secretWord = secretWord.toUpperCase();
		currentGuess = new StringBuilder();

		for (int i = 0; i < secretWord.length(); i++) {
			currentGuess.append('_');
		}

		attemptsLeft = 6;
		gameOver = false;
	}

	@Override
	public void start() {
		System.out.println("Welcome to Hangman!");
		while(attemptsLeft>0) {
			play();
			if(attemptsLeft>0) {
				System.out.println("Current guess: "+ currentGuess);
			}
		}

	}

	@Override
	public void play() {
		System.out.println("Guesses left: " + attemptsLeft);
		
		if(attemptsLeft>0) {
			System.out.print("Please input your character guess: ");
		}
		
		String guess = scn.nextLine();
		
		if(secretWord.contains(guess.toUpperCase())) {
			System.out.println("Correct Guess!");
			updateCurrentGuess(guess.toUpperCase().charAt(0));
		}else {
			System.out.println("Incorrect guess!");
			attemptsLeft-=1;
		}
		
		if(currentGuess.toString().contains(Character.toString('_')) && attemptsLeft==0) {
			System.out.println("“Game over! The word was: " + secretWord);
		}else if(!(currentGuess.toString().contains(Character.toString('_'))) && !(attemptsLeft==0)){
			System.out.println("Congratulations! You've guessed the word.");
		}

	}

	public void updateCurrentGuess(char guess) {

		for (int i = 0; i < secretWord.length(); i++) {
			if(secretWord.charAt(i)==guess) {
				currentGuess.setCharAt(i, guess);
			}
		}
	}

}
