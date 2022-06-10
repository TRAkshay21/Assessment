package com.java.assessment;

public class Rectangle2 {
	double length, Width;

	Rectangle2(double length, double width) {
		this.length = length;
		this.Width = width;
	}
	
	public void printInfo() {
		double area = length * Width;
		System.out.println("Area of Rectangle: " + area);

	}
}
