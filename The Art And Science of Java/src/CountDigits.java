/*
 * File: CountDigits.java
 * ----------------------
 * This program counts the digits of a number.
 * It is a rewrite of DigitSum example from Chapter 4.
 * It is also exercise 4 in Chapter 5.
 * @Eric Roberts
 */

import acm.program.*;

public class CountDigits extends ConsoleProgram {

	public void run () {
		println ("This program sums the digits in an integer.");
		int n = readInt ("Enter a positive integer: ");
		if (n > 0) {
		println ("The count of digits is " + digitCount(n)); 
		} else {
			println ("Please enter a positive number and try again.");
		}
	}
	
	//This is the method named digitCount which counts the digits.
	private int digitCount( int n) {
		int count = 0;
		while (n > 0) {
			 if (n % 10 > 0) {
				 count ++;
				 n /= 10;
			 }
			}
		return count;
		
		}
		
	}
