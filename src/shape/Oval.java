package shape;

import java.awt.Graphics;

/**
 * An oval class extending Superclass AShape 
 * 
 * @author Xiang Zhou, Eleni Litsa
 */
public class Oval extends AShape {
	private int width;
	private int height;

	/**
	 * Set the width of the oval
	 * 
	 * @param value
	 * width of the oval
	 */
	public void setWidth(int value) {
		this.width = value;
	}

	/**
	 * Get the width of the oval
	 * 
	 * @return width
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Set the height of the oval
	 * 
	 * @param value
	 * height of the oval
	 */
	public void setHeight(int value) {
		this.height = value;
	}

	/**
	 * Get the height of the oval
	 * 
	 * @return height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * Constructs and initializes the oval with center on position (x,y) with width:width and height:height
	 * 
	 * @param x 
	 * x coordinate
	 * @param 
	 * y coordinate
	 * @param width 
	 * width of an oval
	 * @param height 
	 * height of an oval
	 */
	public Oval(int x, int y, int width, int height) {

		super(x, y);

		this.width = width;
		this.height = height;

	}

	/**
	 * draw the oval with the center at (x,y) and width: width, height: height
	 * 
	 * @param g
	 * Graphics object
	 */
	@Override
	public void paint(Graphics g) {

		g.drawOval(this.getX() - width, this.getY() - height, this.width, this.height);
	}

}
