package com.deloitte.lab1.ex5;

import java.util.Scanner;

//Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

public class Lab1Ex5 {

	public static int calculateSum(int n) {
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
				System.out.println(i);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int result = calculateSum(n);
	        System.out.println("The sum of first " + n + " natural numbers divisible by 3 or 5 is: " + result);
	}

}
