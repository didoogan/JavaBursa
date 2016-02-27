package com.itbursa.timoshenko;

public class Parallelogram extends Quadro {
	public Parallelogram () {
		super();
	}

	public Parallelogram (Point[] ordinates) {
		super(ordinates);
	}
	
	@Override
	public String toString () {
		String result = "The parallelogram has next ordinates: ";
		result += super.toString();
		return result;
	}

}
