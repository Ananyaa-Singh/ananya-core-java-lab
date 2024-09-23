package com.deloitte.lab1.ex6;

//Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.

import java.util.Scanner;

public class Lab1Ex6 {

	public static int calculateDifference(int n) {
		int sumOfSquares = 0;
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sumOfSquares += i*i;
			sum += i;
		}
		
		int squaresOfSum = sum*sum;
		
		return sumOfSquares - squaresOfSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = calculateDifference(n);
        System.out.println("The difference is: " + result);
	}

}
