/*
 * File: DrawStoplightRewrite.java
 * --------------------------------
 * @EricRoberts
 * This file is a rewrite of the DrawStoplight program from 
 * figure 5-3, in Chapter 5. The rewrite implements a new method
 * called "drawFilledRect". It is also exercise 6 in Chapter 5,
 * enounciated: 
 * 
 * "Rewrite the DrawStoplight program shown in Figure 5-3 so that 
 * it also includes a private method createFilledRect that creates 
 * a filled GRect object much in the same way that createFilledCircle 
 * creates a filled GOval. Part of the problem is working out what 
 * parameters the createFilledRect method needs to take."
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawStoplightRewrite extends GraphicsProgram {
	
	public void run() {
	    double cx = getWidth() / 2;
	    double cy = getHeight() /2;
	    double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
	    add(createFilledRect(cx,cy, FRAME_WIDTH, FRAME_HEIGHT, Color.GRAY));
	    add(createFilledCircle(cx, cy - dy, LAMP_RADIUS, Color.RED));
	    add(createFilledCircle(cx, cy, LAMP_RADIUS, Color.YELLOW));
	    add(createFilledCircle(cx, cy + dy, LAMP_RADIUS, Color.GREEN));
	}

/* 
 * Creates a circular GOval centered at (x, y) with radius r.
 * The GOval is set to be filled and colored in the specified color.
 */
	 
	 private GOval createFilledCircle ( double x, double y, double r, Color color) {
	  GOval circle = new GOval ( x - r, y - r, r * 2, r * 2);
	  circle.setColor(color);
	  circle.setFilled(true);
	  return circle;
	  }
/*
 * Creates a rectangle GRect centered at (x,y) with width w and 
 * height h, sets it to be filled and colored in the specific color. 
 */
	 private GRect createFilledRect (double x, double y, double w, double h, Color color) {
		GRect rect = new GRect (x - w / 2, y - h / 2, w, h);
		rect.setColor(color);
		rect.setFilled(true);
		return rect;
	 }
/* Private constants */

	  private static final double FRAME_WIDTH = 50;
	  private static final double FRAME_HEIGHT = 100;
	  private static final double LAMP_RADIUS = 10;
	  
	}
