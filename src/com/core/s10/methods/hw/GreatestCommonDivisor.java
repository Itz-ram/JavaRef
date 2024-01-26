package com.core.s10.methods.hw;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter two numbers separated by space: ");
		String userInput = sc.nextLine();

		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);

		System.out.println(gcdRecursive(number1, number2));
	}

	public static int gcdRecursive(int firstNumber, int secondNumber) {
		if (firstNumber == 0)
			return Math.abs(secondNumber);
		if (firstNumber > secondNumber) {
			return gcdRecursive(firstNumber % secondNumber, secondNumber);

		} else {
			return gcdRecursive(secondNumber % firstNumber, firstNumber);
		}

	}
}
