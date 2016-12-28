/*
 * File: TargetRWr.java
 * --------------------
 * This program displays a the Target sign on the screen. 
 * It is a rewrite of the target program from exercise 5 
 * in Chapter 2. It is also exercise 5 in Chapter 5, which
 * has the following enunciation: 
 * 
 * "Rewrite the Target program given in Chapter 2, exercise 6 
 * so that it uses the createFilledCircle method that appears 
 * in Figure 5-3. In addition, change the program so that the 
 * target is always centered in the window and so that the 
 * number and the dimensions of the circles are controlled by 
 * the following named constants:
 * private static final int N_CIRCLES = 5;
 * private static final double OUTER_RADIUS = 75;
 * private static final double INNER_RADIUS = 10;
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class TargetRWr extends GraphicsProgram {
	
	public void run() {
		double outerCircleX = getWidth() / 2;
		double outerCircleY = getHeight() / 2;
		double distanceBetweenCircles = OUTER_RADIUS / N_CIRCLES;
		add(createFilledCircle(outerCircleX, outerCircleY, OUTER_RADIUS, Color.RED));
		add(createFilledCircle(outerCircleX, outerCircleY, OUTER_RADIUS - distanceBetweenCircles, Color.WHITE));
		add(createFilledCircle(outerCircleX, outerCircleY, OUTER_RADIUS - 2 * distanceBetweenCircles, Color.RED));
		add(createFilledCircle(outerCircleX, outerCircleY, OUTER_RADIUS - 3 * distanceBetweenCircles, Color.WHITE));
		add(createFilledCircle(outerCircleX, outerCircleY, OUTER_RADIUS - 4 * distanceBetweenCircles, Color.RED));
	}
/* Creates a filled circle centered at (x,y) coordinates, with radius r
 * filled 
 */
	private GOval createFilledCircle (double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y -r , 2* r, 2 *r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
/* Private constants */
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
}
