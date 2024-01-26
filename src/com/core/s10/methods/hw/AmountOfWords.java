package com.core.s10.methods.hw;

import java.util.Scanner;

public class AmountOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	
	    String sentence= sc.nextLine();
	
	    int amountOfWords = getWordsAmount(sentence);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		
		return text.split(" ").length;
		
	}
}
