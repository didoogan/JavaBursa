package com.itbursa.timoshenko;

public class Square extends Quadro {
	public Square () {
		super();
	}

	public Square (Point[] ordinates) {
		super(ordinates);
	}
	
	@Override
	public String toString () {
		String result = "The square has next ordinates: ";
		result += super.toString();
		return result;
	}
}
