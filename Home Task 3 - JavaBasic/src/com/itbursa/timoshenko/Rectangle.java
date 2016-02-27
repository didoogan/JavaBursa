package com.itbursa.timoshenko;

public class Rectangle extends Quadro {

	public Rectangle () {
		super();
	}

	public Rectangle (Point[] ordinates) {
		super(ordinates);
	}
	
	@Override
	public String toString () {
		String result = "The rectangle has next ordinates: ";
		result += super.toString();
		return result;
	}
}
