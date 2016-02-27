package com.itbursa.timoshenko;

public class Ellipse extends Circle {
	int radius2;
	public Ellipse () {
		super();
	}
	
	public Ellipse (Point [] ordinates, int radius, int radius2) {
		super(ordinates, radius);
		this.radius2 = radius2;
	}
	
	@Override
	public String toString () {
		String result = "The center of ellipse located in point " + 
		this.ordinates[ordinates.length-1].x + ", " +
		this.ordinates[ordinates.length-1].y + "; " +
		" and has fierst radius = " + this.radius +
		" and second radius = " + this.radius2;
		return result;
	}

}
