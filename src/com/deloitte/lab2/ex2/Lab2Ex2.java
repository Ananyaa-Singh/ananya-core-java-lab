package com.deloitte.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

//Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
//Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE

public class Lab2Ex2 {

	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		
		int n = arr.length;
		int mid = n/2;
		if(n%2 != 0) {
			mid = mid+1;
		}
		
		for(int i=0; i<n; i++) {
			if(i<mid) {
				arr[i] = arr[i].toUpperCase();
			}
			else {
				arr[i] = arr[i].toLowerCase();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] arr = {"banana", "apple", "mango", "cherry", "grape"};
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextLine();
        }
        
		String[] result = sortStrings(arr);
		
		System.out.println("Sorted and modified array:");
		for(String str : result) {
			System.out.print(str + " ");
		}
	}

}
