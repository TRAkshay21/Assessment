package com.java.assessment;

public class Circle {
	int radius;
	double area;
	public static final double PI=3.142;
	public Circle(int radius) {
		this.radius=radius;
	}
	public double getArea() {
		return area = PI*radius*radius;
	}
	public void printInfo()
	{
		System.out.println("Area of circle: " +area);
		System.out.println("Radius of circle: " +radius);
	}
	public void areaInfo()
	{
		System.out.println("Area of circle: " +area);
	}
}
