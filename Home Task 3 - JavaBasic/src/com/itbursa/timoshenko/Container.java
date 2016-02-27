package com.itbursa.timoshenko;

public class Container {
	// 2 - dimension array for x, y ordinates
	Shape[] container;

	public Container(Shape[] data) {
		this.container = data;
	}

	// moving ordinates on explicit value x, y
	public void moveXY(int x, int y) {

		for (int i = 0; i < this.container.length; i++) {
			this.container[i].moveShape(x, y);
		}

	}

	public void scalingXY(int k) {
		for (int i = 0; i < this.container.length; i++) {
			this.container[i].scaleShape(k);
		}

	}

	public void addContainer(Shape[] container) {
		int length = this.container.length + container.length;
		Shape[] result = new Shape[length];

		for (int i = 0; i < this.container.length; i++) {
			result[i] = this.container[i];
		}

		for (int i = this.container.length; i < result.length; i++) {
			result[i] = container[i-this.container.length];
		}

		this.container = result;
		
	}

	@Override
	public String toString() {
		String result = "";
		for (Shape shape : container) {
			result += shape.toString() ;
		}
		return result;
	}

}
