package com.itbursa.timoshenko;

public class Triangle extends Shape {
	
	public Triangle() {
		super();
	}
	
	public Triangle(Point[] ordinates) {
		this.ordinates = ordinates;
	}
	
	@Override
	public String toString () {
		String result = "The triangle has next ordinates: ";
		result += super.toString();
		return result;
	}
	
	
}
