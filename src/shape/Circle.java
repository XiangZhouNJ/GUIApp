package shape;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A circle class extending Superclass AShape 
 * 
 * @author Xiang Zhou, Eleni Litsa
 */
public class Circle extends AShape {
	private int radius;

	/**
	 * Set the radius of the circle
	 * 
	 * @param value
	 * Radius of the circle
	 */
	public void setRadius(int value) {
		this.radius = value;
	}

	/**
	 * Get the radius of the circle
	 * 
	 * @return radius
	 */
	public int getRadius() {
		return this.radius;
	}

	/**
	 * Constructs and initializes the circle with center on position (x,y) and radius: radius
	 * 
	 * @param x 
	 * x coordinate
	 * @param 
	 * y coordinate
	 * @param radius
	 * radius of a circle
	 */
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;

	}

	/**
	 * Draw the circle in green 
	 * 
	 * @param g
	 * Graphics object
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawOval(this.getX() - radius, this.getY() - radius, this.radius * 2, this.radius * 2);
	}
}
