/*
 * File: PerfectNumbersChecker.java
 * --------------------------------
 * This program checks for Perfect numbers. It is also exercise 12
 * in Chapter 6, which states the following :
 * "Greek mathematicians took a special interest in numbers that are 
 * equal to the sum of their proper divisors ( a proper divisor of 
 * n is any divisor less than n itself). They called such number 
 * perfect numbers. For example, 6 is a perfect number because it is 
 * the sum of 1, 2, and 3, which are the integers less than 6 that 
 * divide evenly into 6. Similarly, 28 is a perfect number because 
 * it is the sum of 1, 2, 4, 7, and 14. Write a predicate method 
 * isPerfect(n) that returns true if the integer n is perfect, and 
 * false otherwise. Test your implementation by write a main program 
 * that uses the isPerfect method to check for perfect numbers in 
 * the range 1 to 9999 by testing each number in turn. Whenever it 
 * identifies a perfect number, your program should display that 
 * number on the screen. The first two lines of output should be 6 
 * and 28. Your program should find two other perfect numbers in 
 * that range as well."
 */

import acm.program.*;

public class IsPerfect extends ConsoleProgram {
	
	public void run() {
		println ("This program shows all the numbers which are");
		println("called perfect in the range of 1 and 9999");
		for (int i = 2; i <= MAXIMUM_NUMBER; i++) {
			if (isPerfect(i)) {
				println(i + " is a perfect number");
			}
		}
	}

/*Method that checks if the number is a perfect number */
	private boolean isPerfect(int n) {

		int divisorSum = 0;   	  // initializes an integer to hold the divisor sum	
		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				divisorSum += i;
			}
		}
		return divisorSum == n;
	}

/*Private constants */
	private static final int MAXIMUM_NUMBER = 9999;
}
