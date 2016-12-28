/*
 * File: RaiseIntToPower.java
 * --------------------------
 * This program displays a table of values of 2^k 
 * for all the values of k from 0 to 10. 
 * It is also exercise 4 in Chapter 5.
 */

import acm.program.*;

public class RaiseIntToPower  extends ConsoleProgram {
	
	public void run() {
		println("This program displays a table of display a table of values of 2^k for all the values of k from 0 to 10.");
		for (int i = 0; i <= K_MAX; i++) {
		println( N + " ^ " + i + " = " + raiseIntToPower( N, i));
		}
	}
	
	private double raiseIntToPower (double n, double k){
		return Math.pow(n, k);
	}
/* Private constants */
	private static final int N = 2;
	private static final int K_MAX = 10;
}
