package com.java.assessment;

import java.util.Random;

public class CircleTest extends Circle {
	public CircleTest(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int arr[] = new int[100];
		int arr1[] = new int[100];
		int count = 0;
		double sum = 0, sum1 = 0;
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(99);
		}
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = rd.nextInt(999);
		}
		for (int i = 0; i < arr.length; i++) {
			try {
				Circle obj;
				obj = new CircleTest(arr[i]);
				sum = sum + obj.getArea();
				Circle2 obj1;
				obj1 = new Circle2(arr[i], arr1[i]);
				sum1 = sum1 + obj1.getArea();
				count++;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Total count of area of circle: " + count);
		System.out.println("Sum of total area of circle 1 : " + sum);
		System.out.println("Sum of total area of circle 2 : " + sum1);
	}
}
