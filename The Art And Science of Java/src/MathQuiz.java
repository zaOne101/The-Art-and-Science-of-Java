/*
 * File: MathQuiz.java
 * -------------------
 * This program generates a series of 5 random simple math addition / subtraction 
 * questions, checks if the result is correct and if so, to reward the user, if the 
 * user fails 3 attempts, it should display the correct answer and move on to the
 * next question. It is also exercise 6 in Chapter 6. 
 * 
 * "As computers become more common in schools, it is important to find ways to 
 * use the machines to aid in the teaching process. This need has led to the 
 * development of an educational software industry which has produced many 
 * programs that help teach concepts to children. As an example of an educational 
 * application, write a program that poses a series of simple arithmetic problems 
 * for a student to answer.
 * Your program should meet these requirements: 
 * 	- You should ask a series of five questions. As with any such limit, the number 
 * 		of questions should be coded as a named constant so that it can easily be 
 * 		changed.
 * 	- Each question should consist of a single addition or subtraction problem 
 * 		involving just two numbers, such as "What is 2 + 3?" or "What is 11 - 7". 
 * 		The type of problem - addition or subtraction- should be chosen randomly 
 * 		for each question. 
 *  - To make sure the problems are appropriate for students in the first or 
 *  	second grade, none of the numbers involved, including the answer, 
 *  	should be less than 0 or greater than 20. This restriction means that 
 *  	your program should never ask questions like "What is 11 + 13?" or "What 
 *  	is 4 - 7?" because the answers are outside the legal range. Within these 
 *  	constraints, your program should choose the numbers randomly.
 *   - The program should give the student three chances to answer each question. 
 *   	If the student gives the correct answer, your program should indicate 
 *   	that fact in some properly congratulatory way and go on to the next 
 *   	question. If the student does not get the answer in three tries, the 
 *   	program should give the answer and go on to another problem.
 */

import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram {
	
	public void run() {
		println("Welcome to Math Quiz!");
		askFiveQuestions();
		
	}
	
	private void askFiveQuestions() {
		int firstNum = rgen.nextInt(0, 20);
		int secondNum = rgen.nextInt(0, 20);
		boolean isAddition = rgen.nextBoolean(0.5);
		int correctAnswer;
		
			if (isAddition) {
				correctAnswer = firstNum + secondNum;
				if (answerIsValid(correctAnswer)) {
					askAdditionQuestion(firstNum, secondNum, correctAnswer); 
				}
			} else if ( firstNum > secondNum) {
				correctAnswer = firstNum - secondNum;
				if (answerIsValid(correctAnswer)) {
					askSubtractionQuestion(firstNum, secondNum, correctAnswer); 
				}
			} else {
				correctAnswer = secondNum - firstNum; 
				if (answerIsValid(correctAnswer)){
					askSubtractionQuestion( secondNum, firstNum, correctAnswer);
				}
			}	
	}

	private boolean answerIsValid (int answer) {
		return (answer >= 0 && answer <= 20) && (numberOfQuestionsAsked >= MAX_QUESTIONS);
	}
	
	
	private void askAdditionQuestion(int n, int n1, int answer) {
		numberOfQuestionsAsked++;
		int answerCount = 0;
		int userAnswer = readInt ("What is " + n + " + " + n1 + " ? ");
		if (userAnswer == answer) {
			 println ("That is correct!");
		} else if (answerCount >= 3) {
			answerCount++;
			userAnswer = readInt("That's incorrect. Try a different answer");
		} else {
			askFiveQuestions();
		}
	}
		
		private void askSubtractionQuestion(int n, int n1, int answer) {
			numberOfQuestionsAsked++;
			int answerCount = 0;
			int userAnswer = readInt ("What is " + n + " - " + n1 + " ? ");
			if (userAnswer == answer) {
				 println ("That is correct!");
			} else if (answerCount >= 3) {
				answerCount++;
				userAnswer = readInt("That's incorrect. Try a different answer");
			} else {
				askFiveQuestions();
			}	
	}

	/*Random generator */
	private RandomGenerator rgen = new RandomGenerator();
	
	/* Instance variables */
	private static int numberOfQuestionsAsked = 0;
	
	/* Private constants */
	private static final int MAX_QUESTIONS = 5;
}
