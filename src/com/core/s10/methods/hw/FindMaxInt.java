package com.core.s10.methods.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String arr[] = sc.nextLine().split(" ");
		int[] intArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArray[i] = Integer.parseInt(arr[i]);
		}

		int maxInt = findMaxIntInArray(intArray);

		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	public static int findMaxIntInArray(int[] intArray) {
		if (intArray.length == 0)
			return -1;
		int max = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		return max;
	}
}
