package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {

//	Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with int inputs. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Traffic Light Simulation");
		System.out.println("Enter 1 for Red, 2 for Yellow, 3 for Green:");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Stop");
            break;
        case 2:
            System.out.println("Ready");
            break;
        case 3:
            System.out.println("Go");
            break;
        default:
            System.out.println("Invalid choice");
		}

	}

}
