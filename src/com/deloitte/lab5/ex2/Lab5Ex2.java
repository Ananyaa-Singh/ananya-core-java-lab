package com.deloitte.lab5.ex2;

import java.util.Scanner;
import com.cg.eis.exception.NameException;

public class Lab5Ex2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        try {
            validateName(firstName, lastName);
            System.out.println("Full name is valid: " + firstName + " " + lastName);
        } catch (NameException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateName(String firstName, String lastName) throws NameException {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new NameException("First name and last name cannot be blank.");
        }
    }
}
