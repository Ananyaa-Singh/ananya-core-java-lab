package com.deloitte.lab1.ex7;

import java.util.Scanner;

public class Lab1Ex7DiffApproach {

	public static boolean checkNumber(int number) {
		if(number < 10) {
			return true;
		}
		
		int prevDigit = number%10;
		number /= 10;
		
		while(number>0) {
			int currentDigit = number%10;
			if(currentDigit > prevDigit) {
				return false;
			}
			prevDigit = currentDigit;
			number /= 10;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = checkNumber(number);
        if (result) {
            System.out.println(number + " is an increasing number.");
        } else {
            System.out.println(number + " is not an increasing number.");
        }
	}

}
