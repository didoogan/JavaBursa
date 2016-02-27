package com.itbursa.timoshenko;

abstract class Quadro extends Shape {
	
	public Quadro() {
		super();
	}

	public Quadro(Point [] ordinates) {
		super(ordinates);
		
	}

	public void scaleShape(int k) {
		super.scaleShape(k);
	}

	public void moveShape(int x, int y) {
		super.moveShape(x, y);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
} 
	
	

