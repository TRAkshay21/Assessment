package com.java.assessment;

public class Circle2 {
	int radius, radius1;
	double area;
	public static final double PI = 3.142;

	public Circle2(int radius, int radius1) {
		this.radius = radius;
		this.radius1 = radius1;
	}

	public double getArea() {
		return area = PI * radius * radius1;
	}

	public void printInfo() {
		System.out.println("Area of circle: " + area);
		System.out.println("Radius of circle: " + radius);
	}

	public void areaInfo() {
		System.out.println("Area of circle: " + area);
	}
}
