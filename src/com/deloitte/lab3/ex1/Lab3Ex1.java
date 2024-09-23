package com.deloitte.lab3.ex1;

//Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a line of integers separated by spaces: ");
		String inputLine = sc.nextLine();
		
		StringTokenizer str = new StringTokenizer(inputLine);
		
		int sum=0;
		
		while(str.hasMoreTokens()) {
			String token = str.nextToken();
			int number = Integer.parseInt(token);
			System.out.println("Integer: "+ number);
			sum += number;
		}
		System.out.println("Sum of all integers: " + sum);
		sc.close();
	}
}

// Output - 
//Enter a line of integers separated by spaces: 4 3 2 4
//Integer: 4
//Integer: 3
//Integer: 2
//Integer: 4
//Sum of all integers: 13
