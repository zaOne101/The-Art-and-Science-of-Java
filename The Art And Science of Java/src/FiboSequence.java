/*
 * File: FiboSequence.java
 * -----------------------
 * @EricRoberts
 * This program is a rewrite of the exercise 9 in Chapter 4,
 * which implements the method call to fibonacci(n). It is also
 * exercise 2 in Chapter 5
 */

import acm.program.*;


public class FiboSequence extends ConsoleProgram {
	
	public void run () {
		println("This program displays the first N numbers in the");
		println("Fibonnaci sequence:");
		for (int i = 0; i <= N; i++) {
		println ("F" + i + " = " + fibonnaci(i));
		}
	}
	private int fibonnaci(int n) {
		int f = 0; 
		int next = 1;
		for ( int i = 0; i <= n; i++ )	{
//			println ("inner" + i + " = "  + f);
			f += next;
			next = f - next;
		}
		return next;
		
	}
/* Private constants */
	private static final int N = 15;
}
