import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This program allows the user to type in a font name and then displays a line
 * using that font.
 * @author Alexa
 *
 */

public class FontSampler  extends GraphicsProgram {
	
	public void init() {
		fontField = new JTextField(MAX_FONT_NAME);
		fontField.addActionListener(this);
		add(new JLabel("Font"), SOUTH);
		add(fontField, SOUTH);
		lastY = 0;
		lastLabel = new GLabel(TEST_STRING);
		add(lastLabel);
	}
	
	/* Called when any action event is generated */ 
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == fontField ) {
			GLabel label = new GLabel(TEST_STRING);
			label.setFont(lastLabel.getFont());
			label.setFont(fontField.getText());
			addGLabel(label);
			lastLabel = label;
		}
	}
	
	/* Adds a GLabel on the text line, adjusting for different size */
	private void addGLabel(GLabel label ) {
		lastY += label.getHeight();
		lastY += lastLabel.getDescent() - label.getDescent();
		add(label, LEFT_MARGIN, lastY);
	}
	
	/* Private constants */
	private static final int MAX_FONT_NAME = 30;
	private static final int LEFT_MARGIN = 3;
	private static final String TEST_STRING = "The quick brown fox jumped over the lazy dog";
	
	/* Private instance variables */
	private JTextField  fontField;
	private GLabel lastLabel;
	private double lastY;
}
