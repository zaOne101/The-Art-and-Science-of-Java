/*
 * File: YesNoQuestion.java
 * ------------------------
 * uh cristi.
 * This program asks the user a question and expects a yes / no
 * answer. It is also exercise 7 in Chapter 5.
 * "Write a predicate method askYesNoQuestion(prompt) that prints 
 * the string prompt as a question for the user and then waits 
 * for a response. If the user enters the string "yes", the 
 * askYesNoQuestion method should return true; if the user enters 
 * "no", the method should return false. If the user enters 
 * anything else, askYesNoQuestion should remind the user that it 
 * is seeking a yes-or-no answer and then repeat the question."
 */

import acm.program.*;

public class YesNoQuestion extends ConsoleProgram {

	public void run () {
		String prompt = "Are you over 18 year old?";
		if (askYesNoQuestion(prompt)) {
			println("Evaluated true.");
		}
		else {
			println ("Evaluated false");
		}
	}
/* Predicate method returns true if user enters the string "yes"
 * and false if the user enters "no", else informs user that it is 
 * expecting a yes or no answer. 	
 */
	private boolean askYesNoQuestion(String prompt) {
		String userInput = readLine(prompt);
		boolean trueOrFalse = true;
		while(true) {
			if (userInput.equalsIgnoreCase("yes")){
				trueOrFalse = true;
				break;
			}
			else if (userInput.equalsIgnoreCase("no")) {
				trueOrFalse = false;
				break;
			}
			else {
				println("Please answer yes or no");
				userInput = readLine(prompt);
			}
		}
		return trueOrFalse;
	}
}
