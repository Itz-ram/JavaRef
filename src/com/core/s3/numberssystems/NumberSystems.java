package com.core.s3.numberssystems;

public class NumberSystems {

	public static void main(String[] args) {

		int dec = 123;
		System.out.println(dec);
		int bin = 0b1011;
		System.out.println(bin);

		int oct = 01237123;
		System.out.println(oct);
		int hex = 0x12AD;
		System.out.println(hex);
		
		/*
		 * ACDC HEX to DECIMAL
		 * 
		 * ((16^3) * 10 ) + ((16^2) * 12) + ((16^1) * 13 ) + ((16^0) * 12 )
		 * 
		 *  40960 + 3072 + 208 + 12
		 */
		int chex = 0xACDC;
		System.out.println(chex);
		
	}

}
