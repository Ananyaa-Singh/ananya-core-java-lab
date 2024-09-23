package com.deloitte.lab1.ex3;

import java.util.Scanner;

//The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?

public class Lab1Ex3 {

//	Non-Recursive approach
	public static int fibonacci(int n) {
		if( n==1 || n==2) {
			return 1;
		}
		int a=1, b=1;
		int next = 1;
		for(int i=3; i<=n; i++) {
			next = a+b;
			a=b;
			b=next;
		}
		return next;
	}
	
//	Recursive approach
	public static int fibonacciRecursive(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position of Fibonacci sequence: ");
        int n = sc.nextInt();
        
        System.out.println("The Fibonacci value at position " + n + " using non-recursive approach is: " + fibonacci(n));
        
//        System.out.print("Enter the position of Fibonacci sequence for recursive approach: ");
        
        System.out.println("The Fibonacci value at position " + n + " using recursive approach is: " + fibonacciRecursive(n));
	}

}
