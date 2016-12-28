/*
 * File: RandomCard.java
 * ---------------------
 * This program draws a random card from a complete deck of 52 cards. It is also
 * exercise 1 in Chapter 6. 
 * Write a program that displays the name of a card randomly chosen from a 
 * complete deck of 52 playing cards. Each card consists of a rank ( Ace, 2 , 
 * 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and a suit (Clubs, Diamonds, 
 * Hearts, Spades). Your program should display the complete name of the card.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		println("This program displays a randomly chosen card:");
		int drawCardNumber = cardNumber();
		int drawCardRank = cardRank();
		if (drawCardNumber == 1) {
			print("Ace of ");
		} else if (drawCardNumber == 11) {
			print("Jack of ");
		} else if (drawCardNumber == 12) {
			print("Queen of ");
		} else if (drawCardNumber == 13) {
			print("King of ");
		} else {
			print(drawCardNumber + " of ");
		}
		if (drawCardRank == 1) {
			println( "Spades.");
		} else if (drawCardRank == 2) {
			println("Hearts.");
		} else if (drawCardRank == 3) {
			println("Diamonds.");
		} else {
			println("Clubs.");
		}
	}
	private static int cardNumber() {
		int cardNumber = rgen.nextInt(1, 13);
		return cardNumber;
	}
	
	private static int cardRank() {
		int cardRank = rgen.nextInt(1, 4);
		return cardRank;
	}
	
	/* Create an instance variable for the random generator */
	private static RandomGenerator rgen = RandomGenerator.getInstance();
}
