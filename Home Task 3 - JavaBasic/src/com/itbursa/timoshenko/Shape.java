package com.itbursa.timoshenko;

public abstract class Shape {
	int[][] ordinates;

	public Shape() {

	}

	public Shape(int[][] ordinates) {
		this.ordinates = ordinates;
	}

	public Shape scaleShape() {
		return this;
	}

	public Shape moveShape() {
		return this;
	}

	@Override
	public String toString() {
		return new String();
	}

}

abstract class Quadro extends Shape {
	int[][] ordinates;

	public Quadro() {
		super();
	}

	public Quadro(int[][] ordinates) {

		this.ordinates = ordinates;
	}

	public int[][] scaleShape(int k) {
		for (int i = 0; i < this.ordinates.length; i++) {
			for (int j = 0; j < this.ordinates[i].length; j++) {
				this.ordinates[i][j] *= k;
			}
		}
		return this.ordinates;
	}

	public int[][] moveShape(int x, int y) {
		for (int i = 0; i < this.ordinates.length; i++) {
			for (int j = 0; j < ordinates[i].length; j++) {
				if (i == 0) {
					this.ordinates[i][j] += x;
					continue;
				}

				this.ordinates[i][j] = ordinates[i][j] + y;

			}
		}
		return this.ordinates;
	}

}

abstract class Circle extends Shape {

}
