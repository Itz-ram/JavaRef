package com.core.s7.controlstatements.hw;

import java.util.Scanner;

public class UserActivitySelector {

	public static void main(String[] args) {
		System.out.print("Please, enter action name: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		String output = "";
		switch (userInput) {
		case "login":
			output = "Please, enter your username";
			break;
		case "sign_up":
			output = "Welcome!";
			break;
		case "terminate_program":
			output = "Thank you! Good bye!";
			break;
		case "main_menu":
			output = "Main menu";
			break;
		case "about_app":
			output = "This app is created by me with support of ®IT-Bulls.com";
			break;
		default:
			output = "Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app";
		}

		System.out.println(output);

	}

}
