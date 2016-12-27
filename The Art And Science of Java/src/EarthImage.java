import acm.program.*;
import acm.graphics.*;

/*
 * File: EarthImage.java
 *----------------------
 *@Eric Roberts
 */
public class EarthImage extends GraphicsProgram {

	public void run() {
		add(new GImage("EarthImage.jpg"));
		addCitation("Courtesy NASA/JPL-Caltech");
	}
	
	private void addCitation(String text) {
		GLabel label = new GLabel(text);
		label.setFont(CITATION_FONT);
		double x = getWidth() - label.getWidth();
		double y = getHeight() - CITATION_MARGIN + label.getAscent();
		add(label , x, y);
	}
	
	/* Private constants */
	private static final String CITATION_FONT = "SansSerif-10";
	private static final int CITATION_MARGIN = 13;
	
	/* Set the dimensions of the window */
	public static final int APPLICATION_WIDTH = 640;
	public static final int APPLICATION_HEIGHT = 640 + CITATION_MARGIN;
}
