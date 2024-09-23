package com.deloitte.lab2.ex4;

//Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order

import java.util.Arrays;

public class Lab2Ex4 {

	public static int[] modifyArray(int[] arr) {
		Arrays.sort(arr);
		
		int[] temp = new int[arr.length];
		int j=0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				temp[j++] = arr[i];
			}
		}
				
		int[] result = new int[j];
		for(int i=0; i<j; i++) {
			result[i] = temp[i];
		}
		
		for(int i=0; i<result.length/2; i++) {
			int tempVar = result[i];
			result[i] = result[result.length - i - 1];
			result[result.length - i - 1] = tempVar;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 8, 3, 1, 9, 1, 5, 2};
		
		int[] result = modifyArray(arr);
		
		System.out.println("Array after removing duplicates and sorting in descending order:");
        for(int num : result) {
        	System.out.print(num + " ");
        }
	}

}
;