package com.itb.classes;

/**
 * This class creates a new circle with a specified radius and center location.
 */
public class Circle {

	private int centerX;
	private int centerY;
	private int radius;

	/**
	 * Creates a new instance of Circle with a specified position and radius.
	 */
	public Circle(int centerX, int centerY, int radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}

	/**
	 * Creates a new instance of Circle with a specified radius.
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	/**
	 * Moves the center of the circle
	 * 
	 * @param dx
	 *            - differentiation of x coordinate
	 * @param dy
	 *            - differentiation of y coordinate
	 */
	public void move(int dx, int dy) {
		this.centerX += dx;
		this.centerY += dy;
	}

	/**
	 * Checks if specified point belongs to this circle
	 * 
	 * @param x
	 *            - x center coordinate of specified point
	 * @param y
	 *            - y center coordinate of specified point
	 * @return true if specified point belongs to this circle, if not - return
	 *         false
	 */
	public boolean isPointInCircle(int x, int y) {
		
		boolean result = false;
		
		if (x - this.centerX  <= this.radius 
			&& y - this.centerY <= this.radius ) {
			result = true;
		}
		
		return result;
	}

	/**
	 * Checks if specified circle is in this circle
	 * 
	 * @param circle
	 *            - specified circle
	 * @return true if specified circle is in this circle, if not - return false
	 */
	public boolean isCircleInCurrentCircle(Circle circle) {
		
		int length;
		
		length = (int) Math.sqrt(
		Math.pow(circle.centerX - this.centerX, 2) - 
		Math.pow(circle.centerY - this.centerY, 2) 
		);
		return (length <= (circle.radius + this.radius) );
	}

	@Override
	public String toString() {
		return String.format(" The center of the circle has coordinates "
		       + "(%d ; %d), and lenght of a radius = %d ", 
		       this.centerX, this.centerY, this.radius);  
		
	}
}