package com.core.s3.primitives;

public class PrimitiveTypes {
	public static void main(String[] args) {
		int a = 1;
		byte b= 12;
		short s;
		s =1;
		
		char c = 'a';
		
		long l = 1_000_000_000;
		long y = 2_000_000_000_000L;//by default int will be used so if the range in outer than int we need to explicitly specify l or L for long
		
		double dd = 1.2;
		float df = 1.2f;//by default double will be used. as double is larger than float we need to explicitly specify 1.2f or 1.2F; 
		System.out.println(df);
		
		var ab = 12;
//		ab = 123f;// we cannot reassign to some other data types in the var variables
		ab = (int)123f; // so we can type cast it to convert the values to int 
		
		
		char x = 100;// here default value is int but compiler can read literals so no need to type cast here
		System.out.println(x);
		
		int a1 = 100;
		char z = (char)a1;// here we need to type cast as it is already declared as int 
		
		
		byte b1 = (byte)1000;
		System.out.println(b1);
		
		long number = 499_999_999_000_000_001L;
		double converted = (double)number;
		System.out.println(number - (long)converted);
	}

}
