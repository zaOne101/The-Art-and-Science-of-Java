import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

/**
 * File: DrawStarMap.java
 *-----------------------
 * This program creates a five-pointed star every time the user clicks on the Canvas
 * @Eric Roberts
 */
public class DrawStarMap extends GraphicsProgram {

	/*Initializes mouse listeners */
	public void init () {
		addMouseListeners();
	}
	
	/*Called whenever the mouse the user clicks the mouse */
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(STAR_SIZE);
		star.setFilled(true);
		add(star, e.getX(), e.getY());
	}
	
	/* Private constants */
	private static final double STAR_SIZE = 20;
}
