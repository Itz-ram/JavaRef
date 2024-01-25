package com.core.s9.iteration.hw;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner in  = new Scanner(System.in);
        String num = in.nextLine();
        for(int i=0; i<num.length(); i++)
        {
            System.out.println(num.charAt(i));
        }
	}

}
