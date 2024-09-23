package com.deloitte.lab1.ex4;

import java.util.Scanner;

//Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

public class Lab1Ex4 {

	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i=2; i<n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrime(int num) {
		System.out.println("Prime numbers up to " + num + ":");
		for (int i=2; i<=num; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = sc.nextInt();
	        
	        printPrime(num);

	}

}
