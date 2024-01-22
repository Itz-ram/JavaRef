package com.core.s3.arrays;

import java.util.Arrays;


public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr;// this one is much preferred as at first glance itself you find that it i
		int arr1[];
		
		arr = new int[10];
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		double arr3[] = new double[10];
		System.out.println(arr3[0]);
		
		boolean arr4[] = new boolean[10];
		System.out.println(arr4[0]);
		
		
		int[] arr5 = {3,2,1};
		int[][] matrix = {
				{1,2,3},
				{2,3,4}
		};
		
		
		int[][] matrix2 = new int[10][];
		System.out.println(matrix2[0]);//null 
		
		System.out.println(Arrays.toString(arr5));
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		
		
		
		
	}

}
