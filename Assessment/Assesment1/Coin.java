package com.java.assessment;
import java.util.Scanner;

public class Coin {
	static String sideUp;

	public static void main(String[] args) {
		int hcount = 0, tcount = 0;
		System.out.println("Enter how many times you want filp the coin");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if (Math.random() < 0.5) {
				System.out.println("Head");
				hcount++;
			} else {
				System.out.println("Tails");
				tcount++;
			}
		}
		System.out.println("Head Count: " + hcount);
		System.out.println("Tail Count: " + tcount);
	}
}
