package shape;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A rectangle class extending Superclass AShape 
 * 
 * @author Xiang Zhou, Eleni Litsa
 */
public class Rectangle extends AShape {

	private int width;
	private int height;

	/**
	 * Set the width of the rectangle
	 * 
	 * @param value
	 * width of the rectangle
	 */
	public void setWidth(int value) {
		this.width = value;
	}

	/**
	 * Get the width of the rectangle
	 * 
	 * @return width
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Set the height of the rectangle
	 * 
	 * @param value
	 * height of the rectangle
	 */
	public void setHeight(int value) {
		this.height = value;
	}

	/**
	 * Get the height of the rectangle
	 * 
	 * @return height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * Constructs and initializes the rectangle with left top corner on position (x,y) with width:width and height:height
	 * 
	 * @param x 
	 * x coordinate
	 * @param 
	 * y coordinate
	 * @param width 
	 * width of a rectangle
	 * @param height 
	 * height of a rectangle
	 */
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;

	}

	/**
	 * Draw the rectangle in black
	 * 
	 * @param g 
	 * Graphics object
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(this.getX(), this.getY(), this.width, this.height);
	}
}
