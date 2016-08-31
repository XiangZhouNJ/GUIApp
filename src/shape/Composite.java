package shape;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.awt.Graphics;
import java.util.ArrayList;

public class Composite extends AShape {
	/**
	 * <pre>
	 *           1..1     1..*
	 * Composite ------------------------- AShape
	 *                   &gt;       aShape
	 * </pre>
	 */
	private Set<AShape> aShapes;

	public Set<AShape> getAShape() {
		if (this.aShapes == null) {
			this.aShapes = new HashSet<AShape>();
		}
		return this.aShapes;
	}

	/**
	 * Constructs and initializes the compound shape on position (x,y)
	 * 
	 * @param x
	 * x coordinate
	 * @param y
	 * y coordinate
	 */
	public Composite(int x, int y) {
		super(x, y);
		if (this.aShapes == null) {
			this.aShapes = new HashSet<AShape>();
		}
	}

	/**
	 * Add a shape to the list of Composite
	 * 
	 * @param aShape 
	 * The shape instance to be added
	 */
	public void add(AShape aShape) {
		aShapes.add(aShape);
	}

	/**
	 * Remove a shape from the list of Composite
	 * 
	 * @param aShape
	 * The shape instance to be removed
	 */
	public void remove(AShape aShape) {
		aShapes.remove(aShape);
	}

	/**
	 * Draw the compound shape according to the list
	 * 
	 * @param g
	 * Graphics object
	 */
	@Override
	public void paint(Graphics g) {
		for (Iterator<AShape> it = aShapes.iterator(); it.hasNext();) {
			it.next().paint(g);
		}
	}

}
