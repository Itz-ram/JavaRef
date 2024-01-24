package com.core.s7.controlstatements.hw;

public class AddNumbers {
	public static void main(String[] args) {
		if (args[0].contains(".") || args[1].contains(".")) {
			System.out.printf("%.1f", Float.parseFloat(args[0]) + Float.parseFloat(args[1]));
		} else {
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		}
	}
}
