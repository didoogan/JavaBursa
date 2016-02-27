package com.itbursa.timoshenko;

public abstract class Shape {
	Point[] ordinates;

	public Shape() {

	}

	public Shape(Point[] ordinates) {
		this.ordinates = ordinates;
	}

	public void scaleShape(int k) {
		for (int i = 0; i < ordinates.length; i++) {
			this.ordinates[i].x *= k;
			this.ordinates[i].y *= k;

		}
	}

	public void moveShape(int x, int y) {
		for (int i = 0; i < ordinates.length; i++) {
			this.ordinates[i].x += x;
			this.ordinates[i].y += y;

		}
	}

	@Override
	public String toString() {
		String result = "";
		for (Point point : ordinates) {
			result += "\n" + point.x + ", " + point.y + ";" + "\n" + "\n" ;
		}
		return result;
	}

}
