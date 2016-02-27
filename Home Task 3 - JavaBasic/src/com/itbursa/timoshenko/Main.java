package com.itbursa.timoshenko;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(2, 0);
		Point point2 = new Point(2, 2);
		Point point3 = new Point(4, 2);
		Point point4 = new Point(4, 0);

		Point[] pointsOfRectangle = { point1, point2, point3, point4 };
		Rectangle rectangle = new Rectangle(pointsOfRectangle);

		Point point5 = new Point(0, 0);
		int radius = 5;
		Point[] pointsOfCircule = { point5 };

		Circle circle = new Circle(pointsOfCircule, radius);

		Shape[] shapes = { rectangle, circle };

		Container container = new Container(shapes);

		Point point6 = new Point(-2, 0);
		Point point7 = new Point(0, 2);
		Point point8 = new Point(2, 0);

		Point[] pointsOfTriangle = { point6, point7, point8 };
		Triangle triangle = new Triangle(pointsOfTriangle);

		Point point9 = new Point(5, 4);
		Point[] pointsOfEllipse = { point9 };
		int radius3 = 3;
		int radius2 = 5;
		Ellipse ellipse = new Ellipse(pointsOfEllipse, radius3, radius2);
		Shape[] shapes2 = { triangle, ellipse };
		Container container2 = new Container(shapes2);
		
		container.addContainer(container2.container);
		container.moveXY(2, 2);
		container.scalingXY(2);
		
		
		System.out.println(container.toString());

	}

}
