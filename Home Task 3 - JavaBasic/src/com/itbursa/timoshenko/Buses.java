package com.itbursa.timoshenko;



public class Buses extends Quadro {
	public Buses () {
		super();
	}

	public Buses (Point[] ordinates) {
		super(ordinates);
	}
	
	@Override
	public String toString () {
		String result = "The buses has next ordinates: ";
		result += super.toString();
		return result;
	}
}
