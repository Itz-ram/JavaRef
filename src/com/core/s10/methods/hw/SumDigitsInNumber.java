package com.core.s10.methods.hw;

import java.util.Scanner;

public class SumDigitsInNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		int sum =0 ;
		if(number<0)number=-number;
		while(number>0)
		{
			sum+= Math.abs(number%10);
			number/=10;
		}
		return sum;
	}
}
