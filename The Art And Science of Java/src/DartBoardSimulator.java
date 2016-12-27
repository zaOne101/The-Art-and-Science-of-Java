/*
 * File: DartBoardSimulator.java
 * -----------------------------
 * @Eric Roberts
 * Exercise 3 in Chapter 6: 
 * 
 * Although it is often easiest to think of a random number in the 
 * context of games of chance, they have other, more practical uses in 
 * computer science and mathematics. For example, you can use random 
 * numbers to generate a rough approximation of the constant Pi by 
 * writing a simple program that simulates a dart board. Imagine that you 
 * have a dart board hanging on your wall. It consists of a circle painted 
 * on a square backdrop.
 * If you throw darts at this board in a random fashion, some will fall 
 * inside the circle. If tosses are truly random, the ratio of the number of 
 * darts that land inside the circle to the total number of darts falling 
 * anywhere inside the square should be roughly equal to the ratio between 
 * the two areas. The ratio of the areas is independent of the actual size 
 * of the dartboard, as illustrated by the following formula:
 * 
 *  darts falling inside the circe / darts falling inside the square = 
 *  	=area of the circle / area of the square
 *  
 *  To simulate this process in a program, imagine that the dart board is drawn in 
 *  the standard Cartesian coordinate plane you learned about in high school. 
 *  You can model the process of throwing a dart randomly at the square by 
 *  generating two random numbers, x and y, each of which lies between -1 and 1. 
 *  This(x, y) point always lies somewhere inside the square. The point (x, y) 
 *  lies inside the circle if 
 *  	 x^2 + y ^ 2 < 1
 *  If you perform this simulation many times and compute the fraction of 
 *  darts that fall within the circle, the result will be somewhere in the 
 *  neighborhood of Pi/ 4. Write a program that simulates throwing 10000 darts 
 *  and then uses the simulation technique described in this exercise to 
 *  generate and display an approximate value of Pi. Don't worry if your answer 
 *  is correct only in the first few digits. The strategy used in this problem 
 *  is not particularly accurate, even though it occasionally proves useful as 
 *  a technique for making rough approximations. In mathematics, this technique 
 *  is called Monte Carlo integration, after the gambling center that is the 
 *  capital of Monaco. 
 */

import acm.program.*;
import acm.util.*;


public class DartBoardSimulator extends ConsoleProgram{

	public void run() {
		throwDarts(NUMBER_OF_THROWS); 
		println("number of throws in the circle is: " +numThrowsInCircle);
		double piApprox = numThrowsInCircle * 4 / 10000;
		println("Approximation of Pi is: " + piApprox);
		
	}
	
	private double throwDarts(int thorwsNum) {
		double throwDarts = 0;
		for (int i = 0; i < thorwsNum; i++) {
			int dart = rgen.nextBoolean(ratio()) ? 1 : 0;
			if (dart == 1) numThrowsInCircle++ ;
			throwDarts += dart;
			println(i + " " + throwDarts);
		}
		return throwDarts;
	}
	
	private static double ratio() {
		
		 return areaOfCircle(CIRCLE_RADIUS) /areaOfSquare(SQUARE_SIZE);
	}
	
	private static double areaOfCircle(int radius) {
		return radius * radius * PI;
	}
	
	private static double areaOfSquare(int width) {
		return width * width ;
	}
	
/* Private variables */
	private static double numThrowsInCircle = 0;
	
/* Private random generator */ 
	private static RandomGenerator rgen = RandomGenerator.getInstance();
	
/* Private constants */ 
	private static final int NUMBER_OF_THROWS = 10000;
	private static final int SQUARE_SIZE = 200;
	private static final int CIRCLE_RADIUS = 100;
	private static final double PI = 3.141592;
	
}
