package com.deloitte.lab5.ex1;  

import java.util.Scanner;
import com.cg.eis.exception.AgeException;  // Import the AgeException class

public class Lab5Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException("Age must be above 15.");
        }
    }
}
