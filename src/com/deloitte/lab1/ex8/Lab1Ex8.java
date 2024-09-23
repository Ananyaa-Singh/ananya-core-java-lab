package com.deloitte.lab1.ex8;

import java.util.Scanner;

//Create a method to check if a number is a power of two or not

public class Lab1Ex8 {

	public static boolean checkNumber(int n) {
		if(n <= 0) {
			return false;
		}
		while (n%2 == 0) {
			n /= 2;
		}
		if( n== 1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = checkNumber(number);
        
        if (result) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
	}

}
