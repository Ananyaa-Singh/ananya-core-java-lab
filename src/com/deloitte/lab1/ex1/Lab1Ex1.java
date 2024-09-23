package com.deloitte.lab1.ex1;

import java.util.Scanner;

//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number

public class Lab1Ex1 {

	public static int  SumOfCubesOfDigits(int num) {
		int sum = num * num * num;
		
//		int 
//		while(num != 0) {
//			int digit = num%10;
//			sum += digit*digit*digit;
//			num /= 10;
//		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an n-digit number: ");
	        int number = sc.nextInt();
	        
	        int result = SumOfCubesOfDigits(number);
	        System.out.println("Sum of cubes of digits: " + result);
	}

}
