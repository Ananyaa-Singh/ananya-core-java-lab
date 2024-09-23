package com.deloitte.lab2.ex3;

import java.util.Arrays;

//Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

public class Lab2Ex3 {

	public static int reverseNumber(int num) {
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		sb.reverse();
		return Integer.parseInt(sb.toString());
	}
	
	public static int[] getSorted(int[] arr) {
		int[] reversedArray = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			reversedArray[i] = reverseNumber(arr[i]);
		}
		
		Arrays.sort(reversedArray);
		
		return reversedArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {194, 576, 789, 321, 654};
		
		int[] result = getSorted(arr);
		
		System.out.println("Sorted array after reversing numbers:");
		for(int num : result) {
			System.out.println(num + " ");
		}
	}

}
