package com.deloitte.lab1.ex7;

import java.util.Scanner;

public class Lab1Ex7 {

	public static boolean checkNumber(int n) {
		String numStr = Integer.toString(n);
		
		for(int i=0; i<numStr.length()-1; i++) {
			if(numStr.charAt(i) > numStr.charAt(i+1)) {
				return false;
			}
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
