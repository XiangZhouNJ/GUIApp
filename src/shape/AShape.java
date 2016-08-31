package shape;

import java.awt.*;

/**
 * The abstract class of all shapes
 * 
 * @author Xiang Zhou, Eleni Litsa
 *
 */
public abstract class AShape {

	private int x;
	private int y;

	/**
	 * Constructs and initializes the AShape on position (x,y)
	 * 
	 * @param x 
	 * x coordinate
	 * @param 
	 * y coordinate
	 */
	public AShape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Abstract paint method, the subclass of AShape must implement it 
	 * 
	 * @param g
	 * Graphics object
	 */
	public abstract void paint(Graphics g);

	/**
	 * Set the x coordinate of the AShape
	 * 
	 * @param value
	 * x coordinate
	 */
	public void setX(int value) {
		this.x = value;
	}

	/**
	 * Get the x coordinate of the AShape
	 * 
	 * @return x coordinate
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Set the y coordinate of the AShape
	 * 
	 * @param value
	 * y coordinate
	 */
	public void setY(int value) {
		this.y = value;
	}

	/**
	 * Get the y coordinate of the AShape
	 * 
	 * @return y coordinate
	 */
	public int getY() {
		return this.y;
	}

}
