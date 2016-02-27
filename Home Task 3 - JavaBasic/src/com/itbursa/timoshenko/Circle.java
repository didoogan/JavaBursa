package com.itbursa.timoshenko;

 class Circle extends Shape {
	int radius;
	
	public Circle () {
		super();
	}
	
	public Circle (Point [] ordinates, int radius) {
		super(ordinates);
		this.radius = radius;
	}
	
	@Override
	public String toString () {
		String result = "The center of circule located in point " + 
		super.toString() + "and has radius = " + this.radius + "\n";
		return result;
	}
}
