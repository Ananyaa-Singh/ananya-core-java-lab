package com.deloitte.lab3.ex5;

//Write a Java program that displays the number of characters, lines and words in a text? 

import java.util.Scanner;

public class Lab3Ex5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter text (type 'exit' on a new line to finish):");
        
        int numChar = 0;
        int numLines = 0;
        int numWords = 0;
        
        while(sc.hasNextLine()) {
        	String str = sc.nextLine();
        	if(str.equalsIgnoreCase("exit")) {
        		break;
        	}
        	
        	numLines++;
        	numChar += str.length();
        	numWords += countWords(str);
        }
        
        sc.close();
        
        System.out.println("Number of characters (including spaces): " + numChar);
        System.out.println("Number of lines: " + numLines);
        System.out.println("Number of words: " + numWords);
    }
	
	public static int countWords(String str) {
		if(str.trim().isEmpty()) {
			return 0;
		}
		String[] words = str.split("\\s+");
		return words.length;
	}
}
