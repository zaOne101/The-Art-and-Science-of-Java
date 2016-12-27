/*
 * File: DrawHouseOfUsher.java
 * ---------------------------
 *@Eric Roberts
 * This program draws the house of Usher.
 * It is also exercise 10 in Chapter 5. 
 */

import acm.program.*;
import acm.graphics.*;

public class DrawHouseOfUsher extends GraphicsProgram {
	
	public void run() {
	/* Calculated coordinates for the house */
		double x = getWidth();
		double y = getHeight();
		double houseX = STARTING_TOWER_WHITESPACE + TOWER_WIDTH;
		double houseY = y - HOUSE_HEIGHT;
	/* Calculated coordinates for the two towers */
		double leftTowerX = STARTING_TOWER_WHITESPACE;
		double towersY = y - TOWER_HEIGHT;
		double rightTowerX = STARTING_TOWER_WHITESPACE + TOWER_WIDTH + HOUSE_WIDTH;
	/* Calculated coordinates for the starting location of the tree-like figures */
		double firstTreeX = rightTowerX + TOWER_WIDTH + DISTANCE_BETWEEN_TREES ;
		double treesY = y - TREE_HEIGHT;
		double secondTreeX = firstTreeX +  TREE_WIDTH + DISTANCE_BETWEEN_TREES;
		double thirdTreeX = secondTreeX + TREE_WIDTH + DISTANCE_BETWEEN_TREES;
		drawMainHouse(houseX, houseY);
//		drawTwoTowers(leftTowerX, towersY, rightTowerX);
//		drawTreeLikeFigures(firstTreeX, secondTreeX, thirdTreeX, treesY);
	}
	
/* Method that draws the main house frame */
	private void drawMainHouse (double x, double y) {
	
		drawRoofedFrame(x, y);
		drawDoor(x, y);
//		drawWindows(houseX, houseY, WINDOW_RADIUS);
	}
/* Method that draws a rectangle with a peaked roof-top */
	private void drawRoofedFrame(double x, double y) {
	 	double w = HOUSE_WIDTH;
	 	double h = HOUSE_HEIGHT;
		double x1 = x + w / 2;
		double y1 = y - HOUSE_FRAME_ROOF_HEIGHT;
		GRect frame = new GRect(x, y, w, h);
		add(frame);
		add(new GLine (x, y, x1, y1));
		add(new GLine (x1, y1, x + w, y));
	}
	
/* Method that draws the door of the house */
	private void drawDoor(double x, double y) {
		double dw = DOOR_WIDTH;
		double dh = DOOR_HEIGHT;
		double doorX = x + (HOUSE_WIDTH - DOOR_WIDTH) / 2;
		double doorY = y + (HOUSE_HEIGHT );
	}
/* Private constants */ 
	/* Specifies the width and  height of the main house frame */
	private static final double HOUSE_HEIGHT = 100;
	private static final double HOUSE_WIDTH = 75;
	
	/* Specifies the roof height for the main house frame */
	private static final double HOUSE_FRAME_ROOF_HEIGHT = 55;
	
	/* Specifies the width and height of the towers */
	private static final double TOWER_HEIGHT = 150;
	private static final double TOWER_WIDTH = 30;
	
	/* Specifies the height for the roof of the towers */
	private static final double TOWER_ROOF_HEIGHT = 45;
	
	/* Specifies the width and height of the tree-like figures */
	private static final double TREE_HEIGHT = 80;
	private static final int TREE_WIDTH = 25;
	
	/* Specifies the height of the treetop */
	private static final double TREETOP_HEIGHT = 40;
	
	/* Specifies the width and height of the door*/
	private static final double DOOR_HEIGHT = 50;
	private static final double DOOR_WIDTH = 25;
	
	/* Specifies the height of the top of the door*/
	private static final double DOOR_TOP = 15;
	
	/* Specifies the radius of the round windows */
	private static final double WINDOW_RADIUS = 10;
	
	/* Specifies the width whitespace between the window margin and the first tower */
	private static final double STARTING_TOWER_WHITESPACE = 10;
	
	/* Specifies the distance between the house and the first trees as
	 * well as the distance between the trees themselves.
	 */
	private static final double DISTANCE_BETWEEN_TREES = 20;
}
