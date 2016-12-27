/*
 * File: ConsecutiveHeads.java
 * ---------------------
 * This program simulates the flipping of a coin, displays the result, and 
 * stops when three consecutive heads are tossed. Then it shows the number of
 * times the coin was tossed in total to get 3 consecutive heads. 
 * @Eric Roberts
 */
import acm.program.*;
import acm.util.RandomGenerator;

public class ConsecutiveHeads extends ConsoleProgram {
	
	public void run() {
		
		while(consecutiveHeads < 3) {
			String s = coinFlip();
			totalTosses++;
			println(s);
			if (s.equals("Heads")) {
				consecutiveHeads++;
			} else {
				consecutiveHeads = 0;
			}
		}
		if (consecutiveHeads == 3) 
			println("It took " + totalTosses + " flips to get 3 consecutive heads");
	}
	/* Private method that returns a string head or tails, simulating a coin toss */
	private static String coinFlip () {
		int coin = rgen.nextInt(0,1);
		if (coin == 0) return "Heads";
		else return "Tails";
		
	}
	
	/*Creates an instance of the RandomGenerator */
	private static RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* Total number of tosses */ 
	private static int totalTosses = 0;
	
	/*Consecutive tosses count */
	private static int consecutiveHeads = 0;
}
