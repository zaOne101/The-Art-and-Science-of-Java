/** 
 * File: EmbeddedInteger.java
 *---------------------------
 * This class allows its clients to treat an integer as an object. The underlying 
 * integer value is set using setValue  and returned using getValue.
 * @Alexa	
 *
 */
public class EmbeddedInteger {
	
	/**
	 * Creates an embedded integer with the value n.
	 */
	public EmbeddedInteger(int n) {
		value = n;
	}
	/**
	 * Sets the internal value of this EmbeddedInteger to n 
	 */
	
	public void setValue(int n) {
		value = n;
	}
	
	/**
	 * Returns the internal value of this EmbeddedInteger
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Overrides the toString method to make it return the String corresponding 
	 * to the internal value.
	 */
	public String toString () {
		return "" + value;
	}
	/* Private instance variable */
	private int value; // The internal value
}
