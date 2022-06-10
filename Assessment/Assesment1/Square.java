package com.java.assessment;

import java.util.Scanner;

public class Square extends Rectangle2 {

	Square(double length, double width) {
		super(length, width);
	}

	public static void main(String[] args) {

		double length, width;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width of Rectangle");
		length = sc.nextDouble();
		width = sc.nextDouble();
		Square sq = new Square(length, width);
		sq.printInfo();
	}

}
