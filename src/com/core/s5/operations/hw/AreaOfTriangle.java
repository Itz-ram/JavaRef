package com.core.s5.operations.hw;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter A side of a triangle: ");
		int a = sc.nextInt();

		System.out.print("Please, enter B side of a triangle: ");
		int b = sc.nextInt();

		System.out.print("Please, enter C side of a triangle: ");
		int c = sc.nextInt();
		double p = (double)(a + b + c)/2;
		
		
		double triangleArea = Math.sqrt((double)p *(p-a) * (p-b) * (p-c));

		System.out.println("Triangle area is: " + triangleArea);
	}

}
