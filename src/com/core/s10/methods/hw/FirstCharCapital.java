package com.core.s10.methods.hw;

import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String str) {
		String data = "";
		boolean isCapitalized = false;
		for(int i=0; i<str.length(); i++)
		{
			char x = str.charAt(i);
			if(Character.isAlphabetic(x))
			{
				if(!isCapitalized)
				{
					isCapitalized=true;
					data+=Character.toUpperCase(x);
				}
				else {
					data+= x;
				}
			}else {
				isCapitalized=false;
				data+=x;
			}
			
		}
		
		
		
		return data;
	}
}
