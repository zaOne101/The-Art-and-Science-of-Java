import acm.program.*;
import acm.graphics.*;

/* 
 * File: Diamond.java
 *------------------- 
 * @Eric Roberts
 */

public class Diamond extends GraphicsProgram {

	public void run () {
		/* addVertex method */
		   GPolygon diamond = new GPolygon();
	     diamond.addVertex (- DIAMOND_WIDTH / 2 , 0);
	     diamond.addVertex( 0, DIAMOND_HEIGHT / 2);
	     diamond.addVertex(DIAMOND_WIDTH / 2 , 0);
	     diamond.addVertex(0, -DIAMOND_HEIGHT / 2);
	     add(diamond, getWidth() / 2, getHeight() / 2) ;
	     
	     /* addEdge method */
	     GPolygon diamond1 = new GPolygon();
	     diamond1.addVertex( -DIAMOND_WIDTH / 2 , 0);
	     diamond1.addEdge(DIAMOND_WIDTH / 2, DIAMOND_HEIGHT / 2);
	     diamond1.addEdge(DIAMOND_WIDTH / 2, -DIAMOND_HEIGHT / 2);
	     diamond1.addEdge(-DIAMOND_WIDTH / 2, -DIAMOND_HEIGHT / 2);
	     diamond1.addEdge(-DIAMOND_WIDTH / 2, DIAMOND_HEIGHT /2);
	     add(diamond1, getWidth() / 4, getHeight() / 4);

	}
	
	/*Private constants */
	private static final int DIAMOND_WIDTH = 50;
	private static final int DIAMOND_HEIGHT = 85;
}
