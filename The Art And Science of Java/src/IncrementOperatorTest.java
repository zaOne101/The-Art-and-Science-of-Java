import acm.program.*;

/** This program illustrates the prefix and postfix forms of the ++ operator */

public class IncrementOperatorTest  extends ConsoleProgram {
	
	public void run() {
		int x = INITIAL_VALUE; 
		println("If x has the initial value " + x + " evaluating ++x");
		int result = ++x;
		println("changes x to " + x + " and returns the value " + result + " .");
		x = INITIAL_VALUE;
		println("Conversely, if x has the value " + x + ", evaluating x++");
		result = x++;
		println("changes x to " + x + " but returns the value " + result + ".");
	}
	/* Private constants */
	private static final int INITIAL_VALUE = 5;
}
