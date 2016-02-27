package com.itbursa.timoshenko;

public class Trapezium extends Quadro {
	public Trapezium () {
		super();
	}

	public Trapezium (Point[] ordinates) {
		super(ordinates);
	}
	
	@Override
	public String toString () {
		String result = "The trapezium has next ordinates: ";
		result += super.toString();
		return result;
	}
	
}
