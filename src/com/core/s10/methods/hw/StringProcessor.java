package com.core.s10.methods.hw;

public class StringProcessor {
	 public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";
		
		public static void main(String[] args) {
			System.out.println("===== Convert 1 demo =====");
			System.out.println(convert1(INPUT_DATA));
			
			System.out.println("===== Convert 2 demo =====");
			System.out.println(convert2(INPUT_DATA));
			
		}
		
		public static String convert1(String input) {
			String[] lines = input.split(System.lineSeparator());
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i < lines.length; i++) {
				String[] data = lines[i].split(";");
				builder.append(data[0]).append(" ==> ").append(data[2]).append("\n");
			}
			
			return builder.toString();
			
		
		}
		
		
		public static String convert2(String input) {
			String[] lines = input.split(System.lineSeparator());
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i < lines.length; i++) {
				String[] data = lines[i].split(";");
				builder.append(data[1]).append(" (email: ").append(data[2]).append(")").append("\n");
			}
			
			return builder.toString();
			
		
		
		}

}
