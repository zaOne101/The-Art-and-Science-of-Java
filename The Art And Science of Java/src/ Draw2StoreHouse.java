/*
 * File: Draw2StoreHouse.java
 * --------------------------
 *@Eric Roberts
 * This program draws the picture of a 2 store house on the screen.
 * The house is centered in the window, the door is centered in the 
 * middle of the facade, and the windows are centered between the 
 * spaces of the door and the side walls. The roof is peaked. The l
 * lower store windows are larger than the upper store windows.
 * This is  also exercise 9 is Chapter 5.
 */

import acm.program.*;
import acm.graphics.*;

	public class Draw2StoreHouse extends GraphicsProgram {
		
		public void run () {
			double houseX = (getWidth() - HOUSE_WIDTH) / 2;
			double emptyHeightWhiteSpace = getHeight() - HOUSE_HEIGHT - ROOF_PEAK;
			double houseY = emptyHeightWhiteSpace / 2 + ROOF_PEAK;
			drawHouseFrame(houseX, houseY);
			drawRoof(houseX, houseY);
			drawDoor(houseX, houseY);
			drawWindows(houseX, houseY);
		}
/* Method that draws the house main frame */
		private void drawHouseFrame(double x, double y) {
			GRect houseFrame = new GRect (x, y, HOUSE_WIDTH, HOUSE_HEIGHT);
			add(houseFrame);
		}
		
/* Method that draws the roof */
		private void drawRoof (double x, double y) {
			add(new GLine(x, y, x + HOUSE_WIDTH / 2, y - ROOF_PEAK));
			add(new GLine(x + HOUSE_WIDTH/2, y - ROOF_PEAK, x + HOUSE_WIDTH, y ));
		}
	
/* Method that draws and centers the door in the house frame */ 
		private void drawDoor (double x, double y){
			double doorX = x + (HOUSE_WIDTH - DOOR_WIDTH) / 2;
			double doorY = y + (HOUSE_HEIGHT - DOOR_HEIGHT);
			add (new GRect (doorX, doorY, DOOR_WIDTH, DOOR_HEIGHT));
			drawDoorknob(doorX, doorY);
		}

/* Method that draws the doorknob for the door */
		private void drawDoorknob (double x, double y) {
			double doorknobX = x + 3 *(DOOR_WIDTH - 2 * DOORKNOB_RADIUS) / 4;
			double doorknobY = y + (DOOR_HEIGHT - 2 * DOORKNOB_RADIUS) / 2;
			GOval doorknob = new GOval(doorknobX, doorknobY, DOORKNOB_RADIUS * 2, DOORKNOB_RADIUS * 2);
			add (doorknob);
		}
/* Method that draws the windows */
		private void drawWindows(double x, double y) {
			drawLowerStoreWindows(x, y);
			drawUperStoreWindows(x, y);
		}
/* Method that draws the upper windows */
		private void drawUperStoreWindows(double x, double y) {
			drawUpperLeftWindow(x, y);
			drawUpperRightWindow(x, y);
		}
/* Method that draws the upper left window */ 
		private void drawUpperLeftWindow(double x, double y){
			double leftWindowX = x + ((HOUSE_WIDTH / 2) - (2 * WINDOW_WIDTH)) /2;
			double leftWindowY = y + HOUSE_HEIGHT / 6;
			GRect smallWindowFrame0 = new GRect( leftWindowX, leftWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame0);
			GRect smallWindowFrame1 = new GRect(leftWindowX + WINDOW_WIDTH, leftWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame1);
			GRect smallWindowFrame2 = new GRect(leftWindowX, leftWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame2);
			GRect smallWindowFrame3 = new GRect (leftWindowX +WINDOW_WIDTH, leftWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame3);
			}
/* Method that draws the upper right window */
		private void drawUpperRightWindow (double x, double y) {
			double rightWindowX = x + HOUSE_WIDTH / 2 + ((HOUSE_WIDTH / 2) - (2 * WINDOW_WIDTH)) /2;
			double rightWindowY = y + HOUSE_HEIGHT / 6;
			GRect smallWindowFrame0 = new GRect( rightWindowX, rightWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame0);
			GRect smallWindowFrame1 = new GRect(rightWindowX + WINDOW_WIDTH, rightWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame1);
			GRect smallWindowFrame2 = new GRect(rightWindowX, rightWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame2);
			GRect smallWindowFrame3 = new GRect (rightWindowX +WINDOW_WIDTH, rightWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame3); 
		}

/* Method that draws the lower windows */ 
		private void drawLowerStoreWindows (double x, double y) {
			drawLowerLeftWindow(x, y);
			drawLowerRightWindow(x, y);
		}
/* Method that draws the lower left window */
		private void drawLowerLeftWindow(double x, double y) {
			double leftWindowX = x + ((HOUSE_WIDTH - DOOR_WIDTH) / 2 - 3 * WINDOW_WIDTH) / 2;
			double leftWindowY = y + HOUSE_HEIGHT / 2 + (HOUSE_HEIGHT / 2 - DOOR_HEIGHT);  
			GRect smallWindowFrame0 = new GRect (leftWindowX, leftWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame0);
			GRect smallWindowFrame1 = new GRect (leftWindowX + WINDOW_WIDTH, leftWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame1);
			GRect smallWindowFrame2 = new GRect (leftWindowX + 2 * WINDOW_WIDTH, leftWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame2);
			GRect smallWindowFrame3 = new GRect (leftWindowX, leftWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame3);
			GRect smallWindowFrame4 = new GRect (leftWindowX + WINDOW_WIDTH, leftWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame4);
			GRect smallWindowFrame5 = new GRect (leftWindowX + 2 * WINDOW_WIDTH, leftWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame5);
		}

/* Method that draws the lower right window */
		private void drawLowerRightWindow (double x, double y) {
			double rightWindowX = x + HOUSE_WIDTH / 2 + DOOR_WIDTH / 2 + ((HOUSE_WIDTH - DOOR_WIDTH) / 2 - 3 * WINDOW_WIDTH) / 2;
			double rightWindowY = y + HOUSE_HEIGHT / 2 + 2 + (HOUSE_HEIGHT / 2 - DOOR_HEIGHT);
			GRect smallWindowFrame0 = new GRect (rightWindowX, rightWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame0);
			GRect smallWindowFrame1 = new GRect (rightWindowX + WINDOW_WIDTH, rightWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame1);
			GRect smallWindowFrame2 = new GRect (rightWindowX + 2 * WINDOW_WIDTH, rightWindowY, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame2);
			GRect smallWindowFrame3 = new GRect (rightWindowX, rightWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame3);
			GRect smallWindowFrame4 = new GRect (rightWindowX + WINDOW_WIDTH, rightWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add(smallWindowFrame4);
			GRect smallWindowFrame5 = new GRect (rightWindowX + 2 * WINDOW_WIDTH, rightWindowY + WINDOW_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT);
			add (smallWindowFrame5);
		} 
		
/* Private constants */
		
/* House dimensions are specified */
	public static final double HOUSE_WIDTH = 120;
	public static final double HOUSE_HEIGHT = 90;
/* 	Distance between the house height and the peak of the roof */
	public static final double ROOF_PEAK = 50;
/* Size of the smaller window frames */
	public static final double WINDOW_HEIGHT = 12;
	public static final double WINDOW_WIDTH = 10;
/* Size of the door */
	public static final double DOOR_WIDTH = 24;
	public static final double DOOR_HEIGHT = 40; 
/* Door-knob radius */
	public static final double DOORKNOB_RADIUS = 2;
}
