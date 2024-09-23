package com.deloitte.lab2.ex1;

//Create a method which accepts an array of integer elements and return the second smallest element in the array

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex1 {

	public static int getSecondSmallest(int[] array) {
		if(array.length < 2) {
			return -1;
		}
		Arrays.sort(array);
		
		for(int i=1; i<array.length; i++) {
			if(array[i] != array[0]) {
				return array[i];
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        if(n<2) {
        	System.out.println("Array must contain at least two elements.");
            return;
        }
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
        	array[i] = sc.nextInt();
        }
        
        int result = getSecondSmallest(array);
        if (result == -1) {
            System.out.println("No valid second smallest element found.");
        } else {
            System.out.println("The second smallest element is: " + result);
        }
	}

}
