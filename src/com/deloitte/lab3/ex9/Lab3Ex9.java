package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Create a method to accept date and print the duration in days, months and years with regards to current system date.

public class Lab3Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a date in the format dd-MM-yyyy:");
		String inputDate = sc.nextLine();
		
		calculateDuration(inputDate);
		
		sc.close();

	}
	
	public static void calculateDuration(String inputDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate enteredDate = LocalDate.parse(inputDate, formatter);
		LocalDate currentDate = LocalDate.now();
		
		Period duration = Period.between(enteredDate, currentDate);
		
		int years = duration.getYears();
		int months = duration.getMonths();
        int days = duration.getDays();

        
        System.out.println("Duration from " + inputDate + " to current date:");
        System.out.println(years + " years, " + months + " months, and " + days + " days");
	}

}
